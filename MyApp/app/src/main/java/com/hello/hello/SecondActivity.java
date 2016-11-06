package com.hello.hello;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.content.*;
import android.widget.*;

public class SecondActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button2 = (Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v)
				{
					// TODO: Implement this method
					Intent intent = new Intent();
					intent.putExtra("data", "Hello FirstActivity");
					setResult(RESULT_OK, intent);
					finish();
				}
			}
		);
	}
}
