// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.*;
import javax.microedition.lcdui.Canvas;

// Referenced classes of package data:
//			ab, ac, d, h, 
//			i, k, l, o, 
//			p, q, u, v, 
//			w, y

public final class g
{

	private p a_data_p;
	private int b_int_array1d[];
	private int c_int_array1d[];
	private int d_int_array1d[];
	private byte a_byte_array1d[];
	private boolean a_boolean;
	private int e_int_array1d[];
	private int f_int_array1d[];
	private byte b_byte_array1d[];
	private boolean b_boolean;
	private boolean c_boolean;
	private byte c_byte_array1d[];
	private byte d_byte_array1d[];
	public u a_data_u_array1d[];
	public int a_int;
	public u b_data_u_array1d[];
	public int b_int;
	public u c_data_u_array1d[];
	public int c_int;
	public u d_data_u_array1d[];
	public int d_int;
	public u e_data_u_array1d[];
	public int e_int;
	public u f_data_u_array1d[];
	public int f_int;
	public u g_data_u_array1d[];
	public int g_int;
	public int a_int_array2d[][];
	public int h;
	public l a_data_l_array1d[];
	public int i;
	public l b_data_l_array1d[];
	public int j;
	public l c_data_l_array1d[];
	public int k;
	public int b_int_array2d[][];
	public int l;
	public d a_data_d_array1d[];
	public int m;
	public d b_data_d_array1d[];
	public int n;
	public d c_data_d_array1d[];
	public int o;
	public d d_data_d_array1d[];
	public int p;
	public int c_int_array2d[][];
	public int q;
	public i a_data_i_array1d[];
	public int r;
	public int a_int_array1d[];
	public int s;
	public q a_data_q_array1d[];
	public int t;
	public q b_data_q_array1d[];
	public int u;
	public q c_data_q_array1d[];
	public int v;
	public q d_data_q_array1d[];
	public int w;
	public int d_int_array2d[][];
	public int x;

	public g(p p1)
	{
		b_int_array1d = new int[16];
		c_int_array1d = new int[22];
		d_int_array1d = new int[87];
		a_byte_array1d = new byte[49];
		a_boolean = true;
		e_int_array1d = new int[49];
		f_int_array1d = new int[49];
		b_byte_array1d = new byte[32400];
		b_boolean = true;
		c_boolean = true;
		c_byte_array1d = new byte[32400];
		d_byte_array1d = new byte[32400];
		a_int = 0;
		b_int = 0;
		c_int = 0;
		d_int = 0;
		e_int = 0;
		f_int = 0;
		g_int = 0;
		h = 0;
		i = 0;
		j = 0;
		k = 0;
		l = 0;
		m = 0;
		n = 0;
		o = 0;
		p = 0;
		q = 0;
		r = 0;
		s = 0;
		t = 0;
		u = 0;
		v = 0;
		w = 0;
		x = 0;
		a_data_p = p1;
	}

	public final void a()
	{
		o();
		p();
		q();
		r();
		a("BIGislandFULL", a_data_p.k);
		a_data_p.a();
	}

	public final void b()
	{
		a("BIGislandRocks", a_data_p.j);
		a_data_p.a();
		a("BIGislandDecor", a_data_p.g);
		a_data_p.a();
		for (int i1 = 0; i1 < a_data_p.g.length; i1++)
			if (a_data_p.g[i1] != 0)
			{
				if (a_data_p.g[i1] == d_int_array1d[18])
					a_data_p.h[i1] = (byte)data.o.a(13);
				if (a_data_p.g[i1] == d_int_array1d[1])
					a_data_p.h[i1] = (byte)data.o.a(8);
				if (a_data_p.g[i1] == d_int_array1d[5])
					a_data_p.h[i1] = (byte)data.o.a(9);
				if (a_data_p.g[i1] == d_int_array1d[13])
					a_data_p.h[i1] = (byte)data.o.a(12);
				if (a_data_p.g[i1] == d_int_array1d[21])
					a_data_p.h[i1] = (byte)data.o.a(4);
				if (a_data_p.g[i1] == d_int_array1d[22])
					a_data_p.h[i1] = (byte)data.o.a(4);
				if (a_data_p.g[i1] == d_int_array1d[49])
					a_data_p.h[i1] = (byte)data.o.a(6);
			} else
			{
				a_data_p.h[i1] = -1;
			}

	}

	public final void c()
	{
		a("BIGislandBorders", a_data_p.i);
		a_data_p.a();
		a("BIGislandObjects", a_data_p.l);
		a_data_p.a();
		a_boolean = false;
		a_byte_array1d[0] = 6;
		a_byte_array1d[1] = 10;
		a_byte_array1d[2] = 11;
		a_byte_array1d[3] = 15;
		a_byte_array1d[4] = 16;
		a_byte_array1d[5] = 17;
		a_byte_array1d[6] = 18;
		a_byte_array1d[7] = 19;
		a_byte_array1d[8] = 20;
		a_byte_array1d[9] = 23;
		a_byte_array1d[10] = 24;
		a_byte_array1d[11] = 77;
		a_byte_array1d[12] = 78;
		a_byte_array1d[13] = 79;
		a_byte_array1d[14] = 80;
		a_byte_array1d[15] = 81;
		a_byte_array1d[16] = 82;
		a_byte_array1d[17] = 83;
		a_byte_array1d[18] = 84;
		a_byte_array1d[19] = 85;
		a_byte_array1d[20] = 86;
		a_byte_array1d[21] = 87;
		a_byte_array1d[22] = 88;
		a_byte_array1d[23] = 89;
		a_byte_array1d[24] = 90;
		a_byte_array1d[25] = 91;
		a_byte_array1d[26] = 93;
		a_byte_array1d[27] = 95;
		a_byte_array1d[28] = 97;
		a_byte_array1d[29] = 100;
		a_byte_array1d[30] = 101;
		a_byte_array1d[31] = 102;
		a_byte_array1d[32] = 103;
		a_byte_array1d[33] = 104;
		a_byte_array1d[34] = 105;
		a_byte_array1d[35] = 106;
		a_byte_array1d[36] = 107;
		a_byte_array1d[37] = 108;
		a_byte_array1d[38] = 109;
		a_byte_array1d[39] = 110;
		a_byte_array1d[40] = 111;
		a_byte_array1d[41] = 112;
		a_byte_array1d[42] = 113;
		a_byte_array1d[43] = 114;
		a_byte_array1d[44] = 115;
		a_byte_array1d[45] = 118;
		a_byte_array1d[46] = 98;
		a_byte_array1d[47] = 121;
		a_byte_array1d[48] = 124;
		a_data_p.N = data.k.a() / a_data_p.M;
		a_data_p.O = data.k.b() / a_data_p.M - 1;
		if (a_data_p.c_boolean)
		{
			a_data_p.Z = a_data_p.ab + a_data_p.N / 2;
			a_data_p.aa = a_data_p.ac + a_data_p.O / 2;
		}
	}

	private void k()
	{
		int i1 = 1;
		for (int j1 = 0; j1 < a_data_p.l.length; j1++)
			if (a_data_p.l[j1] != 0 && !a_data_p.a_data_y.a(a_data_p.l[j1]))
			{
				a_data_p.a_short_array1d[j1] = (short)i1;
				i1++;
			} else
			{
				a_data_p.a_short_array1d[j1] = -1;
			}

	}

	private void l()
	{
		b_byte_array1d = a_data_p.l;
		int i1 = 0;
		try
		{
			for (i1 = 0; i1 < a_data_p.l.length; i1++)
				if (b_byte_array1d[i1] != 0)
				{
					for (int j1 = 0; j1 < a_byte_array1d.length; j1++)
						if (a_byte_array1d[j1] == b_byte_array1d[i1])
						{
							for (int k1 = 0; k1 < a_data_p.aw_int; k1++)
							{
								if (a_data_p.a_java_lang_String_array1d[k1] != a_data_p.b_java_lang_String_array1d[b_byte_array1d[i1] - 1])
									continue;
								b_byte_array1d[i1] = 0;
								break;
							}

							if (b_byte_array1d[i1] != 0)
							{
								for (int l1 = 0; l1 < a_data_p.av_int; l1++)
								{
									if (a_data_p.a_byte_array1d[l1] != b_byte_array1d[i1] - 1)
										continue;
									b_byte_array1d[i1] = 0;
									break;
								}

							}
							if (b_byte_array1d[i1] != 0)
							{
								for (int i2 = 0; i2 < a_data_p.aB; i2++)
								{
									if (a_data_p.m_byte_array1d[i2] != b_byte_array1d[i1] - 1)
										continue;
									b_byte_array1d[i1] = 0;
									break;
								}

							}
						}

				}

		}
		catch (Exception exception)
		{
			System.out.println("erreur filterUniqueObjects " + i1 + "objectArrayFull_CPY[i]" + b_byte_array1d[i1]);
			exception.printStackTrace();
		}
		a_data_p.l = b_byte_array1d;
	}

