//package com.chrispow.activitylifecycle;
//
//
//import android.view.View;
//
//import androidx.test.espresso.ViewAction;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
//import androidx.test.filters.LargeTest;
//import androidx.test.filters.MediumTest;
//import androidx.test.filters.SmallTest;
//import androidx.test.rule.ActivityTestRule;
//
//import org.hamcrest.Matcher;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static androidx.test.espresso.Espresso.closeSoftKeyboard;
//import static androidx.test.espresso.Espresso.onView;
//
//@RunWith(AndroidJUnit4.class)
//@SmallTest
//public class CheckAppHeader {
//
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityTestRule =
//            new ActivityTestRule<>(MainActivity.class);
//    private String mStringToBeTyped;
//
//    //@Test method structure
//    @Test
//    public void changeText_sameActivity() {
//        //1. Find a view
//        onView(withID(R.id.guess_field))
//                .perform(typeText(mStringToBeTyped), (ViewAction) closeSoftKeyboard());
//        //2. Perform an action
//        //3. Verify action was taken, assert result
//    }
//
//    private ViewAction typeText(String stringToBeTyped) {
//        mStringToBeTyped = "Espresso";
//    }
//
//    private Matcher<View> withID(int guess_field) {
//        return null;
//    }
//
//    /*
//        Hamcrest simplifies tests
//        --Hamcrest is an anagram of "Matchers"
//        --Framework for creating custom matchers and assertions
//        --Match Rules defined declaratively
//        --Enables precise testing
//
//        Hamcrest Matchers:
//        --ViewMatcher - Find Views by id, content, focus, hierarchy
//        --ViewAction - perform an action on a view
//        --ViewAssertion - assert state and verify the result
//     */

        /*
            Finding Views with onView

            --withId() find a view with a specific Android id
               - onView(withId(R.id.guess_field)

            --withText() find a view with specific text
            --allOf() find a view that matches multiple conditions
               -Example:
                    onView(allOf(withId(R.id.word),
                            withText("Clicked! Word 15"),
                            isDisplayed()));

             onView returns ViewInteraction object:

             --If you need to reuse the view returned by onView
             --Make code more readable or explicit
             --check() and perform() methods
               -Example:
               ViewInteraction textView = onView(
                    allOf(withId(R.id.word), withText("Clicked! Word 15"),
                    isDisplayed()));

               textView.check(matches(withText("Clicked! Word 15");
         */
//    //@Rule - Specifies the context of testing.
//    //@Before and @After set up and tear down
//    //@Before - Setup, initializations
//    //@After - Teardown freeing resources
//    //Typically most espresso tests will not need an @Before and @After because
//    //ActivityTestRule will take care of that integration.
//
////    @Before
////    public void initValidString(){
////        mStringToBeTyped = "Espresso";
////    }
//    //@ActivityTestRule - Testing Support for a single specified activity
//    //@ServiceTestRule - Testing support for starting, binding, shutting down a service.
//
////    public class ChangeTextBehaviorTest{}
//    //@SmallTest - Runs in < 60s and uses no external resources
//    //@MediumTest - Runs in < 300s, only local network
//    //@LargeTest - Runs for a long time and uses many resources
//
//
//}
