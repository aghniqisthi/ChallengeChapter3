package com.example.challengechap3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_kata.*

class KataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kata, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getHuruf = arguments?.getString("huruf")
        when(getHuruf){
            "A" -> {
                var listkata = arrayListOf(
                    ListKata("Anjing"),
                    ListKata("Ayam"),
                    ListKata("Angsa"),
                    ListKata("Abu"),
                    ListKata("Angka")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "B" -> Toast.makeText(context, "INI B", Toast.LENGTH_SHORT).show()
            "C" -> Toast.makeText(context, "INI C", Toast.LENGTH_SHORT).show()
            "D" -> Toast.makeText(context, "INI D", Toast.LENGTH_SHORT).show()
        }

        val linear = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvKata.layoutManager = linear
    }

}