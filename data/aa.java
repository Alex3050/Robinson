// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.*;

// Referenced classes of package data:
//			ab, ac, ad, k, 
//			p, r, v, w

public final class aa
{

	private p a_data_p;
	public int a_int;
	private int J;
	public int b_int;
	public int c_int;
	public int d_int;
	public int e_int;
	public int f_int;
	public int g_int;
	public int h;
	public int i;
	public int j;
	private int K;
	private StringBuffer e_java_lang_StringBuffer;
	private StringBuffer f_java_lang_StringBuffer;
	public StringBuffer a_java_lang_StringBuffer;
	public int k;
	public int l;
	public boolean a_boolean;
	public StringBuffer b_java_lang_StringBuffer;
	public StringBuffer c_java_lang_StringBuffer;
	public int m;
	private boolean b_boolean;
	private boolean c_boolean;
	private boolean d_boolean;
	private Date a_java_util_Date;
	private long a_long;
	private long b_long;
	private long c_long;
	private long d_long;
	private long e_long;
	private long f_long;
	private long g_long;
	private boolean e_boolean;
	private StringBuffer a_java_lang_StringBuffer_array1d[];
	private int a_int_array1d[];
	private int L;
	public int n;
	public int o;
	public int p;
	public int q;
	public int r;
	public int s;
	public int t;
	private boolean f_boolean;
	public int u;
	public int v;
	public int w;
	public int x;
	public int y;
	public int z;
	public int A;
	public int B;
	public int C;
	public int D;
	public int E;
	public int F;
	public int G;
	public StringBuffer d_java_lang_StringBuffer;
	public String a_java_lang_String;
	public int H;
	public int I;

	public aa(p p1)
	{
		e_int = 0;
		f_int = 0;
		g_int = 0;
		h = 0;
		i = 0;
		j = 0;
		K = 0;
		k = 0;
		l = Font.getFont(0, 1, 8).charWidth('a');
		a_boolean = true;
		m = 0;
		b_boolean = true;
		c_boolean = true;
		d_boolean = true;
		a_long = 0L;
		b_long = 0L;
		c_long = 0L;
		d_long = 0L;
		e_long = 0L;
		f_long = 0L;
		g_long = 0L;
		(new StringBuffer()).append("Collisions");
		(new StringBuffer()).append("Rocks");
		(new StringBuffer()).append("Borders");
		(new StringBuffer()).append("Decors");
		(new StringBuffer()).append("Objects");
		(new StringBuffer()).append("Tile Pos");
		(new StringBuffer()).append("Grid Display");
		(new StringBuffer()).append("Speed Up");
		(new StringBuffer()).append("FPS");
		(new StringBuffer()).append("Immortal");
		(new StringBuffer()).append("RobSpeed");
		(new StringBuffer()).append("MiniGame");
		(new StringBuffer()).append("on");
		(new StringBuffer()).append("off");
		e_boolean = true;
		a_java_lang_StringBuffer_array1d = new StringBuffer[6];
		a_int_array1d = new int[6];
		L = 0;
		n = 0;
		o = 0;
		p = 0;
		q = 0;
		r = 0;
		s = 0;
		t = 0;
		f_boolean = true;
		u = 0;
		v = 0;
		w = 0;
		x = 0;
		y = 0;
		z = 0;
		A = 0;
		B = 0;
		C = 0;
		D = 0;
		E = 0;
		F = 0;
		G = 0;
		a_java_lang_String = new String("");
		H = 0;
		I = 0;
		a_data_p = p1;
		if (data.k.b() < 160)
		{
			b_int = 0xa0000;
			c_int = 0xa0001;
			d_int = 0xa0002;
			a_int = 26;
			J = -3;
			e_int = 7;
			f_int = 15;
			g_int = 7;
			h = 7;
			return;
		}
		if (data.k.b() < 205)
		{
			b_int = 0xa000f;
			c_int = 0xa0010;
			d_int = 0xa0011;
			a_int = 26;
			J = -3;
			e_int = 7;
			f_int = 15;
			g_int = 7;
			h = 7;
			return;
		}
		if (data.k.b() < 290)
		{
			b_int = 0xa000f;
			c_int = 0xa0010;
			d_int = 0xa0011;
			a_int = 28;
			J = -3;
			e_int = 0;
			f_int = 0;
			g_int = 0;
			h = 0;
			return;
		}
		if (data.k.b() < 321)
		{
			b_int = 0xa000f;
			c_int = 0xa0010;
			d_int = 0xa0011;
			a_int = 28;
			J = -3;
			e_int = 0;
			f_int = 0;
			g_int = 0;
			h = 0;
			return;
		} else
		{
			b_int = 0xa000f;
			c_int = 0xa0010;
			d_int = 0xa0011;
			a_int = 28;
			J = -3;
			e_int = 0;
			f_int = 0;
			g_int = 0;
			h = 0;
			return;
		}
	}

	public final void a()
	{
		if (a_data_p.aw_boolean)
		{
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			a_data_p.aw_boolean = false;
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xe0000, data.k.a() / 2, 0);
			for (int i1 = 1; i1 < a_data_p.b_int + 1; i1++)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, b_int, data.k.a() / 6, (data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR);
				for (int j1 = 1; j1 < a_data_p.aK + 1; j1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, c_int, data.k.a() / 6 + 2 * j1, (data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, d_int, data.k.a() - data.k.a() / 6, (data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR);
				if (i1 == a_data_p.r + 1)
					L = 0xffffff;
				else
					L = 39423;
				if (i1 == 1)
				{
					if (!a_data_p.b_boolean)
						L = 0x444444;
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(50), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				}
				if (i1 == 2)
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(51), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (i1 == 3)
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(52), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (i1 == 4)
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(53), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (i1 == 5)
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(54), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (i1 == 6 && a_data_p.a_boolean)
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(111), data.k.a() >> 1, ((data.k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i1) - a_data_p.aR) + (a_data_p.aP - a_data_p.aJ) / 2, L, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}

			if (a_data_p.hasPointerEvents())
				if (a_data_p.aW != 0)
				{
					a_data_p.bl = 0;
					a_data_p.bm = 20;
				} else
				{
					a_data_p.bl = data.k.b() - 20;
					a_data_p.bm = data.k.b();
				}
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(55), a_data_p.bb, a_data_p.bc, 39423, 0x40 | a_data_p.ba | 0x100, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(56), a_data_p.bd, a_data_p.be, 39423, 328, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
		}
	}

