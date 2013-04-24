package com.example.sobrelayouts;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LayoutsActivity extends Activity {
	int cont=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
			
		
		Button btnSum = (Button) findViewById(R.id.btnDer);//boton derecha
		Button btnMenos=(Button) findViewById(R.id.btnIzq);//boton izquierda
		
		btnSum.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				cont++;
				EditText textoL= (EditText) findViewById(R.id.editText2);
				EditText textoT= (EditText) findViewById(R.id.editText3);
				EditText textoR= (EditText) findViewById(R.id.editText1);
				
				View imgR=findViewById(R.id.imageView2);
				View imgL=findViewById(R.id.imageView1);
				View imgT=findViewById(R.id.imageView3);
								
				if(cont==1){
					textoR.setVisibility(View.VISIBLE);	
					imgR.setVisibility(View.VISIBLE);
				}else if(textoR.getVisibility()==View.VISIBLE){
					textoR.setVisibility(View.INVISIBLE);
					imgR.setVisibility(View.INVISIBLE);
					textoL.setVisibility(View.VISIBLE);
					imgL.setVisibility(View.VISIBLE);				
				}else if(textoL.getVisibility()==View.VISIBLE){
					textoL.setVisibility(View.INVISIBLE);
					imgL.setVisibility(View.INVISIBLE);
					textoT.setVisibility(View.VISIBLE);
					imgT.setVisibility(View.VISIBLE);
				}
				else if(textoT.getVisibility()==View.VISIBLE){
					textoT.setVisibility(View.INVISIBLE);
					imgT.setVisibility(View.INVISIBLE);
					textoR.setVisibility(View.VISIBLE);
					imgR.setVisibility(View.VISIBLE);
				}
			}
		});
			
		btnMenos.setOnClickListener(new View.OnClickListener() {
			//int cont=0;
			public void onClick(View view) {
				cont++;
				EditText textoL= (EditText) findViewById(R.id.editText2);
				EditText textoT= (EditText) findViewById(R.id.editText3);
				EditText textoR= (EditText) findViewById(R.id.editText1);
				
				View imgR=findViewById(R.id.imageView2);
				View imgL=findViewById(R.id.imageView1);
				View imgT=findViewById(R.id.imageView3);
				
				
				if(textoT.getVisibility()==View.VISIBLE){
				textoT.setVisibility(View.INVISIBLE);
				imgT.setVisibility(View.INVISIBLE);
				textoL.setVisibility(View.VISIBLE);	
				imgL.setVisibility(View.VISIBLE);
				
				
				}else if(textoL.getVisibility()==View.VISIBLE){
				textoL.setVisibility(View.INVISIBLE);
				imgL.setVisibility(View.INVISIBLE);
				textoR.setVisibility(View.VISIBLE);
				imgR.setVisibility(View.VISIBLE);
				
				}else if(textoR.getVisibility()==View.VISIBLE){
					textoR.setVisibility(View.INVISIBLE);
					imgR.setVisibility(View.INVISIBLE);
					textoT.setVisibility(View.VISIBLE);
					imgT.setVisibility(View.VISIBLE);
				}		
			}
		});
			
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
