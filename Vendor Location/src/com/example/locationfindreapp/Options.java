package com.example.locationfindreapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Options extends Activity implements OnClickListener {

	Button buyers_Button;
	Button sellers_Button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.button_buy_and_sell);
		buyers_Button = (Button) findViewById(R.id.buyersButton);
		sellers_Button = (Button) findViewById(R.id.sellerButton);
		// myButton();
		buyers_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent buy_product = new Intent(getApplicationContext(),
						BuyerMapActivity.class);
				startActivity(buy_product);

			}
		});

		sellers_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent buy_product = new Intent(getApplicationContext(),
						RegistrationActivity.class);
				startActivity(buy_product);

			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		Toast.makeText(getApplicationContext(), "Test MySubmitions",
				Toast.LENGTH_LONG).show();
	}

	/*
	 * private void myButton() { // TODO Auto-generated method stub
	 * sellers_Button.setOnClickListener(this);
	 * buyers_Button.setOnClickListener(this); }
	 */

	/*
	 * @Override public void onClick(View arg0) { // TODO Auto-generated method
	 * stub
	 * 
	 * Intent buy_product = new Intent(getApplicationContext(),
	 * BuyerMapActivity.class); startActivity(buy_product);
	 * 
	 * Intent sell_product = new Intent(getApplicationContext(),
	 * RegistrationActivity.class); startActivity(sell_product);
	 * 
	 * }
	 */
}
