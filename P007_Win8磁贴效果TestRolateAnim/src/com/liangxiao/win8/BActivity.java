package com.liangxiao.win8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import com.liangxiao.windows.R;

public class BActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmain);
	}

	/*
	 * back¼ü·µ»Ø²¿·Ö
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			Intent intent = new Intent();
			intent.setClass(BActivity.this, Tiaozai__MainActivity.class);
			BActivity.this.startActivity(intent);
			BActivity.this.finish();
		} else {
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
}
