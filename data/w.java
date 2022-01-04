// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// Referenced classes of package data:
//			b, k, m

public final class w
{

	private static w a_data_w_static = null;
	private byte a_byte_array1d[];
	private short a_short_array2d[][];
	private short b_short_array2d[][];
	private short c_short_array2d[][];
	private short d_short_array2d[][];
	private short e_short_array2d[][];
	private short f[][];
	private Image a_javax_microedition_lcdui_Image_array1d[];
	private int a_int_array1d[];
	private int a_int;
	private int b_int;
	private int c_int;
	private int d_int;
	private static int e_int_static = 0;
	public boolean a_boolean;

	private w()
	{
		a_boolean = false;
		b(0, 0, k.a(), k.b());
	}

	public static final w a()
	{
		if (k.a())
		{
			if (a_data_w_static == null)
				a_data_w_static = new w();
			return a_data_w_static;
		} else
		{
			throw new b("Unauthorised operation");
		}
	}

	public final int a()
	{
		return 15;
	}

	public final boolean a()
	{
		if (a_byte_array1d[e_int_static] >= 0)
			a(e_int_static, a_byte_array1d[e_int_static], "");
		e_int_static++;
		if (e_int_static == 15)
		{
			e_int_static = 0;
			return true;
		} else
		{
			return false;
		}
	}

	public final void a(int i)
	{
		byte byte0;
		if ((byte0 = a_byte_array1d[i]) >= 0)
		{
			a_javax_microedition_lcdui_Image_array1d[byte0] = null;
			a_short_array2d[byte0] = b_short_array2d[byte0] = c_short_array2d[byte0] = d_short_array2d[byte0] = e_short_array2d[byte0] = f[byte0] = null;
			a_byte_array1d[i] = -1;
			System.gc();
		}
	}

	public final int a(int i)
	{
		return a(i, "");
	}

	public final int a(int i, String s)
	{
		if (a_byte_array1d[i] > 0)
			return a_byte_array1d[i];
		for (int j = 1; j < 15; j++)
			if (a_javax_microedition_lcdui_Image_array1d[j] == null)
				return a(i, j, s);

		return a(i, 0, s);
	}

