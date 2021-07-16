package com.blackbirds.shakil.nybsysassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationFragment bottomNavigationFragment;
    TextView txtUserName;
    SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment bottom_fragment = getSupportFragmentManager().findFragmentById(R.id.bottom_navigation);
        if (bottom_fragment instanceof Fragment){
            bottomNavigationFragment = (BottomNavigationFragment) bottom_fragment;
            bottomNavigationFragment.initializeComponents();
        }

        txtUserName = findViewById(R.id.txtUserName);
        String text = "<font color=#000000>Welcome</font> <font color=#cc0c52>John Doe!</font>";
        txtUserName.setText(Html.fromHtml(text));

        search = findViewById(R.id.search);
        search.setQueryHint("Search");
    }
}