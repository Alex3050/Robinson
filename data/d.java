// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;

// Referenced classes of package data:
//			ad, g, k, p, 
//			w

public final class d
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
	public int i;
	public int j;
	public int a_int_array1d[];
	public int b_int_array1d[];
	public int c_int_array1d[];
	public int k;
	public int l;
	public long a_long;
	public long b_long;
	public long c_long;
	public int m;
	public int n;
	public boolean a_boolean;
	public boolean b_boolean;
	public boolean c_boolean;
	public int o;
	private Random a_java_util_Random;
	private p a_data_p;

	public d(p p1, byte byte0, int i1, int j1, int k1, int l1, int i2, 
			int ai[], int ai1[], int ai2[])
	{
		a_int_array1d = new int[2];
		b_int_array1d = new int[2];
		c_int_array1d = new int[2];
		c_long = 0L;
		a_boolean = true;
		b_boolean = true;
		c_boolean = false;
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
			i = p1.aj / 6;
			j = p1.aj / 5;
			break;

		case 2: // '\002'
			i = p1.aj / 5;
			j = p1.aj / 4;
			break;

		case 3: // '\003'
			i = p1.aj / 4;
			j = p1.aj / 3;
			break;

		case 4: // '\004'
			i = p1.aj / 3;
			j = p1.aj / 2;
			break;

		case 5: // '\005'
			i = p1.aj / 2;
			break;
		}
		h = i;
		l = i2;
		a_int_array1d = ai;
		b_int_array1d = ai1;
		c_int_array1d = ai2;
		k = 0;
		a_long = 0L;
		b();
		o = 0;
	}

	public final void a()
	{
		if (!a_data_p.T)
			if (Math.abs(c_int - a_data_p.Z) <= 2 && Math.abs(d - a_data_p.aa) <= 2)
			{
				c_boolean = true;
				h = j;
				if (c_int > a_data_p.Z)
				{
					if (Math.abs(a_int - a_data_p.Z) < g)
						m = (a_data_p.Z - c_int) * a_data_p.M;
					else
						m = (a_int - c_int - g) * a_data_p.M;
				} else
				if (Math.abs(a_int - a_data_p.Z) < g)
					m = (a_data_p.Z - c_int) * a_data_p.M;
				else
					m = ((g - c_int) + a_int) * a_data_p.M;
				if (d > a_data_p.aa)
				{
					if (Math.abs(b_int - a_data_p.aa) < g)
						n = (a_data_p.aa - d) * a_data_p.M;
					else
						n = (b_int - d - g) * a_data_p.M;
				} else
				if (Math.abs(b_int - a_data_p.aa) < g)
					n = (a_data_p.aa - d) * a_data_p.M;
				else
					n = ((g - d) + b_int) * a_data_p.M;
				if (o == 1)
					o = 0;
				a_boolean = true;
				b_boolean = true;
			} else
			{
				c_boolean = false;
				h = i;
			}
		switch (o)
		{
		default:
			break;

		case 0: // '\0'
			if (a_boolean)
				if (m > 0)
				{
					if (e < a_data_p.M - h)
					{
						m -= h;
						e += h;
					} else
					{
						a_boolean = a_data_p.a_data_g.e(d * 180 + c_int + 1, 1) && a_data_p.a_data_g.d(d * 180 + c_int + 1, 1) && a_data_p.a_data_g.c(d * 180 + c_int + 1, 1) && (c_int + 1 != a_data_p.Z || d != a_data_p.aa) && (a_byte == 43 || a_data_p.k[d * 180 + c_int + 1] != a_data_p.e[4] && a_data_p.k[d * 180 + c_int + 1] != a_data_p.e[5] && a_data_p.k[d * 180 + c_int + 1] != a_data_p.e[14]);
						if (a_boolean)
						{
							m -= h;
							e = (e + h) - a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							c_int++;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (m <= 0)
						a_boolean = false;
				} else
				{
					if (e > 0)
					{
						m += h;
						e -= h;
					} else
					{
						a_boolean = a_data_p.a_data_g.e((d * 180 + c_int) - 1, 0) && a_data_p.a_data_g.d((d * 180 + c_int) - 1, 0) && a_data_p.a_data_g.c((d * 180 + c_int) - 1, 0) && (c_int - 1 != a_data_p.Z || d != a_data_p.aa) && (a_byte == 43 || a_data_p.k[(d * 180 + c_int) - 1] != a_data_p.e[4] && a_data_p.k[(d * 180 + c_int) - 1] != a_data_p.e[5] && a_data_p.k[(d * 180 + c_int) - 1] != a_data_p.e[14]);
						if (a_boolean)
						{
							m += h;
							e = (e - h) + a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							c_int--;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (m > 0)
						a_boolean = false;
				}
			if (b_boolean)
				if (n > 0)
				{
					if (f < a_data_p.M - h)
					{
						n -= h;
						f += h;
					} else
					{
						b_boolean = a_data_p.a_data_g.e(d * 180 + c_int + 180, 3) && a_data_p.a_data_g.d(d * 180 + c_int + 180, 3) && a_data_p.a_data_g.c(d * 180 + c_int + 180, 3) && (c_int != a_data_p.Z || d + 1 != a_data_p.aa) && (a_byte == 43 || a_data_p.k[d * 180 + c_int + 180] != a_data_p.e[4] && a_data_p.k[d * 180 + c_int + 180] != a_data_p.e[5] && a_data_p.k[d * 180 + c_int + 180] != a_data_p.e[14]);
						if (b_boolean)
						{
							n -= h;
							f = (f + h) - a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							d++;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (n <= 0)
						b_boolean = false;
				} else
				{
					if (f > 0)
					{
						n += h;
						f -= h;
					} else
					{
						b_boolean = a_data_p.a_data_g.e((d * 180 + c_int) - 180, 2) && a_data_p.a_data_g.d((d * 180 + c_int) - 180, 2) && a_data_p.a_data_g.c((d * 180 + c_int) - 180, 2) && (c_int != a_data_p.Z || d - 1 != a_data_p.aa) && (a_byte == 43 || a_data_p.k[(d * 180 + c_int) - 180] != a_data_p.e[4] && a_data_p.k[(d * 180 + c_int) - 180] != a_data_p.e[5] && a_data_p.k[(d * 180 + c_int) - 180] != a_data_p.e[14]);
						if (b_boolean)
						{
							n += h;
							f = (f - h) + a_data_p.M;
							a_data_p.l[d * 180 + c_int] = 0;
							d--;
							a_data_p.l[d * 180 + c_int] = a_byte;
						}
					}
					if (n > 0)
						b_boolean = false;
				}
			int i1;
			if (!a_boolean && !b_boolean && !c_boolean)
				if ((i1 = Math.abs(a_java_util_Random.nextInt()) % 5) == 0)
				{
					b_long = (l + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
					a_long = 0L;
					o = 1;
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
				b_long = (l + Math.abs(a_java_util_Random.nextInt()) % 50) * 100;
				a_long = 0L;
			} else
			{
				b();
				a_boolean = true;
				b_boolean = true;
				o = 0;
			}
			break;
		}
		a_long += a_data_p.f;
		if (!a_data_p.T)
			if (Math.abs(c_int - a_data_p.Z) <= 1 && Math.abs(d - a_data_p.aa) <= 1)
			{
				c_long += a_data_p.f;
				if (c_long > 1000L)
				{
					if (!a())
					{
						switch (a_byte)
						{
						case 43: // '+'
						case 44: // ','
							a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 50F;
							break;

						case 49: // '1'
							a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 10F;
							break;

						case 50: // '2'
							a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 20F;
							break;
						}
						if (a_data_p.c_float <= 0.0F)
						{
							a_data_p.c_float = 0.0F;
							a_data_p.aO = true;
						}
					}
					if (a_data_p.U_boolean)
					{
						a_data_p.U_boolean = false;
						a_data_p.a_data_ad.b(((int)a_data_p.q * 30) / 10000);
						a_data_p.q = 0L;
					}
					c_long = 0L;
					return;
				}
			} else
			{
				c_long = 0L;
			}
	}

	public final void a(int i1, int j1)
	{
		if (a_data_p.k[d * 180 + c_int] != a_data_p.e[4] && a_data_p.k[d * 180 + c_int] != a_data_p.e[14])
			if (a_byte == 43)
			{
				a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				if (m > 0 && a_boolean || m <= 0 && !a_boolean)
					a_data_p.a_data_w.a(a_data_p.a(), 0x90003, (((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e) - 16, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e + 16, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			{
				a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			}
		switch (o)
		{
		case 0: // '\0'
			if (m > 0 && a_boolean || m <= 0 && !a_boolean)
			{
				if (k < 2)
					a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			if (k < 2)
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;

		case 1: // '\001'
			if (k < 2)
				a_data_p.a_data_w.a(a_data_p.a(), c_int_array1d[0], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			else
				a_data_p.a_data_w.a(a_data_p.a(), c_int_array1d[1], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			break;
		}
		if (a_data_p.k[d * 180 + c_int] == a_data_p.e[4] || a_data_p.k[d * 180 + c_int] == a_data_p.e[14])
			if (k < 2)
			{
				if (a_byte == 43)
				{
					if (m > 0 && a_boolean || m <= 0 && !a_boolean)
						a_data_p.a_data_w.a(a_data_p.a(), 0x9000d, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
					else
						a_data_p.a_data_w.a(a_data_p.a(), 0x9000b, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				} else
				{
					a_data_p.a_data_w.a(a_data_p.a(), 0x90002, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				}
			} else
			if (a_byte == 43)
			{
				if (m > 0 && a_boolean || m <= 0 && !a_boolean)
					a_data_p.a_data_w.a(a_data_p.a(), 0x9000e, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
				else
					a_data_p.a_data_w.a(a_data_p.a(), 0x9000c, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			} else
			{
				a_data_p.a_data_w.a(a_data_p.a(), 0x90006, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U_int + e, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V + f);
			}
		if (++k == 4)
			k = 0;
	}

	public final void b()
	{
		if (Math.abs(a_int - c_int) < g)
		{
			m = Math.abs(a_java_util_Random.nextInt()) % (2 * a_data_p.M * Math.abs(g - Math.abs(a_int - c_int))) - a_data_p.M * Math.abs(g - Math.abs(a_int - c_int));
		} else
		{
			m = Math.abs(a_java_util_Random.nextInt()) % (a_data_p.M * g);
			if (c_int > a_int)
				m = -m;
		}
		if (Math.abs(b_int - d) < g)
		{
			n = Math.abs(a_java_util_Random.nextInt()) % (2 * a_data_p.M * Math.abs(g - Math.abs(b_int - d))) - a_data_p.M * Math.abs(g - Math.abs(b_int - d));
			return;
		}
		n = Math.abs(a_java_util_Random.nextInt()) % (a_data_p.M * g);
		if (d > b_int)
			n = -n;
	}

	public final boolean a()
	{
		switch (a_byte)
		{
		case 43: // '+'
			if (a_data_p.c_int_array1d[a_data_p.F] != -1)
			{
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 25F;
				return true;
			} else
			{
				return false;
			}

		case 44: // ','
			if (a_data_p.b[a_data_p.E] != -1)
			{
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 25F;
				return true;
			} else
			{
				return false;
			}

		case 49: // '1'
			if (a_data_p.d_int_array1d[a_data_p.G] != -1)
			{
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 5F;
				return true;
			} else
			{
				return false;
			}

		case 50: // '2'
			if (a_data_p.a_int_array1d[a_data_p.D] != -1)
			{
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 10F;
				return true;
			} else
			{
				return false;
			}

		case 45: // '-'
		case 46: // '.'
		case 47: // '/'
		case 48: // '0'
		default:
			return false;
		}
	}
}
