package com.example.challengechap3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_huruf.*

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
            ListHuruf("L")
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