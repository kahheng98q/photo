package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        linearLayoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = linearLayoutManager
        val friend = ArrayList<Friend>()
        friend.add(Friend(R.drawable.ic_cheah,"Kah Heng","RSD"))
        friend.add(Friend(R.drawable.chia,"Jaren Yeap","DIA"))
        friend.add(Friend(R.drawable.joseph,"Joseph Yeak","DIT"))
        friend.add(Friend(R.drawable.yeap,"Chia Yang Jie","DIB"))
        viewManager = LinearLayoutManager(this)
        viewAdapter = RecycleAdapter(friend)

        recyclerView = findViewById<RecyclerView>(R.id.rv_friend_list).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
          //  setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
    }

}

}
