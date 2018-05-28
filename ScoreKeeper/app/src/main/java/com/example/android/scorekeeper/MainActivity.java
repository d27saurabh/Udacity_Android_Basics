package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int radiantScoreValue = 0;
    int radiantCarry = 0;
    int radiantSupport = 0;
    int radiantTower = 0;

    int direScoreValue = 0;
    int direCarry = 0;
    int direSupport = 0;
    int direTower = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // increase Value of radiant carry by 1 and display. Calculate and display total radiant score

    public void radCarryKill(View v) {
        radiantCarry = radiantCarry + 1;
        radiantScoreValue = radiantCarry + radiantSupport;
        displayradiantScore(radiantScoreValue);
        displayradiantCarry(radiantCarry);
    }

    // increase value of dire support by 1 and display. Calculate and display total radiant score
    public void radSupportKill(View v) {
        radiantSupport = radiantSupport + 1;
        radiantScoreValue = radiantCarry + radiantSupport;
        displayradiantScore(radiantScoreValue);
        displayradiantSupport(radiantSupport);
    }

    //increase value of radiant tower by 1 and display.
    public void radiantTower(View v) {
        radiantTower = radiantTower + 1;
        displayradiantTower(radiantTower);
    }

    //display method for radiant score
    public void displayradiantScore(int number) {
        TextView radiantScoreTextView = findViewById(R.id.radScore);
        radiantScoreTextView.setText(String.valueOf(number));
    }

    //display function for radiant carry score
    public void displayradiantCarry(int number) {
        TextView radiantCarryTextView = findViewById(R.id.RadCarryKillScore);
        radiantCarryTextView.setText(String.valueOf(number));
    }

    //display function for radiant support score
    public void displayradiantSupport(int number) {
        TextView radiantSupportTextView = findViewById(R.id.RadSupportKillScore);
        radiantSupportTextView.setText(String.valueOf(number));
    }

    //display function for radiant tower score
    public void displayradiantTower(int number) {
        TextView radiantTowerTextView = findViewById(R.id.RadTeamTowerScore);
        radiantTowerTextView.setText(String.valueOf(number));
    }

    public void direCarryKill(View v) {
        direCarry = direCarry + 1;
        direScoreValue = direCarry + direSupport;
        displaydireScore(direScoreValue);
        displaydireCarry(direCarry);
    }

    public void direSupportKill(View v) {
        direSupport = direSupport + 1;
        direScoreValue = direCarry + direSupport;
        displaydireScore(direScoreValue);
        displaydireSupport(direSupport);
    }


    public void direTower(View v) {
        direTower = direTower + 1;
        displaydireTower(direTower);
    }

    public void displaydireScore(int number) {
        TextView direScoreTextView = findViewById(R.id.direscore);
        direScoreTextView.setText(String.valueOf(number));
    }

    public void displaydireCarry(int number) {
        TextView direCarryTextView = findViewById(R.id.direCarryKillScore);
        direCarryTextView.setText(String.valueOf(number));
    }

    public void displaydireSupport(int number) {
        TextView direSupportTextView = findViewById(R.id.direSupportKillScore);
        direSupportTextView.setText(String.valueOf(number));
    }

    public void displaydireTower(int number) {
        TextView direTowerTextView = findViewById(R.id.direTeamTowerScore);
        direTowerTextView.setText(String.valueOf(number));
    }

    public void newMatch(View v) {
        radiantScoreValue = 0;
        radiantCarry = 0;
        radiantSupport = 0;
        radiantTower = 0;

        direScoreValue = 0;
        direCarry = 0;
        direSupport = 0;
        direTower = 0;

        displayradiantScore(radiantScoreValue);
        displayradiantCarry(radiantCarry);
        displayradiantSupport(radiantSupport);
        displayradiantTower(radiantTower);

        displaydireScore(direScoreValue);
        displaydireCarry(direCarry);
        displaydireSupport(direSupport);
        displaydireTower(direTower);
    }


}
