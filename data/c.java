// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;


// Referenced classes of package data:
//			p

public final class c
{

	private p a_data_p;
	private int a_int;
	private int b_int;
	private int c;
	public int a_int_array1d[] = {
		0x60006, 0x60007
	};
	public int b_int_array1d[] = {
		0x60004, 0x60005
	};

	public c(p p1)
	{
		a_int = 0;
		b_int = 0;
		c = 0;
		a_data_p = p1;
	}

	public final void a()
	{
		if (a_data_p.i > 400L)
		{
			if (a_int == 3)
				a_int = 0;
			else
				a_int = a_int + 1;
			a_data_p.i = 0L;
		}
		switch (a_int)
		{
		case 0: // '\0'
			a_data_p.o[4] = 0xb0000;
			a_data_p.o[5] = 0xb0001;
			a_data_p.o[6] = 0xb0002;
			a_data_p.o[16] = 0xb0003;
			a_data_p.o[17] = 0xb0004;
			a_data_p.o[18] = 0xb0005;
			a_data_p.o[19] = 0xb0006;
			a_data_p.o[20] = 0xb0007;
			a_data_p.o[21] = 0xb0008;
			return;

		case 1: // '\001'
			a_data_p.o[4] = 0xb0001;
			a_data_p.o[5] = 0xb0002;
			a_data_p.o[6] = 0xb0001;
			a_data_p.o[16] = 0xb0004;
			a_data_p.o[17] = 0xb0005;
			a_data_p.o[18] = 0xb0004;
			a_data_p.o[19] = 0xb0007;
			a_data_p.o[20] = 0xb0008;
			a_data_p.o[21] = 0xb0007;
			return;

		case 2: // '\002'
			a_data_p.o[4] = 0xb0002;
			a_data_p.o[5] = 0xb0001;
			a_data_p.o[6] = 0xb0000;
			a_data_p.o[16] = 0xb0005;
			a_data_p.o[17] = 0xb0004;
			a_data_p.o[18] = 0xb0003;
			a_data_p.o[19] = 0xb0008;
			a_data_p.o[20] = 0xb0007;
			a_data_p.o[21] = 0xb0006;
			return;

		case 3: // '\003'
			a_data_p.o[4] = 0xb0001;
			a_data_p.o[5] = 0xb0000;
			a_data_p.o[6] = 0xb0001;
			a_data_p.o[16] = 0xb0004;
			a_data_p.o[17] = 0xb0003;
			a_data_p.o[18] = 0xb0004;
			a_data_p.o[19] = 0xb0007;
			a_data_p.o[20] = 0xb0006;
			a_data_p.o[21] = 0xb0007;
			break;
		}
	}

	public final void b()
	{
		if (a_data_p.h > 100L)
		{
			if (b_int == 1)
				b_int = 0;
			else
				b_int = b_int + 1;
			a_data_p.h = 0L;
		}
		switch (b_int)
		{
		case 0: // '\0'
			a_data_p.f[16] = 0xd0000;
			return;

		case 1: // '\001'
			a_data_p.f[16] = 0xd0001;
			break;
		}
	}

	public final void c()
	{
		if (a_data_p.w > 300L)
		{
			if (c == 1)
				c = 0;
			else
				c = c + 1;
			a_data_p.w = 0L;
		}
		switch (c)
		{
		case 0: // '\0'
			a_int_array1d[0] = 0x60006;
			b_int_array1d[0] = 0x60004;
			return;

		case 1: // '\001'
			a_int_array1d[0] = 0x60007;
			b_int_array1d[0] = 0x60005;
			break;
		}
	}
}
