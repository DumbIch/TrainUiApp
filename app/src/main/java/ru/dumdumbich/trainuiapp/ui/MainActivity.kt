package ru.dumdumbich.trainuiapp.ui

import android.os.Bundle
import ru.dumdumbich.trainuiapp.app
import ru.dumdumbich.trainuiapp.databinding.ActivityMainBinding
import ru.dumdumbich.trainuiapp.ui.base.BaseActivity
import ru.dumdumbich.trainuiapp.ui.screen.search.SearchFragment

class MainActivity : BaseActivity(), MainRouter {

    private lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        app.setRouter(this)
        if (savedInstanceState == null) {
            app.router.showSearchScreen()
        }
    }

    override fun showSearchScreen() {
        ui.fragmentContainerViewActivityMain.let { container ->
            supportFragmentManager.beginTransaction()
                .replace(container.id, SearchFragment.newInstance())
                .commit()
        }
    }
}
