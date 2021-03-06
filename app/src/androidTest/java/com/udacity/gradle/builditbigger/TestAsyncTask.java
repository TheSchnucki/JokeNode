package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;


/**
 * Created by theSchnucki on 13.08.2018.
 */

@RunWith(AndroidJUnit4.class)
public class TestAsyncTask {

    private static final String LOG_TAG = TestAsyncTask.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkAsyncTask() {

       onView(withId(R.id.joke_btn)).perform(click());

       onView(withId(R.id.joke_tv)).check(matches(not(withText(""))));
       onView(withId(R.id.joke_tv)).check(matches(not(ErrorTextMatcher.withErrorText("Error:"))));
    }


}
