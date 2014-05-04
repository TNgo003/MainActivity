package com.firebase.androidchat;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FeedActivity extends FragmentActivity {
	PagerAdapter pageAdapter;
	ViewPager vPager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed);
		//This is a change in the coding 
		
		pageAdapter = new PagerAdapter(getSupportFragmentManager());
		vPager = (ViewPager) findViewById(R.id.pager);
		vPager.setAdapter(pageAdapter);
	}
	public class PagerAdapter extends FragmentStatePagerAdapter
	{
		public PagerAdapter(FragmentManager fm)
		{
			super(fm);
		}
		public Fragment getItem(int i)
		{
			Fragment fragment = new DemoFragmentObject();
			Bundle args = new Bundle();
			args.putInt(DemoFragmentObject.ARG_OBJECT, i+1);
			fragment.setArguments(args);
			return fragment;
		}

	    @Override
	    public int getCount() {
	        return 100;
	    }

	    @Override
	    public CharSequence getPageTitle(int position) {
	        return "OBJECT " + (position + 1);
	    }
	}
	public static class DemoFragmentObject extends Fragment
	{
		public static final String ARG_OBJECT = "object";
		
		public View onCreate (LayoutInflater inflater, ViewGroup container,
							  Bundle savedInstanceState)
		{
			View rootView = inflater.inflate(R.layout.fragment_collection_object, container, false);
	        Bundle args = getArguments();
	        TextView tv = ((TextView)rootView.findViewById(android.R.id.text1));
	        tv.setText(Integer.toString(args.getInt(ARG_OBJECT)));
	        return rootView;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feed, menu);
		return true;
	}

}
