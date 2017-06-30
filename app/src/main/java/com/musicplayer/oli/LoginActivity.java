package com.musicplayer.oli;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.musicplayer.oli.R.id.login_quit_button;

/**
 * Created by Oli on 29/06/2017.
 */

public class LoginActivity extends AppCompatActivity {
    private Button login;
    private Button quit;
    private Button terms;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login_login_button);
        quit = (Button) findViewById(login_quit_button);
        terms = (Button) findViewById(R.id.main_view_terms);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTerms();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginSuccess();
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitApp();
            }
        });
    }

    private void loginSuccess() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void quitApp() {
        finish();
    }

    private void navigateToTerms() {
        Intent intent = new Intent(this, TermsActivity.class);
        startActivity(intent);
    }
}
