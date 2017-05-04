package com.studio.pattimura.testingclasssharing2;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Introduction extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Selamat Datang", "Di dalam class sharing Android pertemuan ke 2", R.drawable.idevlogo, getResources().getColor(R.color.LightGreen)));
        addSlide(AppIntroFragment.newInstance("HIMA IF", "Informatics Developer berada dibawah naungan Himpunan Mahasiswa S1 Teknik Informatika", R.drawable.logohima, getResources().getColor(R.color.LightGreen)));
        addSlide(AppIntroFragment.newInstance("Kabinet HIMA IF 2016", "IDEV berdiri saat kabinet HIMA IF angkatan 2015 yang pada saat itu nama kabinetnya adalah RESPECT", R.drawable.logokabinet, getResources().getColor(R.color.LightGreen)));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(Introduction.this, LandingPage.class));
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(Introduction.this, LandingPage.class));
        finish();
    }
}
