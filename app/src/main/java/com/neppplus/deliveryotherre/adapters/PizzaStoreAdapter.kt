package com.neppplus.deliveryotherre.adapters

import android.content.Context
import android.view.LayoutInflater
import com.neppplus.deliveryotherre.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>) : ArrayList<StoreData>(mContext,resId,mList) {

    val mInflater = LayoutInflater.from(mContext)


}