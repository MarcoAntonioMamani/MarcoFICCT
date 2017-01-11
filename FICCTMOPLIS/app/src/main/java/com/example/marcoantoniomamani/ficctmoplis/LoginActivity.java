package com.example.marcoantoniomamani.ficctmoplis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LoginActivity extends AppCompatActivity {


    ImageView Logo;

    private static final String TAG = "Login";
    private static final int REQUEST_SIGNUP = 0;

    @InjectView(R.id.input_email)
    EditText _emailText;
    @InjectView(R.id.input_password) EditText _passwordText;
    @InjectView(R.id.btn_login)
    Button _loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Logo=(ImageView)findViewById(R.id.LogoFicct);
        Animation Efecto= AnimationUtils.loadAnimation(this,R.transition.fade_in);
        Efecto.reset();
        Logo.startAnimation(Efecto);

        ButterKnife.inject(this);

        _loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        });


    }

    public void login() {


        if (validate()) {
            cambiarActividadMenu();
        }


    }

    @Override
    public void onBackPressed() {
        // disable going back to the MainActivity
        moveTaskToBack(true);
    }



    public boolean validate() {
        boolean valid = true;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("Ingrese un correo valido");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 6 || password.length() > 10) {
            _passwordText.setError("Password debe tener longitud mayor a 5");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        return valid;
    }
    public void cambiarActividadMenu() {
        //startActivity(new Intent(this, Menu.class));
        //overridePendingTransition(R.transition.left_in, R.transition.left_out);
    }
}
