package com.firebase.androidchat;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class FeedActivity extends FragmentActivity {
	//PagerAdapter pageAdapter;
	ViewPager vPager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed);
		//This is a change in the coding 
		
		//pageAdapter = new PagerAdapter(getSupportFragmentManager());
		//pagAdapter = (ViewPager) findViewById();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feed, menu);
		return true;
	}

}