	private void m()
	{
		for (int i1 = 0; i1 < a_data_p.l.length; i1++)
		{
			for (int j1 = 0; j1 < a_data_p.r.length; j1++)
			{
				if (a_data_p.r[j1] != a_data_p.a_short_array1d[i1])
					continue;
				a_data_p.l[i1] = 0;
				a_data_p.a_short_array1d[i1] = 0;
				break;
			}

		}

	}

	private void n()
	{
		if (a_data_p.ap_int == 1)
		{
			for (int i1 = 0; i1 < a_data_p.l.length; i1++)
				if (a_data_p.l[i1] == 85)
				{
					a_data_p.l[i1] = 0;
					if (!a_data_p.T)
						a_data_p.l[(int)a_data_p.b_long] = 95;
					else
						a_data_p.l[(int)a_data_p.b_long] = 0;
				}

		}
	}

	public final void d()
	{
		boolean flag = false;
		boolean flag1 = false;
		int k1 = 0;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag6 = false;
		int i2 = 0;
		try
		{
			k();
			boolean flag5 = false;
			i2++;
			l();
			i2++;
			n();
			i2++;
			m();
			i2++;
			b_byte_array1d = a_data_p.l;
		}
		catch (Exception exception)
		{
			System.out.println("Exception mixUpObjectPos : " + i2);
			exception.printStackTrace();
		}
		for (int j2 = 0; j2 < b_byte_array1d.length; j2++)
			try
			{
				b_boolean = true;
				if (b_byte_array1d[j2] != 0)
				{
					for (int k2 = 0; k2 < a_data_p.a_data_y.a.length; k2++)
					{
						if (a_data_p.a_data_y.a[k2] != b_byte_array1d[j2])
							continue;
						b_boolean = false;
						break;
					}

					if (b_boolean)
					{
						byte byte0 = b_byte_array1d[j2];
						int l1 = a_data_p.a_short_array1d[j2];
						for (int l2 = 0; l2 < a_data_p.s.length; l2++)
						{
							if (a_data_p.s[l2] == l1)
							{
								b_byte_array1d[j2] = 0;
								flag4 = true;
								break;
							}
							flag4 = false;
						}

						if (!flag4)
						{
							int i1;
							if ((i1 = data.o.a(7)) < 4)
								i1 = -i1;
							else
								i1 /= 2;
							int j1;
							if ((j1 = data.o.a(7)) < 4)
								j1 = -j1;
							else
								j1 /= 2;
							if ((k1 = j2 + (i1 + j1 * 180)) > 31399)
								k1 = 31399;
							if (!a(k1) || !e(k1, 1) || !c(k1, 1) || !d(k1, 1))
							{
								if (a(byte0))
									b_byte_array1d[j2] = byte0;
								else
									b_byte_array1d[j2] = 0;
							} else
							{
								b_byte_array1d[k1] = byte0;
								b_byte_array1d[j2] = 0;
								a_data_p.a_short_array1d[k1] = (short)l1;
								a_data_p.a_short_array1d[j2] = -1;
							}
						}
					}
				}
			}
			catch (Exception )
			{
				System.out.println(j2 + "->" + k1);
			}

		a_data_p.l = b_byte_array1d;
	}

