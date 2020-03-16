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

public class Frag5 extends Fragment implements View.OnClickListener {

    private ImageButton mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7,
            mButton8, mButton9, mButton10, mButton11, mButton12, mButton13, mButton14, mButton15,
            mButton16, mButton17, mButton18, mButton19, mButton20, mButton21;//
    MediaPlayer player;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag5_layout, container, false);

        mButton1 = view.findViewById(R.id.button_sound5_1);
        mButton1.setOnClickListener(this);
        mButton2 = view.findViewById(R.id.button_sound5_2);
        mButton2.setOnClickListener(this);
        mButton3 = view.findViewById(R.id.button_sound5_3);
        mButton3.setOnClickListener(this);

        mButton4 = view.findViewById(R.id.button_sound5_4);
        mButton4.setOnClickListener(this);
        mButton5 = view.findViewById(R.id.button_sound5_5);
        mButton5.setOnClickListener(this);
        mButton6 = view.findViewById(R.id.button_sound5_6);
        mButton6.setOnClickListener(this);

        mButton7 = view.findViewById(R.id.button_sound5_7);
        mButton7.setOnClickListener(this);
        mButton8 = view.findViewById(R.id.button_sound5_8);
        mButton8.setOnClickListener(this);
        mButton9 = view.findViewById(R.id.button_sound5_9);
        mButton9.setOnClickListener(this);

        mButton10 = view.findViewById(R.id.button_sound5_10);
        mButton10.setOnClickListener(this);
        mButton11 = view.findViewById(R.id.button_sound5_11);
        mButton11.setOnClickListener(this);
        mButton12 = view.findViewById(R.id.button_sound5_12);
        mButton12.setOnClickListener(this);

        mButton13 = view.findViewById(R.id.button_sound5_13);
        mButton13.setOnClickListener(this);
        mButton14 = view.findViewById(R.id.button_sound5_14);
        mButton14.setOnClickListener(this);
        mButton15 = view.findViewById(R.id.button_sound5_15);
        mButton15.setOnClickListener(this);

        mButton16 = view.findViewById(R.id.button_sound5_16);
        mButton16.setOnClickListener(this);
        mButton17 = view.findViewById(R.id.button_sound5_17);
        mButton17.setOnClickListener(this);
        mButton18 = view.findViewById(R.id.button_sound5_18);
        mButton18.setOnClickListener(this);

        mButton19 = view.findViewById(R.id.button_sound5_19);
        mButton19.setOnClickListener(this);
        mButton20 = view.findViewById(R.id.button_sound5_20);
        mButton20.setOnClickListener(this);
        mButton21 = view.findViewById(R.id.button_sound5_21);
        mButton21.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        if(player == null) {
            switch (v.getId()) {
                case R.id.button_sound5_1:
                    player = MediaPlayer.create(getActivity(), R.raw.sonst_teddygelernt);
                    break;
                case R.id.button_sound5_2:
                    player = MediaPlayer.create(getActivity(), R.raw.sonst_teddymathematik);
                    break;
                case R.id.button_sound5_3:
                    player = MediaPlayer.create(getActivity(), R.raw.sonst_teddywaslabertder);
                    break;
                case R.id.button_sound5_4:
                    player = MediaPlayer.create(getActivity(), R.raw.sonst_breitgebaut);
                    break;
                case R.id.button_sound5_5:
                    player = MediaPlayer.create(getActivity(), R.raw.dergeraet);
                    break;
                case R.id.button_sound5_6:
                    player = MediaPlayer.create(getActivity(), R.raw.lammbock_wasnanbaun);
                    break;
                case R.id.button_sound5_7:
                    player = MediaPlayer.create(getActivity(), R.raw.lammbock_zerozero);
                    break;
                case R.id.button_sound5_8:
                    player = MediaPlayer.create(getActivity(), R.raw.lammbock_duschtdunoch);
                    break;
                case R.id.button_sound5_9:
                    player = MediaPlayer.create(getActivity(), R.raw.oldschool_mistvieh);
                    break;
                case R.id.button_sound5_10:
                    player = MediaPlayer.create(getActivity(), R.raw.oldschool_halsschlagader);
                    break;
                case R.id.button_sound5_11:
                    player = MediaPlayer.create(getActivity(), R.raw.oldschool_betaubungspistole);
                    break;
                case R.id.button_sound5_12:
                    player = MediaPlayer.create(getActivity(), R.raw.oldschool_schadeteinemdas);
                    break;
                case R.id.button_sound5_13:
                    player = MediaPlayer.create(getActivity(), R.raw.oldschool_verrueckt);
                    break;
                case R.id.button_sound5_14:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_bioabfall);
                    break;
                case R.id.button_sound5_15:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_schnitzel);
                    break;
                case R.id.button_sound5_16:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_erdbeerkase);
                    break;
                case R.id.button_sound5_17:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_brieftraeger);
                    break;
                case R.id.button_sound5_18:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_vitamine);
                    break;
                case R.id.button_sound5_19:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_dose);
                    break;
                case R.id.button_sound5_20:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_vitamine);
                    break;
                case R.id.button_sound5_21:
                    player = MediaPlayer.create(getActivity(), R.raw.nadine_dose);
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
