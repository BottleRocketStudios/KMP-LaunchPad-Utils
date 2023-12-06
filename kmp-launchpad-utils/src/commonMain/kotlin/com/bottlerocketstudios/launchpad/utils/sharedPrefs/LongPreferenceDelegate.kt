package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LongPreferenceDelegate(private val store: KVault?) : ReadWriteProperty<Any, Long> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = store?.long(property.name) ?: 0L

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Long) {
        store?.set(property.name, value)
    }
}
