package com.br.ufba.sistemadeponto;

import java.net.Socket;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.os.Build;

public class Main extends Activity {
	
	
	private EditText etLOGIN;
	private EditText etSENHA;
	private ImageButton btCONFIRMA;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        etLOGIN = (EditText)findViewById(R.id.etLogin);
        etSENHA = (EditText)findViewById(R.id.etSenha);
        btCONFIRMA = (ImageButton)findViewById(R.id.btConfirma);
        
        btCONFIRMA.setOnClickListener(new View.OnClickListener(){
        	
        	@Override
        	public void onClick(View v){
        		
        		chamaTela02();       		
        		//setContentView(R.layout.tela2batida);
        	
        	}
        	
        });
        
    }
    
    private void chamaTela02 (){
    	
    	Intent intent = new Intent(this, Tela2Batida.class);
		startActivity(intent);
    	
    }
    
}