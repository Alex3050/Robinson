// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.*;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import rs;

// Referenced classes of package data:
//			b, k

public final class ac
{

	private static ac a_data_ac_static = null;
	private byte a_byte;
	private byte a_byte_array1d[];
	private StringBuffer a_java_lang_StringBuffer_array2d[][];
	private int a_int;
	public boolean a_boolean;
	private boolean b_boolean;
	public int a_int_array1d[] = {
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0
	};
	private Vector a_java_util_Vector;
	private Vector b_java_util_Vector;
	private Vector c_java_util_Vector;
	private Vector d_java_util_Vector;
	private int b_int;
	private int c_int;
	private int d_int;
	private boolean c_boolean;
	private static int e;
	public static StringBuffer a_java_lang_StringBuffer_array1d_static[];

	private ac()
	{
		a_int = 0;
		a_boolean = false;
		b_boolean = true;
		b();
	}

	public static final ac a()
	{
		if (k.a())
		{
			if (a_data_ac_static == null)
				a_data_ac_static = new ac();
			return a_data_ac_static;
		} else
		{
			throw new b("Unauthorised operation");
		}
	}

	public final void a(int i)
	{
		if (a_byte != i)
		{
			a(true);
			a_byte = (byte)i;
			a();
		}
	}

	public final int a()
	{
		return 4;
	}

	public final boolean a()
	{
		if (a_byte_array1d[a_int] != -1)
			a(a_int, a_byte_array1d[a_int]);
		a_int++;
		if (a_int == 4)
		{
			a_int = 0;
			return true;
		} else
		{
			return false;
		}
	}

	private void a()
	{
		for (int i = 0; i < 4; i++)
			if (a_byte_array1d[i] != -1)
				a(i, a_byte_array1d[i]);

	}

	public final void a(boolean flag)
	{
		if (a_java_lang_StringBuffer_array2d == null)
			return;
		for (int i = 0; i < 4; i++)
		{
			if (!flag)
				a_byte_array1d[i] = -1;
			if (a_java_lang_StringBuffer_array2d != null && a_java_lang_StringBuffer_array2d[i] != null)
			{
				for (int j = 0; j < a_java_lang_StringBuffer_array2d[i].length; j++)
					a_java_lang_StringBuffer_array2d[i][j] = null;

				a_java_lang_StringBuffer_array2d[i] = null;
			}
		}

		a_java_lang_StringBuffer_array2d = null;
		System.gc();
	}

	public final void b(int i)
	{
		byte byte0;
		if ((byte0 = a_byte_array1d[i]) != -1)
		{
			for (int j = 0; j < a_java_lang_StringBuffer_array2d[byte0].length; j++)
				a_java_lang_StringBuffer_array2d[byte0][j] = null;

			a_java_lang_StringBuffer_array2d[byte0] = null;
			a_byte_array1d[i] = -1;
		}
		System.gc();
	}

	public final StringBuffer a(int i)
	{
		int j = i >> 16;
		int l;
		if ((l = a_byte_array1d[j]) < 0)
			if (a_boolean)
				l = a(j);
			else
				l = a(j, 0);
		return a_java_lang_StringBuffer_array2d[l][i & 0xffff];
	}

	public final int a(int i)
	{
		if (a_byte_array1d[i] > 0)
			return a_byte_array1d[i];
		for (int j = 1; j < 4; j++)
			if (a_java_lang_StringBuffer_array2d == null || a_java_lang_StringBuffer_array2d[j] == null)
				return a(i, j);

		return a(i, 0);
	}

