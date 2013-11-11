package com.example.tareagalileo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	//Declaracion de los botones
	Button btnSearch;
	Button btnOpenActivity;
	
	public static final String TAG = MainActivity.class.toString();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Inicializacion de los botones
		btnSearch = (Button) findViewById(R.id.btnSearch);
		btnOpenActivity = (Button) findViewById(R.id.btnOpenActivity);
	
		//Especificar el listener
		ButtonListener listener = new ButtonListener();
		btnSearch.setOnClickListener(listener);
		btnOpenActivity.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//Implementar Listeners para especificar que va a pasar cuando se presionan
	
	class ButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Log.i(TAG, "Clicked");
			Toast.makeText(getApplicationContext(), "cliked", Toast.LENGTH_SHORT);

			
		}
		
	}

}
