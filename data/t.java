// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;


// Referenced classes of package data:
//			e, k, n, p, 
//			z

public final class t
{

	private p a_data_p;
	private e a_data_e;
	private byte a_byte_array1d[];
	private int a_int;

	public t(p p1)
	{
		a_data_e = e.a();
		a_int = 0;
		a_data_p = p1;
	}

	public final void a(int i)
	{
		byte abyte0[];
		(abyte0 = new byte[1])[0] = (byte)i;
		try
		{
			a_data_e.a("lang", 0, abyte0.length, abyte0);
			return;
		}
		catch (z )
		{
			return;
		}
	}

	public final int a()
	{
		byte abyte0[] = null;
		try
		{
			abyte0 = a_data_e.a("lang", 0);
		}
		catch (z ) { }
		byte byte0;
		if (abyte0 != null)
			byte0 = abyte0[0];
		else
			byte0 = 0;
		return byte0;
	}

	public final void a(boolean flag)
	{
		byte abyte0[] = new byte[1];
		int i;
		if (flag)
			i = 1;
		else
			i = 0;
		abyte0[0] = (byte)i;
		try
		{
			a_data_e.a("daylightSaving", 1, abyte0.length, abyte0);
			return;
		}
		catch (z )
		{
			return;
		}
	}

	public final boolean a()
	{
		byte abyte0[] = null;
		try
		{
			abyte0 = a_data_e.a("daylightSaving", 1);
		}
		catch (z ) { }
		byte byte0;
		if (abyte0 != null)
			byte0 = abyte0[0];
		else
			byte0 = 1;
		boolean flag;
		if (byte0 == 1)
			flag = true;
		else
			flag = false;
		return flag;
	}

	public final void b(int i)
	{
		byte abyte0[];
		(abyte0 = new byte[1])[0] = (byte)i;
		try
		{
			a_data_e.a("days", 2, abyte0.length, abyte0);
			return;
		}
		catch (z )
		{
			return;
		}
	}

	public final int b()
	{
		byte abyte0[] = null;
		try
		{
			abyte0 = a_data_e.a("days", 2);
		}
		catch (z ) { }
		byte byte0;
		if (abyte0 != null)
			byte0 = abyte0[0];
		else
			byte0 = 1;
		return byte0;
	}

