package co.edu.uan.android.tmnt822

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import co.edu.uan.android.tmnt822.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLeo.setOnClickListener {
            showTurtle("leo")
        }
        binding.btnDonatello.setOnClickListener {
            showTurtle("donatello")
        }
        binding.btnMikey.setOnClickListener {
            showTurtle("mikey")
        }
        binding.btnRaf.setOnClickListener {
            showTurtle("raf")
        }

        binding.rbtnLeo.setOnClickListener {
            showTurtle("leo")
        }
        binding.rbtnDonatello.setOnClickListener {
            showTurtle("donatello")
        }
        binding.rbtnMikey.setOnClickListener {
            showTurtle("mikey")
        }
        binding.rbtnRaf.setOnClickListener {
            showTurtle("raf")
        }

        val turtles = arrayListOf<String>("Leo", "Mikey")
        val myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, turtles)
        binding.turtlesList.adapter = myAdapter

        binding.turtlesList.setOnItemClickListener { parent, view, position, id ->
            println("parent: $parent, view: $view, position: $position, id: $id")
            val tv: TextView = view as TextView
            showTurtle(tv.text.toString().lowercase())
        }
    }

    fun showTurtle(name: String) {
        val imageId = resources.getIdentifier(name, "drawable", packageName)
        binding.imageView.setImageResource(imageId)
    }
}