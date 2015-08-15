package com.example.dima.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.activity_main.*

public class MainActivity : Activity() {

    var colors = arrayOf("Молоко", "Морковь", "Ябоки", "Огурцы", "Голубой", "Картофель", "Помидоры", "Кукуруза",
            "Помидоры чери")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            println("кнопка вдавлена")
            Toast.makeText(this,"Писюн нарисован",Toast.LENGTH_LONG).show()

        }

        // создаем адаптер
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)

        // устанавливаем адаптер списку
        ListView.setAdapter(adapter)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}

