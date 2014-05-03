package com.firebase.androidchat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class SignUpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
		findViewById(R.id.cancel_button).setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
		findViewById(R.id.next_button).setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_up, menu);
		return true;
	}

}