	private int a(int i, int j)
	{
		if (a_java_lang_StringBuffer_array2d == null)
			a_java_lang_StringBuffer_array2d = new StringBuffer[4][];
		for (int k1 = 0; k1 < 4; k1++)
			if (a_byte_array1d[k1] == j)
				a_byte_array1d[k1] = -1;

		try
		{
			int j1 = 9366;
			int l = 0;
			int i1 = 5;
			InputStream inputstream;
			(inputstream = getClass().getResourceAsStream("/data/D0")).skip(0x138b0L);
			if (i == -2)
			{
				l = inputstream.read();
			} else
			{
				inputstream.skip(1 + 27 * i);
				i1 = inputstream.read() | inputstream.read() << 8;
				inputstream.skip(5 * a_byte);
				l = inputstream.read();
				j1 = inputstream.read() | inputstream.read() << 8 | inputstream.read() << 16 | inputstream.read() << 24;
			}
			inputstream.close();
			a_java_lang_StringBuffer_array2d[j] = new StringBuffer[i1];
			if (a_byte == 0 && i >= 0)
			{
				ZHRES(i, j);
			} else
			{
				InputStream inputstream1;
				(inputstream1 = getClass().getResourceAsStream("/data/D" + Integer.toString(l))).skip(j1);
				for (int l1 = 0; l1 < i1; l1++)
				{
					StringBuffer stringbuffer = new StringBuffer();
					int i2;
					while ((i2 = inputstream1.read()) != 0) 
					{
						int j2 = i2 & 0x7f;
						if ((i2 & 0x80) != 0)
						{
							i2 = inputstream1.read();
							j2 |= (i2 & 0x7f) << 7;
							if ((i2 & 0x80) != 0)
								j2 |= inputstream1.read() << 14;
						}
						stringbuffer.append((char)j2);
					}
					a_java_lang_StringBuffer_array2d[j][l1] = stringbuffer;
				}

				inputstream1.close();
			}
		}
		catch (Exception ) { }
		if (i >= 0)
			a_byte_array1d[i] = (byte)j;
		return j;
	}

	private String a(Vector vector, int i)
	{
		return (String)vector.elementAt(i);
	}

	private int a(Vector vector, int i)
	{
		return ((Integer)vector.elementAt(i)).intValue();
	}

	private void a(Vector vector, String s, int i)
	{
		vector.setElementAt(s, i);
	}

	private void a(Vector vector, int i, int j)
	{
		vector.setElementAt(new Integer(i), j);
	}

	private void a(String s, Graphics g, int i, int j, int l, int i1, int j1)
	{
		if (g == null)
			return;
		if ((l & 0x100) != 0)
		{
			g.setColor(j1);
			a(s, g, i, j, l & 0x7f);
			g.setColor(i1);
		}
		g.drawString(s, i, j, l & 0x7f);
	}

	private void a(Graphics g, int i, int j, int l, int i1)
	{
		if (g == null)
		{
			return;
		} else
		{
			g.setColor(i1);
			g.setFont(Font.getFont(i, j, l));
			return;
		}
	}

	private boolean a(String s, int i, int j, int l, int i1)
	{
		c_boolean = false;
		if (s == null)
			return false;
		if (s.length() == 0)
			return false;
		int j1 = a(s, j, l, i1);
		boolean flag = false;
		if (j1 + d_int > c_int)
		{
			flag = true;
			if (s.endsWith(" ") && d_int + a(s.substring(0, s.length() - 1), j, l, i1) <= c_int)
				if (s.length() > 1)
				{
					s = s.substring(0, s.length() - 1);
					flag = false;
				} else
				{
					return false;
				}
			if (flag && a_java_util_Vector.size() > 0)
			{
				int k1 = a_java_util_Vector.size() - 1;
				String s1;
				if ((s1 = a(a_java_util_Vector, k1)).endsWith(" ") && a(d_java_util_Vector, k1) <= c_int)
				{
					s1 = s1.substring(0, s1.length() - 1);
					d_int -= a(d_java_util_Vector, k1);
					a(a_java_util_Vector, s1, k1);
					a(d_java_util_Vector, a(s1, j, a(c_java_util_Vector, k1), i1), k1);
					d_int += a(d_java_util_Vector, k1);
					b_int--;
					c_boolean = true;
				}
			}
		}
		if (s.endsWith(" "))
			b_int++;
		a_java_util_Vector.addElement(s);
		b_java_util_Vector.addElement(new Integer(i));
		c_java_util_Vector.addElement(new Integer(l));
		d_java_util_Vector.addElement(new Integer(a(s, j, l, i1)));
		return flag;
	}

