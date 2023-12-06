package com.bottlerocketstudios.launchpad.utils.analytics

import android.os.Bundle
import com.bottlerocketstudios.launchpadutilsdomain.analytics.AnalyticsInterface
import com.google.android.gms.tasks.Task
import com.google.firebase.analytics.FirebaseAnalytics

interface FirebaseAnalyticsInterface : AnalyticsInterface {
    val sessionId: Task<Long?>
    val firebaseInstanceId: String
    val appInstanceId: Task<String?>
    fun resetAnalyticsData()
    fun setDefaultEventParams(params: Bundle?)
    fun setFirebaseConsent(consentMap: Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus>)
    fun setAnalyticsCollectionEnabled(enabled: Boolean)
    fun setUserId(id: String)
}
