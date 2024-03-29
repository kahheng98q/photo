package com.example.test2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(private val userList: ArrayList<Friend>)  :
    RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    //class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    // Create new views (invoked by the layout manager)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create a new view
        val v = LayoutInflater.from(parent.context).inflate(R.layout.freind_list, parent, false)
        // set the view's size, margins, paddings and layout parameters
        return ViewHolder(v)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
//        holder.textView.text = myDataset[position]
        holder.bindItems(userList[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = userList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(friend:Friend) {
            val textViewImage = itemView.findViewById(R.id.imageView) as ImageView
            val textViewName = itemView.findViewById(R.id.textView) as TextView
            val textViewAddress = itemView.findViewById(R.id.textView2) as TextView
            textViewImage.setImageResource(friend.imageint)
            textViewName.text = friend.name
            textViewAddress.text = friend.address
        }
        }
    }
