package com.example.coroutineapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coroutineapp.api.RetrofitClient
import com.example.coroutineapp.databinding.ActivityMainBinding
import com.example.coroutineapp.model.User
import com.google.gson.GsonBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MainActity"
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.getData().observe(this, Observer { User ->

            val gson = GsonBuilder().setPrettyPrinting().create()
            mainBinding.email.append(gson.toJson(User))

        })
    }







    }




        /*  GlobalScope.launch(Dispatchers.IO) {
              val response = RetrofitClient.api.getUser()
              val gson = GsonBuilder().setPrettyPrinting().create()
                  Log.e("MainActivity", gson.toJson(response.body()))

          }*/

        /* CoroutineScope(Dispatchers.Main).launch{
                   val response = RetrofitClient.api.getUser()

                     if (response.body()!=null){
                         val data = response.body()
                         for (tata in data!!.users){
                           //  tata.email
                           //  mainBinding.email.setText(tata.email)
                           //  mainBinding.email.append("Id="+tata.id.toString()+ "\n"+"Email="+tata.email+"\n"+"Name ="+tata.name+"\n"+"School ="+tata.school+"\n\n\n")
                         }
                         val gson = GsonBuilder().setPrettyPrinting().create()
                         // Log.e("MainActivity", gson.toJson(data))
                         mainBinding.email.append(gson.toJson(data))






                     }

                     }

       */



//}


/*  CoroutineScope(Main).launch{
      Log.e("Pramod",Thread.currentThread().name)
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

}*/

