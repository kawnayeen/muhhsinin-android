package com.kawnayeen.muhhsinin;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

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
public class MuhhsininTest {
    @Rule
    public ActivityTestRule<Muhhsinin> mActivityRule = new ActivityTestRule<Muhhsinin>(Muhhsinin.class);

    @Test
    public void shouldHaveHelloWorld() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }
}