	public final void e()
	{
		for (int i1 = 0; i1 < a_data_p.l.length; i1++)
			switch (a_data_p.l[i1])
			{
			case 5: // '\005'
				t++;
				break;

			case 42: // '*'
				i++;
				break;

			case 43: // '+'
				m++;
				break;

			case 44: // ','
				n++;
				break;

			case 45: // '-'
				u++;
				break;

			case 46: // '.'
				v++;
				break;

			case 47: // '/'
				w++;
				break;

			case 48: // '0'
				j++;
				break;

			case 49: // '1'
				o++;
				break;

			case 50: // '2'
				p++;
				break;

			case 51: // '3'
				a_int++;
				break;

			case 52: // '4'
				b_int++;
				break;

			case 53: // '5'
				c_int++;
				break;

			case 54: // '6'
				d_int++;
				break;

			case 55: // '7'
				e_int++;
				break;

			case 56: // '8'
				r++;
				break;

			case 62: // '>'
				k++;
				break;

			case 63: // '?'
				f_int++;
				break;

			case 64: // '@'
				g_int++;
				break;
			}

		int j1 = 0;
		int k1 = 0;
		int l1 = 0;
		int i2 = 0;
		int j2 = 0;
		int k2 = 0;
		int l2 = 0;
		int i3 = 0;
		int j3 = 0;
		int k3 = 0;
		int l3 = 0;
		int i4 = 0;
		int j4 = 0;
		int k4 = 0;
		int l4 = 0;
		int i5 = 0;
		a_data_u_array1d = new u[a_int];
		b_data_u_array1d = new u[b_int];
		c_data_u_array1d = new u[c_int];
		d_data_u_array1d = new u[d_int];
		e_data_u_array1d = new u[e_int];
		f_data_u_array1d = new u[f_int];
		g_data_u_array1d = new u[g_int];
		a_data_l_array1d = new l[i];
		b_data_l_array1d = new l[j];
		c_data_l_array1d = new l[k];
		a_data_d_array1d = new d[m];
		b_data_d_array1d = new d[n];
		c_data_d_array1d = new d[o];
		d_data_d_array1d = new d[p];
		a_data_i_array1d = new i[r];
		a_data_q_array1d = new q[t];
		b_data_q_array1d = new q[u];
		c_data_q_array1d = new q[v];
		d_data_q_array1d = new q[w];
		a_int_array2d = new int[a_int + b_int + c_int + d_int + e_int + f_int + g_int][2];
		b_int_array2d = new int[i + j + k][2];
		c_int_array2d = new int[m + n + o + p][2];
		a_int_array1d = new int[r];
		d_int_array2d = new int[t + u + v + w][2];
		for (int j5 = 0; j5 < a_data_p.l.length; j5++)
		{
			int ai[] = new int[2];
			int ai1[] = new int[2];
			int ai2[] = new int[2];
			int ai3[] = new int[2];
			int ai4[] = new int[2];
			switch (a_data_p.l[j5])
			{
			case 5: // '\005'
				ai[0] = 0x20000;
				ai[1] = 0x20001;
				ai1[0] = 0x20002;
				ai1[1] = 0x20003;
				ai4[0] = 0x20004;
				ai4[1] = 0x20005;
				a_data_q_array1d[k4] = new q(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai4);
				k4++;
				break;

			case 42: // '*'
				ai[0] = 0x20028;
				ai[1] = 0x20029;
				ai1[0] = 0x20028;
				ai1[1] = 0x20029;
				ai4[0] = 0x20028;
				ai4[1] = 0x20029;
				a_data_l_array1d[k2] = new l(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 1, 50, ai, ai1, ai4);
				k2++;
				break;

			case 43: // '+'
				ai[0] = 0x2000e;
				ai[1] = 0x2000f;
				ai1[0] = 0x20010;
				ai1[1] = 0x20011;
				ai4[0] = 0x2000e;
				ai4[1] = 0x2000f;
				a_data_d_array1d[j3] = new d(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 2, 50, ai, ai1, ai4);
				j3++;
				break;

			case 44: // ','
				ai[0] = 0x20056;
				ai[1] = 0x20057;
				ai1[0] = 0x20058;
				ai1[1] = 0x20059;
				ai4[0] = 0x20056;
				ai4[1] = 0x20057;
				b_data_d_array1d[k3] = new d(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai4);
				k3++;
				break;

			case 45: // '-'
				ai[0] = 0x2000a;
				ai[1] = 0x2000b;
				ai1[0] = 0x2000c;
				ai1[1] = 0x2000d;
				ai4[0] = 0x2000a;
				ai4[1] = 0x2000b;
				b_data_q_array1d[l4] = new q(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai4);
				l4++;
				break;

			case 47: // '/'
				ai[0] = 0x20012;
				ai[1] = 0x20013;
				ai1[0] = 0x20014;
				ai1[1] = 0x20015;
				ai4[0] = 0x20012;
				ai4[1] = 0x20013;
				d_data_q_array1d[i5] = new q(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 2, 50, ai, ai1, ai4);
				i5++;
				break;

			case 48: // '0'
				ai[0] = 0x20006;
				ai[1] = 0x20007;
				ai1[0] = 0x20008;
				ai1[1] = 0x20009;
				ai4[0] = 0x20006;
				ai4[1] = 0x20006;
				b_data_l_array1d[l2] = new l(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 1, 50, ai, ai1, ai4);
				l2++;
				break;

			case 49: // '1'
				ai[0] = 0x20034;
				ai[1] = 0x20035;
				ai1[0] = 0x20036;
				ai1[1] = 0x20037;
				ai4[0] = 0x20038;
				ai4[1] = 0x20039;
				c_data_d_array1d[l3] = new d(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 2, 50, ai, ai1, ai4);
				l3++;
				break;

			case 50: // '2'
				ai[0] = 0x2002e;
				ai[1] = 0x2002f;
				ai1[0] = 0x20030;
				ai1[1] = 0x20031;
				ai4[0] = 0x20032;
				ai4[1] = 0x20033;
				d_data_d_array1d[i4] = new d(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 1, 50, ai, ai1, ai4);
				i4++;
				break;

			case 52: // '4'
				ai[0] = 0x20066;
				ai[1] = 0x20067;
				ai1[0] = 0x20068;
				ai1[1] = 0x20069;
				ai2[0] = 0x2006a;
				ai2[1] = 0x2006b;
				ai3[0] = 0x2006c;
				ai3[1] = 0x2006d;
				ai4[0] = 0x20068;
				ai4[1] = 0x20069;
				b_data_u_array1d[j1] = new u(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai2, ai3, ai4);
				j1++;
				break;

			case 53: // '5'
				ai[0] = 0x20046;
				ai[1] = 0x20047;
				ai1[0] = 0x20048;
				ai1[1] = 0x20049;
				ai2[0] = 0x2004a;
				ai2[1] = 0x2004b;
				ai3[0] = 0x2004c;
				ai3[1] = 0x2004d;
				ai4[0] = 0x20048;
				ai4[1] = 0x20049;
				c_data_u_array1d[k1] = new u(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai2, ai3, ai4);
				k1++;
				break;

			case 54: // '6'
				ai[0] = 0x2004e;
				ai[1] = 0x2004f;
				ai1[0] = 0x20050;
				ai1[1] = 0x20051;
				ai2[0] = 0x20052;
				ai2[1] = 0x20053;
				ai3[0] = 0x20054;
				ai3[1] = 0x20055;
				ai4[0] = 0x20050;
				ai4[1] = 0x20051;
				d_data_u_array1d[l1] = new u(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 3, 50, ai, ai1, ai2, ai3, ai4);
				l1++;
				break;

			case 56: // '8'
				int ai5[] = {
					0x2005a, 0x2005b, 0x2005c
				};
				int ai6[] = {
					0x2005d, 0x2005e, 0x2005f
				};
				a_data_i_array1d[j4] = new i(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 5, ai5, ai6);
				j4++;
				break;

			case 62: // '>'
				ai[0] = 0x2002a;
				ai[1] = 0x2002b;
				ai1[0] = 0x2002c;
				ai1[1] = 0x2002d;
				ai4[0] = 0x2002a;
				ai4[1] = 0x2002a;
				c_data_l_array1d[i3] = new l(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 1, 50, ai, ai1, ai4);
				i3++;
				break;

			case 63: // '?'
				ai[0] = 0x20076;
				ai[1] = 0x20077;
				ai1[0] = 0x20078;
				ai1[1] = 0x20079;
				ai2[0] = 0x2007a;
				ai2[1] = 0x2007b;
				ai3[0] = 0x2007c;
				ai3[1] = 0x2007d;
				ai4[0] = 0x20078;
				ai4[1] = 0x20079;
				f_data_u_array1d[i2] = new u(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 3, 50, ai, ai1, ai2, ai3, ai4);
				i2++;
				break;

			case 64: // '@'
				ai[0] = 0x2006e;
				ai[1] = 0x2006f;
				ai1[0] = 0x20070;
				ai1[1] = 0x20071;
				ai2[0] = 0x20072;
				ai2[1] = 0x20073;
				ai3[0] = 0x20074;
				ai3[1] = 0x20075;
				ai4[0] = 0x20070;
				ai4[1] = 0x20071;
				g_data_u_array1d[j2] = new u(a_data_p, a_data_p.l[j5], j5 % 180, j5 / 180, 7, 4, 50, ai, ai1, ai2, ai3, ai4);
				j2++;
				break;
			}
		}

	}

	private void o()
	{
		b_int_array1d[0] = 0x10000;
		b_int_array1d[1] = 0x10001;
		b_int_array1d[2] = 0x10002;
		b_int_array1d[3] = 0x10003;
		b_int_array1d[4] = 0x10004;
		b_int_array1d[5] = 0x10005;
		b_int_array1d[6] = 0x10006;
		b_int_array1d[7] = 0x10007;
		b_int_array1d[8] = 0x10008;
		b_int_array1d[9] = 0x10009;
		b_int_array1d[10] = 0x1000a;
		b_int_array1d[11] = 0x1000b;
		b_int_array1d[12] = 0x1000c;
		b_int_array1d[13] = 0x1000d;
		b_int_array1d[14] = 0x1000e;
		b_int_array1d[15] = 0x1000f;
		a_data_p.e[0] = 0;
		a_data_p.e[1] = 1;
		a_data_p.e[2] = 2;
		a_data_p.e[3] = 3;
		a_data_p.e[4] = 4;
		a_data_p.e[5] = 5;
		a_data_p.e[6] = 6;
		a_data_p.e[7] = 7;
		a_data_p.e[8] = 8;
		a_data_p.e[9] = 9;
		a_data_p.e[10] = 10;
		a_data_p.e[11] = 11;
		a_data_p.e[12] = 12;
		a_data_p.e[13] = 13;
		a_data_p.e[14] = 14;
		a_data_p.e[15] = 15;
	}

	private void p()
	{
		e_int_array1d[0] = 0;
		e_int_array1d[1] = 0x40000;
		e_int_array1d[2] = 0x40001;
		e_int_array1d[3] = 0x40002;
		e_int_array1d[4] = 0x40003;
		e_int_array1d[5] = 0x40004;
		e_int_array1d[6] = 0x40005;
		e_int_array1d[7] = 0x40006;
		e_int_array1d[8] = 0x40007;
		e_int_array1d[9] = 0x40008;
		e_int_array1d[10] = 0x40009;
		e_int_array1d[11] = 0x4000a;
		e_int_array1d[12] = 0x4000b;
		e_int_array1d[13] = 0x4000c;
		e_int_array1d[14] = 0x4000d;
		e_int_array1d[15] = 0x4000e;
		e_int_array1d[16] = 0x4000f;
		e_int_array1d[17] = 0x40010;
		e_int_array1d[18] = 0x40011;
		e_int_array1d[19] = 0x40012;
		e_int_array1d[20] = 0x40013;
		e_int_array1d[21] = 0x40014;
		e_int_array1d[22] = 0x40015;
		e_int_array1d[23] = 0x40016;
		e_int_array1d[24] = 0x40017;
		e_int_array1d[25] = 0x40018;
		e_int_array1d[26] = 0x40019;
		e_int_array1d[27] = 0x4001a;
		e_int_array1d[28] = 0x4001b;
		e_int_array1d[29] = 0x4001c;
		e_int_array1d[30] = 0x4001d;
		e_int_array1d[31] = 0x4001e;
		e_int_array1d[32] = 0x4001f;
		e_int_array1d[33] = 0x40020;
		e_int_array1d[34] = 0x40021;
		e_int_array1d[35] = 0x40022;
		e_int_array1d[36] = 0x40023;
		e_int_array1d[37] = 0x40024;
		e_int_array1d[38] = 0x40025;
		e_int_array1d[39] = 0x40026;
		e_int_array1d[40] = 0x40027;
		e_int_array1d[41] = 0x40028;
		e_int_array1d[42] = 0x40029;
		e_int_array1d[43] = 0x4002a;
		e_int_array1d[44] = 0x4002b;
		e_int_array1d[45] = 0x4002c;
		e_int_array1d[46] = 0x4002d;
		e_int_array1d[47] = 0x4002e;
		e_int_array1d[48] = 0x4002f;
		f_int_array1d[0] = 0;
		f_int_array1d[1] = 1;
		f_int_array1d[2] = 2;
		f_int_array1d[3] = 3;
		f_int_array1d[4] = 4;
		f_int_array1d[5] = 5;
		f_int_array1d[6] = 6;
		f_int_array1d[7] = 7;
		f_int_array1d[8] = 8;
		f_int_array1d[9] = 9;
		f_int_array1d[10] = 10;
		f_int_array1d[11] = 11;
		f_int_array1d[12] = 12;
		f_int_array1d[13] = 13;
		f_int_array1d[14] = 14;
		f_int_array1d[15] = 15;
		f_int_array1d[16] = 16;
		f_int_array1d[17] = 17;
		f_int_array1d[18] = 18;
		f_int_array1d[19] = 19;
		f_int_array1d[20] = 20;
		f_int_array1d[21] = 21;
		f_int_array1d[22] = 22;
		f_int_array1d[23] = 23;
		f_int_array1d[24] = 24;
		f_int_array1d[25] = 25;
		f_int_array1d[26] = 26;
		f_int_array1d[27] = 27;
		f_int_array1d[28] = 28;
		f_int_array1d[29] = 29;
		f_int_array1d[30] = 30;
		f_int_array1d[31] = 31;
		f_int_array1d[32] = 32;
		f_int_array1d[33] = 33;
		f_int_array1d[34] = 34;
		f_int_array1d[35] = 35;
		f_int_array1d[36] = 36;
		f_int_array1d[37] = 37;
		f_int_array1d[38] = 38;
		f_int_array1d[39] = 39;
		f_int_array1d[40] = 40;
		f_int_array1d[41] = 41;
		f_int_array1d[42] = 42;
		f_int_array1d[43] = 43;
		f_int_array1d[44] = 44;
		f_int_array1d[45] = 45;
		f_int_array1d[46] = 46;
		f_int_array1d[47] = 47;
		f_int_array1d[48] = 48;
	}