	private int a(String s, int i, int j, int l)
	{
		int i1;
		return i1 = Font.getFont(i, j, l).stringWidth(s) + s.length() * k.g();
	}

	private int a(char c1, char c2)
	{
		if (c2 == '%')
		{
			if (c1 == 'c')
				return -1;
			if (c1 == 'u')
				return -4;
			if (c1 == 'b')
				return -1;
			if (c1 == 'i')
				return -2;
		} else
		{
			if (c1 == 'c' && c2 >= '0' && c2 <= '9')
				return a_int_array1d[c2 - 48];
			if (c1 == 'u')
				return 4;
			if (c1 == 'b')
				return 1;
			if (c1 == 'i')
				return 2;
		}
		return -999;
	}

	public static final int b()
	{
		return e;
	}

	public static final void c(int i)
	{
		e = i;
	}

	private void a(String s, Graphics g, int i, int j, int l)
	{
		for (int i1 = -1; i1 < 2; i1++)
		{
			for (int j1 = -1; j1 < 2; j1++)
				g.drawString(s, i + i1, j + j1, l);

		}

	}

	public final int a(Graphics g, StringBuffer stringbuffer, int i, int j, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2, int i3)
	{
		if (stringbuffer == null)
			return j;
		if ((i1 & 0x7f) == 0)
			i1 = i1 | 0x10 | 4;
		if ((i1 & 2) != 0)
		{
			if ((i1 & 0x200) == 0)
				i1 |= 0x200;
			i1 = (i1 &= -3) | 0x10;
		}
		if ((i1 & 0x200) != 0)
			if ((i1 & 1) != 0)
				i1 = i1 & 0xffffff80 | 0x10 | 1;
			else
			if ((i1 & 8) != 0)
				i1 = i1 & 0xffffff80 | 0x10 | 8;
		if ((i1 & 0x800) != 0)
		{
			if ((i1 & 0x200) != 0)
				j -= i2 / 2;
			a(g, j1, k1, l1, l);
			a(stringbuffer.toString(), g, i, j, i1, l, l2);
			return j + i2;
		}
		a_java_util_Vector = new Vector();
		b_java_util_Vector = new Vector();
		c_java_util_Vector = new Vector();
		d_java_util_Vector = new Vector();
		d_int = 0;
		c_int = j2;
		b_int = 0;
		String s = stringbuffer.toString();
		String s1 = "";
		int j3 = l;
		int k3 = k1;
		int l3 = j;
		int i4 = 1;
		boolean flag = false;
		int k4 = 0;
		boolean flag1 = false;
		int j5 = 0;
		int k5 = 0;
		int l5 = 0;
		int i6 = 0;
		Vector vector = new Vector();
		for (int l4 = s.indexOf("\\&"); l4 != -1; l4 = s.indexOf("\\&", l4 + 2))
		{
			int j6 = 0;
			char c2;
			if ((c2 = s.charAt(l4 + 2)) >= '0' && c2 <= '9' && (j6 = c2 - 48) < a_java_lang_StringBuffer_array1d_static.length)
				if (a_java_lang_StringBuffer_array1d_static[j6] != null)
					s = s.substring(0, l4) + a_java_lang_StringBuffer_array1d_static[j6].toString() + s.substring(l4 + 3);
				else
					s = s.substring(0, l4) + "***ISSUE WITH TEXT PARAM***" + s.substring(l4 + 3);
		}

		if ((i1 & 0x400) != 0 && e > 0)
		{
			if (g != null)
			{
				String s2;
				if (e < 0 || e > s.length())
					s2 = "***ISSUE WITH DRAWSTRINGOFFSET***";
				else
					s2 = s.substring(0, e);
				for (int i7 = s2.indexOf("\\"); i7 > -1; i7 = s2.indexOf("\\", i7 + 3))
				{
					char c3;
					int j8;
					if (((c3 = s2.charAt(i7 + 1)) == 'c' || c3 == 'u' || c3 == 'i' || c3 == 'b') && (j8 = a(c3, s2.charAt(i7 + 2))) != -999)
						if (c3 == 'c')
						{
							if (j8 == -1)
								j3 = l;
							else
								j3 = j8;
						} else
						if (j8 < 0 && (k3 & -j8) != 0)
							k3 &= ~-j8;
						else
						if (j8 >= 0 && (k3 & j8) == 0)
							k3 |= j8;
				}

			}
			if (e < 0 || e > s.length())
				s = "***ISSUE WITH DRAWSTRINGOFFSET***";
			else
				s = s.substring(e);
		}
		a(g, j1, k3, l1, j3);
		if ((i1 & 0x1000) != 0 && (i1 & 0x7f) != 0)
			if ((i1 & 1) != 0)
			{
				i -= j2 / 2;
				i1 = (i1 &= -2) | 4;
			} else
			if ((i1 & 8) != 0)
			{
				i -= j2;
				i1 = (i1 &= -9) | 4;
			}
		while (k4 < s.length() || a_java_util_Vector.size() > i6) 
		{
			char c1 = 'x';
			int j7 = 0;
			int l7 = -1;
			boolean flag3 = false;
			boolean flag4 = false;
			int i5;
			if (k4 < s.length())
			{
				int j4;
				if ((j4 = s.indexOf(" ", k4)) == -1)
				{
					flag4 = true;
					j4 = s.length() - 1;
				}
				if ((i5 = (s1 = s.substring(k4, j4 + 1)).indexOf("\\")) + 1 >= s1.length())
				{
					i5 = -1;
					flag4 = true;
				}
			} else
			{
				i5 = -2;
				flag4 = true;
			}
			if (i5 == -1)
			{
				j5 = 0;
				k4 += s1.length();
				if (!(flag3 = a(s1, j3, j1, k3, l1)))
					d_int += a(d_java_util_Vector, d_java_util_Vector.size() - 1);
			} else
			{
				j5 = 0;
				k5 = 0;
				while (i5 > -1) 
				{
					c1 = s1.charAt(i5 + 1);
					int i9 = a_java_util_Vector.size();
					int k9;
					if (c1 == 'c' || c1 == 'u' || c1 == 'i' || c1 == 'b')
					{
						if ((k9 = a(c1, s1.charAt(i5 + 2))) != -999)
						{
							if (i5 > 0)
								flag3 = a(s1.substring(j7, i5), j3, j1, k3, l1);
							if (c1 == 'c')
							{
								if (k9 == -1)
									j3 = l;
								else
									j3 = k9;
								j5 = 3;
							} else
							{
								if (k9 < 0 && (k3 & -k9) != 0)
									k3 &= ~-k9;
								else
								if (k9 >= 0 && (k3 & k9) == 0)
									k3 |= k9;
								if (k9 < 0)
									j5 = 3;
								else
									j5 = 2;
							}
						}
					} else
					if (c1 == '@' || c1 == 'n' || c1 == 'p')
					{
						if (!(flag3 = a(s1.substring(j7, i5), j3, j1, k3, l1)))
						{
							l7 = i5;
							j5 = 2;
						} else
						{
							l7 = -1;
							j5 = 0;
						}
					} else
					if (c1 == '\247')
					{
						if (s1.substring(i5 + 2).indexOf("\\") == -1)
						{
							flag3 = a(s1.substring(j7, i5) + " " + s1.substring(i5 + 2), j3, j1, k3, l1);
							j5 = 2;
							k4--;
						} else
						{
							s1 = s1.substring(j7, i5) + " " + s1.substring(i5 + 2);
							j5 = 1;
							i5 = -1;
						}
						k5++;
					} else
					if (c1 == 't')
					{
						flag3 = a(s1.substring(j7, i5) + "   ", j3, j1, k3, l1);
						j5 = 2;
						k4 -= "   ".length();
					} else
					if (s1.substring(i5 + 1).indexOf("\\") == -1)
					{
						flag3 = a(s1.substring(j7), j3, j1, k3, l1);
						j5 = 0;
						i5++;
					} else
					{
						j5 = 0;
						i5++;
					}
					j7 = i5 + j5;
					i5 += j5;
					k4 += j5;
					i5 = s1.indexOf("\\", i5);
					if (flag4 && i5 == -1 && j7 < s1.length())
						flag4 = false;
					if (a_java_util_Vector.size() > i9)
					{
						k4 += ((String)a_java_util_Vector.lastElement()).length();
						if (!flag3)
							d_int += ((Integer)d_java_util_Vector.lastElement()).intValue();
					}
					if (flag3 || l7 > -1)
						break;
				}
			}
			if (!flag3 && !flag4 && l7 <= -1)
				continue;
			if (a_java_util_Vector.size() > i6)
			{
				if (a(d_java_util_Vector, i6) > j2)
				{
					String s3 = a(a_java_util_Vector, i6);
					int l9 = a(d_java_util_Vector, i6);
					int j10 = a(c_java_util_Vector, i6);
					int l10 = s3.length();
					for (; l9 > j2; l9 = a(s3.substring(0, l10), j1, j10, l1))
						if (l10 > 1)
							l10--;

					a(a_java_util_Vector, s3.substring(0, l10), i6);
					a(d_java_util_Vector, l9, i6);
					a_java_util_Vector.insertElementAt(s3.substring(l10), i6 + 1);
					b_java_util_Vector.insertElementAt(new Integer(a(b_java_util_Vector, i6)), i6 + 1);
					c_java_util_Vector.insertElementAt(new Integer(j10), i6 + 1);
					d_java_util_Vector.insertElementAt(new Integer(a(s3.substring(l10), j1, j10, l1)), i6 + 1);
					d_int = l9;
					l5 = i6 + 1;
					if (l7 > -1)
						k4 -= 2;
				} else
				if (flag3)
				{
					l5 = a_java_util_Vector.size() - 1;
					if ((i1 & 0x1000) != 0 && a(a_java_util_Vector, a_java_util_Vector.size() - 1).endsWith(" "))
						b_int--;
				} else
				{
					l5 = a_java_util_Vector.size();
				}
				int j9 = i;
				int i10 = i1;
				if (i1 != 0)
					if (b_boolean)
					{
						if ((i1 & 1) != 0)
						{
							j9 = i - d_int / 2;
							i10 = (i10 = i1 & -2) | 4;
						} else
						if ((i1 & 8) != 0)
						{
							j9 = i - d_int;
							i10 = (i10 = i1 & -9) | 4;
						}
					} else
					if ((i1 & 1) != 0)
					{
						j9 = i + d_int / 2;
						i10 = (i10 = i1 & -2) | 8;
					} else
					if ((i1 & 4) != 0)
					{
						j9 = i + d_int;
						i10 = (i10 = i1 & -5) | 8;
					} else
					if ((i1 & 8) != 0)
						j9 = i + d_int;
				int k10 = j2 - d_int;
				int i11 = 0;
				int j11 = 0;
				int k11 = 0;
				if ((i1 & 0x1000) != 0 && l7 == -1 && k10 < j2 / 3 && b_int > 0)
				{
					i11 = k10 / b_int;
					k11 = (j11 = k10 - i11 * b_int) / b_int + 1;
				}
				int i12 = i6;
				for (int j12 = i6; j12 < l5; j12++)
				{
					if ((i1 & 0x200) == 0)
					{
						int l11 = a(b_java_util_Vector, i6);
						a(g, j1, a(c_java_util_Vector, i6), l1, l11);
						a(a(a_java_util_Vector, i6), g, j9, l3, i10, l11, l2);
					} else
					{
						vector.addElement(new Integer(j9));
						i12 = j12;
					}
					if (b_boolean)
						j9 += a(d_java_util_Vector, i12);
					else
						j9 -= a(d_java_util_Vector, i12);
					if ((i1 & 0x1000) != 0 && a(a_java_util_Vector, i12).endsWith(" "))
					{
						j9 += i11;
						if (j11 > 0)
						{
							j9 += k11;
							if ((j11 -= k11) < 0)
							{
								j11 = 0;
								k11 = 0;
							}
						}
					}
					if ((i1 & 0x200) == 0)
					{
						a_java_util_Vector.removeElementAt(i6);
						d_java_util_Vector.removeElementAt(i6);
						b_java_util_Vector.removeElementAt(i6);
						c_java_util_Vector.removeElementAt(i6);
					}
				}

				if ((i1 & 0x200) == 0)
					i6 = 0;
				else
					i6 = l5;
				d_int = 0;
				b_int = 0;
				if (a_java_util_Vector.size() > i6)
				{
					for (int k12 = i6; k12 < a_java_util_Vector.size(); k12++)
					{
						d_int += a(d_java_util_Vector, k12);
						if ((i1 & 0x1000) != 0 && a(a_java_util_Vector, k12).endsWith(" "))
							b_int++;
					}

				}
			}
			l3 += i2;
			if (c1 == 'p' && l7 < l5 && l7 > -1)
			{
				for (; l3 < j + k2 * i4; l3 += i2);
				i4++;
			}
			if ((i1 & 0x400) != 0 && l3 + i2 > j + k2 && g != null)
				break;
		}
		if ((i1 & 0x200) != 0 && vector.size() > 0)
		{
			boolean flag2 = false;
			int k7 = a(vector, 0);
			int k8 = j - (l3 - j) / 2;
			for (int l8 = 0; l8 < vector.size(); l8++)
			{
				int i8 = a(b_java_util_Vector, l8);
				a(g, j1, a(c_java_util_Vector, l8), l1, i8);
				a(a(a_java_util_Vector, l8), g, k7, k8, i1 & 0xfffffd80, i8, l2);
				int k6 = k7;
				if (l8 + 1 < vector.size())
					k7 = a(vector, l8 + 1);
				if (k7 < k6 + a(d_java_util_Vector, l8))
					k8 += i2;
			}

			l3 = k8;
		}
		if ((i1 & 0x400) != 0)
		{
			if (a_java_util_Vector.size() > i6)
			{
				for (int l6 = i6; l6 < a_java_util_Vector.size(); l6++)
					k4 -= a(a_java_util_Vector, l6).length();

				k4 = (k4 -= j5) - k5;
			}
			if (k4 < s.length())
				e += k4;
			else
				e = 0;
		}
		a_java_util_Vector = null;
		c_java_util_Vector = null;
		b_java_util_Vector = null;
		d_java_util_Vector = null;
		return l3;
	}

