package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Data.TestData
import com.example.android.testing.espresso.BasicSample.PageMatchers.SecondPageMatcher
import com.example.android.testing.espresso.BasicSample.getText
import org.junit.Assert

object SecondPageSteps {
    fun validateSecondPageText(expectedText: String){
        Assert.assertEquals(SecondPageMatcher.showTextView.getText(), expectedText)
    }
}