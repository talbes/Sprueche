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

public class Frag3 extends Fragment implements View.OnClickListener {

    private ImageButton mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7,
            mButton8, mButton9, mButton10, mButton11, mButton12, mButton13, mButton14, mButton15,
            mButton16, mButton17, mButton18;
    MediaPlayer player;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag3_layout, container, false);

        mButton1 = view.findViewById(R.id.button_sound3_1);
        mButton1.setOnClickListener(this);
        mButton2 = view.findViewById(R.id.button_sound3_2);
        mButton2.setOnClickListener(this);
        mButton3 = view.findViewById(R.id.button_sound3_3);
        mButton3.setOnClickListener(this);

        mButton4 = view.findViewById(R.id.button_sound3_4);
        mButton4.setOnClickListener(this);
        mButton5 = view.findViewById(R.id.button_sound3_5);
        mButton5.setOnClickListener(this);
        mButton6 = view.findViewById(R.id.button_sound3_6);
        mButton6.setOnClickListener(this);

        mButton7 = view.findViewById(R.id.button_sound3_7);
        mButton7.setOnClickListener(this);
        mButton8 = view.findViewById(R.id.button_sound3_8);
        mButton8.setOnClickListener(this);
        mButton9 = view.findViewById(R.id.button_sound3_9);
        mButton9.setOnClickListener(this);

        mButton10 = view.findViewById(R.id.button_sound3_10);
        mButton10.setOnClickListener(this);
        mButton11 = view.findViewById(R.id.button_sound3_11);
        mButton11.setOnClickListener(this);
        mButton12 = view.findViewById(R.id.button_sound3_12);
        mButton12.setOnClickListener(this);

        mButton13 = view.findViewById(R.id.button_sound3_13);
        mButton13.setOnClickListener(this);
        mButton14 = view.findViewById(R.id.button_sound3_14);
        mButton14.setOnClickListener(this);
        mButton15 = view.findViewById(R.id.button_sound3_15);
        mButton15.setOnClickListener(this);

        mButton16 = view.findViewById(R.id.button_sound3_16);
        mButton16.setOnClickListener(this);
        mButton17 = view.findViewById(R.id.button_sound3_17);
        mButton17.setOnClickListener(this);
        mButton18 = view.findViewById(R.id.button_sound3_18);
        mButton18.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(player == null) {
            switch (v.getId()) {
                case R.id.button_sound3_1:
                    player = MediaPlayer.create(getActivity(), R.raw.graham_zeichnetkarten);
                    Toast.makeText(getActivity(), "Leer", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_sound3_2:
                    player = MediaPlayer.create(getActivity(), R.raw.graham_kartefresse);
                    break;
                case R.id.button_sound3_3:
                    player = MediaPlayer.create(getActivity(), R.raw.graham_keinaerger);
                    break;
                case R.id.button_sound3_4:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_problem1);
                    break;
                case R.id.button_sound3_5:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_schweine2);
                    break;
                case R.id.button_sound3_6:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_gebaut3);
                    break;
                case R.id.button_sound3_7:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_wenndoch4);
                    break;
                case R.id.button_sound3_8:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_zweitetuer5);
                    break;
                case R.id.button_sound3_9:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_penner6);
                    break;
                case R.id.button_sound3_10:
                    player = MediaPlayer.create(getActivity(), R.raw.huette_arsch7);
                    break;
                case R.id.button_sound3_11:
                    player = MediaPlayer.create(getActivity(), R.raw.stone_duarsch);
                    break;
                case R.id.button_sound3_12:
                    player = MediaPlayer.create(getActivity(), R.raw.stone_amulett);
                    break;
                case R.id.button_sound3_13:
                    player = MediaPlayer.create(getActivity(), R.raw.stone_duarsch2);
                    break;
                case R.id.button_sound3_14:
                    player = MediaPlayer.create(getActivity(), R.raw.stone_krankelache);
                    break;
                case R.id.button_sound3_15:
                    player = MediaPlayer.create(getActivity(), R.raw.extra_daemlich);
                    break;
                case R.id.button_sound3_16:
                    player = MediaPlayer.create(getActivity(), R.raw.extra_fickdichselber);
                    break;
                case R.id.button_sound3_17:
                    player = MediaPlayer.create(getActivity(), R.raw.diego_aufsmaul);
                    break;
                case R.id.button_sound3_18:
                    player = MediaPlayer.create(getActivity(), R.raw.flechter_aufsmaul);
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
