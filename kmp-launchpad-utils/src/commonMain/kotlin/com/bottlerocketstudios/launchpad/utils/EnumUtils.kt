package com.bottlerocketstudios.launchpad.utils

/**
 * Oftentimes we have enum classes where the actual value we set as a singular param that references an API-significant String value for example.
 * If we need to find which Enum value is equal to its param out of the choices the class provides, we have to do an annoying boilerplate check specific to that enum class.
 * This boilerplate doesn't have an out of the box solution. The use of [EnumCompanionWithValue], [byValue], and [EnumWithValue] does that work for us.
 * */
inline fun <reified T> EnumCompanionWithValue<T>.byValue(value: String): T? where T : Enum<T>, T : EnumWithValue =
    enumValues<T>().find { it.value == value }

interface EnumCompanionWithValue<T : Enum<T>>

interface EnumWithValue {
    val value: String
}

/** Please see an example below for how to use: */
/*enum class EnumWithValueExample(override val value: String): EnumWithValue {
    EXAMPLE_ONE("some value"),
    EXAMPLE_TWO("other value"),
    EXAMPLE_THREE("final value");

    companion object : EnumCompanionWithValue<EnumWithValueExample>
}

fun returnsExampleOne() = EnumWithValueExample.byValue("some value")*/
