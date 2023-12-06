package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BooleanPreferenceDelegate(private val store: KVault?) : ReadWriteProperty<Any, Boolean> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = store?.bool(forKey = property.name) ?: false

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        store?.set(property.name, value)
    }
}
