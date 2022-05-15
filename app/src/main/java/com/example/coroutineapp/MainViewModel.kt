package com.example.coroutineapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.coroutineapp.model.User
import com.example.coroutineapp.model.UserResponse

class MainViewModel:ViewModel(){
    private lateinit var mainReposittory:MainReposittory

    fun getData():LiveData<User>{
      var mainReposittory = MainReposittory()
      return mainReposittory.login()
  }




    }
