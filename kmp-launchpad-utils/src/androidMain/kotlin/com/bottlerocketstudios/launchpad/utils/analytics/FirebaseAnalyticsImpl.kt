package com.bottlerocketstudios.launchpad.utils.analytics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import com.bottlerocketstudios.launchpadutilsdomain.analytics.AnalyticsEvent
import com.bottlerocketstudios.launchpadutilsdomain.analytics.UserProperty
import com.google.android.gms.tasks.Task
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus
import com.google.firebase.analytics.FirebaseAnalytics.ConsentType
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@SuppressLint("MissingPermission")
class FirebaseAnalyticsImpl : FirebaseAnalyticsInterface, KoinComponent {

    private val context: Context by inject()
    private val analytics: FirebaseAnalytics by lazy {
        FirebaseAnalytics.getInstance(context)
    }

    override val appInstanceId: Task<String?>
        get() = analytics.appInstanceId

    override val sessionId: Task<Long?>
        get() = analytics.sessionId

    override val firebaseInstanceId: String
        get() = analytics.firebaseInstanceId

    override fun resetAnalyticsData() = analytics.resetAnalyticsData()

    override fun setUserProperty(userProperty: UserProperty) =
        analytics.setUserProperty(userProperty.propertyName, userProperty.propertyValue)

    override fun logEvent(event: AnalyticsEvent) {
        val paramBundle: Bundle? = if (event.params != null) {
            Bundle().apply {
                event.params?.forEach {
                    putString(
                        it.key,
                        it.value.toString()
                    )
                }
            }
        } else {
            null
        }
        analytics.logEvent(event.eventName, paramBundle)
    }

    override fun setDefaultEventParams(params: Bundle?) =
        analytics.setDefaultEventParameters(params)

    override fun setFirebaseConsent(consentMap: Map<ConsentType, ConsentStatus>) =
        analytics.setConsent(consentMap)

    override fun setAnalyticsCollectionEnabled(enabled: Boolean) =
        analytics.setAnalyticsCollectionEnabled(enabled)

    override fun setUserId(id: String) = analytics.setUserId(id)
}
