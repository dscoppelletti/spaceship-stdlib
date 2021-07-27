package it.scoppelletti.spaceship.io

import kotlinx.coroutines.runBlocking
import okio.buffer
import okio.sink
import okio.source
import java.io.File
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class IOExtTest {
    private lateinit var data: String

    @BeforeTest
    fun setUp() {
        val chars : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        data = (0 until DEFAULT_BUFFER_SIZE * 5)
                .map { chars.random() }
                .joinToString("")
    }

    @Test
    @Suppress("BlockingMethodInNonBlockingContext")
    fun copy() = runBlocking {
        val file1 = File.createTempFile("src", ".tmp")
        val sink1 = file1.sink()
        val bufSink = sink1.buffer()

        bufSink.writeUtf8(data)
        bufSink.close()

        val source1 = file1.source()
        val file2 = File.createTempFile("dst", ".tmp")
        val sink2 = file2.sink()

        copy(source1, sink2)
        source1.close()
        sink2.close()

        val source2 = file2.source()
        val bufSource = source2.buffer()

        val testData = bufSource.readUtf8()
        bufSource.close()

        assertEquals(data, testData)
    }
}