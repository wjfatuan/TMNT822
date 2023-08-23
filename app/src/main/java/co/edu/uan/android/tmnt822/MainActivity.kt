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
            showTurtle("miKey")
        }
        binding.btnRaf.setOnClickListener {
            showTurtle("raf")
        }
    }

    fun showTurtle(name: String) {
        when (name) {
            "leo" -> {
                binding.imageView.setImageResource(R.drawable.leo)
            }
            "donatello" -> {
                binding.imageView.setImageResource(R.drawable.donatello)
            }
            "raf" -> {
                binding.imageView.setImageResource(R.drawable.raf)
            }
            else -> {
                binding.imageView.setImageResource(R.drawable.mikey)
            }
        }
    }
}