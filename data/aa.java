package data;

import data.ac;
import data.k;
import data.p;
import java.util.Date;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class aa {

   private p a;
   public int a;
   private int J;
   public int b;
   public int c;
   public int d;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   public int h = 0;
   public int i = 0;
   public int j = 0;
   private int K = 0;
   private StringBuffer e;
   private StringBuffer f;
   public StringBuffer a;
   public int k = 0;
   public int l = Font.getFont(0, 1, 8).charWidth('a');
   public boolean a = true;
   public StringBuffer b;
   public StringBuffer c;
   public int m = 0;
   private boolean b = true;
   private boolean c = true;
   private boolean d = true;
   private Date a;
   private long a = 0L;
   private long b = 0L;
   private long c = 0L;
   private long d = 0L;
   private long e = 0L;
   private long f = 0L;
   private long g = 0L;
   private boolean e;
   private StringBuffer[] a;
   private int[] a;
   private int L;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   private boolean f;
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
   public StringBuffer d;
   public String a;
   public int H;
   public int I;


   public aa(p var1) {
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
      this.e = true;
      this.a = new StringBuffer[6];
      this.a = new int[6];
      this.L = 0;
      this.n = 0;
      this.o = 0;
      this.p = 0;
      this.q = 0;
      this.r = 0;
      this.s = 0;
      this.t = 0;
      this.f = true;
      this.u = 0;
      this.v = 0;
      this.w = 0;
      this.x = 0;
      this.y = 0;
      this.z = 0;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = 0;
      this.F = 0;
      this.G = 0;
      this.a = new String("");
      this.H = 0;
      this.I = 0;
      this.a = var1;
      if(k.b() < 160) {
         this.b = 655360;
         this.c = 655361;
         this.d = 655362;
         this.a = 26;
         this.J = -3;
         this.e = 7;
         this.f = 15;
         this.g = 7;
         this.h = 7;
      } else if(k.b() < 205) {
         this.b = 655375;
         this.c = 655376;
         this.d = 655377;
         this.a = 26;
         this.J = -3;
         this.e = 7;
         this.f = 15;
         this.g = 7;
         this.h = 7;
      } else if(k.b() < 290) {
         this.b = 655375;
         this.c = 655376;
         this.d = 655377;
         this.a = 28;
         this.J = -3;
         this.e = 0;
         this.f = 0;
         this.g = 0;
         this.h = 0;
      } else if(k.b() < 321) {
         this.b = 655375;
         this.c = 655376;
         this.d = 655377;
         this.a = 28;
         this.J = -3;
         this.e = 0;
         this.f = 0;
         this.g = 0;
         this.h = 0;
      } else {
         this.b = 655375;
         this.c = 655376;
         this.d = 655377;
         this.a = 28;
         this.J = -3;
         this.e = 0;
         this.f = 0;
         this.g = 0;
         this.h = 0;
      }
   }

   public final void a() {
      if(this.a.aw) {
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.aw = false;
         this.a.a.a(this.a.a, 917504, k.a() / 2, 0);

         for(int var1 = 1; var1 < this.a.b + 1; ++var1) {
            this.a.a.a(this.a.a, this.b, k.a() / 6, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR);

            for(int var2 = 1; var2 < this.a.aK + 1; ++var2) {
               this.a.a.a(this.a.a, this.c, k.a() / 6 + 2 * var2, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR);
            }

            this.a.a.a(this.a.a, this.d, k.a() - k.a() / 6, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR);
            if(var1 == this.a.r + 1) {
               this.L = 16777215;
            } else {
               this.L = '\u99ff';
            }

            if(var1 == 1) {
               if(!this.a.b) {
                  this.L = 4473924;
               }

               this.a.a.a(this.a.a, this.a.a.a(50), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            if(var1 == 2) {
               this.a.a.a(this.a.a, this.a.a.a(51), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            if(var1 == 3) {
               this.a.a.a(this.a.a, this.a.a.a(52), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            if(var1 == 4) {
               this.a.a.a(this.a.a, this.a.a.a(53), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            if(var1 == 5) {
               this.a.a.a(this.a.a, this.a.a.a(54), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            if(var1 == 6 && this.a.a) {
               this.a.a.a(this.a.a, this.a.a.a(111), k.a() >> 1, k.b() / this.a.b + 1 + (this.a.aP + this.a.aL - this.a.aQ) * var1 - this.a.aR + (this.a.aP - this.a.aJ) / 2, this.L, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }
         }

         if(this.a.hasPointerEvents()) {
            if(this.a.aW != 0) {
               this.a.bl = 0;
               this.a.bm = 20;
            } else {
               this.a.bl = k.b() - 20;
               this.a.bm = k.b();
            }
         }

         this.a.a.a(this.a.a, this.a.a.a(55), this.a.bb, this.a.bc, '\u99ff', 64 | this.a.ba | 256, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.a(this.a.a, this.a.a.a(56), this.a.bd, this.a.be, '\u99ff', 328, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }

   public final void a(StringBuffer var1) {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var2;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 0);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655376, 2 * var2, 0);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 0);
            this.a.a.a(this.a.a, var1, k.a() >> 1, (24 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 0);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655361, 2 * var2, 0);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 0);
            this.a.a.a(this.a.a, var1, k.a() >> 1, (16 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         if(this.a.A == 0) {
            this.K = 16777215;
         } else {
            this.K = '\u99ff';
         }

         if(this.a.ah) {
            this.e = (new StringBuffer()).append(this.a.a.a(47));
         } else {
            this.e = (new StringBuffer()).append(this.a.a.a(48));
         }

         this.a.a.a(this.a.a, this.e, k.a() >> 1, k.b() / 2 - this.a.aJ * 2, this.K, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         if(this.a.A == 1) {
            this.K = 16777215;
         } else {
            this.K = '\u99ff';
         }

         this.f = (new StringBuffer()).append(this.a.a.a(49));
         this.a.a.a(this.a.a, this.f, k.a() >> 1, k.b() / 2 + this.a.aJ, this.K, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.c();
      }

   }

   public final void a(int var1, int var2) {
      if(this.a.l) {
         this.a = this.a.a.a(var2);
         this.a.a.a(this.a, k.a() >> 1, 32, k.a(), k.b() - 32 - 20 - 5);
         this.a.l = false;
      }

      if(this.a.n) {
         this.a.n = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var3;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 0);

            for(var3 = 1; var3 < this.a.aV + 1; ++var3) {
               this.a.a.a(this.a.a, 655376, 2 * var3, 0);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 0);
            this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (24 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 0);

            for(var3 = 1; var3 < this.a.aV + 1; ++var3) {
               this.a.a.a(this.a.a, 655361, 2 * var3, 0);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 0);
            this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (16 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         ac.c(Integer.parseInt(this.a.b.elementAt(this.a.h).toString()));
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, this.a, k.a() >> 1, 40, 16777215, 1041, 0, 1, 8, this.a.aJ, k.a(), k.b() - 32 - 20 - 5, 0, 0);
         } else {
            this.a.a.a(this.a.a, this.a, k.a() >> 1, 32, 16777215, 1041, 0, 1, 8, this.a.aJ, k.a(), k.b() - 32 - 20 - 5, 0, 0);
         }

         this.c();
      }

      if(this.a.m) {
         if(this.a.hasPointerEvents()) {
            this.a.a.a((k.a() >> 1) - 12, 29, k.b() - 24);
            return;
         }

         this.a.a.a((k.a() >> 1) - 8, 21, k.b() - 16);
      }

   }

   public final void a(int var1) {
      byte var2;
      int var3;
      if(this.a.hasPointerEvents()) {
         var2 = 29;
         var3 = k.b() - 24;
      } else {
         var2 = 21;
         var3 = k.b() - 16;
      }

      boolean var4 = false;
      int var6 = (k.b() - 37 - 20) / (this.a.aJ + 5);
      int var7 = var2 + 8 + 5;
      boolean var8 = false;
      int var9 = 0;
      int var10 = 0;
      if(this.a.l) {
         this.a.a.addElement(new Integer(0));

         while(var10 + 1 != this.a.e) {
            while(true) {
               if(var9 < var6) {
                  int var12 = this.a.a.a((Graphics)null, this.a.a.a(33 + var10), 20, var7 + 5, this.k, 20, 0, 1, 8, this.a.aJ, k.a() - 40, k.b(), 0, 0);
                  this.m = (var12 - var7) / this.a.aJ;
                  var9 += this.m;
                  var7 = var12;
                  ++var10;
                  if(var10 != this.a.e) {
                     continue;
                  }
               }

               this.a.a.addElement(new Integer(var10));
               --var10;
               var9 = 0;
               var7 = var2 + 8 + 5;
               break;
            }
         }

         this.a.l = false;
      } else {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.a.setColor(13158);
            this.a.a.fillRect(0, 0, k.a(), k.b());
            int var11;
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, 655375, 0, 0);

               for(var11 = 1; var11 < this.a.aV + 1; ++var11) {
                  this.a.a.a(this.a.a, 655376, 2 * var11, 0);
               }

               this.a.a.a(this.a.a, 655377, k.a() - 2, 0);
               this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (24 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            } else {
               this.a.a.a(this.a.a, 655360, 0, 0);

               for(var11 = 1; var11 < this.a.aV + 1; ++var11) {
                  this.a.a.a(this.a.a, 655361, 2 * var11, 0);
               }

               this.a.a.a(this.a.a, 655362, k.a() - 2, 0);
               this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (16 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }

            var7 = var2 + 8 + 5;

            for(var11 = ((Integer)this.a.a.elementAt(this.a.f)).intValue(); var11 < ((Integer)this.a.a.elementAt(this.a.g)).intValue(); ++var11) {
               if(var11 == this.a.d) {
                  this.k = 16777215;
               } else {
                  this.k = '\u99ff';
               }

               var7 = this.a.a.a(this.a.a, this.a.a.a(33 + var11), 20, var7 + 5, this.k, 20, 0, 1, 8, this.a.aJ, k.a() - 40, k.b(), 0, 0);
            }

            this.c();
         }

         if(this.a.e > ((Integer)this.a.a.elementAt(1)).intValue() && (this.a.n != 1 || this.a.m == 2)) {
            if(this.a.n > 500L) {
               if(this.a.h) {
                  this.a.h = false;
               }

               if(this.a.i) {
                  this.a.i = false;
               }
            }

            if(this.a.hasPointerEvents()) {
               if(this.a.h) {
                  this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, var2);
               } else if(this.a.f > 0) {
                  this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, var2);
               } else {
                  this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, var2);
               }

               if(this.a.i) {
                  this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var3);
                  return;
               }

               if(((Integer)this.a.a.elementAt(this.a.g)).intValue() < this.a.e) {
                  this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var3);
                  return;
               }

               this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var3);
               return;
            }

            if(this.a.h) {
               this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, var2);
            } else if(this.a.f > 0) {
               this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, var2);
            } else {
               this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, var2);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var3);
               return;
            }

            if(((Integer)this.a.a.elementAt(this.a.g)).intValue() < this.a.e) {
               this.a.a.a(this.a.a, 655406, (k.a() >> 1) - 8, var3);
               return;
            }

            this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var3);
         }

      }
   }

   public final void a(int var1, StringBuffer var2, int[] var3, int var4, StringBuffer var5) {
      if(this.a.l) {
         this.a = var2;
         if(var3 == null) {
            if(this.a.hasPointerEvents()) {
               this.j = 29;
               this.i = k.b() - 53 - 20;
            } else {
               this.j = 21;
               this.i = k.b() - 37 - 20;
            }
         } else if(var5 == null) {
            if(this.a.hasPointerEvents()) {
               this.j = 68;
               this.i = k.b() - 92 - 20;
            } else {
               this.j = 52;
               this.i = k.b() - 68 - 20;
            }
         } else if(this.a.hasPointerEvents()) {
            this.j = 88;
            this.i = k.b() - 112 - 20;
         } else {
            this.j = 72;
            this.i = k.b() - 88 - 20;
         }

         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a, k.a() >> 1, this.j + 16, k.a(), this.i);
         } else {
            this.a.a.a(this.a, k.a() >> 1, this.j + 24, k.a(), this.i);
         }

         this.a.l = false;
      }

      if(this.a.n) {
         this.a.n = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var6;
         int var7;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 0);

            for(var6 = 1; var6 < this.a.aV + 1; ++var6) {
               this.a.a.a(this.a.a, 655376, 2 * var6, 0);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 0);
            this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (24 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            if(var3 != null) {
               for(var7 = 0; var7 < var3.length; ++var7) {
                  this.a.a.a(this.a.a, this.a.u[1], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 48);
                  if(var3[var7] == var4) {
                     this.a.a.a(this.a.a, this.a.u[0], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 48);
                  }

                  this.a.a.a(this.a.a, this.a.u[var3[var7]], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 48);
               }
            }
         } else {
            this.a.a.a(this.a.a, 655360, 0, 0);

            for(var6 = 1; var6 < this.a.aV + 1; ++var6) {
               this.a.a.a(this.a.a, 655361, 2 * var6, 0);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 0);
            this.a.a.a(this.a.a, this.a.a.a(var1), k.a() >> 1, (16 - this.a.aJ) / 2, '\u99ff', 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            if(var3 != null) {
               for(var7 = 0; var7 < var3.length; ++var7) {
                  this.a.a.a(this.a.a, this.a.u[1], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 32);
                  if(var3[var7] == var4) {
                     this.a.a.a(this.a.a, this.a.u[0], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 32);
                  }

                  this.a.a.a(this.a.a, this.a.u[var3[var7]], k.a() / 2 - ((var3.length - 1) * 10 + (var3.length - 1) * 3) + var7 * 26, 32);
               }
            }
         }

         if(this.a.hasPointerEvents()) {
            if(var5 != null) {
               this.a.a.a(this.a.a, 655375, 0, 68);

               for(var6 = 1; var6 < this.a.aV + 1; ++var6) {
                  this.a.a.a(this.a.a, 655376, 2 * var6, 68);
               }

               this.a.a.a(this.a.a, 655377, k.a() - 2, 68);
               this.a.a.a(this.a.a, var5, k.a() >> 1, 68 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               this.a.a.a(this.a.a, 655411, 12, 68);
               this.a.a.a(this.a.a, 655412, k.a() - 24, 68);
            }
         } else if(var5 != null) {
            this.a.a.a(this.a.a, 655360, 0, 52);

            for(var6 = 1; var6 < this.a.aV + 1; ++var6) {
               this.a.a.a(this.a.a, 655361, 2 * var6, 52);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 52);
            this.a.a.a(this.a.a, var5, k.a() >> 1, 52 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            this.a.a.a(this.a.a, 655399, 8, 52);
            this.a.a.a(this.a.a, 655400, k.a() - 16, 52);
         }

         ac.c(Integer.parseInt(this.a.b.elementAt(this.a.h).toString()));
         if(ac.b() != -1) {
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, this.a, k.a() >> 1, this.j + 12 + 8, 16777215, 1041, 0, 1, 8, this.a.aJ, k.a(), this.i, 0, 0);
            } else {
               this.a.a.a(this.a.a, this.a, k.a() >> 1, this.j + 16, 16777215, 1041, 0, 1, 8, this.a.aJ, k.a(), this.i, 0, 0);
            }
         }

         this.c();
      }

      if(this.a.m) {
         if(this.a.hasPointerEvents()) {
            this.a.a.a((k.a() >> 1) - 12, this.j, k.b() - 24);
            return;
         }

         this.a.a.a((k.a() >> 1) - 8, this.j, k.b() - 16);
      }

   }

   public final void b() {
      int var1 = (int)(this.a.a * 100.0F / this.a.d);
      int var2 = (int)(this.a.b * 100.0F / this.a.d);
      int var3 = (int)(this.a.c * 100.0F / this.a.d);
      this.a.a.a(this.a.a, 655360, 0, 0);

      for(int var4 = 1; var4 < this.a.aV + 1; ++var4) {
         this.a.a.a(this.a.a, 655361, 2 * var4, 0);
      }

      this.a.a.a(this.a.a, 655362, k.a() - 2, 0);
      this.a.a.setColor(0);
      this.a.a.a(this.a.a, 655363, 2, 4);
      this.a.a.fillRect(14, 6, k.a() / 3 - 16, 4);
      int var5;
      if(this.b && var1 <= 10) {
         this.a.I += this.a.f;
         if(this.a.I > 300L) {
            this.b = false;
            this.a.a.setColor(16777215);
            this.a.a.fillRect(14, 6, (k.a() / 3 - 16) * var1 / 100, 4);
            this.a.I = 0L;
         }
      } else {
         this.b = true;

         for(var5 = 0; (float)var5 < this.a.a; ++var5) {
            this.a.a.a(this.a.a, 655366, 14 + 1 * var5, 6);
         }
      }

      this.a.a.setColor(0);
      this.a.a.a(this.a.a, 655364, k.a() / 3 + 4 - 2, 4);
      this.a.a.fillRect(k.a() / 3 + 16 - 2, 6, k.a() / 3 - 16, 4);
      if(this.c && var2 <= 10) {
         this.a.I += this.a.f;
         if(this.a.I > 300L) {
            this.c = false;
            this.a.a.setColor(16777215);
            this.a.a.fillRect(k.a() / 3 + 16 - 2, 6, (k.a() / 3 - 16) * var2 / 100, 4);
            this.a.I = 0L;
         }
      } else {
         this.c = true;

         for(var5 = 0; (float)var5 < this.a.b; ++var5) {
            this.a.a.a(this.a.a, 655367, k.a() / 3 + 16 - 2 + 1 * var5, 6);
         }
      }

      this.a.a.setColor(0);
      this.a.a.a(this.a.a, 655365, k.a() / 3 * 2 + 4 - 2, 4);
      this.a.a.fillRect(k.a() / 3 * 2 + 16 - 2, 6, k.a() / 3 - 16, 4);
      if(this.d && var3 <= 10) {
         this.a.I += this.a.f;
         if(this.a.I > 300L) {
            this.a.a.setColor(16777215);
            this.a.a.fillRect(k.a() / 3 * 2 + 16 - 2, 6, (k.a() / 3 - 16) * var3 / 100, 4);
            this.d = false;
            this.a.I = 0L;
         }
      } else {
         this.d = true;

         for(var5 = 0; (float)var5 < this.a.c; ++var5) {
            this.a.a.a(this.a.a, 655368, k.a() / 3 * 2 + 16 - 2 + 1 * var5, 6);
         }
      }

      if(this.a.m != 7) {
         this.c();
      }

   }

   public final void c() {
      if(this.a.m == 6) {
         if(this.a.ak == 1 && this.a.am == 1) {
            if(this.a.G && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1 && this.a.am == 2) {
            if(this.a.G && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1 && this.a.am == 3) {
            if(this.a.G && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1 && this.a.am == 4) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1 && this.a.am == 5) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1 && this.a.am == 6) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 1) {
            if(this.a.G) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 2) {
            if(this.a.G && this.a.H) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 3) {
            if(this.a.G && this.a.H && this.a.I) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         } else if(this.a.ak == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L) {
               this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
            } else {
               this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
            }
         }
      } else if(this.a.m == 8) {
         if(this.a.aw > 0) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else if(this.a.m == 1 && this.a.s == 1) {
         this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
      } else if(this.a.m == 1 && this.a.s == 2) {
         if(!this.a.v) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else if(this.a.m == 1 && this.a.s == 3) {
         if(!this.a.S) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else if(this.a.m == 1 && this.a.s == 4) {
         this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
      } else if(this.a.m == 1 && this.a.s == 0) {
         if(this.a.aB > 0) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else if(this.a.m == 1 && this.a.s == 5) {
         if(this.a.av > 0) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else if(this.a.m == 5) {
         if(this.a.ay > 0) {
            this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
         } else {
            this.a.a.a(this.a.a, 655381, this.a.aW, this.a.aX);
         }
      } else {
         this.a.a.a(this.a.a, 655378, this.a.aW, this.a.aX);
      }

      if(this.a.aW != 0) {
         if(this.a.k == 0 && (this.a.l == 2 || this.a.l == 3 || this.a.l == 4 || this.a.l == 10)) {
            if(this.a.hasPointerEvents()) {
               this.a.aZ = 24;
               this.a.bl = 24;
               this.a.bm = 44;
            } else {
               this.a.aZ = 16;
               this.a.bl = 16;
               this.a.bm = 36;
            }
         } else if(this.a.k == 0 && this.a.l == 6 && (this.a.m == 3 || this.a.m == 4 || this.a.m == 5 || this.a.m == 8)) {
            if(this.a.hasPointerEvents()) {
               this.a.aZ = 40;
               this.a.bl = 40;
               this.a.bm = 60;
            } else {
               this.a.aZ = 32;
               this.a.bl = 32;
               this.a.bm = 52;
            }
         } else if(this.a.k == 0 && this.a.l == 6 && this.a.m == 6) {
            if(this.a.ae) {
               this.a.aZ = 16;
               this.a.bl = 16;
               this.a.bm = 36;
            } else if(this.a.hasPointerEvents()) {
               this.a.aZ = 40;
               this.a.bl = 40;
               this.a.bm = 60;
            } else {
               this.a.aZ = 32;
               this.a.bl = 32;
               this.a.bm = 52;
            }
         } else if(this.a.k == 0 && this.a.l == 5) {
            if(this.a.hasPointerEvents()) {
               this.a.aZ = 40;
               this.a.bl = 40;
               this.a.bm = 60;
            } else {
               this.a.aZ = 32;
               this.a.bl = 32;
               this.a.bm = 52;
            }
         } else if(this.a.k == 0 && this.a.l == 6 && this.a.m == 1) {
            if(this.a.hasPointerEvents()) {
               this.a.aZ = 40;
               this.a.bl = 40;
               this.a.bm = 60;
            } else {
               this.a.aZ = 32;
               this.a.bl = 32;
               this.a.bm = 52;
            }
         } else if(this.a.k == 0 && this.a.l == 6 && (this.a.m == 10 || this.a.m == 9 || this.a.m == 7 || this.a.m == 0)) {
            this.a.aZ = 16;
            this.a.bl = 16;
            this.a.bm = 36;
         }
      } else {
         this.a.aZ = k.b() - 20;
         this.a.bl = k.b() - 20;
         this.a.bm = k.b();
      }

      this.a.a.a(this.a.a, 655379, this.a.aY, this.a.aZ);
   }

   public final void d() {
      this.a = new Date();
      this.a = this.a.getTime();
      this.b = this.a / 1000L / 60L / 60L;
      this.c = this.b * 60L * 60L * 1000L;
      this.d = this.a - this.c;
      this.a.J = this.d / 1000L / 60L;
      this.e = 17257200L + this.b;
      this.f = this.e / 24L;
      this.g = this.f * 24L;
      if(this.a.ah) {
         this.a.K = this.e - this.g + 2L;
      } else {
         this.a.K = this.e - this.g + 1L;
      }

      if(this.a.d) {
         this.a.d = false;
         this.a.a = this.f;
      }

      this.a.aG = (int)(this.f - this.a.a) + 1;
      this.a.a = (new StringBuffer()).append(this.a.K + ":" + this.a.J);
   }

   public final void e() {
      if(this.a.aM) {
         if(this.a.F < 333L) {
            this.a.aS = 852012;
         } else if(this.a.F < 666L) {
            this.a.aS = 852013;
         } else {
            if(this.a.F >= 999L) {
               this.a.af = true;
               this.a.aM = false;
               if(this.a.X) {
                  this.a.a.a(this.a.P + 180);
                  this.a.l[this.a.P + 180] = 0;
               } else if(this.a.Y) {
                  this.a.a.a(this.a.P + 180 + 2);
                  this.a.l[this.a.P + 180 + 2] = 0;
               } else if(this.a.V) {
                  this.a.a.a(this.a.P + 1);
                  this.a.l[this.a.P + 1] = 0;
               } else if(this.a.W) {
                  this.a.a.a(this.a.P + 360 + 1);
                  this.a.l[this.a.P + 360 + 1] = 0;
               }

               this.a.m = 0;
               this.f();
               this.a.aw = true;
               return;
            }

            this.a.aS = 852014;
         }
      }

      if((this.a.j || this.a.k) && this.a.az || this.a.aM) {
         this.a.a.a();
      }

      if(this.e) {
         if(this.a.C > 3) {
            if(this.a.hasPointerEvents()) {
               this.a.aq = this.a.C;
            } else {
               this.a.aq = 3;
            }
         } else {
            this.a.aq = this.a.C;
         }

         this.a.x = this.a.aq / 2;
         if(this.a.C > 0) {
            this.e = false;
         }
      }

      int var1 = this.a.aq * 20 + (this.a.aq - 1) * 6;
      int var2 = 0;
      int var3 = 0;
      int var4 = this.a.aq;
      if(this.a.C > 0) {
         if(!this.a.hasPointerEvents() && this.a.C > 3) {
            var3 = this.a.x - 1;
            var4 = this.a.x + 2;
            if(this.a.x == 0) {
               var3 = 0;
               var4 = 3;
            }

            if(this.a.x == this.a.C - 1) {
               var3 = this.a.x - 2;
               var4 = this.a.x + 1;
            }
         }

         for(int var5 = var3; var5 < var4; ++var5) {
            if((k.a() >> 1) - (var1 >> 1) + 26 * var2 - 26 * (this.a.x - var4 / 2) <= (k.a() >> 1) + (var1 >> 1) && (k.a() >> 1) - (var1 >> 1) + 26 * var2 - 26 * (this.a.x - var4 / 2) >= (k.a() >> 1) - (var1 >> 1)) {
               if((this.a.n == 1 || this.a.m != 1) && (this.a.p == 1 || this.a.m != 8)) {
                  if(var5 == this.a.x) {
                     this.a.a.a(this.a.a, 655383, (k.a() >> 1) - (var1 >> 1) + 26 * var2 + 10 - 26 * (this.a.x - var4 / 2), this.a.aU - 10);
                     this.a.a.a(this.a.a, 655382, (k.a() >> 1) - (var1 >> 1) + 26 * var2 + 10 - 26 * (this.a.x - var4 / 2), this.a.aU - 10);
                  } else {
                     this.a.a.a(this.a.a, 655384, (k.a() >> 1) - (var1 >> 1) + 26 * var2 + 10 - 26 * (this.a.x - var4 / 2), this.a.aU - 10);
                  }

                  this.a.a.a(this.a.a, this.a.t[var5], (k.a() >> 1) - (var1 >> 1) + 26 * var2 + 10 - 26 * (this.a.x - var4 / 2), this.a.aU - 10);
               } else {
                  this.a.a.a(this.a.a, 655384, (k.a() >> 1) - (var1 >> 1) + 26 * var2 + 10 - 26 * (this.a.x - var4 / 2), this.a.aU - 10);
               }
            }

            ++var2;
         }
      }

      if(!this.a.hasPointerEvents()) {
         if(this.a.C > 0) {
            if((this.a.n == 1 || this.a.m != 1) && (this.a.p == 1 || this.a.m != 8)) {
               if(this.a.j) {
                  this.a.a.a(this.a.a, 655401, (k.a() >> 1) - (var1 >> 1) - 3 - 8, this.a.aU - 20 - this.J);
               } else if(this.a.x == 0) {
                  this.a.a.a(this.a.a, 655403, (k.a() >> 1) - (var1 >> 1) - 3 - 8, this.a.aU - 20 - this.J);
               } else {
                  this.a.a.a(this.a.a, 655399, (k.a() >> 1) - (var1 >> 1) - 3 - 8, this.a.aU - 20 - this.J);
               }

               if(this.a.k) {
                  this.a.a.a(this.a.a, 655402, (k.a() >> 1) + (var1 >> 1) + 5, this.a.aU - 20 - this.J);
               } else if(this.a.x == this.a.C - 1) {
                  this.a.a.a(this.a.a, 655404, (k.a() >> 1) + (var1 >> 1) + 5, this.a.aU - 20 - this.J);
               } else {
                  this.a.a.a(this.a.a, 655400, (k.a() >> 1) + (var1 >> 1) + 5, this.a.aU - 20 - this.J);
               }
            } else {
               this.a.a.a(this.a.a, 655403, (k.a() >> 1) - (var1 >> 1) - 3 - 8, this.a.aU - 20 - this.J);
               this.a.a.a(this.a.a, 655404, (k.a() >> 1) + (var1 >> 1) + 5, this.a.aU - 20 - this.J);
            }
         }

         if(this.a.l > 500L) {
            if(this.a.j) {
               this.a.j = false;
            }

            if(this.a.k) {
               this.a.k = false;
            }
         }
      }

   }

   public final void f() {
      this.a.C = 0;
      this.a.x = 1;
      this.e = true;
   }

   public final void g() {
      this.a[0] = this.a.a.a(70);
      this.a[1] = this.a.a.a(71);
      this.a[2] = this.a.a.a(72);
      this.a[3] = this.a.a.a(73);
      this.a[4] = this.a.a.a(74);
      this.a[5] = this.a.a.a(75);
      this.a[0] = 655369;
      this.a[1] = 655370;
      this.a[2] = 655371;
      this.a[3] = 655372;
      this.a[4] = 655373;
      this.a[5] = 655374;
   }

   public final void h() {
      if(this.a.b) {
         this.a.r = 0;
      } else {
         this.a.r = 1;
      }

      this.a.n = 0;
      this.a.au = 0;
      this.a.z = 0;
      this.a.x = 1;
      this.a.aw = true;
   }

   public final void i() {
      if(this.a.hasPointerEvents()) {
         if((this.a.n != 1 || this.a.m == 2) && (this.a.n != 3 || !this.a.v) && (this.a.n != 5 || !this.a.S)) {
            if(this.a.f) {
               this.a.a.a(this.a.a, 655413, 8, 16);
            } else {
               this.a.a.a(this.a.a, 655411, 8, 16);
            }

            if(this.a.g) {
               this.a.a.a(this.a.a, 655414, k.a() - 8 - 12, 16);
            } else {
               this.a.a.a(this.a.a, 655412, k.a() - 8 - 12, 16);
            }
         }
      } else if((this.a.n != 1 || this.a.m == 2) && (this.a.n != 3 || !this.a.v) && (this.a.n != 5 || !this.a.S)) {
         if(this.a.f) {
            this.a.a.a(this.a.a, 655401, 8, 16);
         } else {
            this.a.a.a(this.a.a, 655399, 8, 16);
         }

         if(this.a.g) {
            this.a.a.a(this.a.a, 655402, k.a() - 16, 16);
         } else {
            this.a.a.a(this.a.a, 655400, k.a() - 16, 16);
         }
      }

      if(this.a.m > 500L) {
         if(this.a.f) {
            this.a.f = false;
         }

         if(this.a.g) {
            this.a.g = false;
         }
      }

   }

   public final void j() {
      if(this.a.s == 0) {
         this.a(this.a.a.a(57), this.a.m);
         if(this.a.n == 1) {
            this.e();
            return;
         }
      } else {
         if(this.a.s == 1) {
            this.d(this.a.a.a(58));
            return;
         }

         if(this.a.s == 2) {
            this.e(this.a.a.a(60));
            return;
         }

         if(this.a.s == 3) {
            this.a.a.d(this.a.a.a(67));
            return;
         }

         if(this.a.s == 4) {
            this.a.a.e(this.a.a.a(68));
            return;
         }

         if(this.a.s == 5) {
            this.f(this.a.a.a(65));
            if(this.a.n == 1) {
               this.e();
            }
         }
      }

   }

   private void a(StringBuffer var1, byte[] var2) {
      int var3;
      if(this.a.hasPointerEvents()) {
         var3 = 52 + this.a.aI * this.a.as;
      } else {
         var3 = 40 + this.a.aI * this.a.as;
      }

      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());

         for(int var4 = 0; var4 < this.a.as; ++var4) {
            if(var4 % 2 == 0) {
               if(this.a.au % 2 == 0) {
                  this.a.a.setColor(10061);
               } else {
                  this.a.a.setColor(6965);
               }
            } else if(this.a.au % 2 == 0) {
               this.a.a.setColor(6965);
            } else {
               this.a.a.setColor(10061);
            }

            if(this.a.hasPointerEvents()) {
               this.a.a.fillRect(0, 52 + var4 * this.a.aI, k.a(), this.a.aI);
            } else {
               this.a.a.fillRect(0, 40 + var4 * this.a.aI, k.a(), this.a.aI);
            }
         }

         int var5;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var5 = 1; var5 < this.a.aV + 1; ++var5) {
               this.a.a.a(this.a.a, 655376, 2 * var5, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var5 = 1; var5 < this.a.aV + 1; ++var5) {
               this.a.a.a(this.a.a, 655361, 2 * var5, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         this.a.at = this.a.aB;
         if(this.a.at > this.a.as) {
            if(this.a.hasPointerEvents()) {
               if(this.a.l == 6 && this.a.m == 1 && this.a.n == 0 || this.a.n == 1) {
                  if(this.a.at - this.a.au < this.a.as) {
                     this.a.at = this.a.aB - this.a.au;
                  } else {
                     this.a.at = this.a.as;
                  }
               }
            } else {
               this.a.at = this.a.as;
            }
         }

         for(var5 = this.a.au; var5 < this.a.at + this.a.au; ++var5) {
            if(var5 == this.a.z) {
               this.k = 16777215;
            } else {
               this.k = '\u99ff';
            }

            StringBuffer var6 = (new StringBuffer()).append(this.a.b[var2[var5]]).append(".." + this.a.q[var5]);
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, var6, k.a() >> 1, 52 + this.a.aI * (var5 - this.a.au) + this.a.aI / 2 + 4, this.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            } else {
               this.a.a.a(this.a.a, var6, k.a() >> 1, 40 + this.a.aI * (var5 - this.a.au) + this.a.aI / 2 + 4, this.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }
         }
      }

      if(this.a.n == 1 && this.a.m != 2) {
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
            this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var3);
         } else {
            this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
            this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var3);
         }
      } else {
         if(this.a.hasPointerEvents()) {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, 40);
            } else if(this.a.au > 0) {
               this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, 40);
            } else {
               this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var3);
            } else if(this.a.aB > this.a.at && this.a.at + this.a.au < this.a.aB) {
               this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var3);
            } else {
               this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var3);
            }
         } else {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, 32);
            } else if(this.a.au > 0) {
               this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, 32);
            } else {
               this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var3);
            } else if(this.a.aB > this.a.at && this.a.at + this.a.au < this.a.aB) {
               this.a.a.a(this.a.a, 655406, (k.a() >> 1) - 8, var3);
            } else {
               this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var3);
            }
         }

         if(this.a.n > 500L) {
            if(this.a.h) {
               this.a.h = false;
            }

            if(this.a.i) {
               this.a.i = false;
            }
         }
      }

      this.i();
   }

   private void d(StringBuffer var1) {
      int var2 = (int)(this.a.a * 100.0F / this.a.d);
      int var3 = (int)(this.a.b * 100.0F / this.a.d);
      int var4 = (int)(this.a.c * 100.0F / this.a.d);
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var5;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var5 = 1; var5 < this.a.aV + 1; ++var5) {
               this.a.a.a(this.a.a, 655376, 2 * var5, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var5 = 1; var5 < this.a.aV + 1; ++var5) {
               this.a.a.a(this.a.a, 655361, 2 * var5, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         var5 = 32 + (k.b() - 52 - 6 * (this.a.aL * 3 / 2 + 12)) / 2;
         this.a.a.a(this.a.a, 655393, k.a() >> 3, var5 + 6);
         this.a.a.a(this.a.a, 655394, k.a() >> 3, var5 + (12 + this.a.aL * 1) * 1 + 6);
         this.a.a.a(this.a.a, 655395, k.a() >> 3, var5 + (12 + this.a.aL * 1) * 2 + 6);
         this.a.a.a(this.a.a, 655396, k.a() >> 3, var5 + (12 + this.a.aL * 1) * 3 + 6);
         this.a.a.a(this.a.a, 655397, k.a() >> 3, var5 + (12 + this.a.aL * 1) * 4 + 6);
         this.a.a.a(this.a.a, 655398, k.a() >> 3, var5 + (12 + this.a.aL * 1) * 5 + 6);

         for(int var6 = 0; var6 < 6; ++var6) {
            this.a.a.setColor(0);
            this.a.a.fillRect((k.a() >> 3) + 28, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6, 1 * (int)this.a.d, 8);
            int var7;
            if(var6 == 0) {
               if(var2 <= 10) {
                  if(this.b && var2 <= 10) {
                     this.a.aw = true;
                     this.a.a.setColor(16777215);
                     this.a.a.fillRect((k.a() >> 3) + 28, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6, 1 * (int)this.a.d * var2 / 100, 8);
                  } else {
                     this.a.aw = true;

                     for(var7 = 0; (float)var7 < this.a.a; ++var7) {
                        this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                     }
                  }
               } else {
                  for(var7 = 0; (float)var7 < this.a.a; ++var7) {
                     this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                  }
               }
            } else if(var6 == 1) {
               if(var3 <= 10) {
                  if(this.c) {
                     this.a.aw = true;
                     this.a.a.setColor(16777215);
                     this.a.a.fillRect((k.a() >> 3) + 28, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6, 1 * (int)this.a.d * var3 / 100, 8);
                  } else {
                     this.a.aw = true;

                     for(var7 = 0; (float)var7 < this.a.b; ++var7) {
                        this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                     }
                  }
               } else {
                  for(var7 = 0; (float)var7 < this.a.b; ++var7) {
                     this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                  }
               }
            } else if(var6 == 2) {
               if(var4 <= 10) {
                  if(!this.d) {
                     this.a.aw = true;
                     this.a.a.setColor(16777215);
                     this.a.a.fillRect((k.a() >> 3) + 28, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6, 1 * (int)this.a.d * var4 / 100, 8);
                  } else {
                     this.a.aw = true;

                     for(var7 = 0; (float)var7 < this.a.c; ++var7) {
                        this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                     }
                  }
               } else {
                  for(var7 = 0; (float)var7 < this.a.c; ++var7) {
                     this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
                  }
               }
            } else if(var6 == 3) {
               for(var7 = 0; (float)var7 < this.a.e; ++var7) {
                  this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
               }
            } else if(var6 == 4) {
               for(var7 = 0; (float)var7 < this.a.f; ++var7) {
                  this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
               }
            } else if(var6 == 5) {
               for(var7 = 0; (float)var7 < this.a.g; ++var7) {
                  this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * var7, 7 * var6 + var5 + (6 + this.a.aL * 1) * var6);
               }
            }

            this.a.a.a(this.a.a, this.a[var6], (k.a() >> 3) + 28 + 1 * (int)this.a.d + k.a() / 17, 7 + 7 * var6 + var5 + (6 + this.a.aL * 1) * var6, '\u99ff', 68, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }
      }

      this.i();
   }

   public final void a(StringBuffer var1, int var2) {
      int var3;
      if(this.a.c[var2] == null && var2 > 59 && var2 < 120) {
         this.a.a.a(3);

         for(var3 = 0; var3 < 60; ++var3) {
            this.a.c[var3 + 60] = this.a.a.a(196608 + var3).toString();
         }

         this.a.a.b(3);
         this.a.a();
      }

      if(this.a.l) {
         this.a = (new StringBuffer()).append(this.a.c[var2]);
         this.a.a.a(this.a, k.a() >> 1, 111, k.a(), k.b() - 106 - 20);
         this.a.l = false;
      }

      if(this.a.n) {
         this.a.n = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var3 = 1; var3 < this.a.aV + 1; ++var3) {
               this.a.a.a(this.a.a, 655376, 2 * var3, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var3 = 1; var3 < this.a.aV + 1; ++var3) {
               this.a.a.a(this.a.a, 655361, 2 * var3, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         StringBuffer var4 = (new StringBuffer()).append(this.a.b[var2]);
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, var4, k.a() >> 1, 55, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            if(this.a.f[var2] != -1 && var2 != 18 && var2 != 9 && var2 != 10 && var2 != 17) {
               if(var2 != 4 && var2 != 43 && var2 != 44 && var2 != 51 && var2 != 52 && var2 != 53 && var2 != 62) {
                  this.a.a.a(this.a.a, this.a.f[var2], k.a() >> 1, 75);
               } else {
                  this.a.a.a(this.a.a, this.a.f[var2], k.a() >> 1, 85);
               }
            }

            ac.c(Integer.parseInt(this.a.b.elementAt(this.a.h).toString()));
            this.a.a.a(this.a.a, this.a, k.a() >> 1, 107, 16777215, 1089, 0, 1, 8, this.a.aJ, k.a(), k.b() - 106 - 20, 0, 0);
         } else {
            this.a.a.a(this.a.a, var4, k.a() >> 1, 43, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            if(this.a.f[var2] != -1 && var2 != 18 && var2 != 9 && var2 != 10 && var2 != 17) {
               if(var2 != 4 && var2 != 43 && var2 != 44 && var2 != 51 && var2 != 52 && var2 != 53 && var2 != 62) {
                  this.a.a.a(this.a.a, this.a.f[var2], k.a() >> 1, 63);
               } else {
                  this.a.a.a(this.a.a, this.a.f[var2], k.a() >> 1, 73);
               }
            }

            ac.c(Integer.parseInt(this.a.b.elementAt(this.a.h).toString()));
            this.a.a.a(this.a.a, this.a, k.a() >> 1, 107, 16777215, 1089, 0, 1, 8, this.a.aJ, k.a(), k.b() - 106 - 20, 0, 0);
         }
      }

      if(this.a.m) {
         this.a.a.a((k.a() >> 1) - 8, 86, k.b() - 12 - 1);
      }

   }

   private void e(StringBuffer var1) {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var2;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655376, 2 * var2, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655361, 2 * var2, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         this.a.a.setColor(26265);
         this.a.a.fillRect((k.a() >> 1) - 24, 32 + (k.b() - 32 - 20 >> 1) - 24, 48, 51);
         this.a.a.a(this.a.a, 196608, k.a() >> 1, 32 + (k.b() - 32 - 20 >> 1) - 24 + 37);
         if(this.a.d[this.a.G] != -1) {
            this.a.a.a(this.a.a, this.a.f[this.a.d[this.a.G]], k.a() >> 1, 32 + (k.b() - 32 - 20 >> 1) - 24 + 37);
         }

         if(this.a.c[this.a.F] != -1) {
            this.a.a.a(this.a.a, this.a.f[this.a.c[this.a.F]], k.a() >> 1, 32 + (k.b() - 32 - 20 >> 1) - 24 + 37);
         }

         if(this.a.b[this.a.E] != -1) {
            this.a.a.a(this.a.a, this.a.f[this.a.b[this.a.E]], k.a() >> 1, 32 + (k.b() - 32 - 20 >> 1) - 24 + 37);
         }

         if(this.a.a[this.a.D] != -1) {
            this.a.a.a(this.a.a, this.a.f[this.a.a[this.a.D]], k.a() >> 1, 32 + (k.b() - 32 - 20 >> 1) - 24 + this.a.a.a[0] + 37 + this.a.a.b[0]);
         }
      }

      if(this.a.v) {
         if(this.a.u == 0) {
            if(this.a.t) {
               this.a.a.a(this.a.a, 655401, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
            } else {
               this.a.a.a(this.a.a, 655399, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
            }
         } else {
            this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
         }

         if(this.a.u == 1) {
            if(this.a.t) {
               this.a.a.a(this.a.a, 655401, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
            } else {
               this.a.a.a(this.a.a, 655399, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
            }
         } else {
            this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
         }

         if(this.a.u == 2) {
            if(this.a.t) {
               this.a.a.a(this.a.a, 655401, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 1);
            } else {
               this.a.a.a(this.a.a, 655399, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 1);
            }
         } else {
            this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 1);
         }

         if(this.a.u == 3) {
            if(this.a.t) {
               this.a.a.a(this.a.a, 655401, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
            } else {
               this.a.a.a(this.a.a, 655399, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
            }
         } else {
            this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
         }

         if(this.a.u == 0) {
            if(this.a.u) {
               this.a.a.a(this.a.a, 655402, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
            } else {
               this.a.a.a(this.a.a, 655400, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
            }
         } else {
            this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
         }

         if(this.a.u == 1) {
            if(this.a.u) {
               this.a.a.a(this.a.a, 655402, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
            } else {
               this.a.a.a(this.a.a, 655400, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
            }
         } else {
            this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
         }

         if(this.a.u == 2) {
            if(this.a.u) {
               this.a.a.a(this.a.a, 655402, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 1);
            } else {
               this.a.a.a(this.a.a, 655400, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 1);
            }
         } else {
            this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 1);
         }

         if(this.a.u == 3) {
            if(this.a.u) {
               this.a.a.a(this.a.a, 655402, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
            } else {
               this.a.a.a(this.a.a, 655400, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
            }
         } else {
            this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
         }
      } else {
         this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
         this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
         this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 1);
         this.a.a.a(this.a.a, 655403, (k.a() >> 1) - 19 - 21, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
         this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 32 - 3);
         this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) - 16 - 1);
         this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 1);
         this.a.a.a(this.a.a, 655404, (k.a() >> 1) + 19 + 14, 32 + (k.b() - 32 - 20 >> 1) + 16 + 3);
      }

      if(this.a.o > 500L) {
         if(this.a.t) {
            this.a.t = false;
         }

         if(this.a.u) {
            this.a.u = false;
         }
      }

      this.i();
   }

   public final void b(StringBuffer var1) {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var2;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655376, 2 * var2, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var2 = 1; var2 < this.a.aV + 1; ++var2) {
               this.a.a.a(this.a.a, 655361, 2 * var2, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         if(this.a.t == 0) {
            this.a.a.a(this.a.a, this.a.a.a(77), k.a() >> 1, k.b() / 2 - this.a.aJ * 2, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, this.a.a.a(77), k.a() >> 1, k.b() / 2 - this.a.aJ * 2, 26265, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         if(this.a.t == 1) {
            this.a.a.a(this.a.a, this.a.a.a(78), k.a() >> 1, k.b() / 2 + this.a.aJ, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            return;
         }

         this.a.a.a(this.a.a, this.a.a.a(78), k.a() >> 1, k.b() / 2 + this.a.aJ, 26265, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }

   private void f(StringBuffer var1) {
      int var2;
      if(this.a.hasPointerEvents()) {
         var2 = 52 + this.a.aI * this.a.as;
      } else {
         var2 = 40 + this.a.aI * this.a.as;
      }

      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());

         for(int var3 = 0; var3 < this.a.as; ++var3) {
            if(var3 % 2 == 0) {
               if(this.a.au % 2 == 0) {
                  this.a.a.setColor(10061);
               } else {
                  this.a.a.setColor(6965);
               }
            } else if(this.a.au % 2 == 0) {
               this.a.a.setColor(6965);
            } else {
               this.a.a.setColor(10061);
            }

            if(this.a.hasPointerEvents()) {
               this.a.a.fillRect(0, 52 + var3 * this.a.aI, k.a(), this.a.aI);
            } else {
               this.a.a.fillRect(0, 40 + var3 * this.a.aI, k.a(), this.a.aI);
            }
         }

         int var4;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var4 = 1; var4 < this.a.aV + 1; ++var4) {
               this.a.a.a(this.a.a, 655376, 2 * var4, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var4 = 1; var4 < this.a.aV + 1; ++var4) {
               this.a.a.a(this.a.a, 655361, 2 * var4, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         this.a.at = this.a.av;
         if(this.a.at > this.a.as) {
            this.a.at = this.a.as;
         }

         for(var4 = this.a.au; var4 < this.a.at + this.a.au; ++var4) {
            if(var4 == this.a.v) {
               this.k = 16777215;
            } else {
               this.k = '\u99ff';
            }

            StringBuffer var5 = (new StringBuffer()).append(this.a.b[this.a.a[var4]]);
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, var5, k.a() >> 1, 52 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            } else {
               this.a.a.a(this.a.a, var5, k.a() >> 1, 40 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }
         }
      }

      if(this.a.n == 1 && this.a.m != 2) {
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
            this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
         } else {
            this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
            this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var2);
         }
      } else {
         if(this.a.hasPointerEvents()) {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, 40);
            } else if(this.a.au > 0) {
               this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, 40);
            } else {
               this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var2);
            } else if(this.a.av > this.a.at && this.a.at + this.a.au < this.a.av) {
               this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var2);
            } else {
               this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
            }
         } else {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, 32);
            } else if(this.a.au > 0) {
               this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, 32);
            } else {
               this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var2);
            } else if(this.a.av > this.a.at && this.a.at + this.a.au < this.a.av) {
               this.a.a.a(this.a.a, 655406, (k.a() >> 1) - 8, var2);
            } else {
               this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var2);
            }
         }

         if(this.a.n > 500L) {
            if(this.a.h) {
               this.a.h = false;
            }

            if(this.a.i) {
               this.a.i = false;
            }
         }
      }

      this.i();
   }

   public final void k() {
      this.a.m = 0;
      this.a.aB = false;
      this.a.aC = false;
      this.a.aD = false;

      for(int var1 = 0; var1 < 120; ++var1) {
         this.a.f[var1] = "";
         this.a.e[var1] = "";
         this.a.d[var1] = "";
      }

      this.a.az = 0;
      this.a.ay = 0;
      this.a.ax = 0;
      this.a.y = 0;
      this.h();
   }

   public final void c(StringBuffer var1) {
      int var2;
      if(this.a.hasPointerEvents()) {
         var2 = 52 + this.a.aI * this.a.as;
      } else {
         var2 = 40 + this.a.aI * this.a.as;
      }

      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());

         for(int var3 = 0; var3 < this.a.as; ++var3) {
            if(var3 % 2 == 0) {
               if(this.a.au % 2 == 0) {
                  this.a.a.setColor(10061);
               } else {
                  this.a.a.setColor(6965);
               }
            } else if(this.a.au % 2 == 0) {
               this.a.a.setColor(6965);
            } else {
               this.a.a.setColor(10061);
            }

            if(this.a.hasPointerEvents()) {
               this.a.a.fillRect(0, 52 + var3 * this.a.aI, k.a(), this.a.aI);
            } else {
               this.a.a.fillRect(0, 40 + var3 * this.a.aI, k.a(), this.a.aI);
            }
         }

         int var4;
         if(this.a.hasPointerEvents()) {
            this.a.a.a(this.a.a, 655375, 0, 16);

            for(var4 = 1; var4 < this.a.aV + 1; ++var4) {
               this.a.a.a(this.a.a, 655376, 2 * var4, 16);
            }

            this.a.a.a(this.a.a, 655377, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (24 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         } else {
            this.a.a.a(this.a.a, 655360, 0, 16);

            for(var4 = 1; var4 < this.a.aV + 1; ++var4) {
               this.a.a.a(this.a.a, 655361, 2 * var4, 16);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 16);
            this.a.a.a(this.a.a, var1, k.a() >> 1, 16 + (16 - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         }

         this.n = 0;
         this.o = 0;
         this.p = 0;
         this.q = 0;
         this.r = 0;
         this.s = 0;
         if(this.a.aA) {
            byte var15;
            if(this.a.b[17].equals(this.a.b[9])) {
               var15 = 2;
            } else if(this.a.b[17].equals(this.a.b[10])) {
               var15 = 3;
            } else {
               var15 = 1;
            }

            int var6;
            int var7;
            for(int var5 = 0; var5 < this.a.aB; ++var5) {
               for(var6 = 0; var6 < 120; ++var6) {
                  for(var7 = 0; var7 <= 10; ++var7) {
                     if(this.a.a[var6][var7] != 0 && this.a.m[var5] == this.a.a[var6][var7]) {
                        int var8;
                        int var9;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        int var14;
                        if(var15 == 1 && this.a.e[var6] == -1) {
                           this.f = true;

                           for(var8 = 0; var8 < this.a.av; ++var8) {
                              if(this.a.a[var8] == (byte)var6) {
                                 this.f = false;
                              }
                           }

                           for(var9 = 0; var9 < this.a.aw; ++var9) {
                              if(this.a.a[var9] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           for(var10 = 0; var10 < this.a.H; ++var10) {
                              if(this.a.a[var10] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var11 = 0; var11 < this.a.I; ++var11) {
                              if(this.a.b[var11] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var12 = 0; var12 < this.a.J; ++var12) {
                              if(this.a.c[var12] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var13 = 0; var13 < this.a.K; ++var13) {
                              if(this.a.d[var13] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var14 = 0; var14 < this.a.az; ++var14) {
                              if(this.a.f[var14] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           if(this.f) {
                              this.a.f[this.a.az] = this.a.b[var6];
                              ++this.a.az;
                           }
                        }

                        if(var15 == 2 && (this.a.e[var6] == 9 || this.a.e[var6] == -1)) {
                           this.f = true;

                           for(var8 = 0; var8 < this.a.av; ++var8) {
                              if(this.a.a[var8] == (byte)var6) {
                                 this.f = false;
                              }
                           }

                           for(var9 = 0; var9 < this.a.aw; ++var9) {
                              if(this.a.a[var9] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           for(var10 = 0; var10 < this.a.H; ++var10) {
                              if(this.a.a[var10] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var11 = 0; var11 < this.a.I; ++var11) {
                              if(this.a.b[var11] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var12 = 0; var12 < this.a.J; ++var12) {
                              if(this.a.c[var12] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var13 = 0; var13 < this.a.K; ++var13) {
                              if(this.a.d[var13] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var14 = 0; var14 < this.a.az; ++var14) {
                              if(this.a.f[var14] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           if(this.f) {
                              this.a.f[this.a.az] = this.a.b[var6];
                              ++this.a.az;
                           }
                        }

                        if(var15 == 3 && (this.a.e[var6] == 9 || this.a.e[var6] == 10 || this.a.e[var6] == -1)) {
                           this.f = true;

                           for(var8 = 0; var8 < this.a.av; ++var8) {
                              if(this.a.a[var8] == (byte)var6) {
                                 this.f = false;
                              }
                           }

                           for(var9 = 0; var9 < this.a.aw; ++var9) {
                              if(this.a.a[var9] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           for(var10 = 0; var10 < this.a.H; ++var10) {
                              if(this.a.a[var10] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var11 = 0; var11 < this.a.I; ++var11) {
                              if(this.a.b[var11] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var12 = 0; var12 < this.a.J; ++var12) {
                              if(this.a.c[var12] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var13 = 0; var13 < this.a.K; ++var13) {
                              if(this.a.d[var13] == var6) {
                                 this.f = false;
                              }
                           }

                           for(var14 = 0; var14 < this.a.az; ++var14) {
                              if(this.a.f[var14] == this.a.b[var6]) {
                                 this.f = false;
                              }
                           }

                           if(this.f) {
                              this.a.f[this.a.az] = this.a.b[var6];
                              ++this.a.az;
                           }
                        }
                     }

                     ++var7;
                  }
               }
            }

            for(var6 = 0; var6 < this.a.az; ++var6) {
               for(var7 = 0; var7 < 120; ++var7) {
                  if(this.a.f[var6] == this.a.b[var7]) {
                     if(this.a.f[var7] != 3 && this.a.f[var7] != 5 && this.a.f[var7] != 2) {
                        this.a.d[this.a.ax] = this.a.f[var6];
                        ++this.a.ax;
                     } else {
                        if(var15 == 1 && !this.a.f[var6].equals(this.a.b[17])) {
                           this.a.e[this.a.ay] = this.a.f[var6];
                           ++this.a.ay;
                        }

                        if(var15 == 2 && !this.a.f[var6].equals(this.a.b[17]) && !this.a.f[var6].equals(this.a.b[9])) {
                           this.a.e[this.a.ay] = this.a.f[var6];
                           ++this.a.ay;
                        }

                        if(var15 == 3 && !this.a.f[var6].equals(this.a.b[17]) && !this.a.f[var6].equals(this.a.b[9]) && !this.a.f[var6].equals(this.a.b[10])) {
                           this.a.e[this.a.ay] = this.a.f[var6];
                           ++this.a.ay;
                        }
                     }
                  }
               }
            }

            this.a.aA = false;
         }

         this.a.at = 0;
         StringBuffer var16;
         if(this.a.aB) {
            this.a.at = this.a.ay;
            if(this.a.at > this.a.as) {
               this.a.at = this.a.as;
            }

            for(var4 = this.a.au; var4 < this.a.at + this.a.au; ++var4) {
               if(var4 == this.a.y) {
                  this.t = 16777215;
               } else {
                  this.t = '\u99ff';
               }

               var16 = (new StringBuffer()).append(this.a.e[var4]);
               if(this.a.hasPointerEvents()) {
                  this.a.a.a(this.a.a, var16, k.a() >> 1, 52 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.t, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               } else {
                  this.a.a.a(this.a.a, var16, k.a() >> 1, 40 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 8, this.t, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               }
            }
         } else {
            this.a.at = this.a.ax;
            if(this.a.at > this.a.as) {
               this.a.at = this.a.as;
            }

            for(var4 = this.a.au; var4 < this.a.at + this.a.au; ++var4) {
               if(var4 == this.a.y) {
                  this.t = 16777215;
               } else {
                  this.t = '\u99ff';
               }

               var16 = new StringBuffer(this.a.d[var4]);
               if(this.a.hasPointerEvents()) {
                  this.a.a.a(this.a.a, var16, k.a() >> 1, 52 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.t, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               } else {
                  this.a.a.a(this.a.a, var16, k.a() >> 1, 40 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.t, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               }
            }
         }
      }

      if(this.a.hasPointerEvents()) {
         if(this.a.h) {
            this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, 40);
         } else if(this.a.au > 0) {
            this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, 40);
         } else {
            this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
         }

         if(this.a.i) {
            this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var2);
         } else if(this.a.aB) {
            if(this.a.ay > this.a.as && this.a.au != this.a.ay - this.a.as) {
               this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var2);
            } else {
               this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
            }
         } else if(this.a.ax > this.a.as && this.a.au != this.a.ax - this.a.as) {
            this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var2);
         } else {
            this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
         }
      } else {
         if(this.a.h) {
            this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, 32);
         } else if(this.a.au > 0) {
            this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, 32);
         } else {
            this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
         }

         if(this.a.i) {
            this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var2);
         } else if(this.a.aB) {
            if(this.a.ay > this.a.as && this.a.au != this.a.ay - this.a.as) {
               this.a.a.a(this.a.a, 655406, (k.a() >> 1) - 8, var2);
            } else {
               this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var2);
            }
         } else if(this.a.ax > this.a.as && this.a.au != this.a.ax - this.a.as) {
            this.a.a.a(this.a.a, 655406, (k.a() >> 1) - 8, var2);
         } else {
            this.a.a.a(this.a.a, 655410, (k.a() >> 1) - 8, var2);
         }
      }

      if(this.a.n > 500L) {
         if(this.a.h) {
            this.a.h = false;
         }

         if(this.a.i) {
            this.a.i = false;
         }
      }

   }

   public final void b(int var1) {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.a(this.a.a, this.a.a.a(var1), k.a() / 2, k.b() / 3, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.a(this.a.a, this.a.a.a(115), this.a.bb, this.a.bc, 16777215, 64 | this.a.ba | 256, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.a(this.a.a, this.a.a.a(116), this.a.bd, this.a.be, 16777215, 328, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }
}
