package com.glureau.appb

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.glureau.featurebar.BarFragment
import com.glureau.featurefoo.FeatureFooService
import com.glureau.featurebar.FeatureBarService
import com.glureau.featurefoo.FooFragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import javax.inject.Inject

class MainActivityB : AppCompatActivity() {

    @Inject
    lateinit var featureFooService: FeatureFooService

    @Inject
    lateinit var featureBarService: FeatureBarService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appBInjector().inject(this)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val messageFoo = featureFooService.getFoo()
        val messageBar = featureBarService.getBar()
        text_view.text = "$messageFoo\n$messageBar"

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_bar, BarFragment.newInstance())
            .replace(R.id.container_foo, FooFragment.newInstance())
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