	private void q()
	{
		a_data_p.p[0] = 0;
		a_data_p.p[1] = 0x70000;
		a_data_p.p[2] = 0x70001;
		a_data_p.p[3] = 0x70002;
		a_data_p.p[4] = 0x70004;
		a_data_p.p[5] = 0x70054;
		a_data_p.p[6] = 0x70055;
		a_data_p.p[7] = 0x70006;
		a_data_p.p[8] = 0x70008;
		a_data_p.p[9] = 0x7000a;
		a_data_p.p[10] = 0x7000c;
		a_data_p.p[11] = 0x7000e;
		a_data_p.p[12] = 0x7000f;
		a_data_p.p[13] = 0x70011;
		a_data_p.p[14] = 0x70012;
		a_data_p.p[15] = 0x70013;
		a_data_p.p[16] = 0x70014;
		a_data_p.p[17] = 0x70016;
		a_data_p.p[18] = 0x70018;
		a_data_p.p[19] = 0x70019;
		a_data_p.p[20] = 0x7001a;
		a_data_p.p[21] = 0x7001b;
		a_data_p.p[22] = 0x7001c;
		a_data_p.p[23] = 0x7001d;
		a_data_p.p[24] = 0x7001e;
		a_data_p.p[25] = 0x7001f;
		a_data_p.p[26] = 0x70020;
		a_data_p.p[27] = 0x70021;
		a_data_p.p[28] = 0x70022;
		a_data_p.p[29] = 0x70023;
		a_data_p.p[30] = 0x70024;
		a_data_p.p[31] = 0x70025;
		a_data_p.p[32] = 0x70026;
		a_data_p.p[33] = 0x70027;
		a_data_p.p[34] = 0x70028;
		a_data_p.p[35] = 0x70029;
		a_data_p.p[36] = 0x7002a;
		a_data_p.p[37] = 0x7002b;
		a_data_p.p[38] = 0x7002c;
		a_data_p.p[39] = 0x7002d;
		a_data_p.p[40] = 0x7002e;
		a_data_p.p[41] = 0x7002f;
		a_data_p.p[42] = 0x70030;
		a_data_p.p[43] = 0x70032;
		a_data_p.p[44] = 0x70034;
		a_data_p.p[45] = 0x70035;
		a_data_p.p[46] = 0x70036;
		a_data_p.p[47] = 0x70037;
		a_data_p.p[48] = 0x7003c;
		a_data_p.p[49] = 0x7003e;
		a_data_p.p[50] = 0x7003f;
		a_data_p.p[51] = 0x70041;
		a_data_p.p[52] = 0x70042;
		a_data_p.p[53] = 0x70043;
		a_data_p.p[54] = 0x70044;
		a_data_p.p[55] = 0x70045;
		a_data_p.p[56] = 0x70046;
		a_data_p.p[57] = 0x70047;
		a_data_p.p[58] = 0x70048;
		a_data_p.p[59] = 0x70049;
		a_data_p.p[60] = 0x7004a;
		a_data_p.p[61] = 0x7004b;
		a_data_p.p[62] = 0x7004c;
		a_data_p.p[63] = 0x7004d;
		a_data_p.p[64] = 0x7004e;
		a_data_p.p[65] = 0x7004f;
		a_data_p.p[66] = 0x70050;
		a_data_p.p[67] = 0x70051;
		a_data_p.p[68] = 0x70052;
		a_data_p.p[69] = 0x70053;
		a_data_p.p[70] = 0x70038;
		a_data_p.p[71] = 0x70039;
		a_data_p.p[72] = 0x7003a;
		a_data_p.p[73] = 0x7003b;
		a_data_p.p[74] = 0x70033;
		a_data_p.p[75] = 0x70005;
		a_data_p.p[76] = 0x70003;
		a_data_p.p[77] = 0x70009;
		a_data_p.p[78] = 0x70007;
		a_data_p.p[79] = 0x7000b;
		a_data_p.p[80] = 0x7000d;
		a_data_p.p[81] = 0x70010;
		a_data_p.p[82] = 0x70017;
		a_data_p.p[83] = 0x70031;
		a_data_p.p[84] = 0x70040;
		a_data_p.p[85] = 0x7003d;
		a_data_p.p[86] = 0x70015;
		d_int_array1d[0] = 0;
		d_int_array1d[1] = 1;
		d_int_array1d[2] = 2;
		d_int_array1d[3] = 3;
		d_int_array1d[4] = 4;
		d_int_array1d[5] = 5;
		d_int_array1d[6] = 6;
		d_int_array1d[7] = 7;
		d_int_array1d[8] = 8;
		d_int_array1d[9] = 9;
		d_int_array1d[10] = 10;
		d_int_array1d[11] = 11;
		d_int_array1d[12] = 12;
		d_int_array1d[13] = 13;
		d_int_array1d[14] = 14;
		d_int_array1d[15] = 15;
		d_int_array1d[16] = 16;
		d_int_array1d[17] = 17;
		d_int_array1d[18] = 18;
		d_int_array1d[19] = 19;
		d_int_array1d[20] = 20;
		d_int_array1d[21] = 21;
		d_int_array1d[22] = 22;
		d_int_array1d[23] = 23;
		d_int_array1d[24] = 24;
		d_int_array1d[25] = 25;
		d_int_array1d[26] = 26;
		d_int_array1d[27] = 27;
		d_int_array1d[28] = 28;
		d_int_array1d[29] = 29;
		d_int_array1d[30] = 30;
		d_int_array1d[31] = 31;
		d_int_array1d[32] = 32;
		d_int_array1d[33] = 33;
		d_int_array1d[34] = 34;
		d_int_array1d[35] = 35;
		d_int_array1d[36] = 36;
		d_int_array1d[37] = 37;
		d_int_array1d[38] = 38;
		d_int_array1d[39] = 39;
		d_int_array1d[40] = 40;
		d_int_array1d[41] = 41;
		d_int_array1d[42] = 42;
		d_int_array1d[43] = 43;
		d_int_array1d[44] = 44;
		d_int_array1d[45] = 45;
		d_int_array1d[46] = 46;
		d_int_array1d[47] = 47;
		d_int_array1d[48] = 48;
		d_int_array1d[49] = 49;
		d_int_array1d[50] = 50;
		d_int_array1d[51] = 51;
		d_int_array1d[52] = 52;
		d_int_array1d[53] = 53;
		d_int_array1d[54] = 54;
		d_int_array1d[55] = 55;
		d_int_array1d[56] = 56;
		d_int_array1d[57] = 57;
		d_int_array1d[58] = 58;
		d_int_array1d[59] = 59;
		d_int_array1d[60] = 60;
		d_int_array1d[61] = 61;
		d_int_array1d[62] = 62;
		d_int_array1d[63] = 63;
		d_int_array1d[64] = 64;
		d_int_array1d[65] = 65;
		d_int_array1d[66] = 66;
		d_int_array1d[67] = 67;
		d_int_array1d[68] = 68;
		d_int_array1d[69] = 69;
		d_int_array1d[70] = 70;
		d_int_array1d[71] = 71;
		d_int_array1d[72] = 72;
		d_int_array1d[73] = 73;
		d_int_array1d[74] = 74;
		d_int_array1d[75] = 75;
		d_int_array1d[76] = 76;
		d_int_array1d[77] = 77;
		d_int_array1d[78] = 78;
		d_int_array1d[79] = 79;
		d_int_array1d[80] = 80;
		d_int_array1d[81] = 81;
		d_int_array1d[82] = 82;
		d_int_array1d[83] = 83;
		d_int_array1d[84] = 84;
		d_int_array1d[85] = 85;
		d_int_array1d[86] = 86;
	}

