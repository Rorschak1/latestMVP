package mvpexamples.com.mvplatest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.*;

/**
 * Created by Rorschak on 4/8/18.
 */

public class CrossroadActivity extends Activity {
    public static final String TAG = CrossroadActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossroad);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_mvp)
    public void onMVPButtonClicked() {
        startActivity(new Intent(this, MVPLoginActivity.class));
    }

    @OnClick(R.id.btn_standard)
    public void onStandardButtonClicked() {
        startActivity(new Intent(this, MVPLoginActivity.class));
    }
}