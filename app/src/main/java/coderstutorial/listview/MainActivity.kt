package coderstutorial.listview

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
/**
 * Created by MANOJKANTH on 7/25/2017.
 */
class MainActivity : Activity() {
    // Array of strings...
    internal var LanguagesArray = arrayOf("Kotlin", "Java", "C#", "Ruby", "Swift", "php", "R", "F#")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, R.layout.activity_listview, LanguagesArray)

        val listView = findViewById<View>(R.id.Languages_List) as ListView
        listView.adapter = adapter as ListAdapter?
    }
}