	private void r()
	{
		a_data_p.o[0] = 0x80000;
		a_data_p.o[1] = 0x80001;
		a_data_p.o[2] = 0x80002;
		a_data_p.o[3] = 0x80003;
		a_data_p.o[4] = 0xb0000;
		a_data_p.o[5] = 0xb0001;
		a_data_p.o[6] = 0xb0002;
		a_data_p.o[7] = 0x80004;
		a_data_p.o[8] = 0x80005;
		a_data_p.o[9] = 0x80006;
		a_data_p.o[10] = 0x80007;
		a_data_p.o[11] = 0x80008;
		a_data_p.o[12] = 0x80009;
		a_data_p.o[13] = 0x8000a;
		a_data_p.o[14] = 0x8000b;
		a_data_p.o[15] = 0x8000c;
		a_data_p.o[16] = 0xb0003;
		a_data_p.o[17] = 0xb0004;
		a_data_p.o[18] = 0xb0005;
		a_data_p.o[19] = 0xb0006;
		a_data_p.o[20] = 0xb0007;
		a_data_p.o[21] = 0xb0008;
		c_int_array1d[0] = 1;
		c_int_array1d[1] = 2;
		c_int_array1d[2] = 3;
		c_int_array1d[3] = 4;
		c_int_array1d[4] = 5;
		c_int_array1d[5] = 6;
		c_int_array1d[6] = 7;
		c_int_array1d[7] = 8;
		c_int_array1d[8] = 9;
		c_int_array1d[9] = 10;
		c_int_array1d[10] = 11;
		c_int_array1d[11] = 12;
		c_int_array1d[12] = 13;
		c_int_array1d[13] = 14;
		c_int_array1d[14] = 15;
		c_int_array1d[15] = 16;
		c_int_array1d[16] = 17;
		c_int_array1d[17] = 18;
		c_int_array1d[18] = 19;
		c_int_array1d[19] = 20;
		c_int_array1d[20] = 21;
		c_int_array1d[21] = 22;
	}

	public final boolean a(String s1, byte abyte0[])
	{
		boolean flag = false;
		int j1;
		boolean flag1 = false;
		j1 = 0;
		InputStream inputstream = getClass().getResourceAsStream("/" + s1 + ".byt");
		DataInputStream datainputstream;
		for (int i1 = (datainputstream = new DataInputStream(inputstream)).read(); i1 != -1;)
		{
			abyte0[j1] = (byte)i1;
			i1 = datainputstream.read();
			if ((s1.equals("BIGislandObjects") || s1.equals("islandObjects")) && !a_boolean && a_data_p.a_data_y.a(abyte0[j1]))
				abyte0[j1] = 0;
			j1++;
		}

		inputstream.close();
		flag = true;
		if (a_data_p.a_data_v.a == 0L && s1.equals("BIGislandObjects"))
		{
			for (int k1 = 0; k1 < a_data_p.l.length; k1++)
				if (a_data_p.l[k1] == 85 || a_data_p.l[k1] == 95)
					a_data_p.b_long = k1;

		}
		break MISSING_BLOCK_LABEL_242;
		JVM INSTR dup ;
		IOException ioexception;
		ioexception;
		printStackTrace();
		break MISSING_BLOCK_LABEL_242;
		JVM INSTR pop ;
		return flag;
	}

	public final void f()
	{
		int i1 = 0;
		int j1 = 0;
		try
		{
			for (int k1 = a_data_p.ac - 1; k1 <= a_data_p.ac + a_data_p.O + 2; k1++)
			{
				for (int l1 = a_data_p.ab - 1; l1 < a_data_p.ab + a_data_p.N + 2; l1++)
				{
					if (k1 >= 0 && l1 >= 0 && k1 < 180 && l1 < 180 && a_data_p.j[l1 + k1 * 180] != 0 && a_data_p.j[l1 + k1 * 180] < 50)
						a_data_p.a_data_w.a(a_data_p.a(), e_int_array1d[a_data_p.j[l1 + k1 * 180]], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V);
					i1++;
				}

				i1 = 0;
				j1++;
			}

			return;
		}
		catch (Exception exception)
		{
			System.out.println("Erreur Decor " + i1 + " " + j1);
			exception.printStackTrace();
			return;
		}
	}

	public final void g()
	{
		int i1 = 0;
		int j1 = 0;
		try
		{
			for (int k1 = a_data_p.ac - 2; k1 <= a_data_p.ac + a_data_p.O + 2; k1++)
			{
				for (int l1 = a_data_p.ab - 2; l1 < a_data_p.ab + a_data_p.N + 2; l1++)
				{
					if (k1 >= 0 && l1 >= 0 && k1 < 180 && l1 < 180 && a_data_p.i[l1 + k1 * 180] != 0)
						a_data_p.a_data_w.a(a_data_p.a(), a_data_p.o[a_data_p.i[l1 + k1 * 180] - 1], a_data_p.aM + ((a_data_p.M * i1 - a_data_p.M * 2) + a_data_p.U) + a_data_p.M / 2, a_data_p.aN + ((a_data_p.M * j1 - a_data_p.M * 2) + a_data_p.V) + a_data_p.M / 2);
					i1++;
				}

				i1 = 0;
				j1++;
			}

			return;
		}
		catch (Exception exception)
		{
			System.out.println("Erreur Border " + i1 + " " + j1);
			exception.printStackTrace();
			return;
		}
	}

	public final void h()
	{
		int i1 = 0;
		int j1 = 0;
		try
		{
			for (int k1 = a_data_p.ac - 1; k1 <= a_data_p.ac + a_data_p.O + 2; k1++)
			{
				for (int l1 = a_data_p.ab - 1; l1 <= a_data_p.ab + a_data_p.N + 2; l1++)
				{
					if (k1 >= 0 && l1 >= 0 && k1 < 180 && l1 < 180)
						a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[a_data_p.k[l1 + k1 * 180]], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M) + a_data_p.U, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M) + a_data_p.V);
					i1++;
				}