	public final int a(Graphics g, StringBuffer stringbuffer, int i, int j, int l)
	{
		return a(g, stringbuffer, i, j, l, 20, 0, 0, k.e(), k.f(), k.a(), k.b(), 0, 0);
	}

	private void b()
	{
		a_byte_array1d = new byte[4];
		a_byte = 0;
		for (int i = 0; i < 4;)
			a_byte_array1d[i++] = -1;

		a_java_lang_StringBuffer_array1d_static = new StringBuffer[10];
	}

	private void ZHRES(int i, int j)
	{
		DataInputStream datainputstream = new DataInputStream(getClass().getResourceAsStream("/" + Integer.toString(i)));
		try
		{
			int l = datainputstream.readInt();
			Object obj = null;
			for (int i1 = 0; i1 < l; i1++)
			{
				StringBuffer stringbuffer = new StringBuffer();
				short word0 = datainputstream.readShort();
				byte abyte0[] = new byte[word0];
				for (int j1 = word0 - 1; j1 > -1; j1--)
					abyte0[j1] = (byte)(~datainputstream.readByte());

				String s = new String(abyte0, "UTF-8");
				stringbuffer.append(s);
				a_java_lang_StringBuffer_array2d[j][i1] = stringbuffer;
			}

			datainputstream.close();
		}
		catch (IOException ioexception)
		{
			ioexception.printStackTrace();
		}
	}

}
