package cz.muni.pv239.spotifymer.view.search_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.muni.pv239.spotifymer.R

class NewPlaylistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        if (savedInstanceState != null) {
            return;
        }

        supportFragmentManager
            .beginTransaction()
            .add(R.id.content_layout, RecommendMenuFragment())
            .commit()
    }


}
