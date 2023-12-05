package com.example.android.testing.espresso.BasicSample.Steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import com.example.android.testing.espresso.BasicSample.PageMatchers.MainPageMatcher
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert

object MainPageSteps {

    fun changeTextActionStep(userText: String): MainPageSteps{
        MainPageMatcher.userTextInput.typeText(userText)
        return this;
    }

    fun openActivityAndChangeTextActionStep(): MainPageSteps{
        MainPageMatcher.openActivityAndChangeTextBtn.tap()
        return this;
    }

    fun clearTextActionStep(): MainPageSteps{
        onView(MainPageMatcher.userTextInput).perform(clearText())
        return this;
    }

    fun validateFirstPageChangeableText(expectedText: String): MainPageSteps{
        Assert.assertEquals(MainPageMatcher.changeableText.getText(), expectedText)
        return this;
    }

    fun changeTextBtnClickStep(): MainPageSteps{
        MainPageMatcher.changeTextBtn.tap()
        return this;
    }

}