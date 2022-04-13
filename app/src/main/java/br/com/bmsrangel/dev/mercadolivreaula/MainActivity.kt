package br.com.bmsrangel.dev.mercadolivreaula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun entrar(view: View) {
        startActivity(
            Intent(
                this,
                CadastroActivity::class.java
            )
        )
    }

    fun logar(view: View) {
        startActivity(
            Intent(
                this,
                LoginActivity::class.java
            )
        )
    }
}