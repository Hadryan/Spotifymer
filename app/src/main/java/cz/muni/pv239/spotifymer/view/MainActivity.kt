package cz.muni.pv239.spotifymer.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.muni.pv239.spotifymer.R
import cz.muni.pv239.spotifymer.view.swipe_menu.SwipeOverviewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val overviewIntent = Intent(this@MainActivity, SwipeOverviewActivity::class.java)
        startActivity(overviewIntent)
    }

}
