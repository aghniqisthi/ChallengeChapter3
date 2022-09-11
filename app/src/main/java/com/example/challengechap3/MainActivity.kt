package com.example.challengechap3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHuruf = arrayListOf(
            ListHuruf("A"),
            ListHuruf("B"),
            ListHuruf("C"),
            ListHuruf("D"),
            ListHuruf("E"),
            ListHuruf("F"),
            ListHuruf("G"),
            ListHuruf("H"),
            ListHuruf("I"),
            ListHuruf("J"),
            ListHuruf("K"),
            ListHuruf("L"),
            ListHuruf("M"),
            ListHuruf("N"),
            ListHuruf("O"),
            ListHuruf("P"),
            ListHuruf("Q"),
            ListHuruf("R"),
            ListHuruf("S"),
            ListHuruf("T"),
            ListHuruf("U"),
            ListHuruf("V"),
            ListHuruf("W"),
            ListHuruf("X"),
            ListHuruf("Y"),
            ListHuruf("Z")
        )
        val adapterHrf = HurufAdapter(listHuruf)
        var gv = GridLayoutManager(this, 3)

        rvHuruf.adapter = adapterHrf
        rvHuruf.layoutManager = gv
        adapterHrf.listener = this
    }

    override fun onItemClicked(view: View, list: ListHuruf) {
        when(list.huruf){
            "A" -> adapterLayout(listKataA())
            "Anjing"-> intent(list)
            "Ayam"-> intent(list)
            "Angsa"-> intent(list)
            "Angin"-> intent(list)
            "Alam"-> intent(list)

            "B" ->adapterLayout(listKataB())
            "Babi"-> intent(list)
            "Buaya" -> intent(list)
            "Bisa" -> intent(list)
            "Buncis" -> intent(list)
            "Barat" -> intent(list)

            "C" -> adapterLayout(listKataC())
            "Cicak"-> intent(list)
            "Cacing"-> intent(list)
            "Cumi"-> intent(list)
            "Cincang"-> intent(list)
            "Cuka"-> intent(list)

            "D" -> adapterLayout(listKataD())
            "Dasi"-> intent(list)
            "Duri"-> intent(list)
            "Data"-> intent(list)
            "Durian"-> intent(list)
            "Demak"-> intent(list)

            "E" -> adapterLayout(listKataE())
            "Emak"-> intent(list)
            "Enjing"-> intent(list)
            "Enak"-> intent(list)
            "Ekosistem"-> intent(list)
            "Esa"-> intent(list)

            "F" -> adapterLayout(listKataF())
            "Fanta"-> intent(list)
            "Fasilitas"-> intent(list)
            "Fisika"-> intent(list)
            "Fokus"-> intent(list)
            "Feses"-> intent(list)

            "G" -> adapterLayout(listKataG())
            "Gema"-> intent(list)
            "Gaung"-> intent(list)
            "Gendut"-> intent(list)
            "Gusar"-> intent(list)
            "Gemas"-> intent(list)

            "H" -> adapterLayout(listKataH())
            "Harimau"-> intent(list)
            "Hoshi"-> intent(list)
            "Hitam"-> intent(list)
            "Hindu"-> intent(list)
            "Helikopter"-> intent(list)

            "I" -> adapterLayout(listKataI())
            "Inggris"-> intent(list)
            "Itzy"-> intent(list)
            "Indonesia"-> intent(list)
            "Isaac"-> intent(list)
            "Isu"-> intent(list)

            "J" -> adapterLayout(listKataJ())
            "Jangkrik"-> intent(list)
            "Jambu"-> intent(list)
            "Jantung"-> intent(list)
            "Jisoo"-> intent(list)
            "Jepang"-> intent(list)

            "K" -> adapterLayout(listKataK())
            "Katak"-> intent(list)
            "Kodok"-> intent(list)
            "Komik"-> intent(list)
            "Kucing"-> intent(list)
            "Korea"-> intent(list)

            "L" -> adapterLayout(listKataL())
            "Landak" -> intent(list)
            "Lemah"-> intent(list)
            "Lumpia"-> intent(list)
            "Lontong"-> intent(list)
            "Lengkuas"-> intent(list)

            "M" -> adapterLayout(listKataM())
            "Manusia" -> intent(list)
            "Musik"-> intent(list)
            "Mental"-> intent(list)
            "Mika"-> intent(list)
            "Masak"-> intent(list)

            "N" -> adapterLayout(listKataN())
            "Nature"-> intent(list)
            "Navigasi"-> intent(list)
            "Nama"-> intent(list)
            "Nasional"-> intent(list)
            "Nasi"-> intent(list)

            "O" -> adapterLayout(listKataO())
            "Oppa"-> intent(list)
            "Orang"-> intent(list)
            "Orangutan"-> intent(list)
            "Ombak"-> intent(list)
            "Ongkir"-> intent(list)

            "P" -> adapterLayout(listKataP())
            "Pabrik"-> intent(list)
            "Pipi"-> intent(list)
            "Panik"-> intent(list)
            "Pisang"-> intent(list)
            "Pupuk"-> intent(list)

            "Q" -> adapterLayout(listKataQ())
            "Qisthi"-> intent(list)
            "Queen"-> intent(list)
            "Quran"-> intent(list)
            "Qasar"-> intent(list)
            "Qisas"-> intent(list)

            "R" -> adapterLayout(listKataR())
            "Ratu"-> intent(list)
            "Rantai"-> intent(list)
            "Rusak"-> intent(list)
            "Rindang"-> intent(list)
            "Rindu"-> intent(list)

            "S" -> adapterLayout(listKataS())
            "Seventeen"-> intent(list)
            "Soonyoung"-> intent(list)
            "Seungkwan"-> intent(list)
            "Shua"-> intent(list)
            "Scoups"-> intent(list)

            "T" -> adapterLayout(listKataT())
            "Timbangan"-> intent(list)
            "Teriak"-> intent(list)
            "Tisu"-> intent(list)
            "Tingkah"-> intent(list)
            "Televisi"-> intent(list)

            "U" -> adapterLayout(listKataU())
            "Umur"-> intent(list)
            "Ulang"-> intent(list)
            "Ukir"-> intent(list)
            "Uji"-> intent(list)
            "Undangan"-> intent(list)

            "V" -> adapterLayout(listKataV())
            "Vernon"-> intent(list)
            "Violin"-> intent(list)
            "Violence"-> intent(list)
            "Violet"-> intent(list)
            "Vaksin"-> intent(list)

            "W" -> adapterLayout(listKataW())
            "Wisdom"-> intent(list)
            "Where"-> intent(list)
            "Who"-> intent(list)
            "When"-> intent(list)
            "Whose"-> intent(list)

            "X" -> adapterLayout(listKataX())
            "Xilem"-> intent(list)
            "Xray"-> intent(list)
            "Xenia"-> intent(list)
            "Xenofili"-> intent(list)
            "Xenofobia"-> intent(list)

            "Y" -> adapterLayout(listKataY())
            "Yena"-> intent(list)
            "Yasin"-> intent(list)
            "Yusuf"-> intent(list)
            "Yaman"-> intent(list)
            "Yoyo" -> intent(list)

            "Z" -> adapterLayout(listKataZ())
            "Zebra"-> intent(list)
            "Zat"-> intent(list)
            "Zuma"-> intent(list)
            "Zelvia"-> intent(list)
            "Zonk"-> intent(list)
        }
    }

    fun listKataA():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Anjing"),
            ListHuruf("Ayam"),
            ListHuruf("Angsa"),
            ListHuruf("Angin"),
            ListHuruf("Alam")
        )
        return listHuruf
    }

    fun listKataB():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Babi"),
            ListHuruf("Buaya"),
            ListHuruf("Bisa"),
            ListHuruf("Buncis"),
            ListHuruf("Barat")
        )
        return listHuruf
    }

    fun listKataC():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Cicak"),
            ListHuruf("Cacing"),
            ListHuruf("Cumi"),
            ListHuruf("Cincang"),
            ListHuruf("Cuka")
        )
        return listHuruf
    }

    fun listKataD():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Dasi"),
            ListHuruf("Duri"),
            ListHuruf("Data"),
            ListHuruf("Durian"),
            ListHuruf("Demak")
        )
        return listHuruf
    }

    fun listKataE():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Emak"),
            ListHuruf("Enjing"),
            ListHuruf("Enak"),
            ListHuruf("Ekosistem"),
            ListHuruf("Esa")
        )
        return listHuruf
    }

    fun listKataF():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Fanta"),
            ListHuruf("Fasilitas"),
            ListHuruf("Fisika"),
            ListHuruf("Fokus"),
            ListHuruf("Feses")
        )
        return listHuruf
    }

    fun listKataG():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Gema"),
            ListHuruf("Gaung"),
            ListHuruf("Gendut"),
            ListHuruf("Gusar"),
            ListHuruf("Gemas")
        )
        return listHuruf
    }

    fun listKataH():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Harimau"),
            ListHuruf("Hoshi"),
            ListHuruf("Hitam"),
            ListHuruf("Hindu"),
            ListHuruf("Helikopter")
        )
        return listHuruf
    }

    fun listKataI():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Inggris"),
            ListHuruf("Itzy"),
            ListHuruf("Indonesia"),
            ListHuruf("Isaac"),
            ListHuruf("Isu")
        )
        return listHuruf
    }

    fun listKataJ():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Jangkrik"),
            ListHuruf("Jambu"),
            ListHuruf("Jantung"),
            ListHuruf("Jisoo"),
            ListHuruf("Jepang")
        )
        return listHuruf
    }

    fun listKataK():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Katak"),
            ListHuruf("Kodok"),
            ListHuruf("Komik"),
            ListHuruf("Kucing"),
            ListHuruf("Korea")
        )
        return listHuruf
    }

    fun listKataL():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Landak"),
            ListHuruf("Lemah"),
            ListHuruf("Lumpia"),
            ListHuruf("Lontong"),
            ListHuruf("Lengkuas")
        )
        return listHuruf
    }

    fun listKataM():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Manusia" ),
            ListHuruf("Musik"),
            ListHuruf("Mental"),
            ListHuruf("Mika"),
            ListHuruf("Masak")
        )
        return listHuruf
    }

    fun listKataN():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Nature"),
            ListHuruf("Navigasi"),
            ListHuruf("Nama"),
            ListHuruf("Nasional"),
            ListHuruf("Nasi")
        )
        return listHuruf
    }

    fun listKataO():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Oppa"),
            ListHuruf("Orang"),
            ListHuruf("Orangutan"),
            ListHuruf("Ombak"),
            ListHuruf("Ongkir")
        )
        return listHuruf
    }

    fun listKataP():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Pabrik"),
            ListHuruf("Pipi"),
            ListHuruf("Panik"),
            ListHuruf("Pisang"),
            ListHuruf("Pupuk")
        )
        return listHuruf
    }

    fun listKataQ():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Qisthi"),
            ListHuruf("Queen"),
            ListHuruf("Quran"),
            ListHuruf("Qasar"),
            ListHuruf("Qisas")
        )
        return listHuruf
    }

    fun listKataR():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Ratu"),
            ListHuruf("Rantai"),
            ListHuruf("Rusak"),
            ListHuruf("Rindang"),
            ListHuruf("Rindu")
        )
        return listHuruf
    }

    fun listKataS():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Seventeen"),
            ListHuruf("Soonyoung"),
            ListHuruf("Seungkwan"),
            ListHuruf("Shua"),
            ListHuruf("Scoups")
        )
        return listHuruf
    }

    fun listKataT():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Timbangan"),
            ListHuruf("Teriak"),
            ListHuruf("Tisu"),
            ListHuruf("Tingkah"),
            ListHuruf("Televisi")
        )
        return listHuruf
    }

    fun listKataU():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Umur"),
            ListHuruf("Ulang"),
            ListHuruf("Ukir"),
            ListHuruf("Uji"),
            ListHuruf("Undangan")
        )
        return listHuruf
    }

    fun listKataV():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Vernon"),
            ListHuruf("Violin"),
            ListHuruf("Violence"),
            ListHuruf("Violet"),
            ListHuruf("Vaksin")
        )
        return listHuruf
    }

    fun listKataW():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Wisdom"),
            ListHuruf("Where"),
            ListHuruf("Who"),
            ListHuruf("When"),
            ListHuruf("Whose")
        )
        return listHuruf
    }

    fun listKataX():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Xilem"),
            ListHuruf("Xray"),
            ListHuruf("Xenia"),
            ListHuruf("Xenofili"),
            ListHuruf("Xenofobia")
        )
        return listHuruf
    }

    fun listKataY():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Yena"),
            ListHuruf("Yasin"),
            ListHuruf("Yusuf"),
            ListHuruf("Yaman"),
            ListHuruf("Yoyo")
        )
        return listHuruf
    }

    fun listKataZ():ArrayList<ListHuruf>{
        var listHuruf = arrayListOf(
            ListHuruf("Zebra"),
            ListHuruf("Zat"),
            ListHuruf("Zuma"),
            ListHuruf("Zelvia"),
            ListHuruf("Zonk")
        )
        return listHuruf
    }

    fun adapterLayout(listkata: ArrayList<ListHuruf>){
        val adapterKata = HurufAdapter(listkata)
        var linear = LinearLayoutManager(this)

        rvHuruf.adapter = adapterKata
        rvHuruf.layoutManager = linear
        adapterKata.listener = this
    }

    fun intent(list: ListHuruf){
        val pindah = Intent(Intent.ACTION_VIEW)
        pindah.data = Uri.parse("https://www.google.com/search?q=${list.huruf}")
        startActivity(pindah)
    }
}