	public final void a()
	{
		a_int = 70 + a_data_p.aB + a_data_p.av_int + a_data_p.aw + a_data_p.s.length * 20 + a_data_p.r.length * 20 + a_data_p.a_int_array1d.length + a_data_p.b_int_array1d.length + a_data_p.c_int_array1d.length + a_data_p.d_int_array1d.length;
		a_byte_array1d = new byte[a_int];
		a_int = 0;
		a_byte_array1d[a_int++] = (byte)a_data_p.ab;
		a_byte_array1d[a_int++] = (byte)a_data_p.ac;
		if (a_data_p.ad < 0)
		{
			a_byte_array1d[a_int++] = 1;
			a_data_p.ad = -a_data_p.ad;
			a_byte_array1d[a_int++] = (byte)a_data_p.ad;
		} else
		{
			a_byte_array1d[a_int++] = 0;
			a_byte_array1d[a_int++] = (byte)a_data_p.ad;
		}
		if (a_data_p.ae < 0)
		{
			a_byte_array1d[a_int++] = 1;
			a_data_p.ae = -a_data_p.ae;
			a_byte_array1d[a_int++] = (byte)a_data_p.ae;
		} else
		{
			a_byte_array1d[a_int++] = 0;
			a_byte_array1d[a_int++] = (byte)a_data_p.ae;
		}
		a_byte_array1d[a_int++] = (byte)a_data_p.Z;
		a_byte_array1d[a_int++] = (byte)a_data_p.aa;
		a_byte_array1d[a_int++] = (byte)a_data_p.aB;
		for (int i = 0; i < a_data_p.aB; i++)
			a_byte_array1d[a_int++] = (byte)a_data_p.q[i];

		for (int j = 0; j < a_data_p.aB; j++)
		{
			for (int l = 0; l < a_data_p.b_java_lang_String_array1d.length; l++)
				if (a_data_p.m[j] == (byte)l)
					a_byte_array1d[a_int++] = (byte)l;

		}

		a_byte_array1d[a_int++] = (byte)a_data_p.av_int;
		for (int i1 = 0; i1 < a_data_p.av_int; i1++)
			a_byte_array1d[a_int++] = (byte)a_data_p.g_int_array1d[i1];

		for (int j1 = 0; j1 < a_data_p.av_int; j1++)
		{
			for (int k1 = 0; k1 < a_data_p.b_java_lang_String_array1d.length; k1++)
				if (a_data_p.a_byte_array1d[j1] == (byte)k1)
					a_byte_array1d[a_int++] = (byte)k1;

		}

		a_byte_array1d[a_int++] = (byte)a_data_p.aw;
		for (int l1 = 0; l1 < a_data_p.aw; l1++)
			a_byte_array1d[a_int++] = (byte)a_data_p.h[l1];

		for (int i2 = 0; i2 < a_data_p.aw; i2++)
		{
			for (int j2 = 0; j2 < a_data_p.b_java_lang_String_array1d.length; j2++)
				if (a_data_p.a_java_lang_String_array1d[i2].equals(a_data_p.b_java_lang_String_array1d[j2]))
					a_byte_array1d[a_int++] = (byte)j2;

		}

		a_byte_array1d[a_int++] = (byte)(int)a_data_p.a_float;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.b_float;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.c_float;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.e_float;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.f_float;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.g_float;
		a_byte_array1d[a_int++] = (byte)a_data_p.L;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.K_long;
		a_byte_array1d[a_int++] = (byte)(int)a_data_p.J_long;
		if (a_data_p.f_int_array1d[17] == 0x60003)
			a_byte_array1d[a_int++] = 17;
		else
		if (a_data_p.f_int_array1d[17] == 0x60000)
			a_byte_array1d[a_int++] = 9;
		else
		if (a_data_p.f_int_array1d[17] == 0x60001)
			a_byte_array1d[a_int++] = 10;
		for (int k2 = 0; k2 < a_data_p.s.length; k2++)
			a(a_data_p.s[k2]);

		a_byte_array1d[a_int++] = (byte)a_data_p.aD;
		a_byte_array1d[a_int++] = (byte)a_data_p.c_int;
		for (int l2 = 0; l2 < a_data_p.r.length; l2++)
			a(a_data_p.r[l2]);

		a_byte_array1d[a_int++] = (byte)a_data_p.aC;
		a_byte_array1d[a_int++] = (byte)a_data_p.ap_int;
		if (a_data_p.T)
		{
			a_data_p.b_long = a_data_p.P + 180 + 1;
		} else
		{
			for (int i3 = 0; i3 < a_data_p.l.length; i3++)
				if (a_data_p.l[i3] == 85 || a_data_p.l[i3] == 95)
					a_data_p.b_long = i3;

		}
		if (a_data_p.b_long == 14925L)
			a_data_p.b_long = 14926L;
		a(a_data_p.b_long);
		if (a_data_p.T)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		for (int j3 = 0; j3 < a_data_p.a_int_array1d.length; j3++)
			a_byte_array1d[a_int++] = (byte)a_data_p.a_int_array1d[j3];

		for (int k3 = 0; k3 < a_data_p.b_int_array1d.length; k3++)
			a_byte_array1d[a_int++] = (byte)a_data_p.b_int_array1d[k3];

		for (int l3 = 0; l3 < a_data_p.c_int_array1d.length; l3++)
			a_byte_array1d[a_int++] = (byte)a_data_p.c_int_array1d[l3];

		for (int i4 = 0; i4 < a_data_p.d_int_array1d.length; i4++)
			a_byte_array1d[a_int++] = (byte)a_data_p.d_int_array1d[i4];

		a_byte_array1d[a_int++] = (byte)a_data_p.H;
		a_byte_array1d[a_int++] = (byte)a_data_p.I;
		a_byte_array1d[a_int++] = (byte)a_data_p.J_int;
		a_byte_array1d[a_int++] = (byte)a_data_p.K_int;
		a_byte_array1d[a_int++] = (byte)a_data_p.D;
		a_byte_array1d[a_int++] = (byte)a_data_p.E;
		a_byte_array1d[a_int++] = (byte)a_data_p.F;
		a_byte_array1d[a_int++] = (byte)a_data_p.G;
		if (a_data_p.aj)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.ak)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.al)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.am)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.an)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.ao)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.ap_boolean)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.aq)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.ar)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.as)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.at)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.au)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		if (a_data_p.av_boolean)
			a_byte_array1d[a_int++] = 1;
		else
			a_byte_array1d[a_int++] = 0;
		a_byte_array1d[a_int++] = (byte)a_data_p.a_data_n.a;
		a(a_data_p.a_long);
		try
		{
			a_data_e.a("RobinsonSave_1", 3, a_byte_array1d.length, a_byte_array1d);
		}
		catch (z ) { }
		a_data_p.b_boolean = true;
	}

	private void a(long l)
	{
		a_byte_array1d[a_int++] = (byte)(int)(l & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 7 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 14 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 21 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 28 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 35 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 42 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 49 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 56 & 127L);
		a_byte_array1d[a_int++] = (byte)(int)(l >> 63 & 1L);
	}

	private long a()
	{
		long l;
		return l = a_byte_array1d[a_int++] + (a_byte_array1d[a_int++] << 7) + (a_byte_array1d[a_int++] << 14) + (a_byte_array1d[a_int++] << 21) + (a_byte_array1d[a_int++] << 28) + (a_byte_array1d[a_int++] << 35) + (a_byte_array1d[a_int++] << 42) + (a_byte_array1d[a_int++] << 49) + (a_byte_array1d[a_int++] << 56) + (a_byte_array1d[a_int++] << 63);
	}

	public final void a(boolean flag, boolean flag1)
	{
		try
		{
			a_byte_array1d = a_data_e.a("RobinsonSave_1", 3);
			flag1 = false;
		}
		catch (z )
		{
			flag1 = true;
		}
		a_data_p.d_boolean = a_data_p.e_boolean = flag1;
		if (!flag1)
		{
			a_int = 0;
			a_data_p.ab = a_byte_array1d[a_int++];
			a_data_p.ac = a_byte_array1d[a_int++];
			if (a_data_p.ab < 0)
			{
				int i = 128 + a_data_p.ab;
				a_data_p.ab = 128 + i;
			}
			if (a_data_p.ac < 0)
			{
				int j = 128 + a_data_p.ac;
				a_data_p.ac = 128 + j;
			}
			if (a_byte_array1d[a_int++] == 1)
			{
				a_data_p.ad = a_byte_array1d[a_int++];
				a_data_p.ad = -a_data_p.ad;
			} else
			{
				a_data_p.ad = a_byte_array1d[a_int++];
			}
			if (a_byte_array1d[a_int++] == 1)
			{
				a_data_p.ae = a_byte_array1d[a_int++];
				a_data_p.ae = -a_data_p.ae;
			} else
			{
				a_data_p.ae = a_byte_array1d[a_int++];
			}
			a_data_p.Z = a_byte_array1d[a_int++];
			a_data_p.aa = a_byte_array1d[a_int++];
			if (a_data_p.Z < 0)
			{
				int l = 128 + a_data_p.Z;
				a_data_p.Z = 128 + l;
			}
			if (a_data_p.aa < 0)
			{
				int i1 = 128 + a_data_p.aa;
				a_data_p.aa = 128 + i1;
			}
			a_data_p.aB = a_byte_array1d[a_int++];
			for (int j1 = 0; j1 < a_data_p.aB; j1++)
				a_data_p.q[j1] = a_byte_array1d[a_int++];

			for (int k1 = 0; k1 < a_data_p.aB; k1++)
			{
				int l1 = a_byte_array1d[a_int++];
				a_data_p.m[k1] = (byte)l1;
			}

			a_data_p.av_int = a_byte_array1d[a_int++];
			for (int i2 = 0; i2 < a_data_p.av_int; i2++)
				a_data_p.g_int_array1d[i2] = a_byte_array1d[a_int++];

			for (int j2 = 0; j2 < a_data_p.av_int; j2++)
			{
				int k2 = a_byte_array1d[a_int++];
				a_data_p.a_byte_array1d[j2] = (byte)k2;
			}

			a_data_p.aw = a_byte_array1d[a_int++];
			for (int l2 = 0; l2 < a_data_p.aw; l2++)
				a_data_p.h[l2] = a_byte_array1d[a_int++];

			for (int i3 = 0; i3 < a_data_p.aw; i3++)
			{
				byte byte0 = a_byte_array1d[a_int++];
				a_data_p.a_java_lang_String_array1d[i3] = a_data_p.b_java_lang_String_array1d[byte0];
			}

			a_data_p.a_float = a_byte_array1d[a_int++];
			a_data_p.b_float = a_byte_array1d[a_int++];
			a_data_p.c_float = a_byte_array1d[a_int++];
			a_data_p.e_float = a_byte_array1d[a_int++];
			a_data_p.f_float = a_byte_array1d[a_int++];
			a_data_p.g_float = a_byte_array1d[a_int++];
			a_data_p.L = a_byte_array1d[a_int++];
			a_data_p.d_float = (k.a() / 3 - 16) / 1;
			a_data_p.c_long = a_byte_array1d[a_int++];
			a_data_p.d_long = a_byte_array1d[a_int++];
			byte byte1 = a_byte_array1d[a_int++];
			a_data_p.f_int_array1d[17] = a_data_p.f_int_array1d[byte1];
			a_data_p.c_java_lang_String_array1d[17] = a_data_p.c_java_lang_String_array1d[byte1];
			a_data_p.b_java_lang_String_array1d[17] = a_data_p.b_java_lang_String_array1d[byte1];
			for (int j3 = 0; j3 < a_data_p.s.length; j3++)
				a_data_p.s[j3] = (int)a();

			a_data_p.aD = a_byte_array1d[a_int++];
			a_data_p.c_int = a_byte_array1d[a_int++];
			for (int k3 = 0; k3 < a_data_p.r.length; k3++)
				a_data_p.r[k3] = (int)a();

			a_data_p.aC = a_byte_array1d[a_int++];
			a_data_p.ap_int = a_byte_array1d[a_int++];
			a_data_p.b_long = a();
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.T = true;
			else
				a_data_p.T = false;
			for (int l3 = 0; l3 < a_data_p.a_int_array1d.length; l3++)
				a_data_p.a_int_array1d[l3] = a_byte_array1d[a_int++];

			for (int i4 = 0; i4 < a_data_p.b_int_array1d.length; i4++)
				a_data_p.b_int_array1d[i4] = a_byte_array1d[a_int++];

			for (int j4 = 0; j4 < a_data_p.c_int_array1d.length; j4++)
				a_data_p.c_int_array1d[j4] = a_byte_array1d[a_int++];

			for (int k4 = 0; k4 < a_data_p.d_int_array1d.length; k4++)
				a_data_p.d_int_array1d[k4] = a_byte_array1d[a_int++];

			a_data_p.H = a_byte_array1d[a_int++];
			a_data_p.I = a_byte_array1d[a_int++];
			a_data_p.J_int = a_byte_array1d[a_int++];
			a_data_p.K_int = a_byte_array1d[a_int++];
			a_data_p.D = a_byte_array1d[a_int++];
			a_data_p.E = a_byte_array1d[a_int++];
			a_data_p.F = a_byte_array1d[a_int++];
			a_data_p.G = a_byte_array1d[a_int++];
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.aj = true;
			else
				a_data_p.aj = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.ak = true;
			else
				a_data_p.ak = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.al = true;
			else
				a_data_p.al = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.am = true;
			else
				a_data_p.am = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.an = true;
			else
				a_data_p.an = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.ao = true;
			else
				a_data_p.ao = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.ap_boolean = true;
			else
				a_data_p.ap_boolean = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.aq = true;
			else
				a_data_p.aq = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.ar = true;
			else
				a_data_p.ar = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.as = true;
			else
				a_data_p.as = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.at = true;
			else
				a_data_p.at = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.au = true;
			else
				a_data_p.au = false;
			if (a_byte_array1d[a_int++] == 1)
				a_data_p.av_boolean = true;
			else
				a_data_p.av_boolean = false;
			a_data_p.a_data_n.a = a_byte_array1d[a_int++];
			a_data_p.a_long = a();
			return;
		} else
		{
			a_data_p.Z = 8;
			a_data_p.aa = 148;
			a_data_p.ab = a_data_p.Z - a_data_p.N / 2;
			a_data_p.ac = a_data_p.aa - a_data_p.O / 2;
			return;
		}
	}
}
