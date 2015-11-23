package com.example.jogodavelha;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Tela_1Jogador extends Activity {
	int matrisControlePC [][]= new int[3][3];
	int VC = 1;
	int PC = 2;
	int controledojogoPC;
	LinearLayout PC00,PC01,PC02,PC10,PC11,PC12,PC20,PC21,PC22;
	ImageView IMGPC00,IMGPC01,IMGPC02,IMGPC10,IMGPC11,IMGPC12,IMGPC20,IMGPC21,IMGPC22;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_1_jogador);

		PC00 = (LinearLayout) findViewById(R.id.PC00);
		IMGPC00 = (ImageView) findViewById(R.id.imageViewPC00);
		PC00.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				PC00.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC00.setBackgroundResource(R.drawable.o);
				PC00.setEnabled(false);
				matrisControlePC[0][0] = 1;
				verificaVencedor(VC);
			}
		});

		PC01 = (LinearLayout) findViewById(R.id.PC01);
		IMGPC01 = (ImageView) findViewById(R.id.imageViewPC01);
		PC01.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				PC01.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC01.setBackgroundResource(R.drawable.o);
				PC01.setEnabled(false);
				matrisControlePC[0][1] = 1;
				verificaVencedor(VC);

			}
		});
		PC02 = (LinearLayout) findViewById(R.id.PC02);
		IMGPC02= (ImageView)findViewById(R.id.imageViewPC02);
		PC02.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PC02.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC02.setBackgroundResource(R.drawable.o);
				PC02.setEnabled(false);
				matrisControlePC[0][2] = 1;
				verificaVencedor(VC);

			}
		});
		PC10 = (LinearLayout) findViewById(R.id.PC10);
		IMGPC10 = (ImageView) findViewById(R.id.imageViewPC10);
		PC10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PC10.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC10.setBackgroundResource(R.drawable.o);
				PC10.setEnabled(false);
				matrisControlePC[1][0] = 1;
				verificaVencedor(VC);

			}
		});
		PC11 = (LinearLayout) findViewById(R.id.PC11);
		IMGPC11 = (ImageView) findViewById(R.id.imageViewPC11);
		PC11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PC11.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC11.setBackgroundResource(R.drawable.o);
				PC11.setEnabled(false);
				matrisControlePC[1][1] = 1;
				verificaVencedor(VC);

			}
		});
		PC12 = (LinearLayout) findViewById(R.id.PC12);
		IMGPC12 = (ImageView) findViewById(R.id.imageViewPC12);
		PC12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PC12.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC12.setBackgroundResource(R.drawable.o);
				PC12.setEnabled(false);
				matrisControlePC[1][2] = 1;
				verificaVencedor(VC);

			}
		});
		PC20 = (LinearLayout) findViewById(R.id.PC20);
		IMGPC20 = (ImageView) findViewById(R.id.imageViewPC20);
		PC20.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				PC20.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC20.setBackgroundResource(R.drawable.o);
				PC20.setEnabled(false);
				matrisControlePC[2][0] = 1;
				verificaVencedor(VC);

			}
		});
		PC21 = (LinearLayout) findViewById(R.id.PC21);
		IMGPC21 = (ImageView) findViewById(R.id.imageViewPC21);
		PC21.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PC21.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC21.setBackgroundResource(R.drawable.o);
				PC21.setEnabled(false);
				matrisControlePC[2][1] = 1;
				verificaVencedor(VC);

			}
		});
		PC22 = (LinearLayout) findViewById(R.id.PC22);
		IMGPC22 = (ImageView) findViewById(R.id.imageViewPC22);
		PC22.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				PC22.setBackgroundColor(getResources().getColor(R.color.verde));
				IMGPC22.setBackgroundResource(R.drawable.o);
				PC22.setEnabled(false);
				matrisControlePC[2][2] = 1;
				verificaVencedor(VC);

			}
		});
		Button voltar = (Button) findViewById(R.id.voltarPC);
		voltar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_1Jogador.this);
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

		Button limpar = (Button) findViewById(R.id.LimparPC);
		limpar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_1Jogador.this);
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
		Log.i(P+"Jogada", controledojogoPC+"");
		if (matrisControlePC[0][0] == P && matrisControlePC[0][1] == P && matrisControlePC[0][2] == P) {
			mensagem(P);
		}else if (matrisControlePC[1][0] == P && matrisControlePC[1][1] == P && matrisControlePC[1][2] == P) {
			mensagem(P);
		}else if (matrisControlePC[2][0] == P && matrisControlePC[2][1] == P && matrisControlePC[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePC[0][0] == P && matrisControlePC[1][0] == P && matrisControlePC[2][0] == P) {
			mensagem(P);
		}else if (matrisControlePC[0][1] == P && matrisControlePC[1][1] == P && matrisControlePC[2][1] == P) {
			mensagem(P);
		}else if (matrisControlePC[0][2] == P && matrisControlePC[1][2] == P && matrisControlePC[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePC[0][0] == P && matrisControlePC[1][1] == P && matrisControlePC[2][2] == P) {
			mensagem(P);
		}else if (matrisControlePC[0][2] == P && matrisControlePC[1][1] == P && matrisControlePC[2][0] == P) {
			mensagem(P);
		}else if (controledojogoPC == 8) {
			mensagem(3);
		}else if (controledojogoPC % 2==0){
			if (controledojogoPC <=8) {
				inteligencia();
			}
			controledojogoPC++;
		}
	}
	public void inteligencia (){

		if(matrisControlePC[0][0] == 2 && matrisControlePC[0][1] == 2 && matrisControlePC[0][2]==0){
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 2 && matrisControlePC[0][2] == 2 && matrisControlePC[0][1]==0) {
			PC01.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC01.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC01.setEnabled(false);
			matrisControlePC[0][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 2 && matrisControlePC[0][2] == 2 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 2 && matrisControlePC[1][1] == 2 && matrisControlePC[1][2]==0) {					
			PC12.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC12.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC12.setEnabled(false);
			matrisControlePC[1][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 2 && matrisControlePC[1][2] == 2 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 2 && matrisControlePC[1][2] == 2 && matrisControlePC[1][0]==0) {
			PC10.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC10.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC10.setEnabled(false);
			matrisControlePC[1][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[2][0] == 2 && matrisControlePC[2][1] == 2 && matrisControlePC[2][2]==0) {				
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[2][0] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[2][1]==0) {					
			PC21.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC21.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC21.setEnabled(false);
			matrisControlePC[2][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[2][1] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 2 && matrisControlePC[1][1] == 2 && matrisControlePC[2][2]==0) {				
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 2 && matrisControlePC[1][1] == 2 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 2 && matrisControlePC[2][0] == 2 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 2 && matrisControlePC[2][0] == 2 && matrisControlePC[0][2]==0) {
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 2 && matrisControlePC[1][0] == 2 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 2 && matrisControlePC[2][0] == 2 && matrisControlePC[1][0]==0) {
			PC10.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC10.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC10.setEnabled(false);
			matrisControlePC[1][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 2 && matrisControlePC[2][0] == 2 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 2 && matrisControlePC[1][1] == 2 && matrisControlePC[2][1]==0) {				
			PC21.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC21.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC21.setEnabled(false);
			matrisControlePC[2][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 2 && matrisControlePC[2][1] == 2 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 2 && matrisControlePC[2][1] == 2 && matrisControlePC[0][1]==0) {
			PC01.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC01.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC01.setEnabled(false);
			matrisControlePC[0][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 2 && matrisControlePC[1][2] == 2 && matrisControlePC[2][2]==0) { 					
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[1][2]==0) { 					
			PC12.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC12.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC12.setEnabled(false);
			matrisControlePC[1][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][2] == 2 && matrisControlePC[2][2] == 2 && matrisControlePC[0][2]==0) {
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);

		}else if(matrisControlePC[0][0] == 1 && matrisControlePC[0][1] == 1 && matrisControlePC[0][2]==0){
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);

		}else if (matrisControlePC[0][0] == 1 && matrisControlePC[0][2] == 1 && matrisControlePC[0][1]==0) {
			PC01.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC01.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC01.setEnabled(false);
			matrisControlePC[0][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 1 && matrisControlePC[0][2] == 1 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 1 && matrisControlePC[1][1] == 1 && matrisControlePC[1][2]==0) {			
			PC12.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC12.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC12.setEnabled(false);
			matrisControlePC[1][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 1 && matrisControlePC[1][2] == 1 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 1 && matrisControlePC[1][2] == 1 && matrisControlePC[1][0]==0) {
			PC10.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC10.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC10.setEnabled(false);
			matrisControlePC[1][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[2][0] == 1 && matrisControlePC[2][1] == 1 && matrisControlePC[2][2]==0) {				
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[2][0] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[2][1]==0) {				
			PC21.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC21.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC21.setEnabled(false);
			matrisControlePC[2][1] = 2;
			verificaVencedor(PC);
	}else if (matrisControlePC[2][1] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 1 && matrisControlePC[1][1] == 1 && matrisControlePC[2][2]==0) {				
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 1 && matrisControlePC[1][1] == 1 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 1 && matrisControlePC[2][0] == 1 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 1 && matrisControlePC[2][0] == 1 && matrisControlePC[0][2]==0) {
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 1 && matrisControlePC[1][0] == 1 && matrisControlePC[2][0]==0) {
			PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC20.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC20.setEnabled(false);
			matrisControlePC[2][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][0] == 1 && matrisControlePC[2][0] == 1 && matrisControlePC[1][0]==0) {
			PC10.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC10.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC10.setEnabled(false);
			matrisControlePC[1][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][0] == 1 && matrisControlePC[2][0] == 1 && matrisControlePC[0][0]==0) {
			PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC00.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC00.setEnabled(false);
			matrisControlePC[0][0] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 1 && matrisControlePC[1][1] == 1 && matrisControlePC[2][1]==0) {			
			PC21.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC21.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC21.setEnabled(false);
			matrisControlePC[2][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][1] == 1 && matrisControlePC[2][1] == 1 && matrisControlePC[1][1]==0) {
			PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC11.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC11.setEnabled(false);
			matrisControlePC[1][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][1] == 1 && matrisControlePC[2][1] == 1 && matrisControlePC[0][1]==0) { 
			PC01.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC01.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC01.setEnabled(false);
			matrisControlePC[0][1] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 1 && matrisControlePC[1][2] == 1 && matrisControlePC[2][2]==0) {			
			PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC22.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC22.setEnabled(false);
			matrisControlePC[2][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[0][2] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[1][2]==0) {			
			PC12.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC12.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC12.setEnabled(false);
			matrisControlePC[1][2] = 2;
			verificaVencedor(PC);
		}else if (matrisControlePC[1][2] == 1 && matrisControlePC[2][2] == 1 && matrisControlePC[0][2]==0) {
			PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
			IMGPC02.setBackgroundResource(R.drawable.x);
			controledojogoPC++;
			PC02.setEnabled(false);
			matrisControlePC[0][2] = 2;
			verificaVencedor(PC);

		}else{
			Random geradordejogada = new Random();
			if(controledojogoPC<8){
				while (true) {
					Log.i("contador", controledojogoPC+"");
					int n1 = geradordejogada.nextInt(3);
					int n2 = geradordejogada.nextInt(3);
					if (matrisControlePC[n1][n2]==0) {
						if (n1 == 0) {
							if (n2 == 0) {
								PC00.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC00.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC00.setEnabled(false);
								matrisControlePC[0][0] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 1){
								PC01.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC01.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC01.setEnabled(false);
								matrisControlePC[0][1] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 2) {
								PC02.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC02.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC02.setEnabled(false);
								matrisControlePC[0][2] = 2;
								verificaVencedor(PC);
								break;
							}
						}else if (n1 == 1) {
							if (n2 == 0) {
								PC10.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC10.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC10.setEnabled(false);
								matrisControlePC[1][0] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 1){
								PC11.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC11.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC11.setEnabled(false);
								matrisControlePC[1][1] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 2) {
								PC12.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC12.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC12.setEnabled(false);
								matrisControlePC[1][2] = 2;
								verificaVencedor(PC);
								break;
							}
						}else if (n1 == 2) {
							if (n2 == 0) {
								PC20.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC20.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC20.setEnabled(false);
								matrisControlePC[2][0] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 1){
								PC21.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC21.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC21.setEnabled(false);
								matrisControlePC[2][1] = 2;
								verificaVencedor(PC);
								break;
							}else if (n2 == 2) {
								PC22.setBackgroundColor(getResources().getColor(R.color.vermelho));
								IMGPC22.setBackgroundResource(R.drawable.x);
								controledojogoPC++;
								PC22.setEnabled(false);
								matrisControlePC[2][2] = 2;
								verificaVencedor(PC);
								break;
							}
						}
					}
				}
			}
		}
	}
	public void mensagem (int P){

		AlertDialog.Builder mBox = new AlertDialog.Builder(Tela_1Jogador.this);
		if (P==1) {
			mBox.setTitle("Parabéns! Você ganhou");
		}else if(P==2){
			mBox.setTitle("Poxa, você perdeu");
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
		controledojogoPC=0;
		PC00.setBackgroundColor(getResources().getColor(R.color.branco));
		PC00.setEnabled(true);
		PC01.setBackgroundColor(getResources().getColor(R.color.branco));
		PC01.setEnabled(true);
		PC02.setBackgroundColor(getResources().getColor(R.color.branco));
		PC02.setEnabled(true);
		PC10.setBackgroundColor(getResources().getColor(R.color.branco));
		PC10.setEnabled(true);
		PC11.setBackgroundColor(getResources().getColor(R.color.branco));
		PC11.setEnabled(true);
		PC12.setBackgroundColor(getResources().getColor(R.color.branco));
		PC12.setEnabled(true);
		PC20.setBackgroundColor(getResources().getColor(R.color.branco));
		PC20.setEnabled(true);
		PC21.setBackgroundColor(getResources().getColor(R.color.branco));
		PC21.setEnabled(true);
		PC22.setBackgroundColor(getResources().getColor(R.color.branco));
		PC22.setEnabled(true);
		IMGPC00.setBackgroundResource(0);
		IMGPC01.setBackgroundResource(0);
		IMGPC02.setBackgroundResource(0);
		IMGPC10.setBackgroundResource(0);
		IMGPC11.setBackgroundResource(0);
		IMGPC12.setBackgroundResource(0);
		IMGPC20.setBackgroundResource(0);
		IMGPC21.setBackgroundResource(0);
		IMGPC22.setBackgroundResource(0);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrisControlePC[i][j]=0;
			}
		}
	}
}
