package com.hello.hello;
import android.app.*;
import android.view.*;
import android.text.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;

public class FirstActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1 = (Button)findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v)
				{
					Toast.makeText(FirstActivity.this, "hello", Toast.LENGTH_SHORT).show();
					// TODO: Implement this method
				}
			}
		);
	}

	@Override
	public boolean onCreatePanelMenu(int featureId, Menu menu)
	{
		// TODO: Implement this method
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		switch(item.getItemId()){
			case R.id.about:
				Toast.makeText(this, "fantasytown的练手", Toast.LENGTH_SHORT).show();
				break;		
			case R.id.quit:
				Toast.makeText(this,"直接返回即可,拜拜~",Toast.LENGTH_SHORT).show();
				finish();
				break;
			default:
		}
		return true;
	}
	
}
