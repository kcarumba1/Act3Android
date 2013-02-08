package android.act3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class DisplayImage extends Activity{
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 Intent intent = getIntent();
		 String url= intent.getStringExtra("url");
		 Toast.makeText(getApplicationContext(), url, Toast.LENGTH_SHORT).show();
		 setContentView(R.layout.image_layout);
		 new ImageLoader((ImageView) findViewById(R.id.imageView1))
	        .execute(url);
	 }
}
