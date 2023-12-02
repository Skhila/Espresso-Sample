package com.example.android.testing.espresso.BasicSample.PageMatchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher


object MainPageMatcher {
    val changeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val openActivityAndChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }

    val changeableText: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val userTextInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
}