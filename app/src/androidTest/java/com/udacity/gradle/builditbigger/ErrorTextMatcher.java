package com.udacity.gradle.builditbigger;

import android.support.test.espresso.matcher.BoundedMatcher;
import android.view.View;
import android.widget.TextView;

import org.hamcrest.Description;

/**
 * Created by theSchnucki on 14.08.2018.
 */
public class ErrorTextMatcher extends BoundedMatcher<View, TextView> {

    static ErrorTextMatcher withErrorText(String errorText) {
        return new ErrorTextMatcher(errorText);
    }

    private final String errorText;

    private ErrorTextMatcher (String errorText){
        super (TextView.class);
        this.errorText = errorText;
    }


    @Override
    public boolean matchesSafely(TextView item) {
        String string = (String) item.getText();
        boolean test = string.startsWith(errorText);
        return test;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("with error text: ").appendValue(errorText);
    }
}
