package com.blackbirds.shakil.nybsysassignment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavigationFragment extends Fragment implements View.OnClickListener {

    View view;
    ImageView imgCalendar, imgNote, imgFavorite, imgSettings;
    FloatingActionButton btnFloating;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getChildFragmentManager();
        view = inflater.inflate(R.layout.include_bottom_toolbar, container, false);
        return view;
    }

    @Nullable
    @Override
    public View getView() {
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeComponents();
    }

    public void initializeComponents() {
        if (getView() == null){
            return;
        }
        imgCalendar = getView().findViewById(R.id.imgCalendar);
        imgNote = getView().findViewById(R.id.imgNote);
        imgFavorite = getView().findViewById(R.id.imgFavorite);
        imgSettings = getView().findViewById(R.id.imgSettings);
        btnFloating = getView().findViewById(R.id.btnFloating);

        imgCalendar.setOnClickListener(this);
        imgNote.setOnClickListener(this);
        imgFavorite.setOnClickListener(this);
        imgSettings.setOnClickListener(this);
        btnFloating.setOnClickListener(this);

        //setBottomNavigationView();
    }

    private void setBottomNavigationView() {
        int white_color = getActivity().getResources().getColor(R.color.white);
        int black_color = getActivity().getResources().getColor(R.color.black);
        if (getActivity() != null && getActivity() instanceof MainActivity){
            imgCalendar.setColorFilter(black_color);
            imgNote.setColorFilter(black_color);
            imgFavorite.setColorFilter(black_color);
            imgSettings.setColorFilter(black_color);
        }
        else if (getActivity() != null && getActivity() instanceof MainActivity){
            imgCalendar.setColorFilter(black_color);
            imgNote.setColorFilter(black_color);
            imgFavorite.setColorFilter(black_color);
            imgSettings.setColorFilter(black_color);
        }
        else if (getActivity() != null && getActivity() instanceof MainActivity){
            imgCalendar.setColorFilter(white_color);
            imgNote.setColorFilter(white_color);
            imgFavorite.setColorFilter(white_color);
            imgSettings.setColorFilter(white_color);
        }
        else if (getActivity() != null && getActivity() instanceof MainActivity){
            imgCalendar.setColorFilter(black_color);
            imgNote.setColorFilter(black_color);
            imgFavorite.setColorFilter(black_color);
            imgSettings.setColorFilter(black_color);
        }
        else if (getActivity() != null && getActivity() instanceof MainActivity){
            imgCalendar.setColorFilter(black_color);
            imgNote.setColorFilter(black_color);
            imgFavorite.setColorFilter(black_color);
            imgSettings.setColorFilter(black_color);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getChildFragmentManager();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgCalendar:
                Intent calendarIntent = new Intent(getActivity(), CalenderActivity.class);
                getActivity().startActivity(calendarIntent);
                break;

            case R.id.imgNote:
                Intent noteIntent = new Intent(getActivity(), NoteActivity.class);
                getActivity().startActivity(noteIntent);
                break;

            case R.id.btnFloating:
                Intent floatingIntent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(floatingIntent);
                break;

            case R.id.imgFavorite:
                Intent favoriteIntent = new Intent(getActivity(), FavoriteActivity.class);
                getActivity().startActivity(favoriteIntent);
                break;

            case R.id.imgSettings:
                Intent settingsIntent = new Intent(getActivity(), SettingsActivity.class);
                getActivity().startActivity(settingsIntent);
                break;
        }
    }
}
