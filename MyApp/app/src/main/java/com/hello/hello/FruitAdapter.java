package com.hello.hello;
import android.content.*;
import android.widget.*;
import java.util.*;
import android.view.*;

public class FruitAdapter extends ArrayAdapter<Fruit>
{
	private int resourceld;
	public FruitAdapter(Context context,int textViewResourceld,List<Fruit>objects){
		super(context,textViewResourceld,objects);
		resourceld = textViewResourceld;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		Fruit fruit = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceld,null);
		
		// TODO: Implement this method
		return super.getView(position, convertView, parent);
	}
	
}
