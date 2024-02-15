package ru.dumdumbich.trainuiapp

import android.app.Application
import android.content.Context
import ru.dumdumbich.trainuiapp.ui.MainRouter

/**
 * <h3>TrainUiApp</h3>
 * @File : App
 * @description
 * <p>Application class</p>
 * @author DumbIch
 * @date 2024-02-15 07:50
 **/

class App : Application() {

    private var _router: MainRouter? = null
    val router get() = _router ?: error("Router of ${this::class.java.simpleName} is null")

    fun setRouter(router: MainRouter?) {
        _router = router
    }

    override fun onCreate() {
        super.onCreate()
    }
}

val Context.app
    get() = applicationContext as App
