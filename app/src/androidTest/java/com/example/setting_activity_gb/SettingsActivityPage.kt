package com.example.setting_activity_gb

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers

class SettingsActivityPage {

    fun checkActionBarIsDisplayed(): SettingsActivityPage {
        Espresso.onView(withId(R.id.action_bar)).
        check(ViewAssertions.matches(isDisplayed()))
        return this
    }

    fun checkSettingsActivityIsDisplayed(): SettingsActivityPage {
        Espresso.onView(withText("Settings_Activity")).
        check(ViewAssertions.matches(isDisplayed()))
        return this
    }

    fun checkYourSignatureIsDisplayed(): SettingsActivityPage {
        Espresso.onView(withText("Your signature")).
        perform(ViewActions.click()).
        check(ViewAssertions.matches(isDisplayed()))
        return this
    }

    fun checkButtonIsDisplayed(): SettingsActivityPage {
        Espresso.onView(withClassName(CoreMatchers.endsWith("Button"))).
        check(ViewAssertions.matches(isDisplayed()))
        return this
    }
}
