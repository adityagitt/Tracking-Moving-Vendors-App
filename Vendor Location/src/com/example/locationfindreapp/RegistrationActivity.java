package com.example.locationfindreapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ScrollView;

public class RegistrationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);
		ScrollView scrollable_contents = (ScrollView) findViewById(R.id.scrollableContents);
		getLayoutInflater().inflate(R.layout.registration_content,
				scrollable_contents);

	}

}
