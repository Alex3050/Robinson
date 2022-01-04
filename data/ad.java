// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;


// Referenced classes of package data:
//			a, aa, ab, g, 
//			i, l, n, p, 
//			v, x, y

public final class ad
{

	private p a_data_p;
	private boolean b;
	private int a_int_array1d[];
	public boolean a_boolean;
	private long a_long;
	private boolean c;
	private int a_int;
	private boolean d;
	private byte a_byte_array1d[];
	private boolean e;
	private boolean f;

	public ad(p p1)
	{
		b = true;
		a_int_array1d = new int[120];
		a_boolean = true;
		a_long = 0L;
		c = false;
		a_int = 0;
		d = false;
		a_byte_array1d = new byte[120];
		e = true;
		f = true;
		a_data_p = p1;
	}

	public final void a()
	{
		int i1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.f_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.e * 100F) / a_data_p.d_float);
		a_data_p.af = true;
		a_boolean = true;
		if (a_data_p.f_byte_array1d[a_data_p.al] == 1)
		{
			for (int l1 = 0; l1 < a_data_p.av; l1++)
				if (a_data_p.a_byte_array1d[l1] == (byte)a_data_p.al)
				{
					a_data_p.g_int_array1d[l1] = a_data_p.g_int_array1d[l1] + 1;
					a_boolean = false;
				}

			if (a_boolean)
			{
				a_data_p.a_byte_array1d[a_data_p.av] = (byte)a_data_p.al;
				a_data_p.g_int_array1d[a_data_p.av] = 1;
				a_data_p.av++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 0)
		{
			for (int i2 = 0; i2 < a_data_p.aB; i2++)
				if (a_data_p.m_byte_array1d[i2] == (byte)a_data_p.al)
				{
					a_data_p.q_int_array1d[i2] = a_data_p.q_int_array1d[i2] + 1;
					a_boolean = false;
				}

			if (a_boolean)
			{
				a_data_p.m_byte_array1d[a_data_p.aB] = (byte)a_data_p.al;
				a_data_p.q_int_array1d[a_data_p.aB] = 1;
				a_data_p.aB++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 3)
		{
			for (int j2 = 0; j2 < a_data_p.aw_int; j2++)
				if (a_data_p.a_java_lang_String_array1d[j2] == (new Integer(a_data_p.al)).toString())
				{
					a_data_p.h[j2] = a_data_p.h[j2] + 1;
					a_boolean = false;
				}

			if (a_boolean)
			{
				a_data_p.a_java_lang_String_array1d[a_data_p.aw_int] = a_data_p.b_java_lang_String_array1d[a_data_p.al];
				a_data_p.h[a_data_p.aw_int] = 1;
				a_data_p.aw_int++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 5)
		{
			for (int k2 = 0; k2 < a_data_p.aw_int; k2++)
				if (a_data_p.a_java_lang_String_array1d[k2] == a_data_p.b_java_lang_String_array1d[a_data_p.al])
				{
					a_data_p.h[k2] = a_data_p.h[k2] + 1;
					a_boolean = false;
				}

			if (a_boolean)
			{
				a_data_p.a_java_lang_String_array1d[a_data_p.aw_int] = a_data_p.b_java_lang_String_array1d[a_data_p.al];
				a_data_p.h[a_data_p.aw_int] = 1;
				a_data_p.aw_int++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 10)
		{
			for (int l2 = 0; l2 < a_data_p.H; l2++)
				if (a_data_p.a_int_array1d[l2] == a_data_p.al)
					a_boolean = false;

			if (a_boolean)
			{
				a_data_p.a_int_array1d[a_data_p.H] = a_data_p.al;
				a_data_p.H++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 7)
		{
			for (int i3 = 0; i3 < a_data_p.I; i3++)
				if (a_data_p.b_int_array1d[i3] == a_data_p.al)
					a_boolean = false;

			if (a_boolean)
			{
				a_data_p.b_int_array1d[a_data_p.I] = a_data_p.al;
				a_data_p.I++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 8)
		{
			for (int j3 = 0; j3 < a_data_p.J_int; j3++)
				if (a_data_p.c_int_array1d[j3] == a_data_p.al)
					a_boolean = false;

			if (a_boolean)
			{
				a_data_p.c_int_array1d[a_data_p.J_int] = a_data_p.al;
				a_data_p.J_int++;
			}
		} else
		if (a_data_p.f_byte_array1d[a_data_p.al] == 9)
		{
			for (int k3 = 0; k3 < a_data_p.K_int; k3++)
				if (a_data_p.d_int_array1d[k3] == a_data_p.al)
					a_boolean = false;

			if (a_boolean)
			{
				a_data_p.d_int_array1d[a_data_p.K_int] = a_data_p.al;
				a_data_p.K_int++;
			}
		} else
		{
			for (int l3 = 0; l3 < a_data_p.aB; l3++)
				if (a_data_p.m_byte_array1d[l3] == (byte)a_data_p.al)
				{
					a_data_p.q_int_array1d[l3] = a_data_p.q_int_array1d[l3] + 1;
					a_boolean = false;
				}

			if (a_boolean)
			{
				a_data_p.m_byte_array1d[a_data_p.aB] = (byte)a_data_p.al;
				a_data_p.q_int_array1d[a_data_p.aB] = 1;
				a_data_p.aB++;
			}
		}
		if (a_data_p.b_byte_array1d[a_data_p.al] != -1 && a_data_p.c_byte_array1d[a_data_p.al] == -1)
		{
			if (a_data_p.l_int_array1d[a_data_p.al] != 0)
			{
				if ((j1 += a_data_p.l_int_array1d[a_data_p.al]) > 100)
					j1 = 100;
				a_data_p.f_float = ((float)j1 * a_data_p.d_float) / 100F;
			}
			if (a_data_p.n_int_array1d[a_data_p.al] != 0)
			{
				if ((k1 += a_data_p.n_int_array1d[a_data_p.al]) > 100)
					k1 = 100;
				a_data_p.e = ((float)k1 * a_data_p.d_float) / 100F;
			}
			if (a_data_p.m_int_array1d[a_data_p.al] != 0)
			{
				int i4 = a_data_p.m_int_array1d[a_data_p.al];
				if ((i1 += i4) > 100)
					i1 = 100;
				if (i1 <= 0)
					b();
				a_data_p.c_float = ((float)i1 * a_data_p.d_float) / 100F;
			}
		}
		if (a_data_p.a_data_y.b(a_data_p.al))
		{
			a_data_p.F_long = 0L;
			a_data_p.aM = true;
			a_data_p.af = false;
		}
		if (a_data_p.af)
		{
			if (a_data_p.X)
			{
				if (a_data_p.f_byte_array1d[a_data_p.al] == 0)
					if (a_data_p.al == 93 || a_data_p.al == 21 || a_data_p.al == 38)
						a(a_data_p.P + 180);
					else
						c(a_data_p.P + 180);
				a_data_p.l_byte_array1d[a_data_p.P + 180] = 0;
			} else
			if (a_data_p.Y)
			{
				if (a_data_p.f_byte_array1d[a_data_p.al] == 0)
					if (a_data_p.al == 93 || a_data_p.al == 21 || a_data_p.al == 38)
						a(a_data_p.P + 180 + 2);
					else
						c(a_data_p.P + 180 + 2);
				a_data_p.l_byte_array1d[a_data_p.P + 180 + 2] = 0;
			} else
			if (a_data_p.V)
			{
				if (a_data_p.f_byte_array1d[a_data_p.al] == 0)
					if (a_data_p.al == 93 || a_data_p.al == 21 || a_data_p.al == 38)
						a(a_data_p.P + 1);
					else
						c(a_data_p.P + 1);
				a_data_p.l_byte_array1d[a_data_p.P + 1] = 0;
			} else
			if (a_data_p.W)
			{
				if (a_data_p.f_byte_array1d[a_data_p.al] == 0)
					if (a_data_p.al == 93 || a_data_p.al == 21 || a_data_p.al == 38)
						a(a_data_p.P + 360 + 1);
					else
						c(a_data_p.P + 360 + 1);
				a_data_p.l_byte_array1d[a_data_p.P + 360 + 1] = 0;
			}
			a_data_p.m_int = 0;
			a_data_p.a_data_aa.f();
			a_data_p.aw_boolean = true;
		}
	}

	public final void b()
	{
		a_data_p.l_int = 8;
		a_data_p.aw_boolean = true;
		a_data_p.c_boolean = false;
		a_data_p.y = 0L;
		a_data_p.r_int = 0;
		if (a_data_p.b_boolean)
		{
			a_data_p.r_int = 0;
			return;
		} else
		{
			a_data_p.r_int = 1;
			return;
		}
	}

	private void c(int i1)
	{
		a_data_p.s_int_array1d[a_data_p.aD] = a_data_p.a_short_array1d[i1];
		a_data_p.aD++;
		if (a_data_p.aD == 20)
			a_data_p.aD = 0;
	}

	private void w()
	{
		for (int i1 = 0; i1 < a_data_p.s_int_array1d.length; i1++)
			a_data_p.s_int_array1d[i1] = 0;

		a_data_p.aD = 0;
	}

	public final void a(int i1)
	{
		a_data_p.r_int_array1d[a_data_p.aC] = a_data_p.a_short_array1d[i1];
		a_data_p.aC++;
		if (a_data_p.aC == 70)
			a_data_p.aC = 0;
	}

	public final void c()
	{
		a_data_p.U = true;
		a_data_p.m_int = 0;
		a_data_p.n_int = 0;
		a_data_p.q_long = 0L;
	}

	public final void d()
	{
		if (a_data_p.q_long > 10000L)
		{
			a_data_p.U = false;
			a_data_p.q_long = 0L;
			b(30);
		}
	}

	public final void e()
	{
		if (a_data_p.u > 2000L)
		{
			a_data_p.aN = false;
			a_data_p.u = 0L;
			a_data_p.a_data_x.c();
			a_data_p.m_int = 7;
			a_data_p.q_int = 0;
			a_data_p.aw_boolean = true;
		}
	}

	public final void f()
	{
		if (!a_data_p.F_boolean)
		{
			if (a_data_p.aL)
			{
				a_long = a_data_p.J_long;
				a_data_p.aL = false;
			}
			if (a_data_p.J_long == a_long + 1L)
			{
				a_data_p.a_float = a_data_p.a_float - (a_data_p.d_float / 100F) * 10F;
				a_data_p.b_float = a_data_p.b_float - (a_data_p.d_float / 100F) * 14F;
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * 4F;
				if (a_data_p.a_float < 0.0F)
					a_data_p.a_float = 0.0F;
				if (a_data_p.b_float < 0.0F)
					a_data_p.b_float = 0.0F;
				if (a_data_p.c_float < 0.0F)
					a_data_p.c_float = 0.0F;
			}
			if (a_long < a_data_p.J_long)
				a_long = a_data_p.J_long;
			if (a_data_p.a_float == 0.0F || a_data_p.b_float == 0.0F || a_data_p.c_float == 0.0F)
			{
				a_data_p.l_int = 8;
				a_data_p.aw_boolean = true;
				a_data_p.c_boolean = false;
				a_data_p.y = 0L;
				a_data_p.r_int = 0;
				return;
			}
		} else
		if (a_data_p.aw_boolean)
		{
			a_data_p.a_float = a_data_p.d_float;
			a_data_p.b_float = a_data_p.d_float;
			a_data_p.c_float = a_data_p.d_float;
		}
	}

	public final void g()
	{
		int i1 = (int)((a_data_p.a_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.b_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		int l1 = (int)((a_data_p.f_float * 100F) / a_data_p.d_float);
		int i2 = (int)((a_data_p.e * 100F) / a_data_p.d_float);
		for (int j2 = 0; j2 < 120; j2++)
			if (a_data_p.m_byte_array1d[a_data_p.z] == (byte)j2)
				if (a_data_p.c_byte_array1d[j2] != -1 && a_data_p.c_byte_array1d[j2] != 0)
				{
					a_data_p.a_data_v.a(a_data_p.j[j2]);
					if ((i1 += a_data_p.j[j2]) > 100)
						i1 = 100;
					a_data_p.a_float = ((float)i1 * a_data_p.d_float) / 100F;
					if ((j1 += a_data_p.k_int_array1d[j2]) > 100)
						j1 = 100;
					a_data_p.b_float = ((float)j1 * a_data_p.d_float) / 100F;
					int k2 = a_data_p.m_int_array1d[j2];
					if ((k1 += k2) > 100)
						k1 = 100;
					if (k1 <= 0)
						b();
					a_data_p.c_float = ((float)k1 * a_data_p.d_float) / 100F;
					if (a_data_p.c_byte_array1d[j2] != 0 || a_data_p.c_byte_array1d[j2] != -1)
					{
						if (a_data_p.l_int_array1d[j2] != 0)
						{
							if ((l1 += a_data_p.l_int_array1d[j2]) > 100)
								l1 = 100;
							a_data_p.f_float = ((float)l1 * a_data_p.d_float) / 100F;
						}
						if (a_data_p.n_int_array1d[j2] != 0)
						{
							if ((i2 += a_data_p.n_int_array1d[j2]) > 100)
								i2 = 100;
							a_data_p.e = ((float)i2 * a_data_p.d_float) / 100F;
						}
						if (a_data_p.m_int_array1d[j2] != 0)
						{
							int i3 = a_data_p.m_int_array1d[j2];
							if ((k1 += i3) > 100)
								k1 = 100;
							if (k1 <= 0)
								b();
							a_data_p.c_float = ((float)k1 * a_data_p.d_float) / 100F;
						}
					}
					h();
				} else
				{
					if (a_data_p.j[j2] != -1)
					{
						a_data_p.a_data_v.a(a_data_p.j[j2]);
						if ((i1 += a_data_p.j[j2]) > 100)
							i1 = 100;
						a_data_p.a_float = ((float)i1 * a_data_p.d_float) / 100F;
						h();
					}
					if (a_data_p.k_int_array1d[j2] != -1)
					{
						if ((j1 += a_data_p.k_int_array1d[j2]) > 100)
							j1 = 100;
						a_data_p.b_float = ((float)j1 * a_data_p.d_float) / 100F;
						h();
					}
					if (a_data_p.m_int_array1d[j2] != 0)
					{
						int l2 = a_data_p.m_int_array1d[j2];
						if ((k1 += l2) > 100)
							k1 = 100;
						if (k1 <= 0)
							b();
						a_data_p.c_float = ((float)k1 * a_data_p.d_float) / 100F;
						h();
					}
				}

	}

	public final void h()
	{
		boolean flag = false;
		int l1 = -1;
		int i2 = -1;
		int j2 = -1;
		boolean flag1 = true;
		if (!a_data_p.ay)
		{
			if (a_data_p.q_int_array1d[a_data_p.z] > 1)
			{
				int i1 = a_data_p.q_int_array1d[a_data_p.z];
				i1--;
				a_data_p.q_int_array1d[a_data_p.z] = i1;
				for (int k2 = 0; k2 <= 120; k2++)
				{
					if (a_data_p.m_byte_array1d[a_data_p.z] != k2)
						continue;
					l1 = k2;
					break;
				}

				if (a_data_p.c_byte_array1d[l1] == 3)
				{
					if (a_data_p.a_data_n.a >= 5)
					{
						for (int i3 = 0; i3 <= a_data_p.aB; i3++)
						{
							if (a_data_p.m_byte_array1d[i3] != 3)
								continue;
							i2 = i3;
							break;
						}

						a_data_p.q_int_array1d[i2]--;
						if (a_data_p.q_int_array1d[i2] == 0)
						{
							for (int l3 = 0; l3 <= a_data_p.aB; l3++)
							{
								a_byte_array1d[l3] = a_data_p.m_byte_array1d[l3];
								a_int_array1d[l3] = a_data_p.q_int_array1d[l3];
							}

							for (int k4 = i2; k4 < a_data_p.aB - 1; k4++)
							{
								a_data_p.m_byte_array1d[k4] = a_byte_array1d[k4 + 1];
								a_data_p.q_int_array1d[k4] = a_int_array1d[k4 + 1];
							}

							a_data_p.aB--;
							a_data_p.z--;
							if (a_data_p.z < 0)
								a_data_p.z = 0;
							else
							if (a_data_p.au > 0)
								a_data_p.au--;
						}
						a_data_p.a_data_n.a = 0;
					} else
					{
						a_data_p.a_data_n.a++;
					}
				} else
				if (a_data_p.c_byte_array1d[l1] != 0 && a_data_p.c_byte_array1d[l1] != -1 && a_data_p.c_byte_array1d[l1] != 3)
				{
					for (int j3 = 0; j3 <= a_data_p.aB; j3++)
					{
						if (a_data_p.m_byte_array1d[j3] != a_data_p.c_byte_array1d[l1])
							continue;
						j2 = j3;
						flag1 = false;
						break;
					}

					if (!flag1)
						if (a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]] > 1)
						{
							int j1 = a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]];
							j1--;
							a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]] = j1;
						} else
						{
							for (int i4 = 0; i4 <= a_data_p.aB; i4++)
							{
								a_byte_array1d[i4] = a_data_p.m_byte_array1d[i4];
								a_int_array1d[i4] = a_data_p.q_int_array1d[i4];
							}

							for (int l4 = j2; l4 < a_data_p.aB - 1; l4++)
							{
								a_data_p.m_byte_array1d[l4] = a_byte_array1d[l4 + 1];
								a_data_p.q_int_array1d[l4] = a_int_array1d[l4 + 1];
							}

							a_data_p.aB--;
							a_data_p.z--;
							if (a_data_p.z < 0)
								a_data_p.z = 0;
							else
							if (a_data_p.au > 0)
								a_data_p.au--;
						}
				}
				a_data_p.ay = true;
				a_data_p.n_int = 0;
				a_data_p.a_data_aa.f();
				a_data_p.a_data_a.j();
				a_data_p.aw_boolean = true;
				return;
			}
			for (int l2 = 0; l2 <= 120; l2++)
			{
				if (a_data_p.m_byte_array1d[a_data_p.z] != l2)
					continue;
				l1 = l2;
				break;
			}

			for (int k3 = 0; k3 <= a_data_p.aB; k3++)
			{
				a_byte_array1d[k3] = a_data_p.m_byte_array1d[k3];
				a_int_array1d[k3] = a_data_p.q_int_array1d[k3];
			}

			for (int j4 = a_data_p.z; j4 < a_data_p.aB - 1; j4++)
			{
				a_data_p.m_byte_array1d[j4] = a_byte_array1d[j4 + 1];
				a_data_p.q_int_array1d[j4] = a_int_array1d[j4 + 1];
			}

			a_data_p.aB--;
			a_data_p.z--;
			if (a_data_p.z < 0)
				a_data_p.z = 0;
			else
			if (a_data_p.au > 0)
				a_data_p.au--;
			if (a_data_p.c_byte_array1d[l1] == 3)
			{
				if (a_data_p.a_data_n.a >= 5)
				{
					for (int i5 = 0; i5 <= a_data_p.aB; i5++)
					{
						if (a_data_p.m_byte_array1d[i5] != 3)
							continue;
						i2 = i5;
						break;
					}

					a_data_p.q_int_array1d[i2]--;
					if (a_data_p.q_int_array1d[i2] == 0)
					{
						for (int k5 = 0; k5 <= a_data_p.aB; k5++)
						{
							a_byte_array1d[k5] = a_data_p.m_byte_array1d[k5];
							a_int_array1d[k5] = a_data_p.q_int_array1d[k5];
						}

						for (int i6 = i2; i6 < a_data_p.aB - 1; i6++)
						{
							a_data_p.m_byte_array1d[i6] = a_byte_array1d[i6 + 1];
							a_data_p.q_int_array1d[i6] = a_int_array1d[i6 + 1];
						}

						a_data_p.aB--;
						a_data_p.z--;
						if (a_data_p.z < 0)
							a_data_p.z = 0;
						else
						if (a_data_p.au > 0)
							a_data_p.au--;
					}
					a_data_p.a_data_n.a = 0;
				} else
				{
					a_data_p.a_data_n.a++;
				}
			} else
			if (a_data_p.c_byte_array1d[l1] != 0 && a_data_p.c_byte_array1d[l1] != -1 && a_data_p.c_byte_array1d[l1] != 3)
			{
				for (int j5 = 0; j5 <= a_data_p.aB; j5++)
				{
					if (a_data_p.m_byte_array1d[j5] != a_data_p.c_byte_array1d[l1])
						continue;
					j2 = j5;
					flag1 = false;
					break;
				}

				if (!flag1)
					if (a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]] > 1)
					{
						int k1 = a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]];
						k1--;
						a_data_p.q_int_array1d[a_data_p.c_byte_array1d[l1]] = k1;
					} else
					{
						for (int l5 = 0; l5 <= a_data_p.aB; l5++)
						{
							a_byte_array1d[l5] = a_data_p.m_byte_array1d[l5];
							a_int_array1d[l5] = a_data_p.q_int_array1d[l5];
						}

						for (int j6 = j2; j6 < a_data_p.aB - 1; j6++)
						{
							a_data_p.m_byte_array1d[j6] = a_byte_array1d[j6 + 1];
							a_data_p.q_int_array1d[j6] = a_int_array1d[j6 + 1];
						}

						a_data_p.aB--;
						a_data_p.z--;
						if (a_data_p.z < 0)
							a_data_p.z = 0;
						else
						if (a_data_p.au > 0)
							a_data_p.au--;
					}
			}
			a_data_p.ay = true;
			a_data_p.n_int = 0;
			a_data_p.a_data_aa.f();
			a_data_p.a_data_a.j();
		}
	}

	public final void i()
	{
		if (!a_data_p.ay)
		{
			if (a_data_p.h[a_data_p.w] > 1)
			{
				int i1 = a_data_p.h[a_data_p.w];
				i1--;
				a_data_p.h[a_data_p.w] = i1;
				a_data_p.p = 0;
				a_data_p.ay = true;
				return;
			}
			for (int j1 = 0; j1 <= a_data_p.aw_int; j1++)
				a_byte_array1d[j1] = (byte)Integer.parseInt(a_data_p.a_java_lang_String_array1d[j1]);

			for (int k1 = a_data_p.w; k1 < a_data_p.aw_int - 1; k1++)
				a_data_p.a_java_lang_String_array1d[k1] = (new Integer(a_byte_array1d[k1 + 1])).toString();

			a_data_p.ay = true;
			a_data_p.w = 0;
			a_data_p.aw_int--;
			a_data_p.p = 0;
			a_data_p.a_data_aa.f();
			a_data_p.a_data_a.j();
		}
	}

	public final void j()
	{
		int i1 = (int)((a_data_p.a_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.b_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		int l1 = (int)((a_data_p.f_float * 100F) / a_data_p.d_float);
		int i2 = (int)((a_data_p.e * 100F) / a_data_p.d_float);
		if (a_data_p.X)
			a_int = a_data_p.P + 180;
		else
		if (a_data_p.Y)
			a_int = a_data_p.P + 180 + 2;
		else
		if (a_data_p.V)
			a_int = a_data_p.P + 1;
		else
		if (a_data_p.W)
			a_int = a_data_p.P + 360 + 1;
		for (int j2 = 0; j2 < 120; j2++)
			if (a_data_p.l_byte_array1d[a_int] == a_data_p.i[j2])
			{
				if (a_data_p.j[j2] != -1)
				{
					if ((i1 += a_data_p.j[j2]) > 100)
						i1 = 100;
					a_data_p.a_float = ((float)i1 * a_data_p.d_float) / 100F;
					d = true;
				}
				if (a_data_p.k_int_array1d[j2] != -1)
				{
					if ((j1 += a_data_p.k_int_array1d[j2]) > 100)
						j1 = 100;
					a_data_p.b_float = ((float)j1 * a_data_p.d_float) / 100F;
					d = true;
				}
				if (a_data_p.m_int_array1d[j2] != 0)
				{
					int k2 = a_data_p.m_int_array1d[j2];
					if ((k1 += k2) > 100)
						k1 = 100;
					if (k1 <= 0)
					{
						b();
						return;
					}
					a_data_p.c_float = ((float)k1 * a_data_p.d_float) / 100F;
					d = true;
				}
				if (a_data_p.c_byte_array1d[j2] != 0 || a_data_p.c_byte_array1d[j2] != -1)
				{
					if (a_data_p.l_int_array1d[j2] != 0)
					{
						if ((l1 += a_data_p.l_int_array1d[j2]) > 100)
							l1 = 100;
						a_data_p.f_float = ((float)l1 * a_data_p.d_float) / 100F;
					}
					if (a_data_p.n_int_array1d[j2] != 0)
					{
						if ((i2 += a_data_p.n_int_array1d[j2]) > 100)
							i2 = 100;
						a_data_p.e = ((float)i2 * a_data_p.d_float) / 100F;
					}
					if (a_data_p.m_int_array1d[j2] != 0)
					{
						int l2 = a_data_p.m_int_array1d[j2];
						if ((k1 += l2) > 100)
							k1 = 100;
						if (k1 <= 0)
						{
							b();
							return;
						}
						a_data_p.c_float = ((float)k1 * a_data_p.d_float) / 100F;
					}
				}
				if (d)
				{
					a_data_p.a_data_v.a(a_data_p.j[j2]);
					if (a_data_p.X)
						a_data_p.l_byte_array1d[a_data_p.P + 180] = 0;
					else
					if (a_data_p.Y)
						a_data_p.l_byte_array1d[a_data_p.P + 180 + 2] = 0;
					else
					if (a_data_p.V)
						a_data_p.l_byte_array1d[a_data_p.P + 1] = 0;
					else
					if (a_data_p.W)
						a_data_p.l_byte_array1d[a_data_p.P + 360 + 1] = 0;
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
					d = false;
					a_data_p.aw_boolean = true;
				}
			}

	}

	public final void b(int i1)
	{
		int j1;
		if ((j1 = (j1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float)) + i1) > 100)
			j1 = 100;
		if (j1 <= 0)
			b();
		a_data_p.c_float = ((float)j1 * a_data_p.d_float) / 100F;
	}

	public final void k()
	{
		b = true;
		for (int i1 = 0; i1 < a_data_p.av; i1++)
		{
			if (a_data_p.a_byte_array1d[i1] != a_data_p.ao)
				continue;
			b = false;
			a_data_p.z = i1;
			a_data_p.au = (i1 + 1) - a_data_p.as;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
			break;
		}

		if (b)
		{
			a_data_p.a_byte_array1d[a_data_p.av] = (byte)a_data_p.ao;
			a_data_p.g_int_array1d[a_data_p.av] = 1;
			a_data_p.av++;
			a_data_p.z = a_data_p.av - 1;
			a_data_p.au = a_data_p.av - a_data_p.as;
			a_data_p.v = a_data_p.av - 1;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
		}
		l();
	}

	public final void l()
	{
		int i1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.f_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.e * 100F) / a_data_p.d_float);
		if (a_data_p.m_int_array1d[a_data_p.ao] != 0)
		{
			int l1 = a_data_p.m_int_array1d[a_data_p.ao];
			if ((i1 += l1) > 100)
				i1 = 100;
			if (i1 <= 0)
				b();
			a_data_p.c_float = ((float)i1 * a_data_p.d_float) / 100F;
		}
		if (a_data_p.l_int_array1d[a_data_p.ao] != 0)
		{
			if ((j1 += a_data_p.l_int_array1d[a_data_p.ao]) > 100)
				j1 = 100;
			a_data_p.f_float = ((float)j1 * a_data_p.d_float) / 100F;
		}
		if (a_data_p.n_int_array1d[a_data_p.ao] != 0)
		{
			if ((k1 += a_data_p.n_int_array1d[a_data_p.ao]) > 100)
				k1 = 100;
			a_data_p.e = ((float)k1 * a_data_p.d_float) / 100F;
		}
	}

	public final void m()
	{
		b = true;
		for (int i1 = 0; i1 < a_data_p.aw_int; i1++)
		{
			if (!a_data_p.a_java_lang_String_array1d[i1].equals(a_data_p.b_java_lang_String_array1d[a_data_p.ao]))
				continue;
			b = false;
			a_data_p.z = i1;
			a_data_p.au = (i1 + 1) - a_data_p.as;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
			break;
		}

		if (b)
		{
			a_data_p.a_java_lang_String_array1d[a_data_p.aw_int] = a_data_p.b_java_lang_String_array1d[a_data_p.ao];
			a_data_p.h[a_data_p.aw_int] = 1;
			a_data_p.aw_int++;
			a_data_p.z = a_data_p.aw_int - 1;
			a_data_p.au = a_data_p.aw_int - a_data_p.as;
			a_data_p.w = a_data_p.aw_int - 1;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
		}
		l();
	}

	public final void n()
	{
		b = true;
		for (int i1 = 0; i1 < a_data_p.aB; i1++)
		{
			if (a_data_p.m_byte_array1d[i1] != a_data_p.ao)
				continue;
			a_data_p.q_int_array1d[i1] = a_data_p.q_int_array1d[i1] + 1;
			b = false;
			a_data_p.z = i1;
			a_data_p.au = (i1 + 1) - a_data_p.as;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
			break;
		}

		if (b)
		{
			a_data_p.m_byte_array1d[a_data_p.aB] = (byte)a_data_p.ao;
			a_data_p.q_int_array1d[a_data_p.aB] = 1;
			a_data_p.aB++;
			a_data_p.z = a_data_p.aB - 1;
			a_data_p.au = a_data_p.aB - a_data_p.as;
			if (a_data_p.au < 0)
				a_data_p.au = 0;
		}
		l();
	}

	public final void a(String s1)
	{
		if (s1.equals("hat"))
		{
			b = true;
			for (int i1 = 0; i1 < a_data_p.H; i1++)
				if (a_data_p.a_int_array1d[i1] == a_data_p.ao)
					b = false;

			if (b)
			{
				a_data_p.a_int_array1d[a_data_p.H] = a_data_p.ao;
				a_data_p.H++;
			}
		} else
		if (s1.equals("shirt"))
		{
			b = true;
			for (int j1 = 0; j1 < a_data_p.I; j1++)
				if (a_data_p.b_int_array1d[j1] == a_data_p.ao)
					b = false;

			if (b)
			{
				a_data_p.b_int_array1d[a_data_p.I] = a_data_p.ao;
				a_data_p.I++;
			}
		} else
		if (s1.equals("trousers"))
		{
			b = true;
			for (int k1 = 0; k1 < a_data_p.J_int; k1++)
				if (a_data_p.c_int_array1d[k1] == a_data_p.ao)
					b = false;

			if (b)
			{
				a_data_p.c_int_array1d[a_data_p.J_int] = a_data_p.ao;
				a_data_p.J_int++;
			}
		} else
		if (s1.equals("shoes"))
		{
			b = true;
			for (int l1 = 0; l1 < a_data_p.K_int; l1++)
				if (a_data_p.d_int_array1d[l1] == a_data_p.ao)
					b = false;

			if (b)
			{
				a_data_p.d_int_array1d[a_data_p.K_int] = a_data_p.ao;
				a_data_p.K_int++;
			}
		}
		l();
	}

	public final void o()
	{
		if (a_data_p.an == 1)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			return;
		}
		if (a_data_p.an == 2)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			a(a_data_p.a_byte_array2d[a_data_p.ao][2], a_data_p.a_data_aa.v);
			return;
		}
		if (a_data_p.an == 3)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			a(a_data_p.a_byte_array2d[a_data_p.ao][2], a_data_p.a_data_aa.v);
			a(a_data_p.a_byte_array2d[a_data_p.ao][4], a_data_p.a_data_aa.w);
			return;
		}
		if (a_data_p.an == 4)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			a(a_data_p.a_byte_array2d[a_data_p.ao][2], a_data_p.a_data_aa.v);
			a(a_data_p.a_byte_array2d[a_data_p.ao][4], a_data_p.a_data_aa.w);
			a(a_data_p.a_byte_array2d[a_data_p.ao][6], a_data_p.a_data_aa.x);
			return;
		}
		if (a_data_p.an == 5)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			a(a_data_p.a_byte_array2d[a_data_p.ao][2], a_data_p.a_data_aa.v);
			a(a_data_p.a_byte_array2d[a_data_p.ao][4], a_data_p.a_data_aa.w);
			a(a_data_p.a_byte_array2d[a_data_p.ao][6], a_data_p.a_data_aa.x);
			a(a_data_p.a_byte_array2d[a_data_p.ao][8], a_data_p.a_data_aa.y);
			return;
		}
		if (a_data_p.an == 6)
		{
			a(a_data_p.a_byte_array2d[a_data_p.ao][0], a_data_p.a_data_aa.u);
			a(a_data_p.a_byte_array2d[a_data_p.ao][2], a_data_p.a_data_aa.v);
			a(a_data_p.a_byte_array2d[a_data_p.ao][4], a_data_p.a_data_aa.w);
			a(a_data_p.a_byte_array2d[a_data_p.ao][6], a_data_p.a_data_aa.x);
			a(a_data_p.a_byte_array2d[a_data_p.ao][8], a_data_p.a_data_aa.y);
			a(a_data_p.a_byte_array2d[a_data_p.ao][10], a_data_p.a_data_aa.z);
		}
	}

	private void a(byte byte0, int i1)
	{
		int j1 = 0;
		for (int k1 = 0; k1 <= a_data_p.aB; k1++)
		{
			a_byte_array1d[k1] = a_data_p.m_byte_array1d[k1];
			a_int_array1d[k1] = a_data_p.q_int_array1d[k1];
		}

		for (int l1 = 0; l1 < a_data_p.aB; l1++)
			if (a_data_p.m_byte_array1d[l1] == byte0)
				j1 = l1;

		if (a_int_array1d[j1] > i1)
		{
			int i2;
			i2 = (i2 = a_int_array1d[j1]) - i1;
			a_data_p.q_int_array1d[j1] = i2;
			return;
		}
		for (int j2 = j1; j2 < a_data_p.aB - 1; j2++)
		{
			a_data_p.m_byte_array1d[j2] = a_byte_array1d[j2 + 1];
			a_data_p.q_int_array1d[j2] = a_int_array1d[j2 + 1];
		}

		a_data_p.aB--;
		if (a_data_p.au > 0)
			a_data_p.au--;
		a_data_p.z--;
	}

	public final void p()
	{
		if (a_data_p.J_long >= 0L && a_data_p.J_long <= 5L || a_data_p.J_long >= 12L && a_data_p.J_long <= 17L || a_data_p.J_long >= 24L && a_data_p.J_long <= 29L || a_data_p.J_long >= 36L && a_data_p.J_long <= 41L || a_data_p.J_long >= 48L && a_data_p.J_long <= 53L)
		{
			if (a_data_p.r_boolean)
			{
				a_data_p.s_boolean = true;
				if (!e)
				{
					if (a_data_p.m_int == 0)
						a_data_p.aK = true;
				} else
				{
					e = false;
				}
				a_data_p.r_boolean = false;
				a_data_p.a_data_g.a(a_data_p.r_boolean);
				r();
				x();
				a(a_data_p.a_data_g.a_data_l_array1d, a_data_p.a_data_g.i);
				a(a_data_p.a_data_g.b, a_data_p.a_data_g.j);
				a(a_data_p.a_data_g.c, a_data_p.a_data_g.k);
				a_data_p.g_long = 0L;
				return;
			}
		} else
		if ((a_data_p.J_long >= 6L && a_data_p.J_long <= 11L || a_data_p.J_long >= 18L && a_data_p.J_long <= 23L || a_data_p.J_long >= 30L && a_data_p.J_long <= 35L || a_data_p.J_long >= 42L && a_data_p.J_long <= 47L || a_data_p.J_long >= 54L && a_data_p.J_long <= 59L) && !a_data_p.r_boolean)
		{
			a_data_p.s_boolean = true;
			if (!e)
			{
				if (a_data_p.m_int == 0)
					a_data_p.aK = true;
			} else
			{
				e = false;
			}
			a_data_p.r_boolean = true;
			a_data_p.a_data_g.a(a_data_p.r_boolean);
			r();
			x();
			a(a_data_p.a_data_g.a_data_l_array1d, a_data_p.a_data_g.i);
			a(a_data_p.a_data_g.b, a_data_p.a_data_g.j);
			a(a_data_p.a_data_g.c, a_data_p.a_data_g.k);
			a_data_p.a_data_y.b();
			a_data_p.g_long = 0L;
		}
	}

	public final void q()
	{
		if (a_data_p.ab_int < 0)
			a_data_p.ab_int = 0;
		if (a_data_p.ab_int > 180 - a_data_p.N)
			a_data_p.ab_int = 180 - a_data_p.N;
		if (a_data_p.ac_int < 0)
			a_data_p.ac_int = 0;
		if (a_data_p.ac_int > 180 - a_data_p.O)
			a_data_p.ac_int = 180 - a_data_p.O - 1;
	}

	public final void r()
	{
		if (!f && a_data_p.a_data_g.a(a_data_p.Z_int, a_data_p.aa_int) == 5 || a_data_p.a_data_g.a(a_data_p.Z_int, a_data_p.aa_int) == 6)
		{
			boolean flag = false;
			boolean aflag[][] = new boolean[31][31];
			for (int i1 = 0; i1 < 31; i1++)
			{
				for (int j1 = 0; j1 < 31; j1++)
					aflag[i1][j1] = false;

			}

			boolean flag1 = false;
			aflag[15][15] = true;
			if (a_data_p.Z_int > 169 && a_data_p.Z_int < 176 && a_data_p.aa_int > 104 && a_data_p.aa_int < 113)
			{
				a_data_p.ae = 0;
				a_data_p.aa_int = 101;
				a_data_p.ad = 0;
				a_data_p.Z_int = 166;
				a_data_p.ac_int = a_data_p.aa_int - a_data_p.O / 2;
				a_data_p.ab_int = a_data_p.Z_int - a_data_p.N / 2;
				return;
			}
			for (int k1 = 1; k1 < 15; k1++)
			{
				for (int l1 = a_data_p.aa_int - k1; l1 <= a_data_p.aa_int + k1; l1++)
					if (l1 > -1 && l1 < 180)
					{
						for (int i2 = a_data_p.Z_int - k1; i2 <= a_data_p.Z_int + k1; i2++)
							if (i2 > -1 && i2 < 180 && !aflag[15 + (i2 - a_data_p.Z_int)][15 + (l1 - a_data_p.aa_int)])
							{
								if (a_data_p.a_data_g.b(i2, l1) == 0 && a_data_p.a_data_g.c(i2, l1) == 0 && a_data_p.a_data_g.d(i2, l1) == 0 && a_data_p.a_data_g.a(i2, l1) == 4)
								{
									if ((l1 == a_data_p.aa_int - k1 || l1 == a_data_p.aa_int + k1) && i2 < a_data_p.Z_int && a_data_p.a_data_g.b(a_data_p.Z_int, l1) == 0 && a_data_p.a_data_g.c(a_data_p.Z_int, l1) == 0 && a_data_p.a_data_g.d(a_data_p.Z_int, l1) == 0 && a_data_p.a_data_g.a(a_data_p.Z_int, l1) == 4)
									{
										a_data_p.ae = 0;
										a_data_p.aa_int = l1;
										a_data_p.ad = 0;
										a_data_p.Z_int = a_data_p.Z_int;
										if (a_data_p.aa_int > a_data_p.O / 2 && a_data_p.aa_int < 180 - a_data_p.O / 2)
											a_data_p.ac_int = a_data_p.aa_int - a_data_p.O / 2;
										if (a_data_p.Z_int > a_data_p.N / 2 && a_data_p.Z_int < 180 - a_data_p.N / 2)
											a_data_p.ab_int = a_data_p.Z_int - a_data_p.N / 2;
										return;
									}
									if ((i2 == a_data_p.Z_int - k1 || i2 == a_data_p.Z_int + k1) && l1 < a_data_p.aa_int && a_data_p.a_data_g.b(i2, a_data_p.aa_int) == 0 && a_data_p.a_data_g.c(i2, a_data_p.aa_int) == 0 && a_data_p.a_data_g.d(i2, a_data_p.aa_int) == 0 && a_data_p.a_data_g.a(i2, a_data_p.aa_int) == 4)
									{
										a_data_p.ae = 0;
										a_data_p.aa_int = a_data_p.aa_int;
										a_data_p.ad = 0;
										a_data_p.Z_int = i2;
										if (a_data_p.aa_int > a_data_p.O / 2 && a_data_p.aa_int < 180 - a_data_p.O / 2)
											a_data_p.ac_int = a_data_p.aa_int - a_data_p.O / 2;
										if (a_data_p.Z_int > a_data_p.N / 2 && a_data_p.Z_int < 180 - a_data_p.N / 2)
											a_data_p.ab_int = a_data_p.Z_int - a_data_p.N / 2;
										return;
									}
									a_data_p.ae = 0;
									a_data_p.aa_int = l1;
									a_data_p.ad = 0;
									a_data_p.Z_int = i2;
									if (a_data_p.aa_int > a_data_p.O / 2 && a_data_p.aa_int < 180 - a_data_p.O / 2)
										a_data_p.ac_int = a_data_p.aa_int - a_data_p.O / 2;
									if (a_data_p.Z_int > a_data_p.N / 2 && a_data_p.Z_int < 180 - a_data_p.N / 2)
										a_data_p.ab_int = a_data_p.Z_int - a_data_p.N / 2;
									return;
								}
								aflag[15 + (i2 - a_data_p.Z_int)][15 + (l1 - a_data_p.aa_int)] = true;
							}

					}

			}

		}
		f = false;
	}

	private void a(l al[], int i1)
	{
		for (int j1 = 0; j1 < i1; j1++)
			if (a_data_p.k_byte_array1d[al[j1].d * 180 + al[j1].c] > 4 && a_data_p.k_byte_array1d[al[j1].d * 180 + al[j1].c] < 7)
			{
				a_data_p.l_byte_array1d[al[j1].d * 180 + al[j1].c] = 0;
				al[j1].c = al[j1].a;
				al[j1].d = al[j1].b;
			}

	}

	private void x()
	{
		for (int i1 = 0; i1 < a_data_p.a_data_g.r; i1++)
		{
			boolean flag = false;
			if (a_data_p.k_byte_array1d[a_data_p.a_data_g.a_data_i_array1d[i1].b * 180 + a_data_p.a_data_g.a_data_i_array1d[i1].a] < 5)
			{
				a_data_p.l_byte_array1d[a_data_p.a_data_g.a_data_i_array1d[i1].b * 180 + a_data_p.a_data_g.a_data_i_array1d[i1].a] = 0;
				for (int j1 = 0; j1 < 10; j1++)
				{
					if (flag)
						break;
					for (int k1 = 0; k1 < 10; k1++)
					{
						if (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1 > 0 && a_data_p.a_data_g.a_data_i_array1d[i1].a - j1 < 180 && a_data_p.a_data_g.a_data_i_array1d[i1].b - k1 > 0 && a_data_p.a_data_g.a_data_i_array1d[i1].b - k1 < 180 && a_data_p.k_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1)] > 4 && a_data_p.k_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1)] < 7 && a_data_p.a_data_g.e((a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1), 1) && a_data_p.a_data_g.d((a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1), 1) && a_data_p.a_data_g.c((a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1), 1))
						{
							a_data_p.l_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b - k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a - j1)] = 56;
							a_data_p.a_data_g.a_data_i_array1d[i1].a = a_data_p.a_data_g.a_data_i_array1d[i1].a - j1;
							a_data_p.a_data_g.a_data_i_array1d[i1].b = a_data_p.a_data_g.a_data_i_array1d[i1].b - k1;
							flag = true;
						}
						if (flag)
							break;
						if (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1 > 0 && a_data_p.a_data_g.a_data_i_array1d[i1].a + j1 < 180 && a_data_p.a_data_g.a_data_i_array1d[i1].b + k1 > 0 && a_data_p.a_data_g.a_data_i_array1d[i1].b + k1 < 180 && a_data_p.k_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1)] > 4 && a_data_p.k_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1)] < 7 && a_data_p.a_data_g.e((a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1), 1) && a_data_p.a_data_g.d((a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1), 1) && a_data_p.a_data_g.c((a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1), 1))
						{
							a_data_p.l_byte_array1d[(a_data_p.a_data_g.a_data_i_array1d[i1].b + k1) * 180 + (a_data_p.a_data_g.a_data_i_array1d[i1].a + j1)] = 56;
							a_data_p.a_data_g.a_data_i_array1d[i1].a = a_data_p.a_data_g.a_data_i_array1d[i1].a + j1;
							a_data_p.a_data_g.a_data_i_array1d[i1].b = a_data_p.a_data_g.a_data_i_array1d[i1].b + k1;
							flag = true;
						}
						if (flag)
							break;
					}

				}

			}
		}

	}

	public final void s()
	{
		if (a_data_p.K_long == 4L && !c)
		{
			w();
			a_data_p.a_data_g.a("BIGislandObjects", a_data_p.l_byte_array1d);
			a_data_p.a_data_y.b();
			a_data_p.a_data_g.d();
			c = true;
		}
		if (a_data_p.K_long != 4L)
			c = false;
	}

	public final void t()
	{
		a_data_p.a_data_g.a("BIGislandObjects", a_data_p.l_byte_array1d);
		a_data_p.a_data_g.d();
		a_data_p.a_data_y.b();
	}

	public final void u()
	{
		if (a_data_p.X)
		{
			a_data_p.a_data_ab.a(4);
			a_data_p.l_byte_array1d[a_data_p.P + 180] = 0;
		} else
		if (a_data_p.Y)
		{
			a_data_p.a_data_ab.b(4);
			a_data_p.l_byte_array1d[a_data_p.P + 180 + 2] = 0;
		} else
		if (a_data_p.V)
		{
			a_data_p.a_data_ab.c(4);
			a_data_p.l_byte_array1d[a_data_p.P + 1] = 0;
		} else
		if (a_data_p.W)
		{
			a_data_p.a_data_ab.d(4);
			a_data_p.l_byte_array1d[a_data_p.P + 360 + 1] = 0;
		}
		if (a_data_p.f_int_array1d[94] == 0x60008)
		{
			a_data_p.X = true;
			a_data_p.Y = false;
		} else
		{
			a_data_p.X = false;
			a_data_p.Y = true;
		}
		a_data_p.T = true;
	}

	public final void v()
	{
		a_data_p.T = false;
		if (a_data_p.X)
			a_data_p.f_int_array1d[94] = 0x60008;
		else
			a_data_p.f_int_array1d[94] = 0x60009;
		if (a_data_p.Z_boolean)
		{
			a_data_p.l_byte_array1d[a_data_p.P + 180 + 1] = 95;
			a_data_p.a_data_ab.a(4);
			a_data_p.b_long = a_data_p.P + 180 + 1;
			return;
		}
		if (a_data_p.aa_boolean)
		{
			a_data_p.l_byte_array1d[a_data_p.P + 180 + 1] = 95;
			a_data_p.a_data_ab.b(4);
			a_data_p.b_long = a_data_p.P + 180 + 1;
			return;
		}
		if (a_data_p.ab_boolean)
		{
			a_data_p.l_byte_array1d[a_data_p.P + 180 + 1] = 95;
			a_data_p.a_data_ab.c(4);
			a_data_p.b_long = a_data_p.P + 180 + 1;
			return;
		}
		if (a_data_p.ac_boolean)
		{
			a_data_p.l_byte_array1d[a_data_p.P + 180 + 1] = 95;
			a_data_p.a_data_ab.d(4);
			a_data_p.b_long = a_data_p.P + 180 + 1;
		}
	}
}
