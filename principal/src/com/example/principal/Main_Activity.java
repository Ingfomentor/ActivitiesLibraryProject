package com.example.principal;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.sobrelayouts.LayoutsActivity;
public class Main_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    Button btnL=(Button) findViewById(R.id.btnpant);		
		
		btnL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {				
				Intent intent=new Intent(Main_Activity.this, LayoutsActivity.class); 
			    startActivity(intent);
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
