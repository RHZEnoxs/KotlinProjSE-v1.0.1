package com.enoxs.kotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    private var txtName: TextView? = null
    private lateinit var txtVersion:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }
    var appInfo:AppInfo ?=null
    fun initData(){
        appInfo = AppInfo("KotlinProjSE-v1.0.1",
                "1.0.1",
                "2018/06/22",
                "Enoxs",
                "Kotlin Project Sample")
    }

    fun initView() {
        txtName = findViewById(R.id.txt_name)
        txtName!!.text = appInfo?.appName

        txtVersion = findViewById(R.id.txt_version)
        txtVersion.text = appInfo?.appVersion
    }

    data class AppInfo(
            var appName:String,
            var appVersion:String,
            var appDate:String,
            var appAuthor:String,
            var appRemark:String
    )
}
