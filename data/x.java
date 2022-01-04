// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

// Referenced classes of package data:
//			aa, ac, ad, j, 
//			k, p, w

public final class x
{

	private p a_data_p;
	public boolean a_boolean;
	public int a_int;
	public int b_int;
	public boolean b_boolean;
	public int c_int;
	public int a_int_array1d[] = {
		26, 34, 42, 50, 57, 64, 71, 77, 81, 87, 
		91, 94, 96, 98, 99, 100
	};
	public int b_int_array1d[] = {
		97, 94, 91, 87, 81, 77, 71, 64, 57, 50, 
		42, 34, 26, 17, 9, 0
	};
	public int d_int;
	public int e_int;
	public boolean c_boolean;
	private boolean d_boolean;
	private boolean e_boolean;
	public int c_int_array1d[];
	public long a_long;
	private boolean f_boolean;
	private boolean g_boolean;
	private boolean h_boolean;
	private boolean i_boolean;
	private boolean j_boolean;
	private boolean k_boolean;
	private int i_int;
	private int j_int;
	public int f_int;
	public int g_int;
	private int d_int_array1d[];
	private int k_int;
	private int l_int;
	private int m_int;
	private int n_int;
	private int e_int_array1d[];
	private int f_int_array1d[];
	private int o;
	private int p;
	private int q;
	private int r;
	private boolean l_boolean;
	private boolean m_boolean;
	private int s;
	private int t;
	private int u;
	private int g_int_array1d[] = {
		0x20063, 0, 0
	};
	private boolean n_boolean;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int A;
	private int B;
	private int C;
	private int D;
	private int E;
	private int h_int_array1d[];
	private int i_int_array1d[];
	private int j_int_array1d[];
	private int a_int_array2d[][];
	private int b_int_array2d[][];
	public int h_int;
	private int k_int_array1d[];
	public Random a_java_util_Random;

	public x(p p1)
	{
		a_boolean = false;
		a_int = 0;
		b_boolean = false;
		c_boolean = false;
		d_boolean = false;
		e_boolean = false;
		c_int_array1d = new int[9];
		a_long = 0L;
		f_boolean = false;
		g_boolean = true;
		h_boolean = false;
		i_boolean = true;
		j_boolean = true;
		k_boolean = false;
		i_int = 0;
		j_int = 0;
		d_int_array1d = new int[5];
		k_int = 0;
		l_int = 0;
		m_int = 0;
		e_int_array1d = new int[3];
		f_int_array1d = new int[3];
		o = 0;
		p = 0;
		q = 0;
		r = 0;
		l_boolean = true;
		m_boolean = true;
		s = 0;
		t = 0;
		u = 0;
		n_boolean = false;
		v = 0;
		B = 7;
		C = 0;
		D = 0;
		h_int = 0;
		a_java_util_Random = new Random();
		a_data_p = p1;
	}

