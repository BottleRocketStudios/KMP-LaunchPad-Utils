package com.bottlerocketstudios.launchpad.utils.logger

import co.touchlab.kermit.Logger
import com.bottlerocketstudios.launchpadutilsdomain.BuildConfigProvider
import com.bottlerocketstudios.launchpadutilsdomain.logger.LoggingManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KermitLogger : LoggingManager, KoinComponent {

    private val buildConfigProvider: BuildConfigProvider by inject()

    override fun d(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Logger.d(throwable = t, tag = tag, messageString = message.orEmpty())
            } ?: Logger.d(throwable = t) { message.orEmpty() }
        }
    }

    override fun e(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Logger.e(throwable = t, tag = tag, messageString = message.orEmpty())
            } ?: Logger.e(throwable = t) { message.orEmpty() }
        }
    }

    override fun i(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Logger.i(throwable = t, tag = tag, messageString = message.orEmpty())
            } ?: Logger.i(throwable = t) { message.orEmpty() }
        }
    }

    override fun v(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Logger.v(throwable = t, tag = tag, messageString = message.orEmpty())
            } ?: Logger.v(throwable = t) { message.orEmpty() }
        }
    }

    override fun w(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Logger.w(throwable = t, tag = tag, messageString = message.orEmpty())
            } ?: Logger.w(throwable = t, messageString = message.orEmpty())
        }
    }

    override fun wtf(tag: String?, message: String?, t: Throwable?) {
        tag?.let {
            Logger.d(throwable = t, tag = tag, messageString = message.orEmpty())
        } ?: Logger.d(throwable = t) { message.orEmpty() }
    }
}
