package com.example.demonbuilder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Get references to your EditText widgets and the Sign Up button
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonSignUp = findViewById(R.id.buttonSignUp);

        // Set click listener for the Sign Up button
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username and password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Add your sign-up logic here
                // For now, we'll just show a Toast message with the entered data
                Toast.makeText(SignUpActivity.this, "Username: " + username + "\nPassword: " + password, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
