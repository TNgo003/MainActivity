package com.firebase.androidchat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LanguageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_language);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.language, menu);
		return true;
	}

}
