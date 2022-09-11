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
                "B" -> {
                    var listkata = arrayListOf(
                        ListKata("Babi"),
                        ListKata("Buaya"),
                        ListKata("Basi"),
                        ListKata("Bungkus"),
                        ListKata("Becak")
                    )

                    val adapterKata = KataAdapter(listkata)
                    rvKata.adapter = adapterKata

                    adapterKata.onClick = {
                        var bundle = Bundle()
                        bundle.putString("kata", it.kata)
                        Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                    }
                }
                "C" -> {
                    var listkata = arrayListOf(
                        ListKata("Cicak"),
                        ListKata("Cocot"),
                        ListKata("Cuci"),
                        ListKata("Cuka"),
                        ListKata("Cobek")
                    )

                    val adapterKata = KataAdapter(listkata)
                    rvKata.adapter = adapterKata

                    adapterKata.onClick = {
                        var bundle = Bundle()
                        bundle.putString("kata", it.kata)
                        Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                    }
                }
                "D" -> {
                    var listkata = arrayListOf(
                        ListKata("Dasi"),
                        ListKata("Duka"),
                        ListKata("Dinding"),
                        ListKata("Damai"),
                        ListKata("Domba")
                    )

                    val adapterKata = KataAdapter(listkata)
                    rvKata.adapter = adapterKata

                    adapterKata.onClick = {
                        var bundle = Bundle()
                        bundle.putString("kata", it.kata)
                        Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                    }
                }

                "E" -> {
                var listkata = arrayListOf(
                    ListKata("Elang"),
                    ListKata("Encok"),
                    ListKata("Enjing"),
                    ListKata("Enak"),
                    ListKata("Egrang")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }

            "F" -> {
                var listkata = arrayListOf(
                    ListKata("Fanta"),
                    ListKata("Facial"),
                    ListKata("Freak"),
                    ListKata("Fokus"),
                    ListKata("Fasilitas")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }

            "G" -> {
                var listkata = arrayListOf(
                    ListKata("Gajah"),
                    ListKata("Gambar"),
                    ListKata("Gamis"),
                    ListKata("Gosong"),
                    ListKata("Gitar")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "H" -> {
                var listkata = arrayListOf(
                    ListKata("Harimau"),
                    ListKata("Hoshi"),
                    ListKata("Hongkong"),
                    ListKata("Haechan"),
                    ListKata("Hambar")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "I" -> {
                var listkata = arrayListOf(
                    ListKata("Inggris"),
                    ListKata("Intan"),
                    ListKata("Imbalan"),
                    ListKata("Induk"),
                    ListKata("Imigrasi")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "J" -> {
                var listkata = arrayListOf(
                    ListKata("Jepang"),
                    ListKata("Jisoo"),
                    ListKata("Joshua"),
                    ListKata("Jembatan"),
                    ListKata("Jajan")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "K" -> {
                var listkata = arrayListOf(
                    ListKata("Korea"),
                    ListKata("Kambing"),
                    ListKata("Kuncir"),
                    ListKata("Kincir"),
                    ListKata("Komponen")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "L" -> {
                var listkata = arrayListOf(
                    ListKata("Lentur"),
                    ListKata("Lembang"),
                    ListKata("Lomba"),
                    ListKata("Landai"),
                    ListKata("Lava")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "M" -> {
                var listkata = arrayListOf(
                    ListKata("Memori"),
                    ListKata("Macan"),
                    ListKata("Makan"),
                    ListKata("Mata"),
                    ListKata("Mimik")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "N" -> {
                var listkata = arrayListOf(
                    ListKata("Nature"),
                    ListKata("Navigasi"),
                    ListKata("Nama"),
                    ListKata("Nasional"),
                    ListKata("Nasi")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "O" -> {
                var listkata = arrayListOf(
                    ListKata("Oppa"),
                    ListKata("Orang"),
                    ListKata("Orangutan"),
                    ListKata("Ombak"),
                    ListKata("Ongkir")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "P" -> {
                var listkata = arrayListOf(
                    ListKata("Pabrik"),
                    ListKata("Pipi"),
                    ListKata("Panik"),
                    ListKata("Pisang"),
                    ListKata("Pupuk")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "Q" -> {
                var listkata = arrayListOf(
                    ListKata("Qisthi"),
                    ListKata("Queen"),
                    ListKata("Quran"),
                    ListKata("Qasar"),
                    ListKata("Qisas")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "R" -> {
                var listkata = arrayListOf(
                    ListKata("Ratu"),
                    ListKata("Rantai"),
                    ListKata("Rusak"),
                    ListKata("Rindang"),
                    ListKata("Rindu")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "S" -> {
                var listkata = arrayListOf(
                    ListKata("Seventeen"),
                    ListKata("Soonyoung"),
                    ListKata("Seungkwan"),
                    ListKata("Shua"),
                    ListKata("Scoups")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "T" -> {
                var listkata = arrayListOf(
                    ListKata("Timbangan"),
                    ListKata("Teriak"),
                    ListKata("Tisu"),
                    ListKata("Tingkah"),
                    ListKata("Televisi")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "U" -> {
                var listkata = arrayListOf(
                    ListKata("Umur"),
                    ListKata("Ulang"),
                    ListKata("Ukir"),
                    ListKata("Uji"),
                    ListKata("Undangan")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "V" -> {
                var listkata = arrayListOf(
                    ListKata("Vernon"),
                    ListKata("Violin"),
                    ListKata("Violence"),
                    ListKata("Violet"),
                    ListKata("Vaksin")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "W" -> {
                var listkata = arrayListOf(
                    ListKata("Wisdom"),
                    ListKata("Where"),
                    ListKata("Who"),
                    ListKata("When"),
                    ListKata("Whose")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "X" -> {
                var listkata = arrayListOf(
                    ListKata("Xilem"),
                    ListKata("Xray"),
                    ListKata("Xenia"),
                    ListKata("Xenofili"),
                    ListKata("Xenofobia")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "Y" -> {
                var listkata = arrayListOf(
                    ListKata("Yena"),
                    ListKata("Yasin"),
                    ListKata("Yusuf"),
                    ListKata("Yaman"),
                    ListKata("Yoyo")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
            "Z" -> {
                var listkata = arrayListOf(
                    ListKata("Zebra"),
                    ListKata("Zat"),
                    ListKata("Zuma"),
                    ListKata("Zelvia"),
                    ListKata("Zonk")
                )

                val adapterKata = KataAdapter(listkata)
                rvKata.adapter = adapterKata

                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("kata", it.kata)
                    Navigation.findNavController(view).navigate(R.id.action_kataFragment_to_webFragment, bundle)
                }
            }
        }

        val linear = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvKata.layoutManager = linear
    }

}