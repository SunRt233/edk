package com.edk.Library;

import android.content.*;
import android.widget.*;

public class eToast
{
	public static final int LENGTH_LONG = Toast.LENGTH_LONG;
	public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
	/**
	 * 更好的Toast控件
	 * @param c activity参数
	 * @param msg 信息
	 */
	public static eToast makeText(Context c, String msg){
		
		Toast.makeText(c, msg, LENGTH_LONG).show();
		
		return null;
	}
}
