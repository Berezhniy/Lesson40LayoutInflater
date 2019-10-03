package ru.startandroid.lesson40layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //получаем LayoutInflater
        LayoutInflater ltInflater = getLayoutInflater();
        //находим linLayout по id
        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);
        //получаем view1 из activity_text и даём ему родителя и передаём данные
        View view1 = ltInflater.inflate(R.layout.activity_text, linLayout, true);
        ViewGroup.LayoutParams lp1 = view1.getLayoutParams();
        //выводим логи
        Log.d(LOG_TAG, "Class of view1: " + view1.getClass().toString());
        Log.d(LOG_TAG, "Class of layoutParams of view1: " + lp1.getClass().toString());
        //находим relLayout по id
        RelativeLayout relLayout = (RelativeLayout) findViewById(R.id.relLayout);
        //получаем view2 из activity_text и даём ему родителя и передаём данные
        View view2 = ltInflater.inflate(R.layout.activity_text, relLayout, true);
        ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
        //выводим логи
        Log.d(LOG_TAG, "Class of view2: " + view2.getClass().toString());
        Log.d(LOG_TAG, "Class of layoutParams of view2: " + lp2.getClass().toString());
    }
}
