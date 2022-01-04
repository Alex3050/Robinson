// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;

// Referenced classes of package data:
//			g, k, p, w

public final class u
{

	public byte a_byte;
	public int a_int;
	public int b_int;
	public int c_int;
	public int d_int;
	public int e_int;
	public int f;
	public int g;
	public int h;
	public int a_int_array1d[];
	public int b_int_array1d[];
	public int c_int_array1d[];
	public int d_int_array1d[];
	public int e_int_array1d[];
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

	public u(p p1, byte byte0, int i1, int j1, int k1, int l1, int i2, 
			int ai[], int ai1[], int ai2[], int ai3[], int ai4[])
	{
		a_int_array1d = new int[2];
		b_int_array1d = new int[2];
		c_int_array1d = new int[2];
		d_int_array1d = new int[2];
		e_int_array1d = new int[2];
		a_boolean = true;
		b_boolean = true;
		a_java_util_Random = new Random();
		a_data_p = p1;
		a_byte = byte0;
		a_int = i1;
		b_int = j1;
		c_int = i1;
		d_int = j1;
		e_int = p1.M >> 1;
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
		d_int_array1d = ai3;
		e_int_array1d = ai4;
		i = 0;
		a_long = 0L;
		b();
		m = 0;
	}

	public final void a()
	{
		if (m != 1 && Math.abs(c_int - a_data_p.Z) <= 2 && Math.abs(d_int - a_data_p.aa) <= 2)
		{
			if (c_int > a_data_p.Z)
			{
				if (((c_int - a_data_p.Z) + c_int) - a_int < g)
					k = (c_int - a_data_p.Z) * a_data_p.M;
				else
					k = ((a_int + g) - c_int) * a_data_p.M;
			} else
			if (((c_int - a_data_p.Z) + c_int) - a_int > -g)
				k = (c_int - a_data_p.Z) * a_data_p.M;
			else
				k = (a_int - g - c_int) * a_data_p.M;
			if (d_int > a_data_p.aa)
			{
				if (((d_int - a_data_p.aa) + d_int) - b_int < g)
					l = (d_int - a_data_p.aa) * a_data_p.M;
				else
					l = ((b_int + g) - d_int) * a_data_p.M;
			} else
			if (((d_int - a_data_p.aa) + d_int) - b_int > -g)
				l = (d_int - a_data_p.aa) * a_data_p.M;
			else
				l = (b_int - g - d_int) * a_data_p.M;
			a_boolean = true;
			b_boolean = true;
			b_long = (70 + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
			a_long = 0L;
			m = 1;
			a_data_p.l[d_int * 180 + c_int] = 0;
		}
		switch (m)
		{
		default:
			break;

		case 0: // '\0'
			if (a_boolean)
				if (k > 0)
				{
					if (e_int < a_data_p.M - h)
					{
						k -= h;
						e_int += h;
					} else
					{
						a_boolean = a_data_p.a_data_g.a(d_int * 180 + c_int + 1, 1) && a_data_p.a_data_g.e(d_int * 180 + c_int + 1, 1) && a_data_p.a_data_g.d(d_int * 180 + c_int + 1, 1) && a_data_p.a_data_g.c(d_int * 180 + c_int + 1, 1) && (c_int + 1 != a_data_p.Z || d_int != a_data_p.aa);
						if (a_boolean)
						{
							k -= h;
							e_int = (e_int + h) - a_data_p.M;
							a_data_p.l[d_int * 180 + c_int] = 0;
							c_int++;
							a_data_p.l[d_int * 180 + c_int] = a_byte;
						}
					}
					if (k <= 0)
						a_boolean = false;
				} else
				{
					if (e_int > 0)
					{
						k += h;
						e_int -= h;
					} else
					{
						a_boolean = a_data_p.a_data_g.a((d_int * 180 + c_int) - 1, 0) && a_data_p.a_data_g.e((d_int * 180 + c_int) - 1, 0) && a_data_p.a_data_g.d((d_int * 180 + c_int) - 1, 0) && a_data_p.a_data_g.c((d_int * 180 + c_int) - 1, 0) && (c_int - 1 != a_data_p.Z || d_int != a_data_p.aa);
						if (a_boolean)
						{
							k += h;
							e_int = (e_int - h) + a_data_p.M;
							a_data_p.l[d_int * 180 + c_int] = 0;
							c_int--;
							a_data_p.l[d_int * 180 + c_int] = a_byte;
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
						b_boolean = a_data_p.a_data_g.a(d_int * 180 + c_int + 180, 3) && a_data_p.a_data_g.e(d_int * 180 + c_int + 180, 3) && a_data_p.a_data_g.d(d_int * 180 + c_int + 180, 3) && a_data_p.a_data_g.c(d_int * 180 + c_int + 180, 3) && (c_int != a_data_p.Z || d_int + 1 != a_data_p.aa);
						if (b_boolean)
						{
							l -= h;
							f = (f + h) - a_data_p.M;
							a_data_p.l[d_int * 180 + c_int] = 0;
							d_int++;
							a_data_p.l[d_int * 180 + c_int] = a_byte;
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
						b_boolean = a_data_p.a_data_g.a((d_int * 180 + c_int) - 180, 2) && a_data_p.a_data_g.e((d_int * 180 + c_int) - 180, 2) && a_data_p.a_data_g.d((d_int * 180 + c_int) - 180, 2) && a_data_p.a_data_g.c((d_int * 180 + c_int) - 180, 2) && (c_int != a_data_p.Z || d_int - 1 != a_data_p.aa);
						if (b_boolean)
						{
							l += h;
							f = (f - h) + a_data_p.M;
							a_data_p.l[d_int * 180 + c_int] = 0;
							d_int--;
							a_data_p.l[d_int * 180 + c_int] = a_byte;
						}
					}
					if (l > 0)
						b_boolean = false;
				}
			int i1;
			if (!a_boolean && !b_boolean)
				if ((i1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
				{
					b_long = (j + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
					a_long = 0L;
					m = 2;
				} else
				if (i1 == 1)
				{
					b_long = (70 + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
					a_long = 0L;
					m = 1;
					a_data_p.l[d_int * 180 + c_int] = 0;
					b();
					a_boolean = true;
					b_boolean = true;
				} else
				{
					b();
					a_boolean = true;
					b_boolean = true;
				}
			break;

		case 1: // '\001'
			if (a_boolean)
				if (k > 0)
				{
					if (e_int < a_data_p.M - h)
					{
						k -= h;
						e_int += h;
					} else
					{
						k -= h;
						e_int = (e_int + h) - a_data_p.M;
						if (c_int < 179)
							c_int++;
						else
							k = -k;
					}
					if (k <= 0)
						a_boolean = false;
				} else
				{
					if (e_int > 0)
					{
						k += h;
						e_int -= h;
					} else
					{
						k += h;
						e_int = (e_int - h) + a_data_p.M;
						if (c_int > 0)
							c_int--;
						else
							k = -k;
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
						l -= h;
						f = (f + h) - a_data_p.M;
						if (d_int < 179)
							d_int++;
						else
							l = -l;
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
						l += 2;
						f = (f - h) + a_data_p.M;
						if (d_int > 0)
							d_int--;
						else
							l = -l;
					}
					if (l > 0)
						b_boolean = false;
				}
			if (!a_boolean && !b_boolean)
			{
				b();
				a_boolean = true;
				b_boolean = true;
			}
			boolean flag;
			if (a_long <= b_long || !(flag = a_data_p.a_data_g.a(d_int * 180 + c_int, 3) && a_data_p.a_data_g.e(d_int * 180 + c_int, 3) && a_data_p.a_data_g.d(d_int * 180 + c_int, 3) && a_data_p.a_data_g.c(d_int * 180 + c_int, 3) && (c_int != a_data_p.Z || d_int != a_data_p.aa)))
				break;
			int k1;
			if ((k1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
			{
				b_long = (j + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
				m = 2;
				a_data_p.l[d_int * 180 + c_int] = a_byte;
				break;
			}
			if (k1 == 1)
			{
				b_long = (70 + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
				b();
				a_boolean = true;
				b_boolean = true;
			} else
			{
				b();
				a_boolean = true;
				b_boolean = true;
				m = 0;
				a_data_p.l[d_int * 180 + c_int] = a_byte;
			}
			break;

		case 2: // '\002'
			if (a_long <= b_long)
				break;
			int j1;
			if ((j1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
			{
				b_long = (j + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
				break;
			}
			if (j1 == 1)
			{
				b_long = (70 + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
				m = 1;
				b();
				a_boolean = true;
				b_boolean = true;
				a_data_p.l[d_int * 180 + c_int] = 0;
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
			if (a_data_p.k[d_int * 180 + c_int] != a_data_p.e[4] && a_data_p.k[d_int * 180 + c_int] != a_data_p.e[5] && a_data_p.k[d_int * 180 + c_int] != a_data_p.e[6])
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (k > 0 && a_boolean || k <= 0 && !a_boolean)
			{
				if (i < 2)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			if (i < 2)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (a_data_p.k[d_int * 180 + c_int] == a_data_p.e[4] || a_data_p.k[d_int * 180 + c_int] == a_data_p.e[5] || a_data_p.k[d_int * 180 + c_int] == a_data_p.e[6])
				if (i < 2)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90002, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90006, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;

		case 1: // '\001'
			if (k > 0 && a_boolean || k <= 0 && !a_boolean)
			{
				if (i < 2)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, d_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, d_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			if (i < 2)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;

		case 2: // '\002'
			if (a_data_p.k[d_int * 180 + c_int] != a_data_p.e[4] && a_data_p.k[d_int * 180 + c_int] != a_data_p.e[5] && a_data_p.k[d_int * 180 + c_int] != a_data_p.e[6])
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (i < 2)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, e_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, e_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			if (a_data_p.k[d_int * 180 + c_int] == a_data_p.e[4] || a_data_p.k[d_int * 180 + c_int] == a_data_p.e[5] || a_data_p.k[d_int * 180 + c_int] == a_data_p.e[6])
				if (i < 2)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90002, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90006, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U + e_int, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;
		}
		if (++i == 4)
			i = 0;
	}

	public final boolean a()
	{
		return d_int >= a_data_p.ac - 1 && d_int <= a_data_p.ac + a_data_p.O + 2 && c_int >= a_data_p.ab - 1 && c_int <= a_data_p.ab + a_data_p.N + 2;
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
		if (Math.abs(b_int - d_int) < g)
		{
			l = Math.abs(a_java_util_Random.nextInt()) % (2 * a_data_p.M * Math.abs(g - Math.abs(b_int - d_int))) - a_data_p.M * Math.abs(g - Math.abs(b_int - d_int));
			return;
		}
		l = Math.abs(a_java_util_Random.nextInt()) % (a_data_p.M * g);
		if (d_int > b_int)
			l = -l;
	}
}
