package com.example.locationfindreapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Spleshscreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splesh);
		// Method one

		/****** Create Thread that will sleep for 2 seconds *************/
		Thread background = new Thread() {
			@Override
			public void run() {

				try {
					// Thread will sleep for 2 seconds
					sleep(2 * 1000);

					// After 2 seconds redirect to another intent
					Intent i = new Intent(getBaseContext(), Options.class);
					startActivity(i);

					// Remove activity
					// income need to be ADD in
					finish();

				} catch (Exception e) {

				}
			}
		};

		// start thread
		background.start();

	}

}
