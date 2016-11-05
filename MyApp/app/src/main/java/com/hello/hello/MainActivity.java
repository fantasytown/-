package com.hello.hello;

import android.app.*;
import android.os.*;
import android.util.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Log.d("hello","onCreate execute");
    }
}
