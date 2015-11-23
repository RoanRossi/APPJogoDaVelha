package com.example.jogodavelha;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tela_2Jogadors extends Activity {
	int matrisControlePP [][]= new int[3][3];
	int P1 = 1;
	int P2 = 2;
	int controledojogo;
	LinearLayout PP00,PP01,PP02,PP10,PP11,PP12,PP20,PP21,PP22;
	ImageView IMGPP00,IMGPP01,IMGPP02,IMGPP10,IMGPP11,IMGPP12,IMGPP20,IMGPP21,IMGPP22;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_2_jogadors);
		controledojogo = 0;

		PP00 = (LinearLayout) findViewById(R.id.PP00);
		IMGPP00 = (ImageView) findViewById(R.id.imageViewPP00);
		PP00.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP00.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP00.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP00.setEnabled(false);
					matrisControlePP[0][0] = 1;
					verificaVencedor(P1);
				}else{
					PP00.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP00.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP00.setEnabled(false);
					matrisControlePP[0][0] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP01 = (LinearLayout) findViewById(R.id.PP01);
		IMGPP01 = (ImageView) findViewById(R.id.imageViewPP01);
		PP01.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP01.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP01.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP01.setEnabled(false);
					matrisControlePP[0][1] = 1;
					verificaVencedor(P1);
				}else{
					PP01.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP01.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP01.setEnabled(false);
					matrisControlePP[0][1] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP02 = (LinearLayout) findViewById(R.id.PP02);
		IMGPP02 = (ImageView) findViewById(R.id.imageViewPP02);
		PP02.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP02.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP02.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP02.setEnabled(false);
					matrisControlePP[0][2] = 1;
					verificaVencedor(P1);
				}else{
					PP02.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP02.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP02.setEnabled(false);
					matrisControlePP[0][2] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP10 = (LinearLayout) findViewById(R.id.PP10);
		IMGPP10 = (ImageView) findViewById(R.id.imageViewPP10);
		PP10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP10.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP10.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP10.setEnabled(false);
					matrisControlePP[1][0] = 1;
					verificaVencedor(P1);
				}else{
					PP10.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP10.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP10.setEnabled(false);
					matrisControlePP[1][0] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP11 = (LinearLayout) findViewById(R.id.PP11);
		IMGPP11 = (ImageView) findViewById(R.id.imageViewPP11);
		PP11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP11.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP11.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP11.setEnabled(false);
					matrisControlePP[1][1] = 1;
					verificaVencedor(P1);
				}else{
					PP11.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP11.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP11.setEnabled(false);
					matrisControlePP[1][1] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP12 = (LinearLayout) findViewById(R.id.PP12);
		IMGPP12 = (ImageView) findViewById(R.id.imageViewPP12);
		PP12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP12.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP12.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP12.setEnabled(false);
					matrisControlePP[1][2] = 1;
					verificaVencedor(P1);
				}else{
					PP12.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP12.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP12.setEnabled(false);
					matrisControlePP[1][2] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP20 = (LinearLayout) findViewById(R.id.PP20);
		IMGPP20 = (ImageView) findViewById(R.id.imageViewPP20);
		PP20.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP20.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP20.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP20.setEnabled(false);
					matrisControlePP[2][0] = 1;
					verificaVencedor(P1);
				}else{
					PP20.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP20.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP20.setEnabled(false);
					matrisControlePP[2][0] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP21 = (LinearLayout) findViewById(R.id.PP21);
		IMGPP21 = (ImageView) findViewById(R.id.imageViewPP21);
		PP21.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP21.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP21.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP21.setEnabled(false);
					matrisControlePP[2][1] = 1;
					verificaVencedor(P1);
				}else{
					PP21.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP21.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP21.setEnabled(false);
					matrisControlePP[2][1] = 2;
					verificaVencedor(P2);
				}

			}
		});

		PP22 = (LinearLayout) findViewById(R.id.PP22);
		IMGPP22 = (ImageView) findViewById(R.id.imageViewPP22);
		PP22.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (controledojogo % 2 == 0) {
					PP22.setBackgroundColor(getResources().getColor(R.color.verde));
					IMGPP22.setBackgroundResource(R.drawable.o);
					controledojogo++;
					PP22.setEnabled(false);
					matrisControlePP[2][2] = 1;
					verificaVencedor(P1);
				}else{
					PP22.setBackgroundColor(getResources().getColor(R.color.vermelho));
					IMGPP22.setBackgroundResource(R.drawable.x);
					controledojogo++;
					PP22.setEnabled(false);
					matrisControlePP[2][2] = 2;
					verificaVencedor(P2);
				}

			}
		});


		Button voltar = (Button) findViewById(R.id.voltarPP);
		voltar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_2Jogadors.this);
				mBox.setTitle("Deseja voltar ao menu?");
				mBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						finish();
					}
				});
				mBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				mBox.show();
			}
		});

		Button limpar = (Button) findViewById(R.id.LimparPP);
		limpar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_2Jogadors.this);
				mBox.setTitle("Deseja limpar o jogo?");
				mBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						limparTudo();
					}
				});
				mBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				mBox.show();
			}
		});

	}

	public void verificaVencedor (int P ){

		if (matrisControlePP[0][0] == P && matrisControlePP[0][1] == P && matrisControlePP[0][2] == P) {
			mensagem(P);
		}else if (matrisControlePP[1][0] == P && matrisControlePP[1][1] == P && matrisControlePP[1][2] == P) {
			mensagem(P);
		}else if (matrisControlePP[2][0] == P && matrisControlePP[2][1] == P && matrisControlePP[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePP[0][0] == P && matrisControlePP[1][0] == P && matrisControlePP[2][0] == P) {
			mensagem(P);
		}else if (matrisControlePP[0][1] == P && matrisControlePP[1][1] == P && matrisControlePP[2][1] == P) {
			mensagem(P);
		}else if (matrisControlePP[0][2] == P && matrisControlePP[1][2] == P && matrisControlePP[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePP[0][0] == P && matrisControlePP[1][1] == P && matrisControlePP[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePP[0][2] == P && matrisControlePP[1][1] == P && matrisControlePP[2][0] == P) {
			mensagem(P);
		}else if (controledojogo == 9) {
			mensagem(3);
		}

	}
	public void mensagem (int P){

		AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_2Jogadors.this);
		if (P==1) {
			mBox.setTitle("O ganhou");
		}else if(P==2){
			mBox.setTitle("X ganhou");
		}else{
			mBox.setTitle("Empate! Deu velha");

		}
		mBox.setMessage("Deseja jogar novamente?");
		mBox.setPositiveButton("Sim :)", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				limparTudo();
			}
		});
		mBox.setNegativeButton("Não :(", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();

			}
		});
		mBox.show();
	}

	public void limparTudo(){
		controledojogo=0;
		PP00.setBackgroundColor(getResources().getColor(R.color.branco));
		PP00.setEnabled(true);
		PP01.setBackgroundColor(getResources().getColor(R.color.branco));
		PP01.setEnabled(true);
		PP02.setBackgroundColor(getResources().getColor(R.color.branco));
		PP02.setEnabled(true);
		PP10.setBackgroundColor(getResources().getColor(R.color.branco));
		PP10.setEnabled(true);
		PP11.setBackgroundColor(getResources().getColor(R.color.branco));
		PP11.setEnabled(true);
		PP12.setBackgroundColor(getResources().getColor(R.color.branco));
		PP12.setEnabled(true);
		PP20.setBackgroundColor(getResources().getColor(R.color.branco));
		PP20.setEnabled(true);
		PP21.setBackgroundColor(getResources().getColor(R.color.branco));
		PP21.setEnabled(true);
		PP22.setBackgroundColor(getResources().getColor(R.color.branco));
		PP22.setEnabled(true);
		IMGPP00.setBackgroundResource(0);
		IMGPP01.setBackgroundResource(0);
		IMGPP02.setBackgroundResource(0);
		IMGPP10.setBackgroundResource(0);
		IMGPP11.setBackgroundResource(0);
		IMGPP12.setBackgroundResource(0);
		IMGPP20.setBackgroundResource(0);
		IMGPP21.setBackgroundResource(0);
		IMGPP22.setBackgroundResource(0);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrisControlePP[i][j]=0;
			}
		}
	}
}
