package co.edu.uan.android.tmnt822

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    fun showTurtle(name: String) {
        val imageId = resources.getIdentifier(name, "drawable", packageName)
        binding.imageView.setImageResource(imageId)
    }
}