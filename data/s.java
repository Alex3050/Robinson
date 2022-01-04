// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

// Referenced classes of package data:
//			aa, ac, ad, j, 
//			k, p, w, x

public final class s
{

	private p a_data_p;
	private int a_int;
	private boolean a_boolean;
	private boolean b_boolean;
	private boolean c_boolean;
	private boolean d_boolean;
	private int b_int;
	private int c_int;
	private int d_int;
	private int e_int;
	private int f_int;
	private int g_int;
	private int a_int_array1d[] = {
		0xd0019, 0xd001b, 0xd0017, 0xd001c, 0xd001a, 0xd0018
	};
	private int h_int;
	private int i_int;
	private int j_int;
	private int b_int_array1d[];
	private int c_int_array1d[];
	private int d_int_array1d[];
	private boolean a_boolean_array1d[];
	private int e_int_array1d[];
	private int f_int_array1d[];
	private boolean b_boolean_array1d[];
	private boolean c_boolean_array1d[];
	private int g_int_array1d[];
	private int h_int_array1d[];
	private int i_int_array1d[];
	private int j_int_array1d[];
	private boolean d_boolean_array1d[];
	private int a_int_array2d[][];
	private int b_int_array2d[][];
	private int c_int_array2d[][];
	private int k_int_array1d[];
	private int l_int_array1d[];
	private boolean e_boolean_array1d[];
	private boolean e_boolean;
	private int k_int;
	private long a_long;
	private boolean f_boolean;
	private int l_int;
	public Random a_java_util_Random;

	public s(p p1)
	{
		a_int = 0;
		a_boolean = false;
		b_boolean = false;
		c_boolean = true;
		d_boolean = false;
		d_int = 0;
		e_int = 0;
		f_int = 0;
		g_int = 0;
		b_int_array1d = new int[10];
		c_int_array1d = new int[10];
		d_int_array1d = new int[10];
		a_boolean_array1d = new boolean[10];
		e_int_array1d = new int[9];
		f_int_array1d = new int[9];
		b_boolean_array1d = new boolean[10];
		c_boolean_array1d = new boolean[10];
		g_int_array1d = new int[10];
		h_int_array1d = new int[10];
		i_int_array1d = new int[10];
		j_int_array1d = new int[10];
		d_boolean_array1d = new boolean[10];
		a_int_array2d = new int[10][2];
		b_int_array2d = new int[10][2];
		c_int_array2d = new int[10][2];
		k_int_array1d = new int[10];
		l_int_array1d = new int[10];
		e_boolean_array1d = new boolean[10];
		f_boolean = true;
		a_java_util_Random = new Random();
		a_data_p = p1;
	}

