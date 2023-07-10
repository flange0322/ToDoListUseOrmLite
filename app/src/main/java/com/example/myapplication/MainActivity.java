package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView todo_List;
    Toolbar tool_bar;
    ArrayList<workContent> test;
    recyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        componentInit();
        setSupportActionBar(tool_bar);
        getSupportActionBar().setTitle("Test Application");
        //tool_bar.set

        todo_List.setLayoutManager(new LinearLayoutManager(this));
        todo_List.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        test = new ArrayList<>();

        workContent wc = new workContent();
        wc.setData("watch TV","To watch Tv with my family at night.");
        test.add(wc);

        workContent wc2 = new workContent();
        wc2.setData("do job","To do job in my company.");
        test.add(wc2);

        workContent wc3 = new workContent();
        wc3.setData("play with my children","To play basketball with my children in holiday.");
        test.add(wc3);

        adapter = new recyclerViewAdapter(test);
        todo_List.setAdapter(adapter);
    }

    private void componentInit(){
        todo_List = (RecyclerView) findViewById(R.id.workList);
        tool_bar = (Toolbar) findViewById(R.id.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:


                /*workContent wc = new workContent();
                wc.setData("wash face", "To wash face before sleeping.");
                test.add(wc);
                adapter.notifyDataSetChanged();
                Toast.makeText(this, "Add Complete!", Toast.LENGTH_SHORT).show();*/
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}