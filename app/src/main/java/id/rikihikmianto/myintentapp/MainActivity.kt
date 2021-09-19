package id.rikihikmianto.myintentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity = findViewById<Button>(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity = findViewById<Button>(R.id.btn_move_with_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone = findViewById<Button>(R.id.btn_map)
        btnDialPhone.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_move_activity -> {
                val moveActivity = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.btn_move_with_data -> {
                val moveWithData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy Saya")
                moveWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 21)
                startActivity(moveWithData)
            }
            R.id.btn_map -> {
                val map = "-8.650979,116.324944"
                    val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$map"))
                startActivity(mapIntent)
            }
        }
    }
}