package com.example.kaveri;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity46 extends Activity
{
	TextView tv1,tv2,tv3,tv4;
	ImageView iv;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	 {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.orderdes1);
	        tv1=(TextView)findViewById(R.id.textView2);
	        tv2=(TextView)findViewById(R.id.textView4);
	        tv3=(TextView)findViewById(R.id.textView6);
	        tv4=(TextView)findViewById(R.id.textView3);
	        iv=(ImageView)findViewById(R.id.imageView1);
	        Bundle b=getIntent().getExtras();
	        String name="Name :"+b.getString("name");
	        String prod="Product :"+b.getString("prod");
	        int amt=b.getInt("amt");
	        String result=Integer.toString(amt);
	        String amount=("Total Rs.:"+result);
	        String addr="Address :"+b.getString("addr");
	        int pic=b.getInt("image");
	        iv.setImageResource(pic);
	        tv1.setText(name);
	        tv2.setText(amount);
	        tv3.setText(addr); 
	        tv4.setText(prod);
	        
	 }
}
