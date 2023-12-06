package com.bottlerocketstudios.launchpad.utils.coroutine

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

class DispatcherProviderImpl : DispatcherProvider {
    override val Default: CoroutineDispatcher = Dispatchers.Default
    override val IO: CoroutineDispatcher = Dispatchers.IO
    override val Main: CoroutineDispatcher = Dispatchers.Main
    override val Unconfined: CoroutineDispatcher = Dispatchers.Unconfined
}
