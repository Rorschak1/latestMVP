package mvpexamples.com.mvplatest;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by Rorschak on 4/9/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class UnitTestSample {
    private static final String FAKE_STRING = "Email";

    @Mock
    private Context mMockContext;

    @Test
    public void readString() {
        Mockito.when(mMockContext.getString(R.string.prompt_email)).thenReturn(FAKE_STRING);
        LocalTestValid localTestValid=new LocalTestValid(mMockContext);
        String result = localTestValid.getHelloWorldString();
        assertThat(result, is(FAKE_STRING));
    }
}
