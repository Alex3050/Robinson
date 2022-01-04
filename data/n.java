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

public final class n
{

	private p a_data_p;
	public int a_int;
	private int b_int;
	private int c_int;
	private int d_int;
	private int e_int;
	private int f_int;
	private int g_int;
	private boolean a_boolean;
	private boolean b_boolean;
	private boolean c_boolean;
	private boolean d_boolean;
	private boolean e_boolean;
	private boolean f_boolean;
	private int h_int;
	private int i;
	private int j;
	private int k;
	private int l;
	private int a_int_array1d[];
	private int b_int_array1d[];
	private int c_int_array1d[];
	private int m;
	private int d_int_array1d[];
	private int e_int_array1d[];
	private int f_int_array1d[];
	private int g_int_array1d[];
	private int h_int_array1d[];
	private boolean a_boolean_array1d[];
	public Random a_java_util_Random;

	public n(p p1)
	{
		a_int = 0;
		e_int = 0;
		f_int = 0;
		g_int = 0;
		a_boolean = false;
		b_boolean = true;
		c_boolean = false;
		d_boolean = false;
		e_boolean = false;
		f_boolean = true;
		h_int = 0;
		j = 0;
		k = 0;
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
				m();
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
		if (f_boolean)
		{
			a_data_p.x = 0L;
			e_boolean = true;
			f_boolean = false;
		}
		if (e_boolean)
		{
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.x = 8001L;
				a_data_p.aK = true;
			}
			if (a_data_p.x > 8000L)
				e_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0011, data.k.a() >> 1, data.k.b() / 3);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(90), data.k.a() >> 1, (data.k.b() >> 1) - 6, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			a_data_p.a_data_aa.c();
			return;
		}
		if (!c_boolean && !d_boolean)
		{
			e();
			f();
			if (a_data_p.aw)
			{
				String s = (new Integer(h_int)).toString() + "/5";
				String s1 = (new Integer(i)).toString() + "/10";
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0002, data.k.a() / 7, data.k.b() - 32);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s), data.k.a() / 7 + 28, data.k.b() - 30, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0011, (data.k.a() / 5) * 3 + data.k.a() / 5 / 2, data.k.b() - 32);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s1), (data.k.a() / 5) * 3 + data.k.a() / 5 / 2 + 28, data.k.b() - 30, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				a_data_p.aw = false;
			}
			g();
			h();
			i();
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, data.k.a() / 2 - 12, data.k.b() - 2 - 12 - 2 - 24 - 12);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0033, data.k.a() / 2 - 24 - 2, data.k.b() - 2 - 12 - 2 - 24);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0034, data.k.a() / 2 + 12 + 2, data.k.b() - 2 - 12 - 2 - 24);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, data.k.a() / 2 - 12, data.k.b() - 2 - 12);
			}
		}
		if (d_boolean)
		{
			a_data_p.a_data_x.a_boolean = true;
			a_data_p.a_data_x.a(0xd0011);
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.x = 8001L;
				a_data_p.aK = true;
			}
			if (a_data_p.x > 8000L)
			{
				d_boolean = false;
				if (a_int >= 5)
				{
					a_data_p.q_int_array1d[a_data_p.a_data_x.b_int]--;
					if (a_data_p.q_int_array1d[a_data_p.a_data_x.b_int] == 0)
					{
						for (int i1 = a_data_p.a_data_x.b_int; i1 < a_data_p.aB - 1; i1++)
						{
							a_data_p.m_byte_array1d[i1] = a_data_p.m_byte_array1d[i1 + 1];
							a_data_p.q_int_array1d[i1] = a_data_p.q_int_array1d[i1 + 1];
						}

						a_data_p.aB--;
					}
					a_int = 0;
				} else
				{
					a_int++;
				}
				int j1;
				if ((j1 = a_data_p.m_int_array1d[3]) < 0)
				{
					j1 = -j1;
					for (int l1 = 0; l1 < j1; l1++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int i2 = 0; i2 < a_data_p.m_int_array1d[3]; i2++)
					{
						a_data_p.c = a_data_p.c + a_data_p.d / 100F;
						if (a_data_p.c < a_data_p.d)
							continue;
						a_data_p.c = a_data_p.d;
						break;
					}

				}
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
			}
			a_data_p.a_data_x.b_boolean = true;
			a_data_p.a_data_aa.c();
		}
		if (c_boolean)
		{
			a_data_p.a_data_x.a_boolean = true;
			l();
			if (a_data_p.a_data_x.b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.x = 8001L;
				a_data_p.aK = true;
			}
			if (a_data_p.x > 8000L)
			{
				c_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.a_data_ad.a = true;
				for (int k1 = 0; k1 < a_data_p.aB; k1++)
					if (a_data_p.m_byte_array1d[k1] == 1)
					{
						a_data_p.q_int_array1d[k1] = a_data_p.q_int_array1d[k1] + 1;
						a_data_p.a_data_ad.a = false;
					}

				if (a_data_p.a_data_ad.a)
				{
					a_data_p.m_byte_array1d[a_data_p.aB] = 1;
					a_data_p.q_int_array1d[a_data_p.aB] = 1;
					a_data_p.aB++;
				}
				if (a_int >= 5)
				{
					a_data_p.q_int_array1d[a_data_p.a_data_x.b_int]--;
					if (a_data_p.q_int_array1d[a_data_p.a_data_x.b_int] == 0)
					{
						for (int j2 = a_data_p.a_data_x.b_int; j2 < a_data_p.aB - 1; j2++)
						{
							a_data_p.m_byte_array1d[j2] = a_data_p.m_byte_array1d[j2 + 1];
							a_data_p.q_int_array1d[j2] = a_data_p.q_int_array1d[j2 + 1];
						}

						a_data_p.aB--;
					}
					a_int = 1;
				} else
				{
					a_int++;
				}
				int k2;
				if ((k2 = a_data_p.m_int_array1d[3]) < 0)
				{
					k2 = -k2;
					for (int l2 = 0; l2 < k2; l2++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int i3 = 0; i3 < a_data_p.m_int_array1d[3]; i3++)
					{
						a_data_p.c = a_data_p.c + a_data_p.d / 100F;
						if (a_data_p.c < a_data_p.d)
							continue;
						a_data_p.c = a_data_p.d;
						break;
					}

				}
				a_data_p.q_int = 1;
				a_data_p.a_data_x.f();
			}
			a_data_p.a_data_x.b_boolean = true;
			a_data_p.a_data_aa.c();
		}
	}

	private void e()
	{
		if (!a_boolean)
		{
			((k) (a_data_p)).a.setColor(26265);
			((k) (a_data_p)).a.fillArc(c_int - (a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, d_int - (a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, (2 * a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, (2 * a_data_p.a_data_x.e * (data.k.b() - 50 >> 1)) / 100, a_data_p.a_data_x.c_int, 30);
		}
	}

	private void f()
	{
		for (int i1 = 0; i1 < l; i1++)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int_array1d[i1], a_int_array1d[i1], b_int_array1d[i1]);

	}

	private void g()
	{
		for (int i1 = 0; i1 < m; i1++)
			switch (f_int_array1d[i1])
			{
			default:
				break;

			case 0: // '\0'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0002, d_int_array1d[i1], e_int_array1d[i1]);
				break;

			case 1: // '\001'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0002, d_int_array1d[i1] + j, e_int_array1d[i1]);
				if ((long)g_int_array1d[i1] > 11000L)
				{
					f_int_array1d[i1] = 0;
					g_int_array1d[i1] = 0;
				} else
				{
					g_int_array1d[i1] += a_data_p.f;
				}
				break;

			case 2: // '\002'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0002, d_int_array1d[i1], e_int_array1d[i1]);
				if (e_int_array1d[i1] < data.k.b() - 50)
				{
					e_int_array1d[i1] += 5;
					break;
				}
				e_int_array1d[i1] = data.k.b() - 50;
				f_int_array1d[i1] = 3;
				if (h_int >= 5)
				{
					c_boolean = true;
					a_data_p.x = 0L;
				}
				break;

			case 3: // '\003'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0002, d_int_array1d[i1], e_int_array1d[i1]);
				break;
			}

		if (j == 1)
			k = 0;
		if (j == -1)
			k = 1;
		if (k == 0)
		{
			j--;
			return;
		} else
		{
			j++;
			return;
		}
	}

	private void h()
	{
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0011, c_int, d_int);
		if (a_boolean)
		{
			d_int = data.k.b() - 50 - (-((e_int * (c_int - 10) * (c_int - 10)) / f_int) + (g_int * (c_int - 10)) / a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]);
			c_int = 10 + (int)((((a_data_p.G * 2L * (long)a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]) / 100L) * (long)a_data_p.a_data_x.e * (long)b_int) / 100L / a_data_p.a_data_x.a_long);
			if (d_int > data.k.b() - 50)
			{
				a_boolean = false;
				c_int = 10;
				d_int = data.k.b() - 50;
				a_data_p.a_data_x.e = 40;
				a_data_p.a_data_x.d = 15;
				a_data_p.a_data_x.c_int = 70;
				for (int i1 = 0; i1 < m; i1++)
					h_int_array1d[i1] = 0;

				if (i == 10 && h_int < 5)
				{
					d_boolean = true;
					a_data_p.x = 0L;
				}
			}
		}
	}

	private void i()
	{
		for (int i1 = 0; i1 < m; i1++)
			if (h_int_array1d[i1] == 0 && d_int_array1d[i1] - 7 < c_int + 4 && d_int_array1d[i1] + 7 > c_int - 4 && e_int_array1d[i1] - 5 < d_int + 4 && e_int_array1d[i1] + 5 > d_int - 4)
				if (f_int_array1d[i1] == 0)
				{
					f_int_array1d[i1] = 1;
					g_int_array1d[i1] = 0;
					h_int_array1d[i1] = 1;
				} else
				if (f_int_array1d[i1] == 1)
				{
					h_int++;
					a_data_p.aw = true;
					f_int_array1d[i1] = 2;
				}

	}

	public final void b()
	{
		a_data_p.a_data_x.a_int = 0;
		a_data_p.a_data_x.b_int = -1;
		for (int i1 = 0; i1 < a_data_p.aB; i1++)
			if (a_data_p.m_byte_array1d[i1] == 3)
			{
				a_data_p.a_data_x.b_int = i1;
				a_data_p.a_data_x.a_int = a_data_p.q_int_array1d[i1];
			}

		if (a_data_p.a_data_x.a_int > 0)
		{
			c_int = 10;
			d_int = data.k.b() - 50;
			a_data_p.a_data_x.e = 40;
			a_data_p.a_data_x.c_int = 70;
			h_int = 0;
			i = 0;
			b_int = data.k.b() - 50;
			c();
			j();
			k();
			a_data_p.a_data_x.b_boolean = true;
			a_data_p.aK = false;
			a_boolean = false;
			b_boolean = true;
			c_boolean = false;
			d_boolean = false;
			f_boolean = true;
			a_data_p.aw = true;
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
		for (; b_int * b_int < i1 * i1 + j1 * j1; b_int++);
	}

	private void j()
	{
		int i1 = ((data.k.a() - 15) / 14) * ((data.k.b() / 3 - 30) / 5);
		l = 9 + Math.abs(a_java_util_Random.nextInt()) % (data.k.a() / 12);
		if (l > i1)
			l = i1;
		a_int_array1d = new int[l];
		b_int_array1d = new int[l];
		c_int_array1d = new int[l];
		boolean aflag[] = new boolean[i1];
		for (int k1 = 0; k1 < i1; k1++)
			aflag[k1] = false;

		for (int i2 = 0; i2 < l; i2++)
		{
			int l1;
			for (l1 = Math.abs(a_java_util_Random.nextInt()) % i1; aflag[l1]; l1 = Math.abs(a_java_util_Random.nextInt()) % i1);
			aflag[l1] = true;
			a_int_array1d[i2] = 15 + 14 * (l1 % ((data.k.a() - 15) / 14));
			b_int_array1d[i2] = 30 + 5 * (l1 / ((data.k.a() - 15) / 14));
			int j1;
			switch (j1 = Math.abs(a_java_util_Random.nextInt()) % 3)
			{
			case 0: // '\0'
				c_int_array1d[i2] = 0x70035;
				break;

			case 1: // '\001'
				c_int_array1d[i2] = 0x70036;
				break;

			case 2: // '\002'
				c_int_array1d[i2] = 0x70037;
				break;
			}
		}

	}

	private void k()
	{
		m = 5 + Math.abs(a_java_util_Random.nextInt()) % 3;
		d_int_array1d = new int[m];
		e_int_array1d = new int[m];
		f_int_array1d = new int[m];
		g_int_array1d = new int[m];
		h_int_array1d = new int[m];
		a_boolean_array1d = new boolean[l];
		for (int i1 = 0; i1 < l; i1++)
			a_boolean_array1d[i1] = false;

		for (int k1 = 0; k1 < m; k1++)
		{
			int j1;
			for (j1 = 3 + Math.abs(a_java_util_Random.nextInt()) % (l - 3); a_boolean_array1d[j1] || a_int_array1d[j1] < 15 || a_int_array1d[j1] > data.k.a() - 7; j1 = 3 + Math.abs(a_java_util_Random.nextInt()) % (l - 3));
			a_boolean_array1d[j1] = true;
			d_int_array1d[k1] = a_int_array1d[j1];
			e_int_array1d[k1] = b_int_array1d[j1];
			f_int_array1d[k1] = 0;
			g_int_array1d[k1] = 0;
			h_int_array1d[k1] = 0;
		}

	}

	public final void d()
	{
		if (!a_boolean && !c_boolean && !a_data_p.aK)
		{
			if ((((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5)
				if (!b_boolean)
				{
					a_boolean = true;
					a_data_p.a_data_x.d = (a_data_p.a_data_x.c_int + 15) / 5 - 3;
					e_int = (a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d] * 10000) / (a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d] * a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]);
					f_int = a_data_p.a_data_x.e * b_int;
					g_int = 2 * a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d];
					a_data_p.a_data_x.a_long = ((((3000 / data.k.a()) * a_data_p.a_data_x.b_int_array1d[a_data_p.a_data_x.d]) / 100) * a_data_p.a_data_x.e * b_int) / 100 + ((((2000 / (data.k.b() - 50)) * a_data_p.a_data_x.a_int_array1d[a_data_p.a_data_x.d]) / 100) * a_data_p.a_data_x.e * b_int) / 100;
					a_data_p.G = 0L;
					i++;
					a_data_p.aw = true;
				} else
				{
					b_boolean = false;
				}
			if ((((k) (a_data_p)).bt & 4) != 0 || a_data_p.a_data_j.e == 2)
			{
				if (a_data_p.a_data_x.e < 100)
				{
					a_data_p.a_data_x.e += 2;
					return;
				}
			} else
			if ((((k) (a_data_p)).bt & 8) != 0 || a_data_p.a_data_j.e == 8)
			{
				if (a_data_p.a_data_x.e > 40)
				{
					a_data_p.a_data_x.e -= 2;
					return;
				}
			} else
			if ((((k) (a_data_p)).bt & 1) != 0 || a_data_p.a_data_j.e == 4)
			{
				if (a_data_p.a_data_x.c_int + 5 <= 70)
				{
					a_data_p.a_data_x.c_int += 5;
					return;
				}
			} else
			if (((((k) (a_data_p)).bt & 2) != 0 || a_data_p.a_data_j.e == 6) && a_data_p.a_data_x.c_int - 5 >= 10)
			{
				a_data_p.a_data_x.c_int -= 5;
				return;
			}
		} else
		{
			a_data_p.aK = false;
		}
	}

	private void l()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0011, data.k.a() >> 1, data.k.b() / 3);
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(89), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
	}

	private void m()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(91), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
	}
}
