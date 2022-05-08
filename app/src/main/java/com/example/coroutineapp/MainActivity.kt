package com.example.coroutineapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    private val TAG :String ="MainActity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch{
                task1()
        }

        CoroutineScope(Dispatchers.Main).launch{
            task2()
        }
    }
    suspend fun task1(){
        Log.e(TAG, "Start Task 1 " )
        yield()
        Log.e(TAG, "Start Task 1 " )
    }
    suspend fun task2(){
        Log.e(TAG, "Start Task 2 " )
        yield()
        Log.e(TAG, "Start Task 2 " )

    }
}