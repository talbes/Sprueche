package com.example.sprueche;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag4 extends Fragment implements View.OnClickListener {
    private ImageButton mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7,
            mButton8, mButton9;
    MediaPlayer player;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag4_layout, container, false);

        mButton1 = view.findViewById(R.id.button_sound4_1);
        mButton1.setOnClickListener(this);
        mButton2 = view.findViewById(R.id.button_sound4_2);
        mButton2.setOnClickListener(this);
        mButton3 = view.findViewById(R.id.button_sound4_3);
        mButton3.setOnClickListener(this);

        mButton4 = view.findViewById(R.id.button_sound4_4);
        mButton4.setOnClickListener(this);
        mButton5 = view.findViewById(R.id.button_sound4_5);
        mButton5.setOnClickListener(this);
        mButton6 = view.findViewById(R.id.button_sound4_6);
        mButton6.setOnClickListener(this);

        mButton7 = view.findViewById(R.id.button_sound4_7);
        mButton7.setOnClickListener(this);
        mButton8 = view.findViewById(R.id.button_sound4_8);
        mButton8.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(player == null) {
            switch (v.getId()) {
                case R.id.button_sound4_1:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_kollabier);
                    break;
                case R.id.button_sound4_2:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_praktikum);
                    break;
                case R.id.button_sound4_3:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_fuesse);
                    break;
                case R.id.button_sound4_4:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_verdienst);
                    break;
                case R.id.button_sound4_5:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_deal);
                    break;
                case R.id.button_sound4_6:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_100000mark);
                    break;
                case R.id.button_sound4_7:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_ohrensteif);
                    break;
                case R.id.button_sound4_8:
                    player = MediaPlayer.create(getActivity(), R.raw.bohlen_tschuess);
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