	public final void a()
	{
		if (a_data_p.a_data_x.a_int == 0)
		{
			if (a_data_p.aw)
			{
				a_data_p.aw = false;
				a_data_p.v = 0L;
				q();
				a_data_p.a_data_aa.c();
			}
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				a_data_p.a_data_x.c_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
			}
			a_data_p.a_data_x.b_boolean = true;
			return;
		}
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b() - 44);
		if (a_data_p.aw)
		{
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, data.k.b() - 44, data.k.a(), data.k.b());
		}
		if (!d_boolean)
		{
			e();
			f();
			if (a_data_p.aw)
			{
				String s1 = (new Integer(i_int)).toString() + "/" + (new Integer(10)).toString();
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0017, data.k.a() / 7 - 16, data.k.b() - 32);
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s1), data.k.a() / 7 + 16, data.k.b() - 30, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				} else
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0017, data.k.a() / 2 - 16, data.k.b() - 32);
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s1), data.k.a() / 2 + 16, data.k.b() - 30, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				}
				a_data_p.aw = false;
			}
			h();
			g();
			i();
			j();
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, data.k.a() / 2 - 12, data.k.b() - 2 - 12 - 2 - 24 - 12);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0033, data.k.a() / 2 - 24 - 2, data.k.b() - 2 - 12 - 2 - 24);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0034, data.k.a() / 2 + 12 + 2, data.k.b() - 2 - 12 - 2 - 24);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, data.k.a() / 2 - 12, data.k.b() - 2 - 12);
			}
			if (e_boolean && a_data_p.D_long >= 1500L)
			{
				for (int i1 = 0; i1 < a_data_p.aT; i1++)
					if (a_boolean_array1d[i1])
						switch (a_data_p.a_data_x.c_int_array1d[i1])
						{
						case 44: // ','
						case 45: // '-'
						case 46: // '.'
						case 47: // '/'
						default:
							break;

						case 42: // '*'
							if (a_data_p.c_int_array1d[a_data_p.F] != -1)
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 25F;
							else
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 50F;
							break;

						case 43: // '+'
							if (a_data_p.b_int_array1d[a_data_p.E] != -1)
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 25F;
							else
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 50F;
							break;

						case 48: // '0'
							if (a_data_p.d_int_array1d[a_data_p.G_int] != -1)
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 5F;
							else
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 10F;
							break;

						case 49: // '1'
							if (a_data_p.a_int_array1d[a_data_p.D_int] != -1)
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 10F;
							else
								a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 20F;
							break;
						}

				d_boolean = true;
				a_data_p.z = 0L;
			}
		}
		if (d_boolean)
		{
			a_data_p.a_data_x.a_boolean = true;
			a_data_p.a_data_x.a(0xd0016);
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.z = 8001L;
				a_data_p.aK = true;
			}
			if (a_data_p.z > 8000L)
			{
				d_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.q[a_data_p.a_data_x.b_int]--;
				if (a_data_p.q[a_data_p.a_data_x.b_int] == 0)
				{
					for (int j1 = a_data_p.a_data_x.b_int; j1 < a_data_p.aB - 1; j1++)
					{
						a_data_p.m_byte_array1d[j1] = a_data_p.m_byte_array1d[j1 + 1];
						a_data_p.q[j1] = a_data_p.q[j1 + 1];
					}

					a_data_p.aB--;
				}
				for (int k1 = 0; k1 < a_data_p.n[81]; k1++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d_float / 100F;
					if (a_data_p.e < a_data_p.d_float)
						continue;
					a_data_p.e = a_data_p.d_float;
					break;
				}

				int i2;
				if ((i2 = a_data_p.m_int_array1d[81]) < 0)
				{
					i2 = -i2;
					for (int l2 = 0; l2 < i2; l2++)
					{
						a_data_p.c_float = a_data_p.c_float - a_data_p.d_float / 100F;
						if (a_data_p.c_float > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int i3 = 0; i3 < a_data_p.m_int_array1d[81]; i3++)
					{
						a_data_p.c_float = a_data_p.c_float + a_data_p.d_float / 100F;
						if (a_data_p.c_float < a_data_p.d_float)
							continue;
						a_data_p.c_float = a_data_p.d_float;
						break;
					}

				}
			}
			a_data_p.a_data_x.b_boolean = true;
		}
		if (b_boolean)
		{
			a_data_p.a_data_x.a_boolean = true;
			l();
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.z = 8001L;
				a_data_p.aK = true;
			}
			if (a_data_p.z > 8000L)
			{
				b_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.a_data_ad.a = true;
				for (int l1 = 0; l1 < a_data_p.aB; l1++)
					if (a_data_p.m_byte_array1d[l1] == a_data_p.a_data_x.c_int_array1d[a_int])
					{
						a_data_p.q[l1] = a_data_p.q[l1] + 1;
						a_data_p.a_data_ad.a = false;
					}

				if (a_data_p.a_data_ad.a)
				{
					a_data_p.m_byte_array1d[a_data_p.aB] = (byte)a_data_p.a_data_x.c_int_array1d[a_int];
					a_data_p.q[a_data_p.aB] = 1;
					a_data_p.aB++;
				}
				if (a_data_p.X)
					m();
				else
				if (a_data_p.Y)
					n();
				else
				if (a_data_p.V)
					o();
				else
				if (a_data_p.W)
					p();
				a_data_p.q[a_data_p.a_data_x.b_int]--;
				if (a_data_p.q[a_data_p.a_data_x.b_int] == 0)
				{
					for (int j2 = a_data_p.a_data_x.b_int; j2 < a_data_p.aB - 1; j2++)
					{
						a_data_p.m_byte_array1d[j2] = a_data_p.m_byte_array1d[j2 + 1];
						a_data_p.q[j2] = a_data_p.q[j2 + 1];
					}

					a_data_p.aB--;
				}
				for (int k2 = 0; k2 < a_data_p.n[81]; k2++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d_float / 100F;
					if (a_data_p.e < a_data_p.d_float)
						continue;
					a_data_p.e = a_data_p.d_float;
					break;
				}

				int j3;
				if ((j3 = a_data_p.m_int_array1d[81]) < 0)
				{
					j3 = -j3;
					for (int k3 = 0; k3 < j3; k3++)
					{
						a_data_p.c_float = a_data_p.c_float - a_data_p.d_float / 100F;
						if (a_data_p.c_float > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int l3 = 0; l3 < a_data_p.m_int_array1d[81]; l3++)
					{
						a_data_p.c_float = a_data_p.c_float + a_data_p.d_float / 100F;
						if (a_data_p.c_float < a_data_p.d_float)
							continue;
						a_data_p.c_float = a_data_p.d_float;
						break;
					}

				}
			}
			a_data_p.a_data_x.b_boolean = true;
		}
	}

	private void e()
	{
		if (!a_boolean)
		{
			((k) (a_data_p)).a.setColor(26265);
			((k) (a_data_p)).a.fillArc(b_int - (a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, c_int - (a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, (2 * a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, (2 * a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, a_data_p.a_data_x.c_int, 30);
		}
	}

	private void f()
	{
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0016, 10, data.k.b() - 50);
	}

	private void g()
	{
		for (int i1 = 0; i1 < a_data_p.aT; i1++)
			if (!b_boolean)
				if (e_boolean && a_boolean_array1d[i1])
				{
					e_int_array1d[i1] = h_int_array1d[i1] + (j_int_array1d[i1] * (int)a_data_p.D_long) / 1500;
					f_int_array1d[i1] = g_int_array1d[i1] + (i_int_array1d[i1] * (int)a_data_p.D_long) / 1500;
					if (j_int_array1d[i1] > 0)
					{
						if (a_data_p.r < 600L)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array2d[i1][0], e_int_array1d[i1], f_int_array1d[i1]);
						else
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array2d[i1][1], e_int_array1d[i1], f_int_array1d[i1]);
						if (a_data_p.r >= 1200L)
							a_data_p.r = 0L;
					} else
					{
						if (a_data_p.r < 600L)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array2d[i1][0], e_int_array1d[i1], f_int_array1d[i1]);
						else
							a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array2d[i1][1], e_int_array1d[i1], f_int_array1d[i1]);
						if (a_data_p.r >= 1200L)
							a_data_p.r = 0L;
					}
				} else
				{
					if (i_int_array1d[i1] >= 0)
					{
						if (b_boolean_array1d[i1] && d_boolean_array1d[i1])
						{
							f_int_array1d[i1] += g_int_array1d[i1];
							i_int_array1d[i1] -= g_int_array1d[i1];
							if (i_int_array1d[i1] < 0 || f_int_array1d[i1] > data.k.b() / 3)
								b_boolean_array1d[i1] = false;
							if (f_int_array1d[i1] > data.k.b() / 3)
								f_int_array1d[i1] = data.k.b() / 3;
						}
					} else
					if (b_boolean_array1d[i1] && d_boolean_array1d[i1])
					{
						f_int_array1d[i1] -= g_int_array1d[i1];
						i_int_array1d[i1] += g_int_array1d[i1];
						if (i_int_array1d[i1] >= 0 || f_int_array1d[i1] <= 45)
							b_boolean_array1d[i1] = false;
						if (f_int_array1d[i1] <= 45)
							f_int_array1d[i1] = 45;
					}
					int j1;
					if (!c_boolean_array1d[i1] && !b_boolean_array1d[i1] && !e_boolean_array1d[i1])
						if ((j1 = Math.abs(a_java_util_Random.nextInt()) % l_int) == 0)
						{
							e_boolean_array1d[i1] = true;
							a_long = (20 + Math.abs(a_java_util_Random.nextInt()) % 30) * 100;
							a_data_p.A = 0L;
						} else
						{
							i_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % (2 * (data.k.b() / 3 - 30)) - (data.k.b() / 3 - 30);
							j_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % ((4 * data.k.a()) / 3 - 40) - ((2 * data.k.a()) / 3 - 20);
							c_boolean_array1d[i1] = true;
							b_boolean_array1d[i1] = true;
						}
					if (e_boolean_array1d[i1])
					{
						if (!f_boolean && a_data_p.A > a_long)
							e_boolean_array1d[i1] = false;
						if (a_data_p.r < 600L)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int_array2d[i1][0], e_int_array1d[i1], f_int_array1d[i1]);
						else
							a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int_array2d[i1][1], e_int_array1d[i1], f_int_array1d[i1]);
						if (a_data_p.r >= 1200L)
							a_data_p.r = 0L;
					} else
					if (j_int_array1d[i1] >= 0)
					{
						if (c_boolean_array1d[i1] && d_boolean_array1d[i1])
						{
							e_int_array1d[i1] += h_int_array1d[i1];
							j_int_array1d[i1] -= h_int_array1d[i1];
							if (j_int_array1d[i1] < 0 || e_int_array1d[i1] >= data.k.a() - 24)
								c_boolean_array1d[i1] = false;
							if (e_int_array1d[i1] >= data.k.a() - 24)
								e_int_array1d[i1] = data.k.a() - 24;
							if (a_data_p.r >= 1200L)
								a_data_p.r = 0L;
						}
						if (a_data_p.r < 600L)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array2d[i1][0], e_int_array1d[i1], f_int_array1d[i1]);
						else
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array2d[i1][1], e_int_array1d[i1], f_int_array1d[i1]);
					} else
					{
						if (c_boolean_array1d[i1] && d_boolean_array1d[i1])
						{
							e_int_array1d[i1] -= h_int_array1d[i1];
							j_int_array1d[i1] += h_int_array1d[i1];
							if (j_int_array1d[i1] >= 0 || e_int_array1d[i1] < 24)
								c_boolean_array1d[i1] = false;
							if (e_int_array1d[i1] < 24)
								e_int_array1d[i1] = 24;
							if (a_data_p.r >= 1200L)
								a_data_p.r = 0L;
						}
						if (a_data_p.r < 600L)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array2d[i1][0], e_int_array1d[i1], f_int_array1d[i1]);
						else
							a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int_array2d[i1][1], e_int_array1d[i1], f_int_array1d[i1]);
					}
				}

	}

	private void h()
	{
		for (int i1 = 0; i1 < 10; i1++)
			if (d_int_array1d[i1] == 3)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0018, b_int_array1d[i1], c_int_array1d[i1] - 7);

	}

	private void i()
	{
		byte byte0 = 0;
		byte byte1 = 0;
		if (d_int_array1d[k_int] == 1)
			if (b_int_array1d[k_int] < g_int)
			{
				c_int_array1d[k_int] = data.k.b() - 50 - (-((d_int * (b_int_array1d[k_int] - 10) * (b_int_array1d[k_int] - 10)) / e_int) + (f_int * (b_int_array1d[k_int] - 10)) / a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]);
				b_int_array1d[k_int] = 10 + (int)((((a_data_p.G_long * 2L * (long)a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]) / 100L) * (long)a_data_p.a_data_x.e * (long)j_int) / 100L / a_data_p.a_data_x.a_long);
				if (a_data_p.a_data_x.d > 12)
				{
					if (b_int_array1d[k_int] >= g_int - 1 && h_int < 4)
					{
						h_int = 4;
						byte0 = -4;
					} else
					if (b_int_array1d[k_int] >= g_int - 2 && h_int < 3)
					{
						h_int = 3;
						byte0 = -3;
					} else
					if (b_int_array1d[k_int] >= g_int - 3 && h_int < 2)
					{
						h_int = 2;
						byte1 = -4;
					} else
					if (b_int_array1d[k_int] >= g_int - 4 && h_int < 1)
					{
						h_int = 1;
						byte1 = -4;
					}
				} else
				if (b_int_array1d[k_int] >= g_int - 2 && h_int < 4)
				{
					h_int = 4;
					byte0 = -4;
				} else
				if (b_int_array1d[k_int] >= g_int - 4 && h_int < 3)
				{
					h_int = 3;
					byte0 = -3;
				} else
				if (b_int_array1d[k_int] >= g_int - 6 && h_int < 2)
				{
					h_int = 2;
					byte1 = -4;
				} else
				if (b_int_array1d[k_int] >= g_int - 8 && h_int < 1)
				{
					h_int = 1;
					byte1 = -4;
				}
			} else
			{
				d_int_array1d[k_int] = 2;
			}
		if (d_int_array1d[k_int] != 0)
			if (d_int_array1d[k_int] == 1)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[h_int], b_int_array1d[k_int] + byte0, c_int_array1d[k_int] + byte1);
				return;
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0018, b_int_array1d[k_int], c_int_array1d[k_int] - 7);
				return;
			}
		switch (h_int)
		{
		case 0: // '\0'
			byte0 = -4;
			byte1 = 0;
			break;

		case 1: // '\001'
			byte0 = -3;
			byte1 = 0;
			break;

		case 2: // '\002'
			byte0 = 0;
			byte1 = 0;
			break;

		case 3: // '\003'
			byte0 = 0;
			byte1 = 2;
			break;
		}
		a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[h_int], 10 + byte0, (data.k.b() - 50) + byte1);
	}

	private void j()
	{
		if (!b_boolean && !e_boolean && d_int_array1d[k_int] == 2)
		{
			for (int i1 = 0; i1 < a_data_p.aT; i1++)
				if (e_int_array1d[i1] - (k_int_array1d[i1] >> 1) < b_int_array1d[k_int] + 8 && e_int_array1d[i1] + (k_int_array1d[i1] >> 1) > b_int_array1d[k_int])
				{
					if (f_int_array1d[i1] - (l_int_array1d[i1] >> 1) < c_int_array1d[k_int] + 1 && f_int_array1d[i1] + (l_int_array1d[i1] >> 1) > c_int_array1d[k_int] - 7)
					{
						b_boolean = true;
						a_int = i1;
						d_boolean_array1d[i1] = false;
						a_data_p.z = 0L;
					} else
					if (k_int == 0)
					{
						i_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % (2 * (data.k.b() / 3 - 30)) - (data.k.b() / 3 - 30);
						j_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % ((4 * data.k.a()) / 3) - (2 * data.k.a()) / 3;
						b_boolean_array1d[i1] = true;
						c_boolean_array1d[i1] = true;
						f_boolean = false;
					}
				} else
				if (k_int == 0)
				{
					i_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % (2 * (data.k.b() / 3 - 30)) - (data.k.b() / 3 - 30);
					j_int_array1d[i1] = Math.abs(a_java_util_Random.nextInt()) % ((4 * data.k.a()) / 3) - (2 * data.k.a()) / 3;
					b_boolean_array1d[i1] = true;
					c_boolean_array1d[i1] = true;
					f_boolean = false;
				}

			if (k_int == 9)
			{
				for (int j1 = 0; j1 < a_data_p.aT; j1++)
					if (a_boolean_array1d[j1])
					{
						e_boolean = true;
						a_data_p.D_long = 0L;
						j_int_array1d[j1] = b_int - e_int_array1d[j1];
						i_int_array1d[j1] = c_int - f_int_array1d[j1];
						h_int_array1d[j1] = e_int_array1d[j1];
						g_int_array1d[j1] = f_int_array1d[j1];
					}

				if (!e_boolean && !b_boolean)
				{
					d_boolean = !b_boolean;
					a_data_p.z = 0L;
				}
			} else
			{
				d_int_array1d[k_int] = 3;
				k_int++;
				a_boolean = false;
				a_data_p.a_data_x.c_int = 70;
				a_data_p.a_data_x.e = 40;
			}
			h_int = 0;
		}
	}

	public final void b()
	{
		a_data_p.a_data_x.a_int = 0;
		a_data_p.a_data_x.b_int = -1;
		for (int i1 = 0; i1 < a_data_p.aB; i1++)
			if (a_data_p.m_byte_array1d[i1] == 45)
			{
				a_data_p.a_data_x.b_int = i1;
				a_data_p.a_data_x.a_int = a_data_p.q[i1];
			}

		if (a_data_p.a_data_x.a_int > 0)
		{
			b_int = 10;
			c_int = data.k.b() - 50;
			for (int j1 = 0; j1 < 10; j1++)
			{
				b_int_array1d[j1] = 10;
				c_int_array1d[j1] = data.k.b() - 50;
				d_int_array1d[j1] = 0;
			}

			h_int = 0;
			k_int = 0;
			a_data_p.a_data_x.e = 40;
			a_data_p.a_data_x.c_int = 70;
			i_int = 0;
			e_boolean = false;
			l_int = 0;
			j_int = data.k.b() - 50;
			c();
			for (int k1 = 0; k1 < a_data_p.aT; k1++)
			{
				d_boolean_array1d[k1] = true;
				b_boolean_array1d[k1] = false;
				c_boolean_array1d[k1] = false;
				e_boolean_array1d[k1] = true;
				a_boolean_array1d[k1] = false;
			}

			k();
			a_data_p.a_data_x.b_boolean = true;
			a_data_p.aK = false;
			a_boolean = false;
			c_boolean = true;
			b_boolean = false;
			d_boolean = false;
			a_data_p.aw = true;
			f_boolean = true;
			return;
		} else
		{
			a_data_p.aw = true;
			return;
		}
	}

	public final void c()
	{
		int i1 = data.k.b() - 50;
		int j1;
		if (data.k.a() - 10 <= i1)
			j1 = data.k.a() - 10;
		else
			j1 = i1;
		for (; j_int * j_int < i1 * i1 + j1 * j1; j_int++);
	}

	private void k()
	{
		for (int i1 = 0; i1 < a_data_p.aT; i1++)
		{
			switch (a_data_p.a_data_x.c_int_array1d[i1])
			{
			case 4: // '\004'
				a_int_array2d[i1][0] = 0x20002;
				a_int_array2d[i1][1] = 0x20003;
				b_int_array2d[i1][0] = 0x20000;
				b_int_array2d[i1][1] = 0x20001;
				c_int_array2d[i1][0] = 0x20004;
				c_int_array2d[i1][1] = 0x20005;
				k_int_array1d[i1] = 24;
				l_int_array1d[i1] = 20;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 41: // ')'
				a_int_array2d[i1][0] = 0x20028;
				a_int_array2d[i1][1] = 0x20029;
				b_int_array2d[i1][0] = 0x20028;
				b_int_array2d[i1][1] = 0x20029;
				c_int_array2d[i1][0] = 0x20028;
				c_int_array2d[i1][1] = 0x20029;
				k_int_array1d[i1] = 16;
				l_int_array1d[i1] = 15;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 42: // '*'
				a_int_array2d[i1][0] = 0x20010;
				a_int_array2d[i1][1] = 0x20011;
				b_int_array2d[i1][0] = 0x2000e;
				b_int_array2d[i1][1] = 0x2000f;
				c_int_array2d[i1][0] = 0x20010;
				c_int_array2d[i1][1] = 0x20011;
				k_int_array1d[i1] = 48;
				l_int_array1d[i1] = 14;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				a_boolean_array1d[i1] = true;
				break;

			case 43: // '+'
				a_int_array2d[i1][0] = 0x20058;
				a_int_array2d[i1][1] = 0x20059;
				b_int_array2d[i1][0] = 0x20056;
				b_int_array2d[i1][1] = 0x20057;
				c_int_array2d[i1][0] = 0x20058;
				c_int_array2d[i1][1] = 0x20059;
				k_int_array1d[i1] = 32;
				l_int_array1d[i1] = 24;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				a_boolean_array1d[i1] = true;
				break;

			case 44: // ','
				a_int_array2d[i1][0] = 0x2000c;
				a_int_array2d[i1][1] = 0x2000d;
				b_int_array2d[i1][0] = 0x2000a;
				b_int_array2d[i1][1] = 0x2000b;
				c_int_array2d[i1][0] = 0x2000c;
				c_int_array2d[i1][1] = 0x2000d;
				k_int_array1d[i1] = 24;
				l_int_array1d[i1] = 18;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 46: // '.'
				a_int_array2d[i1][0] = 0x20014;
				a_int_array2d[i1][1] = 0x20015;
				b_int_array2d[i1][0] = 0x20012;
				b_int_array2d[i1][1] = 0x20013;
				c_int_array2d[i1][0] = 0x20014;
				c_int_array2d[i1][1] = 0x20015;
				k_int_array1d[i1] = 20;
				l_int_array1d[i1] = 12;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 47: // '/'
				a_int_array2d[i1][0] = 0x20008;
				a_int_array2d[i1][1] = 0x20009;
				b_int_array2d[i1][0] = 0x20006;
				b_int_array2d[i1][1] = 0x20007;
				c_int_array2d[i1][0] = 0x20008;
				c_int_array2d[i1][1] = 0x20008;
				k_int_array1d[i1] = 20;
				l_int_array1d[i1] = 16;
				g_int_array1d[i1] = 1;
				h_int_array1d[i1] = 1;
				break;

			case 48: // '0'
				a_int_array2d[i1][0] = 0x20036;
				a_int_array2d[i1][1] = 0x20037;
				b_int_array2d[i1][0] = 0x20034;
				b_int_array2d[i1][1] = 0x20035;
				c_int_array2d[i1][0] = 0x20038;
				c_int_array2d[i1][1] = 0x20039;
				k_int_array1d[i1] = 24;
				l_int_array1d[i1] = 7;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				a_boolean_array1d[i1] = true;
				break;

			case 49: // '1'
				a_int_array2d[i1][0] = 0x20030;
				a_int_array2d[i1][1] = 0x20031;
				b_int_array2d[i1][0] = 0x2002e;
				b_int_array2d[i1][1] = 0x2002f;
				c_int_array2d[i1][0] = 0x20032;
				c_int_array2d[i1][1] = 0x20033;
				k_int_array1d[i1] = 28;
				l_int_array1d[i1] = 7;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				a_boolean_array1d[i1] = true;
				break;

			case 51: // '3'
				a_int_array2d[i1][0] = 0x2006c;
				a_int_array2d[i1][1] = 0x2006d;
				b_int_array2d[i1][0] = 0x2006a;
				b_int_array2d[i1][1] = 0x2006b;
				c_int_array2d[i1][0] = 0x20066;
				c_int_array2d[i1][1] = 0x20067;
				k_int_array1d[i1] = 19;
				l_int_array1d[i1] = 16;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 52: // '4'
				a_int_array2d[i1][0] = 0x2004c;
				a_int_array2d[i1][1] = 0x2004d;
				b_int_array2d[i1][0] = 0x2004a;
				b_int_array2d[i1][1] = 0x2004b;
				c_int_array2d[i1][0] = 0x20046;
				c_int_array2d[i1][1] = 0x20047;
				k_int_array1d[i1] = 19;
				l_int_array1d[i1] = 19;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 53: // '5'
				a_int_array2d[i1][0] = 0x20054;
				a_int_array2d[i1][1] = 0x20055;
				b_int_array2d[i1][0] = 0x20052;
				b_int_array2d[i1][1] = 0x20053;
				c_int_array2d[i1][0] = 0x2004e;
				c_int_array2d[i1][1] = 0x2004f;
				k_int_array1d[i1] = 24;
				l_int_array1d[i1] = 21;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 61: // '='
				a_int_array2d[i1][0] = 0x2002c;
				a_int_array2d[i1][1] = 0x2002d;
				b_int_array2d[i1][0] = 0x2002a;
				b_int_array2d[i1][1] = 0x2002b;
				c_int_array2d[i1][0] = 0x2002c;
				c_int_array2d[i1][1] = 0x2002c;
				k_int_array1d[i1] = 32;
				l_int_array1d[i1] = 11;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 62: // '>'
				a_int_array2d[i1][0] = 0x20078;
				a_int_array2d[i1][1] = 0x20079;
				b_int_array2d[i1][0] = 0x20076;
				b_int_array2d[i1][1] = 0x20077;
				c_int_array2d[i1][0] = 0x20076;
				c_int_array2d[i1][1] = 0x20077;
				k_int_array1d[i1] = 20;
				l_int_array1d[i1] = 20;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;

			case 63: // '?'
				a_int_array2d[i1][0] = 0x20074;
				a_int_array2d[i1][1] = 0x20075;
				b_int_array2d[i1][0] = 0x20072;
				b_int_array2d[i1][1] = 0x20073;
				c_int_array2d[i1][0] = 0x20070;
				c_int_array2d[i1][1] = 0x20071;
				k_int_array1d[i1] = 20;
				l_int_array1d[i1] = 30;
				g_int_array1d[i1] = 2;
				h_int_array1d[i1] = 2;
				break;
			}
			e_int_array1d[i1] = (data.k.a() >> 1) + Math.abs(a_java_util_Random.nextInt()) % ((data.k.a() >> 1) - 24);
			f_int_array1d[i1] = 40 + Math.abs(a_java_util_Random.nextInt()) % (data.k.b() / 3 - 30 - 10);
		}

	}

	public final void d()
	{
		if (!a_boolean && !b_boolean && !a_data_p.aK)
		{
			if ((((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5)
				if (!c_boolean)
				{
					a_boolean = true;
					a_data_p.a_data_x.d = (a_data_p.a_data_x.c_int + 15) / 5 - 3;
					d_int = (a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d] * 10000) / (a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d] * a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]);
					e_int = a_data_p.a_data_x.e * j_int;
					f_int = 2 * a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d];
					g_int = (a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d] * a_data_p.a_data_x.e * j_int) / 10000 + 10;
					a_data_p.a_data_x.a_long = ((((3000 / data.k.a()) * a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]) / 100) * a_data_p.a_data_x.e * j_int) / 100 + ((((2000 / (data.k.b() - 50)) * a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d]) / 100) * a_data_p.a_data_x.e * j_int) / 100;
					a_data_p.G_long = 0L;
					i_int++;
					a_data_p.aw = true;
					d_int_array1d[k_int] = 1;
					l_int += 4;
				} else
				{
					c_boolean = false;
				}
			if ((((k) (a_data_p)).bt & 4) != 0 || a_data_p.a_data_j.e == 2)
			{
				if (a_data_p.a_data_x.e < 100)
					a_data_p.a_data_x.e += 2;
			} else
			if ((((k) (a_data_p)).bt & 8) != 0 || a_data_p.a_data_j.e == 8)
			{
				if (a_data_p.a_data_x.e > 40)
					a_data_p.a_data_x.e -= 2;
			} else
			if ((((k) (a_data_p)).bt & 1) != 0 || a_data_p.a_data_j.e == 4)
			{
				if (a_data_p.a_data_x.c_int + 5 <= 70)
					a_data_p.a_data_x.c_int += 5;
			} else
			if (((((k) (a_data_p)).bt & 2) != 0 || a_data_p.a_data_j.e == 6) && a_data_p.a_data_x.c_int - 5 >= 10)
				a_data_p.a_data_x.c_int -= 5;
			if (a_data_p.a_data_x.c_int < 25)
			{
				h_int = 3;
				return;
			}
			if (a_data_p.a_data_x.c_int < 35)
			{
				h_int = 2;
				return;
			}
			if (a_data_p.a_data_x.c_int < 65)
			{
				h_int = 1;
				return;
			} else
			{
				h_int = 0;
				return;
			}
		} else
		{
			a_data_p.aK = false;
			return;
		}
	}

	private void l()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0016, data.k.a() >> 1, data.k.b() / 3);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0017, data.k.a() >> 1, data.k.b() / 3);
		String s1 = a_data_p.a_data_ac.a(93).toString() + a_data_p.b_java_lang_String_array1d[a_data_p.a_data_x.c_int_array1d[a_int]];
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s1), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
		a_data_p.a_data_aa.c();
	}

	private void m()
	{
		if (a_data_p.l[a_data_p.P - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 180] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 180] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 540] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 180 - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 180 - 1] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 1] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 180) - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 180) - 1] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 360) - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 360) - 1] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 540) - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 540) - 1] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 180 - 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 180 - 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 2] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 180) - 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 180) - 2] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 360) - 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 360) - 2] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 540) - 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
			a_data_p.l[(a_data_p.P + 540) - 2] = 0;
	}

	private void n()
	{
		if (a_data_p.l[(a_data_p.P - 180) + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 180) + 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 180 + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 180 + 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 360 + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 360 + 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 540 + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 540 + 2] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P - 180) + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 180) + 3] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 3] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 180 + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 180 + 3] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 360 + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 360 + 3] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 540 + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 540 + 3] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P - 180) + 4] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 180) + 4] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 4] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 4] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 180 + 4] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 180 + 4] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 360 + 4] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 360 + 4] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 540 + 4] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
			a_data_p.l[a_data_p.P + 540 + 4] = 0;
	}

	private void o()
	{
		if (a_data_p.l[a_data_p.P - 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 1] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 1] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 1] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 2] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 2] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 3] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 3] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 1 - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 1 - 180] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 180] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 1) - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 1) - 180] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 2) - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 2) - 180] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 3) - 180] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 3) - 180] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 1 - 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 1 - 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P - 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P - 360] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 1) - 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 1) - 360] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 2) - 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P + 2) - 360] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P + 3) - 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
			a_data_p.l[(a_data_p.P + 3) - 360] = 0;
	}

	private void p()
	{
		if (a_data_p.l[(a_data_p.P - 1) + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 1) + 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 1 + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 1 + 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 2 + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 2 + 360] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 3 + 360] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 3 + 360] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P - 1) + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 1) + 540] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 540] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 1 + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 1 + 540] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 2 + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 2 + 540] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 3 + 540] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 3 + 540] = 0;
			return;
		}
		if (a_data_p.l[(a_data_p.P - 1) + 720] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[(a_data_p.P - 1) + 720] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 720] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 720] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 1 + 720] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 1 + 720] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 2 + 720] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
		{
			a_data_p.l[a_data_p.P + 2 + 720] = 0;
			return;
		}
		if (a_data_p.l[a_data_p.P + 3 + 720] == a_data_p.a_data_x.c_int_array1d[a_int] + 1)
			a_data_p.l[a_data_p.P + 3 + 720] = 0;
	}

	private void q()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(92), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
	}
}
