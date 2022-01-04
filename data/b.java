// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.PrintStream;

public final class b extends RuntimeException
{

	public b(String s)
	{
		super(s);
		System.out.println("CelsiusUnsupportedOperationException: " + s);
	}
}
