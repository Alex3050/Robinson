package data;

import data.ac;
import data.f;
import data.w;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

// 分辨率 240 x 320

public abstract class k extends GameCanvas implements Runnable {

   public Graphics a;
   private boolean aQ = true;
   private boolean aR = false;
   private long L;
   private long M;
   private long N = 0L;
   private int bw = 0;
   private int bx = 0;
   private boolean aS = false;
   private boolean aT = true;
   private static k a = null;
   private static int by = -1;
   private long O = 60L;
   private boolean aU = false;
   private int bz = 0;
   private byte a = 0;
   private static Image a = null;
   private static int bA = 0;
   private static int bB = 0;
   private static int bC = 0;
   private static int bD = 16777215;
   private static int bE = 20;
   private static int bF = 168;
   private static int bG = 200;
   private static int bH = 8;
   private static int bI = 0;
   private static int bJ = 0;
   private int bK = 0;
   private int bL = 0;
   private boolean aV = true;
   private static int bM = -1;
   private static int bN = -1;
   private static Font a;
   private StringBuffer d = null;
   private StringBuffer e = null;
   private StringBuffer f = null;
   private StringBuffer g = null;
   public static final int[] x = new int[]{32, 5, 4, 6, 1, 16, 2, 9, 8, 10, 16, 128, 16, 128, 128, 16, 128, 80, 4, 8, 1, 2, 16, 4, 8, 1, 2, 80, 16, 16, 16, 16, 16, 128, 256};
   private int bO;
   private int bP;
   private int bQ;
   private int bR;
   private int[] z;
   private int[] A;
   private int bS;
   private int bT;
   private int bU = 0;
   private int bV = 0;
   private int[] B;
   public int bo = 0;
   public int bp = 0;
   public int bq = 0;
   private int bW = 0;
   public int br;
   public int bs;
   public int bt;
   public int bu;
   public int[] y;
   public int bv;


