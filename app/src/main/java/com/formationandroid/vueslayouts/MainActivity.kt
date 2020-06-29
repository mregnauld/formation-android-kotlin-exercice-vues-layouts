package com.formationandroid.vueslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

	override fun onCreate(savedInstanceState: Bundle?)
	{
		// init :
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// toast :
		Toast.makeText(this, R.string.main_bienvenue, Toast.LENGTH_LONG).show()
	}

	/**
	 * Listener de clic appelé depuis le bouton retour.
	 * @param view Vue cliquée (ici, le bouton retour)
	 */
	@Suppress("UNUSED_PARAMETER")
	fun clicBouton(view: View)
	{
		// retour en haut :
		scroll_article.smoothScrollTo(0, 0)

		// message :
		Toast.makeText(this, R.string.main_retour, Toast.LENGTH_LONG).show();
	}

}