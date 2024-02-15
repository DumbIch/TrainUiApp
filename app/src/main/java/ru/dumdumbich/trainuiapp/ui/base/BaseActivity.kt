package ru.dumdumbich.trainuiapp.ui.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    private val tag = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate() called with: savedInstanceState = $savedInstanceState")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy() called")
        super.onDestroy()
    }
}
