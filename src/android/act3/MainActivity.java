package android.act3;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity{
	ArrayAdapter<String> adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] images = new String[] {"http://ww1.prweb.com/prfiles/2010/05/11/1751474/gI_TodoforiPadAppIcon512.png.jpg",
        								"http://cdn4.iosnoops.com/wp-content/uploads/2011/08/Icon-Gmail_large-250x250.png",
        								"http://kelpbeds.files.wordpress.com/2012/02/lens17430451_1294953222linkedin-icon.jpg?w=450",
        								"http://snapknot.com/blog/wp-content/uploads/2010/03/facebook-icon-copy.jpg",
        								"https://lh3.googleusercontent.com/-ycDGy_fZVZc/AAAAAAAAAAI/AAAAAAAAAAc/Q0MmjxPCOzk/s250-c-k/photo.jpg"};
        adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, images);
        setListAdapter(adapter);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		//Intent intent;
		String getItemOnClickValue=(String) getListAdapter().getItem(position);
		Intent i=new Intent(this,DisplayImage.class);
		i.putExtra("url", getItemOnClickValue);
		startActivity(i);
		
	}
}
