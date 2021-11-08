package com.neppplus.deliveryotherre.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.deliveryotherre.R

class PizzaStoreListfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragments_pizza_store_list,container,false)
    }
//    동작 관련 코드 작성 예정
}