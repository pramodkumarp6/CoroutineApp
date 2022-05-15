package com.example.coroutineapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.coroutineapp.api.RetrofitClient
import com.example.coroutineapp.model.User
import com.google.gson.GsonBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainReposittory{
          val myvalues = MutableLiveData<User>()
      fun login():MutableLiveData<User>{
        CoroutineScope(Dispatchers.Main).launch{
            val response = RetrofitClient.api.getUser()

            if (response.body() != null) {
                val data = response.body()
                for (tata in data!!.users) {

                    myvalues.setValue(tata)

                }

            }
        }
        return myvalues
    }

}