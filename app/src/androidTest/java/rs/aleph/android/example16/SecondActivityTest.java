package rs.aleph.android.example16;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

public class SecondActivityTest extends ActivityInstrumentationTestCase2<SecondActivity> {

    SecondActivity activity;

    public SecondActivityTest(){
        super(SecondActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    @SmallTest
    public void testMainActivityView(){

    }
}
