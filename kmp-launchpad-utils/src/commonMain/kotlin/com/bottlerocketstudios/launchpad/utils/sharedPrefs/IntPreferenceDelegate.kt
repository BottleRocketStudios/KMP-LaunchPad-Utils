package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntPreferenceDelegate(private val store: KVault?) :
    ReadWriteProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = store?.int(property.name) ?: 0

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        store?.set(property.name, value)
    }
}
