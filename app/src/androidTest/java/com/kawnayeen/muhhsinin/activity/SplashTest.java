package com.kawnayeen.muhhsinin.activity;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.kawnayeen.muhhsinin.activity.Splash;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kawnayeen on 3/28/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class SplashTest {
    @Rule
    public ActivityTestRule<Splash> mActivityRule = new ActivityTestRule<Splash>(Splash.class);

    @Test
    public void shouldHaveHelloWorld() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }
}