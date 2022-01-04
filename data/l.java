// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;

// Referenced classes of package data:
//			g, k, p, w

public final class l
{

	public byte a_byte;
	public int a_int;
	public int b_int;
	public int c_int;
	public int d;
	public int e;
	public int f;
	public int g;
	public int h;
	public int a_int_array1d[];
	public int b_int_array1d[];
	public int c_int_array1d[];
	public int i;
	public int j;
	public long a_long;
	public long b_long;
	public int k;
	public int l;
	public boolean a_boolean;
	public boolean b_boolean;
	public int m;
	private Random a_java_util_Random;
	private p a_data_p;

	public l(p p1, byte byte0, int i1, int j1, int k1, int l1, int i2, 
			int ai[], int ai1[], int ai2[])
	{
		a_int_array1d = new int[2];
		b_int_array1d = new int[2];
		c_int_array1d = new int[2];
		a_boolean = true;
		b_boolean = true;
		a_java_util_Random = new Random();
		a_data_p = p1;
		a_byte = byte0;
		a_int = i1;
		b_int = j1;
		c_int = i1;
		d = j1;
		e = p1.M >> 1;
		f = p1.M >> 1;
		g = k1;
		switch (l1)
		{
		case 1: // '\001'
			h = p1.aj / 6;
			break;

		case 2: // '\002'
			h = p1.aj / 5;
			break;

		case 3: // '\003'
			h = p1.aj / 4;
			break;

		case 4: // '\004'
			h = p1.aj / 3;
			break;

		case 5: // '\005'
			h = p1.aj / 2;
			break;
		}
		j = i2;
		a_int_array1d = ai;
		b_int_array1d = ai1;
		c_int_array1d = ai2;
		i = 0;
		a_long = 0L;
		b();
		m = 0;
	}

	public final void a()
	{
		switch (m)
		{
		default:
			break;

		case 0: // '\0'
			if (a_boolean)
				if (k > 0)
				{
					if (e < a_data_p.M - h)
					{
						k -= h;
						e += h;
					} else
					{
						a_boolean = a_data_p.a_data_g.a(d * 180 + c_int + 1, 1) && a_data_p.a_data_g.e(d * 180 + c_int + 1, 1) && a_data_p.a_data_g.d(d * 180 + c_int + 1, 1) && a_data_p.a_data_g.c(d * 180 + c_int + 1, 1) && (c_int + 1 != a_data_p.Z || d != a_data_p.aa);
						if (a_boolean)
						{
							k -= h;
							e = (e + h) - a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							c_int++;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (k <= 0)
						a_boolean = false;
				} else
				{
					if (e > 0)
					{
						k += h;
						e -= h;
					} else
					{
						a_boolean = a_data_p.a_data_g.a((d * 180 + c_int) - 1, 0) && a_data_p.a_data_g.e((d * 180 + c_int) - 1, 0) && a_data_p.a_data_g.d((d * 180 + c_int) - 1, 0) && a_data_p.a_data_g.c((d * 180 + c_int) - 1, 0) && (c_int - 1 != a_data_p.Z || d != a_data_p.aa);
						if (a_boolean)
						{
							k += h;
							e = (e - h) + a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							c_int--;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (k > 0)
						a_boolean = false;
				}
			if (b_boolean)
				if (l > 0)
				{
					if (f < a_data_p.M - h)
					{
						l -= h;
						f += h;
					} else
					{
						b_boolean = a_data_p.a_data_g.a(d * 180 + c_int + 180, 3) && a_data_p.a_data_g.e(d * 180 + c_int + 180, 3) && a_data_p.a_data_g.d(d * 180 + c_int + 180, 3) && a_data_p.a_data_g.c(d * 180 + c_int + 180, 3) && (c_int != a_data_p.Z || d + 1 != a_data_p.aa);
						if (b_boolean)
						{
							l -= h;
							f = (f + h) - a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							d++;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (l <= 0)
						b_boolean = false;
				} else
				{
					if (f > 0)
					{
						l += h;
						f -= h;
					} else
					{
						b_boolean = a_data_p.a_data_g.a((d * 180 + c_int) - 180, 2) && a_data_p.a_data_g.e((d * 180 + c_int) - 180, 2) && a_data_p.a_data_g.d((d * 180 + c_int) - 180, 2) && a_data_p.a_data_g.c((d * 180 + c_int) - 180, 2) && (c_int != a_data_p.Z || d - 1 != a_data_p.aa);
						if (b_boolean)
						{
							l += h;
							f = (f - h) + a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							d--;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (l > 0)
						b_boolean = false;
				}
			int i1;
			if (!a_boolean && !b_boolean)
				if ((i1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
				{
					if (a_byte != 48 || a_data_p.k[d * 180 + c_int] != a_data_p.e[4])
					{
						b_long = (j + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
						a_long = 0L;
						m = 1;
					} else
					{
						b();
						a_boolean = true;
						b_boolean = true;
					}
				} else
				{
					b();
					a_boolean = true;
					b_boolean = true;
				}
			break;

		case 1: // '\001'
			if (a_long <= b_long)
				break;
			int j1;
			if ((j1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
			{
				b_long = (j + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
			} else
			{
				b();
				a_boolean = true;
				b_boolean = true;
				m = 0;
			}
			break;
		}
		a_long += a_data_p.f;
	}

	public final void a(int i1, int j1)
	{
		switch (m)
		{
		case 0: // '\0'
			if (a_data_p.k[d * 180 + c_int] != a_data_p.e[4])
				a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (k > 0 && a_boolean || k <= 0 && !a_boolean)
			{
				if (i < 2)
					a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			if (i < 2)
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;

		case 1: // '\001'
			if (a_data_p.k[d * 180 + c_int] != a_data_p.e[4])
				a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (i < 2)
				a_data_p.a_data_w.a(a_data_p.a(), c_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(a_data_p.a(), c_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;
		}
		if (a_data_p.k[d * 180 + c_int] == a_data_p.e[4])
			if (i < 2)
				a_data_p.a_data_w.a(a_data_p.a(), 0x90002, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(a_data_p.a(), 0x90006, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
		if (++i == 4)
			i = 0;
	}

	public final void b()
	{
		if (Math.abs(a_int - c_int) < g)
		{
			k = Math.abs(a_java_util_Random.nextInt()) % (2 * a_data_p.M * Math.abs(g - Math.abs(a_int - c_int))) - a_data_p.M * Math.abs(g - Math.abs(a_int - c_int));
		} else
		{
			k = Math.abs(a_java_util_Random.nextInt()) % (a_data_p.M * g);
			if (c_int > a_int)
				k = -k;
		}
		if (Math.abs(b_int - d) < g)
		{
			l = Math.abs(a_java_util_Random.nextInt()) % (2 * a_data_p.M * Math.abs(g - Math.abs(b_int - d))) - a_data_p.M * Math.abs(g - Math.abs(b_int - d));
			return;
		}
		l = Math.abs(a_java_util_Random.nextInt()) % (a_data_p.M * g);
		if (d > b_int)
			l = -l;
	}
}
