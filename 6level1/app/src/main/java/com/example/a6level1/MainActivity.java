package com.example.a6level1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgHead;
    private ImageView mImgLogin;
    private ImageView mImgPass;
    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initLogin();
    }
    private void initView() {
        mImgHead = findViewById(R.id.img_main_head);
        mImgLogin=findViewById(R.id.img_main_login);
        mImgPass=findViewById(R.id.img_main_password);
        mEtUsername = findViewById(R.id.et_main_username);
        mEtPassword = findViewById(R.id.et_main_password);
        mBtnLogin = findViewById(R.id.btn_main_login);
    }

    private void initLogin() {
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String username = mEtUsername.getText().toString();
        String password = mEtPassword.getText().toString();
        if (username.equals("123456") && password.equals("123456")) {
            loginSuccess(username, password);
        } else {
            loginFailure();
        }
    }

    private void loginSuccess(String username, String password) {
        Toast.makeText(this, "登陆成功!", Toast.LENGTH_SHORT).show();
    }

    private void loginFailure() {
        Toast.makeText(this, "账号或者密码好像输错了 :(",
                Toast.LENGTH_SHORT).show();
    }
    private long mExitTime = 0L;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (System.currentTimeMillis() - mExitTime > 2000) {
                Toast.makeText(this, "再按一次退出程序",
                        Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}

