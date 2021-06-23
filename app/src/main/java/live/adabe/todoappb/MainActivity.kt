package live.adabe.todoappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import live.adabe.todoappb.activities.HomeActivity
import live.adabe.todoappb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val validUsername = "admin"
    val validPassword = "admin"

//    private lateinit var usernameInput: EditText
//    private lateinit var passwordInput: EditText
//    private lateinit var submitButton: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        usernameInput = findViewById(R.id.usernameInput)
//        passwordInput = findViewById(R.id.passwordInput)
//        submitButton = findViewById(R.id.submitButton)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val username = binding.usernameInput.text.toString()
            val password = binding.passwordInput.text.toString()

            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        if (isValidCredentials(username, password)){
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Something went wrong", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        return (username == validUsername && password == validPassword)
    }
}












