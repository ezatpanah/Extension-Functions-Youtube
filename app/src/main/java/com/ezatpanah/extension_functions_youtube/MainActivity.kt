package com.ezatpanah.extension_functions_youtube

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ezatpanah.extension_functions_youtube.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            //Click extension
            btnShowToast.click {
                //toast activity extension
                toastActivity("Toast Extension")
            }
            btnShowSnackbar.click {
                //Snackbar extension
                binding.root.showSnackbar("Snackbar Extension")
            }
            btnLongClick.longClick {
                toastActivity("Long Click Extension")
                true
            }

            btnToggleVisibility.click {
                //Toggle extension
                tvToggle.toggleVisibility()
            }

            btnIsVisible.click {
                //Visibility extension
                btnShowToast.isVisible(true, btnShowToast, btnShowSnackbar, btnLongClick)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}