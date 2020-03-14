package com.example.sprueche;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment implements View.OnClickListener {
    private ImageButton mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7,
            mButton8, mButton9, mButton10, mButton11;
    MediaPlayer player;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2_layout, container, false);

        mButton1 = view.findViewById(R.id.button_sound2_1);
        mButton1.setOnClickListener(this);
        mButton2 = view.findViewById(R.id.button_sound2_2);
        mButton2.setOnClickListener(this);
        mButton3 = view.findViewById(R.id.button_sound2_3);
        mButton3.setOnClickListener(this);

        mButton4 = view.findViewById(R.id.button_sound2_4);
        mButton4.setOnClickListener(this);
        mButton5 = view.findViewById(R.id.button_sound2_5);
        mButton5.setOnClickListener(this);
        mButton6 = view.findViewById(R.id.button_sound2_6);
        mButton6.setOnClickListener(this);

        mButton7 = view.findViewById(R.id.button_sound2_7);
        mButton7.setOnClickListener(this);
        mButton8 = view.findViewById(R.id.button_sound2_8);
        mButton8.setOnClickListener(this);
        mButton9 = view.findViewById(R.id.button_sound2_9);
        mButton9.setOnClickListener(this);

        mButton10 = view.findViewById(R.id.button_sound2_10);
        mButton10.setOnClickListener(this);
        mButton11 = view.findViewById(R.id.button_sound2_11);
        mButton11.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(player == null) {
            switch (v.getId()) {
                case R.id.button_sound2_1:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_haltstop);
                    break;
                case R.id.button_sound2_2:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_ahhhh);
                    break;
                case R.id.button_sound2_3:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_blindbloed);
                    break;
                case R.id.button_sound2_4:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_heulsuse);
                    break;
                case R.id.button_sound2_5:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_kaffee);
                    break;
                case R.id.button_sound2_6:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_oberzicke);
                    break;
                case R.id.button_sound2_7:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_obstimhaus);
                    break;
                case R.id.button_sound2_8:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_schnauze);
                    break;
                case R.id.button_sound2_9:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_undnicht);
                    break;
                case R.id.button_sound2_10:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_wohnungbleibt);
                    break;
                case R.id.button_sound2_11:
                    player = MediaPlayer.create(getActivity(), R.raw.andreas_abschluss);
                    break;
            }
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
            player.start();
        } else {
            //Toast.makeText(this, "Media player still running", Toast.LENGTH_SHORT).show();
            stopPlayer();
            //onClick(v);
        }
        //player.start();
    }

    private void stopPlayer() {
        if(player != null) {
            player.release();
            player = null;
            //Toast.makeText(this, "Media player released", Toast.LENGTH_SHORT).show();
        }
    }
}
