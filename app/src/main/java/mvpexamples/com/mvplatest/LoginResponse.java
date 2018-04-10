package mvpexamples.com.mvplatest;

/**
 * Created by Rorschak on 4/8/18.
 */

public class LoginResponse {
    public static final String TAG = LoginResponse.class.getName();
    int userId;

    public int getUserId() {
        return userId;
    }

    public LoginResponse(int userId) {
        this.userId = userId;
    }
}