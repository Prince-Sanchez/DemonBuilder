package com.example.demonbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                loginUser(username,password);
            }
        });
    }
    private void loginUser(String username, String password) {
        // Check credentials and navigate to LandingPageActivity if valid
        if (isValidCredentials(username, password)) {
            DemonBuilderPreferences.setLoggedIn(this, true);
            startActivity(new Intent(this, LandingPageActivity.class));
            finish(); // Close LoginActivity to prevent going back to it with the back button
        } else {
            // Handle invalid credentials
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidCredentials(String username, String password) {
        // Add your validation logic here (e.g., check against predefined users)
        return (username.equals("testuser1") && password.equals("testuser1")) ||
                (username.equals("admin2") && password.equals("admin2"));
    }

}