// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.util.Vector;

// Referenced classes of package data:
//			aa, ac, k, p, 
//			v, x

public final class j
{

	private p a_data_p;
	private int f;
	public int a_int;
	public int b_int;
	public int c_int;
	public int d_int;
	public boolean a_boolean;
	public int e;
	public boolean b_boolean;
	private boolean c_boolean;
	private boolean d_boolean;
	private int g;

	public j(p p1)
	{
		f = 0;
		a_int = 0;
		b_int = 0;
		c_int = -1;
		d_int = -1;
		a_boolean = false;
		e = -1;
		b_boolean = false;
		c_boolean = false;
		d_boolean = false;
		a_data_p = p1;
	}

	private void a()
	{
		if (a_data_p.Z < a_data_p.N / 2)
			a_int = (a_data_p.N / 2 + 1) * a_data_p.M - a_data_p.M / 2 - (a_data_p.N / 2 - a_data_p.Z) * a_data_p.M;
		else
		if (a_data_p.Z > 179 - a_data_p.N / 2)
			a_int = ((a_data_p.N / 2 + 1) * a_data_p.M - a_data_p.M / 2) + (a_data_p.Z - (179 - a_data_p.N / 2)) * a_data_p.M;
		else
			a_int = (a_data_p.N / 2 + 1) * a_data_p.M - a_data_p.M / 2;
		if (a_data_p.aa < a_data_p.O / 2)
		{
			b_int = ((a_data_p.O / 2 + 1) * a_data_p.M + a_data_p.M / 2) - (a_data_p.O / 2 - a_data_p.aa) * a_data_p.M;
			return;
		}
		if (a_data_p.aa > 179 - a_data_p.O / 2)
		{
			b_int = (a_data_p.O / 2 + 1) * a_data_p.M + a_data_p.M / 2 + (a_data_p.aa - (179 - a_data_p.O / 2)) * a_data_p.M;
			return;
		} else
		{
			b_int = (a_data_p.O / 2 + 1) * a_data_p.M + a_data_p.M / 2;
			return;
		}
	}

	public final void a(int i, int l)
	{
		if (a_data_p.k == 2 || a_data_p.k == 0 && a_data_p.a_data_v.a == -2 && !a_data_p.ax)
		{
			c_int = i;
			d_int = l;
			b();
		}
	}

	public final void b(int i, int l)
	{
		c_int = -1;
		d_int = -1;
		a_boolean = false;
		c_boolean = false;
		if (d_boolean && a_data_p.m == 7 && a_data_p.q == 0)
		{
			e = 5;
			d_boolean = false;
		}
	}

	public final void c(int i, int l)
	{
		if ((a_data_p.k == 2 || a_data_p.k == 0 && a_data_p.a_data_v.a == -2 && !a_data_p.ax) && a_boolean && a_data_p.m == 7 && a_data_p.q == 0)
		{
			c_boolean = true;
			d_boolean = true;
			c_int = i;
			d_int = l;
			b();
		}
	}

