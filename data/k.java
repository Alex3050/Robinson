// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.PrintStream;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.GameCanvas;

// Referenced classes of package data:
//			ac, f, w

public abstract class k extends GameCanvas
	implements Runnable
{

	public Graphics a_javax_microedition_lcdui_Graphics;
	private boolean aQ;
	private boolean aR;
	private long L;
	private long M;
	private long N;
	private int bw;
	private int bx;
	private boolean aS;
	private boolean aT;
	private static k a_data_k_static = null;
	private static int by = -1;
	private long O;
	private boolean aU;
	private int bz;
	private byte a_byte;
	private static Image a_javax_microedition_lcdui_Image_static = null;
	private static int bA = 0;
	private static int bB = 0;
	private static int bC = 0;
	private static int bD = 0xffffff;
	private static int bE = 20;
	private static int bF = 168;
	private static int bG = 200;
	private static int bH = 8;
	private static int bI = 0;
	private static int bJ = 0;
	private int bK;
	private int bL;
	private boolean aV;
	private static int bM = -1;
	private static int bN = -1;
	private static Font a_javax_microedition_lcdui_Font_static;
	private StringBuffer d;
	private StringBuffer e;
	private StringBuffer f;
	private StringBuffer g;
	public static final int x[] = {
		32, 5, 4, 6, 1, 16, 2, 9, 8, 10, 
		16, 128, 16, 128, 128, 16, 128, 80, 4, 8, 
		1, 2, 16, 4, 8, 1, 2, 80, 16, 16, 
		16, 16, 16, 128, 256
	};
	private int bO;
	private int bP;
	private int bQ;
	private int bR;
	private int z[];
	private int A[];
	private int bS;
	private int bT;
	private int bU;
	private int bV;
	private int B[];
	public int bo;
	public int bp;
	public int bq;
	private int bW;
	public int br;
	public int bs;
	public int bt;
	public int bu;
	public int y[];
	public int bv;

	public k()
	{
		super(false);
		aQ = true;
		aR = false;
		N = 0L;
		bw = 0;
		bx = 0;
		aS = false;
		aT = true;
		O = 60L;
		aU = false;
		bz = 0;
		a_byte = 0;
		bK = 0;
		bL = 0;
		aV = true;
		d = null;
		e = null;
		f = null;
		g = null;
		bU = 0;
		bV = 0;
		bo = 0;
		bp = 0;
		bq = 0;
		bW = 0;
		char ac1[][] = new char[12][];
		ac1[0] = (new char[] {
			'+', '0'
		});
		ac1[1] = (new char[] {
			'.', ',', '-', '?', '!', '\'', ':', '1', '@', '_', 
			'(', ')', ';', '&', '/', '%', '<', '=', '>', '"', 
			'\u20AC', '$', '\243', '\247', '\260', '[', ']', '{', '}', '~', 
			'^', '|'
		});
		ac1[2] = (new char[] {
			'a', 'b', 'c', '2', '\340', '\342', '\347', '\344', 'A', 'B', 
			'C'
		});
		ac1[3] = (new char[] {
			'd', 'e', 'f', '3', '\351', '\350', '\352', '\353', 'D', 'E', 
			'F'
		});
		ac1[4] = (new char[] {
			'g', 'h', 'i', '4', '\357', '\356', 'G', 'H', 'I'
		});
		ac1[5] = (new char[] {
			'j', 'k', 'l', '5', 'J', 'K', 'L'
		});
		ac1[6] = (new char[] {
			'm', 'n', 'o', '6', '\364', '\366', 'M', 'N', 'O'
		});
		ac1[7] = (new char[] {
			'p', 'q', 'r', 's', '7', 'P', 'Q', 'R', 'S'
		});
		ac1[8] = (new char[] {
			't', 'u', 'v', '8', '\371', '\373', '\374', 'T', 'U', 'V'
		});
		ac1[9] = (new char[] {
			'w', 'x', 'y', 'z', '9', 'W', 'X', 'Y', 'Z'
		});
		ac1[10] = (new char[] {
			'*'
		});
		ac1[11] = (new char[] {
			' ', '#', '-', '+'
		});
		int ai[] = new int[12];
		ai[0] = 48;
		ai[1] = 49;
		ai[2] = 50;
		ai[3] = 51;
		ai[4] = 52;
		ai[5] = 53;
		ai[6] = 54;
		ai[7] = 55;
		ai[8] = 56;
		ai[9] = 57;
		ai[10] = 42;
		ai[11] = 35;
		int ai1[] = new int[10];
		ai1[0] = 48;
		ai1[1] = 49;
		ai1[2] = 50;
		ai1[3] = 51;
		ai1[4] = 52;
		ai1[5] = 53;
		ai1[6] = 54;
		ai1[7] = 55;
		ai1[8] = 56;
		ai1[9] = 57;
		bv = 0;
		setFullScreenMode(true);
		a_data_k_static = this;
		b();
		a();
		f();
		a_byte = 1;
	}

	public final void a(int i)
	{
		System.gc();
		try
		{
			Thread.sleep(i);
			return;
		}
		catch (Exception )
		{
			return;
		}
	}

	public final void b(int i)
	{
		O = 1000 / i;
	}

	public static final boolean a()
	{
		if (by == -1)
			if ("SunMicrosystems_wtk".equals(System.getProperty("microedition.platform")) && "wtk-emulator".equals(System.getProperty("device.model")))
			{
				by = 1;
				return true;
			} else
			{
				by = 1;
				return true;
			}
		return by != 0;
	}

	public final Graphics a()
	{
		return a_javax_microedition_lcdui_Graphics;
	}

	public final void a(Graphics g1, int i, int j, int l, int i1, int j1, int k1, 
			int l1, int i2)
	{
		int j2 = l - 4;
		g1.setColor(l1);
		g1.drawRect(i, j, l - 1, i1 - 1);
		if (k1 == 0)
			k1 = 1;
		j2 = (j1 * j2) / k1;
		g1.setColor(i2);
		g1.fillRect(i + 2, j + 2, j2, i1 - 4);
	}

	public final void b(Graphics g1, int i, int j, int l, int i1, int j1, int k1, 
			int l1, int i2)
	{
		a(g1, i, j, l, i1, j1, k1, l1, i2);
	}

	public static final void a(Image image, int i, int j, int l, int i1, int j1, int k1, int l1, 
			int i2, int j2, int k2)
	{
		a_javax_microedition_lcdui_Image_static = image;
		bA = i;
		bB = j;
		bC = l;
		bD = i1;
		bE = j1;
		bF = k1;
		bG = l1;
		bH = i2;
		bI = j2;
		bJ = k2;
	}

	public void a(Graphics g1)
	{
	}

	public void a(int i, long l)
	{
	}

	public final synchronized void sizeChanged(int i, int j)
	{
		a_javax_microedition_lcdui_Graphics = getGraphics();
		if (!aQ)
			try
			{
				if (a_data_k_static.aV)
					bM = j;
				else
					bM = j - 18;
				bN = i;
				w.a().a(0, 0, bN, bM);
				if (a_javax_microedition_lcdui_Graphics != null)
				{
					a_javax_microedition_lcdui_Graphics.setClip(0, 0, bN, bM);
					a_javax_microedition_lcdui_Graphics.setColor(bD);
					a_javax_microedition_lcdui_Graphics.fillRect(0, 0, i, j);
				}
				f = null;
				g = null;
				a(10, System.currentTimeMillis());
				a(1, System.currentTimeMillis());
				return;
			}
			catch (Exception exception)
			{
				System.out.println("Canvas : Exception" + exception);
			}
	}

	public static final int a()
	{
		if (bN == -1)
			bN = 240;
		return bN;
	}

	public static final int b()
	{
		if (bM == -1)
			if (a_data_k_static.aV)
				bM = 320;
			else
				bM = 302;
		return bM;
	}

	public static final int c()
	{
		return 8;
	}

	public static final int d()
	{
		return 18;
	}

	public static final int e()
	{
		return 8;
	}

	public static final int f()
	{
		return 16;
	}

	public static final int g()
	{
		return 0;
	}

	public final void a(boolean flag)
	{
		aV = flag;
		bM = -1;
		bN = -1;
	}

	private String a(StringBuffer stringbuffer)
	{
		if (stringbuffer == null)
			return "";
		else
			return stringbuffer.toString();
	}

	public final void a(StringBuffer stringbuffer, StringBuffer stringbuffer1)
	{
		if (stringbuffer == null && stringbuffer1 == null)
			a(true);
		else
			a(false);
		e = stringbuffer;
		d = stringbuffer1;
		if (a(d).equals(a(f)))
			a(e).equals(a(g));
	}

	private int a(int i)
	{
		if (i == 48)
			return 0;
		if (i == 49)
			return 1;
		if (i == 50)
			return 2;
		if (i == 51)
			return 3;
		if (i == 52)
			return 4;
		if (i == 53)
			return 5;
		if (i == 54)
			return 6;
		if (i == 55)
			return 7;
		if (i == 56)
			return 8;
		if (i == 57)
			return 9;
		if (i == 42)
			return 10;
		if (i == 35)
			return 11;
		if (i == 32768)
			return 32;
		if (i == 32769)
			return 33;
		if (i == -3)
			return 20;
		if (i == -4)
			return 21;
		if (i == -1)
			return 18;
		if (i == -2)
			return 19;
		if (i == -6)
			return 15;
		if (i == -7)
			return 16;
		if (i == -8)
			return 14;
		if (i == 8)
			return 14;
		if (i == -5)
			return 22;
		int j;
		if ((j = getGameAction(i)) == 1)
			return 23;
		if (j == 6)
			return 24;
		if (j == 2)
			return 25;
		if (j == 5)
			return 26;
		if (j == 8)
			return 27;
		if (j == 9)
			return 28;
		if (j == 10)
			return 29;
		if (j == 11)
			return 30;
		return j != 12 ? 34 : 31;
	}

	private int b(int i)
	{
		int j = 34;
		try
		{
			j = a(i);
		}
		catch (Exception ) { }
		if (j < 34)
			return j;
		else
			return 34;
	}

	public final void keyReleased(int i)
	{
		int j = y[b(i)];
		d(j);
		bo = 1;
		bv = 0;
	}

	public final void keyPressed(int i)
	{
		bo = 3;
		br = bz;
		if (bT == i)
			bs++;
		else
			bs = 1;
		bT = i;
		e(i);
		int j = y[b(i)];
		c(j);
		bv = bT;
	}

	public final void keyRepeated(int i)
	{
	}

	public void pointerDragged(int i, int j)
	{
	}

	public void pointerPressed(int i, int j)
	{
		bW = 3;
		if (i < a() >> 1 && i > 0 && j < 320 && j > 302 && !aV && e != null)
		{
			br = bz;
			if (bT == -6)
				bs++;
			else
				bs = 1;
			bT = -6;
			bv = -6;
			c(y[15]);
		}
		if (i < a() && i > a() >> 1 && j < 320 && j > 302 && !aV && d != null)
		{
			br = bz;
			if (bT == -7)
				bs++;
			else
				bs = 1;
			bT = -7;
			bv = -7;
			c(y[16]);
		}
	}

	public void pointerReleased(int i, int j)
	{
		bW = 1;
		if (i < a() >> 1 && i > 0 && j < 320 && j > 302 && !aV)
		{
			bv = 0;
			d(y[15]);
		}
		if (i < a() && i > a() >> 1 && j < 320 && j > 302 && !aV)
		{
			bv = 0;
			d(y[15]);
		}
	}

	private void c(int i)
	{
		bQ |= i;
		z[bP++] |= i;
		bP &= 0xff;
	}

	private void d(int i)
	{
		bQ &= -1 - i;
		A[bP++] |= i;
		bP &= 0xff;
	}

	private void e(int i)
	{
		bp = i;
		B[bU++] = i;
		bU &= 0xf;
	}

	private void c()
	{
		if (bo == 1)
			bo = 0;
		if (bo == 3)
			bo = 2;
		if (bo == 0)
			bp = 0;
		if (bU != bV)
		{
			bV++;
			bV &= 0xf;
		}
	}

	private void d()
	{
		if (bq == 1)
			bq = 0;
		if (bq == 3)
			bq = 2;
		if (bW != 0)
		{
			bq = bW;
			bW = 0;
		}
	}

	private void e()
	{
		int i = bP;
		boolean flag = false;
		do
		{
			bR &= -1 - A[bO];
			bR |= z[bO];
			A[bO] = z[bO] = 0;
			if (bO != i)
				bO = bO + 1 & 0xff;
			else
				flag = true;
			bt = bR;
			bu = (bt ^ bS) & bt;
			bS = bt;
		} while (bu == 0 && bt == 0 && !flag);
	}

	public final void b()
	{
		for (bz = 0; bz < 256; bz++)
			z[bz] = A[bz] = 0;

		bP = bQ = bR = bt = bS = bu = bT = br = bs = 0;
		bO = 255;
	}

	public final void run()
	{
		Graphics g1;
		setFullScreenMode(true);
		g1 = getGraphics();
		  goto _L1
_L3:
		if (!aS)
			break MISSING_BLOCK_LABEL_37;
		Thread.sleep(100L);
		continue; /* Loop/switch isn't completed */
		JVM INSTR dup ;
		Exception exception;
		exception;
		printStackTrace();
		continue; /* Loop/switch isn't completed */
		if (isShown())
		{
			M = System.currentTimeMillis();
			b(g1);
			if (aT)
				flushGraphics();
			L = System.currentTimeMillis() - M;
			if (L < O)
				try
				{
					synchronized (this)
					{
						wait(O - L);
					}
					L = System.currentTimeMillis() - M;
				}
				catch (Exception ) { }
		}
_L1:
		if (a_byte != 0) goto _L3; else goto _L2
_L2:
	}

	public final synchronized void hideNotify()
	{
		bL = 0;
		aU = true;
		bz = -1;
		bx++;
		a(0, System.currentTimeMillis());
	}

	public final synchronized void showNotify()
	{
		bL = 0;
		bz = -1;
	}

	private void f()
	{
		bK |= 1;
		bK |= 1;
		y = x;
		z = new int[256];
		A = new int[256];
		b();
		B = new int[16];
	}

	public final synchronized void b(Graphics g1)
	{
		try
		{
			if (a())
			{
				if (!aR)
				{
					bz++;
					a_javax_microedition_lcdui_Graphics = g1;
					a_javax_microedition_lcdui_Graphics.setClip(0, 0, a(), b());
					if (bK != 7)
					{
						if (bz == 0)
							a(((StringBuffer) (null)), ((StringBuffer) (null)));
						a_javax_microedition_lcdui_Graphics.setColor(bD);
						a_javax_microedition_lcdui_Graphics.setClip(0, 0, a(), b());
						a_javax_microedition_lcdui_Graphics.fillRect(0, 0, a(), b());
						if (O != 0L)
							N = O;
						O = 0L;
						bw += w.a().a();
						bw += ac.a().a();
						if ((bK & 2) == 0 && w.a().a())
						{
							bL = w.a().a() - 1;
							bK |= 2;
						}
						if ((bK & 4) == 0 && ac.a().a())
						{
							bL = ac.a().a() - 1;
							bK |= 4;
						}
						if (bK == 7)
						{
							bL = bw - 1;
							bz = -1;
							O = N;
						}
						bL++;
						if (a_javax_microedition_lcdui_Image_static != null)
							a_javax_microedition_lcdui_Graphics.drawImage(a_javax_microedition_lcdui_Image_static, bA, bB, bC);
						b(a_javax_microedition_lcdui_Graphics, bE, bF, bG, bH, bL, bw, bI, bJ);
					} else
					{
						int i = bx;
						if (aQ)
						{
							a(3, System.currentTimeMillis());
							aQ = false;
						}
						if (aU)
						{
							b();
							a(((StringBuffer) (null)), ((StringBuffer) (null)));
							a_javax_microedition_lcdui_Graphics.setColor(bD);
							a_javax_microedition_lcdui_Graphics.fillRect(0, 0, a(), b());
							bz = 0;
							a(1, System.currentTimeMillis());
						}
						e();
						a(a_javax_microedition_lcdui_Graphics);
						if (!aV)
						{
							if (d == null && e == null)
							{
								a_javax_microedition_lcdui_Graphics.setClip(0, b(), a(), d());
								a_javax_microedition_lcdui_Graphics.setColor(0x404040);
								a_javax_microedition_lcdui_Graphics.drawLine(0, b(), a(), b());
								a_javax_microedition_lcdui_Graphics.setColor(0xbfbfbf);
								a_javax_microedition_lcdui_Graphics.fillRect(0, b() + 1, a(), d());
								a_javax_microedition_lcdui_Graphics.setColor(0x404040);
								a_javax_microedition_lcdui_Graphics.drawLine(a() / 2, b() + 3, a() / 2, b() + d());
								a_javax_microedition_lcdui_Graphics.setColor(0);
								a_javax_microedition_lcdui_Font_static = Font.getFont(0, 0, c());
								a_javax_microedition_lcdui_Graphics.setFont(a_javax_microedition_lcdui_Font_static);
							}
							if (d != f || e != g)
							{
								if (d != null || e != null)
								{
									a_javax_microedition_lcdui_Graphics.setClip(0, b(), a(), d());
									a_javax_microedition_lcdui_Graphics.setColor(0x404040);
									a_javax_microedition_lcdui_Graphics.drawLine(0, b(), a(), b());
									a_javax_microedition_lcdui_Graphics.setColor(0xbfbfbf);
									a_javax_microedition_lcdui_Graphics.fillRect(0, b() + 1, a(), d());
									a_javax_microedition_lcdui_Graphics.setColor(0x404040);
									a_javax_microedition_lcdui_Graphics.drawLine(a() / 2, b() + 3, a() / 2, b() + d());
									a_javax_microedition_lcdui_Graphics.setColor(0);
									a_javax_microedition_lcdui_Font_static = Font.getFont(0, 0, c());
									a_javax_microedition_lcdui_Graphics.setFont(a_javax_microedition_lcdui_Font_static);
								}
								if (d != null)
									a_javax_microedition_lcdui_Graphics.drawString(d.toString(), a() - 2, b() + 2, 24);
								if (e != null)
									a_javax_microedition_lcdui_Graphics.drawString(e.toString(), 2, b() + 2, 20);
								f = d;
								g = e;
							}
							a_javax_microedition_lcdui_Graphics.setClip(0, 0, a(), b());
						}
						c();
						d();
						if (i == bx)
							aU = false;
					}
				}
			} else
			{
				g1.setColor(0xffffff);
				g1.fillRect(0, 0, a(), b());
				g1.setColor(0xff0000);
				g1.drawString("*UNAUTHORIZED*", 0, 2 * f(), 20);
			}
			return;
		}
		catch (f )
		{
			bK = 7;
			a(9, System.currentTimeMillis());
			System.gc();
			return;
		}
		catch (Exception exception)
		{
			aR = true;
			a(6, System.currentTimeMillis());
			System.out.println("Canvas : Uncaught Exception : " + exception + "\n --message : " + exception.getMessage());
			exception.printStackTrace();
			return;
		}
	}

}
