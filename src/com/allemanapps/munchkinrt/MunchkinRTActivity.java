package com.allemanapps.munchkinrt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MunchkinRTActivity extends Activity {
	TextView mLevel;
	Button mPlus, mMinus;
	User user;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_munchkin_rt);
		user = new User();
		mPlus = (Button) findViewById(R.id.plus);
		mMinus = (Button) findViewById(R.id.minus);
		mLevel = (TextView) findViewById(R.id.level);
		mPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				user.lvlup();
				mLevel.setText(Integer.toString(user.getLevel()));
			}
		});
		mMinus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				user.lvldown();
				mLevel.setText(Integer.toString(user.getLevel()));
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.munchkin_rt, menu);
		return true;
	}

}
