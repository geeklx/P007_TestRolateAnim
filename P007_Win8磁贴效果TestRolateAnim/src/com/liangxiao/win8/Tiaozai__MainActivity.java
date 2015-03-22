package com.liangxiao.win8;

import com.liangxiao.windows.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class Tiaozai__MainActivity extends Activity {
	private long firstime = 0;

	MyImageViewWin8 joke;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		joke = (MyImageViewWin8) findViewById(R.id.c_joke);
		joke.setOnClickIntent(new MyImageViewWin8.OnViewClick() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				// Toast.makeText(Tiaozai__MainActivity.this, "浜嬩欢瑙﹀彂", 1000)
				// .show();
				System.out.println("1");
				Intent intent = new Intent(Tiaozai__MainActivity.this,
						BActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}

	/*
	 * back键部分
	 */
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

			long secondtime = System.currentTimeMillis();
			if (secondtime - firstime > 3000) {
				Toast.makeText(Tiaozai__MainActivity.this, "再按一次返回键退出",
						Toast.LENGTH_SHORT).show();
				firstime = System.currentTimeMillis();
				return true;
			} else {
				Tiaozai__MainActivity.this.finish();
				System.exit(0);
				android.os.Process.killProcess(android.os.Process.myPid());
			}
		}
		return super.onKeyDown(keyCode, event);
	}
}
