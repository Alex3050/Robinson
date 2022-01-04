// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

// Referenced classes of package data:
//			aa, ac, k, p, 
//			w

public final class r
{

	private p a;

	public r(p p1)
	{
		a = p1;
	}

	public final void a(StringBuffer stringbuffer)
	{
		int j;
		if (a.hasPointerEvents())
			j = 52 + a.aI_int * a.as;
		else
			j = 40 + a.aI_int * a.as;
		if (a.aw_boolean)
		{
			a.aA = 0;
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			for (int l = 0; l < a.as; l++)
			{
				if (l % 2 == 0)
				{
					if (a.au % 2 == 0)
						((k) (a)).a.setColor(10061);
					else
						((k) (a)).a.setColor(6965);
				} else
				if (a.au % 2 == 0)
					((k) (a)).a.setColor(6965);
				else
					((k) (a)).a.setColor(10061);
				if (a.hasPointerEvents())
					((k) (a)).a.fillRect(0, 52 + l * a.aI_int, k.a(), a.aI_int);
				else
					((k) (a)).a.fillRect(0, 40 + l * a.aI_int, k.a(), a.aI_int);
			}

			if (a.hasPointerEvents())
			{
				a.a_data_w.a(((k) (a)).a, 0xa000f, 0, 16);
				for (int i1 = 1; i1 < a.aV + 1; i1++)
					a.a_data_w.a(((k) (a)).a, 0xa0010, 2 * i1, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0011, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (24 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			} else
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 16);
				for (int j1 = 1; j1 < a.aV + 1; j1++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * j1, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (16 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}
			for (int k1 = 0; k1 < 120; k1++)
				if (a.aB_boolean)
				{
					if (a.e[a.y] == a.b_java_lang_String_array1d[k1])
						a.ao = k1;
				} else
				if (a.aC)
				{
					if (k1 == 19)
						a.ao = k1;
				} else
				if (a.aD)
				{
					if (k1 == 94)
						a.ao = k1;
				} else
				if (a.d[a.y] == a.b_java_lang_String_array1d[k1])
					a.ao = k1;

			a.a_data_aa.n = 0;
			a.a_data_aa.o = 0;
			a.a_data_aa.p = 0;
			a.a_data_aa.q = 0;
			a.a_data_aa.r = 0;
			a.a_data_aa.s = 0;
			a.am = 0;
			a.ak = 0;
			if (a.a_byte_array2d[a.ao][0] != 0)
			{
				a.G = false;
				a.ak = 1;
				a.an = 1;
				for (int l1 = 0; l1 < a.aB_int; l1++)
					if (a.m_byte_array1d[l1] == a.a_byte_array2d[a.ao][0])
					{
						for (int i5 = 1; i5 < a.n_byte_array1d.length; i5++)
							if (a.a_byte_array2d[a.ao][1] == a.n_byte_array1d[i5])
								a.a_data_aa.u = i5;

						if (a.q[l1] >= a.a_data_aa.u)
							a.G = true;
						a.a_data_aa.n = a.q[l1];
					}

				a.g_java_lang_String_array1d[a.aA] = a.a_data_ac.a(108).toString();
				a.aA++;
				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][0]] + ".." + a.a_byte_array2d[a.ao][1] + " (" + a.a_data_aa.n + ")";
				a.aA++;
			}
			if (a.a_byte_array2d[a.ao][2] != 0)
			{
				a.H = false;
				a.ak = 2;
				a.an = 2;
				for (int i2 = 0; i2 < a.aB_int; i2++)
					if (a.m_byte_array1d[i2] == a.a_byte_array2d[a.ao][2])
					{
						for (int j5 = 1; j5 < a.n_byte_array1d.length; j5++)
							if (a.a_byte_array2d[a.ao][3] == a.n_byte_array1d[j5])
								a.a_data_aa.v = j5;

						if (a.q[i2] >= a.a_data_aa.v)
							a.H = true;
						a.a_data_aa.o = a.q[i2];
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][2]] + ".." + a.a_byte_array2d[a.ao][3] + " (" + a.a_data_aa.o + ")";
				a.aA++;
			}
			if (a.a_byte_array2d[a.ao][4] != 0)
			{
				a.I = false;
				a.ak = 3;
				a.an = 3;
				for (int j2 = 0; j2 < a.aB_int; j2++)
					if (a.m_byte_array1d[j2] == a.a_byte_array2d[a.ao][4])
					{
						for (int k5 = 1; k5 < a.n_byte_array1d.length; k5++)
							if (a.a_byte_array2d[a.ao][5] == a.n_byte_array1d[k5])
								a.a_data_aa.w = k5;

						if (a.q[j2] >= a.a_data_aa.w)
							a.I = true;
						a.a_data_aa.p = a.q[j2];
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][4]] + ".." + a.a_byte_array2d[a.ao][5] + " (" + a.a_data_aa.p + ")";
				a.aA++;
			}
			if (a.a_byte_array2d[a.ao][6] != 0)
			{
				a.J_boolean = false;
				a.ak = 4;
				a.an = 4;
				for (int k2 = 0; k2 < a.aB_int; k2++)
					if (a.m_byte_array1d[k2] == a.a_byte_array2d[a.ao][6])
					{
						for (int l5 = 1; l5 < a.n_byte_array1d.length; l5++)
							if (a.a_byte_array2d[a.ao][7] == a.n_byte_array1d[l5])
								a.a_data_aa.x = l5;

						if (a.q[k2] >= a.a_data_aa.x)
							a.J_boolean = true;
						a.a_data_aa.q = a.q[k2];
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][6]] + ".." + a.a_byte_array2d[a.ao][7] + " (" + a.a_data_aa.q + ")";
				a.aA++;
			}
			if (a.a_byte_array2d[a.ao][8] != 0)
			{
				a.K = false;
				a.ak = 5;
				a.an = 5;
				for (int l2 = 0; l2 < a.aB_int; l2++)
					if (a.m_byte_array1d[l2] == a.a_byte_array2d[a.ao][8])
					{
						for (int i6 = 1; i6 < a.n_byte_array1d.length; i6++)
							if (a.a_byte_array2d[a.ao][9] == a.n_byte_array1d[i6])
								a.a_data_aa.y = i6;

						if (a.q[l2] >= a.a_data_aa.y)
							a.K = true;
						a.a_data_aa.r = a.q[l2];
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][8]] + ".." + a.a_byte_array2d[a.ao][9] + " (" + a.a_data_aa.r + ")";
				a.aA++;
			}
			if (a.a_byte_array2d[a.ao][10] != 0)
			{
				a.L = false;
				a.ak = 6;
				a.an = 6;
				for (int i3 = 0; i3 < a.aB_int; i3++)
					if (a.m_byte_array1d[i3] == a.a_byte_array2d[a.ao][10])
					{
						for (int j6 = 1; j6 < a.n_byte_array1d.length; j6++)
							if (a.a_byte_array2d[a.ao][11] == a.n_byte_array1d[j6])
								a.a_data_aa.z = j6;

						if (a.q[i3] >= a.a_data_aa.z)
							a.L = true;
						a.a_data_aa.s = a.q[i3];
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.a_byte_array2d[a.ao][10]] + ".." + a.a_byte_array2d[a.ao][11] + " (" + a.a_data_aa.s + ")";
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][0] != 0 && a.b_byte_array2d[a.ao][0] != -1)
			{
				a.M_boolean = false;
				a.am = 1;
				for (int j3 = 0; j3 < a.av; j3++)
					if (a.a_byte_array1d[j3] == a.b_byte_array2d[a.ao][0])
					{
						for (int k6 = 1; k6 < a.n_byte_array1d.length; k6++)
							if (a.b_byte_array2d[a.ao][1] == a.n_byte_array1d[k6])
								a.a_data_aa.A = k6;

						if (a.g_int_array1d[j3] >= a.a_data_aa.A)
							a.M_boolean = true;
					}

				a.g_java_lang_String_array1d[a.aA] = "";
				a.aA++;
				a.g_java_lang_String_array1d[a.aA] = a.a_data_ac.a(109).toString();
				a.aA++;
				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][0]];
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][2] != 0)
			{
				a.N_boolean = false;
				a.am = 2;
				for (int k3 = 0; k3 < a.av; k3++)
					if (a.a_byte_array1d[k3] == a.b_byte_array2d[a.ao][2])
					{
						for (int l6 = 1; l6 < a.n_byte_array1d.length; l6++)
							if (a.b_byte_array2d[a.ao][3] == a.n_byte_array1d[l6])
								a.a_data_aa.B = l6;

						if (a.g_int_array1d[k3] >= a.a_data_aa.B)
							a.N_boolean = true;
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][2]];
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][4] != 0)
			{
				a.O_boolean = false;
				a.am = 3;
				for (int l3 = 0; l3 < a.av; l3++)
					if (a.a_byte_array1d[l3] == a.b_byte_array2d[a.ao][4])
					{
						for (int i7 = 1; i7 < a.n_byte_array1d.length; i7++)
							if (a.b_byte_array2d[a.ao][5] == a.n_byte_array1d[i7])
								a.a_data_aa.C = i7;

						if (a.g_int_array1d[l3] >= a.a_data_aa.C)
							a.O_boolean = true;
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][4]];
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][6] != 0)
			{
				a.P = false;
				a.am = 4;
				for (int i4 = 0; i4 < a.av; i4++)
					if (a.a_byte_array1d[i4] == a.b_byte_array2d[a.ao][6])
					{
						for (int j7 = 1; j7 < a.n_byte_array1d.length; j7++)
							if (a.b_byte_array2d[a.ao][7] == a.n_byte_array1d[j7])
								a.a_data_aa.D = j7;

						if (a.g_int_array1d[i4] >= a.a_data_aa.D)
							a.P = true;
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][6]];
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][8] != 0)
			{
				a.Q_boolean = false;
				a.am = 5;
				for (int j4 = 0; j4 < a.av; j4++)
					if (a.a_byte_array1d[j4] == a.b_byte_array2d[a.ao][8])
					{
						for (int k7 = 1; k7 < a.n_byte_array1d.length; k7++)
							if (a.b_byte_array2d[a.ao][9] == a.n_byte_array1d[k7])
								a.a_data_aa.E = k7;

						if (a.g_int_array1d[j4] >= a.a_data_aa.E)
							a.Q_boolean = true;
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][8]];
				a.aA++;
			}
			if (a.b_byte_array2d[a.ao][10] != 0)
			{
				a.R_boolean = false;
				a.am = 6;
				for (int k4 = 0; k4 < a.av; k4++)
					if (a.a_byte_array1d[k4] == a.b_byte_array2d[a.ao][10])
					{
						for (int l7 = 1; l7 < a.n_byte_array1d.length; l7++)
							if (a.b_byte_array2d[a.ao][11] == a.n_byte_array1d[l7])
								a.a_data_aa.F = l7;

						if (a.g_int_array1d[k4] >= a.a_data_aa.F)
							a.R_boolean = true;
					}

				a.g_java_lang_String_array1d[a.aA] = a.b_java_lang_String_array1d[a.b_byte_array2d[a.ao][10]];
				a.aA++;
			}
			a.at = a.aA;
			if (a.at > a.as)
				a.at = a.as;
			for (int l4 = 0; l4 < a.at; l4++)
			{
				b(l4 + a.B);
				StringBuffer stringbuffer1 = (new StringBuffer()).append(a.g_java_lang_String_array1d[l4 + a.B]);
				if (a.hasPointerEvents())
					a.a_data_ac.a(((k) (a)).a, stringbuffer1, k.a() >> 1, 52 + a.aI_int * l4 + a.aI_int / 2 + 4, a.a_data_aa.k, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
				else
					a.a_data_ac.a(((k) (a)).a, stringbuffer1, k.a() >> 1, 40 + a.aI_int * l4 + a.aI_int / 2 + 4, a.a_data_aa.k, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}

		}
		if (!a.ae)
		{
			if (a.hasPointerEvents())
			{
				if (a.h_boolean)
					a.a_data_w.a(((k) (a)).a, 0xa003b, (k.a() >> 1) - 12, 40);
				else
				if (a.B > 0)
					a.a_data_w.a(((k) (a)).a, 0xa0039, (k.a() >> 1) - 12, 40);
				else
					a.a_data_w.a(((k) (a)).a, 0xa003d, (k.a() >> 1) - 12, 40);
				if (a.i_boolean)
					a.a_data_w.a(((k) (a)).a, 0xa003c, (k.a() >> 1) - 12, j);
				else
				if (a.B < a.aA - a.as)
					a.a_data_w.a(((k) (a)).a, 0xa003a, (k.a() >> 1) - 12, j);
				else
					a.a_data_w.a(((k) (a)).a, 0xa003e, (k.a() >> 1) - 12, j);
			} else
			{
				if (a.h_boolean)
					a.a_data_w.a(((k) (a)).a, 0xa002f, (k.a() >> 1) - 8, 32);
				else
				if (a.B > 0)
					a.a_data_w.a(((k) (a)).a, 0xa002d, (k.a() >> 1) - 8, 32);
				else
					a.a_data_w.a(((k) (a)).a, 0xa0031, (k.a() >> 1) - 8, 32);
				if (a.i_boolean)
					a.a_data_w.a(((k) (a)).a, 0xa0030, (k.a() >> 1) - 8, j);
				else
				if (a.B < a.aA - a.as)
					a.a_data_w.a(((k) (a)).a, 0xa002e, (k.a() >> 1) - 8, j);
				else
					a.a_data_w.a(((k) (a)).a, 0xa0032, (k.a() >> 1) - 8, j);
			}
			if (a.n_long > 500L)
			{
				if (a.h_boolean)
					a.h_boolean = false;
				if (a.i_boolean)
					a.i_boolean = false;
			}
		}
	}

	private void b(int j)
	{
		if (a.ak == 1 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.N_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.O_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.P)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 13)
				if (a.Q_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2 || j == 3)
				a.a_data_aa.k = 39423;
			if (j == 4)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3 || j == 4)
				a.a_data_aa.k = 39423;
			if (j == 5)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4 || j == 5)
				a.a_data_aa.k = 39423;
			if (j == 6)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5 || j == 6)
				a.a_data_aa.k = 39423;
			if (j == 7)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 8)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6 || j == 7)
				a.a_data_aa.k = 39423;
			if (j == 8)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 9)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 13)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6 && a.am == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
				if (a.L)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 7 || j == 8)
				a.a_data_aa.k = 39423;
			if (j == 9)
				if (a.M_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 10)
				if (a.N_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 11)
				if (a.O_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 12)
				if (a.P)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 13)
				if (a.Q_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 14)
				if (a.R_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 1)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 2)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 3)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 4)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 5)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				} else
				{
					a.a_data_aa.k = 0x949494;
					return;
				}
		} else
		if (a.ak == 6)
		{
			if (j == 0)
				a.a_data_aa.k = 39423;
			if (j == 1)
				if (a.G)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 2)
				if (a.H)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 3)
				if (a.I)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 4)
				if (a.J_boolean)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 5)
				if (a.K)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 0x949494;
			if (j == 6)
			{
				if (a.L)
				{
					a.a_data_aa.k = 0xffffff;
					return;
				}
				a.a_data_aa.k = 0x949494;
			}
		}
	}

	public final void a()
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			a.a_data_aa.d = (new StringBuffer()).append(a.b_java_lang_String_array1d[a.ao] + a.a_data_ac.a(76));
			a.a_data_ac.a(((k) (a)).a, a.a_data_aa.d, k.a() >> 1, (k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			a.a_data_aa.b();
		}
	}

	public final void b()
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			a.a_data_ac.a(((k) (a)).a, a.a_data_ac.a(81), k.a() >> 1, (k.b() >> 1) - 10, 0xffffff, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
		}
	}

	public final void c()
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			a.a_data_ac.a(((k) (a)).a, a.a_data_ac.a(82), k.a() >> 1, (k.b() >> 1) - 10, 0xffffff, 65, 0, 1, 8, a.aJ_int, (k.a() / 3) * 2, k.b(), 0, 0);
		}
	}

	public final void b(StringBuffer stringbuffer)
	{
		int j;
		if (a.hasPointerEvents())
			j = 52 + 16 * a.as;
		else
			j = 40 + 16 * a.as;
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			for (int l = 0; l < a.as; l++)
			{
				if (l % 2 == 0)
				{
					if (a.au % 2 == 0)
						((k) (a)).a.setColor(10061);
					else
						((k) (a)).a.setColor(6965);
				} else
				if (a.au % 2 == 0)
					((k) (a)).a.setColor(6965);
				else
					((k) (a)).a.setColor(10061);
				if (a.hasPointerEvents())
					((k) (a)).a.fillRect(0, 52 + l * 16, k.a(), 16);
				else
					((k) (a)).a.fillRect(0, 40 + l * 16, k.a(), 16);
			}

			if (a.hasPointerEvents())
			{
				a.a_data_w.a(((k) (a)).a, 0xa000f, 0, 16);
				for (int i1 = 1; i1 < a.aV + 1; i1++)
					a.a_data_w.a(((k) (a)).a, 0xa0010, 2 * i1, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0011, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (24 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			} else
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 16);
				for (int j1 = 1; j1 < a.aV + 1; j1++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * j1, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (16 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}
			a.at = 0;
			a.at = a.aw_int;
			if (a.at > a.as)
				a.at = a.as;
			for (int k1 = 0; k1 < a.at; k1++)
			{
				if (k1 == a.w_int)
					a.a_data_aa.k = 0xffffff;
				else
					a.a_data_aa.k = 39423;
				StringBuffer stringbuffer1 = (new StringBuffer()).append(a.a_java_lang_String_array1d[k1] + ".." + a.h_int_array1d[k1]);
				if (a.hasPointerEvents())
					a.a_data_ac.a(((k) (a)).a, stringbuffer1, k.a() >> 1, 52 + a.aI_int * (k1 - a.au) + a.aI_int / 2 + 4, a.a_data_aa.k, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
				else
					a.a_data_ac.a(((k) (a)).a, stringbuffer1, k.a() >> 1, 40 + a.aI_int * (k1 - a.au) + a.aI_int / 2 + 4, a.a_data_aa.k, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}

		}
		if (a.hasPointerEvents())
		{
			if (a.h_boolean)
				a.a_data_w.a(((k) (a)).a, 0xa003b, (k.a() >> 1) - 12, 40);
			else
			if (a.au > a.as)
				a.a_data_w.a(((k) (a)).a, 0xa0039, (k.a() >> 1) - 12, 40);
			else
				a.a_data_w.a(((k) (a)).a, 0xa003d, (k.a() >> 1) - 12, 40);
			if (a.i_boolean)
				a.a_data_w.a(((k) (a)).a, 0xa003c, (k.a() >> 1) - 12, j);
			else
			if (a.at > a.as && a.au != a.at - 1)
				a.a_data_w.a(((k) (a)).a, 0xa003a, (k.a() >> 1) - 12, j);
			else
				a.a_data_w.a(((k) (a)).a, 0xa003e, (k.a() >> 1) - 12, j);
		} else
		{
			if (a.h_boolean)
				a.a_data_w.a(((k) (a)).a, 0xa002f, (k.a() >> 1) - 8, 32);
			else
			if (a.au > a.as)
				a.a_data_w.a(((k) (a)).a, 0xa002d, (k.a() >> 1) - 8, 32);
			else
				a.a_data_w.a(((k) (a)).a, 0xa0031, (k.a() >> 1) - 8, 32);
			if (a.i_boolean)
				a.a_data_w.a(((k) (a)).a, 0xa0030, (k.a() >> 1) - 8, j);
			else
			if (a.at > a.as && a.au != a.at - 1)
				a.a_data_w.a(((k) (a)).a, 0xa002e, (k.a() >> 1) - 8, j);
			else
				a.a_data_w.a(((k) (a)).a, 0xa0032, (k.a() >> 1) - 8, j);
		}
		if (a.n_long > 500L)
		{
			if (a.h_boolean)
				a.h_boolean = false;
			if (a.i_boolean)
				a.i_boolean = false;
		}
	}

	public final void d()
	{
		((k) (a)).a.setColor(13158);
		((k) (a)).a.fillRect((k.a() >> 1) - (a.a_data_ac.a(79).length() * a.a_data_aa.l) / 2, (k.b() >> 1) - 10, a.a_data_ac.a(79).length() * a.a_data_aa.l, 20);
		a.a_data_ac.a(((k) (a)).a, a.a_data_ac.a(79), k.a() >> 1, (k.b() >> 1) + 4, 0xffffff, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
	}

	public final void c(StringBuffer stringbuffer)
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			if (a.hasPointerEvents())
			{
				a.a_data_w.a(((k) (a)).a, 0xa000f, 0, 16);
				for (int j = 1; j < a.aV + 1; j++)
					a.a_data_w.a(((k) (a)).a, 0xa0010, 2 * j, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0011, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (24 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			} else
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 16);
				for (int l = 1; l < a.aV + 1; l++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * l, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (16 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}
			String s = a.a_data_ac.a(99).toString() + "\\n" + a.a_data_ac.a(100).toString();
			a.a_data_ac.a(((k) (a)).a, new StringBuffer(s), k.a() >> 1, k.b() >> 1, 0xffffff, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			a.a_data_aa.b();
		}
	}

	public final void e()
	{
		a.a_data_aa.b = (new StringBuffer()).append("X:" + a.Z);
		a.a_data_aa.c_java_lang_StringBuffer = (new StringBuffer()).append("Y:" + a.aa);
		a.a_data_ac.a(((k) (a)).a, a.a_data_aa.b, 10, 20, 0xffffff, 20, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
		a.a_data_ac.a(((k) (a)).a, a.a_data_aa.c_java_lang_StringBuffer, 10, 30, 0xffffff, 20, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
	}

	public final void f()
	{
		int j = 0;
		int l = 0;
		((k) (a)).a.setColor(0);
		for (int i1 = a.ac - 1; i1 <= a.ac + a.O_int + 2; i1++)
		{
			for (int j1 = a.ab - 1; j1 <= a.ab + a.N_int + 2; j1++)
			{
				if (i1 >= 0 && j1 >= 0)
				{
					((k) (a)).a.drawLine(a.aM + 0, ((a.aN + a.M_int * l) - a.M_int) + a.V, a.aM + k.a(), ((a.aN + a.M_int * l) - a.M_int) + a.V);
					((k) (a)).a.drawLine(((a.aM + a.M_int * j) - a.M_int) + a.U, a.aN, ((a.aM + a.M_int * j) - a.M_int) + a.U, a.aN + k.b());
				}
				j++;
			}

			j = 0;
			l++;
		}

	}

	public final void g()
	{
		int j = 0;
		int l = 0;
		((k) (a)).a.setColor(0);
		for (int i1 = (a.Z - 1 - a.ab) + 1 + a.N_int / 2; i1 <= (a.Z - 1 - a.ab) + 2 + a.N_int / 2; i1++)
		{
			for (int j1 = (a.aa - 1 - a.ac) + 1 + a.N_int / 2; j1 <= (a.aa - 1 - a.ac) + 2 + a.N_int / 2; j1++)
			{
				((k) (a)).a.drawLine(a.aM + 0 + (a.N_int / 2 - 1) * a.M_int + a.U, ((a.aN + a.M_int * l) - a.M_int) + a.V + (a.N_int / 2 + 2) * a.M_int, ((a.aM + k.a()) - (a.N_int / 2 - 1) * a.M_int) + a.U, ((a.aN + a.M_int * l) - a.M_int) + a.V + (a.N_int / 2 + 2) * a.M_int);
				((k) (a)).a.drawLine(((a.aM + a.M_int * j) - a.M_int) + a.U + (a.N_int / 2 + 1) * a.M_int, a.aN + (a.N_int / 2) * a.M_int + a.V, ((a.aM + a.M_int * j) - a.M_int) + a.U + (a.N_int / 2 + 1) * a.M_int, ((a.aN + k.b() + 3) - (a.N_int / 2) * a.M_int) + a.V);
				j++;
			}

			j = 0;
			l++;
		}

	}

	public final void d(StringBuffer stringbuffer)
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			if (a.hasPointerEvents())
			{
				a.a_data_w.a(((k) (a)).a, 0xa000f, 0, 16);
				for (int j = 1; j < a.aV + 1; j++)
					a.a_data_w.a(((k) (a)).a, 0xa0010, 2 * j, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0011, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (24 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			} else
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 16);
				for (int l = 1; l < a.aV + 1; l++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * l, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (16 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}
			int i1 = 0;
			int j1 = 0;
			int k1 = 0;
			int l1 = 0;
			for (int i2 = 0; i2 < 32400; i2++)
			{
				if (a.k[i2] == 0)
					a.a_data_aa.G = 0xcccc99;
				else
				if (a.k[i2] == 1)
					a.a_data_aa.G = 0x669933;
				else
				if (a.k[i2] == 2)
					a.a_data_aa.G = 0xcc6666;
				else
				if (a.k[i2] == 3)
					a.a_data_aa.G = 0x666633;
				else
				if (a.k[i2] == 4)
					a.a_data_aa.G = 0x66ffcc;
				else
				if (a.k[i2] == 5)
					a.a_data_aa.G = 0x33ffff;
				else
				if (a.k[i2] == 6)
					a.a_data_aa.G = 39372;
				else
				if (a.k[i2] == 7)
					a.a_data_aa.G = 0x333333;
				else
				if (a.k[i2] == 8)
					a.a_data_aa.G = 0xcc9933;
				else
				if (a.k[i2] == 9)
					a.a_data_aa.G = 13056;
				else
				if (a.k[i2] == 10)
					a.a_data_aa.G = 0x996633;
				else
				if (a.k[i2] == 11)
					a.a_data_aa.G = 0x663333;
				else
				if (a.k[i2] == 12)
					a.a_data_aa.G = 0x333300;
				else
				if (a.k[i2] == 13)
					a.a_data_aa.G = 13107;
				else
				if (a.k[i2] == 14)
					a.a_data_aa.G = 0x336633;
				else
				if (a.k[i2] == 15)
					a.a_data_aa.G = 0x330033;
				if (i2 == 180 * j1)
				{
					i1 = 0;
					k1 = 0;
					j1++;
					l1++;
				}
				if (i1 >= 0 + a.Q_int && i1 < 60 + a.Q_int && j1 >= 0 + a.R_int && j1 < 60 + a.R_int)
				{
					((k) (a)).a.setColor(a.a_data_aa.G);
					((k) (a)).a.drawLine((k.a() / 2 - 30) + k1, (48 + l1) - a.R_int - a.a_data_aa.e, (k.a() / 2 - 30) + k1, (48 + l1) - a.R_int - a.a_data_aa.e);
					k1++;
				}
				i1++;
			}

			a.a_data_w.a(((k) (a)).a, 0xa003f, k.a() / 2 - 16 - 1, 140 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0040, k.a() / 2, 140 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0041, k.a() / 2 + 16 + 1, 140 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0042, k.a() / 2 - 16 - 1, 157 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0043, k.a() / 2, 157 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0044, k.a() / 2 + 16 + 1, 157 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0045, k.a() / 2 - 16 - 1, 174 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0046, k.a() / 2, 174 - a.a_data_aa.f - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0047, k.a() / 2 + 16 + 1, 174 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 0 && a.R_int == 0)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 - 16 - 1, 140 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 60 && a.R_int == 0)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2, 140 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 120 && a.R_int == 0)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 + 16 + 1, 140 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 0 && a.R_int == 60)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 - 16 - 1, 157 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 60 && a.R_int == 60)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2, 157 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 120 && a.R_int == 60)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 + 16 + 1, 157 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 0 && a.R_int == 120)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 - 16 - 1, 174 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 60 && a.R_int == 120)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2, 174 - a.a_data_aa.f - a.a_data_aa.e);
			if (a.Q_int == 120 && a.R_int == 120)
				a.a_data_w.a(((k) (a)).a, 0xa0048, k.a() / 2 + 16 + 1, 174 - a.a_data_aa.f - a.a_data_aa.e);
		}
		if (a.w_long > 300L)
		{
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 1;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 2;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 3;
			}
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 4;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 5;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 6;
			}
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 7;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 8;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.a_data_aa.I = 9;
			}
			a.a_data_w.a(((k) (a)).a, 0xa001d, a.W, a.X);
		} else
		{
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa003f;
				a.a_data_aa.I = 1;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0040;
				a.a_data_aa.I = 2;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 0 && a.aa < 60)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 140 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0041;
				a.a_data_aa.I = 3;
			}
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0042;
				a.a_data_aa.I = 4;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0043;
				a.a_data_aa.I = 5;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 60 && a.aa < 120)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 157 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0044;
				a.a_data_aa.I = 6;
			}
			if (a.Z >= 0 && a.Z < 60 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2 - 16 - 1;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0045;
				a.a_data_aa.I = 7;
			}
			if (a.Z >= 60 && a.Z < 120 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0046;
				a.a_data_aa.I = 8;
			}
			if (a.Z >= 120 && a.Z < 180 && a.aa >= 120 && a.aa < 180)
			{
				a.W = k.a() / 2 + 16 + 1;
				a.X = 174 - a.a_data_aa.f - a.a_data_aa.e;
				a.Y = 0xa0047;
				a.a_data_aa.I = 9;
			}
			a.a_data_w.a(((k) (a)).a, a.Y, a.W, a.X);
		}
		if (a.aE)
		{
			a.aO = a.a_data_aa.I;
			a.aE = false;
		}
		if (a.a_data_aa.I == a.aO)
			if (a.w_long > 300L)
			{
				((k) (a)).a.setColor(0xffff00);
				((k) (a)).a.drawLine(((k.a() / 2 - 30) + a.Z) - a.Q_int, (48 + a.aa) - a.R_int - a.a_data_aa.e, (((k.a() / 2 - 30) + a.Z) - a.Q_int) + 1, (48 + a.aa) - a.R_int - a.a_data_aa.e);
				((k) (a)).a.drawLine(((k.a() / 2 - 30) + a.Z) - a.Q_int, (((48 + a.aa) - a.R_int) + 1) - a.a_data_aa.e, (((k.a() / 2 - 30) + a.Z) - a.Q_int) + 1, (((48 + a.aa) - a.R_int) + 1) - a.a_data_aa.e);
			} else
			{
				((k) (a)).a.setColor(0);
				((k) (a)).a.drawLine(((k.a() / 2 - 30) + a.Z) - a.Q_int, (48 + a.aa) - a.R_int - a.a_data_aa.e, (((k.a() / 2 - 30) + a.Z) - a.Q_int) + 1, (48 + a.aa) - a.R_int - a.a_data_aa.e);
				((k) (a)).a.drawLine(((k.a() / 2 - 30) + a.Z) - a.Q_int, (((48 + a.aa) - a.R_int) + 1) - a.a_data_aa.e, (((k.a() / 2 - 30) + a.Z) - a.Q_int) + 1, (((48 + a.aa) - a.R_int) + 1) - a.a_data_aa.e);
			}
		if (a.w_long > 600L)
			a.w_long = 0L;
		if (!a.hasPointerEvents())
		{
			a.a_data_w.a(((k) (a)).a, 0xa002b, (k.a() / 2 - 30 - 8 - 8) + a.a_data_aa.g, 70 - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa002c, (k.a() / 2 + 30 + 8) - a.a_data_aa.g, 70 - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0031, k.a() / 2 - 8, (32 + a.a_data_aa.h) - a.a_data_aa.e);
			a.a_data_w.a(((k) (a)).a, 0xa0032, k.a() / 2 - 8, 116 - a.a_data_aa.h - a.a_data_aa.e);
			if (a.S)
			{
				if (a.Q_int > 0)
					if (a.aG_boolean)
						a.a_data_w.a(((k) (a)).a, 0xa0029, (k.a() / 2 - 30 - 8 - 8) + a.a_data_aa.g, 70 - a.a_data_aa.e);
					else
						a.a_data_w.a(((k) (a)).a, 0xa0027, (k.a() / 2 - 30 - 8 - 8) + a.a_data_aa.g, 70 - a.a_data_aa.e);
				if (a.Q_int < 120)
					if (a.aH_boolean)
						a.a_data_w.a(((k) (a)).a, 0xa002a, (k.a() / 2 + 30 + 8) - a.a_data_aa.g, 70 - a.a_data_aa.e);
					else
						a.a_data_w.a(((k) (a)).a, 0xa0028, (k.a() / 2 + 30 + 8) - a.a_data_aa.g, 70 - a.a_data_aa.e);
				if (a.R_int > 0)
					if (a.aI_boolean)
						a.a_data_w.a(((k) (a)).a, 0xa002f, k.a() / 2 - 8, (32 + a.a_data_aa.h) - a.a_data_aa.e);
					else
						a.a_data_w.a(((k) (a)).a, 0xa002d, k.a() / 2 - 8, (32 + a.a_data_aa.h) - a.a_data_aa.e);
				if (a.R_int < 120)
					if (a.aJ_boolean)
						a.a_data_w.a(((k) (a)).a, 0xa0030, k.a() / 2 - 8, 116 - a.a_data_aa.h - a.a_data_aa.e);
					else
						a.a_data_w.a(((k) (a)).a, 0xa002e, k.a() / 2 - 8, 116 - a.a_data_aa.h - a.a_data_aa.e);
				if (a.o > 1000L)
				{
					if (a.aG_boolean)
						a.aG_boolean = false;
					if (a.aH_boolean)
						a.aH_boolean = false;
					if (a.aI_boolean)
						a.aI_boolean = false;
					if (a.aJ_boolean)
						a.aJ_boolean = false;
				}
			}
		}
		a.a_data_aa.i();
	}

	public final void e(StringBuffer stringbuffer)
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			if (a.hasPointerEvents())
			{
				a.a_data_w.a(((k) (a)).a, 0xa000f, 0, 16);
				for (int j = 1; j < a.aV + 1; j++)
					a.a_data_w.a(((k) (a)).a, 0xa0010, 2 * j, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0011, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (24 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			} else
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 16);
				for (int l = 1; l < a.aV + 1; l++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * l, 16);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 16);
				a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, 16 + (16 - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			}
			if (a.J_long >= 0L && a.J_long <= 5L || a.J_long >= 12L && a.J_long <= 17L || a.J_long >= 24L && a.J_long <= 29L || a.J_long >= 36L && a.J_long <= 41L || a.J_long >= 48L && a.J_long <= 53L)
			{
				a.a_data_aa.a_java_lang_String = a.a_data_ac.a(106).toString();
				if (a.J_long >= 0L && a.J_long <= 5L)
					a.a_data_aa.H = 6 - (int)a.J_long;
				else
				if (a.J_long >= 12L && a.J_long <= 17L)
					a.a_data_aa.H = 18 - (int)a.J_long;
				else
				if (a.J_long >= 24L && a.J_long <= 29L)
					a.a_data_aa.H = 30 - (int)a.J_long;
				else
				if (a.J_long >= 36L && a.J_long <= 41L)
					a.a_data_aa.H = 42 - (int)a.J_long;
				else
				if (a.J_long >= 48L && a.J_long <= 53L)
					a.a_data_aa.H = 54 - (int)a.J_long;
			} else
			if (a.J_long >= 6L && a.J_long <= 11L || a.J_long >= 18L && a.J_long <= 23L || a.J_long >= 30L && a.J_long <= 35L || a.J_long >= 42L && a.J_long <= 47L || a.J_long >= 54L && a.J_long <= 59L)
			{
				a.a_data_aa.a_java_lang_String = a.a_data_ac.a(107).toString();
				if (a.J_long >= 6L && a.J_long <= 11L)
					a.a_data_aa.H = 12 - (int)a.J_long;
				else
				if (a.J_long >= 18L && a.J_long <= 23L)
					a.a_data_aa.H = 24 - (int)a.J_long;
				else
				if (a.J_long >= 30L && a.J_long <= 35L)
					a.a_data_aa.H = 36 - (int)a.J_long;
				else
				if (a.J_long >= 42L && a.J_long <= 47L)
					a.a_data_aa.H = 48 - (int)a.J_long;
				else
				if (a.J_long >= 54L && a.J_long <= 59L)
					a.a_data_aa.H = 60 - (int)a.J_long;
			}
			String s = a.a_data_ac.a(101).toString() + " " + a.a_data_aa.a_java_lang_String + "\\n" + a.a_data_ac.a(102).toString() + " " + a.a_data_aa.H + " " + a.a_data_ac.a(103).toString() + "\\n" + a.a_data_ac.a(104).toString() + " " + a.aG_int + "\\n" + a.a_data_ac.a(105).toString() + " " + a.a_java_lang_StringBuffer;
			a.a_data_ac.a(((k) (a)).a, new StringBuffer(s), k.a() >> 1, (k.b() >> 1) - 20, 39423, 65, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
		}
		a.a_data_aa.i();
	}

	public final void h()
	{
		if (a.l)
		{
			a.a_data_aa.a_java_lang_StringBuffer = a.c;
			if (a.v == null)
			{
				a.a_data_aa.j = 21;
				a.a_data_aa.i = k.b() - 37 - 20;
			} else
			if (a.b_java_lang_StringBuffer == null)
			{
				a.a_data_aa.j = 52;
				a.a_data_aa.i = k.b() - 68 - 20;
			} else
			{
				a.a_data_aa.j = 72;
				a.a_data_aa.i = k.b() - 88 - 20;
			}
			a(a.a_data_aa.a_java_lang_StringBuffer, k.a() >> 1, a.a_data_aa.j + 16, k.a(), a.a_data_aa.i);
			a.l = false;
		}
		if (a.n_boolean)
		{
			a.n_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			if (a.v != null)
			{
				for (int j = 0; j < a.v.length; j++)
				{
					a.a_data_w.a(((k) (a)).a, a.u[1], (k.a() / 2 - ((a.v.length - 1) * 10 + (a.v.length - 1) * 3)) + j * 26, 32);
					if (a.v[j] == a.aH_int)
						a.a_data_w.a(((k) (a)).a, a.u[0], (k.a() / 2 - ((a.v.length - 1) * 10 + (a.v.length - 1) * 3)) + j * 26, 32);
					a.a_data_w.a(((k) (a)).a, a.u[a.v[j]], (k.a() / 2 - ((a.v.length - 1) * 10 + (a.v.length - 1) * 3)) + j * 26, 32);
				}

			}
			if (a.b_java_lang_StringBuffer != null)
			{
				a.a_data_w.a(((k) (a)).a, 0xa0000, 0, 52);
				for (int l = 1; l < a.aV + 1; l++)
					a.a_data_w.a(((k) (a)).a, 0xa0001, 2 * l, 52);

				a.a_data_w.a(((k) (a)).a, 0xa0002, k.a() - 2, 52);
				a.a_data_ac.a(((k) (a)).a, a.b_java_lang_StringBuffer, k.a() >> 1, 52 + (16 - a.aJ_int) / 2, 0xffffff, 17, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
				a.a_data_w.a(((k) (a)).a, 0xa0027, 8, 52);
				a.a_data_w.a(((k) (a)).a, 0xa0028, k.a() - 16, 52);
			}
			ac.c(Integer.parseInt(a.b_java_util_Vector.elementAt(a.h_int).toString()));
			if (ac.b() != -1)
				a.a_data_ac.a(((k) (a)).a, a.a_data_aa.a_java_lang_StringBuffer, k.a() >> 1, a.a_data_aa.j + 16, 0xffffff, 1041, 0, 1, 8, a.aJ_int, k.a(), a.a_data_aa.i, 0, 0);
			a.a_data_aa.c();
		}
		if (a.m_boolean)
			a((k.a() >> 1) - 8, a.a_data_aa.j, k.b() - 16);
	}

	public final void i()
	{
		if (a.aw_boolean)
		{
			a.aw_boolean = false;
			((k) (a)).a.setColor(13158);
			((k) (a)).a.fillRect(0, 0, k.a(), k.b());
			StringBuffer stringbuffer = (new StringBuffer()).append(a.a_data_ac.a(80));
			a.a_data_ac.a(((k) (a)).a, stringbuffer, k.a() >> 1, a.a_data_aa.a_int + 20, 0xffffff, 65, 0, 1, 8, a.aJ_int, k.a(), (2 * k.b()) / 3, 0, 0);
		}
	}

	public final void a(int j)
	{
		((k) (a)).a.setColor(0xffffff);
		((k) (a)).a.fillRect(0, 0, k.a(), k.b());
		for (int l = 1; l < a.aK + 1; l++)
			a.a_data_w.a(((k) (a)).a, a.a_data_aa.c_int, k.a() / 6 + 2 * l, (k.b() / 6 + ((a.aP + a.aL) - a.aQ)) - a.aR);

		if (j == 0)
		{
			a.a_data_ac.a(((k) (a)).a, a.a_data_ac.a(50), k.a() >> 1, ((k.b() / 6 + ((a.aP + a.aL) - a.aQ)) - a.aR) + (a.aP - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			return;
		} else
		{
			a.a_data_ac.a(((k) (a)).a, a.a_data_ac.a(51), k.a() >> 1, ((k.b() / 6 + ((a.aP + a.aL) - a.aQ)) - a.aR) + (a.aP - a.aJ_int) / 2, 0xffffff, 273, 0, 1, 8, a.aJ_int, k.a(), k.b(), 0, 0);
			return;
		}
	}

	public final void a(StringBuffer stringbuffer, int j, int l, int i1, int j1)
	{
		a.b_java_util_Vector.removeAllElements();
		ac.c(0);
		a.l = true;
		a.h_int = 0;
		a.p = 0L;
		a.b_java_util_Vector.addElement(new Integer(0));
		while (a.a_data_aa.a_boolean) 
		{
			a.a_data_ac.a(((k) (a)).a, stringbuffer, j, l, 0xffffff, 1089, 0, 1, 8, a.aJ_int, i1, j1, 0, 0);
			a.b_java_util_Vector.addElement(new Integer(ac.b()));
			if (ac.b() == 0)
				a.a_data_aa.a_boolean = false;
		}
		a.b_java_util_Vector.removeElementAt(a.b_java_util_Vector.size() - 1);
		a.n_boolean = true;
		a.m_boolean = true;
		a.a_data_aa.a_boolean = true;
	}

	public final void a(int j, int l, int i1)
	{
		if (a.hasPointerEvents())
		{
			if (a.b_java_util_Vector.size() > 1)
			{
				if (a.h_int == 0)
					a.a_data_w.a(((k) (a)).a, 0xa003d, j, l);
				else
					a.a_data_w.a(((k) (a)).a, 0xa0039, j, l);
				if (a.h_int == a.b_java_util_Vector.size() - 1)
					a.a_data_w.a(((k) (a)).a, 0xa003e, j, i1);
				else
					a.a_data_w.a(((k) (a)).a, 0xa003a, j, i1);
				a.m_boolean = false;
			}
			switch (a.i_int)
			{
			default:
				break;

			case 1: // '\001'
				a.p = a.p + a.f;
				if (a.p < 500L)
				{
					a.a_data_w.a(((k) (a)).a, 0xa003b, j, l);
					a.m_boolean = true;
				} else
				{
					a.p = 0L;
					a.i_int = 0;
					if (a.h_int == 0)
						a.a_data_w.a(((k) (a)).a, 0xa003d, j, l);
					a.m_boolean = false;
				}
				break;

			case 2: // '\002'
				a.p = a.p + a.f;
				if (a.p < 500L)
				{
					a.a_data_w.a(((k) (a)).a, 0xa003c, j, i1);
					a.m_boolean = true;
					break;
				}
				a.p = 0L;
				a.i_int = 0;
				if (a.h_int == a.b_java_util_Vector.size() - 1)
					a.a_data_w.a(((k) (a)).a, 0xa003e, j, i1);
				a.m_boolean = false;
				break;
			}
			return;
		}
		if (a.b_java_util_Vector.size() > 1)
		{
			if (a.h_int == 0)
				a.a_data_w.a(((k) (a)).a, 0xa0031, j, l);
			else
				a.a_data_w.a(((k) (a)).a, 0xa002d, j, l);
			if (a.h_int == a.b_java_util_Vector.size() - 1)
				a.a_data_w.a(((k) (a)).a, 0xa0032, j, i1);
			else
				a.a_data_w.a(((k) (a)).a, 0xa002e, j, i1);
			a.m_boolean = false;
		}
		switch (a.i_int)
		{
		case 1: // '\001'
			a.p = a.p + a.f;
			if (a.p < 500L)
			{
				a.a_data_w.a(((k) (a)).a, 0xa002f, j, l);
				a.m_boolean = true;
				return;
			}
			a.p = 0L;
			a.i_int = 0;
			if (a.h_int == 0)
				a.a_data_w.a(((k) (a)).a, 0xa0031, j, l);
			a.m_boolean = false;
			return;

		case 2: // '\002'
			a.p = a.p + a.f;
			if (a.p < 500L)
			{
				a.a_data_w.a(((k) (a)).a, 0xa0030, j, i1);
				a.m_boolean = true;
				return;
			}
			a.p = 0L;
			a.i_int = 0;
			if (a.h_int == a.b_java_util_Vector.size() - 1)
				a.a_data_w.a(((k) (a)).a, 0xa0032, j, i1);
			a.m_boolean = false;
			break;
		}
	}
}
