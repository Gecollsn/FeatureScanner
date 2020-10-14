package com.gcc.feature.module_main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.alibaba.android.arouter.facade.annotation.Route
import com.gcc.feature.abstraction.constants.C_Router
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

@Route(path = C_Router.activity.module_main.main)
class FeatureMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_main)

        val toolbar = findViewById<Toolbar>(R.id.tb_main)

        setSupportActionBar(toolbar)

        // These lines are needed to display the top-left hamburger button
        supportActionBar?.setHomeButtonEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        supportActionBar?.title = "Main"

        val drawer = findViewById<DrawerLayout>(R.id.dl_main)
        val drawerToggle = object : ActionBarDrawerToggle(this, drawer, toolbar, R.string.draw_name, R.string.draw_name) {
            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
            }
        }

        drawer.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        ThreadPoolExecutor(2, 50, 30L, TimeUnit.SECONDS, LinkedBlockingQueue(120))
    }
}