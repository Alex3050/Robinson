// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;

public final class o
{

	public static Random a = new Random();

	public o()
	{
	}

	public static final int a(int i)
	{
		try
		{
			return ((a.nextInt() << 1) >>> 1) % i;
		}
		catch (Exception )
		{
			return 0;
		}
	}

}
