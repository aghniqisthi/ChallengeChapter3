package com.example.challengechap3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_huruf.*

class HurufFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_huruf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listHrf = arrayListOf(
            ListHuruf("A"),
            ListHuruf("B"),
            ListHuruf("C"),
            ListHuruf("D"),
            ListHuruf("E")
        )

        val adapterHuruf = HurufAdapter(listHrf)
        val gridView = GridLayoutManager(context, 2)

        rvHuruf.adapter = adapterHuruf
        rvHuruf.layoutManager = gridView


        adapterHuruf.onClick = {
            var bundle = Bundle()
            bundle.putString("huruf", it.huruf)
            Navigation.findNavController(view).navigate(R.id.action_hurufFragment_to_kataFragment, bundle)
        }
    }

}