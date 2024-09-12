package com.example.senote;

import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.senote.Adapter.RecylerViewAdapter;
import com.example.senote.Entry.Note;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecylerViewAdapter recylerViewAdapter;

    private List<Note> noteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        noteList = new ArrayList<>();
        noteList.add(new Note("这是第一个标题"));
        noteList.add(new Note("这是第二个标题"));
        noteList.add(new Note("这是第三个标题"));
        noteList.add(new Note("这是第四个标题"));
        noteList.add(new Note("这是第五个标题"));
        noteList.add(new Note("这是第六个标题"));
        noteList.add(new Note("这是第七个标题"));
        noteList.add(new Note("这是第八个标题"));
        noteList.add(new Note("这是第九个标题"));
        noteList.add(new Note("这是第十个标题"));
        noteList.add(new Note("这是第十一个标题"));
        noteList.add(new Note("这是第十二个标题"));
        noteList.add(new Note("这是第十三个标题"));

        recylerViewAdapter = new RecylerViewAdapter(noteList);
        recyclerView.setAdapter(recylerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}