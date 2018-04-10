package mvpexamples.com.mvplatest;

import android.widget.EditText;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Rorschak on 4/10/18.
 */

@RunWith(RobolectricTestRunner.class)
public class MVPloginTest {

    private EditText mEmail,mPassword;
    private MVPLoginActivity mvpLoginActivity;

    @Before
    public void setUp(){

        mvpLoginActivity=new MVPLoginActivity();
        mEmail=mvpLoginActivity.findViewById(R.id.layout_email);
        mPassword=mvpLoginActivity.findViewById(R.id.layout_password);
    }

/*
    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull( mEmail );
        assertNotNull( mPassword );
    }
*/

/*    @Test
    public void checkEmailLength() throws Exception {
        mEmail.setText("mola");
        mPassword.setText( "som" );

    }*/


}
