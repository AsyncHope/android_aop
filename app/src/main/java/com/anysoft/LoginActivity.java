package com.anysoft;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    
    @BindView(R.id.et_login_mobile)
    EditText et_login_mobile;
    @BindView(R.id.ll_login_mobile_container)
    RelativeLayout ll_login_mobile_container;
    @BindView(R.id.et_login_password)
    EditText et_login_password;
    @BindView(R.id.ll_login_password_container)
    RelativeLayout ll_login_password_container;
    @BindView(R.id.tv_login)
    TextView tv_login;
    private String mobileNo;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        et_login_mobile.setText("测试啦");
//        View viewById = findViewById(R.id.et_login_mobile);
    }
    
    @OnClick(R.id.tv_login)
    public void onClick(View view) {
        mobileNo = et_login_mobile.getText().toString();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
    }
    
}

