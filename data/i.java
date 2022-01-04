// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Random;

// Referenced classes of package data:
//			g, k, p, w

public final class i
{

	public byte a_byte;
	public int a_int;
	public int b_int;
	public int c;
	public int d;
	public int e;
	public int a_int_array1d[];
	public int b_int_array1d[];
	public int f;
	public int g;
	public int h;
	public boolean a_boolean;
	public boolean b_boolean;
	private Random a_java_util_Random;
	private p a_data_p;

	public i(p p1, byte byte0, int j, int l, int i1, int ai[], int ai1[])
	{
		a_int_array1d = new int[3];
		b_int_array1d = new int[3];
		a_boolean = true;
		b_boolean = true;
		a_java_util_Random = new Random();
		a_data_p = p1;
		a_byte = byte0;
		a_int = j;
		b_int = l;
		c = p1.M >> 1;
		d = p1.M >> 1;
		switch (i1)
		{
		case 1: // '\001'
			e = p1.aj / 6;
			break;

		case 2: // '\002'
			e = p1.aj / 5;
			break;

		case 3: // '\003'
			e = p1.aj / 4;
			break;

		case 4: // '\004'
			e = p1.aj / 3;
			break;

		case 5: // '\005'
			e = p1.aj / 2;
			break;
		}
		a_int_array1d = ai;
		b_int_array1d = ai1;
		f = 0;
		b();
	}

	public final void a()
	{
		if (Math.abs(a_int - a_data_p.Z) <= 2 && Math.abs(b_int - a_data_p.aa) <= 2)
		{
			g = a_data_p.Z - a_int;
			h = a_data_p.aa - b_int;
			a_boolean = true;
			b_boolean = true;
		}
		if (a_boolean)
			if (g > 0)
			{
				if (c < a_data_p.M - e)
				{
					g -= e;
					c += e;
				} else
				{
					a_boolean = a_int + 1 < 180 && a_data_p.k[b_int * 180 + a_int + 1] >= 5 && a_data_p.k[b_int * 180 + a_int + 1] <= 6 && a_data_p.a_data_g.e(b_int * 180 + a_int + 1, 1) && a_data_p.a_data_g.d(b_int * 180 + a_int + 1, 1) && a_data_p.a_data_g.c(b_int * 180 + a_int + 1, 1) && (a_int + 1 != a_data_p.Z || b_int != a_data_p.aa);
					if (a_boolean)
					{
						g -= e;
						c = (c + e) - a_data_p.M;
						a_data_p.l[b_int * 180 + a_int] = 0;
						if (a_int < 179)
							a_int++;
						a_data_p.l[b_int * 180 + a_int] = a_byte;
					}
				}
				if (g <= 0)
					a_boolean = false;
			} else
			{
				if (c > 0)
				{
					g += e;
					c -= e;
				} else
				{
					a_boolean = a_int - 2 > 0 && a_data_p.k[(b_int * 180 + a_int) - 1] >= 5 && a_data_p.k[(b_int * 180 + a_int) - 1] <= 6 && a_data_p.a_data_g.e((b_int * 180 + a_int) - 1, 0) && a_data_p.a_data_g.d((b_int * 180 + a_int) - 1, 0) && a_data_p.a_data_g.c((b_int * 180 + a_int) - 1, 0) && (a_int - 1 != a_data_p.Z || b_int != a_data_p.aa);
					if (a_boolean)
					{
						g += e;
						c = (c - e) + a_data_p.M;
						a_data_p.l[b_int * 180 + a_int] = 0;
						if (a_int > 0)
							a_int--;
						a_data_p.l[b_int * 180 + a_int] = a_byte;
					}
				}
				if (g > 0)
					a_boolean = false;
			}
		if (b_boolean)
			if (h > 0)
			{
				if (d < a_data_p.M - e)
				{
					h -= e;
					d += e;
				} else
				{
					b_boolean = b_int + 1 < 180 && a_data_p.k[b_int * 180 + a_int + 180] >= 5 && a_data_p.k[b_int * 180 + a_int + 180] <= 6 && a_data_p.a_data_g.e(b_int * 180 + a_int + 180, 3) && a_data_p.a_data_g.d(b_int * 180 + a_int + 180, 3) && a_data_p.a_data_g.c(b_int * 180 + a_int + 180, 3) && (a_int != a_data_p.Z || b_int + 1 != a_data_p.aa);
					if (b_boolean)
					{
						h -= e;
						d = (d + e) - a_data_p.M;
						a_data_p.l[b_int * 180 + a_int] = 0;
						if (b_int < 179)
							b_int++;
						a_data_p.l[b_int * 180 + a_int] = a_byte;
					}
				}
				if (h <= 0)
					b_boolean = false;
			} else
			{
				if (d > 0)
				{
					h += e;
					d -= e;
				} else
				{
					b_boolean = b_int - 1 > 0 && a_data_p.k[(b_int * 180 + a_int) - 180] >= 5 && a_data_p.k[(b_int * 180 + a_int) - 180] <= 6 && a_data_p.a_data_g.e((b_int * 180 + a_int) - 180, 2) && a_data_p.a_data_g.d((b_int * 180 + a_int) - 180, 2) && a_data_p.a_data_g.c((b_int * 180 + a_int) - 180, 2) && (a_int != a_data_p.Z || b_int - 1 != a_data_p.aa);
					if (b_boolean)
					{
						h += e;
						d = (d - e) + a_data_p.M;
						a_data_p.l[b_int * 180 + a_int] = 0;
						if (b_int > 0)
							b_int--;
						a_data_p.l[b_int * 180 + a_int] = a_byte;
					}
				}
				if (h > 0)
					b_boolean = false;
			}
		if (!a_boolean && !b_boolean)
		{
			b();
			a_boolean = true;
			b_boolean = true;
		}
		if (Math.abs(a_int - a_data_p.Z) <= 1 && Math.abs(b_int - a_data_p.aa) <= 1)
		{
			a_data_p.c = 0.0F;
			a_data_p.aO = true;
		}
	}

	public final void a(int j, int l)
	{
		if (g > 0 && a_boolean || g <= 0 && !a_boolean)
		{
			if (f < 2)
				a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[0], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
			if (f < 4)
				a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[1], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
				a_data_p.a_data_w.a(a_data_p.a(), b_int_array1d[2], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			if (f < 3)
				a_data_p.a_data_w.a(a_data_p.a(), 0x90009, ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
				a_data_p.a_data_w.a(a_data_p.a(), 0x9000a, ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
		} else
		{
			if (f < 2)
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[0], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
			if (f < 4)
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[1], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
				a_data_p.a_data_w.a(a_data_p.a(), a_int_array1d[2], ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			if (f < 3)
				a_data_p.a_data_w.a(a_data_p.a(), 0x90007, ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
			else
				a_data_p.a_data_w.a(a_data_p.a(), 0x90008, ((a_data_p.aM + a_data_p.M * j) - a_data_p.M) + a_data_p.U + c, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V + d);
		}
		if (++f == 6)
			f = 0;
	}

	public final void b()
	{
		g = a_data_p.M * 10 - a_data_p.M * (Math.abs(a_java_util_Random.nextInt()) % 20);
		h = a_data_p.M * 10 - a_data_p.M * (Math.abs(a_java_util_Random.nextInt()) % 20);
	}
}