	public final void a()
	{
		if (a_int == 0)
		{
			if (a_data_p.aw)
			{
				a_data_p.aw = false;
				a_data_p.v = 0L;
				i();
				a_data_p.a_data_aa.c();
			}
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				c_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
			}
			b_boolean = true;
			return;
		}
		if (a_data_p.aw)
		{
			a_data_p.aw = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			((k) (a_data_p)).a.setColor(26265);
			((k) (a_data_p)).a.fillRect(20, data.k.b() / 11 + 30, data.k.a() - 40, data.k.b() - 60 - (data.k.b() / 11) * 2);
		}
		((k) (a_data_p)).a.setColor(0xffffff);
		((k) (a_data_p)).a.drawLine((data.k.a() >> 1) + i_int, ((data.k.b() >> 1) - 3) + j_int, (data.k.a() >> 1) + 4 + (i_int / 3) * 2, (((data.k.b() >> 1) - 3) + (j_int / 3) * 2) - 20);
		((k) (a_data_p)).a.drawLine((data.k.a() >> 1) + 4 + (i_int / 3) * 2, ((data.k.b() >> 1) - 3 - 20) + (j_int / 3) * 2, (data.k.a() >> 1) + 4 + 3 + i_int / 3, ((data.k.b() >> 1) - 3 - 20 - 40) + j_int / 3);
		((k) (a_data_p)).a.drawLine((data.k.a() >> 1) + 4 + 3 + i_int / 3, ((data.k.b() >> 1) - 3 - 20 - 40) + j_int / 3, (data.k.a() >> 1) + 4 + 3 + 2, (data.k.b() >> 1) - 3 - 20 - 40 - 60 - 20);
		((k) (a_data_p)).a.drawLine((data.k.a() >> 1) + i_int, (data.k.b() >> 1) + 3 + j_int, (data.k.a() >> 1) + f_int + 1, ((data.k.b() >> 1) + g_int) - 7);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd000b, (data.k.a() >> 1) + i_int, (data.k.b() >> 1) + j_int);
		if (k_int < 3)
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd000c, (data.k.a() >> 1) + f_int, (data.k.b() >> 1) + g_int);
			k_int++;
		} else
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd000d, (data.k.a() >> 1) + f_int, (data.k.b() >> 1) + g_int);
			k_int++;
			if (k_int == 6)
				k_int = 0;
		}
		g();
		h();
		if (c_boolean)
		{
			a_boolean = true;
			a(0xd0008);
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				c_boolean = false;
				a_data_p.q_int_array1d[b_int]--;
				if (a_data_p.q_int_array1d[b_int] == 0)
				{
					for (int i1 = b_int; i1 < a_data_p.aB - 1; i1++)
					{
						a_data_p.m_byte_array1d[i1] = a_data_p.m_byte_array1d[i1 + 1];
						a_data_p.q_int_array1d[i1] = a_data_p.q_int_array1d[i1 + 1];
					}

					a_data_p.aB--;
				}
				for (int j1 = 0; j1 < a_data_p.n[14]; j1++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d / 100F;
					if (a_data_p.e < a_data_p.d)
						continue;
					a_data_p.e = a_data_p.d;
					break;
				}

				int l1;
				if ((l1 = a_data_p.m_int_array1d[14]) < 0)
				{
					l1 = -l1;
					for (int k2 = 0; k2 < l1; k2++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int l2 = 0; l2 < a_data_p.m_int_array1d[14]; l2++)
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
			b_boolean = true;
			a_data_p.a_data_aa.c();
		}
		if (e_boolean)
		{
			a_boolean = true;
			b(0xd0008);
			if (j_int > -data.k.a())
			{
				l_int = i_int;
				m_int = j_int;
				j_int = j_int - 12;
				a_data_p.v = 0L;
			}
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				e_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.a_data_ad.a = true;
				for (int k1 = 0; k1 < a_data_p.aB; k1++)
					if (a_data_p.m_byte_array1d[k1] == n_int)
					{
						a_data_p.q_int_array1d[k1] = a_data_p.q_int_array1d[k1] + 1;
						a_data_p.a_data_ad.a = false;
					}

				if (a_data_p.a_data_ad.a)
				{
					a_data_p.m_byte_array1d[a_data_p.aB] = (byte)n_int;
					a_data_p.q_int_array1d[a_data_p.aB] = 1;
					a_data_p.aB++;
				}
				a_data_p.q_int_array1d[b_int]--;
				if (a_data_p.q_int_array1d[b_int] == 0)
				{
					for (int i2 = b_int; i2 < a_data_p.aB - 1; i2++)
					{
						a_data_p.m_byte_array1d[i2] = a_data_p.m_byte_array1d[i2 + 1];
						a_data_p.q_int_array1d[i2] = a_data_p.q_int_array1d[i2 + 1];
					}

					a_data_p.aB--;
				}
				for (int j2 = 0; j2 < a_data_p.n[14]; j2++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d / 100F;
					if (a_data_p.e < a_data_p.d)
						continue;
					a_data_p.e = a_data_p.d;
					break;
				}

				int i3;
				if ((i3 = a_data_p.m_int_array1d[14]) < 0)
				{
					i3 = -i3;
					for (int j3 = 0; j3 < i3; j3++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int k3 = 0; k3 < a_data_p.m_int_array1d[14]; k3++)
					{
						a_data_p.c = a_data_p.c + a_data_p.d / 100F;
						if (a_data_p.c < a_data_p.d)
							continue;
						a_data_p.c = a_data_p.d;
						break;
					}

				}
			}
			b_boolean = true;
			a_data_p.a_data_aa.c();
		}
	}

	public final void b()
	{
		if (!e_boolean)
		{
			if ((((k) (a_data_p)).bt & 1) != 0 || a_data_p.a_data_j.e == 4)
			{
				if (i_int > -((data.k.a() >> 1) - 23))
				{
					i_int = i_int - 3;
					a_data_p.aw = true;
				}
			} else
			if ((((k) (a_data_p)).bt & 2) != 0 || a_data_p.a_data_j.e == 6)
			{
				if (i_int < (data.k.a() >> 1) - 23)
				{
					i_int = i_int + 3;
					a_data_p.aw = true;
				}
			} else
			if ((((k) (a_data_p)).bt & 4) != 0 || a_data_p.a_data_j.e == 2)
			{
				if (!d_boolean)
				{
					if (g_int > -((data.k.b() >> 1) - 37 - data.k.b() / 11))
						j_int = j_int - 3;
				} else
				{
					j_int = j_int - 3;
				}
				a_data_p.aw = true;
			} else
			if (((((k) (a_data_p)).bt & 8) != 0 || a_data_p.a_data_j.e == 8) && g_int < (data.k.b() >> 1) - 37 - data.k.b() / 11)
			{
				j_int = j_int + 3;
				a_data_p.aw = true;
			}
			if (!d_boolean)
			{
				if (s == 3)
				{
					j();
					s = 0;
				}
				s++;
			}
		}
		g_int = j_int + 3 + 17;
		f_int = a(i_int);
		if (d_boolean)
		{
			l_int = f_int;
			m_int = g_int;
			if (g_int < -((data.k.b() >> 1) - 37 - data.k.b() / 11))
			{
				e_boolean = true;
				a_data_p.v = 0L;
				d_boolean = false;
			}
		}
	}

	private int a(int i1)
	{
		for (int j1 = 0; j1 < 4; j1++)
			d_int_array1d[j1] = d_int_array1d[j1 + 1];

		d_int_array1d[4] = i1;
		return d_int_array1d[0];
	}

	private void g()
	{
		a_data_p.a_data_w.a(((k) (a_data_p)).a, g_int_array1d[v], (data.k.a() >> 1) + l_int, (data.k.b() >> 1) + m_int);
		if (d_boolean)
		{
			if (f_int >= 0)
			{
				g_int_array1d[0] = e_int_array1d[0];
				g_int_array1d[1] = e_int_array1d[1];
				g_int_array1d[2] = e_int_array1d[2];
				l_int = l_int + 1;
				f_int = l_int;
				i_int++;
				if (l_int >= (data.k.a() >> 1) - 23)
				{
					c_boolean = true;
					a_data_p.v = 0L;
					d_boolean = false;
				}
			} else
			{
				g_int_array1d[0] = f_int_array1d[0];
				g_int_array1d[1] = f_int_array1d[1];
				g_int_array1d[2] = f_int_array1d[2];
				l_int = l_int - 1;
				f_int = l_int;
				i_int--;
				if (l_int <= -((data.k.a() >> 1) - 23))
				{
					c_boolean = true;
					a_data_p.v = 0L;
					d_boolean = false;
				}
			}
			if (g_int >= -((data.k.b() >> 1) - 37 - data.k.b() / 11))
			{
				m_int = m_int + 1;
				g_int = m_int;
				j_int = g_int - 3 - 17;
				if (m_int >= (data.k.b() >> 1) - 37 - data.k.b() / 11)
				{
					c_boolean = true;
					a_data_p.v = 0L;
					d_boolean = false;
				}
			}
		}
		if (v == 2)
			v = 0;
		else
			v++;
		if (!n_boolean)
		{
			if (!c_boolean && !d_boolean)
			{
				g_int_array1d[0] = e_int_array1d[0];
				g_int_array1d[1] = e_int_array1d[1];
				g_int_array1d[2] = e_int_array1d[2];
			}
			if (!c_boolean)
			{
				if (!d_boolean)
				{
					if (l_int < data.k.a() / 2 && !e_boolean)
						l_int++;
					if (l_int == data.k.a() / 2)
						n_boolean = true;
				}
			} else
			{
				l_int = l_int + 4;
			}
		} else
		{
			if (!c_boolean && !d_boolean)
			{
				g_int_array1d[0] = f_int_array1d[0];
				g_int_array1d[1] = f_int_array1d[1];
				g_int_array1d[2] = f_int_array1d[2];
			}
			if (!c_boolean)
			{
				if (!d_boolean)
				{
					if (l_int > -(data.k.a() / 2) && !e_boolean)
						l_int--;
					if (l_int == -(data.k.a() / 2))
						n_boolean = false;
				}
			} else
			{
				l_int = l_int - 4;
			}
		}
		if (!d_boolean)
		{
			if (t == 0)
			{
				u = Math.abs(a_java_util_Random.nextInt()) % 20;
				t = 5 + Math.abs(a_java_util_Random.nextInt()) % (data.k.a() / 10);
			}
			if (u < 10)
			{
				if (m_int > -((data.k.b() >> 1) - 50 - data.k.b() / 11))
					m_int--;
			} else
			if (m_int < (data.k.b() >> 1) - 50 - data.k.b() / 11)
				m_int++;
			t--;
		}
		a_data_p.aw = true;
	}

	private void h()
	{
		if ((((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5)
		{
			if (f_int < l_int + (o >> 1) && f_int > l_int - (o >> 1))
				if (g_int < m_int + (p >> 1) && g_int > m_int - (p >> 1))
				{
					d_boolean = true;
					return;
				} else
				{
					c_boolean = true;
					a_data_p.v = 0L;
					return;
				}
			c_boolean = true;
			a_data_p.v = 0L;
		}
	}

	public final void a(int i1)
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_w.a(((k) (a_data_p)).a, i1, data.k.a() >> 1, data.k.b() / 3);
		if (i1 == 0xd0016)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0017, data.k.a() >> 1, data.k.b() / 3);
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(83), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
		a_data_p.a_data_aa.c();
	}

	private void i()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(85), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
	}

	private void b(int i1)
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_w.a(((k) (a_data_p)).a, i1, data.k.a() >> 1, data.k.b() / 3);
		switch (a_data_p.q_int)
		{
		case 0: // '\0'
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(84), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			return;

		case 1: // '\001'
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(86), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			break;
		}
	}

	private void j()
	{
		if (m_boolean)
		{
			if (r < 5)
				i_int = i_int + 1;
			if (r == 5)
				m_boolean = false;
			r++;
		} else
		{
			if (r > 0)
				i_int = i_int - 1;
			if (r == 0)
				m_boolean = true;
			r--;
		}
		if (l_boolean)
		{
			if (q < 3)
				j_int = j_int + 1;
			if (q == 3)
				l_boolean = false;
			q++;
			return;
		}
		if (q > 0)
			j_int = j_int - 1;
		if (q == 0)
			l_boolean = true;
		q--;
	}

	public final void c()
	{
		a_int = 0;
		b_int = -1;
		for (int i1 = 0; i1 < a_data_p.aB; i1++)
			if (a_data_p.m_byte_array1d[i1] == 90)
			{
				b_int = i1;
				a_int = a_data_p.q_int_array1d[i1];
			}

		if (a_int > 0)
		{
			c_boolean = false;
			a_data_p.v = 0L;
			d_boolean = false;
			l_int = -data.k.a() / 2 + 1;
			m_int = 0;
			f_int = 0;
			g_int = 0;
			i_int = 0;
			j_int = g_int - 3 - 17;
			int j1;
			switch (j1 = Math.abs(a_java_util_Random.nextInt()) % 4)
			{
			case 0: // '\0'
				n_int = 40;
				e_int_array1d[0] = 0x2001f;
				e_int_array1d[1] = 0x20020;
				e_int_array1d[2] = 0x20021;
				f_int_array1d[0] = 0x2001c;
				f_int_array1d[1] = 0x2001d;
				f_int_array1d[2] = 0x2001e;
				o = 16;
				p = 10;
				break;

			case 1: // '\001'
				n_int = 56;
				e_int_array1d[0] = 0x20025;
				e_int_array1d[1] = 0x20026;
				e_int_array1d[2] = 0x20027;
				f_int_array1d[0] = 0x20022;
				f_int_array1d[1] = 0x20023;
				f_int_array1d[2] = 0x20024;
				o = 16;
				p = 9;
				break;

			case 2: // '\002'
				n_int = 57;
				e_int_array1d[0] = 0x20019;
				e_int_array1d[1] = 0x2001a;
				e_int_array1d[2] = 0x2001b;
				f_int_array1d[0] = 0x20016;
				f_int_array1d[1] = 0x20017;
				f_int_array1d[2] = 0x20018;
				o = 16;
				p = 12;
				break;

			case 3: // '\003'
				n_int = 58;
				e_int_array1d[0] = 0x20063;
				e_int_array1d[1] = 0x20064;
				e_int_array1d[2] = 0x20065;
				f_int_array1d[0] = 0x20060;
				f_int_array1d[1] = 0x20061;
				f_int_array1d[2] = 0x20062;
				o = 20;
				p = 14;
				break;
			}
			for (int k1 = 0; k1 < 5; k1++)
				d_int_array1d[k1] = i_int;

			b_boolean = false;
			return;
		} else
		{
			a_data_p.aw = true;
			return;
		}
	}

	public final void d()
	{
		if (a_int == 0)
		{
			if (a_data_p.aw)
			{
				a_data_p.aw = false;
				a_data_p.v = 0L;
				o();
				a_data_p.a_data_aa.c();
			}
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				c_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
			}
			b_boolean = true;
			return;
		}
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b() - 44);
		((k) (a_data_p)).a.setColor(26265);
		((k) (a_data_p)).a.fillRect((data.k.a() >> 1) - (A >> 1), 35, A, data.k.b() - 80);
		if (g_boolean)
		{
			a_data_p.v = 0L;
			h_boolean = true;
			g_boolean = false;
		}
		if (h_boolean)
		{
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 4001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 4000L)
				h_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0012, data.k.a() >> 1, data.k.b() / 3);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(87), data.k.a() >> 1, (data.k.b() >> 1) - 6, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			a_data_p.a_data_aa.c();
		} else
		{
			l();
			k();
			if (!k_boolean || a_data_p.v <= 2000L)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, y, ((data.k.a() >> 1) + w) - 1, ((data.k.b() >> 1) + x) - 1);
			m();
			if (a_data_p.aw)
			{
				((k) (a_data_p)).a.setColor(13158);
				((k) (a_data_p)).a.fillRect(0, data.k.b() - 44, data.k.a(), 44);
				String s1 = (new Integer(D)).toString() + "/10";
				String s2 = (new Integer(B)).toString() + "/5";
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x20063, data.k.a() / 5, data.k.b() - 28);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s1), data.k.a() / 5 + 32, data.k.b() - 24, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0010, (data.k.a() / 5) * 3 + data.k.a() / 5 / 2, data.k.b() - 28);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, new StringBuffer(s2), (data.k.a() / 5) * 3 + data.k.a() / 5 / 2 + 32, data.k.b() - 24, 0xffff00, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				a_data_p.aw = false;
			}
			if (!f_boolean)
				if (B == 5)
				{
					((k) (a_data_p)).a.setColor(13158);
					((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
					if (D >= 10)
					{
						e_boolean = true;
					} else
					{
						B++;
						c_boolean = true;
					}
				} else
				if (D >= 10)
				{
					((k) (a_data_p)).a.setColor(13158);
					((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
					e_boolean = true;
				}
		}
		if (c_boolean)
		{
			a_boolean = true;
			a(0xd0012);
			if (j_boolean)
			{
				a_data_p.v = 0L;
				j_boolean = false;
			}
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 4001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 4000L)
			{
				c_boolean = false;
				a_data_p.q_int_array1d[b_int]--;
				if (a_data_p.q_int_array1d[b_int] == 0)
				{
					for (int i1 = b_int; i1 < a_data_p.aB - 1; i1++)
					{
						a_data_p.m_byte_array1d[i1] = a_data_p.m_byte_array1d[i1 + 1];
						a_data_p.q_int_array1d[i1] = a_data_p.q_int_array1d[i1 + 1];
					}

					a_data_p.aB--;
				}
				for (int j1 = 0; j1 < a_data_p.n[83]; j1++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d / 100F;
					if (a_data_p.e < a_data_p.d)
						continue;
					a_data_p.e = a_data_p.d;
					break;
				}

				int l1;
				if ((l1 = a_data_p.m_int_array1d[83]) < 0)
				{
					l1 = -l1;
					for (int j2 = 0; j2 < l1; j2++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int k2 = 0; k2 < a_data_p.m_int_array1d[83]; k2++)
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
			b_boolean = true;
			a_data_p.a_data_aa.c();
		}
		if (e_boolean)
		{
			a_boolean = true;
			b(0xd0012);
			if (j_boolean)
			{
				a_data_p.v = 0L;
				j_boolean = false;
			}
			if (b_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3))
			{
				a_data_p.v = 2001L;
				a_data_p.aK = true;
			}
			if (a_data_p.v > 2000L)
			{
				e_boolean = false;
				a_data_p.m_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.a_data_ad.a = true;
				int k1 = 0;
				int i2;
				switch (i2 = Math.abs(a_java_util_Random.nextInt()) % 3)
				{
				case 0: // '\0'
					k1 = 59;
					break;

				case 1: // '\001'
					k1 = 60;
					break;

				case 2: // '\002'
					k1 = 2;
					break;
				}
				for (int l2 = 0; l2 < a_data_p.aB; l2++)
					if (a_data_p.m_byte_array1d[l2] == k1)
					{
						a_data_p.q_int_array1d[l2] = a_data_p.q_int_array1d[l2] + 1;
						a_data_p.a_data_ad.a = false;
					}

				if (a_data_p.a_data_ad.a)
				{
					a_data_p.m_byte_array1d[a_data_p.aB] = (byte)k1;
					a_data_p.q_int_array1d[a_data_p.aB] = 1;
					a_data_p.aB++;
				}
				a_data_p.q_int_array1d[b_int]--;
				if (a_data_p.q_int_array1d[b_int] == 0)
				{
					for (int i3 = b_int; i3 < a_data_p.aB - 1; i3++)
					{
						a_data_p.m_byte_array1d[i3] = a_data_p.m_byte_array1d[i3 + 1];
						a_data_p.q_int_array1d[i3] = a_data_p.q_int_array1d[i3 + 1];
					}

					a_data_p.aB--;
				}
				for (int j3 = 0; j3 < a_data_p.n[83]; j3++)
				{
					a_data_p.e = a_data_p.e + a_data_p.d / 100F;
					if (a_data_p.e < a_data_p.d)
						continue;
					a_data_p.e = a_data_p.d;
					break;
				}

				int k3;
				if ((k3 = a_data_p.m_int_array1d[83]) < 0)
				{
					k3 = -k3;
					for (int l3 = 0; l3 < k3; l3++)
					{
						a_data_p.c = a_data_p.c - a_data_p.d / 100F;
						if (a_data_p.c > 0.0F)
							continue;
						a_data_p.a_data_ad.b();
						break;
					}

				} else
				{
					for (int i4 = 0; i4 < a_data_p.m_int_array1d[83]; i4++)
					{
						a_data_p.c = a_data_p.c + a_data_p.d / 100F;
						if (a_data_p.c < a_data_p.d)
							continue;
						a_data_p.c = a_data_p.d;
						break;
					}

				}
			}
			a_data_p.a_data_aa.c();
		}
		b_boolean = true;
	}

	public final void e()
	{
		if (!a_data_p.aK && !e_boolean && !f_boolean && !k_boolean && ((((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5))
		{
			B++;
			f_boolean = true;
			a_data_p.aw = true;
		}
	}

	private void k()
	{
		if (f_boolean)
			if (x + (z >> 1) >= (data.k.b() >> 1) - 45)
			{
				a_data_p.aw = true;
				if (i_boolean)
				{
					for (int i1 = 0; i1 < E; i1++)
						if (k_int_array1d[i1] == 1)
						{
							C++;
							k_int_array1d[i1] = 2;
						}

					D += C;
					a_data_p.v = 0L;
					k_boolean = true;
					i_boolean = false;
				}
				if (k_boolean)
				{
					if (a_data_p.v > 2000L)
					{
						k_boolean = false;
						a_data_p.aw = true;
						return;
					}
					if (a_data_p.v > 0L)
					{
						a_data_p.aw = false;
						return;
					}
				} else
				{
					x = (-(data.k.b() >> 1) + 35) - (z >> 1);
					f_boolean = false;
					C = 0;
					if (D < 10 && B < 5)
					{
						n();
						return;
					}
				}
			} else
			{
				i_boolean = true;
				x += 5;
			}
	}

	private void l()
	{
		if (D < 10 && B < 6)
		{
			for (int i1 = 0; i1 < E; i1++)
				if (k_int_array1d[i1] != 2)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array2d[i1][h_int], h_int_array1d[i1], i_int_array1d[i1]);
					if (!k_boolean)
					{
						if (k_int_array1d[i1] != 1)
						{
							if (j_int_array1d[i1] > 0)
							{
								if (h_int_array1d[i1] + 8 + j_int_array1d[i1] >= data.k.a() + 70)
									c(i1);
								else
									h_int_array1d[i1] += j_int_array1d[i1];
							} else
							if ((h_int_array1d[i1] - 8) + j_int_array1d[i1] <= -70)
								c(i1);
							else
								h_int_array1d[i1] += j_int_array1d[i1];
						} else
						if (f_boolean)
							i_int_array1d[i1] += 5;
					} else
					if (k_int_array1d[i1] != 1)
					{
						if (h_int_array1d[i1] > data.k.a() >> 1)
						{
							if (j_int_array1d[i1] < 0)
							{
								for (int j1 = 0; j1 < 3; j1++)
									a_int_array2d[i1][j1] = b_int_array2d[i1][j1];

							}
							j_int_array1d[i1] = 10;
						} else
						{
							if (j_int_array1d[i1] > 0)
							{
								for (int k1 = 0; k1 < 3; k1++)
									a_int_array2d[i1][k1] = b_int_array2d[i1][k1];

							}
							j_int_array1d[i1] = -10;
						}
						h_int_array1d[i1] += j_int_array1d[i1];
					}
				}

			h_int++;
			if (h_int > 2)
				h_int = 0;
		}
	}

	private void m()
	{
		for (int i1 = 0; i1 < E; i1++)
			if (k_int_array1d[i1] == 0 && h_int_array1d[i1] > ((data.k.a() >> 1) + w) - (A >> 1) && h_int_array1d[i1] < (data.k.a() >> 1) + w + (A >> 1) && i_int_array1d[i1] > ((data.k.b() >> 1) + x) - (z >> 1) && i_int_array1d[i1] < (data.k.b() >> 1) + x + (z >> 1))
				k_int_array1d[i1] = 1;

	}

	public final void f()
	{
		a_int = 0;
		b_int = -1;
		for (int i1 = 0; i1 < a_data_p.aB; i1++)
			if (a_data_p.m_byte_array1d[i1] == 26)
			{
				b_int = i1;
				a_int = a_data_p.q_int_array1d[i1];
			}

		if (a_int > 0)
		{
			c_boolean = false;
			a_data_p.v = 0L;
			d_boolean = false;
			y = 0xd0010;
			z = 16;
			A = 32;
			n();
			w = 0;
			x = (-(data.k.b() >> 1) + 35) - (z >> 1);
			B = 0;
			C = 0;
			D = 0;
			b_boolean = true;
			g_boolean = true;
			i_boolean = true;
			j_boolean = true;
			f_boolean = false;
			a_data_p.aK = true;
			k_boolean = false;
			a_data_p.aw = false;
			return;
		} else
		{
			a_data_p.aw = true;
			return;
		}
	}

	private void n()
	{
		E = 3 + Math.abs(a_java_util_Random.nextInt()) % 5;
		h_int_array1d = new int[E];
		i_int_array1d = new int[E];
		j_int_array1d = new int[E];
		k_int_array1d = new int[E];
		a_int_array2d = new int[E][3];
		b_int_array2d = new int[E][3];
		for (int i1 = 0; i1 < E; i1++)
			c(i1);

	}

	private void c(int i1)
	{
		int j1;
		if ((j1 = Math.abs(a_java_util_Random.nextInt()) % 2) == 0)
			h_int_array1d[i1] = -Math.abs(a_java_util_Random.nextInt()) % 60;
		else
			h_int_array1d[i1] = data.k.a() + Math.abs(a_java_util_Random.nextInt()) % 60;
		i_int_array1d[i1] = 42 + Math.abs(a_java_util_Random.nextInt()) % (data.k.b() - 80 - 14);
		j_int_array1d[i1] = 2 + Math.abs(a_java_util_Random.nextInt()) % 3;
		if (j1 != 0)
			j_int_array1d[i1] = -j_int_array1d[i1];
		k_int_array1d[i1] = 0;
		int k1;
		if ((k1 = Math.abs(a_java_util_Random.nextInt()) % 100) < 45)
			if (j1 == 0)
			{
				a_int_array2d[i1][0] = 0x2003d;
				a_int_array2d[i1][1] = 0x2003e;
				a_int_array2d[i1][2] = 0x2003f;
				b_int_array2d[i1][0] = 0x2003a;
				b_int_array2d[i1][1] = 0x2003b;
				b_int_array2d[i1][2] = 0x2003c;
				return;
			} else
			{
				a_int_array2d[i1][0] = 0x2003a;
				a_int_array2d[i1][1] = 0x2003b;
				a_int_array2d[i1][2] = 0x2003c;
				b_int_array2d[i1][0] = 0x2003d;
				b_int_array2d[i1][1] = 0x2003e;
				b_int_array2d[i1][2] = 0x2003f;
				return;
			}
		if (k1 < 65)
			if (j1 == 0)
			{
				a_int_array2d[i1][0] = 0x20043;
				a_int_array2d[i1][1] = 0x20044;
				a_int_array2d[i1][2] = 0x20045;
				b_int_array2d[i1][0] = 0x20040;
				b_int_array2d[i1][1] = 0x20041;
				b_int_array2d[i1][2] = 0x20042;
				return;
			} else
			{
				a_int_array2d[i1][0] = 0x20040;
				a_int_array2d[i1][1] = 0x20041;
				a_int_array2d[i1][2] = 0x20042;
				b_int_array2d[i1][0] = 0x20043;
				b_int_array2d[i1][1] = 0x20044;
				b_int_array2d[i1][2] = 0x20045;
				return;
			}
		if (k1 < 75)
			if (j1 == 0)
			{
				a_int_array2d[i1][0] = 0x20019;
				a_int_array2d[i1][1] = 0x2001a;
				a_int_array2d[i1][2] = 0x2001b;
				b_int_array2d[i1][0] = 0x20016;
				b_int_array2d[i1][1] = 0x20017;
				b_int_array2d[i1][2] = 0x20018;
				return;
			} else
			{
				a_int_array2d[i1][0] = 0x20016;
				a_int_array2d[i1][1] = 0x20017;
				a_int_array2d[i1][2] = 0x20018;
				b_int_array2d[i1][0] = 0x20019;
				b_int_array2d[i1][1] = 0x2001a;
				b_int_array2d[i1][2] = 0x2001b;
				return;
			}
		if (k1 < 85)
			if (j1 == 0)
			{
				a_int_array2d[i1][0] = 0x2001f;
				a_int_array2d[i1][1] = 0x20020;
				a_int_array2d[i1][2] = 0x20021;
				b_int_array2d[i1][0] = 0x2001c;
				b_int_array2d[i1][1] = 0x2001d;
				b_int_array2d[i1][2] = 0x2001e;
				return;
			} else
			{
				a_int_array2d[i1][0] = 0x2001c;
				a_int_array2d[i1][1] = 0x2001d;
				a_int_array2d[i1][2] = 0x2001e;
				b_int_array2d[i1][0] = 0x2001f;
				b_int_array2d[i1][1] = 0x20020;
				b_int_array2d[i1][2] = 0x20021;
				return;
			}
		if (k1 < 100)
		{
			if (j1 == 0)
			{
				a_int_array2d[i1][0] = 0x20025;
				a_int_array2d[i1][1] = 0x20026;
				a_int_array2d[i1][2] = 0x20027;
				b_int_array2d[i1][0] = 0x20022;
				b_int_array2d[i1][1] = 0x20023;
				b_int_array2d[i1][2] = 0x20024;
				return;
			}
			a_int_array2d[i1][0] = 0x20022;
			a_int_array2d[i1][1] = 0x20023;
			a_int_array2d[i1][2] = 0x20024;
			b_int_array2d[i1][0] = 0x20025;
			b_int_array2d[i1][1] = 0x20026;
			b_int_array2d[i1][2] = 0x20027;
		}
	}

	private void o()
	{
		((k) (a_data_p)).a.setColor(13158);
		((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
		a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(88), data.k.a() >> 1, (data.k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
	}
}
