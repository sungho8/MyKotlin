package com.thecommerce.matchingbox.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.thecommerce.matchingbox.R
import com.thecommerce.matchingbox.databinding.ActivityMainBinding
import com.thecommerce.matchingbox.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = model

        binding.lifecycleOwner = this
    }


}