package com.practice.dev.common.util;

import android.content.Context;
import android.widget.Toast;

/**
 * 一个单例吐司
 * Created by HY on 2017/4/18.
 */
public class ToastUtils {

	
	private static Toast toast;

	public static void showToast(Context context, String msg){
		if(toast == null){
			toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
		}
		toast.setText(msg);
		toast.show();
	}
	
}