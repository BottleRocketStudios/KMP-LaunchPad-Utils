package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FloatPreferenceDelegate(private val store: KVault?) : ReadWriteProperty<Any, Float> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = store?.float(property.name) ?: 0f

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Float) {
        store?.set(property.name, value)
    }
}
