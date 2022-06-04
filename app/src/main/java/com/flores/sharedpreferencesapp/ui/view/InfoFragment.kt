package com.flores.sharedpreferencesapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.flores.sharedpreferencesapp.R
import com.flores.sharedpreferencesapp.databinding.FragmentInfoBinding
import com.flores.sharedpreferencesapp.ui.viewmodel.InfoViewModel

class InfoFragment : BaseFragment<FragmentInfoBinding>(FragmentInfoBinding::inflate) {
    private lateinit var viewModel: InfoViewModel
    private lateinit var webView: WebView

    override fun onSaveInstanceState(outState: Bundle) {
        webView.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val url = "https://pokemongolive.com/es/"

        webView = binding.wvMain

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = PokemonWebClient()
        savedInstanceState?.let {
            webView.restoreState(it)
        }?:webView.loadUrl(url)
    }

    inner class PokemonWebClient:WebViewClient(){
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            webView.loadUrl("javascript:(function(){" +
                    "document.getElementByClassName('navbar top')[0].style.display='none';})()");
        }
    }



}