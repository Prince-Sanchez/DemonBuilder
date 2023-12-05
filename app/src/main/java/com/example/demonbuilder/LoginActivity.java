package com.example.demonbuilder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Get references to your EditText widgets and the Log In button
        EditText editTextUsernameLogin = findViewById(R.id.editTextUsernameLogin);
        EditText editTextPasswordLogin = findViewById(R.id.editTextPasswordLogin);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        // Set click listener for the Log In button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username and password
                String username = editTextUsernameLogin.getText().toString();
                String password = editTextPasswordLogin.getText().toString();

                // For now, we'll just show a Toast message with the entered data
                Toast.makeText(LoginActivity.this, "Username: " + username + "\nPassword: " + password, Toast.LENGTH_SHORT).show();
            }
        });
    }
}