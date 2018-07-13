package com.danielledanskin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamAThreePointer(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void teamATwoPointer(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void teamAFreeThrow(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamBThreePointer(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void teamBTwoPointer(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void teamBFreeThrow(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

}
