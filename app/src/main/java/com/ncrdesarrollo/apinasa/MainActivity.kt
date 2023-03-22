package com.ncrdesarrollo.apinasa

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.ncrdesarrollo.apinasa.apodo.view.ApodoViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: ApodoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*viewModel.getApodo()
        viewModel.responseApodoModel.observe(
            this,
            Observer {
                Log.d("titulo", "${it.title}")
            }
        )*/
    }
}
