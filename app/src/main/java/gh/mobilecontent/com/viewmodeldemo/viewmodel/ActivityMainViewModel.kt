package gh.mobilecontent.com.viewmodeldemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityMainViewModel : ViewModel() {

    var nameName = MutableLiveData<String>()

    init {
       nameName.value = "Android kotlin"
    }


}