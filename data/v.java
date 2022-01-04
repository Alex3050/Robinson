// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import Robinson.MyMidlet;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

// Referenced classes of package data:
//			a, aa, ab, ac, 
//			ad, c, g, j, 
//			k, n, p, r, 
//			s, t, w, x, 
//			y

public final class v
{

	private p a_data_p;
	public boolean a_boolean;
	public int a_int;
	private boolean b_boolean;
	private boolean c;
	public long a_long;
	private boolean d;
	private boolean e;
	private int b_int;

	public v(p p1)
	{
		a_boolean = false;
		a_int = -2;
		b_boolean = false;
		c = false;
		a_long = 0L;
		d = true;
		e = true;
		b_int = 39423;
		a_data_p = p1;
	}

	public final void a()
	{
		a_data_p.a_data_ad.s();
		a_data_p.a_data_g.h();
		if (a_data_p.z_boolean)
			a_data_p.a_data_g.g();
		if (a_data_p.y_boolean)
			a_data_p.a_data_g.f();
		if (a_data_p.x)
			a_data_p.a_data_y.e();
		if (a_data_p.B_boolean)
			a_data_p.a_data_r.g();
		a_data_p.a_data_g.i();
		a_data_p.a_data_y.f();
		a_data_p.a_data_c.b();
		a_data_p.a_data_c.c();
		a_data_p.a_data_c.a();
		a_data_p.a_data_aa.b();
		if (a_boolean)
			a_data_p.a_data_r.d();
		if (a_data_p.B_boolean)
			a_data_p.a_data_r.e();
		if (a_data_p.C_boolean)
			a_data_p.a_data_r.f();
	}

