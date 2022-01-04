// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package com.mobiledistillery.celsius;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public abstract class CelsiusMIDlet extends MIDlet
{

	public CelsiusMIDlet()
	{
		Display.getDisplay(this);
	}

	public void startApp()
	{
	}

	public void pauseApp()
	{
	}

	public void destroyApp(boolean flag)
	{
		notifyDestroyed();
	}
}
