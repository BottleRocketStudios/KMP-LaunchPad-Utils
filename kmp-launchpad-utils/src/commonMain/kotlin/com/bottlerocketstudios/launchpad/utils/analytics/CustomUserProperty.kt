package com.bottlerocketstudios.launchpad.utils.analytics

import com.bottlerocketstudios.launchpadutilsdomain.analytics.UserProperty

/** Data holder for generic user properties logged in various analytics SDKs. */
data class CustomUserProperty(
    override val propertyName: String,
    override val propertyValue: String
) : UserProperty
