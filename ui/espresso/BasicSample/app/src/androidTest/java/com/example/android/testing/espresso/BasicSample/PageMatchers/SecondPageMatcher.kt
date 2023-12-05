package com.example.android.testing.espresso.BasicSample.PageMatchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object SecondPageMatcher {
    val showTextView: Matcher<View> by lazy { ViewMatchers.withId(R.id.show_text_view) }
}