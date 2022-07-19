package com.viliussutkus89.notificationtest

import androidx.core.app.NotificationManagerCompat
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class NotificationTest {
    @Test
    fun showNotification() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val notification = MainActivity.createNotification(appContext)
        val notificationId = UUID.randomUUID().hashCode()
        NotificationManagerCompat.from(appContext).notify(notificationId, notification)
    }
}