// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

// 启动/暂停app模块

package Robinson;

import com.mobiledistillery.celsius.CelsiusMIDlet;
import data.p;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MyMidlet extends CelsiusMIDlet
{

	private p a;

	public MyMidlet()
	{
		a = new p(this);
		(new Thread(a)).start();
	}

	public final void startApp()
	{
		Display.getDisplay(this).setCurrent(a);
	}

	public final void pauseApp()
	{
	}

	public final void destroyApp(boolean flag)
	{
		notifyDestroyed();
	}
}
