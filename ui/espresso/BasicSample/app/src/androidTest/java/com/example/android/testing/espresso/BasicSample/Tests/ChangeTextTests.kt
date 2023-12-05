package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.testing.espresso.BasicSample.Data.TestData
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.PageMatchers.MainPageMatcher
import com.example.android.testing.espresso.BasicSample.Steps.MainPageSteps
import com.example.android.testing.espresso.BasicSample.Steps.SecondPageSteps
import com.example.android.testing.espresso.BasicSample.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ChangeTextTests {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun textInputFullNameTest(){
        MainPageSteps.changeTextActionStep(TestData.FULL_NAME)
            .changeTextBtnClickStep()
            .validateFirstPageChangeableText(TestData.FULL_NAME)
    }

    @Test
    fun textInputMovieNameTest(){
        MainPageSteps.changeTextActionStep(TestData.FAVORITE_MOVIE)
            .changeTextBtnClickStep()
            .validateFirstPageChangeableText(TestData.FAVORITE_MOVIE)
            .clearTextActionStep()
            .changeTextActionStep(TestData.DIFFERENT_MOVIE)
            .openActivityAndChangeTextActionStep()

        SecondPageSteps.validateSecondPageText(TestData.DIFFERENT_MOVIE)
    }
}