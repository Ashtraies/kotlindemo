/**
 * kotlindemo org.ashtray.mobile.kotlin.demo.activity
 *
 * Created by Ash Wu on 24/06/2018 5:29 PM.
 * Copyright (c) 2018 ashtray.org
 */
package org.ashtray.mobile.kotlin.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.ashtray.mobile.kotlin.demo.R

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

