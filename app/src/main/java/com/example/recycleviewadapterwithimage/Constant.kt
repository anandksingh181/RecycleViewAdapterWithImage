package com.example.recycleviewadapterwithimage

object Constant {
   lateinit var dataList : ArrayList<RvModel>

    fun getData():ArrayList<RvModel>{
        dataList = ArrayList<RvModel>()


        for (i in 1..101) {
            dataList.add(RvModel(R.drawable.anand, "Anand Kumar Singh", "9129757212", "Sector-71"))
        }
        return dataList
    }

}