	public final void a(StringBuffer stringbuffer)
	{
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 0);
				for (int i1 = 1; i1 < a_data_p.aV + 1; i1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * i1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, (24 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 0);
				for (int j1 = 1; j1 < a_data_p.aV + 1; j1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * j1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, (16 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			if (a_data_p.A == 0)
				K = 0xffffff;
			else
				K = 39423;
			if (a_data_p.ah)
				e_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.a_data_ac.a(47));
			else
				e_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.a_data_ac.a(48));
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, e_java_lang_StringBuffer, data.k.a() >> 1, data.k.b() / 2 - a_data_p.aJ * 2, K, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			if (a_data_p.A == 1)
				K = 0xffffff;
			else
				K = 39423;
			f_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.a_data_ac.a(49));
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, f_java_lang_StringBuffer, data.k.a() >> 1, data.k.b() / 2 + a_data_p.aJ, K, 17, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			c();
		}
	}

	public final void a(int i1, int j1)
	{
		if (a_data_p.l_boolean)
		{
			a_java_lang_StringBuffer = a_data_p.a_data_ac.a(j1);
			a_data_p.a_data_r.a(a_java_lang_StringBuffer, data.k.a() >> 1, 32, data.k.a(), data.k.b() - 32 - 20 - 5);
			a_data_p.l_boolean = false;
		}
		if (a_data_p.n_boolean)
		{
			a_data_p.n_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 0);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (24 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 0);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (16 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			ac.c(Integer.parseInt(a_data_p.b_java_util_Vector.elementAt(a_data_p.h_int).toString()));
			if (a_data_p.hasPointerEvents())
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, 40, 0xffffff, 1041, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b() - 32 - 20 - 5, 0, 0);
			else
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, 32, 0xffffff, 1041, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b() - 32 - 20 - 5, 0, 0);
			c();
		}
		if (a_data_p.m_boolean)
		{
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_r.a((data.k.a() >> 1) - 12, 29, data.k.b() - 24);
				return;
			}
			a_data_p.a_data_r.a((data.k.a() >> 1) - 8, 21, data.k.b() - 16);
		}
	}

	public final void a(int i1)
	{
		byte byte0;
		int j1;
		if (a_data_p.hasPointerEvents())
		{
			byte0 = 29;
			j1 = data.k.b() - 24;
		} else
		{
			byte0 = 21;
			j1 = data.k.b() - 16;
		}
		boolean flag = false;
		int k1;
		int l1 = (k1 = data.k.b() - 37 - 20) / (a_data_p.aJ + 5);
		int i2 = byte0 + 8 + 5;
		boolean flag1 = false;
		int i3 = 0;
		int j3 = 0;
		if (a_data_p.l_boolean)
		{
			a_data_p.a_java_util_Vector.addElement(new Integer(0));
			while (j3 + 1 != a_data_p.e_int) 
			{
				while (i3 < l1) 
				{
					int k2 = a_data_p.a_data_ac.a(null, a_data_p.a_data_ac.a(33 + j3), 20, i2 + 5, k, 20, 0, 1, 8, a_data_p.aJ, data.k.a() - 40, data.k.b(), 0, 0);
					m = (k2 - i2) / a_data_p.aJ;
					i3 += m;
					i2 = k2;
					if (++j3 == a_data_p.e_int)
						break;
				}
				a_data_p.a_java_util_Vector.addElement(new Integer(j3));
				j3--;
				i3 = 0;
				i2 = byte0 + 8 + 5;
			}
			a_data_p.l_boolean = false;
			return;
		}
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 0);
				for (int k3 = 1; k3 < a_data_p.aV + 1; k3++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k3, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (24 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 0);
				for (int l3 = 1; l3 < a_data_p.aV + 1; l3++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l3, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (16 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			int j2 = byte0 + 8 + 5;
			for (int i4 = ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f_int)).intValue(); i4 < ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue(); i4++)
			{
				if (i4 == a_data_p.d_int)
					k = 0xffffff;
				else
					k = 39423;
				int l2;
				j2 = l2 = a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(33 + i4), 20, j2 + 5, k, 20, 0, 1, 8, a_data_p.aJ, data.k.a() - 40, data.k.b(), 0, 0);
			}

			c();
		}
		if (a_data_p.e_int > ((Integer)a_data_p.a_java_util_Vector.elementAt(1)).intValue() && (a_data_p.n_int != 1 || a_data_p.m_int == 2))
		{
			if (a_data_p.n_long > 500L)
			{
				if (a_data_p.h_boolean)
					a_data_p.h_boolean = false;
				if (a_data_p.i)
					a_data_p.i = false;
			}
			if (a_data_p.hasPointerEvents())
			{
				if (a_data_p.h_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003b, (data.k.a() >> 1) - 12, byte0);
				else
				if (a_data_p.f_int > 0)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, (data.k.a() >> 1) - 12, byte0);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, byte0);
				if (a_data_p.i)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003c, (data.k.a() >> 1) - 12, j1);
					return;
				}
				if (((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue() < a_data_p.e_int)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, (data.k.a() >> 1) - 12, j1);
					return;
				} else
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, j1);
					return;
				}
			}
			if (a_data_p.h_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002f, (data.k.a() >> 1) - 8, byte0);
			else
			if (a_data_p.f_int > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002d, (data.k.a() >> 1) - 8, byte0);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, byte0);
			if (a_data_p.i)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0030, (data.k.a() >> 1) - 8, j1);
				return;
			}
			if (((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g_int)).intValue() < a_data_p.e_int)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002e, (data.k.a() >> 1) - 8, j1);
				return;
			}
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, j1);
		}
	}

	public final void a(int i1, StringBuffer stringbuffer, int ai[], int j1, StringBuffer stringbuffer1)
	{
		if (a_data_p.l_boolean)
		{
			a_java_lang_StringBuffer = stringbuffer;
			if (ai == null)
			{
				if (a_data_p.hasPointerEvents())
				{
					j = 29;
					i = data.k.b() - 53 - 20;
				} else
				{
					j = 21;
					i = data.k.b() - 37 - 20;
				}
			} else
			if (stringbuffer1 == null)
			{
				if (a_data_p.hasPointerEvents())
				{
					j = 68;
					i = data.k.b() - 92 - 20;
				} else
				{
					j = 52;
					i = data.k.b() - 68 - 20;
				}
			} else
			if (a_data_p.hasPointerEvents())
			{
				j = 88;
				i = data.k.b() - 112 - 20;
			} else
			{
				j = 72;
				i = data.k.b() - 88 - 20;
			}
			if (a_data_p.hasPointerEvents())
				a_data_p.a_data_r.a(a_java_lang_StringBuffer, data.k.a() >> 1, j + 16, data.k.a(), i);
			else
				a_data_p.a_data_r.a(a_java_lang_StringBuffer, data.k.a() >> 1, j + 24, data.k.a(), i);
			a_data_p.l_boolean = false;
		}
		if (a_data_p.n_boolean)
		{
			a_data_p.n_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 0);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (24 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (ai != null)
				{
					for (int k2 = 0; k2 < ai.length; k2++)
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[1], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + k2 * 26, 48);
						if (ai[k2] == j1)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[0], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + k2 * 26, 48);
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[ai[k2]], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + k2 * 26, 48);
					}

				}
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 0);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 0);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 0);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() >> 1, (16 - a_data_p.aJ) / 2, 39423, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (ai != null)
				{
					for (int l2 = 0; l2 < ai.length; l2++)
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[1], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + l2 * 26, 32);
						if (ai[l2] == j1)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[0], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + l2 * 26, 32);
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.u_int_array1d[ai[l2]], (data.k.a() / 2 - ((ai.length - 1) * 10 + (ai.length - 1) * 3)) + l2 * 26, 32);
					}

				}
			}
			if (a_data_p.hasPointerEvents())
			{
				if (stringbuffer1 != null)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 68);
					for (int i2 = 1; i2 < a_data_p.aV + 1; i2++)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * i2, 68);

					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 68);
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 68 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0033, 12, 68);
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0034, data.k.a() - 24, 68);
				}
			} else
			if (stringbuffer1 != null)
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 52);
				for (int j2 = 1; j2 < a_data_p.aV + 1; j2++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * j2, 52);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 52);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 52 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, 8, 52);
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, data.k.a() - 16, 52);
			}
			ac.c(Integer.parseInt(a_data_p.b_java_util_Vector.elementAt(a_data_p.h_int).toString()));
			if (ac.b() != -1)
				if (a_data_p.hasPointerEvents())
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, j + 12 + 8, 0xffffff, 1041, 0, 1, 8, a_data_p.aJ, data.k.a(), i, 0, 0);
				else
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, j + 16, 0xffffff, 1041, 0, 1, 8, a_data_p.aJ, data.k.a(), i, 0, 0);
			c();
		}
		if (a_data_p.m_boolean)
		{
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_r.a((data.k.a() >> 1) - 12, j, data.k.b() - 24);
				return;
			}
			a_data_p.a_data_r.a((data.k.a() >> 1) - 8, j, data.k.b() - 16);
		}
	}

	public final void b()
	{
		int i1 = (int)((a_data_p.a_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.b_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 0);
		for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 0);

		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 0);
		((k) (a_data_p)).a.setColor(0);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0003, 2, 4);
		((k) (a_data_p)).a.fillRect(14, 6, data.k.a() / 3 - 16, 4);
		if (b_boolean && i1 <= 10)
		{
			a_data_p.I_long = a_data_p.I_long + a_data_p.f_long;
			if (a_data_p.I_long > 300L)
			{
				b_boolean = false;
				((k) (a_data_p)).a.setColor(0xffffff);
				((k) (a_data_p)).a.fillRect(14, 6, ((data.k.a() / 3 - 16) * i1) / 100, 4);
				a_data_p.I_long = 0L;
			}
		} else
		{
			b_boolean = true;
			for (int i2 = 0; (float)i2 < a_data_p.a_float; i2++)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0006, 14 + 1 * i2, 6);

		}
		((k) (a_data_p)).a.setColor(0);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0004, (data.k.a() / 3 + 4) - 2, 4);
		((k) (a_data_p)).a.fillRect((data.k.a() / 3 + 16) - 2, 6, data.k.a() / 3 - 16, 4);
		if (c_boolean && j1 <= 10)
		{
			a_data_p.I_long = a_data_p.I_long + a_data_p.f_long;
			if (a_data_p.I_long > 300L)
			{
				c_boolean = false;
				((k) (a_data_p)).a.setColor(0xffffff);
				((k) (a_data_p)).a.fillRect((data.k.a() / 3 + 16) - 2, 6, ((data.k.a() / 3 - 16) * j1) / 100, 4);
				a_data_p.I_long = 0L;
			}
		} else
		{
			c_boolean = true;
			for (int j2 = 0; (float)j2 < a_data_p.b_float; j2++)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0007, ((data.k.a() / 3 + 16) - 2) + 1 * j2, 6);

		}
		((k) (a_data_p)).a.setColor(0);
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0005, ((data.k.a() / 3) * 2 + 4) - 2, 4);
		((k) (a_data_p)).a.fillRect(((data.k.a() / 3) * 2 + 16) - 2, 6, data.k.a() / 3 - 16, 4);
		if (d_boolean && k1 <= 10)
		{
			a_data_p.I_long = a_data_p.I_long + a_data_p.f_long;
			if (a_data_p.I_long > 300L)
			{
				((k) (a_data_p)).a.setColor(0xffffff);
				((k) (a_data_p)).a.fillRect(((data.k.a() / 3) * 2 + 16) - 2, 6, ((data.k.a() / 3 - 16) * k1) / 100, 4);
				d_boolean = false;
				a_data_p.I_long = 0L;
			}
		} else
		{
			d_boolean = true;
			for (int k2 = 0; (float)k2 < a_data_p.c_float; k2++)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0008, (((data.k.a() / 3) * 2 + 16) - 2) + 1 * k2, 6);

		}
		if (a_data_p.m_int != 7)
			c();
	}

	public final void c()
	{
		if (a_data_p.m_int == 6)
		{
			if (a_data_p.ak == 1 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 1)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6 && a_data_p.am == 6)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L && a_data_p.M && a_data_p.N && a_data_p.O && a_data_p.P_boolean && a_data_p.Q && a_data_p.R)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 1)
			{
				if (a_data_p.G_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 2)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 3)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 4)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 5)
			{
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
			} else
			if (a_data_p.ak == 6)
				if (a_data_p.G_boolean && a_data_p.H_boolean && a_data_p.I_boolean && a_data_p.J_boolean && a_data_p.K_boolean && a_data_p.L)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 8)
		{
			if (a_data_p.aw_int > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 1 && a_data_p.s == 1)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		else
		if (a_data_p.m_int == 1 && a_data_p.s == 2)
		{
			if (!a_data_p.v_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 1 && a_data_p.s == 3)
		{
			if (!a_data_p.S)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 1 && a_data_p.s == 4)
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		else
		if (a_data_p.m_int == 1 && a_data_p.s == 0)
		{
			if (a_data_p.aB_int > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 1 && a_data_p.s == 5)
		{
			if (a_data_p.av > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		if (a_data_p.m_int == 5)
		{
			if (a_data_p.ay > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0015, a_data_p.aW, a_data_p.aX);
		} else
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0012, a_data_p.aW, a_data_p.aX);
		}
		if (a_data_p.aW != 0)
		{
			if (a_data_p.k_int == 0 && (a_data_p.l_int == 2 || a_data_p.l_int == 3 || a_data_p.l_int == 4 || a_data_p.l_int == 10))
			{
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.aZ = 24;
					a_data_p.bl = 24;
					a_data_p.bm = 44;
				} else
				{
					a_data_p.aZ = 16;
					a_data_p.bl = 16;
					a_data_p.bm = 36;
				}
			} else
			if (a_data_p.k_int == 0 && a_data_p.l_int == 6 && (a_data_p.m_int == 3 || a_data_p.m_int == 4 || a_data_p.m_int == 5 || a_data_p.m_int == 8))
			{
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.aZ = 40;
					a_data_p.bl = 40;
					a_data_p.bm = 60;
				} else
				{
					a_data_p.aZ = 32;
					a_data_p.bl = 32;
					a_data_p.bm = 52;
				}
			} else
			if (a_data_p.k_int == 0 && a_data_p.l_int == 6 && a_data_p.m_int == 6)
			{
				if (a_data_p.ae)
				{
					a_data_p.aZ = 16;
					a_data_p.bl = 16;
					a_data_p.bm = 36;
				} else
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.aZ = 40;
					a_data_p.bl = 40;
					a_data_p.bm = 60;
				} else
				{
					a_data_p.aZ = 32;
					a_data_p.bl = 32;
					a_data_p.bm = 52;
				}
			} else
			if (a_data_p.k_int == 0 && a_data_p.l_int == 5)
			{
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.aZ = 40;
					a_data_p.bl = 40;
					a_data_p.bm = 60;
				} else
				{
					a_data_p.aZ = 32;
					a_data_p.bl = 32;
					a_data_p.bm = 52;
				}
			} else
			if (a_data_p.k_int == 0 && a_data_p.l_int == 6 && a_data_p.m_int == 1)
			{
				if (a_data_p.hasPointerEvents())
				{
					a_data_p.aZ = 40;
					a_data_p.bl = 40;
					a_data_p.bm = 60;
				} else
				{
					a_data_p.aZ = 32;
					a_data_p.bl = 32;
					a_data_p.bm = 52;
				}
			} else
			if (a_data_p.k_int == 0 && a_data_p.l_int == 6 && (a_data_p.m_int == 10 || a_data_p.m_int == 9 || a_data_p.m_int == 7 || a_data_p.m_int == 0))
			{
				a_data_p.aZ = 16;
				a_data_p.bl = 16;
				a_data_p.bm = 36;
			}
		} else
		{
			a_data_p.aZ = data.k.b() - 20;
			a_data_p.bl = data.k.b() - 20;
			a_data_p.bm = data.k.b();
		}
		a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0013, a_data_p.aY, a_data_p.aZ);
	}

	public final void d()
	{
		a_java_util_Date = new Date();
		a_long = a_java_util_Date.getTime();
		b_long = a_long / 1000L / 60L / 60L;
		c_long = b_long * 60L * 60L * 1000L;
		d_long = a_long - c_long;
		a_data_p.J_long = d_long / 1000L / 60L;
		e_long = 0x10752f0L + b_long;
		f_long = e_long / 24L;
		g_long = f_long * 24L;
		if (a_data_p.ah)
			a_data_p.K_long = (e_long - g_long) + 2L;
		else
			a_data_p.K_long = (e_long - g_long) + 1L;
		if (a_data_p.d_boolean)
		{
			a_data_p.d_boolean = false;
			a_data_p.a_long = f_long;
		}
		a_data_p.aG = (int)(f_long - a_data_p.a_long) + 1;
		a_data_p.a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.K_long + ":" + a_data_p.J_long);
	}

	public final void e()
	{
		if (a_data_p.aM)
			if (a_data_p.F_long < 333L)
				a_data_p.aS = 0xd002c;
			else
			if (a_data_p.F_long < 666L)
				a_data_p.aS = 0xd002d;
			else
			if (a_data_p.F_long < 999L)
			{
				a_data_p.aS = 0xd002e;
			} else
			{
				a_data_p.af = true;
				a_data_p.aM = false;
				if (a_data_p.X)
				{
					a_data_p.a_data_ad.a(a_data_p.P_int + 180);
					a_data_p.l_byte_array1d[a_data_p.P_int + 180] = 0;
				} else
				if (a_data_p.Y)
				{
					a_data_p.a_data_ad.a(a_data_p.P_int + 180 + 2);
					a_data_p.l_byte_array1d[a_data_p.P_int + 180 + 2] = 0;
				} else
				if (a_data_p.V)
				{
					a_data_p.a_data_ad.a(a_data_p.P_int + 1);
					a_data_p.l_byte_array1d[a_data_p.P_int + 1] = 0;
				} else
				if (a_data_p.W)
				{
					a_data_p.a_data_ad.a(a_data_p.P_int + 360 + 1);
					a_data_p.l_byte_array1d[a_data_p.P_int + 360 + 1] = 0;
				}
				a_data_p.m_int = 0;
				f();
				a_data_p.aw_boolean = true;
				return;
			}
		if ((a_data_p.j || a_data_p.k_boolean) && a_data_p.az_boolean || a_data_p.aM)
			a_data_p.a_data_v.a();
		if (e_boolean)
		{
			if (a_data_p.C > 3)
			{
				if (a_data_p.hasPointerEvents())
					a_data_p.aq = a_data_p.C;
				else
					a_data_p.aq = 3;
			} else
			{
				a_data_p.aq = a_data_p.C;
			}
			a_data_p.x = a_data_p.aq / 2;
			if (a_data_p.C > 0)
				e_boolean = false;
		}
		int i1 = a_data_p.aq * 20 + (a_data_p.aq - 1) * 6;
		int j1 = 0;
		int k1 = 0;
		int l1 = a_data_p.aq;
		if (a_data_p.C > 0)
		{
			if (!a_data_p.hasPointerEvents() && a_data_p.C > 3)
			{
				k1 = a_data_p.x - 1;
				l1 = a_data_p.x + 2;
				if (a_data_p.x == 0)
				{
					k1 = 0;
					l1 = 3;
				}
				if (a_data_p.x == a_data_p.C - 1)
				{
					k1 = a_data_p.x - 2;
					l1 = a_data_p.x + 1;
				}
			}
			for (int i2 = k1; i2 < l1; i2++)
			{
				if ((((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1) - 26 * (a_data_p.x - l1 / 2) <= (data.k.a() >> 1) + (i1 >> 1) && (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1) - 26 * (a_data_p.x - l1 / 2) >= (data.k.a() >> 1) - (i1 >> 1))
					if (a_data_p.n_int != 1 && a_data_p.m_int == 1 || a_data_p.p != 1 && a_data_p.m_int == 8)
					{
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0018, (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1 + 10) - 26 * (a_data_p.x - l1 / 2), a_data_p.aU - 10);
					} else
					{
						if (i2 == a_data_p.x)
						{
							a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0017, (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1 + 10) - 26 * (a_data_p.x - l1 / 2), a_data_p.aU - 10);
							a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0016, (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1 + 10) - 26 * (a_data_p.x - l1 / 2), a_data_p.aU - 10);
						} else
						{
							a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0018, (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1 + 10) - 26 * (a_data_p.x - l1 / 2), a_data_p.aU - 10);
						}
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.t_int_array1d[i2], (((data.k.a() >> 1) - (i1 >> 1)) + 26 * j1 + 10) - 26 * (a_data_p.x - l1 / 2), a_data_p.aU - 10);
					}
				j1++;
			}

		}
		if (!a_data_p.hasPointerEvents())
		{
			if (a_data_p.C > 0)
				if (a_data_p.n_int != 1 && a_data_p.m_int == 1 || a_data_p.p != 1 && a_data_p.m_int == 8)
				{
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - (i1 >> 1) - 3 - 8, a_data_p.aU - 20 - J);
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + (i1 >> 1) + 5, a_data_p.aU - 20 - J);
				} else
				{
					if (a_data_p.j)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, (data.k.a() >> 1) - (i1 >> 1) - 3 - 8, a_data_p.aU - 20 - J);
					else
					if (a_data_p.x == 0)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - (i1 >> 1) - 3 - 8, a_data_p.aU - 20 - J);
					else
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, (data.k.a() >> 1) - (i1 >> 1) - 3 - 8, a_data_p.aU - 20 - J);
					if (a_data_p.k_boolean)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, (data.k.a() >> 1) + (i1 >> 1) + 5, a_data_p.aU - 20 - J);
					else
					if (a_data_p.x == a_data_p.C - 1)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + (i1 >> 1) + 5, a_data_p.aU - 20 - J);
					else
						a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, (data.k.a() >> 1) + (i1 >> 1) + 5, a_data_p.aU - 20 - J);
				}
			if (a_data_p.l_long > 500L)
			{
				if (a_data_p.j)
					a_data_p.j = false;
				if (a_data_p.k_boolean)
					a_data_p.k_boolean = false;
			}
		}
	}

	public final void f()
	{
		a_data_p.C = 0;
		a_data_p.x = 1;
		e_boolean = true;
	}

	public final void g()
	{
		a_java_lang_StringBuffer_array1d[0] = a_data_p.a_data_ac.a(70);
		a_java_lang_StringBuffer_array1d[1] = a_data_p.a_data_ac.a(71);
		a_java_lang_StringBuffer_array1d[2] = a_data_p.a_data_ac.a(72);
		a_java_lang_StringBuffer_array1d[3] = a_data_p.a_data_ac.a(73);
		a_java_lang_StringBuffer_array1d[4] = a_data_p.a_data_ac.a(74);
		a_java_lang_StringBuffer_array1d[5] = a_data_p.a_data_ac.a(75);
		a_int_array1d[0] = 0xa0009;
		a_int_array1d[1] = 0xa000a;
		a_int_array1d[2] = 0xa000b;
		a_int_array1d[3] = 0xa000c;
		a_int_array1d[4] = 0xa000d;
		a_int_array1d[5] = 0xa000e;
	}

	public final void h()
	{
		if (a_data_p.b_boolean)
			a_data_p.r = 0;
		else
			a_data_p.r = 1;
		a_data_p.n_int = 0;
		a_data_p.au = 0;
		a_data_p.z = 0;
		a_data_p.x = 1;
		a_data_p.aw_boolean = true;
	}

	public final void i()
	{
		if (a_data_p.hasPointerEvents())
		{
			if ((a_data_p.n_int != 1 || a_data_p.m_int == 2) && (a_data_p.n_int != 3 || !a_data_p.v_boolean) && (a_data_p.n_int != 5 || !a_data_p.S))
			{
				if (a_data_p.f_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0035, 8, 16);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0033, 8, 16);
				if (a_data_p.g_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0036, data.k.a() - 8 - 12, 16);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0034, data.k.a() - 8 - 12, 16);
			}
		} else
		if ((a_data_p.n_int != 1 || a_data_p.m_int == 2) && (a_data_p.n_int != 3 || !a_data_p.v_boolean) && (a_data_p.n_int != 5 || !a_data_p.S))
		{
			if (a_data_p.f_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, 8, 16);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, 8, 16);
			if (a_data_p.g_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, data.k.a() - 16, 16);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, data.k.a() - 16, 16);
		}
		if (a_data_p.m_long > 500L)
		{
			if (a_data_p.f_boolean)
				a_data_p.f_boolean = false;
			if (a_data_p.g_boolean)
				a_data_p.g_boolean = false;
		}
	}

	public final void j()
	{
		if (a_data_p.s == 0)
		{
			a(a_data_p.a_data_ac.a(57), a_data_p.m_byte_array1d);
			if (a_data_p.n_int == 1)
			{
				e();
				return;
			}
		} else
		{
			if (a_data_p.s == 1)
			{
				d(a_data_p.a_data_ac.a(58));
				return;
			}
			if (a_data_p.s == 2)
			{
				e(a_data_p.a_data_ac.a(60));
				return;
			}
			if (a_data_p.s == 3)
			{
				a_data_p.a_data_r.d(a_data_p.a_data_ac.a(67));
				return;
			}
			if (a_data_p.s == 4)
			{
				a_data_p.a_data_r.e(a_data_p.a_data_ac.a(68));
				return;
			}
			if (a_data_p.s == 5)
			{
				f(a_data_p.a_data_ac.a(65));
				if (a_data_p.n_int == 1)
					e();
			}
		}
	}

	private void a(StringBuffer stringbuffer, byte abyte0[])
	{
		int i1;
		if (a_data_p.hasPointerEvents())
			i1 = 52 + a_data_p.aI * a_data_p.as;
		else
			i1 = 40 + a_data_p.aI * a_data_p.as;
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			for (int j1 = 0; j1 < a_data_p.as; j1++)
			{
				if (j1 % 2 == 0)
				{
					if (a_data_p.au % 2 == 0)
						((k) (a_data_p)).a.setColor(10061);
					else
						((k) (a_data_p)).a.setColor(6965);
				} else
				if (a_data_p.au % 2 == 0)
					((k) (a_data_p)).a.setColor(6965);
				else
					((k) (a_data_p)).a.setColor(10061);
				if (a_data_p.hasPointerEvents())
					((k) (a_data_p)).a.fillRect(0, 52 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
				else
					((k) (a_data_p)).a.fillRect(0, 40 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
			}

			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			a_data_p.at = a_data_p.aB_int;
			if (a_data_p.at > a_data_p.as)
				if (a_data_p.hasPointerEvents())
				{
					if (a_data_p.l_int == 6 && a_data_p.m_int == 1 && a_data_p.n_int == 0 || a_data_p.n_int == 1)
						if (a_data_p.at - a_data_p.au < a_data_p.as)
							a_data_p.at = a_data_p.aB_int - a_data_p.au;
						else
							a_data_p.at = a_data_p.as;
				} else
				{
					a_data_p.at = a_data_p.as;
				}
			for (int i2 = a_data_p.au; i2 < a_data_p.at + a_data_p.au; i2++)
			{
				if (i2 == a_data_p.z)
					k = 0xffffff;
				else
					k = 39423;
				StringBuffer stringbuffer1 = (new StringBuffer()).append(a_data_p.b_java_lang_String_array1d[abyte0[i2]]).append(".." + a_data_p.q[i2]);
				if (a_data_p.hasPointerEvents())
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 52 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 4, k, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				else
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 40 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 4, k, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}

		}
		if (a_data_p.n_int != 1 || a_data_p.m_int == 2)
		{
			if (a_data_p.hasPointerEvents())
			{
				if (a_data_p.h_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003b, (data.k.a() >> 1) - 12, 40);
				else
				if (a_data_p.au > 0)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, (data.k.a() >> 1) - 12, 40);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, 40);
				if (a_data_p.i)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003c, (data.k.a() >> 1) - 12, i1);
				else
				if (a_data_p.aB_int > a_data_p.at && a_data_p.at + a_data_p.au < a_data_p.aB_int)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, (data.k.a() >> 1) - 12, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
			} else
			{
				if (a_data_p.h_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002f, (data.k.a() >> 1) - 8, 32);
				else
				if (a_data_p.au > 0)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002d, (data.k.a() >> 1) - 8, 32);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, 32);
				if (a_data_p.i)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0030, (data.k.a() >> 1) - 8, i1);
				else
				if (a_data_p.aB_int > a_data_p.at && a_data_p.at + a_data_p.au < a_data_p.aB_int)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002e, (data.k.a() >> 1) - 8, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
			}
			if (a_data_p.n_long > 500L)
			{
				if (a_data_p.h_boolean)
					a_data_p.h_boolean = false;
				if (a_data_p.i)
					a_data_p.i = false;
			}
		} else
		if (a_data_p.hasPointerEvents())
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, 40);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
		} else
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, 32);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
		}
		i();
	}

	private void d(StringBuffer stringbuffer)
	{
		int i1 = (int)((a_data_p.a_float * 100F) / a_data_p.d_float);
		int j1 = (int)((a_data_p.b_float * 100F) / a_data_p.d_float);
		int k1 = (int)((a_data_p.c_float * 100F) / a_data_p.d_float);
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * l1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int i2 = 1; i2 < a_data_p.aV + 1; i2++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * i2, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			int j2 = 32 + (data.k.b() - 52 - 6 * ((a_data_p.aL * 3) / 2 + 12)) / 2;
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0021, data.k.a() >> 3, j2 + 6);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0022, data.k.a() >> 3, j2 + (12 + a_data_p.aL * 1) * 1 + 6);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0023, data.k.a() >> 3, j2 + (12 + a_data_p.aL * 1) * 2 + 6);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0024, data.k.a() >> 3, j2 + (12 + a_data_p.aL * 1) * 3 + 6);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0025, data.k.a() >> 3, j2 + (12 + a_data_p.aL * 1) * 4 + 6);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0026, data.k.a() >> 3, j2 + (12 + a_data_p.aL * 1) * 5 + 6);
			for (int k2 = 0; k2 < 6; k2++)
			{
				((k) (a_data_p)).a.setColor(0);
				((k) (a_data_p)).a.fillRect((data.k.a() >> 3) + 28, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2, 1 * (int)a_data_p.d_float, 8);
				if (k2 == 0)
				{
					if (i1 <= 10)
					{
						if (b_boolean && i1 <= 10)
						{
							a_data_p.aw_boolean = true;
							((k) (a_data_p)).a.setColor(0xffffff);
							((k) (a_data_p)).a.fillRect((data.k.a() >> 3) + 28, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2, (1 * (int)a_data_p.d_float * i1) / 100, 8);
						} else
						{
							a_data_p.aw_boolean = true;
							for (int l2 = 0; (float)l2 < a_data_p.a_float; l2++)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * l2, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

						}
					} else
					{
						for (int i3 = 0; (float)i3 < a_data_p.a_float; i3++)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * i3, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

					}
				} else
				if (k2 == 1)
				{
					if (j1 <= 10)
					{
						if (c_boolean)
						{
							a_data_p.aw_boolean = true;
							((k) (a_data_p)).a.setColor(0xffffff);
							((k) (a_data_p)).a.fillRect((data.k.a() >> 3) + 28, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2, (1 * (int)a_data_p.d_float * j1) / 100, 8);
						} else
						{
							a_data_p.aw_boolean = true;
							for (int j3 = 0; (float)j3 < a_data_p.b_float; j3++)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * j3, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

						}
					} else
					{
						for (int k3 = 0; (float)k3 < a_data_p.b_float; k3++)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * k3, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

					}
				} else
				if (k2 == 2)
				{
					if (k1 <= 10)
					{
						if (!d_boolean)
						{
							a_data_p.aw_boolean = true;
							((k) (a_data_p)).a.setColor(0xffffff);
							((k) (a_data_p)).a.fillRect((data.k.a() >> 3) + 28, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2, (1 * (int)a_data_p.d_float * k1) / 100, 8);
						} else
						{
							a_data_p.aw_boolean = true;
							for (int l3 = 0; (float)l3 < a_data_p.c_float; l3++)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * l3, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

						}
					} else
					{
						for (int i4 = 0; (float)i4 < a_data_p.c_float; i4++)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * i4, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

					}
				} else
				if (k2 == 3)
				{
					for (int j4 = 0; (float)j4 < a_data_p.e_float; j4++)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * j4, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

				} else
				if (k2 == 4)
				{
					for (int k4 = 0; (float)k4 < a_data_p.f_float; k4++)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * k4, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

				} else
				if (k2 == 5)
				{
					for (int l4 = 0; (float)l4 < a_data_p.g_float; l4++)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_int_array1d[k2], (data.k.a() >> 3) + 28 + 1 * l4, 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2);

				}
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer_array1d[k2], (data.k.a() >> 3) + 28 + 1 * (int)a_data_p.d_float + data.k.a() / 17, 7 + 7 * k2 + j2 + (6 + a_data_p.aL * 1) * k2, 39423, 68, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}

		}
		i();
	}

	public final void a(StringBuffer stringbuffer, int i1)
	{
		if (a_data_p.c_java_lang_String_array1d[i1] == null && i1 > 59 && i1 < 120)
		{
			a_data_p.a_data_ac.a(3);
			for (int j1 = 0; j1 < 60; j1++)
				a_data_p.c_java_lang_String_array1d[j1 + 60] = a_data_p.a_data_ac.a(0x30000 + j1).toString();

			a_data_p.a_data_ac.b(3);
			a_data_p.a();
		}
		if (a_data_p.l_boolean)
		{
			a_java_lang_StringBuffer = (new StringBuffer()).append(a_data_p.c_java_lang_String_array1d[i1]);
			a_data_p.a_data_r.a(a_java_lang_StringBuffer, data.k.a() >> 1, 111, data.k.a(), data.k.b() - 106 - 20);
			a_data_p.l_boolean = false;
		}
		if (a_data_p.n_boolean)
		{
			a_data_p.n_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			StringBuffer stringbuffer1 = (new StringBuffer()).append(a_data_p.b_java_lang_String_array1d[i1]);
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 55, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (a_data_p.f_int_array1d[i1] != -1 && i1 != 18 && i1 != 9 && i1 != 10 && i1 != 17)
					if (i1 == 4 || i1 == 43 || i1 == 44 || i1 == 51 || i1 == 52 || i1 == 53 || i1 == 62)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[i1], data.k.a() >> 1, 85);
					else
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[i1], data.k.a() >> 1, 75);
				ac.c(Integer.parseInt(a_data_p.b_java_util_Vector.elementAt(a_data_p.h_int).toString()));
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, 107, 0xffffff, 1089, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b() - 106 - 20, 0, 0);
			} else
			{
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 43, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				if (a_data_p.f_int_array1d[i1] != -1 && i1 != 18 && i1 != 9 && i1 != 10 && i1 != 17)
					if (i1 == 4 || i1 == 43 || i1 == 44 || i1 == 51 || i1 == 52 || i1 == 53 || i1 == 62)
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[i1], data.k.a() >> 1, 73);
					else
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[i1], data.k.a() >> 1, 63);
				ac.c(Integer.parseInt(a_data_p.b_java_util_Vector.elementAt(a_data_p.h_int).toString()));
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_java_lang_StringBuffer, data.k.a() >> 1, 107, 0xffffff, 1089, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b() - 106 - 20, 0, 0);
			}
		}
		if (a_data_p.m_boolean)
			a_data_p.a_data_r.a((data.k.a() >> 1) - 8, 86, data.k.b() - 12 - 1);
	}

	private void e(StringBuffer stringbuffer)
	{
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int i1 = 1; i1 < a_data_p.aV + 1; i1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * i1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int j1 = 1; j1 < a_data_p.aV + 1; j1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * j1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			((k) (a_data_p)).a.setColor(26265);
			((k) (a_data_p)).a.fillRect((data.k.a() >> 1) - 24, (32 + (data.k.b() - 32 - 20 >> 1)) - 24, 48, 51);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x30000, data.k.a() >> 1, ((32 + (data.k.b() - 32 - 20 >> 1)) - 24) + 37);
			if (a_data_p.d_int_array1d[a_data_p.G_int] != -1)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[a_data_p.d_int_array1d[a_data_p.G_int]], data.k.a() >> 1, ((32 + (data.k.b() - 32 - 20 >> 1)) - 24) + 37);
			if (a_data_p.c_int_array1d[a_data_p.F_int] != -1)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[a_data_p.c_int_array1d[a_data_p.F_int]], data.k.a() >> 1, ((32 + (data.k.b() - 32 - 20 >> 1)) - 24) + 37);
			if (a_data_p.b_int_array1d[a_data_p.E] != -1)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[a_data_p.b_int_array1d[a_data_p.E]], data.k.a() >> 1, ((32 + (data.k.b() - 32 - 20 >> 1)) - 24) + 37);
			if (a_data_p.a_int_array1d[a_data_p.D] != -1)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[a_data_p.a_int_array1d[a_data_p.D]], data.k.a() >> 1, ((32 + (data.k.b() - 32 - 20 >> 1)) - 24) + a_data_p.a_data_ab.a[0] + 37 + a_data_p.a_data_ab.b[0]);
		}
		if (a_data_p.v_boolean)
		{
			if (a_data_p.u_int == 0)
			{
				if (a_data_p.t_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			}
			if (a_data_p.u_int == 1)
			{
				if (a_data_p.t_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			}
			if (a_data_p.u_int == 2)
			{
				if (a_data_p.t_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			}
			if (a_data_p.u_int == 3)
			{
				if (a_data_p.t_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0029, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0027, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
			}
			if (a_data_p.u_int == 0)
			{
				if (a_data_p.u_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			}
			if (a_data_p.u_int == 1)
			{
				if (a_data_p.u_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			}
			if (a_data_p.u_int == 2)
			{
				if (a_data_p.u_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			}
			if (a_data_p.u_int == 3)
			{
				if (a_data_p.u_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002a, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0028, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
			}
		} else
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002b, (data.k.a() >> 1) - 19 - 21, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 32 - 3);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, (32 + (data.k.b() - 32 - 20 >> 1)) - 16 - 1);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 1);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002c, (data.k.a() >> 1) + 19 + 14, 32 + (data.k.b() - 32 - 20 >> 1) + 16 + 3);
		}
		if (a_data_p.o > 500L)
		{
			if (a_data_p.t_boolean)
				a_data_p.t_boolean = false;
			if (a_data_p.u_boolean)
				a_data_p.u_boolean = false;
		}
		i();
	}

	public final void b(StringBuffer stringbuffer)
	{
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int i1 = 1; i1 < a_data_p.aV + 1; i1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * i1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int j1 = 1; j1 < a_data_p.aV + 1; j1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * j1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			if (a_data_p.t_int == 0)
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(77), data.k.a() >> 1, data.k.b() / 2 - a_data_p.aJ * 2, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			else
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(77), data.k.a() >> 1, data.k.b() / 2 - a_data_p.aJ * 2, 26265, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			if (a_data_p.t_int == 1)
			{
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(78), data.k.a() >> 1, data.k.b() / 2 + a_data_p.aJ, 0xffffff, 17, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				return;
			}
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(78), data.k.a() >> 1, data.k.b() / 2 + a_data_p.aJ, 26265, 17, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
		}
	}

	private void f(StringBuffer stringbuffer)
	{
		int i1;
		if (a_data_p.hasPointerEvents())
			i1 = 52 + a_data_p.aI * a_data_p.as;
		else
			i1 = 40 + a_data_p.aI * a_data_p.as;
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			for (int j1 = 0; j1 < a_data_p.as; j1++)
			{
				if (j1 % 2 == 0)
				{
					if (a_data_p.au % 2 == 0)
						((k) (a_data_p)).a.setColor(10061);
					else
						((k) (a_data_p)).a.setColor(6965);
				} else
				if (a_data_p.au % 2 == 0)
					((k) (a_data_p)).a.setColor(6965);
				else
					((k) (a_data_p)).a.setColor(10061);
				if (a_data_p.hasPointerEvents())
					((k) (a_data_p)).a.fillRect(0, 52 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
				else
					((k) (a_data_p)).a.fillRect(0, 40 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
			}

			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			a_data_p.at = a_data_p.av;
			if (a_data_p.at > a_data_p.as)
				a_data_p.at = a_data_p.as;
			for (int i2 = a_data_p.au; i2 < a_data_p.at + a_data_p.au; i2++)
			{
				if (i2 == a_data_p.v_int)
					k = 0xffffff;
				else
					k = 39423;
				StringBuffer stringbuffer1 = (new StringBuffer()).append(a_data_p.b_java_lang_String_array1d[a_data_p.a_byte_array1d[i2]]);
				if (a_data_p.hasPointerEvents())
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 52 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 4, k, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				else
					a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 40 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 4, k, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}

		}
		if (a_data_p.n_int != 1 || a_data_p.m_int == 2)
		{
			if (a_data_p.hasPointerEvents())
			{
				if (a_data_p.h_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003b, (data.k.a() >> 1) - 12, 40);
				else
				if (a_data_p.au > 0)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, (data.k.a() >> 1) - 12, 40);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, 40);
				if (a_data_p.i)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003c, (data.k.a() >> 1) - 12, i1);
				else
				if (a_data_p.av > a_data_p.at && a_data_p.at + a_data_p.au < a_data_p.av)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, (data.k.a() >> 1) - 12, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
			} else
			{
				if (a_data_p.h_boolean)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002f, (data.k.a() >> 1) - 8, 32);
				else
				if (a_data_p.au > 0)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002d, (data.k.a() >> 1) - 8, 32);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, 32);
				if (a_data_p.i)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0030, (data.k.a() >> 1) - 8, i1);
				else
				if (a_data_p.av > a_data_p.at && a_data_p.at + a_data_p.au < a_data_p.av)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002e, (data.k.a() >> 1) - 8, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
			}
			if (a_data_p.n_long > 500L)
			{
				if (a_data_p.h_boolean)
					a_data_p.h_boolean = false;
				if (a_data_p.i)
					a_data_p.i = false;
			}
		} else
		if (a_data_p.hasPointerEvents())
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, 40);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
		} else
		{
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, 32);
			a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
		}
		i();
	}

	public final void k()
	{
		a_data_p.m_int = 0;
		a_data_p.aB_boolean = false;
		a_data_p.aC = false;
		a_data_p.aD = false;
		for (int i1 = 0; i1 < 120; i1++)
		{
			a_data_p.f_java_lang_String_array1d[i1] = "";
			a_data_p.e_java_lang_String_array1d[i1] = "";
			a_data_p.d_java_lang_String_array1d[i1] = "";
		}

		a_data_p.az_int = 0;
		a_data_p.ay = 0;
		a_data_p.ax = 0;
		a_data_p.y = 0;
		h();
	}

	public final void c(StringBuffer stringbuffer)
	{
		int i1;
		if (a_data_p.hasPointerEvents())
			i1 = 52 + a_data_p.aI * a_data_p.as;
		else
			i1 = 40 + a_data_p.aI * a_data_p.as;
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			for (int j1 = 0; j1 < a_data_p.as; j1++)
			{
				if (j1 % 2 == 0)
				{
					if (a_data_p.au % 2 == 0)
						((k) (a_data_p)).a.setColor(10061);
					else
						((k) (a_data_p)).a.setColor(6965);
				} else
				if (a_data_p.au % 2 == 0)
					((k) (a_data_p)).a.setColor(6965);
				else
					((k) (a_data_p)).a.setColor(10061);
				if (a_data_p.hasPointerEvents())
					((k) (a_data_p)).a.fillRect(0, 52 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
				else
					((k) (a_data_p)).a.fillRect(0, 40 + j1 * a_data_p.aI, data.k.a(), a_data_p.aI);
			}

			if (a_data_p.hasPointerEvents())
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa000f, 0, 16);
				for (int k1 = 1; k1 < a_data_p.aV + 1; k1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0010, 2 * k1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0011, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (24 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			} else
			{
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0000, 0, 16);
				for (int l1 = 1; l1 < a_data_p.aV + 1; l1++)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0001, 2 * l1, 16);

				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0002, data.k.a() - 2, 16);
				a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer, data.k.a() >> 1, 16 + (16 - a_data_p.aJ) / 2, 0xffffff, 273, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			}
			n = 0;
			o = 0;
			p = 0;
			q = 0;
			r = 0;
			s = 0;
			if (a_data_p.aA)
			{
				byte byte0;
				if (a_data_p.b_java_lang_String_array1d[17].equals(a_data_p.b_java_lang_String_array1d[9]))
					byte0 = 2;
				else
				if (a_data_p.b_java_lang_String_array1d[17].equals(a_data_p.b_java_lang_String_array1d[10]))
					byte0 = 3;
				else
					byte0 = 1;
				for (int k2 = 0; k2 < a_data_p.aB_int; k2++)
				{
					for (int l2 = 0; l2 < 120; l2++)
					{
						for (int j3 = 0; j3 <= 10; j3++)
						{
							if (a_data_p.a_byte_array2d[l2][j3] != 0 && a_data_p.m_byte_array1d[k2] == a_data_p.a_byte_array2d[l2][j3])
							{
								if (byte0 == 1 && a_data_p.e_byte_array1d[l2] == -1)
								{
									f_boolean = true;
									for (int l3 = 0; l3 < a_data_p.av; l3++)
										if (a_data_p.a_byte_array1d[l3] == (byte)l2)
											f_boolean = false;

									for (int k4 = 0; k4 < a_data_p.aw_int; k4++)
										if (a_data_p.a_java_lang_String_array1d[k4] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									for (int j5 = 0; j5 < a_data_p.H_int; j5++)
										if (a_data_p.a_int_array1d[j5] == l2)
											f_boolean = false;

									for (int i6 = 0; i6 < a_data_p.I_int; i6++)
										if (a_data_p.b_int_array1d[i6] == l2)
											f_boolean = false;

									for (int l6 = 0; l6 < a_data_p.J_int; l6++)
										if (a_data_p.c_int_array1d[l6] == l2)
											f_boolean = false;

									for (int k7 = 0; k7 < a_data_p.K_int; k7++)
										if (a_data_p.d_int_array1d[k7] == l2)
											f_boolean = false;

									for (int j8 = 0; j8 < a_data_p.az_int; j8++)
										if (a_data_p.f_java_lang_String_array1d[j8] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									if (f_boolean)
									{
										a_data_p.f_java_lang_String_array1d[a_data_p.az_int] = a_data_p.b_java_lang_String_array1d[l2];
										a_data_p.az_int++;
									}
								}
								if (byte0 == 2 && (a_data_p.e_byte_array1d[l2] == 9 || a_data_p.e_byte_array1d[l2] == -1))
								{
									f_boolean = true;
									for (int i4 = 0; i4 < a_data_p.av; i4++)
										if (a_data_p.a_byte_array1d[i4] == (byte)l2)
											f_boolean = false;

									for (int l4 = 0; l4 < a_data_p.aw_int; l4++)
										if (a_data_p.a_java_lang_String_array1d[l4] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									for (int k5 = 0; k5 < a_data_p.H_int; k5++)
										if (a_data_p.a_int_array1d[k5] == l2)
											f_boolean = false;

									for (int j6 = 0; j6 < a_data_p.I_int; j6++)
										if (a_data_p.b_int_array1d[j6] == l2)
											f_boolean = false;

									for (int i7 = 0; i7 < a_data_p.J_int; i7++)
										if (a_data_p.c_int_array1d[i7] == l2)
											f_boolean = false;

									for (int l7 = 0; l7 < a_data_p.K_int; l7++)
										if (a_data_p.d_int_array1d[l7] == l2)
											f_boolean = false;

									for (int k8 = 0; k8 < a_data_p.az_int; k8++)
										if (a_data_p.f_java_lang_String_array1d[k8] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									if (f_boolean)
									{
										a_data_p.f_java_lang_String_array1d[a_data_p.az_int] = a_data_p.b_java_lang_String_array1d[l2];
										a_data_p.az_int++;
									}
								}
								if (byte0 == 3 && (a_data_p.e_byte_array1d[l2] == 9 || a_data_p.e_byte_array1d[l2] == 10 || a_data_p.e_byte_array1d[l2] == -1))
								{
									f_boolean = true;
									for (int j4 = 0; j4 < a_data_p.av; j4++)
										if (a_data_p.a_byte_array1d[j4] == (byte)l2)
											f_boolean = false;

									for (int i5 = 0; i5 < a_data_p.aw_int; i5++)
										if (a_data_p.a_java_lang_String_array1d[i5] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									for (int l5 = 0; l5 < a_data_p.H_int; l5++)
										if (a_data_p.a_int_array1d[l5] == l2)
											f_boolean = false;

									for (int k6 = 0; k6 < a_data_p.I_int; k6++)
										if (a_data_p.b_int_array1d[k6] == l2)
											f_boolean = false;

									for (int j7 = 0; j7 < a_data_p.J_int; j7++)
										if (a_data_p.c_int_array1d[j7] == l2)
											f_boolean = false;

									for (int i8 = 0; i8 < a_data_p.K_int; i8++)
										if (a_data_p.d_int_array1d[i8] == l2)
											f_boolean = false;

									for (int l8 = 0; l8 < a_data_p.az_int; l8++)
										if (a_data_p.f_java_lang_String_array1d[l8] == a_data_p.b_java_lang_String_array1d[l2])
											f_boolean = false;

									if (f_boolean)
									{
										a_data_p.f_java_lang_String_array1d[a_data_p.az_int] = a_data_p.b_java_lang_String_array1d[l2];
										a_data_p.az_int++;
									}
								}
							}
							j3++;
						}

					}

				}

				for (int i3 = 0; i3 < a_data_p.az_int; i3++)
				{
					for (int k3 = 0; k3 < 120; k3++)
						if (a_data_p.f_java_lang_String_array1d[i3] == a_data_p.b_java_lang_String_array1d[k3])
							if (a_data_p.f_byte_array1d[k3] == 3 || a_data_p.f_byte_array1d[k3] == 5 || a_data_p.f_byte_array1d[k3] == 2)
							{
								if (byte0 == 1 && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[17]))
								{
									a_data_p.e_java_lang_String_array1d[a_data_p.ay] = a_data_p.f_java_lang_String_array1d[i3];
									a_data_p.ay++;
								}
								if (byte0 == 2 && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[17]) && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[9]))
								{
									a_data_p.e_java_lang_String_array1d[a_data_p.ay] = a_data_p.f_java_lang_String_array1d[i3];
									a_data_p.ay++;
								}
								if (byte0 == 3 && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[17]) && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[9]) && !a_data_p.f_java_lang_String_array1d[i3].equals(a_data_p.b_java_lang_String_array1d[10]))
								{
									a_data_p.e_java_lang_String_array1d[a_data_p.ay] = a_data_p.f_java_lang_String_array1d[i3];
									a_data_p.ay++;
								}
							} else
							{
								a_data_p.d_java_lang_String_array1d[a_data_p.ax] = a_data_p.f_java_lang_String_array1d[i3];
								a_data_p.ax++;
							}

				}

				a_data_p.aA = false;
			}
			a_data_p.at = 0;
			if (a_data_p.aB_boolean)
			{
				a_data_p.at = a_data_p.ay;
				if (a_data_p.at > a_data_p.as)
					a_data_p.at = a_data_p.as;
				for (int i2 = a_data_p.au; i2 < a_data_p.at + a_data_p.au; i2++)
				{
					if (i2 == a_data_p.y)
						t = 0xffffff;
					else
						t = 39423;
					StringBuffer stringbuffer1 = (new StringBuffer()).append(a_data_p.e_java_lang_String_array1d[i2]);
					if (a_data_p.hasPointerEvents())
						a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 52 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 4, t, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
					else
						a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer1, data.k.a() >> 1, 40 + a_data_p.aI * (i2 - a_data_p.au) + a_data_p.aI / 2 + 8, t, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				}

			} else
			{
				a_data_p.at = a_data_p.ax;
				if (a_data_p.at > a_data_p.as)
					a_data_p.at = a_data_p.as;
				for (int j2 = a_data_p.au; j2 < a_data_p.at + a_data_p.au; j2++)
				{
					if (j2 == a_data_p.y)
						t = 0xffffff;
					else
						t = 39423;
					StringBuffer stringbuffer2 = new StringBuffer(a_data_p.d_java_lang_String_array1d[j2]);
					if (a_data_p.hasPointerEvents())
						a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer2, data.k.a() >> 1, 52 + a_data_p.aI * (j2 - a_data_p.au) + a_data_p.aI / 2 + 4, t, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
					else
						a_data_p.a_data_ac.a(((k) (a_data_p)).a, stringbuffer2, data.k.a() >> 1, 40 + a_data_p.aI * (j2 - a_data_p.au) + a_data_p.aI / 2 + 4, t, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
				}

			}
		}
		if (a_data_p.hasPointerEvents())
		{
			if (a_data_p.h_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003b, (data.k.a() >> 1) - 12, 40);
			else
			if (a_data_p.au > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0039, (data.k.a() >> 1) - 12, 40);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003d, (data.k.a() >> 1) - 12, 40);
			if (a_data_p.i)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003c, (data.k.a() >> 1) - 12, i1);
			else
			if (a_data_p.aB_boolean)
			{
				if (a_data_p.ay > a_data_p.as && a_data_p.au != a_data_p.ay - a_data_p.as)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, (data.k.a() >> 1) - 12, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
			} else
			if (a_data_p.ax > a_data_p.as && a_data_p.au != a_data_p.ax - a_data_p.as)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003a, (data.k.a() >> 1) - 12, i1);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa003e, (data.k.a() >> 1) - 12, i1);
		} else
		{
			if (a_data_p.h_boolean)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002f, (data.k.a() >> 1) - 8, 32);
			else
			if (a_data_p.au > 0)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002d, (data.k.a() >> 1) - 8, 32);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0031, (data.k.a() >> 1) - 8, 32);
			if (a_data_p.i)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0030, (data.k.a() >> 1) - 8, i1);
			else
			if (a_data_p.aB_boolean)
			{
				if (a_data_p.ay > a_data_p.as && a_data_p.au != a_data_p.ay - a_data_p.as)
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002e, (data.k.a() >> 1) - 8, i1);
				else
					a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
			} else
			if (a_data_p.ax > a_data_p.as && a_data_p.au != a_data_p.ax - a_data_p.as)
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa002e, (data.k.a() >> 1) - 8, i1);
			else
				a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xa0032, (data.k.a() >> 1) - 8, i1);
		}
		if (a_data_p.n_long > 500L)
		{
			if (a_data_p.h_boolean)
				a_data_p.h_boolean = false;
			if (a_data_p.i)
				a_data_p.i = false;
		}
	}

	public final void b(int i1)
	{
		if (a_data_p.aw_boolean)
		{
			a_data_p.aw_boolean = false;
			((k) (a_data_p)).a.setColor(13158);
			((k) (a_data_p)).a.fillRect(0, 0, data.k.a(), data.k.b());
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(i1), data.k.a() / 2, data.k.b() / 3, 0xffffff, 65, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(115), a_data_p.bb, a_data_p.bc, 0xffffff, 0x40 | a_data_p.ba | 0x100, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
			a_data_p.a_data_ac.a(((k) (a_data_p)).a, a_data_p.a_data_ac.a(116), a_data_p.bd, a_data_p.be, 0xffffff, 328, 0, 1, 8, a_data_p.aJ, data.k.a(), data.k.b(), 0, 0);
		}
	}
}
