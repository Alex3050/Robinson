// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;


// Referenced classes of package data:
//			g, j, k, p, 
//			w

public final class ab
{

	private p a_data_p;
	private int a_int;
	private int b_int;
	private int c_int_array1d[] = {
		0, 0, 0, 0, 0
	};
	private int d_int_array1d[] = {
		0, -1, 0, -1, 0
	};
	private int e_int_array1d[] = {
		3, 0, 0, 0, 0
	};
	private int f_int_array1d[] = {
		-1, 0, -1, 0, -1
	};
	private int g_int_array1d[] = {
		-3, 0, 0, 0, 0
	};
	private int h_int_array1d[] = {
		-1, 0, -1, 0, -1
	};
	public int a_int_array1d[] = {
		0, 0, 0, 0, 0
	};
	public int b_int_array1d[] = {
		0, -1, 0, -1, 0
	};
	private boolean a_boolean;
	private boolean b_boolean;
	private boolean c_boolean;
	private boolean d_boolean;
	private int c_int;
	private boolean e_boolean;
	private boolean f_boolean;
	private boolean g_boolean;
	private boolean h_boolean;
	private boolean i;
	private int d_int;
	private int e_int;
	private boolean j;
	private int f_int;
	private boolean k;
	private boolean l;
	private boolean m;
	private boolean n;

	public ab(p p1)
	{
		a_int = 0;
		b_int = 0;
		a_boolean = false;
		b_boolean = false;
		c_boolean = false;
		d_boolean = false;
		c_int = 0;
		e_boolean = false;
		f_boolean = false;
		g_boolean = false;
		h_boolean = false;
		i = true;
		d_int = 0;
		e_int = 0;
		j = false;
		f_int = 0;
		k = true;
		l = true;
		m = true;
		n = true;
		a_data_p = p1;
	}

	public final void a(int i1)
	{
		if (a_data_p.ab == 180 - a_data_p.N && a_data_p.Z <= (180 - a_data_p.N) + a_data_p.N / 2 || a_data_p.ab > 0 && a_data_p.ab < 180 - a_data_p.N)
		{
			if (a_data_p.B >= 25L)
			{
				a_boolean = true;
				a_data_p.U_int = a_data_p.U_int + a_data_p.aj;
				a_data_p.B = 0L;
				c_int = c_int + a_data_p.aj;
				if (c_int == a_data_p.M)
				{
					a_boolean = false;
					c_int = 0;
					a_data_p.ab--;
					a_data_p.U_int = 0;
				}
			}
			a_data_p.Z = a_data_p.ab + a_data_p.N / 2;
			if (e_boolean)
			{
				e_boolean = false;
				return;
			}
		} else
		if (a_data_p.B >= 25L)
		{
			a_boolean = true;
			a_data_p.ad = a_data_p.ad - a_data_p.aj;
			a_data_p.B = 0L;
			c_int = c_int - a_data_p.aj;
			if (c_int == -a_data_p.M)
			{
				a_boolean = false;
				c_int = 0;
				a_data_p.Z--;
				a_data_p.S--;
				a_data_p.ad = 0;
			}
		}
	}

	public final void b(int i1)
	{
		if (a_data_p.ab == 0 && a_data_p.Z >= a_data_p.N / 2 || a_data_p.ab > 0 && a_data_p.ab < 180 - a_data_p.N)
		{
			if (a_data_p.B >= 25L)
			{
				b_boolean = true;
				a_data_p.U_int = a_data_p.U_int - a_data_p.aj;
				a_data_p.B = 0L;
				c_int = c_int - a_data_p.aj;
				if (c_int == -a_data_p.M)
				{
					b_boolean = false;
					c_int = 0;
					a_data_p.ab++;
					a_data_p.U_int = 0;
				}
			}
			a_data_p.Z = a_data_p.ab + a_data_p.N / 2;
			if (f_boolean)
			{
				f_boolean = false;
				return;
			}
		} else
		if (a_data_p.B >= 25L)
		{
			b_boolean = true;
			a_data_p.ad = a_data_p.ad + a_data_p.aj;
			a_data_p.B = 0L;
			c_int = c_int + a_data_p.aj;
			if (c_int == a_data_p.M)
			{
				b_boolean = false;
				c_int = 0;
				a_data_p.Z++;
				a_data_p.S++;
				a_data_p.ad = 0;
			}
		}
	}

