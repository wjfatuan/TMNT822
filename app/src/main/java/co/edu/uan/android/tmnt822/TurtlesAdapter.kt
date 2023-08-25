package co.edu.uan.android.tmnt822

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class TurtlesAdapter(val context: Activity, val data: ArrayList<String>)
    : ArrayAdapter<String>(context, R.layout.turtles_list, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = context.layoutInflater.inflate(R.layout.turtles_list, null)
        val tv = view.findViewById<TextView>(R.id.turtleName)
        tv.text = data.get(position)
        val imageId = context.resources.getIdentifier(data.get(position).lowercase(), "drawable", context.packageName)
        val iv = view.findViewById<ImageView>(R.id.turtleIcon)
        iv.setImageResource(imageId)
        return view
    }
}