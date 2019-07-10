package jp.techacademy.takayuki.ochiai.taskapp

import android.app.Application
import io.realm.Realm

class TaskApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}