	public final void c(int i1)
	{
		if (a_data_p.ac == 180 - a_data_p.O - 1 && a_data_p.aa <= (180 - a_data_p.O) + (a_data_p.O - 1) / 2 || a_data_p.ac > 0 && a_data_p.ac < 180 - a_data_p.O - 1)
		{
			if (a_data_p.B >= 25L)
			{
				c_boolean = true;
				a_data_p.V_int = a_data_p.V_int + a_data_p.aj;
				a_data_p.B = 0L;
				c_int = c_int + a_data_p.aj;
				if (c_int == a_data_p.M)
				{
					c_boolean = false;
					c_int = 0;
					a_data_p.ac--;
					a_data_p.V_int = 0;
				}
			}
			a_data_p.aa = a_data_p.ac + a_data_p.O / 2;
			if (g_boolean)
			{
				g_boolean = false;
				return;
			}
		} else
		if (a_data_p.B >= 25L)
		{
			c_boolean = true;
			a_data_p.ae = a_data_p.ae - a_data_p.aj;
			a_data_p.B = 0L;
			c_int = c_int - a_data_p.aj;
			if (c_int == -a_data_p.M)
			{
				c_boolean = false;
				c_int = 0;
				a_data_p.aa--;
				a_data_p.T_int--;
				a_data_p.ae = 0;
			}
		}
	}

	public final void d(int i1)
	{
		if (a_data_p.ac == 0 && a_data_p.aa >= a_data_p.O / 2 || a_data_p.ac > 0 && a_data_p.ac < 180 - a_data_p.O - 1)
		{
			if (a_data_p.B >= 25L)
			{
				d_boolean = true;
				a_data_p.V_int = a_data_p.V_int - a_data_p.aj;
				a_data_p.B = 0L;
				c_int = c_int - a_data_p.aj;
				if (c_int == -a_data_p.M)
				{
					d_boolean = false;
					c_int = 0;
					a_data_p.ac++;
					a_data_p.V_int = 0;
				}
			}
			a_data_p.aa = a_data_p.ac + a_data_p.O / 2;
			if (h_boolean)
			{
				h_boolean = false;
				return;
			}
		} else
		if (a_data_p.B >= 25L)
		{
			d_boolean = true;
			a_data_p.ae = a_data_p.ae + a_data_p.aj;
			a_data_p.B = 0L;
			c_int = c_int + a_data_p.aj;
			if (c_int == a_data_p.M)
			{
				d_boolean = false;
				c_int = 0;
				a_data_p.aa++;
				a_data_p.T_int++;
				a_data_p.ae = 0;
			}
		}
	}

	private void e()
	{
		a_data_p.V_boolean = false;
		a_data_p.W = true;
		if (!a_data_p.T_boolean)
		{
			a_data_p.X = false;
			a_data_p.Y = false;
		}
		a_data_p.ag = 0;
		a_data_p.ah = 0;
		a_data_p.ai = 0;
		if (a_data_p.af < 4)
			a_data_p.af++;
		else
			a_data_p.af = 1;
		if (a_data_p.T_boolean && !i && ++d_int > 6)
			d_int = 0;
	}

	private void f()
	{
		a_data_p.V_boolean = true;
		a_data_p.W = false;
		if (!a_data_p.T_boolean)
		{
			a_data_p.X = false;
			a_data_p.Y = false;
		}
		a_data_p.af = 0;
		a_data_p.ah = 0;
		a_data_p.ai = 0;
		if (a_data_p.ag < 4)
			a_data_p.ag++;
		else
			a_data_p.ag = 1;
		if (a_data_p.T_boolean && !i && ++d_int > 6)
			d_int = 0;
	}

	private void g()
	{
		a_data_p.V_boolean = false;
		a_data_p.W = false;
		a_data_p.X = true;
		a_data_p.Y = false;
		a_data_p.ag = 0;
		a_data_p.af = 0;
		a_data_p.ai = 0;
		if (a_data_p.ah < 4)
			a_data_p.ah++;
		else
			a_data_p.ah = 1;
		if (a_data_p.T_boolean && !i && ++d_int > 6)
			d_int = 0;
	}

