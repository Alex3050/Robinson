// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import Robinson.MyMidlet;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.midlet.MIDlet;

// Referenced classes of package data:
//			aa, ac, ad, g, 
//			j, k, n, p, 
//			r, s, t, v, 
//			w, x

public final class a
{

	private p a_data_p;
	private boolean a_boolean;
	private boolean b_boolean;
	private int a_int;
	private boolean c;
	private byte a_byte;
	private int b_int;
	private boolean d;

	public a(p p1)
	{
		a_boolean = false;
		b_boolean = false;
		a_int = 4;
		c = false;
		b_int = 0;
		d = false;
		a_data_p = p1;
	}

	public final int a(int i1, int j1, int k1)
	{
		if ((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2)
		{
			if (a_data_p.m_int == 1 || a_data_p.m_int == 5 || a_data_p.m_int == 8)
			{
				a_data_p.m_long = 0L;
				a_data_p.n_long = 0L;
				a_data_p.h_boolean = true;
			}
			if (i1 > j1 && i1 <= k1 && !a_boolean)
			{
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && (a_data_p.m_int == 1 && (a_data_p.n_int == 0 || a_data_p.n_int == 4) || a_data_p.m_int == 5 || a_data_p.m_int == 8) || a_data_p.a_data_j.e != -1 && a_data_p.l_int == 3)
					{
						if (a_data_p.l_int == 3)
						{
							a_data_p.a_data_j.b = true;
							i1 -= ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue();
						} else
						if (i1 > j1 + a_data_p.as)
							i1 -= a_data_p.as;
						else
							i1 = j1;
					} else
					{
						i1--;
					}
				} else
				{
					i1--;
				}
				a_data_p.aw_boolean = true;
			}
		}
		if ((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8)
		{
			if (a_data_p.m_int == 1 || a_data_p.m_int == 5 || a_data_p.m_int == 8)
			{
				a_data_p.m_long = 0L;
				a_data_p.n_long = 0L;
				a_data_p.i_boolean = true;
			}
			if (i1 >= j1 && i1 < k1)
			{
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && (a_data_p.m_int == 1 && (a_data_p.n_int == 0 || a_data_p.n_int == 4) || a_data_p.m_int == 5 || a_data_p.m_int == 8) || a_data_p.a_data_j.e != -1 && a_data_p.l_int == 3)
					{
						if (a_data_p.l_int == 3)
						{
							a_data_p.a_data_j.b = false;
							i1 += ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue();
						} else
						if (i1 < k1 - a_data_p.as)
							i1 += a_data_p.as;
						else
							i1 = k1;
					} else
					{
						i1++;
					}
				} else
				{
					i1++;
				}
				a_data_p.aw_boolean = true;
			}
		}
		return i1;
	}

	public final int b(int i1, int j1, int k1)
	{
		if ((((k) (a_data_p)).bu & 1) != 0 || a_data_p.a_data_j.e == 4)
		{
			if (a_data_p.m_int == 1)
			{
				a_data_p.m_long = 0L;
				a_data_p.f_boolean = true;
			}
			if (i1 == j1)
			{
				i1 = k1;
				a_data_p.aw_boolean = true;
			} else
			if (i1 > j1 && i1 <= k1)
			{
				i1--;
				a_data_p.aw_boolean = true;
			}
			if (i1 == 3)
				a_data_p.aE_boolean = true;
			a_data_p.z = 0;
			a_data_p.u_int = 0;
			a_data_p.v = 0;
			a_data_p.au = 0;
		}
		if ((((k) (a_data_p)).bu & 2) != 0 || a_data_p.a_data_j.e == 6)
		{
			if (a_data_p.m_int == 1)
			{
				a_data_p.m_long = 0L;
				a_data_p.g_boolean = true;
			}
			if (i1 == k1)
			{
				i1 = j1;
				a_data_p.aw_boolean = true;
			} else
			if (i1 >= j1 && i1 < k1)
			{
				i1++;
				a_data_p.aw_boolean = true;
			}
			if (i1 == 3)
				a_data_p.aE_boolean = true;
			a_data_p.z = 0;
			a_data_p.u_int = 0;
			a_data_p.v = 0;
			a_data_p.au = 0;
		}
		if (a_data_p.m_int == 1)
			b(i1);
		return i1;
	}

	private void b(int i1)
	{
		if (i1 == 0)
		{
			a_data_p.n_int = 0;
			return;
		}
		if (i1 == 1)
		{
			a_data_p.n_int = 2;
			return;
		}
		if (i1 == 2)
		{
			a_data_p.n_int = 3;
			return;
		}
		if (i1 == 3)
		{
			a_data_p.n_int = 5;
			t();
			return;
		}
		if (i1 == 4)
		{
			a_data_p.n_int = 6;
			return;
		}
		if (i1 == 5)
			a_data_p.n_int = 4;
	}

	private void t()
	{
		if (a_data_p.Z_int >= 0 && a_data_p.Z_int <= 60 && a_data_p.aa_int >= 0 && a_data_p.aa_int <= 60)
			a_data_p.Q_int = a_data_p.R_int = 0;
		if (a_data_p.Z_int >= 60 && a_data_p.Z_int <= 120 && a_data_p.aa_int >= 0 && a_data_p.aa_int <= 60)
		{
			a_data_p.Q_int = 60;
			a_data_p.R_int = 0;
		}
		if (a_data_p.Z_int >= 120 && a_data_p.Z_int <= 180 && a_data_p.aa_int >= 0 && a_data_p.aa_int <= 60)
		{
			a_data_p.Q_int = 120;
			a_data_p.R_int = 0;
		}
		if (a_data_p.Z_int >= 0 && a_data_p.Z_int <= 60 && a_data_p.aa_int >= 60 && a_data_p.aa_int <= 120)
		{
			a_data_p.Q_int = 0;
			a_data_p.R_int = 60;
		}
		if (a_data_p.Z_int >= 60 && a_data_p.Z_int <= 120 && a_data_p.aa_int >= 60 && a_data_p.aa_int <= 120)
		{
			a_data_p.Q_int = 60;
			a_data_p.R_int = 60;
		}
		if (a_data_p.Z_int >= 120 && a_data_p.Z_int <= 180 && a_data_p.aa_int >= 60 && a_data_p.aa_int <= 120)
		{
			a_data_p.Q_int = 120;
			a_data_p.R_int = 60;
		}
		if (a_data_p.Z_int >= 0 && a_data_p.Z_int <= 60 && a_data_p.aa_int >= 120 && a_data_p.aa_int <= 180)
		{
			a_data_p.Q_int = 0;
			a_data_p.R_int = 120;
		}
		if (a_data_p.Z_int >= 60 && a_data_p.Z_int <= 120 && a_data_p.aa_int >= 120 && a_data_p.aa_int <= 180)
		{
			a_data_p.Q_int = 60;
			a_data_p.R_int = 120;
		}
		if (a_data_p.Z_int >= 120 && a_data_p.Z_int <= 180 && a_data_p.aa_int >= 120 && a_data_p.aa_int <= 180)
			a_data_p.Q_int = a_data_p.R_int = 120;
	}

	public final void a()
	{
		if ((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2)
		{
			a_data_p.n_long = 0L;
			a_data_p.h_boolean = true;
			if (a_data_p.f_int > 0)
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.d_int <= ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue())
					{
						a_data_p.f_int--;
						a_data_p.g_int--;
						a_data_p.aw_boolean = true;
					} else
					if (a_data_p.d_int == ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue() - 1 && a_data_p.d_int != 0)
					{
						a_data_p.f_int--;
						a_data_p.g_int--;
						a_data_p.aw_boolean = true;
					}
				} else
				if (a_data_p.d_int == ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue() - 1 && a_data_p.d_int != 0)
				{
					a_data_p.f_int--;
					a_data_p.g_int--;
					a_data_p.aw_boolean = true;
				}
		}
		if ((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8)
		{
			a_data_p.n_long = 0L;
			a_data_p.i_boolean = true;
			if (a_data_p.g_int < a_data_p.a_java_util_Vector.size() - 1 && a_data_p.d_int >= ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue() && a_data_p.d_int != a_data_p.e_int)
			{
				a_data_p.f_int++;
				a_data_p.g_int++;
				a_data_p.aw_boolean = true;
			}
		}
	}

	public final void b()
	{
		if (((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2) && a_data_p.au > 0)
		{
			if (a_data_p.hasPointerEvents())
			{
				if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 1 && a_data_p.n_int == 0)
				{
					if (a_data_p.z >= a_data_p.as)
						a_data_p.au -= a_data_p.as;
					else
						a_data_p.au = 0;
				} else
				{
					a_data_p.au--;
				}
			} else
			{
				a_data_p.au--;
			}
			a_data_p.aw_boolean = true;
		}
		if (((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8) && a_data_p.z >= a_data_p.as)
		{
			if (a_data_p.au < a_data_p.aB_int - a_data_p.as)
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 1 && a_data_p.n_int == 0)
						a_data_p.au += a_data_p.as;
					else
						a_data_p.au++;
				} else
				{
					a_data_p.au++;
				}
			a_data_p.aw_boolean = true;
		}
	}

	public final void c()
	{
		if (((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2) && a_data_p.au > 0)
		{
			if (a_data_p.hasPointerEvents())
			{
				if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 1 && a_data_p.n_int == 4)
				{
					if (a_data_p.v >= a_data_p.as)
						a_data_p.au -= a_data_p.as;
					else
						a_data_p.au = 0;
				} else
				{
					a_data_p.au--;
				}
			} else
			{
				a_data_p.au--;
			}
			a_data_p.aw_boolean = true;
		}
		if (((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8) && a_data_p.v >= a_data_p.as)
		{
			if (a_data_p.au < a_data_p.av - a_data_p.as)
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 1 && a_data_p.n_int == 4)
						a_data_p.au += a_data_p.as;
					else
						a_data_p.au++;
				} else
				{
					a_data_p.au++;
				}
			a_data_p.aw_boolean = true;
		}
	}

	public final void d()
	{
		if (a_data_p.aB_boolean)
		{
			if (((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2) && a_data_p.au > 0)
			{
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 5)
					{
						if (a_data_p.y_int >= a_data_p.as)
							a_data_p.au -= a_data_p.as;
						else
							a_data_p.au = 0;
					} else
					{
						a_data_p.au--;
					}
				} else
				{
					a_data_p.au--;
				}
				a_data_p.aw_boolean = true;
			}
			if (((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8) && a_data_p.y_int >= a_data_p.as)
			{
				if (a_data_p.au < a_data_p.ay_int - a_data_p.as)
					if (a_data_p.hasPointerEvents())
					{
						if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 5)
							a_data_p.au += a_data_p.as;
						else
							a_data_p.au++;
					} else
					{
						a_data_p.au++;
					}
				a_data_p.aw_boolean = true;
				return;
			}
		} else
		{
			if (((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2) && a_data_p.au > 0)
			{
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 5)
					{
						if (a_data_p.y_int >= a_data_p.as)
							a_data_p.au -= a_data_p.as;
						else
							a_data_p.au = 0;
					} else
					{
						a_data_p.au--;
					}
				} else
				{
					a_data_p.au--;
				}
				a_data_p.aw_boolean = true;
			}
			if (((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8) && a_data_p.y_int >= a_data_p.as)
			{
				if (a_data_p.au < a_data_p.ax_int - a_data_p.as)
					if (a_data_p.hasPointerEvents())
					{
						if (a_data_p.a_data_j.e != -1 && a_data_p.l_int == 6 && a_data_p.m_int == 5)
							a_data_p.au += a_data_p.as;
						else
							a_data_p.au++;
					} else
					{
						a_data_p.au++;
					}
				a_data_p.aw_boolean = true;
			}
		}
	}

	public final void e()
	{
		if (!a_data_p.c_boolean)
		{
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
				if (a_data_p.r == 0)
				{
					a_data_p.a_data_w.a(14);
					a_data_p.ax_boolean = true;
					a_data_p.a_data_r.a(0);
					a_data_p.a_data_v.e();
					a_data_p.a_data_v.a(true);
				} else
				if (a_data_p.r == 1)
				{
					a_data_p.a_data_w.a(14);
					if (a_data_p.b_boolean)
					{
						a_data_p.a_int = 1;
						a_data_p.l_int = 11;
						a_data_p.aw_boolean = true;
					} else
					{
						a_data_p.ax_boolean = true;
						a_data_p.a_data_r.a(1);
						a_data_p.a_data_v.e();
						a_data_p.a_data_v.a(false);
					}
				} else
				if (a_data_p.r == 2)
				{
					a_data_p.l_int = 2;
					a_data_p.a();
					a_data_p.a_data_aa.h();
				} else
				if (a_data_p.r == 3)
				{
					a_data_p.l_int = 3;
					a_data_p.a();
					a_data_p.a_data_aa.h();
				} else
				if (a_data_p.r == 4)
				{
					a_data_p.l_int = 4;
					a_data_p.a();
					a_data_p.a_data_aa.h();
				} else
				if (a_data_p.r == 5)
				{
					try
					{
						Thread.sleep(1000L);
					}
					catch (Exception ) { }
					try
					{
						a_data_p.a_Robinson_MyMidlet.platformRequest(a_data_p.a_java_lang_String);
						a_data_p.a_Robinson_MyMidlet.destroyApp(true);
					}
					catch (Exception )
					{
						a_data_p.a_Robinson_MyMidlet.destroyApp(true);
					}
				}
			if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
			{
				a_data_p.a_int = 0;
				a_data_p.l_int = 11;
				a_data_p.aw_boolean = true;
			}
		}
		if (a_data_p.c_boolean)
		{
			a_data_p.a_data_v.e();
			if (a_data_p.r == 0)
			{
				a_data_p.a_data_v.a(true);
				return;
			}
			if (a_data_p.r == 1)
				a_data_p.a_data_v.a(false);
		}
	}

	public final void f()
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
		{
			a_data_p.l_int = 10;
			a_data_p.l_boolean = true;
		}
		if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
		{
			a_data_p.l_int = 1;
			a_data_p.d_int = 0;
			a_data_p.f_int = 0;
			a_data_p.g_int = 1;
			a_data_p.a_java_util_Vector.removeAllElements();
			a_data_p.l_boolean = true;
			a_data_p.a_data_aa.h();
			a_data_p.a();
		}
	}

	public final void g()
	{
		if ((((k) (a_data_p)).bu & 2) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 6 || a_data_p.a_data_j.e == 5)
		{
			if (a_data_p.A == 0)
			{
				if (a_data_p.ah)
					a_data_p.ah = false;
				else
					a_data_p.ah = true;
				a_data_p.a_data_aa.d();
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.A == 1)
			{
				a_data_p.aF_int++;
				a_data_p.aw_boolean = true;
				if (a_data_p.aF_int == 5)
					a_data_p.aF_int = 0;
				switch (a_data_p.aF_int)
				{
				case 0: // '\0'
					a_data_p.a_data_ac.a(0);
					break;

				case 1: // '\001'
					a_data_p.a_data_ac.a(1);
					break;

				case 2: // '\002'
					a_data_p.a_data_ac.a(2);
					break;

				case 3: // '\003'
					a_data_p.a_data_ac.a(3);
					break;

				case 4: // '\004'
					a_data_p.a_data_ac.a(4);
					break;
				}
			}
		}
		if ((((k) (a_data_p)).bu & 1) != 0 || a_data_p.a_data_j.e == 4)
		{
			if (a_data_p.A == 0)
			{
				if (a_data_p.ah)
					a_data_p.ah = false;
				else
					a_data_p.ah = true;
				a_data_p.a_data_aa.d();
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.A == 1)
			{
				a_data_p.aF_int--;
				a_data_p.aw_boolean = true;
				if (a_data_p.aF_int == -1)
					a_data_p.aF_int = 4;
				switch (a_data_p.aF_int)
				{
				case 0: // '\0'
					a_data_p.a_data_ac.a(0);
					break;

				case 1: // '\001'
					a_data_p.a_data_ac.a(1);
					break;

				case 2: // '\002'
					a_data_p.a_data_ac.a(2);
					break;

				case 3: // '\003'
					a_data_p.a_data_ac.a(3);
					break;

				case 4: // '\004'
					a_data_p.a_data_ac.a(4);
					break;
				}
			}
		}
		if ((((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 3)
		{
			a_data_p.ah = a_data_p.ai;
			a_data_p.aF_int = a_data_p.aE_int;
			switch (a_data_p.aE_int)
			{
			case 0: // '\0'
				a_data_p.a_data_ac.a(0);
				break;

			case 1: // '\001'
				a_data_p.a_data_ac.a(1);
				break;

			case 2: // '\002'
				a_data_p.a_data_ac.a(2);
				break;

			case 3: // '\003'
				a_data_p.a_data_ac.a(3);
				break;

			case 4: // '\004'
				a_data_p.a_data_ac.a(4);
				break;
			}
			a_data_p.l_int = 1;
			a_data_p.a_data_aa.h();
			a_data_p.A = 0;
			a_data_p.ag = false;
			a_data_p.a();
		}
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || a_data_p.a_data_j.e == 1)
		{
			a_data_p.a_data_t.a(a_data_p.aF_int);
			a_data_p.a_data_t.a(a_data_p.ah);
			a_data_p.ai = a_data_p.ah;
			a_data_p.aE_int = a_data_p.aF_int;
			a_data_p.l_int = 1;
			a_data_p.a_data_aa.h();
			a_data_p.A = 0;
			a_data_p.ag = true;
			a_data_p.a();
		}
	}

	public final void h()
	{
		if ((((k) (a_data_p)).bu & 1) != 0)
		{
			a_data_p.l_long = 0L;
			if (a_data_p.x > 0 && a_data_p.x <= a_data_p.C - 1)
			{
				a_data_p.x--;
				a_data_p.j = true;
				a_data_p.aw_boolean = true;
			}
		}
		if ((((k) (a_data_p)).bu & 2) != 0)
		{
			a_data_p.l_long = 0L;
			if (a_data_p.x >= 0 && a_data_p.x < a_data_p.C - 1)
			{
				a_data_p.x++;
				a_data_p.k_boolean = true;
				a_data_p.aw_boolean = true;
			}
		}
		if (a_data_p.m_int == 2)
		{
			if (!a())
			{
				u();
				return;
			}
		} else
		{
			if (a_data_p.m_int == 1)
			{
				E();
				return;
			}
			if (a_data_p.p == 1)
				F();
		}
	}

	public final void i()
	{
		if (a_data_p.n_int == 1)
		{
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5)
			{
				if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001c)
				{
					for (int i1 = 0; i1 < 120; i1++)
					{
						if (a_data_p.o_int == 0 && a_data_p.m_byte_array1d[a_data_p.z] == (byte)i1)
						{
							a_data_p.m_int = 3;
							a_data_p.ar = i1;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}
						if (a_data_p.o_int == 4 && a_data_p.a_byte_array1d[a_data_p.v] == (byte)i1)
						{
							a_data_p.m_int = 3;
							a_data_p.ar = i1;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}
					}

				}
				if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001b)
				{
					if (a_data_p.m_byte_array1d[a_data_p.z] == 31)
						a_data_p.aP = true;
					a_data_p.ay_boolean = false;
					a_data_p.a_data_ad.g();
					a_data_p.aw_boolean = true;
					a_data_p.a();
				}
				if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001e)
				{
					a_data_p.ay_boolean = false;
					a_data_p.a_data_ad.h();
					a_data_p.aw_boolean = true;
					a_data_p.a();
					return;
				}
			}
		} else
		if (a_data_p.p == 1)
		{
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5)
			{
				if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001c && a_data_p.aw_int != 0)
				{
					for (int j1 = 0; j1 < 120; j1++)
						if (a_data_p.a_java_lang_String_array1d[a_data_p.w] == a_data_p.b_java_lang_String_array1d[j1])
						{
							a_data_p.m_int = 3;
							a_data_p.ar = j1;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}

				}
				if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001e)
				{
					a_data_p.ay_boolean = false;
					a_data_p.a_data_ad.i();
					a_data_p.aw_boolean = true;
					a_data_p.a();
					return;
				}
			}
		} else
		if (a_data_p.m_int == 2 && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5))
		{
			a_data_p.az_boolean = false;
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001d)
			{
				a_data_p.m_int = 1;
				a_data_p.n_int = 0;
				a_data_p.s = 0;
				a_data_p.aw_boolean = true;
				a_data_p.a();
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001f)
			{
				if (a_data_p.aC)
				{
					a_data_p.m_int = 6;
					for (int k1 = 0; k1 < a_data_p.g_java_lang_String_array1d.length; k1++)
						a_data_p.g_java_lang_String_array1d[k1] = null;

					a_data_p.aA_int = 0;
					a_data_p.aw_boolean = true;
				} else
				if (a_data_p.aD)
				{
					a_data_p.m_int = 6;
					for (int l1 = 0; l1 < a_data_p.g_java_lang_String_array1d.length; l1++)
						a_data_p.g_java_lang_String_array1d[l1] = null;

					a_data_p.aA_int = 0;
					a_data_p.aw_boolean = true;
				} else
				{
					a_data_p.m_int = 5;
					a_data_p.aA_boolean = true;
					a_data_p.aw_boolean = true;
					for (int i2 = 0; i2 < 120; i2++)
					{
						a_data_p.f_java_lang_String_array1d[i2] = "";
						a_data_p.e_java_lang_String_array1d[i2] = "";
						a_data_p.d_java_lang_String_array1d[i2] = "";
					}

					a_data_p.az_int = 0;
					a_data_p.ay_int = 0;
					a_data_p.ax_int = 0;
					a_data_p.y_int = 0;
				}
				a_data_p.a();
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001a)
			{
				a_data_p.m_int = 4;
				a_data_p.aw_boolean = true;
				a_data_p.a();
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa0019)
				a_data_p.a_data_ad.a();
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001b)
			{
				if (a_data_p.m_byte_array1d[a_data_p.z] == 31)
					a_data_p.aP = true;
				a_data_p.a_data_ad.j();
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa0020)
			{
				if (a_data_p.aB_boolean)
				{
					a_data_p.m_int = 8;
					a_data_p.p = 0;
					a_data_p.w = 0;
				}
				if (d)
				{
					if (!a_data_p.T)
						a_data_p.a_data_ad.u();
					else
						a_data_p.a_data_ad.v();
					a_data_p.m_int = 0;
					a_data_p.a_data_aa.f();
					d = false;
				}
				a_data_p.aw_boolean = true;
				a_data_p.a();
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xd0008)
			{
				a_data_p.a_data_x.c();
				a_data_p.m_int = 7;
				a_data_p.q = 0;
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xd0012)
			{
				a_data_p.a_data_x.f();
				a_data_p.m_int = 7;
				a_data_p.q = 1;
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xd0011)
			{
				a_data_p.a_data_n.b();
				a_data_p.m_int = 7;
				a_data_p.q = 2;
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xd0009)
			{
				a_data_p.a_data_s.b();
				a_data_p.m_int = 7;
				a_data_p.q = 3;
				a_data_p.aw_boolean = true;
			}
			if (a_data_p.t_int_array1d[a_data_p.x] == 0xa001c)
			{
				for (int j2 = 0; j2 < 120; j2++)
					if (a_data_p.X)
					{
						if (a_data_p.l_byte_array1d[a_data_p.P_int + 180] == a_data_p.i_int_array1d[j2])
						{
							a_data_p.m_int = 3;
							a_data_p.ar = j2;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}
					} else
					if (a_data_p.Y)
					{
						if (a_data_p.l_byte_array1d[a_data_p.P_int + 180 + 2] == a_data_p.i_int_array1d[j2])
						{
							a_data_p.m_int = 3;
							a_data_p.ar = j2;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}
					} else
					if (a_data_p.V)
					{
						if (a_data_p.l_byte_array1d[a_data_p.P_int + 1] == a_data_p.i_int_array1d[j2])
						{
							a_data_p.m_int = 3;
							a_data_p.ar = j2;
							a_data_p.aw_boolean = true;
							a_data_p.a();
						}
					} else
					if (a_data_p.W && a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 1] == a_data_p.i_int_array1d[j2])
					{
						a_data_p.m_int = 3;
						a_data_p.ar = j2;
						a_data_p.aw_boolean = true;
						a_data_p.a();
					}

			}
		}
	}

	private boolean a()
	{
		a_data_p.C = 0;
		b_boolean = false;
		if (a_data_p.m_int == 2)
		{
			boolean flag = false;
			if (a_data_p.T)
			{
				if (b())
					A();
				else
					v();
				return true;
			}
			if (a_data_p.X)
			{
				if (c())
					flag = true;
				if (g())
					flag = true;
				if (a(18, 8))
					flag = true;
				if (k())
					flag = true;
				for (int i1 = 0; i1 < 120; i1++)
					if (a_data_p.l_byte_array1d[a_data_p.P_int + 180] == a_data_p.i_int_array1d[i1])
						if (a_data_p.i_int_array1d[i1] == 17)
						{
							flag = false;
						} else
						{
							c = false;
							c(i1);
							flag = true;
						}

			} else
			if (a_data_p.Y)
			{
				if (d())
					flag = true;
				if (h())
					flag = true;
				if (b(18, 8))
					flag = true;
				if (l())
					flag = true;
				for (int j1 = 0; j1 < 120; j1++)
					if (a_data_p.l_byte_array1d[a_data_p.P_int + 180 + 2] == a_data_p.i_int_array1d[j1])
						if (a_data_p.i_int_array1d[j1] == 17)
						{
							flag = false;
						} else
						{
							c = false;
							c(j1);
							flag = true;
						}

			} else
			if (a_data_p.V)
			{
				if (e())
					flag = true;
				if (i())
					flag = true;
				if (c(18, 8))
					flag = true;
				if (m())
					flag = true;
				for (int k1 = 0; k1 < 120; k1++)
					if (a_data_p.l_byte_array1d[a_data_p.P_int + 1] == a_data_p.i_int_array1d[k1])
						if (a_data_p.i_int_array1d[k1] == 17)
						{
							flag = false;
						} else
						{
							c = false;
							c(k1);
							flag = true;
						}

			} else
			if (a_data_p.W)
			{
				if (f())
					flag = true;
				if (j())
					flag = true;
				if (d(18, 8))
					flag = true;
				if (n())
					flag = true;
				for (int l1 = 0; l1 < 120; l1++)
					if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 1] == a_data_p.i_int_array1d[l1])
						if (a_data_p.i_int_array1d[l1] == 17)
						{
							flag = false;
						} else
						{
							c = false;
							c(l1);
							flag = true;
						}

			}
			if (flag && a_data_p.C == 0)
				u();
			return flag;
		} else
		{
			return false;
		}
	}

	private boolean b()
	{
		a_data_p.Z_boolean = false;
		a_data_p.aa_boolean = false;
		a_data_p.ab = false;
		a_data_p.ac_boolean = false;
		if (a_data_p.a_data_g.a(a_data_p.P_int + 180, 0) && a_data_p.a_data_g.a(a_data_p.P_int + 180, 0) && a_data_p.a_data_g.d(a_data_p.P_int + 180, 0) && a_data_p.a_data_g.c(a_data_p.P_int + 180, 0))
		{
			a_data_p.Z_boolean = true;
			return true;
		}
		if (a_data_p.a_data_g.a(a_data_p.P_int + 180 + 2, 1) && a_data_p.a_data_g.a(a_data_p.P_int + 180 + 2, 1) && a_data_p.a_data_g.d(a_data_p.P_int + 180 + 2, 1) && a_data_p.a_data_g.c(a_data_p.P_int + 180 + 2, 1))
		{
			a_data_p.aa_boolean = true;
			return true;
		}
		if (a_data_p.a_data_g.a(a_data_p.P_int + 1, 2) && a_data_p.a_data_g.a(a_data_p.P_int + 1, 2) && a_data_p.a_data_g.d(a_data_p.P_int + 1, 2) && a_data_p.a_data_g.c(a_data_p.P_int + 1, 2))
		{
			a_data_p.ab = true;
			return true;
		}
		if (a_data_p.a_data_g.a(a_data_p.P_int + 360 + 1, 3) && a_data_p.a_data_g.a(a_data_p.P_int + 360 + 1, 3) && a_data_p.a_data_g.d(a_data_p.P_int + 360 + 1, 3) && a_data_p.a_data_g.c(a_data_p.P_int + 360 + 1, 3))
		{
			a_data_p.ac_boolean = true;
			return true;
		} else
		{
			return false;
		}
	}

	private boolean c()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 180] == 5)
		{
			c = true;
			c(40);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean d()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 180 + 2] == 5)
		{
			c = true;
			c(40);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean e()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 1] == 5)
		{
			c = true;
			c(40);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean f()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 360 + 1] == 5)
		{
			c = true;
			c(40);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean g()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 180] == 4)
		{
			c = true;
			c(59);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean h()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 180 + 2] == 4)
		{
			c = true;
			c(59);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean i()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 1] == 4)
		{
			c = true;
			c(59);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean j()
	{
		if (a_data_p.k_byte_array1d[a_data_p.P_int + 360 + 1] == 4)
		{
			c = true;
			c(59);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean a(int i1, int j1)
	{
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 180] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 180] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 360] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 360] == j1)
		{
			c = false;
			c(-1);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean b(int i1, int j1)
	{
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 180 + 2] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 180 + 2] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 2] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 2] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 360 + 2] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 360 + 2] == j1)
		{
			c = false;
			c(-1);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean c(int i1, int j1)
	{
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 1] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 1] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 2] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 2] == j1)
		{
			c = false;
			c(-1);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean d(int i1, int j1)
	{
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 360 + 1] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 360 + 1] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 360] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 360] == j1)
		{
			c = false;
			c(-1);
			return true;
		}
		if (a_data_p.g_byte_array1d[a_data_p.P_int + 360 + 2] == i1 && a_data_p.h_byte_array1d[a_data_p.P_int + 360 + 2] == j1)
		{
			c = false;
			c(-1);
			return true;
		} else
		{
			return false;
		}
	}

	private boolean k()
	{
		a_int = 4;
		a_data_p.aT = 0;
		while (a_int != 64) 
		{
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 180 - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 180) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 180 - 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 540) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 360) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 180) - 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 360) - 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 540) - 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_int == 4)
				a_int = 41;
			else
			if (a_int < 54)
				a_int++;
			else
			if (a_int == 54)
				a_int = 61;
			else
				a_int++;
		}
		if (a_data_p.aT != 0)
		{
			c = true;
			c(a_data_p.a_data_x.c[0]);
			b_boolean = true;
			return true;
		} else
		{
			return false;
		}
	}

	private boolean l()
	{
		a_data_p.aT = 0;
		for (a_int = 4; a_int != 64;)
		{
			if (a_data_p.l_byte_array1d[(a_data_p.P_int - 180) + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int - 180) + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 180 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int - 180) + 4] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 4] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 180 + 4] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 4] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 4] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_int == 4)
				a_int = 41;
			else
			if (a_int < 54)
				a_int++;
			else
			if (a_int == 54)
				a_int = 61;
			else
				a_int++;
		}

		if (a_data_p.aT != 0)
		{
			c = true;
			c(a_data_p.a_data_x.c[0]);
			b_boolean = true;
			return true;
		} else
		{
			return false;
		}
	}

	private boolean m()
	{
		a_data_p.aT = 0;
		for (a_int = 4; a_int != 64;)
		{
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 1 - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 1) - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 2) - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 3) - 180] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 1 - 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int - 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 1) - 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 2) - 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 3) - 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_int == 4)
				a_int = 41;
			else
			if (a_int < 54)
				a_int++;
			else
			if (a_int == 54)
				a_int = 61;
			else
				a_int++;
		}

		if (a_data_p.aT != 0)
		{
			c = true;
			c(a_data_p.a_data_x.c[0]);
			b_boolean = true;
			return true;
		} else
		{
			return false;
		}
	}

	private boolean n()
	{
		a_data_p.aT = 0;
		for (a_int = 4; a_int != 64;)
		{
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 360) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 540) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 540 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[(a_data_p.P_int + 720) - 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 720] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 720 + 1] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 720 + 2] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_data_p.l_byte_array1d[a_data_p.P_int + 720 + 3] == a_int + 1 && a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = a_int;
				a_data_p.aT++;
			}
			if (a_int == 4)
				a_int = 41;
			else
			if (a_int < 54)
				a_int++;
			else
			if (a_int == 54)
				a_int = 61;
			else
				a_int++;
		}

		if (a_data_p.aT != 0)
		{
			c = true;
			c(a_data_p.a_data_x.c[0]);
			b_boolean = true;
			return true;
		} else
		{
			return false;
		}
	}

	private void c(int i1)
	{
		if (i1 == -1)
		{
			a((byte)121, -1);
			c = true;
			return;
		}
		if (i1 == 18 || i1 == 9 || i1 == 10 || i1 == 17)
		{
			if (i1 == 18)
				z();
			else
				y();
		} else
		if (i1 == 94)
			A();
		else
		if (i1 == 84)
			B();
		else
		if (a_data_p.d_byte_array1d[i1] != -1)
		{
			if (a_data_p.av != 0)
			{
				for (int j1 = 0; j1 < a_data_p.av; j1++)
					if (a_data_p.d_byte_array1d[i1] == a_data_p.a_byte_array1d[j1])
					{
						a(a_data_p.d_byte_array1d[i1], i1);
						c = true;
					}

				if (!c)
					w();
			} else
			if (!c)
				w();
		} else
		if (a_data_p.c_byte_array1d[i1] != -1)
		{
			if (a_data_p.c_byte_array1d[i1] == 0)
				D();
			else
			if (a_data_p.aB_int != 0)
			{
				for (int k1 = 0; k1 < a_data_p.aB_int; k1++)
				{
					a_byte = a_data_p.m_byte_array1d[k1];
					if (a_data_p.c_byte_array1d[i1] != a_byte)
						continue;
					D();
					c = true;
					break;
				}

				if (!c)
					if (a_data_p.av != 0)
					{
						for (int k2 = 0; k2 < a_data_p.av; k2++)
						{
							if (a_data_p.c_byte_array1d[i1] != a_data_p.a_byte_array1d[k2])
								continue;
							D();
							c = true;
							break;
						}

						if (!c)
							C();
					} else
					{
						C();
					}
			} else
			if (a_data_p.av != 0)
			{
				for (int l1 = 0; l1 < a_data_p.av; l1++)
				{
					if (a_data_p.c_byte_array1d[i1] != a_data_p.a_byte_array1d[l1])
						continue;
					D();
					c = true;
					break;
				}

				if (!c)
					C();
			} else
			{
				C();
			}
		} else
		if (a_data_p.b_byte_array1d[i1] != -1)
		{
			if (a_data_p.b_byte_array1d[i1] == 0)
				C();
			else
			if (a_data_p.av != 0)
			{
				for (int i2 = 0; i2 < a_data_p.av; i2++)
				{
					if (a_data_p.b_byte_array1d[i1] != a_data_p.a_byte_array1d[i2])
						continue;
					C();
					c = true;
					break;
				}

				if (!c)
					if (a_data_p.aB_int != 0)
					{
						for (int l2 = 0; l2 < a_data_p.aB_int; l2++)
						{
							a_byte = a_data_p.m_byte_array1d[l2];
							if (a_data_p.b_byte_array1d[i1] != a_byte)
								continue;
							C();
							c = true;
							break;
						}

						if (!c)
							x();
					} else
					{
						x();
					}
			} else
			if (a_data_p.aB_int != 0)
			{
				for (int j2 = 0; j2 < a_data_p.aB_int; j2++)
				{
					a_byte = a_data_p.m_byte_array1d[j2];
					if (a_data_p.b_byte_array1d[i1] != a_byte)
						continue;
					C();
					c = true;
					break;
				}

				if (!c)
					x();
			} else
			{
				x();
			}
		} else
		{
			u();
		}
		a_data_p.al = i1;
	}

	private void u()
	{
		if (!a_data_p.U)
		{
			if (a_data_p.a_data_g.a(a_data_p.P_int + 180 + 1))
			{
				a_data_p.t_int_array1d[a_data_p.C] = 0xa001f;
				a_data_p.C++;
			}
			a_data_p.t_int_array1d[a_data_p.C] = 0xa001d;
			a_data_p.C++;
			if (a_data_p.a_data_g.a(a_data_p.P_int + 180 + 1))
			{
				a_data_p.t_int_array1d[a_data_p.C] = 0xa001a;
				a_data_p.C++;
			}
			a_data_p.o_boolean = true;
		}
	}

	private void v()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001d;
		a_data_p.C++;
	}

	private void w()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
		a_data_p.C++;
	}

	private void x()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
		a_data_p.C++;
	}

	private void y()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa0020;
		a_data_p.t_int_array1d[a_data_p.C + 1] = 0xa001f;
		a_data_p.t_int_array1d[a_data_p.C + 2] = 0xa001c;
		a_data_p.C += 3;
		a_data_p.aB_boolean = true;
	}

	private void z()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001f;
		a_data_p.t_int_array1d[a_data_p.C + 1] = 0xa001c;
		a_data_p.C += 2;
		a_data_p.aC = true;
	}

	private void A()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa0020;
		a_data_p.C++;
		if (!a_data_p.T)
		{
			a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
			a_data_p.C++;
		}
		d = true;
	}

	private void B()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001f;
		a_data_p.C++;
		if (!a_data_p.T)
		{
			a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
			a_data_p.C++;
		}
		a_data_p.aD = true;
	}

	private void C()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
		a_data_p.t_int_array1d[a_data_p.C + 1] = 0xa0019;
		a_data_p.C += 2;
	}

	private void D()
	{
		a_data_p.t_int_array1d[a_data_p.C] = 0xa001b;
		a_data_p.t_int_array1d[a_data_p.C + 1] = 0xa0019;
		a_data_p.t_int_array1d[a_data_p.C + 2] = 0xa001c;
		a_data_p.C += 3;
	}

	private void a(byte byte0, int i1)
	{
		if (byte0 == 14)
		{
			a_data_p.t_int_array1d[a_data_p.C] = 0xd0008;
			a_data_p.C++;
			return;
		}
		if (byte0 == 83)
		{
			a_data_p.t_int_array1d[a_data_p.C] = 0xd0012;
			a_data_p.C++;
			return;
		}
		if (byte0 == 121)
		{
			a_data_p.t_int_array1d[a_data_p.C] = 0xd0011;
			a_data_p.C++;
			return;
		}
		if (byte0 == 81)
		{
			if (!b_boolean)
				if (a_data_p.aT == 0)
				{
					a_data_p.t_int_array1d[a_data_p.C + 1] = 0xd0009;
					a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
					a_data_p.C += 2;
					a_data_p.a_data_x.c[0] = i1;
					a_data_p.aT++;
					return;
				} else
				{
					a_data_p.t_int_array1d[a_data_p.C] = 0xd0009;
					a_data_p.C++;
					return;
				}
			a_data_p.t_int_array1d[a_data_p.C] = 0xa001c;
			a_data_p.C++;
			if (a_data_p.aT < 5)
			{
				a_data_p.a_data_x.c[a_data_p.aT] = i1;
				a_data_p.aT++;
			}
		}
	}

	private void E()
	{
		a_data_p.C = 0;
		if (a_data_p.o_int == 0)
		{
			for (int i1 = 0; i1 < 120; i1++)
				if (a_data_p.m_byte_array1d[a_data_p.z] == (byte)i1)
				{
					c = false;
					d(i1);
				}

		}
		if (a_data_p.o_int == 4)
		{
			for (int j1 = 0; j1 < 120; j1++)
				if (a_data_p.a_byte_array1d[a_data_p.v] == (byte)j1)
				{
					c = false;
					e(j1);
				}

		}
	}

	private void F()
	{
		a_data_p.C = 0;
		for (int i1 = 0; i1 < 120; i1++)
			if (a_data_p.a_java_lang_String_array1d[a_data_p.w] == a_data_p.b_java_lang_String_array1d[i1])
			{
				c = false;
				e(i1);
			}

	}

	private void d(int i1)
	{
		boolean flag = false;
		if (a_data_p.aB_int != 0)
		{
			for (int j1 = 0; j1 < a_data_p.aB_int; j1++)
			{
				a_byte = a_data_p.m_byte_array1d[j1];
				if (a_data_p.c_byte_array1d[i1] == 0)
				{
					k();
					flag = true;
					break;
				}
				if (a_data_p.c_byte_array1d[i1] == a_byte)
				{
					k();
					c = true;
					flag = true;
					break;
				}
				if (!c)
					j();
			}

			a_data_p.al = i1;
		}
		if (!flag && a_data_p.av != 0)
		{
			for (int k1 = 0; k1 < a_data_p.av; k1++)
			{
				if (a_data_p.c_byte_array1d[i1] == 0)
				{
					k();
					break;
				}
				if (a_data_p.c_byte_array1d[i1] == a_data_p.a_byte_array1d[k1])
				{
					k();
					c = true;
					break;
				}
				if (!c)
					j();
			}

			a_data_p.al = i1;
		}
	}

	private void e(int i1)
	{
		a_data_p.al = i1;
		w();
	}

	public final void j()
	{
		a_data_p.C = 2;
		a_data_p.t_int_array1d[0] = 0xa001e;
		a_data_p.t_int_array1d[1] = 0xa001c;
	}

	public final void k()
	{
		a_data_p.C = 3;
		a_data_p.t_int_array1d[0] = 0xa001c;
		a_data_p.t_int_array1d[1] = 0xa001b;
		a_data_p.t_int_array1d[2] = 0xa001e;
	}

	public final void a(int i1)
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
		{
			if (i1 == 0 && a_data_p.aB_int > 0 || i1 == 4 && a_data_p.av > 0)
				a_data_p.n_int = 1;
			a_data_p.o_int = i1;
			a_data_p.a_data_aa.f();
		}
	}

	public final void l()
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
		{
			a_data_p.p = 1;
			a_data_p.a_data_aa.f();
		}
	}

	public final void m()
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
		{
			a_data_p.a_data_aa.f();
			if (a_data_p.t_int == 0)
				a_data_p.a_data_ad.c();
			if (a_data_p.t_int == 1)
			{
				a_data_p.c_int = 1;
				a_data_p.a_data_t.a();
				a_data_p.a_data_t.b(a_data_p.aG);
				a_data_p.a_data_v.g();
				a_data_p.l_int = 1;
			}
		}
	}

	public final void n()
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1)
			if (a_data_p.aB_boolean)
			{
				if (a_data_p.ay_int > 0)
				{
					a_data_p.m_int = 6;
					for (int i1 = 0; i1 < a_data_p.g_java_lang_String_array1d.length; i1++)
						a_data_p.g_java_lang_String_array1d[i1] = null;

					a_data_p.aA_int = 0;
					a_data_p.aw_boolean = true;
					return;
				}
			} else
			if (a_data_p.ax_int > 0)
			{
				a_data_p.m_int = 6;
				for (int j1 = 0; j1 < a_data_p.g_java_lang_String_array1d.length; j1++)
					a_data_p.g_java_lang_String_array1d[j1] = null;

				a_data_p.aA_int = 0;
				a_data_p.aw_boolean = true;
			}
	}

	public final void o()
	{
		if (!a_data_p.ae && ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 5 || a_data_p.a_data_j.e == 1))
		{
			a_data_p.a_data_j.e = 0;
			if (a_data_p.ak == 1 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M)
					G();
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N)
					G();
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O_boolean)
					G();
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean)
					G();
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean)
					G();
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O_boolean && a_data_p.P_boolean && a_data_p.Q_boolean && a_data_p.R_boolean)
					G();
			} else
			if (a_data_p.ak == 1)
			{
				if (a_data_p.G_boolean)
					G();
			} else
			if (a_data_p.ak == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean)
					G();
			} else
			if (a_data_p.ak == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean)
					G();
			} else
			if (a_data_p.ak == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean)
					G();
			} else
			if (a_data_p.ak == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean)
					G();
			} else
			if (a_data_p.ak == 6 && a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L)
				G();
		}
		if (a_data_p.ae && a_data_p.l_int != 8)
		{
			a_data_p.a_data_r.a();
			for (int i1 = 0; i1 < 120; i1++)
			{
				a_data_p.e_java_lang_String_array1d[i1] = "";
				a_data_p.d_java_lang_String_array1d[i1] = "";
			}

			a_data_p.ay_int = 0;
			a_data_p.ax_int = 0;
			if (a_data_p.t_long > 8000L)
			{
				if (b_int == 0)
				{
					a_data_p.m_int = 1;
					a_data_p.n_int = 4;
					a_data_p.s = 5;
				} else
				if (b_int == 1)
				{
					a_data_p.m_int = 8;
					a_data_p.p = 0;
				} else
				if (b_int == 2)
				{
					a_data_p.m_int = 0;
					a_data_p.z = 0;
					a_data_p.au = 0;
				} else
				if (b_int == 3)
				{
					a_data_p.m_int = 1;
					a_data_p.n_int = 0;
					a_data_p.s = 0;
				} else
				if (b_int == 4)
				{
					a_data_p.m_int = 1;
					a_data_p.n_int = 3;
					a_data_p.s = 2;
					a_data_p.z = 0;
					a_data_p.au = 0;
				}
				b_int = -1;
				a_data_p.aw_boolean = true;
				a_data_p.ae = false;
				a_data_p.an = 0;
				a_data_p.ak = 0;
				a_data_p.am = 0;
				a_data_p.B = 0;
				if (a_data_p.aC)
				{
					a_data_p.y_long = 0L;
					a_data_p.H_long = 0L;
				}
				a_data_p.aB_boolean = false;
				a_data_p.aC = false;
				a_data_p.aD = false;
			}
			if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
				a_data_p.t_long = 8001L;
		}
	}

	private void G()
	{
		if (a_data_p.ao == 9)
		{
			a_data_p.f_int_array1d[17] = a_data_p.f_int_array1d[9];
			a_data_p.c_java_lang_String_array1d[17] = a_data_p.c_java_lang_String_array1d[9];
			a_data_p.b_java_lang_String_array1d[17] = a_data_p.b_java_lang_String_array1d[9];
			b_int = 2;
			a_data_p.a_data_ad.l();
		} else
		if (a_data_p.ao == 10)
		{
			a_data_p.f_int_array1d[17] = a_data_p.f_int_array1d[10];
			a_data_p.c_java_lang_String_array1d[17] = a_data_p.c_java_lang_String_array1d[10];
			a_data_p.b_java_lang_String_array1d[17] = a_data_p.b_java_lang_String_array1d[10];
			b_int = 2;
			a_data_p.a_data_ad.l();
		} else
		if (a_data_p.ao == 19)
		{
			a_data_p.f_int_array1d[18] = a_data_p.f_int_array1d[19];
			a_data_p.ac_int = a_data_p.ac_int - 2;
			a_data_p.aa_int = a_data_p.ac_int + a_data_p.O_int / 2;
			a_data_p.af = 0;
			a_data_p.V = false;
			a_data_p.W = true;
			a_data_p.X = false;
			a_data_p.Y = false;
			a_data_p.aF_boolean = true;
			a_data_p.H_long = 0L;
			b_int = 2;
			a_data_p.a_data_ad.l();
		} else
		if (a_data_p.ao == 94)
		{
			a_data_p.ap = 1;
			for (int i1 = 0; i1 < a_data_p.l_byte_array1d.length; i1++)
				if (a_data_p.l_byte_array1d[i1] == 85)
					a_data_p.l_byte_array1d[i1] = 95;

			b_int = 2;
			a_data_p.a_data_ad.l();
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 1)
		{
			a_data_p.a_data_ad.k();
			b_int = 0;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 3 || a_data_p.f_byte_array1d[a_data_p.ao] == 5)
		{
			a_data_p.a_data_ad.m();
			b_int = 1;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 0)
		{
			a_data_p.a_data_ad.n();
			b_int = 3;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 10)
		{
			a_data_p.a_data_ad.a("hat");
			b_int = 4;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 7)
		{
			a_data_p.a_data_ad.a("shirt");
			b_int = 4;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 8)
		{
			a_data_p.a_data_ad.a("trousers");
			b_int = 4;
		} else
		if (a_data_p.f_byte_array1d[a_data_p.ao] == 9)
		{
			a_data_p.a_data_ad.a("shoes");
			b_int = 4;
		}
		a_data_p.a_data_ad.o();
		a_data_p.ae = true;
		a_data_p.aw_boolean = true;
		a_data_p.t_long = 0L;
		a_data_p.b();
	}

	public final void p()
	{
		if ((((k) (a_data_p)).bu & 1) != 0 || a_data_p.a_data_j.e == 4)
		{
			switch (a_data_p.u_int)
			{
			default:
				break;

			case 0: // '\0'
				a_data_p.D--;
				if (a_data_p.D == -1)
					a_data_p.D = a_data_p.H_int - 1;
				break;

			case 1: // '\001'
				a_data_p.E--;
				if (a_data_p.E == -1)
					a_data_p.E = a_data_p.I_int - 1;
				break;

			case 2: // '\002'
				a_data_p.F--;
				if (a_data_p.F == -1)
					a_data_p.F = a_data_p.J_int - 1;
				break;

			case 3: // '\003'
				a_data_p.G_int--;
				if (a_data_p.G_int == -1)
					a_data_p.G_int = a_data_p.K_int - 1;
				break;
			}
			a_data_p.aw_boolean = true;
			a_data_p.t_boolean = true;
			a_data_p.o_long = 0L;
		}
		if ((((k) (a_data_p)).bu & 2) != 0 || a_data_p.a_data_j.e == 6)
		{
			switch (a_data_p.u_int)
			{
			default:
				break;

			case 0: // '\0'
				a_data_p.D++;
				if (a_data_p.D == a_data_p.H_int)
					a_data_p.D = 0;
				break;

			case 1: // '\001'
				a_data_p.E++;
				if (a_data_p.E == a_data_p.I_int)
					a_data_p.E = 0;
				break;

			case 2: // '\002'
				a_data_p.F++;
				if (a_data_p.F == a_data_p.J_int)
					a_data_p.F = 0;
				break;

			case 3: // '\003'
				a_data_p.G_int++;
				if (a_data_p.G_int == a_data_p.K_int)
					a_data_p.G_int = 0;
				break;
			}
			a_data_p.aw_boolean = true;
			a_data_p.u_boolean = true;
			a_data_p.o_long = 0L;
		}
	}

	public final void q()
	{
		if ((((k) (a_data_p)).bu & 0x4000) != 0 || (((k) (a_data_p)).bu & 0x8000) != 0 || (((k) (a_data_p)).bu & 0x10) != 0 || a_data_p.a_data_j.e == 1 || a_data_p.a_data_j.e == 3)
		{
			switch (a_data_p.l_int)
			{
			case 10: // '\n'
				a_data_p.l_int = 3;
				a_data_p.aw_boolean = true;
				break;

			case 4: // '\004'
				a_data_p.l_int = 1;
				a_data_p.a_data_aa.h();
				break;
			}
			if (a_data_p.m_int == 9)
				a_data_p.m_int = 0;
			a_data_p.l_boolean = true;
			a_data_p.a();
		}
		if (((((k) (a_data_p)).bu & 4) != 0 || a_data_p.a_data_j.e == 2) && a_data_p.b_java_util_Vector.size() > 1 && a_data_p.h_int != 0)
		{
			a_data_p.n_boolean = true;
			a_data_p.m_boolean = true;
			a_data_p.h_int--;
			a_data_p.i_int = 1;
		}
		if (((((k) (a_data_p)).bu & 8) != 0 || a_data_p.a_data_j.e == 8) && a_data_p.b_java_util_Vector.size() > 1 && a_data_p.h_int != a_data_p.b_java_util_Vector.size() - 1)
		{
			a_data_p.n_boolean = true;
			a_data_p.m_boolean = true;
			a_data_p.h_int++;
			a_data_p.i_int = 2;
		}
	}

	public final void r()
	{
		a_data_p.u_int_array1d[0] = 0xa0016;
		a_data_p.u_int_array1d[1] = 0xa0017;
		a_data_p.u_int_array1d[2] = 0xa0018;
		a_data_p.u_int_array1d[3] = 0xa0019;
		a_data_p.u_int_array1d[4] = 0xa001a;
		a_data_p.u_int_array1d[5] = 0xa001b;
		a_data_p.u_int_array1d[6] = 0xa001c;
		a_data_p.u_int_array1d[7] = 0xa001d;
		a_data_p.u_int_array1d[8] = 0xa001e;
		a_data_p.u_int_array1d[9] = 0xa001f;
		a_data_p.u_int_array1d[10] = 0xa0020;
		a_data_p.u_int_array1d[11] = 0xd0008;
		a_data_p.u_int_array1d[12] = 0xd0012;
		a_data_p.u_int_array1d[13] = 0xd0011;
		a_data_p.u_int_array1d[14] = 0xd0009;
		a_data_p.u_int_array1d[15] = 0xa0021;
		a_data_p.u_int_array1d[16] = 0xa0022;
		a_data_p.u_int_array1d[17] = 0xa0023;
		a_data_p.u_int_array1d[18] = 0xa0024;
		a_data_p.u_int_array1d[19] = 0xa0025;
		a_data_p.u_int_array1d[20] = 0xa0026;
	}

	public final void s()
	{
		if (a_data_p.a_Robinson_MyMidlet.getAppProperty("UNITYGAMECATALOGURL") == null)
		{
			a_data_p.a_boolean = false;
			a_data_p.a_java_lang_String = "";
			a_data_p.b_int = 5;
			return;
		} else
		{
			a_data_p.a_boolean = true;
			a_data_p.a_java_lang_String = a_data_p.a_Robinson_MyMidlet.getAppProperty("UNITYGAMECATALOGURL");
			a_data_p.b_int = 6;
			return;
		}
	}
}
