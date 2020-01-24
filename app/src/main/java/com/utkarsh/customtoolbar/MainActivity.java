package com.utkarsh.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Option1:
                Toast.makeText(MainActivity.this,"Option 1 Selected...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Option2:
                Toast.makeText(MainActivity.this,"Option 2 Selected...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.showoption:
                Toast.makeText(MainActivity.this,"Search item Selected...",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
