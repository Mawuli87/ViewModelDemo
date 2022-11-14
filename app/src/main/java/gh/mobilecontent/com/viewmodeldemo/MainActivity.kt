package gh.mobilecontent.com.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import gh.mobilecontent.com.viewmodeldemo.databinding.ActivityMainBinding
import gh.mobilecontent.com.viewmodeldemo.viewmodel.ActivityMainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var activityMainViewModel: ActivityMainViewModel
    //lateinit var viewModelProvider: ActivityMainViewModelProvider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       activityMainViewModel = ViewModelProvider(this)[ActivityMainViewModel::class.java]

     // viewModelProvider = ActivityMainViewModelProvider("Android kotlin through provider")

        activityMainViewModel.nameName.observe(this, Observer { name ->
            binding.nameViewmodel.text = name
            Log.i("LIVEDATA","$name")
        })

    }

}