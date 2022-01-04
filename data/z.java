// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.PrintStream;

public final class z extends Exception
{

	public z()
	{
		System.out.println("CelsiusException: " + getMessage());
	}

	public z(String s)
	{
		super(s);
		System.out.println("CelsiusException: " + s);
	}
}
