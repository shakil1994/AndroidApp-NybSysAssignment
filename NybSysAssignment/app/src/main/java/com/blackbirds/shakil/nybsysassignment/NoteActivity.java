package com.blackbirds.shakil.nybsysassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class NoteActivity extends AppCompatActivity {

    BottomNavigationFragment bottomNavigationFragment;
    RecyclerView recyclerAddNotes;
    ImageView imgAddNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Fragment bottom_fragment = getSupportFragmentManager().findFragmentById(R.id.bottom_navigation);
        if (bottom_fragment instanceof Fragment){
            bottomNavigationFragment = (BottomNavigationFragment) bottom_fragment;
            bottomNavigationFragment.initializeComponents();
        }
    }
}