	private void h()
	{
		a_data_p.V_boolean = false;
		a_data_p.W = false;
		a_data_p.X = false;
		a_data_p.Y = true;
		a_data_p.ag = 0;
		a_data_p.af = 0;
		a_data_p.ah = 0;
		if (a_data_p.ai < 4)
			a_data_p.ai++;
		else
			a_data_p.ai = 1;
		if (a_data_p.T_boolean && !i && ++d_int > 6)
			d_int = 0;
	}

	private void i()
	{
		if (a_data_p.j > 400L)
		{
			if (e_int == 1)
				e_int = 0;
			else
				e_int = e_int + 1;
			a_data_p.j = 0L;
		}
	}

	public final void a()
	{
		a_int = (a_data_p.Z - a_data_p.ab) * a_data_p.M + a_data_p.M / 2 + a_data_p.ad;
		b_int = (a_data_p.aa - a_data_p.ac) * a_data_p.M + a_data_p.M + a_data_p.ae;
		if (a_data_p.f[18] != a_data_p.f[19] && !j)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90003, a_int, b_int);
		if (a_data_p.U_boolean)
		{
			if (f_int == 2)
				f_int = 0;
			if (f_int == 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90000, a_int, b_int);
			if (f_int == 1)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90001, a_int, b_int);
			if (a_data_p.s > 700L)
			{
				f_int++;
				a_data_p.s = 0L;
				return;
			}
		} else
		{
			if (a_data_p.aN)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90004, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90005, a_int, b_int);
			} else
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x30005 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x30000 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x3000a + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x3000f + a_data_p.ai, a_int, b_int);
			j();
			if (a_data_p.f[18] != a_data_p.f[19] && j)
			{
				i();
				if (e_int == 1)
				{
					if (a_data_p.X)
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90002, a_int, b_int);
						return;
					}
					if (a_data_p.Y)
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90002, a_int, b_int);
						return;
					} else
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90002, a_int, b_int);
						return;
					}
				}
				if (a_data_p.X)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90006, a_int, b_int);
					return;
				}
				if (a_data_p.Y)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90006, a_int, b_int);
					return;
				}
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90006, a_int, b_int);
			}
		}
	}

	private void j()
	{
		switch (a_data_p.d[a_data_p.G])
		{
		case 107: // 'k'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50091 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50082 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500a0 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500af + a_data_p.ai, a_int, b_int);
			break;

		case 108: // 'l'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500c3 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500b4 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500d2 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500e1 + a_data_p.ai, a_int, b_int);
			break;

		case 109: // 'm'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500c8 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500b9 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500d7 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500e6 + a_data_p.ai, a_int, b_int);
			break;

		case 110: // 'n'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500cd + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500be + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500dc + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500eb + a_data_p.ai, a_int, b_int);
			break;
		}
		switch (a_data_p.c[a_data_p.F])
		{
		case 103: // 'g'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50050 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50041 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5005f + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5006e + a_data_p.ai, a_int, b_int);
			break;

		case 104: // 'h'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50055 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50046 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50064 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50073 + a_data_p.ai, a_int, b_int);
			break;

		case 105: // 'i'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50087 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50078 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50096 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500a5 + a_data_p.ai, a_int, b_int);
			break;

		case 106: // 'j'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5008c + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5007d + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5009b + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500aa + a_data_p.ai, a_int, b_int);
			break;
		}
		switch (a_data_p.b[a_data_p.E])
		{
		case 99: // 'c'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5000f + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50000 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5001e + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5002d + a_data_p.ai, a_int, b_int);
			break;

		case 100: // 'd'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50014 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50005 + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50023 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50032 + a_data_p.ai, a_int, b_int);
			break;

		case 101: // 'e'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50019 + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5000a + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50028 + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50037 + a_data_p.ai, a_int, b_int);
			break;

		case 102: // 'f'
			if (a_data_p.V_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5004b + a_data_p.ag, a_int, b_int);
			else
			if (a_data_p.W)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5003c + a_data_p.af, a_int, b_int);
			else
			if (a_data_p.X)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5005a + a_data_p.ah, a_int, b_int);
			else
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50069 + a_data_p.ai, a_int, b_int);
			break;
		}
		switch (a_data_p.a_int_array1d[a_data_p.D])
		{
		default:
			break;

		case 111: // 'o'
			if (a_data_p.V_boolean)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f1, a_int + c_int_array1d[a_data_p.ag], b_int + d_int_array1d[a_data_p.ag]);
				return;
			}
			if (a_data_p.W)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f0, a_int + a_int_array1d[a_data_p.af], b_int + b_int_array1d[a_data_p.af]);
				return;
			}
			if (a_data_p.X)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f2, a_int + e_int_array1d[a_data_p.ah], b_int + f_int_array1d[a_data_p.ah]);
				return;
			}
			if (a_data_p.Y)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f3, a_int + g_int_array1d[a_data_p.ai], b_int + h_int_array1d[a_data_p.ai]);
				return;
			}
			break;

		case 112: // 'p'
			if (a_data_p.V_boolean)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f5, a_int + c_int_array1d[a_data_p.ag], b_int + d_int_array1d[a_data_p.ag]);
				return;
			}
			if (a_data_p.W)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f4, a_int + a_int_array1d[a_data_p.af], b_int + b_int_array1d[a_data_p.af]);
				return;
			}
			if (a_data_p.X)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f6, a_int + e_int_array1d[a_data_p.ah], b_int + f_int_array1d[a_data_p.ah]);
				return;
			}
			if (a_data_p.Y)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f7, a_int + g_int_array1d[a_data_p.ai], b_int + h_int_array1d[a_data_p.ai]);
				return;
			}
			break;

		case 113: // 'q'
			if (a_data_p.V_boolean)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f9, a_int + c_int_array1d[a_data_p.ag], b_int + d_int_array1d[a_data_p.ag]);
				return;
			}
			if (a_data_p.W)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f8, a_int + a_int_array1d[a_data_p.af], b_int + b_int_array1d[a_data_p.af]);
				return;
			}
			if (a_data_p.X)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fa, a_int + e_int_array1d[a_data_p.ah], b_int + f_int_array1d[a_data_p.ah]);
				return;
			}
			if (a_data_p.Y)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fb, a_int + g_int_array1d[a_data_p.ai], b_int + h_int_array1d[a_data_p.ai]);
				return;
			}
			break;

		case 114: // 'r'
			if (a_data_p.V_boolean)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fd, a_int + c_int_array1d[a_data_p.ag], b_int + d_int_array1d[a_data_p.ag]);
				return;
			}
			if (a_data_p.W)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fc, a_int + a_int_array1d[a_data_p.af], b_int + b_int_array1d[a_data_p.af]);
				return;
			}
			if (a_data_p.X)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fe, a_int + e_int_array1d[a_data_p.ah], b_int + f_int_array1d[a_data_p.ah]);
				return;
			}
			if (a_data_p.Y)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500ff, a_int + g_int_array1d[a_data_p.ai], b_int + h_int_array1d[a_data_p.ai]);
			break;
		}
	}

	public final void b()
	{
		a_int = (a_data_p.Z - a_data_p.ab) * a_data_p.M + a_data_p.M / 2 + a_data_p.ad;
		b_int = (a_data_p.aa - a_data_p.ac) * a_data_p.M + a_data_p.M + a_data_p.ae;
		if (a_data_p.X)
			if (d_int < 3)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60008, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x3000f, a_int, b_int);
				k();
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000a, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000e, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60011, a_int, b_int);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60008, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x30010, a_int, b_int);
				k();
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000a, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000c, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60011, a_int, b_int);
			}
		if (a_data_p.Y)
		{
			if (d_int < 3)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60009, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x3000a, a_int, b_int);
				k();
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000b, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000f, a_int, b_int);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60012, a_int, b_int);
				return;
			}
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60009, a_int, b_int);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x3000b, a_int, b_int);
			k();
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000b, a_int, b_int);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x6000d, a_int, b_int);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x60012, a_int, b_int);
		}
	}

	private void k()
	{
		if (a_data_p.X)
			if (d_int < 3)
			{
				switch (a_data_p.b[a_data_p.E])
				{
				case 99: // 'c'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5002d, a_int, b_int);
					break;

				case 100: // 'd'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50032, a_int, b_int);
					break;

				case 101: // 'e'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50037, a_int, b_int);
					break;

				case 102: // 'f'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50069, a_int, b_int);
					break;
				}
				switch (a_data_p.a_int_array1d[a_data_p.D])
				{
				case 111: // 'o'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f3, a_int + g_int_array1d[0], b_int + h_int_array1d[0]);
					break;

				case 112: // 'p'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f7, a_int + g_int_array1d[0], b_int + h_int_array1d[0]);
					break;

				case 113: // 'q'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fb, a_int + g_int_array1d[0], b_int + h_int_array1d[0]);
					break;

				case 114: // 'r'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500ff, a_int + g_int_array1d[0], b_int + h_int_array1d[0]);
					break;
				}
			} else
			{
				switch (a_data_p.b[a_data_p.E])
				{
				case 99: // 'c'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5002e, a_int, b_int);
					break;

				case 100: // 'd'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50033, a_int, b_int);
					break;

				case 101: // 'e'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50038, a_int, b_int);
					break;

				case 102: // 'f'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5006a, a_int, b_int);
					break;
				}
				switch (a_data_p.a_int_array1d[a_data_p.D])
				{
				case 111: // 'o'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f3, a_int + g_int_array1d[1], b_int + h_int_array1d[1]);
					break;

				case 112: // 'p'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f7, a_int + g_int_array1d[1], b_int + h_int_array1d[1]);
					break;

				case 113: // 'q'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fb, a_int + g_int_array1d[1], b_int + h_int_array1d[1]);
					break;

				case 114: // 'r'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500ff, a_int + g_int_array1d[1], b_int + h_int_array1d[1]);
					break;
				}
			}
		if (a_data_p.Y)
		{
			if (d_int < 3)
			{
				switch (a_data_p.b[a_data_p.E])
				{
				case 99: // 'c'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5001e, a_int, b_int);
					break;

				case 100: // 'd'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50023, a_int, b_int);
					break;

				case 101: // 'e'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50028, a_int, b_int);
					break;

				case 102: // 'f'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5005a, a_int, b_int);
					break;
				}
				switch (a_data_p.a_int_array1d[a_data_p.D])
				{
				case 111: // 'o'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f2, a_int + e_int_array1d[0], b_int + f_int_array1d[0]);
					break;

				case 112: // 'p'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f6, a_int + e_int_array1d[0], b_int + f_int_array1d[0]);
					break;

				case 113: // 'q'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fa, a_int + e_int_array1d[0], b_int + f_int_array1d[0]);
					break;

				case 114: // 'r'
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fe, a_int + e_int_array1d[0], b_int + f_int_array1d[0]);
					break;
				}
				return;
			}
			switch (a_data_p.b[a_data_p.E])
			{
			case 99: // 'c'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5001f, a_int, b_int);
				break;

			case 100: // 'd'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50024, a_int, b_int);
				break;

			case 101: // 'e'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x50029, a_int, b_int);
				break;

			case 102: // 'f'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x5005b, a_int, b_int);
				break;
			}
			switch (a_data_p.a_int_array1d[a_data_p.D])
			{
			case 111: // 'o'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f2, a_int + e_int_array1d[1], b_int + f_int_array1d[1]);
				return;

			case 112: // 'p'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500f6, a_int + e_int_array1d[1], b_int + f_int_array1d[1]);
				return;

			case 113: // 'q'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fa, a_int + e_int_array1d[1], b_int + f_int_array1d[1]);
				return;

			case 114: // 'r'
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x500fe, a_int + e_int_array1d[1], b_int + f_int_array1d[1]);
				break;
			}
		}
	}

	public final void c()
	{
		a_data_p.P = a_data_p.a_data_g.a(a_data_p.Z - 1, a_data_p.aa - 1);
		e(a_data_p.P + 180 + 1);
		if (!a_boolean && !b_boolean && !d_boolean && !c_boolean && !a_data_p.p)
		{
			if ((((k) (a_data_p)).bt & 1) != 0 || a_data_p.a_data_j.e == 4)
			{
				i = false;
				if (a_data_p.X)
				{
					if (a_data_p.P > 0)
					{
						if (!a_data_p.T_boolean)
							k = a_data_p.a_data_g.a(a_data_p.P + 180, 0);
						else
							k = a_data_p.a_data_g.b(a_data_p.P + 180, 0);
						l = a_data_p.a_data_g.e(a_data_p.P + 180, 0);
						m = a_data_p.a_data_g.d(a_data_p.P + 180, 0);
						n = a_data_p.a_data_g.c(a_data_p.P + 180, 0);
					}
					if (!a_data_p.w)
					{
						k = true;
						l = true;
						m = true;
						n = true;
					}
					if (k && l && m && n)
					{
						a(4);
						g();
						a_data_p.a_data_g.j();
						return;
					} else
					{
						a_data_p.ah = 0;
						return;
					}
				} else
				{
					a_data_p.ah = 0;
					a_data_p.V_boolean = false;
					a_data_p.W = false;
					a_data_p.X = true;
					a_data_p.Y = false;
					return;
				}
			}
			if ((((k) (a_data_p)).bt & 2) != 0 || a_data_p.a_data_j.e == 6)
			{
				i = false;
				if (a_data_p.Y)
				{
					if (a_data_p.P < 32400)
					{
						if (!a_data_p.T_boolean)
							k = a_data_p.a_data_g.a(a_data_p.P + 180 + 2, 1);
						else
							k = a_data_p.a_data_g.b(a_data_p.P + 180 + 2, 1);
						l = a_data_p.a_data_g.e(a_data_p.P + 180 + 2, 1);
						m = a_data_p.a_data_g.d(a_data_p.P + 180 + 2, 1);
						n = a_data_p.a_data_g.c(a_data_p.P + 180 + 2, 1);
					}
					if (!a_data_p.w)
					{
						k = true;
						l = true;
						m = true;
						n = true;
					}
					if (k && l && m && n)
					{
						b(4);
						h();
						a_data_p.a_data_g.j();
						return;
					} else
					{
						a_data_p.ai = 0;
						return;
					}
				} else
				{
					a_data_p.ai = 0;
					a_data_p.V_boolean = false;
					a_data_p.W = false;
					a_data_p.X = false;
					a_data_p.Y = true;
					return;
				}
			}
			if ((((k) (a_data_p)).bt & 4) != 0 || a_data_p.a_data_j.e == 2)
			{
				i = false;
				if (a_data_p.V_boolean)
				{
					if (a_data_p.P > 0)
					{
						if (!a_data_p.T_boolean)
							k = a_data_p.a_data_g.a(a_data_p.P + 1, 2);
						else
							k = a_data_p.a_data_g.b(a_data_p.P + 1, 2);
						l = a_data_p.a_data_g.e(a_data_p.P + 1, 2);
						m = a_data_p.a_data_g.d(a_data_p.P + 1, 2);
						n = a_data_p.a_data_g.c(a_data_p.P + 1, 2);
					}
					if (!a_data_p.w)
					{
						k = true;
						l = true;
						m = true;
						n = true;
					}
					if (k && l && m && n)
					{
						c(4);
						f();
						a_data_p.a_data_g.j();
						return;
					} else
					{
						a_data_p.ag = 0;
						return;
					}
				}
				a_data_p.ag = 0;
				a_data_p.V_boolean = true;
				a_data_p.W = false;
				if (!a_data_p.T_boolean)
				{
					a_data_p.X = false;
					a_data_p.Y = false;
					return;
				}
			} else
			if ((((k) (a_data_p)).bt & 8) != 0 || a_data_p.a_data_j.e == 8)
			{
				i = false;
				if (a_data_p.W)
				{
					if (a_data_p.P < 32400)
					{
						if (!a_data_p.T_boolean)
							k = a_data_p.a_data_g.a(a_data_p.P + 360 + 1, 3);
						else
							k = a_data_p.a_data_g.b(a_data_p.P + 360 + 1, 3);
						l = a_data_p.a_data_g.e(a_data_p.P + 360 + 1, 3);
						m = a_data_p.a_data_g.d(a_data_p.P + 360 + 1, 3);
						n = a_data_p.a_data_g.c(a_data_p.P + 360 + 1, 3);
					}
					if (!a_data_p.w)
					{
						k = true;
						l = true;
						m = true;
						n = true;
					}
					if (k && l && m && n)
					{
						d(4);
						e();
						a_data_p.a_data_g.j();
						return;
					} else
					{
						a_data_p.af = 0;
						return;
					}
				}
				a_data_p.af = 0;
				a_data_p.V_boolean = false;
				a_data_p.W = true;
				if (!a_data_p.T_boolean)
				{
					a_data_p.X = false;
					a_data_p.Y = false;
					return;
				}
			} else
			if (!i)
			{
				a_data_p.af = a_data_p.ag = a_data_p.ah = a_data_p.ai = 0;
				i = true;
				return;
			}
		} else
		{
			if (a_boolean)
			{
				if (a_data_p.P > 0)
				{
					if (!a_data_p.T_boolean)
						k = a_data_p.a_data_g.a(a_data_p.P + 180, 0);
					else
						k = a_data_p.a_data_g.b(a_data_p.P + 360, 0);
					l = a_data_p.a_data_g.e(a_data_p.P + 180, 0);
					m = a_data_p.a_data_g.d(a_data_p.P + 180, 0);
					n = a_data_p.a_data_g.c(a_data_p.P + 180, 0);
				}
				if (k && l && m && n)
				{
					a(4);
					g();
					a_data_p.a_data_g.j();
					return;
				} else
				{
					a_boolean = false;
					a_data_p.ah = 0;
					return;
				}
			}
			if (b_boolean)
			{
				if (a_data_p.P < 32400)
				{
					if (!a_data_p.T_boolean)
						k = a_data_p.a_data_g.a(a_data_p.P + 180 + 2, 1);
					else
						k = a_data_p.a_data_g.b(a_data_p.P + 180 + 2, 1);
					l = a_data_p.a_data_g.e(a_data_p.P + 180 + 2, 1);
					m = a_data_p.a_data_g.d(a_data_p.P + 180 + 2, 1);
					n = a_data_p.a_data_g.c(a_data_p.P + 180 + 2, 1);
				}
				if (k && l && m && n)
				{
					b(4);
					h();
					a_data_p.a_data_g.j();
					return;
				} else
				{
					b_boolean = false;
					a_data_p.ai = 0;
					return;
				}
			}
			if (d_boolean)
			{
				if (a_data_p.P < 32400)
				{
					if (!a_data_p.T_boolean)
						k = a_data_p.a_data_g.a(a_data_p.P + 360 + 1, 3);
					else
						k = a_data_p.a_data_g.b(a_data_p.P + 360 + 1, 3);
					l = a_data_p.a_data_g.e(a_data_p.P + 360 + 1, 3);
					m = a_data_p.a_data_g.d(a_data_p.P + 360 + 1, 3);
					n = a_data_p.a_data_g.c(a_data_p.P + 360 + 1, 3);
				}
				if (k && l && m && n)
				{
					d(4);
					e();
					a_data_p.a_data_g.j();
					return;
				} else
				{
					d_boolean = false;
					a_data_p.af = 0;
					return;
				}
			}
			if (c_boolean)
			{
				if (a_data_p.P > 0)
				{
					if (!a_data_p.T_boolean)
						k = a_data_p.a_data_g.a(a_data_p.P + 1, 2);
					else
						k = a_data_p.a_data_g.b(a_data_p.P + 1, 2);
					l = a_data_p.a_data_g.e(a_data_p.P + 1, 2);
					m = a_data_p.a_data_g.d(a_data_p.P + 1, 2);
					n = a_data_p.a_data_g.c(a_data_p.P + 1, 2);
				}
				if (k && l && m && n)
				{
					c(4);
					f();
					a_data_p.a_data_g.j();
					return;
				}
				c_boolean = false;
				a_data_p.ag = 0;
			}
		}
	}

	public final void d()
	{
		a_data_p.Y = true;
	}

	private void e(int i1)
	{
		if (a_data_p.k[i1] == a_data_p.e[4])
		{
			j = true;
			return;
		} else
		{
			j = false;
			return;
		}
	}
}
