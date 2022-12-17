package stcet.project.autilearner

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import stcet.project.autilearner.helper.AuthO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val auth = AuthO()
        findViewById<TextView>(R.id.temporary).text = auth.getUser().toString()
    }
}