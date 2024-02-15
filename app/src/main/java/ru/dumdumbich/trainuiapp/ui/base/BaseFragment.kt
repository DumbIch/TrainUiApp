package ru.dumdumbich.trainuiapp.ui.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<VB : ViewBinding>(private val bindingInflater: (inflater: LayoutInflater) -> VB) :
    Fragment() {

    private val tag = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"

    private var _ui: VB? = null
    protected val ui get() = _ui ?: error("Binding of ${this::class.java.simpleName} is null")

    override fun onAttach(context: Context) {
        Log.d(tag, "onAttach() called with: context = $context")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate() called with: savedInstanceState = $savedInstanceState")
        super.onCreate(savedInstanceState)
        //retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(
            tag,
            "onCreateView() called with: inflater = $inflater, container = $container, savedInstanceState = $savedInstanceState"
        )
        _ui = bindingInflater.invoke(layoutInflater)
        return ui.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(
            tag,
            "onViewCreated() called with: view = $view, savedInstanceState = $savedInstanceState"
        )
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop() called")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(tag, "onDestroyView() called")
        super.onDestroyView()
        _ui = null
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy() called")
        super.onDestroy()
    }
}
