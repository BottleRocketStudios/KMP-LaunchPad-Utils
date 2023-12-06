package com.bottlerocketstudios.launchpad.utils.logger

import com.bottlerocketstudios.launchpadutilsdomain.BuildConfigProvider
import com.bottlerocketstudios.launchpadutilsdomain.logger.LoggingManager
import io.github.aakira.napier.Napier
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class NapierLogger : LoggingManager, KoinComponent {
    private val buildConfigProvider: BuildConfigProvider by inject()

    override fun d(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Napier.d(throwable = t, tag = tag, message = message.orEmpty())
            } ?: Napier.d(throwable = t) { message.orEmpty() }
        }
    }

    override fun e(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Napier.e(throwable = t, tag = tag, message = message.orEmpty())
            } ?: Napier.e(throwable = t) { message.orEmpty() }
        }
    }

    override fun i(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Napier.i(throwable = t, tag = tag, message = message.orEmpty())
            } ?: Napier.i(throwable = t) { message.orEmpty() }
        }
    }

    override fun v(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Napier.v(throwable = t, tag = tag, message = message.orEmpty())
            } ?: Napier.v(throwable = t) { message.orEmpty() }
        }
    }

    override fun w(tag: String?, message: String?, t: Throwable?) {
        if (buildConfigProvider.isDebugOrInternalBuild) {
            tag?.let {
                Napier.w(throwable = t, tag = tag, message = message.orEmpty())
            } ?: Napier.w(throwable = t, message = message.orEmpty())
        }
    }

    override fun wtf(tag: String?, message: String?, t: Throwable?) {
        tag?.let {
            Napier.wtf(throwable = t, tag = tag, message = message.orEmpty())
        } ?: Napier.wtf(throwable = t, message = message.orEmpty())
    }
}
