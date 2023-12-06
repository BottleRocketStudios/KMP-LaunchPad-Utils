package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MapPreferenceDelegate(private val store: KVault?) : ReadWriteProperty<Any, Map<String, String>> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Map<String, String> {
        val hashMapStr = store?.string(property.name)
        return if (hashMapStr != null) {
            if (hashMapStr.isNotEmpty()) {
                val hashMap = hashMapStr.split(",").associate {
                    val (left, right) = it.split("=")
                    left to right
                }
                hashMap
            } else {
                HashMap()
            }
        } else {
            HashMap()
        }
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Map<String, String>) {
        val updatedHashMap = value.toString()
            .replace("{", "")
            .replace("}", "")
            .replace(" ", "")
        store?.set(property.name, updatedHashMap)
    }
}
