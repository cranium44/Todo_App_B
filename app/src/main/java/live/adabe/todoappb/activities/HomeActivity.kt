package live.adabe.todoappb.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import live.adabe.todoappb.R

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)
        profileButton = findViewById(R.id.profileButton)

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("name")}"

        profileButton.setOnClickListener {
            openProfilePage()
        }
    }

    private fun openProfilePage(){
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}