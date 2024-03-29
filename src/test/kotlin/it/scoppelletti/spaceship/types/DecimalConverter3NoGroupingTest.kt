package it.scoppelletti.spaceship.types

import it.scoppelletti.spaceship.i18n.StubI18NProvider
import java.math.BigDecimal
import java.text.ParseException
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class DecimalConverter3NoGroupingTest {

    private lateinit var decimalConverter: DecimalConverter

    @BeforeTest
    fun setUp() {
        val i18nProvider = StubI18NProvider(true)
        decimalConverter = i18nProvider.decimalConverter(3, false)
    }

    @Test
    fun format() {
        @Suppress("JoinDeclarationAndAssignment")
        var x: BigDecimal

        assertNull(decimalConverter.format(null), "null")

        x = BigDecimal.valueOf(2100)
        assertEquals("2100,000", decimalConverter.format(x), "2100")

        x = BigDecimal.valueOf(-2100.25)
        assertEquals("-2100,250", decimalConverter.format(x), "-2100.25")

        x = BigDecimal.valueOf(2100.2572)
        assertEquals("2100,257", decimalConverter.format(x), "2100.2572")
    }

    @Test
    fun parse() {
        @Suppress("JoinDeclarationAndAssignment")
        var actual: BigDecimal?

        @Suppress("JoinDeclarationAndAssignment")
        var expected: BigDecimal

        assertNull(decimalConverter.parse(null), "null")
        assertNull(decimalConverter.parse(""), "empty")
        assertNull(decimalConverter.parse("   "), "blanks")

        actual = decimalConverter.parse("2100")
        expected = BigDecimal.valueOf(2100)
        assertTrue("2100") {
            actual?.compareTo(expected) == 0
        }

        actual = decimalConverter.parse("2100,0")
        expected = BigDecimal.valueOf(2100)
        assertTrue("2100,0") {
            actual?.compareTo(expected) == 0
        }

        actual = decimalConverter.parse("-2100,25")
        expected = BigDecimal.valueOf(-2100.25)
        assertTrue("-2100,25") {
            actual?.compareTo(expected) == 0
        }

        actual = decimalConverter.parse("2100,2577")
        expected = BigDecimal.valueOf(2100.258)
        assertTrue("2100,2577") {
            actual?.compareTo(expected) == 0
        }

        actual = decimalConverter.parse("   2100,25   ")
        expected = BigDecimal.valueOf(2100.25)
        assertTrue("(blanks)2100,25(blanks)") {
            actual?.compareTo(expected) == 0
        }

        assertFailsWith(ParseException::class, "2100.0") {
            decimalConverter.parse("2100.0")
        }

        assertFailsWith(ParseException::class, "-2100.25") {
            decimalConverter.parse("-2100.25")
        }

        assertFailsWith(ParseException::class, "xxx2100,25") {
            decimalConverter.parse("xxx2100,25")
        }

        assertFailsWith(ParseException::class, "2100,25xxx") {
            decimalConverter.parse("2100,25xxx")
        }
    }
}
