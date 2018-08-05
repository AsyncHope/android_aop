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
    EditText etLoginMobile;
    @BindView(R.id.ll_login_mobile_container)
    RelativeLayout llLoginMobileContainer;
    @BindView(R.id.et_login_password)
    EditText etLoginPassword;
    @BindView(R.id.ll_login_password_container)
    RelativeLayout llLoginPasswordContainer;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    
    @OnClick(R.id.tv_login)
    public void onClick(View view) {
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

