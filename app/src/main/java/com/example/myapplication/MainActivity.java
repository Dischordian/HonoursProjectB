package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Variables for storing basic data in the Constraints Activity
    static final String STATE_DISTANCE = "Distance";
    static final String STATE_DIMENSIONS = "Dimensions";
    private String currentDistance;
    private String currentDimensions;

    // Buttons & Such
    Button updateButton;
    EditText textInputConstraintDistance;
    EditText textInputConstraintDimensions;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Always call the superclass first.
        setContentView(R.layout.fragment_work_constraints);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        /* Currently causing the program to crash
        updateButton = (Button)findViewById(R.id.wc_btn_update);
        updateButton.setOnClickListener(v -> {
            textInputConstraintDistance = (EditText) findViewById(R.id.wc_et_constraint_distance);
            textInputConstraintDimensions = (EditText) findViewById(R.id.wc_et_constraint_dimensions);
            currentDistance = textInputConstraintDistance.toString();
            currentDimensions = textInputConstraintDimensions.toString();
            showToast(currentDistance);
            showToast(currentDimensions);

        });*/

    }

    public void showToast(String text){
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current constraints
        savedInstanceState.putString(STATE_DISTANCE, currentDistance);
        savedInstanceState.putString(STATE_DIMENSIONS, currentDimensions);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
         currentDistance = savedInstanceState.getString(STATE_DISTANCE);
         currentDimensions = savedInstanceState.getString(STATE_DIMENSIONS);
    }
}