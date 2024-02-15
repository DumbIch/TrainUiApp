package ru.dumdumbich.trainuiapp.ui.screen.search

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import ru.dumdumbich.trainuiapp.databinding.FragmentSearchBinding
import ru.dumdumbich.trainuiapp.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {

    companion object {
        fun newInstance() = SearchFragment()
    }

    private lateinit var viewModel: SearchViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[SearchViewModel::class.java]
    }
}
