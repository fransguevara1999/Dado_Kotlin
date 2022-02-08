package com.example.dadogiratorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_lanzar.setOnClickListener{
            //Tira el dado cuando inicies
            lanzardado()
        }

    }
//Lanzar dado
    private fun lanzardado() {
    //Crear dado de 6 numeros
        val dado1=dado(6)
    //Lanzar dado
        val ladado1=dado1.lanzar()
        print(ladado1)
    //capturamos el identificador de la imagen para poder cambiar al lanzar el dado.
        val img_dado:ImageView=findViewById(R.id.Dado_img)
    //imagenes contendrá todas las imagenes , ladado1 contiene el numero al hacer del 1 al 6.
        val imagenes=when(ladado1){
            1->R.drawable.dado_1
            2->R.drawable.dado_2
            3->R.drawable.dado_3
            4->R.drawable.dado_4
            5->R.drawable.dado_5
            else->R.drawable.dado_6
        }
    //Al lanzar el dado se seleccionara una opcion y se agregara por medio de imagenes
    //pasamos con setImageResource la imagen que queremos mostrar en este caso es por el random del 1 al 6.
        img_dado.setImageResource(imagenes)
    //colocamos una descripcion para guardar el numero .
        img_dado.contentDescription=ladado1.toString()

       // val dadoImagen:ImageView=findViewById(R.id.Dado_img)

      /* when(ladado1){
           1->dadoImagen.setImageResource(R.drawable.dado_1)
           2->dadoImagen.setImageResource(R.drawable.dado_2)
           3->dadoImagen.setImageResource(R.drawable.dado_3)
           4->dadoImagen.setImageResource(R.drawable.dado_4)
           5->dadoImagen.setImageResource(R.drawable.dado_5)
           6->dadoImagen.setImageResource(R.drawable.dado_6)
       }*/
        //dadoImagen.setImageResource(R.drawable.dado_2)
        //val txtResultado:TextView=findViewById(R.id.txt_num)
        //txtResultado.text=ladado1.toString()
    }
}
class dado(private val numLado:Int){
    fun lanzar():Int{
        return (1..numLado).random()
    }

}