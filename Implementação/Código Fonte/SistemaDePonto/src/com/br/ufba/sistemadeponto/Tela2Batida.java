package com.br.ufba.sistemadeponto;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Tela2Batida extends Activity {

		private ImageButton btBATIDA;
		
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tela2batida);
	    
	        btBATIDA = (ImageButton)findViewById(R.id.btBatida);
	        
	        btBATIDA.setOnClickListener(new View.OnClickListener(){
	        	
	        	@Override
	        	public void onClick(View v){
	        		
	        		Toast.makeText(Tela2Batida.this, "BATIDA REALIZADA COM SUCESSO!", 2000).show();
	        			        	
	        	}
	        	
	        });
	        
	    }
	
	}
