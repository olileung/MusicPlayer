package com.musicplayer.oli;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        terms = (Button) findViewById(R.id.terms_view_terms);
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTerms();
            }
        });
    }

    private void navigateToTerms() {
        Intent intent = new Intent(this, TermsActivity.class);
        startActivity(intent);
    }
}
