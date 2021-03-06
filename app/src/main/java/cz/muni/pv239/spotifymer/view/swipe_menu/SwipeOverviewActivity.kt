package cz.muni.pv239.spotifymer.view.swipe_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import cz.muni.pv239.spotifymer.R
import cz.muni.pv239.spotifymer.adapter.ViewPageAdapter

class SwipeOverviewActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_overview)

        viewPager = findViewById(R.id.root_view_pager)
        viewPager.adapter = ViewPageAdapter(this)
    }
}
