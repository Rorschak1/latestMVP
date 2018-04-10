package mvpexamples.com.mvplatest;

/**
 * Created by Rorschak on 4/8/18.
 */

public interface ILoginView {
    public static final String TAG = ILoginView.class.getName();

    public void onLoginSuccess();

    public void onEmailError(String error);

    public void onPasswordError(String error);

    public void onGeneralError(String error);

    public void clearErrors();

    public void showProgress(boolean show);
}