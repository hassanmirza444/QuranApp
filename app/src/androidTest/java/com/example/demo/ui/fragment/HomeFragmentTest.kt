package com.example.demo.ui.fragment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import com.example.demo.ui.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import com.example.demo.R

class HomeFragmentTest{

    @get:Rule
    val activityScenario = activityScenarioRule<MainActivity>()

    @Test
    fun launchQuranActivty(){
       // val perform = onView(withId(R.id.text_home)).perform(click())
    }
}