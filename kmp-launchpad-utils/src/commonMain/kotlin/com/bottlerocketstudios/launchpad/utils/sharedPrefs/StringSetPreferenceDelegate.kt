package com.bottlerocketstudios.launchpad.utils.sharedPrefs

import com.liftric.kvault.KVault
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringSetPreferenceDelegate(private val store: KVault?) : ReadWriteProperty<Any, Set<String>> {

    override fun getValue(thisRef: Any, property: KProperty<*>): Set<String> {
        val jsonString = store?.string(property.name).orEmpty()
        return Json.decodeFromString(jsonString)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Set<String>) {
        val jsonString = Json.encodeToString(value)
        store?.set(property.name, jsonString)
    }
}
