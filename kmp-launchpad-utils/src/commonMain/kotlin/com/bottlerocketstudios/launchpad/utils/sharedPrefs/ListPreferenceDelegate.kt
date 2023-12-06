package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ListPreferenceDelegate<T>(private val store: KVault?, private val converter: (String) -> T?) : ReadWriteProperty<Any, List<T>> {

    override fun getValue(thisRef: Any, property: KProperty<*>): List<T> {
        return store?.string(property.name).orEmpty().split(SEPARATOR).mapNotNull(converter)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: List<T>) {
        store?.set(property.name, value.joinToString(SEPARATOR))
    }

    companion object {
        private const val SEPARATOR = "|,|"
    }
}
