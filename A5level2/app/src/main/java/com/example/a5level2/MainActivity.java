
package com.example.a5level2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgHead;
    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mImgHead = findViewById(R.id.img_main_head);
        mEtUsername = findViewById(R.id.et_main_username);
        mEtPassword = findViewById(R.id.et_main_password);
        mBtnLogin = findViewById(R.id.btn_main_login);
        initLogin();

    }
    private void initLogin() {
        mBtnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                login();
            }
        });
    }
    /**
     * 执行登录操作
     */
    private void login() {
        String username = mEtUsername.getText().toString();
        String password = mEtPassword.getText().toString();
        if (username.equals("123456") && password.equals("123456")) {
            loginSuccess(username, password);
        } else {
            loginFailure();
        }
    }
    /**
     * 登录成功的方法
     */
    private void loginSuccess(String username, String password) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    /**
     * 登录失败的方法
     */
    private void loginFailure() {
        Toast.makeText(this, "登录失败 :(",
                Toast.LENGTH_SHORT).show();
    }
    private long mExitTime = 0L;

}