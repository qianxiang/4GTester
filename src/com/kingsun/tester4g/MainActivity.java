package com.kingsun.tester4g;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView textV = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textV = (TextView) findViewById(R.id.textView2);

		WebView webV = (WebView) findViewById(R.id.webView1);
		// webV.getSettings().

		webV.getSettings().setJavaScriptEnabled(false);
		Toast.makeText(this, "Oh Start! " , Toast.LENGTH_SHORT).show();
		
		webV.loadUrl("http://www.baidu.com");
		
		// 很奇怪，如果访问g.cn 那么就会弹出新的页面，而访问别的地址，就能在原始页面的下面显示。
		//webV.loadUrl("http://g.cn");
		
		Toast.makeText(this, "Done! ", Toast.LENGTH_SHORT).show();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onPageFinished(WebView view, String url) {

		textV.setText("Open Page.");
	}

	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		textV.setText("Open Page Success.");
	}
}
