package com.danielledanskin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Log.v("MainActivity", "Team A Scored 3.");
    }

    public void teamATwoPointer(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
        Log.v("MainActivity", "Team A Scored 2.");
    }

    public void teamAFreeThrow(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
        Log.v("MainActivity", "Team A Scored 1.");
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
        Log.v("MainActivity", "Team B Scored 3.");
    }

    public void teamBTwoPointer(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
        Log.v("MainActivity", "Team B Scored 2.");
    }

    public void teamBFreeThrow(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
        Log.v("MainActivity", "Team B Scored 1.");
    }

}