	private void b()
	{
		if (!c_boolean && c_int > a_data_p.bf && c_int < a_data_p.bg && d_int > a_data_p.bh && d_int < a_data_p.bi)
		{
			e = 1;
			return;
		}
		if (!c_boolean && c_int > a_data_p.bj && c_int < a_data_p.bk && d_int > a_data_p.bl && d_int < a_data_p.bm)
		{
			e = 3;
			return;
		}
label0:
		switch (a_data_p.l)
		{
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		default:
			break;

		case 0: // '\0'
			return;

		case 1: // '\001'
			byte byte0 = 2;
			if (c_int > k.a() / 6 && c_int < k.a() / 6 + 2 * a_data_p.aK)
			{
				if (a_data_p.b_boolean)
					byte0 = 1;
				for (int i = byte0; i < a_data_p.b_int + 1; i++)
					if (d_int > (k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i) - a_data_p.aR && d_int < ((k.b() / a_data_p.b_int + 1 + ((a_data_p.aP + a_data_p.aL) - a_data_p.aQ) * i) - a_data_p.aR) + a_data_p.aP)
					{
						a_data_p.r = i - 1;
						e = 1;
						return;
					}

				return;
			}
			break;

		case 2: // '\002'
			if (c_int <= k.a() / 3 || c_int >= (k.a() / 3) * 2)
				break;
			if (d_int < k.b() >> 1)
			{
				a_data_p.A = 0;
				e = 5;
				return;
			}
			if (d_int > k.b() >> 1)
			{
				a_data_p.A = 1;
				e = 5;
				return;
			}
			break;

		case 3: // '\003'
			boolean flag = false;
			boolean flag1 = false;
			int l = 38;
			boolean flag2 = false;
			if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24)
				if (d_int >= 21 && d_int <= 45)
					e = 2;
				else
				if (a_data_p.g < a_data_p.a_java_util_Vector.size() - 1 && d_int >= k.b() - 20 && d_int <= (k.b() - 20) + 24)
					e = 8;
			if (c_int <= 20 || c_int >= k.a() - 40)
				break;
			for (int j1 = ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.f)).intValue(); j1 < ((Integer)a_data_p.a_java_util_Vector.elementAt(a_data_p.g)).intValue(); j1++)
			{
				int i1 = a_data_p.a_data_ac.a(null, a_data_p.a_data_ac.a(33 + j1), 20, l + 5, 0, 20, 0, 1, 8, a_data_p.aJ, k.a() - 40, k.b(), 0, 0);
				f = (i1 - l) / a_data_p.aJ;
				if (d_int >= (i1 - a_data_p.aJ * f - 2) + 4 && d_int <= (i1 - 2) + 4)
				{
					a_data_p.d = j1;
					e = 1;
					return;
				}
				l = i1;
			}

			return;

		case 10: // '\n'
			if (c_int < (k.a() >> 1) - 16 - 5 || c_int > (k.a() >> 1) + 24 + 5)
				break;
			if (d_int > a_data_p.a_data_aa.j && d_int < a_data_p.a_data_aa.j + 24)
			{
				e = 2;
				return;
			}
			if (d_int >= k.b() - 20 && d_int <= (k.b() - 20) + 24)
			{
				e = 8;
				return;
			}
			break;

		case 4: // '\004'
			if (c_int < (k.a() >> 1) - 24 || c_int > (k.a() >> 1) + 24)
				break;
			if (d_int > 21 && d_int < 45)
			{
				e = 2;
				return;
			}
			if (d_int >= k.b() - 20 && d_int <= (k.b() - 20) + 24)
			{
				e = 8;
				return;
			}
			break;

		case 5: // '\005'
			return;

		case 6: // '\006'
			switch (a_data_p.m)
			{
			default:
				break label0;

			case 2: // '\002'
				int k1 = a_data_p.C * 20 + (a_data_p.C - 1) * 6;
				for (int j2 = 0; j2 < a_data_p.C; j2++)
					if (c_int > (((k.a() >> 1) - (k1 >> 1)) + 26 * j2 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2) - 10 && c_int < ((((k.a() >> 1) - (k1 >> 1)) + 26 * j2 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2)) + 10 && d_int > a_data_p.aU - 20)
					{
						e = 5;
						a_data_p.x = j2;
						a_data_p.C = 0;
						return;
					}

				e = 3;
				return;

			case 1: // '\001'
				if (!a_data_p.v_boolean && d_int > 16 && d_int < 40)
					if (c_int < 20)
						e = 4;
					else
					if (c_int > k.a() - 8 - 12)
						e = 6;
				switch (a_data_p.n)
				{
				case 2: // '\002'
				case 6: // '\006'
				default:
					break;

				case 0: // '\0'
					g = 52 + a_data_p.aI * a_data_p.as;
					if (c_int > k.a() / 3 && c_int < (k.a() / 3) * 2)
						if (c_int >= (k.a() >> 1) - 16 && c_int <= (k.a() >> 1) + 16 && d_int > 40 && d_int < 52)
							e = 2;
						else
						if (c_int >= (k.a() >> 1) - 16 && c_int <= (k.a() >> 1) + 24 && d_int > g && d_int < g + 12)
						{
							e = 8;
						} else
						{
							for (int k2 = a_data_p.au; k2 < a_data_p.at + a_data_p.au; k2++)
								if (d_int >= 52 + a_data_p.aI * (k2 - a_data_p.au) + 4 && d_int < 52 + a_data_p.aI * (k2 - a_data_p.au) + 4 + a_data_p.aJ)
								{
									e = 1;
									a_data_p.z = k2;
									a_data_p.aw = true;
									return;
								}

						}
					break;

				case 1: // '\001'
					int l1 = a_data_p.C * 20 + (a_data_p.C - 1) * 6;
					for (int l2 = 0; l2 < a_data_p.C; l2++)
						if (c_int > (((k.a() >> 1) - (l1 >> 1)) + 26 * l2 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2) - 10 && c_int < ((((k.a() >> 1) - (l1 >> 1)) + 26 * l2 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2)) + 10 && d_int > a_data_p.aU - 10 - 10 && d_int < (a_data_p.aU - 10) + 10)
						{
							e = 5;
							a_data_p.x = l2;
							a_data_p.C = 0;
							return;
						}

					e = 3;
					break;

				case 3: // '\003'
					if (a_data_p.v_boolean)
					{
						if (d_int > (32 + (k.b() - 32 - 20 >> 1)) - 32 - 3 && d_int < ((32 + (k.b() - 32 - 20 >> 1)) - 32 - 3) + 16)
						{
							a_data_p.u = 0;
							if (c_int > (k.a() >> 1) - 19 - 21 - 15 && c_int < ((k.a() >> 1) - 19 - 21) + 8)
							{
								e = 4;
								break;
							}
							if (c_int > (k.a() >> 1) + 19 + 14 && c_int < (k.a() >> 1) + 19 + 14 + 8 + 15)
								e = 6;
							break;
						}
						if (d_int > (32 + (k.b() - 32 - 20 >> 1)) - 16 - 1 && d_int < ((32 + (k.b() - 32 - 20 >> 1)) - 16 - 1) + 16)
						{
							a_data_p.u = 1;
							if (c_int > (k.a() >> 1) - 19 - 21 - 15 && c_int < ((k.a() >> 1) - 19 - 21) + 8)
							{
								e = 4;
								break;
							}
							if (c_int > (k.a() >> 1) + 19 + 14 && c_int < (k.a() >> 1) + 19 + 14 + 8 + 15)
								e = 6;
							break;
						}
						if (d_int > 32 + (k.b() - 32 - 20 >> 1) + 1 && d_int < 32 + (k.b() - 32 - 20 >> 1) + 1 + 16)
						{
							a_data_p.u = 2;
							if (c_int > (k.a() >> 1) - 19 - 21 - 15 && c_int < ((k.a() >> 1) - 19 - 21) + 8)
							{
								e = 4;
								break;
							}
							if (c_int > (k.a() >> 1) + 19 + 14 && c_int < (k.a() >> 1) + 19 + 14 + 8 + 15)
								e = 6;
							break;
						}
						if (d_int <= 32 + (k.b() - 32 - 20 >> 1) + 16 + 3 || d_int >= 32 + (k.b() - 32 - 20 >> 1) + 16 + 3 + 16)
							break;
						a_data_p.u = 3;
						if (c_int > (k.a() >> 1) - 19 - 21 - 15 && c_int < ((k.a() >> 1) - 19 - 21) + 8)
						{
							e = 4;
							break;
						}
						if (c_int > (k.a() >> 1) + 19 + 14 && c_int < (k.a() >> 1) + 19 + 14 + 12 + 15)
							e = 6;
						break;
					}
					if (d_int > 32 && d_int < k.b() - 20)
						e = 1;
					break;

				case 4: // '\004'
					g = 52 + a_data_p.aI * a_data_p.as;
					if (c_int <= k.a() / 3 || c_int >= (k.a() / 3) * 2)
						break;
					if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > 40 && d_int < 52)
					{
						e = 2;
						break;
					}
					if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > g && d_int < g + 12)
					{
						e = 8;
						break;
					}
					for (int i3 = a_data_p.au; i3 < a_data_p.at + a_data_p.au; i3++)
						if (d_int >= 52 + a_data_p.aI * (i3 - a_data_p.au) + 4 && d_int < 52 + a_data_p.aI * (i3 - a_data_p.au) + 4 + a_data_p.aJ)
						{
							e = 1;
							a_data_p.v_int = i3;
							a_data_p.aw = true;
							return;
						}

					break;

				case 5: // '\005'
					if (a_data_p.S)
					{
						if (d_int > 140 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e - 8 && d_int < (140 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e) + 8)
						{
							a_data_p.R = 0;
							if (c_int > k.a() / 2 - 16 - 1 - 8 && c_int < (k.a() / 2 - 16 - 1) + 8)
							{
								a_data_p.Q = 0;
								a_data_p.aO = 1;
							} else
							if (c_int > k.a() / 2 - 8 && c_int < k.a() / 2 + 8)
							{
								a_data_p.Q = 60;
								a_data_p.aO = 2;
							} else
							if (c_int > (k.a() / 2 + 16 + 1) - 8 && c_int < k.a() / 2 + 16 + 1 + 8)
							{
								a_data_p.Q = 120;
								a_data_p.aO = 3;
							}
						} else
						if (d_int > 157 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e - 8 && d_int < (157 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e) + 8)
						{
							a_data_p.R = 60;
							if (c_int > k.a() / 2 - 16 - 1 - 8 && c_int < (k.a() / 2 - 16 - 1) + 8)
							{
								a_data_p.Q = 0;
								a_data_p.aO = 4;
							} else
							if (c_int > k.a() / 2 - 8 && c_int < k.a() / 2 + 8)
							{
								a_data_p.Q = 60;
								a_data_p.aO = 5;
							} else
							if (c_int > (k.a() / 2 + 16 + 1) - 8 && c_int < k.a() / 2 + 16 + 1 + 8)
							{
								a_data_p.Q = 120;
								a_data_p.aO = 6;
							}
						} else
						if (d_int > 174 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e - 8 && d_int < (174 - a_data_p.a_data_aa.f - a_data_p.a_data_aa.e) + 8)
						{
							a_data_p.R = 120;
							if (c_int > k.a() / 2 - 16 - 1 - 8 && c_int < (k.a() / 2 - 16 - 1) + 8)
							{
								a_data_p.Q = 0;
								a_data_p.aO = 7;
							} else
							if (c_int > k.a() / 2 - 8 && c_int < k.a() / 2 + 8)
							{
								a_data_p.Q = 60;
								a_data_p.aO = 8;
							} else
							if (c_int > (k.a() / 2 + 16 + 1) - 8 && c_int < k.a() / 2 + 16 + 1 + 8)
							{
								a_data_p.Q = 120;
								a_data_p.aO = 9;
							}
						}
					} else
					if (d_int > 32 && d_int < k.b() - 20)
						e = 1;
					a_data_p.aw = true;
					break;
				}
				return;

			case 0: // '\0'
				a();
				if (c_int < a_int + (3 * a_data_p.M) / 2 && c_int > a_int - (3 * a_data_p.M) / 2 && d_int < b_int + (3 * a_data_p.M) / 2 && d_int > b_int - (3 * a_data_p.M) / 2)
				{
					e = 1;
					return;
				}
				if (c_int > a_int && d_int < b_int + Math.abs(c_int - a_int) && d_int > b_int - Math.abs(c_int - a_int))
				{
					e = 6;
					a_boolean = true;
					return;
				}
				if (c_int < a_int && d_int < b_int + Math.abs(c_int - a_int) && d_int > b_int - Math.abs(c_int - a_int))
				{
					e = 4;
					a_boolean = true;
					return;
				}
				if (d_int > b_int && c_int < a_int + Math.abs(d_int - b_int) && c_int > a_int - Math.abs(d_int - b_int))
				{
					e = 8;
					a_boolean = true;
					return;
				}
				if (d_int < b_int && c_int < a_int + Math.abs(d_int - b_int) && c_int > a_int - Math.abs(d_int - b_int))
				{
					e = 2;
					a_boolean = true;
					return;
				}
				break label0;

			case 3: // '\003'
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24)
				{
					if (d_int > 86 && d_int < 110)
					{
						e = 2;
						return;
					}
					if (d_int > k.b() - 20 - 9 && d_int < (k.b() - 20 - 9) + 24)
					{
						e = 8;
						return;
					}
				}
				e = 3;
				return;

			case 4: // '\004'
				if (c_int <= k.a() / 3 || c_int >= (k.a() / 3) * 2)
					break label0;
				if (d_int < k.b() >> 1)
				{
					a_data_p.t = 0;
					e = 1;
					return;
				}
				if (d_int > k.b() >> 1)
				{
					a_data_p.t = 1;
					e = 1;
					return;
				}
				break label0;

			case 5: // '\005'
				g = 52 + a_data_p.aI * a_data_p.as;
				if (c_int <= k.a() / 3 || c_int >= (k.a() / 3) * 2)
					break label0;
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > 40 && d_int < 52)
				{
					e = 2;
					return;
				}
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > g && d_int < g + 12)
				{
					e = 8;
					return;
				}
				for (int j3 = a_data_p.au; j3 < a_data_p.at + a_data_p.au; j3++)
					if (d_int >= 52 + a_data_p.aI * (j3 - a_data_p.au) + 4 && d_int < 52 + a_data_p.aI * (j3 - a_data_p.au) + 4 + a_data_p.aJ)
					{
						e = 1;
						a_data_p.y = j3;
						a_data_p.aw = true;
						return;
					}

				return;

			case 6: // '\006'
				g = 52 + a_data_p.aI * a_data_p.as;
				if (c_int <= k.a() / 3 || c_int >= (k.a() / 3) * 2)
					break label0;
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > 40 && d_int < 52)
				{
					e = 2;
					return;
				}
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > g && d_int < g + 12)
				{
					e = 8;
					return;
				} else
				{
					e = 5;
					return;
				}

			case 7: // '\007'
				switch (a_data_p.q)
				{
				default:
					break;

				case 0: // '\0'
					if (c_int > (k.a() >> 1) + a_data_p.a_data_x.f && d_int < (k.b() >> 1) + a_data_p.a_data_x.g + Math.abs(c_int - ((k.a() >> 1) + a_data_p.a_data_x.f)) && d_int > ((k.b() >> 1) + a_data_p.a_data_x.g) - Math.abs(c_int - ((k.a() >> 1) + a_data_p.a_data_x.f)))
					{
						e = 6;
						a_boolean = true;
						break;
					}
					if (c_int < (k.a() >> 1) + a_data_p.a_data_x.f && d_int < (k.b() >> 1) + a_data_p.a_data_x.g + Math.abs(c_int - ((k.a() >> 1) + a_data_p.a_data_x.f)) && d_int > ((k.b() >> 1) + a_data_p.a_data_x.g) - Math.abs(c_int - ((k.a() >> 1) + a_data_p.a_data_x.f)))
					{
						e = 4;
						a_boolean = true;
						break;
					}
					if (d_int > (k.b() >> 1) + a_data_p.a_data_x.g && c_int < (k.a() >> 1) + a_data_p.a_data_x.f + Math.abs(d_int - ((k.b() >> 1) + a_data_p.a_data_x.g)) && c_int > ((k.a() >> 1) + a_data_p.a_data_x.f) - Math.abs(d_int - ((k.b() >> 1) + a_data_p.a_data_x.g)))
					{
						e = 8;
						a_boolean = true;
						break;
					}
					if (d_int < (k.b() >> 1) + a_data_p.a_data_x.g && c_int < (k.a() >> 1) + a_data_p.a_data_x.f + Math.abs(d_int - ((k.b() >> 1) + a_data_p.a_data_x.g)) && c_int > ((k.a() >> 1) + a_data_p.a_data_x.f) - Math.abs(d_int - ((k.b() >> 1) + a_data_p.a_data_x.g)))
					{
						e = 2;
						a_boolean = true;
					}
					break;

				case 1: // '\001'
					if (c_int > 0)
						e = 5;
					break;

				case 2: // '\002'
					if (c_int >= k.a() / 2 - 12 && c_int <= k.a() / 2 + 12)
					{
						if (d_int >= k.b() - 2 - 12 - 2 - 24 - 36 && d_int <= (k.b() - 2 - 12 - 2 - 24 - 12) + 24)
						{
							e = 2;
							a_boolean = true;
						} else
						if (d_int >= k.b() - 2 - 24)
						{
							e = 8;
							a_boolean = true;
						}
					} else
					if (d_int >= k.b() - 2 - 12 - 2 - 48)
						if (c_int >= k.a() / 2 - 72 - 2 && c_int <= (k.a() / 2 - 24 - 2) + 12)
						{
							e = 4;
							a_boolean = true;
						} else
						if (c_int >= k.a() / 2 + 12 + 2 && c_int <= k.a() / 2 + 12 + 2 + 36)
						{
							e = 6;
							a_boolean = true;
						}
					if (c_int >= 0 && c_int <= 27 && d_int >= k.b() - 32 - 48 && d_int <= (k.b() - 32) + 32)
						e = 5;
					break;

				case 3: // '\003'
					if (c_int >= k.a() / 2 - 12 && c_int <= k.a() / 2 + 12)
					{
						if (d_int >= k.b() - 2 - 12 - 2 - 24 - 36 && d_int <= (k.b() - 2 - 12 - 2 - 24 - 12) + 24)
						{
							e = 2;
							a_boolean = true;
						} else
						if (d_int >= k.b() - 2 - 24)
						{
							e = 8;
							a_boolean = true;
						}
					} else
					if (d_int >= k.b() - 2 - 12 - 2 - 48)
						if (c_int >= k.a() / 2 - 72 - 2 && c_int <= (k.a() / 2 - 24 - 2) + 12)
						{
							e = 4;
							a_boolean = true;
						} else
						if (c_int >= k.a() / 2 + 12 + 2 && c_int <= k.a() / 2 + 12 + 2 + 36)
						{
							e = 6;
							a_boolean = true;
						}
					if (c_int >= 0 && c_int <= 27 && d_int >= k.b() - 32 - 48 && d_int <= (k.b() - 32) + 32)
						e = 5;
					break;
				}
				return;

			case 8: // '\b'
				switch (a_data_p.p)
				{
				default:
					break;

				case 0: // '\0'
					g = 52 + a_data_p.aI * a_data_p.as;
					if (c_int > k.a() / 3 && c_int < (k.a() / 3) * 2)
						if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > 40 && d_int < 52)
							e = 2;
						else
						if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24 && d_int > g - 12 && d_int < g)
						{
							e = 8;
						} else
						{
							for (int k3 = a_data_p.au; k3 < a_data_p.at + a_data_p.au; k3++)
								if (d_int >= 52 + a_data_p.aI * (k3 - a_data_p.au) + 4 && d_int < 52 + a_data_p.aI * (k3 - a_data_p.au) + 4 + a_data_p.aJ)
								{
									e = 1;
									a_data_p.w = k3;
									a_data_p.aw = true;
									return;
								}

						}
					break;

				case 1: // '\001'
					int i2 = a_data_p.C * 20 + (a_data_p.C - 1) * 6;
					for (int l3 = 0; l3 < a_data_p.C; l3++)
						if (c_int > (((k.a() >> 1) - (i2 >> 1)) + 26 * l3 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2) - 10 && c_int < ((((k.a() >> 1) - (i2 >> 1)) + 26 * l3 + 10) - 26 * (a_data_p.x - a_data_p.aq / 2)) + 10 && d_int > a_data_p.aU - 10 - 10 && d_int < (a_data_p.aU - 10) + 10)
						{
							e = 5;
							a_data_p.x = l3;
							return;
						}

					e = 3;
					break;
				}
				a_data_p.o = true;
				return;

			case 9: // '\t'
				if (c_int >= (k.a() >> 1) - 24 && c_int <= (k.a() >> 1) + 24)
				{
					if (d_int > a_data_p.a_data_aa.j && d_int < a_data_p.a_data_aa.j + 24)
					{
						e = 2;
						return;
					}
					if (d_int >= k.b() - 20 && d_int <= (k.b() - 20) + 24)
					{
						e = 8;
						return;
					}
				}
				e = 1;
				return;

			case 10: // '\n'
				break;
			}
			if (c_int > 0)
				e = 1;
			break;
		}
	}
}
