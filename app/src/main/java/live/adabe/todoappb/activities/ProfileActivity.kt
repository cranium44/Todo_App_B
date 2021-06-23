package live.adabe.todoappb.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import live.adabe.todoappb.R
import live.adabe.todoappb.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButton.setOnClickListener {
            val anyIntent = Intent(this, HomeActivity::class.java)
            startActivity(anyIntent)
        }


    }
}