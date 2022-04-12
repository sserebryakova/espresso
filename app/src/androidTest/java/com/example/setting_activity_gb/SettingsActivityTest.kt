package com.example.setting_activity_gb

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class SettingActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    @Test fun checkActionBarIsDisplayed() {
        SettingsActivityPage().checkActionBarIsDisplayed()
    }

    @Test fun checkSettingsActivityIsDisplayed() {
        SettingsActivityPage().checkSettingsActivityIsDisplayed()
    }

    @Test fun checkYourSignatureIsDisplayed() {
        SettingsActivityPage().checkYourSignatureIsDisplayed()
    }

    @Test fun checkButtonIsDisplayed() {
        SettingsActivityPage().checkButtonIsDisplayed()
    }

}