   public k() {
      super(false);
      char[][] var10000 = new char[][]{{'+', '0'}, {'.', ',', '-', '?', '!', '\'', ':', '1', '@', '_', '(', ')', ';', '&', '/', '%', '<', '=', '>', '\"', '\u20ac', '$', '\u00a3', '\u00a7', '\u00b0', '[', ']', '{', '}', '~', '^', '|'}, {'a', 'b', 'c', '2', '\u00e0', '\u00e2', '\u00e7', '\u00e4', 'A', 'B', 'C'}, {'d', 'e', 'f', '3', '\u00e9', '\u00e8', '\u00ea', '\u00eb', 'D', 'E', 'F'}, {'g', 'h', 'i', '4', '\u00ef', '\u00ee', 'G', 'H', 'I'}, {'j', 'k', 'l', '5', 'J', 'K', 'L'}, {'m', 'n', 'o', '6', '\u00f4', '\u00f6', 'M', 'N', 'O'}, {'p', 'q', 'r', 's', '7', 'P', 'Q', 'R', 'S'}, {'t', 'u', 'v', '8', '\u00f9', '\u00fb', '\u00fc', 'T', 'U', 'V'}, {'w', 'x', 'y', 'z', '9', 'W', 'X', 'Y', 'Z'}, {'*'}, {' ', '#', '-', '+'}};
      int[] var1 = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35};
      var1 = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
      this.bv = 0;
      this.setFullScreenMode(true);
      a = this;
      b();
      a();
      this.f();
      this.a = 1;
   }

   public final void a(int var1) {
      System.gc();

      try {
         Thread.sleep((long)var1);
      } catch (Exception var3) {
         ;
      }
   }

   public final void b(int var1) {
      this.O = (long)(1000 / var1);
   }

   public static final boolean a() {
      if(by == -1) {
         if("SunMicrosystems_wtk".equals(System.getProperty("microedition.platform")) && "wtk-emulator".equals(System.getProperty("device.model"))) {
            by = 1;
            return true;
         } else {
            by = 1;
            return true;
         }
      } else {
         return by != 0;
      }
   }

   public final Graphics a() {
      return this.a;
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var4 - 4;
      var1.setColor(var8);
      var1.drawRect(var2, var3, var4 - 1, var5 - 1);
      if(var7 == 0) {
         var7 = 1;
      }

      var10 = var6 * var10 / var7;
      var1.setColor(var9);
      var1.fillRect(var2 + 2, var3 + 2, var10, var5 - 4);
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static final void a(Image var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      a = var0;
      bA = var1;
      bB = var2;
      bC = var3;
      bD = var4;
      bE = var5;
      bF = var6;
      bG = var7;
      bH = var8;
      bI = var9;
      bJ = var10;
   }

   public void a(Graphics var1) {}

   public void a(int var1, long var2) {}

   public final synchronized void sizeChanged(int var1, int var2) {
      this.a = this.getGraphics();
      if(!this.aQ) {
         try {
            if(a.aV) {
               bM = var2;
            } else {
               bM = var2 - 18;
            }

            bN = var1;
            w.a().a(0, 0, bN, bM);
            if(this.a != null) {
               this.a.setClip(0, 0, bN, bM);
               this.a.setColor(bD);
               this.a.fillRect(0, 0, var1, var2);
            }

            this.f = null;
            this.g = null;
            this.a(10, System.currentTimeMillis());
            this.a(1, System.currentTimeMillis());
            return;
         } catch (Exception var4) {
            System.out.println("Canvas : Exception" + var4);
         }
      }

   }

   public static final int a() {
      if(bN == -1) {
         bN = 240;
      }

      return bN;
   }

   public static final int b() {
      if(bM == -1) {
         if(a.aV) {
            bM = 320;
         } else {
            bM = 302;
         }
      }

      return bM;
   }

   public static final int c() {
      return 8;
   }

   public static final int d() {
      return 18;
   }

   public static final int e() {
      return 8;
   }

   public static final int f() {
      return 16;
   }

   public static final int g() {
      return 0;
   }

   public final void a(boolean var1) {
      this.aV = var1;
      bM = -1;
      bN = -1;
   }

   private String a(StringBuffer var1) {
      return var1 == null?"":var1.toString();
   }

   public final void a(StringBuffer var1, StringBuffer var2) {
      if(var1 == null && var2 == null) {
         this.a(true);
      } else {
         this.a(false);
      }

      this.e = var1;
      this.d = var2;
      if(this.a(this.d).equals(this.a(this.f))) {
         this.a(this.e).equals(this.a(this.g));
      }

   }

   private int a(int var1) {
      int var2;
      return var1 == 48?0:(var1 == 49?1:(var1 == 50?2:(var1 == 51?3:(var1 == 52?4:(var1 == 53?5:(var1 == 54?6:(var1 == 55?7:(var1 == 56?8:(var1 == 57?9:(var1 == 42?10:(var1 == 35?11:(var1 == '\u8000'?32:(var1 == '\u8001'?33:(var1 == -3?20:(var1 == -4?21:(var1 == -1?18:(var1 == -2?19:(var1 == -6?15:(var1 == -7?16:(var1 == -8?14:(var1 == 8?14:(var1 == -5?22:((var2 = this.getGameAction(var1)) == 1?23:(var2 == 6?24:(var2 == 2?25:(var2 == 5?26:(var2 == 8?27:(var2 == 9?28:(var2 == 10?29:(var2 == 11?30:(var2 == 12?31:34)))))))))))))))))))))))))))))));
   }

   private int b(int var1) {
      int var2 = 34;

      try {
         var2 = this.a(var1);
      } catch (Exception var4) {
         ;
      }

      return var2 < 34?var2:34;
   }

   public final void keyReleased(int var1) {  // 键盘放开
      int var2 = this.y[this.b(var1)];
      this.d(var2);
      this.bo = 1;
      this.bv = 0;
   }

   public final void keyPressed(int var1) {  // 键盘按下
      this.bo = 3;
      this.br = this.bz;
      if(this.bT == var1) {
         ++this.bs;
      } else {
         this.bs = 1;
      }

      this.bT = var1;
      this.e(var1);
      int var2 = this.y[this.b(var1)];
      this.c(var2);
      this.bv = this.bT;
   }

   public final void keyRepeated(int var1) {}

   public void pointerDragged(int var1, int var2) {}  // 触屏-拉

   public void pointerPressed(int var1, int var2) {  // 触屏-按
      this.bW = 3;
      if(var1 < a() >> 1 && var1 > 0 && var2 < 320 && var2 > 302 && !this.aV && this.e != null) {
         this.br = this.bz;
         if(this.bT == -6) {
            ++this.bs;
         } else {
            this.bs = 1;
         }

         this.bT = -6;
         this.bv = -6;
         this.c(this.y[15]);
      }

      if(var1 < a() && var1 > a() >> 1 && var2 < 320 && var2 > 302 && !this.aV && this.d != null) {
         this.br = this.bz;
         if(this.bT == -7) {
            ++this.bs;
         } else {
            this.bs = 1;
         }

         this.bT = -7;
         this.bv = -7;
         this.c(this.y[16]);
      }

   }

   public void pointerReleased(int var1, int var2) {  // 触屏释放
      this.bW = 1;
      if(var1 < a() >> 1 && var1 > 0 && var2 < 320 && var2 > 302 && !this.aV) {
         this.bv = 0;
         this.d(this.y[15]);
      }

      if(var1 < a() && var1 > a() >> 1 && var2 < 320 && var2 > 302 && !this.aV) {
         this.bv = 0;
         this.d(this.y[15]);
      }

   }

   private void c(int var1) {
      this.bQ |= var1;
      int[] var10000 = this.z;
      int var10001 = this.bP++;
      var10000[var10001] |= var1;
      this.bP &= 255;
   }

   private void d(int var1) {
      this.bQ &= -1 - var1;
      int[] var10000 = this.A;
      int var10001 = this.bP++;
      var10000[var10001] |= var1;
      this.bP &= 255;
   }

   private void e(int var1) {
      this.bp = var1;
      this.B[this.bU++] = var1;
      this.bU &= 15;
   }

   private void c() {
      if(this.bo == 1) {  // 键盘放开
         this.bo = 0;
      }

      if(this.bo == 3) {  // 键盘按下
         this.bo = 2;
      }

      if(this.bo == 0) {
         this.bp = 0;
      }

      if(this.bU != this.bV) {
         ++this.bV;
         this.bV &= 15;
      }

   }

   private void d() {
      if(this.bq == 1) {
         this.bq = 0;
      }

      if(this.bq == 3) {
         this.bq = 2;
      }

      if(this.bW != 0) {
         this.bq = this.bW;
         this.bW = 0;
      }

   }

   private void e() {
      int var1 = this.bP;
      boolean var2 = false;

      do {
         this.bR &= -1 - this.A[this.bO];
         this.bR |= this.z[this.bO];
         this.A[this.bO] = this.z[this.bO] = 0;
         if(this.bO != var1) {
            this.bO = this.bO + 1 & 255;
         } else {
            var2 = true;
         }

         this.bt = this.bR;
         this.bu = (this.bt ^ this.bS) & this.bt;
         this.bS = this.bt;
      } while(this.bu == 0 && this.bt == 0 && !var2);

   }

   public final void b() {
      for(this.bz = 0; this.bz < 256; ++this.bz) {
         this.z[this.bz] = this.A[this.bz] = 0;
      }

      this.bP = this.bQ = this.bR = this.bt = this.bS = this.bu = this.bT = this.br = this.bs = 0;
      this.bO = 255;
   }

   public final void run() {
      this.setFullScreenMode(true);  // 全屏
      Graphics var1 = this.getGraphics();  // 获取绘图区

      while(this.a != 0) {
         if(this.aS) {
            try {
               Thread.sleep(100L);
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         } else if(this.isShown()) {
            this.M = System.currentTimeMillis();
            this.b(var1);
            if(this.aT) {
               this.flushGraphics();  // 刷新绘图区
            }

            this.L = System.currentTimeMillis() - this.M;
            if(this.L < this.O) {
               try {
                  synchronized(this) {
                     this.wait(this.O - this.L);
                  }

                  this.L = System.currentTimeMillis() - this.M;
               } catch (Exception var6) {
                  ;
               }
            }
         }
      }

   }

   public final synchronized void hideNotify() {
      this.bL = 0;
      this.aU = true;
      this.bz = -1;
      ++this.bx;
      this.a(0, System.currentTimeMillis());
   }

   public final synchronized void showNotify() {
      this.bL = 0;
      this.bz = -1;
   }

   private void f() {
      this.bK |= 1;
      this.bK |= 1;
      this.y = x;
      this.z = new int[256];
      this.A = new int[256];
      this.b();
      this.B = new int[16];
   }

   public final synchronized void b(Graphics var1) {
      try {
         if(a()) {
            if(!this.aR) {
               ++this.bz;
               this.a = var1;
               this.a.setClip(0, 0, a(), b());
               if(this.bK != 7) {
                  if(this.bz == 0) {
                     this.a((StringBuffer)null, (StringBuffer)null);
                  }

                  this.a.setColor(bD);
                  this.a.setClip(0, 0, a(), b());
                  this.a.fillRect(0, 0, a(), b());
                  if(this.O != 0L) {
                     this.N = this.O;
                  }

                  this.O = 0L;
                  this.bw += w.a().a();
                  this.bw += ac.a().a();
                  if((this.bK & 2) == 0 && w.a().a()) {
                     this.bL = w.a().a() - 1;
                     this.bK |= 2;
                  }

                  if((this.bK & 4) == 0 && ac.a().a()) {
                     this.bL = ac.a().a() - 1;
                     this.bK |= 4;
                  }

                  if(this.bK == 7) {
                     this.bL = this.bw - 1;
                     this.bz = -1;
                     this.O = this.N;
                  }

                  ++this.bL;
                  if(a != null) {
                     this.a.drawImage(a, bA, bB, bC);
                  }

                  this.b(this.a, bE, bF, bG, bH, this.bL, this.bw, bI, bJ);
               } else {
                  int var2 = this.bx;
                  if(this.aQ) {
                     this.a(3, System.currentTimeMillis());
                     this.aQ = false;
                  }

                  if(this.aU) {
                     this.b();
                     this.a((StringBuffer)null, (StringBuffer)null);
                     this.a.setColor(bD);
                     this.a.fillRect(0, 0, a(), b());
                     this.bz = 0;
                     this.a(1, System.currentTimeMillis());
                  }

                  this.e();
                  this.a(this.a);
                  if(!this.aV) {
                     if(this.d == null && this.e == null) {
                        this.a.setClip(0, b(), a(), d());
                        this.a.setColor(4210752);
                        this.a.drawLine(0, b(), a(), b());
                        this.a.setColor(12566463);
                        this.a.fillRect(0, b() + 1, a(), d());
                        this.a.setColor(4210752);
                        this.a.drawLine(a() / 2, b() + 3, a() / 2, b() + d());
                        this.a.setColor(0);
                        a = Font.getFont(0, 0, c());
                        this.a.setFont(a);
                     }

                     if(this.d != this.f || this.e != this.g) {
                        if(this.d != null || this.e != null) {
                           this.a.setClip(0, b(), a(), d());
                           this.a.setColor(4210752);
                           this.a.drawLine(0, b(), a(), b());
                           this.a.setColor(12566463);
                           this.a.fillRect(0, b() + 1, a(), d());
                           this.a.setColor(4210752);
                           this.a.drawLine(a() / 2, b() + 3, a() / 2, b() + d());
                           this.a.setColor(0);
                           a = Font.getFont(0, 0, c());
                           this.a.setFont(a);
                        }

                        if(this.d != null) {
                           this.a.drawString(this.d.toString(), a() - 2, b() + 2, 24);
                        }

                        if(this.e != null) {
                           this.a.drawString(this.e.toString(), 2, b() + 2, 20);
                        }

                        this.f = this.d;
                        this.g = this.e;
                     }

                     this.a.setClip(0, 0, a(), b());
                  }

                  this.c();
                  this.d();
                  if(var2 == this.bx) {
                     this.aU = false;
                  }
               }
            }
         } else {
            var1.setColor(16777215);
            var1.fillRect(0, 0, a(), b());
            var1.setColor(16711680);
            var1.drawString("*UNAUTHORIZED*", 0, 2 * f(), 20);
         }

      } catch (f var4) {
         this.bK = 7;
         this.a(9, System.currentTimeMillis());
         System.gc();
      } catch (Exception var5) {
         this.aR = true;
         this.a(6, System.currentTimeMillis());
         System.out.println("Canvas : Uncaught Exception : " + var5 + "\n --message : " + var5.getMessage());
         var5.printStackTrace();
      }
   }

}