	private int a(int i, int j, String s)
	{
		boolean flag = false;
		if (a_byte_array1d[i] == (byte)j && a_javax_microedition_lcdui_Image_array1d[j] != null)
			return j;
		do
		{
			for (int l = 0; l < 15; l++)
				if (a_byte_array1d[l] == j)
					a_byte_array1d[l] = -1;

			if (i >= 15)
				return j;
			try
			{
				if (j == 0 || a_short_array2d[j] == null)
				{
					InputStream inputstream;
					(inputstream = getClass().getResourceAsStream("/data/D0")).skip(0L);
					int i1;
					int k1 = i1 = 0;
					for (; i1 < i; i1++)
						k1 += inputstream.read() | inputstream.read() << 8;

					int l1 = inputstream.read() | inputstream.read() << 8;
					a_int_array1d[i] = l1;
					inputstream.skip((15 - i - 1) * 2 + k1 * 12);
					a_short_array2d[j] = new short[l1];
					b_short_array2d[j] = new short[l1];
					c_short_array2d[j] = new short[l1];
					d_short_array2d[j] = new short[l1];
					e_short_array2d[j] = new short[l1];
					f[j] = new short[l1];
					for (int j1 = 0; j1 < l1; j1++)
					{
						a_short_array2d[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
						b_short_array2d[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
						c_short_array2d[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
						d_short_array2d[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
						e_short_array2d[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
						f[j][j1] = (short)(inputstream.read() | inputstream.read() << 8);
					}

					inputstream.close();
				}
				if (!s.equals(""))
				{
					Object obj = null;
					int i2 = 0;
					i2 = a(i, ((byte []) (null)));
					byte abyte0[] = m.a().a(s);
					int j2;
					if ((j2 = a(((byte []) (null)))) != -1)
					{
						j2 += 4;
						try
						{
							System.arraycopy(abyte0, 0, null, j2, abyte0.length);
							a_javax_microedition_lcdui_Image_array1d[j] = Image.createImage(null, 0, i2);
						}
						catch (Exception )
						{
							a_javax_microedition_lcdui_Image_array1d[j] = Image.createImage("/data/BS" + i + ".png");
						}
					} else
					{
						a_javax_microedition_lcdui_Image_array1d[j] = Image.createImage("/data/BS" + i + ".png");
					}
				} else
				{
					a_javax_microedition_lcdui_Image_array1d[j] = Image.createImage("/data/BS" + i + ".png");
				}
				a_byte_array1d[i] = (byte)j;
				break;
			}
			catch (Exception ) { }
		} while (true);
		return j;
	}

	public static final int a(byte abyte0[])
	{
		int i = 0;
		byte byte0;
		for (byte0 = 0; byte0 == 0;)
		{
			if (abyte0[i] == 80 && abyte0[i + 1] == 76 && abyte0[i + 2] == 84 && abyte0[i + 3] == 69)
				byte0 = 1;
			if (++i > abyte0.length - 4)
				byte0 = 2;
		}

		if (byte0 == 1)
			return i - 1;
		else
			return -1;
	}

	public final void a()
	{
		InputStream inputstream = null;
		(inputstream = getClass().getResourceAsStream("/data/D0")).skip(0L);
		for (int i = 0; i < 15; i++)
			a_int_array1d[i] = inputstream.read() | inputstream.read() << 8;

		int j1;
		for (int i1 = j1 = 0; i1 < 15;)
		{
			a_javax_microedition_lcdui_Image_array1d[j1] = null;
			int l = a_int_array1d[j1];
			a_short_array2d[j1] = new short[l];
			b_short_array2d[j1] = new short[l];
			c_short_array2d[j1] = new short[l];
			d_short_array2d[j1] = new short[l];
			e_short_array2d[j1] = new short[l];
			f[j1] = new short[l];
			for (int j = 0; j < l; j++)
			{
				a_short_array2d[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
				b_short_array2d[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
				c_short_array2d[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
				d_short_array2d[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
				e_short_array2d[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
				f[j1][j] = (short)(inputstream.read() | inputstream.read() << 8);
			}

			a_byte_array1d[i1] = (byte)j1;
			i1++;
			j1++;
		}

		if (inputstream != null)
			inputstream.close();
		break MISSING_BLOCK_LABEL_401;
		JVM INSTR dup ;
		IOException ioexception;
		ioexception;
		printStackTrace();
		break MISSING_BLOCK_LABEL_401;
		JVM INSTR dup ;
		Exception exception;
		exception;
		printStackTrace();
		if (inputstream != null)
			inputstream.close();
		break MISSING_BLOCK_LABEL_401;
		JVM INSTR dup ;
		ioexception;
		printStackTrace();
		break MISSING_BLOCK_LABEL_401;
		Exception exception1;
		exception1;
		if (inputstream != null)
			inputstream.close();
		  goto _L1
		JVM INSTR dup ;
		ioexception;
		printStackTrace();
_L1:
		throw exception1;
		System.gc();
		return;
	}

	public final int a(int i, byte abyte0[])
	{
		InputStream inputstream;
		inputstream = null;
		boolean flag = false;
		int j;
		inputstream = getClass().getResourceAsStream("/data/BS" + i + ".png");
		int l;
		if (abyte0 == null)
			abyte0 = new byte[l = inputstream.available()];
		l = 0;
		j = 0;
		for (int i1 = inputstream.read(); i1 >= 0; i1 = inputstream.read())
			abyte0[j++] = (byte)i1;

		if (inputstream != null)
			inputstream.close();
		break MISSING_BLOCK_LABEL_158;
		JVM INSTR dup ;
		IOException ioexception;
		ioexception;
		printStackTrace();
		break MISSING_BLOCK_LABEL_158;
		JVM INSTR dup ;
		Exception exception;
		exception;
		printStackTrace();
		j = 0;
		if (inputstream != null)
			inputstream.close();
		break MISSING_BLOCK_LABEL_158;
		JVM INSTR dup ;
		ioexception;
		printStackTrace();
		break MISSING_BLOCK_LABEL_158;
		Exception exception1;
		exception1;
		if (inputstream != null)
			inputstream.close();
		  goto _L1
		JVM INSTR dup ;
		ioexception;
		printStackTrace();
_L1:
		throw exception1;
		return j;
	}

	public final void a(int i, int j, int l, int i1)
	{
		a_int = i;
		b_int = j;
		c_int = l;
		d_int = i1;
	}

	public final void a(Graphics g, int i, int j, int l)
	{
		a(g, i, j, l, -1);
	}

	public final void a(Graphics g, int i, int j, int l, int i1)
	{
		int j1;
		j1 = i >> 16;
		i &= 0xffff;
		int k1;
		if ((k1 = a_byte_array1d[j1]) >= 0) goto _L2; else goto _L1
_L1:
		if (a_boolean)
			k1 = a(j1, "");
		else
			k1 = a(j1, 0, "");
		  goto _L3
_L2:
		if (a_javax_microedition_lcdui_Image_array1d[k1] != null) goto _L3; else goto _L4
_L4:
		a_javax_microedition_lcdui_Image_array1d[k1] = Image.createImage("/data/BS" + j1 + ".png");
		  goto _L3
		JVM INSTR dup ;
		IOException ioexception;
		ioexception;
		printStackTrace();
_L3:
		int l2 = 0;
		if (i1 == -1)
		{
			if ((c_short_array2d[k1][i] & 0x8000) != 0)
				l2 = 2;
		} else
		if (i1 >= 0)
			l2 = i1;
		j -= e_short_array2d[k1][i];
		l -= f[k1][i];
		int l1 = j;
		int i2 = l;
		int j2 = c_short_array2d[k1][i] & 0x7fff;
		int k2 = d_short_array2d[k1][i] & 0x7fff;
		if (i1 == 5 || i1 == 6 || i1 == 4 || i1 == 7)
		{
			int i3 = d_int;
			d_int = c_int;
			c_int = i3;
		}
		if (l1 + j2 > a_int + c_int)
			j2 = (a_int + c_int) - l1;
		if (i2 + k2 > b_int + d_int)
			k2 = (b_int + d_int) - i2;
		if (l1 < a_int)
		{
			j2 -= a_int - l1;
			l1 = a_int;
		}
		if (i2 < b_int)
		{
			k2 -= b_int - i2;
			i2 = b_int;
		}
		if (j2 > 0 && k2 > 0)
		{
			if (l2 != 0)
			{
				g.drawRegion(a_javax_microedition_lcdui_Image_array1d[k1], (a_short_array2d[k1][i] + (((c_short_array2d[k1][i] & 0x7fff) - l1) + j)) - j2, (b_short_array2d[k1][i] + i2) - l, j2, k2, l2, l1, i2, 0);
				return;
			}
			g.drawRegion(a_javax_microedition_lcdui_Image_array1d[k1], (a_short_array2d[k1][i] + l1) - j, (b_short_array2d[k1][i] + i2) - l, j2, k2, l2, l1, i2, 0);
		}
		return;
	}

	public final Image a(int i)
	{
		int j = i >> 16;
		byte byte0 = a_byte_array1d[j];
		i &= 0xffff;
		if (a_javax_microedition_lcdui_Image_array1d[byte0] != null)
			return Image.createImage(a_javax_microedition_lcdui_Image_array1d[byte0], a_short_array2d[byte0][i], b_short_array2d[byte0][i], c_short_array2d[byte0][i] & 0x7fff, d_short_array2d[byte0][i] & 0x7fff, 0);
		else
			return null;
	}

	public final void a(Graphics g, Image image, int i, int j)
	{
		if (g != null && image != null)
			a(g, image, i, j, -1);
	}

	public final void a(Graphics g, Image image, int i, int j, int l)
	{
		int i1 = 0;
		if (l >= 0 && l >= 0)
			i1 = l;
		g.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), i1, i, j, 0);
	}

	private void b(int i, int j, int l, int i1)
	{
		a(i, j, l, i1);
		a_byte_array1d = new byte[15];
		a_short_array2d = new short[15][];
		b_short_array2d = new short[15][];
		c_short_array2d = new short[15][];
		d_short_array2d = new short[15][];
		e_short_array2d = new short[15][];
		f = new short[15][];
		a_javax_microedition_lcdui_Image_array1d = new Image[15];
		a_int_array1d = new int[15];
		try
		{
			InputStream inputstream;
			(inputstream = getClass().getResourceAsStream("/data/D0")).skip(0L);
			for (int j1 = 0; j1 < 15; j1++)
			{
				a_int_array1d[j1] = inputstream.read();
				a_int_array1d[j1] |= inputstream.read() << 8;
			}

			inputstream.close();
		}
		catch (Exception ) { }
		for (int k1 = 0; k1 < 15;)
			a_byte_array1d[k1++] = -1;

	}

}