				i1 = 0;
				j1++;
			}

			return;
		}
		catch (Exception exception)
		{
			System.out.println("Erreur Tile " + i1 + " " + j1);
			exception.printStackTrace();
			return;
		}
	}

	public final int a(int i1, int j1)
	{
		int k1;
		return k1 = i1 + j1 * 180;
	}

	public final byte a(int i1, int j1)
	{
		int k1 = i1 + j1 * 180;
		byte byte0;
		return byte0 = a_data_p.k[k1];
	}

	public final byte b(int i1, int j1)
	{
		int k1 = i1 + j1 * 180;
		byte byte0;
		return byte0 = a_data_p.j[k1];
	}

	public final byte c(int i1, int j1)
	{
		int k1 = i1 + j1 * 180;
		byte byte0;
		return byte0 = a_data_p.g[k1];
	}

	public final byte d(int i1, int j1)
	{
		int k1 = i1 + j1 * 180;
		byte byte0;
		return byte0 = a_data_p.l[k1];
	}

	public final boolean a(int i1, int j1)
	{
		c_boolean = true;
		switch (j1)
		{
		default:
			break;

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			if (a_data_p.k[i1] == a_data_p.e[5])
			{
				c_boolean = false;
				break;
			}
			if (a_data_p.k[i1] == a_data_p.e[6])
			{
				c_boolean = false;
				break;
			}
			if (a_data_p.k[i1] == a_data_p.e[12])
			{
				c_boolean = false;
				break;
			}
			if (a_data_p.k[i1] == a_data_p.e[13])
			{
				c_boolean = false;
				break;
			}
			if (a_data_p.k[i1] == a_data_p.e[14])
				c_boolean = false;
			else
				c_boolean = true;
			break;
		}
		return c_boolean;
	}

	public final boolean a(int i1)
	{
		c_boolean = true;
		if (a_data_p.k[i1] == a_data_p.e[5])
			c_boolean = false;
		else
		if (a_data_p.k[i1] == a_data_p.e[6])
			c_boolean = false;
		else
		if (a_data_p.k[i1] == a_data_p.e[4])
			c_boolean = false;
		else
		if (a_data_p.k[i1] == a_data_p.e[12])
			c_boolean = false;
		else
		if (a_data_p.k[i1] == a_data_p.e[13])
			c_boolean = false;
		else
		if (a_data_p.k[i1] == a_data_p.e[14])
			c_boolean = false;
		else
			c_boolean = true;
		return c_boolean;
	}

	public final boolean b(int i1, int j1)
	{
		c_boolean = true;
		switch (j1)
		{
		default:
			break;

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			if (a_data_p.k[i1] != a_data_p.e[12] && a_data_p.k[i1] != a_data_p.e[13] && a_data_p.k[i1] != a_data_p.e[14])
				c_boolean = false;
			break;
		}
		return c_boolean;
	}

	public final boolean c(int i1, int j1)
	{
		c_boolean = true;
		switch (j1)
		{
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			if (a_data_p.g[i1] != 0)
				return false;
			break;
		}
		return c_boolean;
	}

	public final boolean d(int i1, int j1)
	{
		c_boolean = true;
		switch (j1)
		{
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			if (a_data_p.l[i1] != 0)
				return false;
			break;
		}
		return c_boolean;
	}

	public final boolean e(int i1, int j1)
	{
		c_boolean = true;
		switch (j1)
		{
		default:
			break;

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			if (a_data_p.j[i1] == f_int_array1d[0])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[10])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[11])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[12])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[18])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[20])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[22])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[23])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[24])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[30])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[31])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[32])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[38])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[41])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[42])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[43])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[44])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[45])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[46])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] == f_int_array1d[47])
			{
				c_boolean = true;
				break;
			}
			if (a_data_p.j[i1] >= 50)
				c_boolean = true;
			else
				c_boolean = false;
			break;
		}
		return c_boolean;
	}

	public final void i()
	{
		int i1;
		int j1;
		i1 = 0;
		j1 = 0;
		for (int k1 = a_data_p.ac - 2; k1 <= a_data_p.ac + a_data_p.O + 4; k1++)
		{
			for (int l1 = a_data_p.ab - 2; l1 < a_data_p.ab + a_data_p.N + 4; l1++)
			{
				if (k1 >= 0 && l1 >= 0 && k1 < 180 && l1 < 180 && a_data_p.A)
				{
					if (a_data_p.g[l1 + k1 * 180] == 44)
						a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
					if (a_data_p.g[l1 + k1 * 180] == 0 || a_data_p.g[l1 + k1 * 180] == 1 || a_data_p.g[l1 + k1 * 180] == 5 || a_data_p.g[l1 + k1 * 180] == 18 || a_data_p.g[l1 + k1 * 180] == 13 || a_data_p.g[l1 + k1 * 180] == 21 || a_data_p.g[l1 + k1 * 180] == 22 || a_data_p.g[l1 + k1 * 180] == 49)
						a(l1, k1, i1, j1);
					else
					if (a_data_p.g[l1 + k1 * 180] != 0)
						a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[a_data_p.g[l1 + k1 * 180]], ((a_data_p.aM + a_data_p.M * i1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * j1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
				}
				if (k1 == a_data_p.aa && l1 == a_data_p.Z)
				{
					int j2 = i1;
					int k7 = j1;
					for (int i8 = a_data_p.aa; i8 < a_data_p.aa + 10; i8++)
					{
						for (int k8 = a_data_p.Z - 5; k8 < a_data_p.Z + 5; k8++)
						{
							if (i8 >= 0 && k8 >= 0 && i8 < 180 && k8 < 180)
								if (a_data_p.g[k8 + i8 * 180] != 0)
								{
									if (a_data_p.g[k8 + i8 * 180] == 0 || a_data_p.g[k8 + i8 * 180] == 1 || a_data_p.g[k8 + i8 * 180] == 5 || a_data_p.g[k8 + i8 * 180] == 18 || a_data_p.g[k8 + i8 * 180] == 13 || a_data_p.g[k8 + i8 * 180] == 21 || a_data_p.g[k8 + i8 * 180] == 22 || a_data_p.g[k8 + i8 * 180] == 49)
									{
										a(l1, k1, j2, k7);
										if (!a_data_p.T)
											a_data_p.a_data_ab.a();
										else
											a_data_p.a_data_ab.b();
									} else
									if (!a_data_p.T)
										a_data_p.a_data_ab.a();
									else
										a_data_p.a_data_ab.b();
								} else
								if (!a_data_p.T)
									a_data_p.a_data_ab.a();
								else
									a_data_p.a_data_ab.b();
							j2++;
						}

						j2 = 0;
						k7++;
					}

				}
				if (k1 >= 0 && l1 >= 0 && k1 < 180 && l1 < 180)
					if (a_data_p.l[l1 + k1 * 180] == 51)
					{
						for (int k2 = 0; k2 < a_int; k2++)
						{
							if (a_data_u_array1d[k2].c != l1 || a_data_u_array1d[k2].d != k1)
								continue;
							if (a_data_u_array1d[k2].m != 1)
							{
								a_data_u_array1d[k2].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 51;
								a_int_array2d[h][1] = k2;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 52)
					{
						for (int l2 = 0; l2 < b_int; l2++)
						{
							if (b_data_u_array1d[l2].c != l1 || b_data_u_array1d[l2].d != k1)
								continue;
							if (b_data_u_array1d[l2].m != 1)
							{
								b_data_u_array1d[l2].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 52;
								a_int_array2d[h][1] = l2;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 53)
					{
						for (int i3 = 0; i3 < c_int; i3++)
						{
							if (c_data_u_array1d[i3].c != l1 || c_data_u_array1d[i3].d != k1)
								continue;
							if (c_data_u_array1d[i3].m != 1)
							{
								c_data_u_array1d[i3].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 53;
								a_int_array2d[h][1] = i3;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 54)
					{
						for (int j3 = 0; j3 < d_int; j3++)
						{
							if (d_data_u_array1d[j3].c != l1 || d_data_u_array1d[j3].d != k1)
								continue;
							if (d_data_u_array1d[j3].m != 1)
							{
								d_data_u_array1d[j3].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 54;
								a_int_array2d[h][1] = j3;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 55)
					{
						for (int k3 = 0; k3 < e_int; k3++)
						{
							if (e_data_u_array1d[k3].c != l1 || e_data_u_array1d[k3].d != k1)
								continue;
							if (e_data_u_array1d[k3].m != 1)
							{
								e_data_u_array1d[k3].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 55;
								a_int_array2d[h][1] = k3;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 63)
					{
						for (int l3 = 0; l3 < f_int; l3++)
						{
							if (f_data_u_array1d[l3].c != l1 || f_data_u_array1d[l3].d != k1)
								continue;
							if (f_data_u_array1d[l3].m != 1)
							{
								f_data_u_array1d[l3].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 63;
								a_int_array2d[h][1] = l3;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 64)
					{
						for (int i4 = 0; i4 < g_int; i4++)
						{
							if (g_data_u_array1d[i4].c != l1 || g_data_u_array1d[i4].d != k1)
								continue;
							if (g_data_u_array1d[i4].m != 1)
							{
								g_data_u_array1d[i4].a(i1 - 1, j1 - 1);
								a_int_array2d[h][0] = 64;
								a_int_array2d[h][1] = i4;
								h++;
							}
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 42)
					{
						for (int j4 = 0; j4 < i; j4++)
						{
							if (a_data_l_array1d[j4].c != l1 || a_data_l_array1d[j4].d != k1)
								continue;
							a_data_l_array1d[j4].a(i1 - 1, j1 - 1);
							b_int_array2d[l][0] = 42;
							b_int_array2d[l][1] = j4;
							l++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 48)
					{
						for (int k4 = 0; k4 < j; k4++)
						{
							if (b_data_l_array1d[k4].c != l1 || b_data_l_array1d[k4].d != k1)
								continue;
							b_data_l_array1d[k4].a(i1 - 1, j1 - 1);
							b_int_array2d[l][0] = 48;
							b_int_array2d[l][1] = k4;
							l++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 62)
					{
						for (int l4 = 0; l4 < k; l4++)
						{
							if (c_data_l_array1d[l4].c != l1 || c_data_l_array1d[l4].d != k1)
								continue;
							c_data_l_array1d[l4].a(i1 - 1, j1 - 1);
							b_int_array2d[l][0] = 62;
							b_int_array2d[l][1] = l4;
							l++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 43)
					{
						for (int i5 = 0; i5 < m; i5++)
						{
							if (a_data_d_array1d[i5].c != l1 || a_data_d_array1d[i5].d != k1)
								continue;
							a_data_d_array1d[i5].a(i1 - 1, j1 - 1);
							c_int_array2d[q][0] = 43;
							c_int_array2d[q][1] = i5;
							q++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 44)
					{
						for (int j5 = 0; j5 < n; j5++)
						{
							if (b_data_d_array1d[j5].c != l1 || b_data_d_array1d[j5].d != k1)
								continue;
							b_data_d_array1d[j5].a(i1 - 1, j1 - 1);
							c_int_array2d[q][0] = 44;
							c_int_array2d[q][1] = j5;
							q++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 49)
					{
						for (int k5 = 0; k5 < o; k5++)
						{
							if (c_data_d_array1d[k5].c != l1 || c_data_d_array1d[k5].d != k1)
								continue;
							c_data_d_array1d[k5].a(i1 - 1, j1 - 1);
							c_int_array2d[q][0] = 49;
							c_int_array2d[q][1] = k5;
							q++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 50)
					{
						for (int l5 = 0; l5 < p; l5++)
						{
							if (d_data_d_array1d[l5].c != l1 || d_data_d_array1d[l5].d != k1)
								continue;
							d_data_d_array1d[l5].a(i1 - 1, j1 - 1);
							c_int_array2d[q][0] = 50;
							c_int_array2d[q][1] = l5;
							q++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 5)
					{
						for (int i6 = 0; i6 < t; i6++)
						{
							if (a_data_q_array1d[i6].c != l1 || a_data_q_array1d[i6].d != k1)
								continue;
							a_data_q_array1d[i6].a(i1 - 1, j1 - 1);
							d_int_array2d[x][0] = 5;
							d_int_array2d[x][1] = i6;
							x++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 45)
					{
						for (int j6 = 0; j6 < t; j6++)
						{
							if (b_data_q_array1d[j6].c != l1 || b_data_q_array1d[j6].d != k1)
								continue;
							b_data_q_array1d[j6].a(i1 - 1, j1 - 1);
							d_int_array2d[x][0] = 45;
							d_int_array2d[x][1] = j6;
							x++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 46)
					{
						for (int k6 = 0; k6 < v; k6++)
						{
							if (c_data_q_array1d[k6].c != l1 || c_data_q_array1d[k6].d != k1)
								continue;
							c_data_q_array1d[k6].a(i1 - 1, j1 - 1);
							d_int_array2d[x][0] = 46;
							d_int_array2d[x][1] = k6;
							x++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 47)
					{
						for (int l6 = 0; l6 < w; l6++)
						{
							if (d_data_q_array1d[l6].c != l1 || d_data_q_array1d[l6].d != k1)
								continue;
							d_data_q_array1d[l6].a(i1 - 1, j1 - 1);
							d_int_array2d[x][0] = 47;
							d_int_array2d[x][1] = l6;
							x++;
							break;
						}

					} else
					if (a_data_p.l[l1 + k1 * 180] == 56)
					{
						for (int i7 = 0; i7 < r; i7++)
						{
							if (a_data_i_array1d[i7].a != l1 || a_data_i_array1d[i7].b != k1)
								continue;
							a_data_i_array1d[i7].a(i1 - 1, j1 - 1);
							a_int_array1d[s] = i7;
							s++;
							break;
						}

					}
				i1++;
			}

			i1 = 0;
			j1++;
		}

		if (a_data_p.m_int != 2)
		{
			for (int i2 = 0; i2 < h; i2++)
				switch (a_int_array2d[i2][0])
				{
				case 51: // '3'
					a_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 52: // '4'
					b_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 53: // '5'
					c_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 54: // '6'
					d_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 55: // '7'
					e_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 63: // '?'
					f_data_u_array1d[a_int_array2d[i2][1]].a();
					break;

				case 64: // '@'
					g_data_u_array1d[a_int_array2d[i2][1]].a();
					break;
				}

			for (int j7 = 0; j7 < l; j7++)
				switch (b_int_array2d[j7][0])
				{
				case 42: // '*'
					a_data_l_array1d[b_int_array2d[j7][1]].a();
					break;

				case 48: // '0'
					b_data_l_array1d[b_int_array2d[j7][1]].a();
					break;

				case 62: // '>'
					c_data_l_array1d[b_int_array2d[j7][1]].a();
					break;
				}

			for (int l7 = 0; l7 < q; l7++)
				switch (c_int_array2d[l7][0])
				{
				case 43: // '+'
					a_data_d_array1d[c_int_array2d[l7][1]].a();
					break;

				case 44: // ','
					b_data_d_array1d[c_int_array2d[l7][1]].a();
					break;

				case 49: // '1'
					c_data_d_array1d[c_int_array2d[l7][1]].a();
					break;

				case 50: // '2'
					d_data_d_array1d[c_int_array2d[l7][1]].a();
					break;
				}

			for (int j8 = 0; j8 < x; j8++)
				switch (d_int_array2d[j8][0])
				{
				case 5: // '\005'
					a_data_q_array1d[d_int_array2d[j8][1]].a();
					break;

				case 45: // '-'
					b_data_q_array1d[d_int_array2d[j8][1]].a();
					break;

				case 46: // '.'
					c_data_q_array1d[d_int_array2d[j8][1]].a();
					break;

				case 47: // '/'
					d_data_q_array1d[d_int_array2d[j8][1]].a();
					break;
				}

			for (int l8 = 0; l8 < s; l8++)
				a_data_i_array1d[a_int_array1d[l8]].a();

		}
		h = 0;
		l = 0;
		q = 0;
		x = 0;
		s = 0;
		return;
		JVM INSTR dup ;
		Exception exception;
		exception;
		printStackTrace();
	}

	private void a(int i1, int j1, int k1, int l1)
	{
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[18])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[18], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.a(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.b(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.c(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.d(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 4)
				a_data_p.a_data_h.e(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 5)
				a_data_p.a_data_h.f(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 6)
				a_data_p.a_data_h.g(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 7)
				a_data_p.a_data_h.h(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 8)
				a_data_p.a_data_h.i(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 9)
				a_data_p.a_data_h.j(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 10)
				a_data_p.a_data_h.k(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 11)
				a_data_p.a_data_h.l(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 12)
				a_data_p.a_data_h.m(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[1])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[1], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.n(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.o(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.p(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.q(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 4)
				a_data_p.a_data_h.r(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 5)
				a_data_p.a_data_h.s(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 6)
				a_data_p.a_data_h.t(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 7)
				a_data_p.a_data_h.u(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[5])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[5], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.v(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.w(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.x(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.y(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 4)
				a_data_p.a_data_h.z(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 5)
				a_data_p.a_data_h.A(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 6)
				a_data_p.a_data_h.B(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 7)
				a_data_p.a_data_h.C(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 8)
				a_data_p.a_data_h.D(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[13])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[13], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.E(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.F(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.G(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.H(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 4)
				a_data_p.a_data_h.I(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 5)
				a_data_p.a_data_h.J(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 6)
				a_data_p.a_data_h.K(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 7)
				a_data_p.a_data_h.L(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 8)
				a_data_p.a_data_h.M(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 9)
				a_data_p.a_data_h.N(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 10)
				a_data_p.a_data_h.O(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 11)
				a_data_p.a_data_h.P(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[21])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[21], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.Q(k1, l1);
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.R(k1, l1);
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.S(k1, l1);
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.T(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[22])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[22], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
				a_data_p.a_data_h.U(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 1)
				a_data_p.a_data_h.V(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 2)
				a_data_p.a_data_h.V(k1, l1);
			else
			if (a_data_p.h[i1 + j1 * 180] == 3)
				a_data_p.a_data_h.V(k1, l1);
		}
		if (a_data_p.g[i1 + j1 * 180] == d_int_array1d[49])
		{
			a_data_p.a_data_w.a(a_data_p.a(), 0x90003, ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			a_data_p.a_data_w.a(a_data_p.a(), a_data_p.p[49], ((a_data_p.aM + a_data_p.M * k1) - a_data_p.M * 2) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l1) - a_data_p.M * 2) + a_data_p.V + a_data_p.M / 2);
			if (a_data_p.h[i1 + j1 * 180] == 0)
			{
				a_data_p.a_data_h.W(k1, l1);
				return;
			}
			if (a_data_p.h[i1 + j1 * 180] == 1)
			{
				a_data_p.a_data_h.X(k1, l1);
				return;
			}
			if (a_data_p.h[i1 + j1 * 180] == 2)
			{
				a_data_p.a_data_h.Y(k1, l1);
				return;
			}
			if (a_data_p.h[i1 + j1 * 180] == 3)
			{
				a_data_p.a_data_h.Z(k1, l1);
				return;
			}
			if (a_data_p.h[i1 + j1 * 180] == 4)
			{
				a_data_p.a_data_h.aa(k1, l1);
				return;
			}
			if (a_data_p.h[i1 + j1 * 180] == 5)
				a_data_p.a_data_h.ab(k1, l1);
		}
	}

	public final void a(boolean flag)
	{
		if (flag)
		{
			for (int i1 = 0; i1 < 32400; i1++)
			{
				c_byte_array1d[i1] = a_data_p.k[i1];
				d_byte_array1d[i1] = a_data_p.i[i1];
				if (a_data_p.k[i1] == 4)
					a_data_p.k[i1] = 0;
				if (a_data_p.k[i1] == 5)
					a_data_p.k[i1] = 4;
				if (a_data_p.k[i1] == 6)
					a_data_p.k[i1] = 5;
				if (a_data_p.i[i1] == 7)
					a_data_p.i[i1] = 0;
				if (a_data_p.i[i1] == 19)
					a_data_p.i[i1] = 7;
				if (a_data_p.i[i1] == 22)
					a_data_p.i[i1] = 19;
				if (a_data_p.i[i1] == 6)
					a_data_p.i[i1] = 0;
				if (a_data_p.i[i1] == 18)
					a_data_p.i[i1] = 6;
				if (a_data_p.i[i1] == 21)
					a_data_p.i[i1] = 18;
				if (a_data_p.i[i1] == 5)
					a_data_p.i[i1] = 0;
				if (a_data_p.i[i1] == 17)
					a_data_p.i[i1] = 5;
				if (a_data_p.i[i1] == 20)
					a_data_p.i[i1] = 17;
			}

		} else
		{
			for (int j1 = 0; j1 < 32400; j1++)
			{
				a_data_p.k[j1] = c_byte_array1d[j1];
				a_data_p.i[j1] = d_byte_array1d[j1];
			}

		}
		if (!a_data_p.ax)
		{
			a("BIGislandObjects", a_data_p.l);
			a_data_p.a();
			d();
			a_data_p.a();
			a_data_p.a_data_y.b();
			a_data_p.a();
		}
	}

	public final void j()
	{
		a_data_p.v = null;
		a_data_p.aH = -1;
		a_data_p.b_java_lang_StringBuffer = null;
		switch (a_data_p.j[a(a_data_p.Z - 1, a_data_p.aa - 1)])
		{
		default:
			break;

		case 50: // '2'
			if (!a_data_p.aj)
			{
				a_data_p.c_java_lang_StringBuffer = a_data_p.a_data_ac.a(0);
				a_data_p.aj = true;
				a_data_p.m_int = 9;
				a_data_p.aw_boolean = true;
				return;
			}
			break;

		case 51: // '3'
			if (!a_data_p.ak)
			{
				a_data_p.c_java_lang_StringBuffer = a_data_p.a_data_ac.a(1);
				a_data_p.ak = true;
				a_data_p.m_int = 9;
				a_data_p.aw_boolean = true;
				return;
			}
			break;

		case 52: // '4'
			if (a_data_p.al)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(2).toString() + "\\n \\n" + a_data_p.a_data_ac.a(4).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(2).toString() + "\\n \\n" + a_data_p.a_data_ac.a(3).toString());
			a_data_p.al = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				3, 6, 5
			});
			return;

		case 53: // '5'
			if (a_data_p.am)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(5).toString() + "\\n \\n" + a_data_p.a_data_ac.a(7).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(5).toString() + "\\n \\n" + a_data_p.a_data_ac.a(6).toString());
			a_data_p.am = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				9, 7, 4
			});
			a_data_p.aH = 9;
			return;

		case 54: // '6'
			if (a_data_p.an)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(8).toString() + "\\n \\n" + a_data_p.a_data_ac.a(10).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(8).toString() + "\\n \\n" + a_data_p.a_data_ac.a(9).toString());
			a_data_p.an = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				9, 7, 4
			});
			a_data_p.aH = 4;
			return;

		case 55: // '7'
			if (a_data_p.ao)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(11).toString() + "\\n \\n" + a_data_p.a_data_ac.a(13).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(11).toString() + "\\n \\n" + a_data_p.a_data_ac.a(12).toString());
			a_data_p.ao = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				13
			});
			a_data_p.aH = 13;
			return;

		case 56: // '8'
			if (a_data_p.ap_boolean)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(14).toString() + "\\n \\n" + a_data_p.a_data_ac.a(16).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(14).toString() + "\\n \\n" + a_data_p.a_data_ac.a(15).toString());
			a_data_p.ap_boolean = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				12
			});
			a_data_p.aH = 12;
			return;

		case 57: // '9'
			if (a_data_p.aq)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(17).toString() + "\\n \\n" + a_data_p.a_data_ac.a(19).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(17).toString() + "\\n \\n" + a_data_p.a_data_ac.a(18).toString());
			a_data_p.aq = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				11
			});
			a_data_p.aH = 11;
			return;

		case 58: // ':'
			if (a_data_p.ar)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(20).toString() + "\\n \\n" + a_data_p.a_data_ac.a(22).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(20).toString() + "\\n \\n" + a_data_p.a_data_ac.a(21).toString());
			a_data_p.ar = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				14
			});
			a_data_p.aH = 14;
			return;

		case 59: // ';'
			if (a_data_p.as)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(23).toString() + "\\n \\n" + a_data_p.a_data_ac.a(25).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(23).toString() + "\\n \\n" + a_data_p.a_data_ac.a(24).toString());
			a_data_p.as = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				10, 9, 6
			});
			a_data_p.aH = 9;
			return;

		case 60: // '<'
			if (a_data_p.at)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(26).toString() + "\\n \\n" + a_data_p.a_data_ac.a(28).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(26).toString() + "\\n \\n" + a_data_p.a_data_ac.a(27).toString());
			a_data_p.at = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				9, 7, 4
			});
			a_data_p.aH = 7;
			a_data_p.b_java_lang_StringBuffer = a_data_p.a_data_ac.a(60);
			return;

		case 61: // '='
			if (!a_data_p.au)
			{
				a_data_p.c_java_lang_StringBuffer = a_data_p.a_data_ac.a(29);
				a_data_p.au = true;
				a_data_p.m_int = 9;
				a_data_p.aw_boolean = true;
				return;
			}
			break;

		case 62: // '>'
			if (a_data_p.av_boolean)
				break;
			if (a_data_p.hasPointerEvents())
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(30).toString() + "\\n \\n" + a_data_p.a_data_ac.a(32).toString());
			else
				a_data_p.c_java_lang_StringBuffer = new StringBuffer(a_data_p.a_data_ac.a(30).toString() + "\\n \\n" + a_data_p.a_data_ac.a(31).toString());
			a_data_p.av_boolean = true;
			a_data_p.m_int = 9;
			a_data_p.aw_boolean = true;
			a_data_p.v = (new int[] {
				9, 7, 4
			});
			a_data_p.aH = 7;
			a_data_p.b_java_lang_StringBuffer = a_data_p.a_data_ac.a(68);
			break;
		}
	}
}
