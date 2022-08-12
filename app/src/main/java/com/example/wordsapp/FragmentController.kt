package com.example.wordsapp

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

abstract class FragmentController : Fragment() {

    fun onCheckCountFragmentHaveBackStack() {
        val fm: FragmentManager = parentFragmentManager
        for (entry in 0 until fm.backStackEntryCount) {
            val count = fm.backStackEntryCount
            Log.i("Datbt", "Found fragment: " + fm.getBackStackEntryAt(entry).id)
            Log.i("Datbt", "Found count fragment: " + fm.backStackEntryCount)
        }
    }
}