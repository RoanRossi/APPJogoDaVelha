package com.example.jogodavelha;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
		Button Jogador1 = (Button) findViewById(R.id.buttonJogador1);
		Button Jogador2 = (Button) findViewById(R.id.buttonJogador2);
		Button Sair = (Button) findViewById(R.id.buttonSair);
		
		//finish();

		Jogador1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (Tela1.this, Tela_1Jogador.class);
				startActivity(intencao);

			}
		});
		Jogador2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intencao = new Intent (Tela1.this, Tela_2Jogadors.class);
				startActivity(intencao);

			}
		});
		Sair.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder mBox = new AlertDialog.Builder(Tela1.this);
				mBox.setTitle("Deseja sair mesmo?");
				mBox.setPositiveButton("Sim :(", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						finish();
					}
				});
				mBox.setNegativeButton("Não :)", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				mBox.show();
			}
		});
	}
}