	public final void b()
	{
		switch (a_data_p.l_int)
		{
		default:
			break;

		case 0: // '\0'
			return;

		case 1: // '\001'
			if (!a_data_p.c_boolean)
				if (a_data_p.b_boolean)
					a_data_p.r_int = a_data_p.a_data_a.a(a_data_p.r_int, 0, a_data_p.b_int - 1);
				else
					a_data_p.r_int = a_data_p.a_data_a.a(a_data_p.r_int, 1, a_data_p.b_int - 1);
			a_data_p.a_data_a.e();
			return;

		case 11: // '\013'
			if (a_data_p.a_int == 1)
			{
				if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
				{
					a_data_p.ax_boolean = true;
					a_data_p.a_data_r.a(1);
					a_data_p.a_data_v.e();
					a_data_p.a_data_v.a(false);
					a_data_p.l_int = 1;
					return;
				}
				if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
				{
					a_data_p.l_int = 1;
					a_data_p.aw_boolean = true;
					return;
				}
				break;
			}
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
			{
				a_data_p.a_Robinson_MyMidlet.destroyApp(true);
				return;
			}
			if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
			{
				a_data_p.l_int = 1;
				a_data_p.aw_boolean = true;
				return;
			}
			break;

		case 2: // '\002'
			a_data_p.A = a_data_p.a_data_a.a(a_data_p.A, 0, 1);
			a_data_p.a_data_a.g();
			return;

		case 3: // '\003'
			a_data_p.d_int = a_data_p.a_data_a.a(a_data_p.d_int, 0, a_data_p.e_int - 1);
			if (a_data_p.hasPointerEvents() && a_data_p.d_int > a_data_p.e_int - 1)
				if (a_data_p.a_data_j.b)
				{
					a_data_p.d_int = ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue();
					a_data_p.a_data_j.b = false;
				} else
				{
					a_data_p.d_int = ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue();
				}
			a_data_p.a_data_a.a();
			a_data_p.a_data_a.f();
			return;

		case 10: // '\n'
			a_data_p.a_data_a.q();
			return;

		case 4: // '\004'
			a_data_p.a_data_a.q();
			return;

		case 5: // '\005'
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
			{
				a_data_p.l_int = 6;
				a_data_p.a();
			}
			if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
			{
				a_data_p.a_data_ad.r();
				a_data_p.a_data_t.a();
				a_data_p.a_data_t.b(a_data_p.aG_int);
				g();
				a_data_p.l_int = 1;
				a_data_p.a_data_aa.h();
				a_data_p.a();
				return;
			}
			break;

		case 6: // '\006'
			a_data_p.a_data_ad.f();
			switch (a_data_p.m_int)
			{
			default:
				break;

			case 2: // '\002'
				if (!a_data_p.aM)
				{
					a_data_p.a_data_a.h();
					a_data_p.a_data_a.i();
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 4) != 0 || (((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 3 || a_data_p.a_data_j.e == 2 || a_data_p.a_data_j.e == 8)
					{
						a_data_p.m_int = 0;
						a_data_p.a_data_aa.f();
						a_data_p.aK = true;
						a_data_p.aw_boolean = true;
					}
				}
				a_data_p.o_boolean = true;
				break;

			case 1: // '\001'
				if (a_data_p.n_int != 1 && !a_data_p.S && !a_data_p.v_boolean)
					a_data_p.s_int = a_data_p.a_data_a.b(a_data_p.s_int, 0, 5);
				switch (a_data_p.n_int)
				{
				default:
					break;

				case 0: // '\0'
					b_boolean = false;
					a_data_p.z_int = a_data_p.a_data_a.a(a_data_p.z_int, 0, a_data_p.aB_int - 1);
					a_data_p.a_data_a.b();
					a_data_p.a_data_a.a(0);
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.a_data_aa.f();
						a_data_p.z_int = 0;
						a_data_p.au_int = 0;
					}
					break;

				case 1: // '\001'
					a_data_p.a_data_a.h();
					a_data_p.a_data_a.i();
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 4) != 0 || (((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 3 || a_data_p.a_data_j.e == 2 || a_data_p.a_data_j.e == 8)
					{
						a_data_p.n_int = a_data_p.o_int;
						a_data_p.aw_boolean = true;
						a_data_p.aK = true;
					}
					break;

				case 2: // '\002'
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.n_int = 0;
						a_data_p.a_data_aa.f();
					}
					break;

				case 3: // '\003'
					if (a_data_p.v_boolean)
					{
						a_data_p.u = a_data_p.a_data_a.a(a_data_p.u, 0, 3);
						a_data_p.a_data_a.p();
						if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
						{
							a_data_p.v_boolean = false;
							a_data_p.u = -1;
							a_data_p.aw_boolean = true;
						}
						break;
					}
					if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
					{
						a_data_p.v_boolean = true;
						a_data_p.u = 0;
						a_data_p.aw_boolean = true;
					}
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.n_int = 0;
						a_data_p.a_data_aa.f();
					}
					break;

				case 4: // '\004'
					b_boolean = false;
					a_data_p.v_int = a_data_p.a_data_a.a(a_data_p.v_int, 0, a_data_p.av_int - 1);
					a_data_p.a_data_a.c();
					a_data_p.a_data_a.a(4);
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.n_int = 0;
						a_data_p.a_data_aa.f();
						a_data_p.v_int = 0;
						a_data_p.au_int = 0;
					}
					break;

				case 5: // '\005'
					if (a_data_p.S)
					{
						if ((((k) (a_data_p)).bu & 4) != 0)
						{
							if (a_data_p.R > 0)
								a_data_p.R = a_data_p.R - 60;
							a_data_p.aw_boolean = true;
							a_data_p.o_long = 0L;
							a_data_p.aI = true;
							if (a_data_p.aO_int - 3 > 0)
								a_data_p.aO_int = a_data_p.aO_int - 3;
						}
						if ((((k) (a_data_p)).bu & 8) != 0)
						{
							if (a_data_p.R < 120)
								a_data_p.R = a_data_p.R + 60;
							a_data_p.aw_boolean = true;
							a_data_p.o_long = 0L;
							a_data_p.aJ_boolean = true;
							if (a_data_p.aO_int + 3 <= 9)
								a_data_p.aO_int = a_data_p.aO_int + 3;
						}
						if ((((k) (a_data_p)).bu & 1) != 0)
						{
							if (a_data_p.Q > 0)
								a_data_p.Q = a_data_p.Q - 60;
							a_data_p.aw_boolean = true;
							a_data_p.o_long = 0L;
							a_data_p.aG_boolean = true;
							if (a_data_p.aO_int - 1 == 2 || a_data_p.aO_int - 1 == 1 || a_data_p.aO_int - 1 == 4 || a_data_p.aO_int - 1 == 5 || a_data_p.aO_int - 1 == 7 || a_data_p.aO_int - 1 == 8)
								a_data_p.aO_int = a_data_p.aO_int - 1;
						}
						if ((((k) (a_data_p)).bu & 2) != 0)
						{
							if (a_data_p.Q < 120)
								a_data_p.Q = a_data_p.Q + 60;
							a_data_p.aw_boolean = true;
							a_data_p.o_long = 0L;
							a_data_p.aH = true;
							if (a_data_p.aO_int + 1 == 2 || a_data_p.aO_int + 1 == 3 || a_data_p.aO_int + 1 == 5 || a_data_p.aO_int + 1 == 6 || a_data_p.aO_int + 1 == 8 || a_data_p.aO_int + 1 == 9)
								a_data_p.aO_int = a_data_p.aO_int + 1;
						}
						if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
						{
							a_data_p.S = false;
							a_data_p.aw_boolean = true;
						}
						break;
					}
					if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
					{
						a_data_p.S = true;
						a_data_p.aw_boolean = true;
					}
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.n_int = 0;
						a_data_p.a_data_aa.f();
					}
					break;

				case 6: // '\006'
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						a_data_p.n_int = 0;
						a_data_p.a_data_aa.f();
					}
					break;
				}
				a_data_p.o_boolean = true;
				break;

			case 0: // '\0'
				a_data_p.o_boolean = false;
				b_boolean = true;
				a_data_p.az = true;
				if (!a_data_p.aK && !a_data_p.aF)
				{
					if (!a_boolean && !a_data_p.U && !a_data_p.aN)
						a_data_p.a_data_ab.c();
					if (a_data_p.U)
						a_data_p.a_data_ad.d();
					if (a_data_p.aN)
						a_data_p.a_data_ad.e();
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.l_int = 5;
						a_data_p.aL = true;
						a_data_p.aw_boolean = true;
					}
					if (a_boolean && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1))
					{
						a_data_p.c_int = 0;
						a_data_p.a_data_t.a();
						a_data_p.a_data_t.b(a_data_p.aG_int);
						g();
						a_data_p.l_int = 1;
					}
					if (!a_boolean && !a_data_p.U && ((((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1))
						a_data_p.m_int = 2;
				}
				if (a_data_p.aF && a_data_p.H_long > 8000L)
				{
					a_data_p.l_int = 9;
					a_data_p.y_long = 0L;
					a_data_p.aw_boolean = true;
				}
				a_data_p.aK = false;
				break;

			case 3: // '\003'
				if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
				{
					if (b_boolean)
					{
						if (c)
						{
							a_data_p.p_int = 0;
							a_data_p.m_int = 8;
							a_data_p.w = 0;
							a_data_p.a_data_aa.f();
							c = false;
						} else
						{
							a_data_p.n_int = 0;
							a_data_p.m_int = 0;
							a_data_p.a_data_aa.f();
							a_data_p.aB_boolean = false;
							a_data_p.aC_boolean = false;
							a_data_p.aD_boolean = false;
						}
						b_boolean = false;
					} else
					{
						a_data_p.m_int = 1;
						a_data_p.n_int = a_data_p.o_int;
						if (a_data_p.o_int == 0)
							a_data_p.s_int = 0;
						if (a_data_p.o_int == 4)
							a_data_p.s_int = 5;
						a_data_p.a_data_aa.f();
					}
					a_data_p.aw_boolean = true;
					a_data_p.a();
				}
				a_data_p.a_data_a.q();
				a_data_p.o_boolean = true;
				break;

			case 4: // '\004'
				a_data_p.t = a_data_p.a_data_a.a(a_data_p.t, 0, 1);
				a_data_p.a_data_a.m();
				if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
				{
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
				}
				a_data_p.o_boolean = true;
				break;

			case 5: // '\005'
				if (a_data_p.aB_boolean)
					a_data_p.y_int = a_data_p.a_data_a.a(a_data_p.y_int, 0, a_data_p.ay - 1);
				else
					a_data_p.y_int = a_data_p.a_data_a.a(a_data_p.y_int, 0, a_data_p.ax_int - 1);
				a_data_p.a_data_a.d();
				a_data_p.a_data_a.n();
				if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
				{
					a_data_p.a_data_aa.k();
					a_data_p.a_data_aa.f();
				}
				a_data_p.o_boolean = true;
				break;

			case 6: // '\006'
				a_data_p.a_data_a.o();
				if ((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8)
				{
					if (a_data_p.B_int < a_data_p.aA - a_data_p.as_int)
						a_data_p.B_int++;
					a_data_p.aw_boolean = true;
					a_data_p.n_long = 0L;
					a_data_p.i = true;
					a_data_p.aA = 0;
				}
				if ((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2)
				{
					if (a_data_p.B_int > 0)
						a_data_p.B_int--;
					a_data_p.aw_boolean = true;
					a_data_p.n_long = 0L;
					a_data_p.h_boolean = true;
					a_data_p.aA = 0;
				}
				if (!a_data_p.ae && ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3))
				{
					if (a_data_p.aC_boolean || a_data_p.aD_boolean)
					{
						a_data_p.m_int = 0;
						a_data_p.aD_boolean = false;
						a_data_p.aC_boolean = false;
						a_data_p.a_data_aa.f();
					} else
					{
						a_data_p.m_int = 5;
					}
					a_data_p.aw_boolean = true;
					a_data_p.B_int = 0;
					a_data_p.a_data_aa.f();
				}
				a_data_p.o_boolean = true;
				break;

			case 7: // '\007'
				switch (a_data_p.q_int)
				{
				default:
					break;

				case 0: // '\0'
					a_data_p.a_data_x.b();
					if (a_data_p.a_data_x.a_boolean)
					{
						a_data_p.a_data_x.a_boolean = false;
						if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
						{
							if (a_data_p.a_data_x.a_int > 0)
							{
								a_data_p.q_int_array1d[a_data_p.a_data_x.b]--;
								if (a_data_p.q_int_array1d[a_data_p.a_data_x.b] == 0)
								{
									for (int i = a_data_p.a_data_x.b; i < a_data_p.aB_int - 1; i++)
									{
										a_data_p.m_byte_array1d[i] = a_data_p.m_byte_array1d[i + 1];
										a_data_p.q_int_array1d[i] = a_data_p.q_int_array1d[i + 1];
									}

									a_data_p.aB_int--;
								}
							}
							a_data_p.m_int = 0;
							a_data_p.a_data_aa.f();
						}
					}
					break;

				case 1: // '\001'
					a_data_p.a_data_x.e();
					if (!a_data_p.a_data_x.a_boolean)
						break;
					a_data_p.a_data_x.a_boolean = false;
					if ((((k) (a_data_p)).bu & 0x8000) == 0 && (((k) (a_data_p)).bu & 0x4000) == 0 && (((k) (a_data_p)).bu & 0x10) == 0 && a_data_p.a_data_j.e != 1 && a_data_p.a_data_j.e != 3)
						break;
					if (a_data_p.a_data_x.a_int > 0)
					{
						a_data_p.q_int_array1d[a_data_p.a_data_x.b]--;
						if (a_data_p.q_int_array1d[a_data_p.a_data_x.b] == 0)
						{
							for (int l = a_data_p.a_data_x.b; l < a_data_p.aB_int - 1; l++)
							{
								a_data_p.m_byte_array1d[l] = a_data_p.m_byte_array1d[l + 1];
								a_data_p.q_int_array1d[l] = a_data_p.q_int_array1d[l + 1];
							}

							a_data_p.aB_int--;
						}
					}
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
					break;

				case 2: // '\002'
					a_data_p.a_data_n.d();
					if (!a_data_p.a_data_x.a_boolean)
						break;
					a_data_p.a_data_x.a_boolean = false;
					if ((((k) (a_data_p)).bu & 0x8000) == 0 && (((k) (a_data_p)).bu & 0x4000) == 0 && (((k) (a_data_p)).bu & 0x10) == 0 && a_data_p.a_data_j.e != 1 && a_data_p.a_data_j.e != 3)
						break;
					if (a_data_p.a_data_x.a_int > 0)
					{
						a_data_p.q_int_array1d[a_data_p.a_data_x.b]--;
						if (a_data_p.q_int_array1d[a_data_p.a_data_x.b] == 0)
						{
							for (int i1 = a_data_p.a_data_x.b; i1 < a_data_p.aB_int - 1; i1++)
							{
								a_data_p.m_byte_array1d[i1] = a_data_p.m_byte_array1d[i1 + 1];
								a_data_p.q_int_array1d[i1] = a_data_p.q_int_array1d[i1 + 1];
							}

							a_data_p.aB_int--;
						}
					}
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
					break;

				case 3: // '\003'
					a_data_p.a_data_s.d();
					if (!a_data_p.a_data_x.a_boolean)
						break;
					a_data_p.a_data_x.a_boolean = false;
					if ((((k) (a_data_p)).bu & 0x8000) == 0 && (((k) (a_data_p)).bu & 0x4000) == 0 && (((k) (a_data_p)).bu & 0x10) == 0 && a_data_p.a_data_j.e != 1 && a_data_p.a_data_j.e != 3)
						break;
					if (a_data_p.a_data_x.a_int > 0)
					{
						a_data_p.q_int_array1d[a_data_p.a_data_x.b]--;
						if (a_data_p.q_int_array1d[a_data_p.a_data_x.b] == 0)
						{
							for (int j1 = a_data_p.a_data_x.b; j1 < a_data_p.aB_int - 1; j1++)
							{
								a_data_p.m_byte_array1d[j1] = a_data_p.m_byte_array1d[j1 + 1];
								a_data_p.q_int_array1d[j1] = a_data_p.q_int_array1d[j1 + 1];
							}

							a_data_p.aB_int--;
						}
					}
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
					break;
				}
				a_data_p.aw_boolean = true;
				a_data_p.o_boolean = true;
				a_data_p.aK = false;
				break;

			case 8: // '\b'
				switch (a_data_p.p_int)
				{
				default:
					break;

				case 0: // '\0'
					b_boolean = c = true;
					a_data_p.w = a_data_p.a_data_a.a(a_data_p.w, 0, a_data_p.aw_int - 1);
					a_data_p.a_data_a.l();
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
					{
						a_data_p.m_int = 0;
						b_boolean = c = false;
						a_data_p.aB_boolean = false;
						a_data_p.a_data_aa.f();
					}
					break;

				case 1: // '\001'
					a_data_p.a_data_a.h();
					a_data_p.a_data_a.i();
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 4) != 0 || (((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 3 || a_data_p.a_data_j.e == 2 || a_data_p.a_data_j.e == 8)
					{
						a_data_p.p_int = 0;
						c = false;
						a_data_p.aw_boolean = true;
					}
					break;
				}
				a_data_p.o_boolean = true;
				break;

			case 9: // '\t'
				a_data_p.a_data_a.q();
				break;

			case 10: // '\n'
				if (a_data_p.p_boolean)
				{
					a_data_p.aw_boolean = true;
					if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
						a_data_p.g_long = 4001L;
					if (a_data_p.g_long > 4000L)
					{
						a_data_p.aK = false;
						a_data_p.g_long = 0L;
						a_data_p.p_boolean = false;
						a_data_p.n_boolean = true;
						a_data_p.m_boolean = true;
						a_data_p.m_int = a_data_p.j;
						a_data_p.b();
					}
				}
				if (!a_data_p.q_boolean)
					break;
				a_data_p.aw_boolean = true;
				if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
					a_data_p.g_long = 8001L;
				if (a_data_p.g_long > 8000L)
				{
					a_data_p.aK = false;
					a_data_p.g_long = 0L;
					a_data_p.q_boolean = false;
					a_data_p.n_boolean = true;
					a_data_p.m_boolean = true;
					a_data_p.m_int = a_data_p.j;
					a_data_p.b();
				}
				break;
			}
			return;

		case 7: // '\007'
			return;

		case 8: // '\b'
			if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
				a_data_p.y_long = 8001L;
			if (a_data_p.y_long > 8000L)
				g();
			a_data_p.a_data_aa.h();
			return;

		case 9: // '\t'
			if ((((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
				a_data_p.y_long = 8001L;
			if (a_data_p.y_long > 8000L)
				g();
			a_data_p.a_data_aa.h();
			break;
		}
	}

	public final void c()
	{
		if (a_data_p.aw_boolean)
		{
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, k.a(), k.b());
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(94), k.a() >> 1, (k.b() >> 1) - 30, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
			if (a_data_p.aO_boolean)
			{
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(95), k.a() >> 1, k.b() >> 1, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
				return;
			}
			if (a_data_p.aP)
			{
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(110), k.a() >> 1, k.b() >> 1, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
				return;
			}
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(96), k.a() >> 1, k.b() >> 1, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
		}
	}

	public final void d()
	{
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, k.a(), k.b());
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(97), k.a() >> 1, k.b() / 4, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(98), k.a() >> 1, k.b() / 4 + 20, 0xffffff, 17, 0, 1, 8, a_data_p.aJ_int, k.a(), k.b(), 0, 0);
		}
	}

	public final void a(boolean flag)
	{
		b(flag);
		if (flag)
		{
			if (a_int == 70)
				if (a_data_p.c_int == 0)
				{
					c(false);
					return;
				} else
				{
					c(true);
					return;
				}
			if (a_int == 80)
				return;
			if (a_int == 100)
			{
				a_data_p.a_data_t.a(true, true);
				a_long = a_data_p.a_data_t.b();
				a_data_p.a_data_ad.q();
				a_data_p.a_data_aa.d();
				a_data_p.a_data_ad.p();
				a_data_p.a_data_ad.t();
				return;
			}
		} else
		{
			if (a_int == 80)
			{
				a_data_p.a_data_g.d();
				a_data_p.a_data_y.b();
				return;
			}
			if (a_int == 100)
			{
				a_data_p.Z = 8;
				a_data_p.aa = 148;
				a_data_p.ab = a_data_p.Z - a_data_p.N / 2;
				a_data_p.ac = a_data_p.aa - a_data_p.O / 2;
				a_data_p.a_data_ad.q();
				a_data_p.d_boolean = true;
			}
		}
	}

	private void b(boolean flag)
	{
		a_data_p.p_boolean = false;
		a_data_p.c_boolean = true;
		if (a_int == 0)
		{
			a_data_p.aj_boolean = false;
			a_data_p.ak = false;
			a_data_p.al = false;
			a_data_p.am = false;
			a_data_p.an = false;
			a_data_p.ao = false;
			a_data_p.ap_boolean = false;
			a_data_p.aq = false;
			a_data_p.ar = false;
			a_data_p.as_boolean = false;
			a_data_p.at = false;
			a_data_p.au_boolean = false;
			a_data_p.av_boolean = false;
			a_data_p.a();
			if (!flag)
				a_data_p.ad = true;
			else
			if (a_data_p.ag)
			{
				for (int i = 0; i < 120; i++)
					if (a_data_p.c_java_lang_String_array1d[i] != null)
						a_data_p.c_java_lang_String_array1d[i] = null;

				a_data_p.a_data_y.d();
			}
			if (!d)
				a_data_p.a_data_g.a("BIGislandObjects", a_data_p.l_byte_array1d);
			a_data_p.a_data_ab.d();
			a_data_p.a_data_y.a();
			a_data_p.aj_int = a_data_p.M / 2;
			a_data_p.a();
			return;
		}
		if (a_int == 20)
		{
			if (d)
			{
				a_data_p.a_data_g.e();
				d = false;
				e = false;
				a_data_p.a();
				return;
			}
			if (!flag && e)
			{
				e = false;
				a_data_p.a_data_g.a = 0;
				a_data_p.a_data_g.b = 0;
				a_data_p.a_data_g.c = 0;
				a_data_p.a_data_g.d = 0;
				a_data_p.a_data_g.e = 0;
				a_data_p.a_data_g.f = 0;
				a_data_p.a_data_g.g = 0;
				a_data_p.a_data_g.h = 0;
				a_data_p.a_data_g.i = 0;
				a_data_p.a_data_g.j = 0;
				a_data_p.a_data_g.k = 0;
				a_data_p.a_data_g.l = 0;
				a_data_p.a_data_g.m = 0;
				a_data_p.a_data_g.n = 0;
				a_data_p.a_data_g.o = 0;
				a_data_p.a_data_g.p = 0;
				a_data_p.a_data_g.q = 0;
				a_data_p.a_data_g.r = 0;
				a_data_p.a_data_g.s = 0;
				a_data_p.a_data_g.t = 0;
				a_data_p.a_data_g.u = 0;
				a_data_p.a_data_g.v = 0;
				a_data_p.a_data_g.w = 0;
				a_data_p.a_data_g.x = 0;
				a_data_p.a_data_g.e();
				a_data_p.a();
				return;
			}
		} else
		{
			if (a_int == 40)
			{
				a_data_p.a_data_y.c();
				a_data_p.a_data_aa.f();
				a_data_p.a_data_aa.g();
				a_data_p.a();
				return;
			}
			if (a_int == 60)
			{
				if (!flag)
				{
					a_data_p.a_data_aa.d();
					a_data_p.a_data_ad.p();
				}
				a_data_p.m_int = 0;
				a_data_p.n_int = 0;
				a_data_p.a_float = (k.a() / 3 - 16) / 1;
				a_data_p.b_float = a_data_p.a_float;
				a_data_p.c_float = a_data_p.a_float;
				a_data_p.e_float = 0.0F;
				a_data_p.f_float = 0.0F;
				a_data_p.g_float = 0.0F;
				a_data_p.L = 0;
				a_data_p.a();
			}
		}
	}

	public final void e()
	{
		a_int = a_int + 2;
		if (a_int <= 100)
		{
			if (a_data_p.r_int == 0)
				a_data_p.a_data_r.a(0);
			else
			if (a_data_p.r_int == 1)
				a_data_p.a_data_r.a(1);
			a_data_p.a(((k) (a_data_p)).a, 20, (k.b() / 3) * 2, k.a() - 40, 12, a_int, 100, 0, b_int);
			return;
		}
		a_int = -2;
		a_data_p.a_data_aa.h();
		if (a_data_p.e_boolean)
		{
			a_data_p.aw_boolean = true;
			a_data_p.C_long = 0L;
			a_data_p.c_boolean = false;
			a_data_p.e_boolean = false;
		} else
		{
			a_data_p.l_int = 6;
		}
		a_data_p.a();
	}

	private void c(boolean flag)
	{
		long l = (long)a_data_p.aG_int - a_long;
		int i = 0;
		long l1;
		if (a_data_p.K_long < a_data_p.c_long)
		{
			if (l > 0L)
				l--;
			l1 = (24L - a_data_p.c_long) + a_data_p.K_long;
		} else
		{
			l1 = a_data_p.K_long - a_data_p.c_long;
		}
		if (a_data_p.J_long < a_data_p.d_long)
		{
			if (l1 > 0L)
				l1--;
			long l2 = 0L;
		}
		long l3 = 0L;
		long l4;
		if ((l4 = 24L * l + l1) >= 1L && l4 <= 15L)
			i = 10;
		else
		if (l4 >= 16L && l4 <= 35L)
			i = 20;
		else
		if (l4 >= 36L && l4 <= 72L)
			i = 30;
		else
		if (l4 >= 73L && l4 <= 119L)
			i = 40;
		else
		if (l4 > 119L)
			i = 50;
		if (flag)
		{
			a_data_p.a_float = a_data_p.a_float + (a_data_p.d_float / 100F) * (float)i;
			a_data_p.b_float = a_data_p.b_float + (a_data_p.d_float / 100F) * (float)i;
			a_data_p.c_float = a_data_p.c_float + (a_data_p.d_float / 100F) * (float)i;
			if (a_data_p.a_float >= a_data_p.d_float)
				a_data_p.a_float = a_data_p.d_float;
			if (a_data_p.b_float >= a_data_p.d_float)
				a_data_p.b_float = a_data_p.d_float;
			if (a_data_p.c_float >= a_data_p.d_float)
			{
				a_data_p.c_float = a_data_p.d_float;
				return;
			}
		} else
		{
			if (a_data_p.a_float > 10F)
			{
				a_data_p.a_float = a_data_p.a_float - (a_data_p.d_float / 100F) * (float)i;
				if (a_data_p.a_float < 10F)
					a_data_p.a_float = 10F;
			}
			if (a_data_p.b_float > 10F)
			{
				a_data_p.b_float = a_data_p.b_float - (a_data_p.d_float / 100F) * (float)i;
				if (a_data_p.b_float < 0.0F)
					a_data_p.b_float = 10F;
			}
			if (a_data_p.c_float > 10F)
			{
				a_data_p.c_float = a_data_p.c_float - (a_data_p.d_float / 100F) * (float)i;
				if (a_data_p.c_float < 0.0F)
					a_data_p.c_float = 10F;
			}
		}
	}

	public final void a(int i)
	{
		a_data_p.L = a_data_p.L + i;
		if (a_data_p.L >= 50)
		{
			a_data_p.L = a_data_p.L - 50;
			if (a_data_p.g_float < a_data_p.d_float)
				a_data_p.g_float = a_data_p.g_float + 1.0F;
		}
	}

	public final void f()
	{
		if (!a_data_p.D_boolean)
		{
			if (a_data_p.k >= 60000L)
			{
				a_data_p.a_data_aa.d();
				if (a_data_p.J_long < 10L)
					a_data_p.a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.K_long + ":0" + a_data_p.J_long);
				else
					a_data_p.a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.K_long + ":" + a_data_p.J_long);
				a_data_p.k = 0L;
				a_data_p.aw_boolean = true;
				return;
			}
		} else
		if (a_data_p.e_long > 4000L)
		{
			if (a_data_p.J_long < 60L)
				a_data_p.J_long++;
			if (a_data_p.J_long == 60L)
			{
				a_data_p.J_long = 0L;
				a_data_p.K_long++;
				if (a_data_p.K_long == 24L)
					a_data_p.K_long = 0L;
			}
			a_data_p.e_long = 0L;
			a_data_p.aw_boolean = true;
			if (a_data_p.J_long < 10L)
			{
				a_data_p.a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.K_long + ":0" + a_data_p.J_long);
				return;
			}
			a_data_p.a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.K_long + ":" + a_data_p.J_long);
		}
	}

	public final void g()
	{
		a_data_p.a_data_w.a(14);
		a_data_p.l_int = 1;
		a_data_p.ap_int = 0;
		a_data_p.b_long = 0L;
		a_data_p.aO_boolean = false;
		a_data_p.aP = false;
		if (a_data_p.b_boolean)
			a_data_p.r_int = 0;
		else
			a_data_p.r_int = 1;
		a_boolean = false;
		a_data_p.aF = false;
		a_data_p.c_boolean = false;
		a_data_p.aw_boolean = true;
		a_data_p.T = false;
		a_data_p.aB_int = 0;
		for (int i = 0; i < a_data_p.m_byte_array1d.length; i++)
			a_data_p.q_int_array1d[i] = 0;

		a_data_p.av_int = 0;
		for (int l = 0; l < a_data_p.a_byte_array1d.length; l++)
			a_data_p.g_int_array1d[l] = 0;

		a_data_p.aw_int = 0;
		for (int i1 = 0; i1 < a_data_p.a_java_lang_String_array1d.length; i1++)
		{
			a_data_p.a_java_lang_String_array1d[i1] = null;
			a_data_p.h_int_array1d[i1] = 0;
		}

		for (int j1 = 0; j1 < a_data_p.r_int_array1d.length; j1++)
			a_data_p.r_int_array1d[j1] = 0;

		a_data_p.aC_int = 0;
		for (int k1 = 0; k1 < a_data_p.s_int_array1d.length; k1++)
			a_data_p.s_int_array1d[k1] = 0;

		a_data_p.aD_int = 0;
		a_data_p.a_int_array1d = new int[5];
		a_data_p.b_int_array1d = new int[5];
		a_data_p.c_int_array1d = new int[5];
		a_data_p.d_int_array1d = new int[5];
		a_data_p.H_int = 1;
		a_data_p.I = 1;
		a_data_p.J_int = 1;
		a_data_p.K_int = 1;
		a_data_p.D_int = 0;
		a_data_p.E = 0;
		a_data_p.F = 0;
		a_data_p.G = 0;
	}
}
