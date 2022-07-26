package com.thecommerce.matchingbox.viewmodel


import Event
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thecommerce.matchingbox.model.Data

class MainViewModel : ViewModel() {
    private val _userList = MutableLiveData<ArrayList<Data>>()
    val userList: LiveData<ArrayList<Data>>
        get() = _userList
    private var items = ArrayList<Data>()

    init {
        items = arrayListOf(
            Data(name = "박성호", 28),
            Data(name = "도영호", 29)
        )
        _userList.value = items
    }

    fun buttonClick(){
        val user = Data("Test",20)
        items.add(user)
        _userList.value = items
        Log.d(javaClass.name,"버튼클릭")
    }
}