package gcit.edu.todo_10;

import android.content.Context;

import androidx.test.filters.SmallTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ExampleInstrumentedTest {
    private calculater mcalculater;

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("gcit.edu.todo_10", appContext.getPackageName());
    }
    @Before
    public  void setUp(){
        mcalculater = new calculater();
    }

    @Test
    public void addTwoNumber(){
        double resultAdd = mcalculater.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));

    }
    @Test
    public  void addTwoNegativeNumber(){
        double resultAdd = mcalculater.add(2d, -1d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    @Test
    public  void subTwoNumber(){
        double resultSub = mcalculater.sub(2d, 1d);
        assertThat(resultSub, is(equalTo(1d)));
    }
    @Test
    public  void subTwoNegativeNumber(){
        double resultSub = mcalculater.sub(2d, 3d);
        assertThat(resultSub, is(equalTo(-1d)));
    }
    @Test
    public  void mulTwoNumber(){
        double resultmul = mcalculater.mul(2d, 2d);
        assertThat(resultmul, is(equalTo(4d)));
    }
    @Test
    public  void mulTwoNumberZero(){
        double resultAdd = mcalculater.mul(0d, 4d);
        assertThat(resultAdd, is(equalTo(0d)));
    }
    @Test
    public  void divTwoNumber(){
        double resultdiv = mcalculater.div(10d, 2d);
        assertThat(resultdiv, is(equalTo(5d)));
    }
    @Test
    public  void divTwoZeroNumber(){
        double resultAdd = mcalculater.div(0d, 9d);
        assertThat(resultAdd, is(equalTo(0d)));
    }


}