package com.example.goaltracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

// 리사이클러 뷰 아이템
class Friends(var userName : String? = null,
              var email : String? = null,
              var uid : String? = null,
              var userColor : String? = null)
