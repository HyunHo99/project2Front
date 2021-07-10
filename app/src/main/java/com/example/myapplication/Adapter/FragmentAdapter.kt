package com.example.myapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.Fragment.FragSurf1
import com.example.myapplication.Fragment.FragSurf2
import com.example.myapplication.Fragment.FragSurf3

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    private val fragSurf1 by lazy { FragSurf1() }
    private val fragSurf2 by lazy { FragSurf2() }
    private val fragSurf3 by lazy { FragSurf3() }

    private val fragments: List<Fragment> = listOf(
        fragSurf1, fragSurf2, fragSurf3
    )

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> fragments[0]
            1 -> fragments[1]
            else -> fragments[2]
        }
    }

}