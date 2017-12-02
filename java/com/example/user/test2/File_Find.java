package com.example.user.test2;

import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class File_Find extends AppCompatActivity {
    private String root = Environment.getExternalStorageDirectory().getAbsolutePath();  //최상위 폴더
    private String CurPath = Environment.getExternalStorageDirectory().getAbsolutePath();   //현재 탐색하는 폴더
    private ArrayList<String> itemFiles = new ArrayList<String>();  //display 되는 파일이나 폴더이름
    private ArrayList<String> pathFiles = new ArrayList<String>();  // 화면에 display 되는 list의 경로와 이름이 붙어있는 목록

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file__find);



        ListView listview;
        ListViewAdapter adapter = new ListViewAdapter();

        listview = (ListView) findViewById(R.id.File_View);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.folder),"First","설명");
    }

}
