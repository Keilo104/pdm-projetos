package br.edu.ifsp.scl.ads.someviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Toast
import br.edu.ifsp.scl.ads.someviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        with(activityMainBinding) {
            estadoCivilSp.onItemSelectedListener = object: OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    if (position == 2) { // Casado
                        conjugeLl.visibility = View.VISIBLE
                    } else {
                        conjugeLl.visibility = View.GONE
                        nomeConjugeEt.setText("")
                        sobrenomeConjugeEt.setText("")
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // NSA
                }
            }

            conjugeLl.visibility = View.GONE
        }

        activityMainBinding.salvarBt.setOnClickListener {
                Toast.makeText(this, "Foi clicado", Toast.LENGTH_LONG).show()
        }
    }
}