package data;

import data.d;
import data.i;
import data.k;
import data.l;
import data.o;
import data.p;
import data.q;
import data.u;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class g {

   private p a;
   private int[] b = new int[16];
   private int[] c = new int[22];
   private int[] d = new int[87];
   private byte[] a = new byte[49];
   private boolean a = true;
   private int[] e = new int[49];
   private int[] f = new int[49];
   private byte[] b = new byte[32400];
   private boolean b = true;
   private boolean c = true;
   private byte[] c = new byte[32400];
   private byte[] d = new byte[32400];
   public u[] a;
   public int a = 0;
   public u[] b;
   public int b = 0;
   public u[] c;
   public int c = 0;
   public u[] d;
   public int d = 0;
   public u[] e;
   public int e = 0;
   public u[] f;
   public int f = 0;
   public u[] g;
   public int g = 0;
   public int[][] a;
   public int h = 0;
   public l[] a;
   public int i = 0;
   public l[] b;
   public int j = 0;
   public l[] c;
   public int k = 0;
   public int[][] b;
   public int l = 0;
   public d[] a;
   public int m = 0;
   public d[] b;
   public int n = 0;
   public d[] c;
   public int o = 0;
   public d[] d;
   public int p = 0;
   public int[][] c;
   public int q = 0;
   public i[] a;
   public int r = 0;
   public int[] a;
   public int s = 0;
   public q[] a;
   public int t = 0;
   public q[] b;
   public int u = 0;
   public q[] c;
   public int v = 0;
   public q[] d;
   public int w = 0;
   public int[][] d;
   public int x = 0;


   public g(p var1) {
      this.a = var1;
   }

   public final void a() {
      this.o();
      this.p();
      this.q();
      this.r();
      this.a("BIGislandFULL", this.a.k);
      this.a.a();
   }

   public final void b() {
      this.a("BIGislandRocks", this.a.j);
      this.a.a();
      this.a("BIGislandDecor", this.a.g);
      this.a.a();

      for(int var1 = 0; var1 < this.a.g.length; ++var1) {
         if(this.a.g[var1] != 0) {
            if(this.a.g[var1] == this.d[18]) {
               this.a.h[var1] = (byte)o.a(13);
            }

            if(this.a.g[var1] == this.d[1]) {
               this.a.h[var1] = (byte)o.a(8);
            }

            if(this.a.g[var1] == this.d[5]) {
               this.a.h[var1] = (byte)o.a(9);
            }

            if(this.a.g[var1] == this.d[13]) {
               this.a.h[var1] = (byte)o.a(12);
            }

            if(this.a.g[var1] == this.d[21]) {
               this.a.h[var1] = (byte)o.a(4);
            }

            if(this.a.g[var1] == this.d[22]) {
               this.a.h[var1] = (byte)o.a(4);
            }

            if(this.a.g[var1] == this.d[49]) {
               this.a.h[var1] = (byte)o.a(6);
            }
         } else {
            this.a.h[var1] = -1;
         }
      }

   }

   public final void c() {
      this.a("BIGislandBorders", this.a.i);
      this.a.a();
      this.a("BIGislandObjects", this.a.l);
      this.a.a();
      this.a = false;
      this.a[0] = 6;
      this.a[1] = 10;
      this.a[2] = 11;
      this.a[3] = 15;
      this.a[4] = 16;
      this.a[5] = 17;
      this.a[6] = 18;
      this.a[7] = 19;
      this.a[8] = 20;
      this.a[9] = 23;
      this.a[10] = 24;
      this.a[11] = 77;
      this.a[12] = 78;
      this.a[13] = 79;
      this.a[14] = 80;
      this.a[15] = 81;
      this.a[16] = 82;
      this.a[17] = 83;
      this.a[18] = 84;
      this.a[19] = 85;
      this.a[20] = 86;
      this.a[21] = 87;
      this.a[22] = 88;
      this.a[23] = 89;
      this.a[24] = 90;
      this.a[25] = 91;
      this.a[26] = 93;
      this.a[27] = 95;
      this.a[28] = 97;
      this.a[29] = 100;
      this.a[30] = 101;
      this.a[31] = 102;
      this.a[32] = 103;
      this.a[33] = 104;
      this.a[34] = 105;
      this.a[35] = 106;
      this.a[36] = 107;
      this.a[37] = 108;
      this.a[38] = 109;
      this.a[39] = 110;
      this.a[40] = 111;
      this.a[41] = 112;
      this.a[42] = 113;
      this.a[43] = 114;
      this.a[44] = 115;
      this.a[45] = 118;
      this.a[46] = 98;
      this.a[47] = 121;
      this.a[48] = 124;
      this.a.N = k.a() / this.a.M;
      this.a.O = k.b() / this.a.M - 1;
      if(this.a.c) {
         this.a.Z = this.a.ab + this.a.N / 2;
         this.a.aa = this.a.ac + this.a.O / 2;
      }

   }

   private void k() {
      int var1 = 1;

      for(int var2 = 0; var2 < this.a.l.length; ++var2) {
         if(this.a.l[var2] != 0 && !this.a.a.a((int)this.a.l[var2])) {
            this.a.a[var2] = (short)var1;
            ++var1;
         } else {
            this.a.a[var2] = -1;
         }
      }

   }

   private void l() {
      this.b = this.a.l;
      byte var1 = 0;

      try {
         for(int var6 = 0; var6 < this.a.l.length; ++var6) {
            if(this.b[var6] != 0) {
               for(int var2 = 0; var2 < this.a.length; ++var2) {
                  if(this.a[var2] == this.b[var6]) {
                     for(int var3 = 0; var3 < this.a.aw; ++var3) {
                        if(this.a.a[var3] == this.a.b[this.b[var6] - 1]) {
                           this.b[var6] = 0;
                           break;
                        }
                     }

                     int var4;
                     if(this.b[var6] != 0) {
                        for(var4 = 0; var4 < this.a.av; ++var4) {
                           if(this.a.a[var4] == this.b[var6] - 1) {
                              this.b[var6] = 0;
                              break;
                           }
                        }
                     }

                     if(this.b[var6] != 0) {
                        for(var4 = 0; var4 < this.a.aB; ++var4) {
                           if(this.a.m[var4] == this.b[var6] - 1) {
                              this.b[var6] = 0;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (Exception var5) {
         System.out.println("erreur filterUniqueObjects " + var1 + "objectArrayFull_CPY[i]" + this.b[var1]);
         var5.printStackTrace();
      }

      this.a.l = this.b;
   }

   private void m() {
      int var1 = 0;

      while(var1 < this.a.l.length) {
         int var2 = 0;

         while(true) {
            if(var2 < this.a.r.length) {
               if(this.a.r[var2] != this.a.a[var1]) {
                  ++var2;
                  continue;
               }

               this.a.l[var1] = 0;
               this.a.a[var1] = 0;
            }

            ++var1;
            break;
         }
      }

   }

   private void n() {
      if(this.a.ap == 1) {
         for(int var1 = 0; var1 < this.a.l.length; ++var1) {
            if(this.a.l[var1] == 85) {
               this.a.l[var1] = 0;
               if(!this.a.T) {
                  this.a.l[(int)this.a.b] = 95;
               } else {
                  this.a.l[(int)this.a.b] = 0;
               }
            }
         }
      }

   }

   public final void d() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var8 = false;
      byte var9 = 0;

      try {
         this.k();
         boolean var7 = false;
         int var19 = var9 + 1;
         this.l();
         ++var19;
         this.n();
         ++var19;
         this.m();
         ++var19;
         this.b = this.a.l;
      } catch (Exception var13) {
         System.out.println("Exception mixUpObjectPos : " + var9);
         var13.printStackTrace();
      }

      for(int var10 = 0; var10 < this.b.length; ++var10) {
         try {
            this.b = true;
            if(this.b[var10] != 0) {
               for(int var11 = 0; var11 < this.a.a.a.length; ++var11) {
                  if(this.a.a.a[var11] == this.b[var10]) {
                     this.b = false;
                     break;
                  }
               }

               if(this.b) {
                  byte var17 = this.b[var10];
                  short var18 = this.a.a[var10];

                  for(int var12 = 0; var12 < this.a.s.length; ++var12) {
                     if(this.a.s[var12] == var18) {
                        this.b[var10] = 0;
                        var6 = true;
                        break;
                     }

                     var6 = false;
                  }

                  if(!var6) {
                     int var15;
                     if((var15 = o.a(7)) < 4) {
                        var15 = -var15;
                     } else {
                        var15 /= 2;
                     }

                     int var16;
                     if((var16 = o.a(7)) < 4) {
                        var16 = -var16;
                     } else {
                        var16 /= 2;
                     }

                     if((var3 = var10 + var15 + var16 * 180) > 31399) {
                        var3 = 31399;
                     }

                     if(this.a(var3) && this.e(var3, 1) && this.c(var3, 1) && this.d(var3, 1)) {
                        this.b[var3] = var17;
                        this.b[var10] = 0;
                        this.a.a[var3] = (short)var18;
                        this.a.a[var10] = -1;
                     } else if(this.a(var17)) {
                        this.b[var10] = var17;
                     } else {
                        this.b[var10] = 0;
                     }
                  }
               }
            }
         } catch (Exception var14) {
            System.out.println(var10 + "->" + var3);
         }
      }

      this.a.l = this.b;
   }

   public final void e() {
      for(int var1 = 0; var1 < this.a.l.length; ++var1) {
         switch(this.a.l[var1]) {
         case 5:
            ++this.t;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         default:
            break;
         case 42:
            ++this.i;
            break;
         case 43:
            ++this.m;
            break;
         case 44:
            ++this.n;
            break;
         case 45:
            ++this.u;
            break;
         case 46:
            ++this.v;
            break;
         case 47:
            ++this.w;
            break;
         case 48:
            ++this.j;
            break;
         case 49:
            ++this.o;
            break;
         case 50:
            ++this.p;
            break;
         case 51:
            ++this.a;
            break;
         case 52:
            ++this.b;
            break;
         case 53:
            ++this.c;
            break;
         case 54:
            ++this.d;
            break;
         case 55:
            ++this.e;
            break;
         case 56:
            ++this.r;
            break;
         case 62:
            ++this.k;
            break;
         case 63:
            ++this.f;
            break;
         case 64:
            ++this.g;
         }
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      this.a = new u[this.a];
      this.b = new u[this.b];
      this.c = new u[this.c];
      this.d = new u[this.d];
      this.e = new u[this.e];
      this.f = new u[this.f];
      this.g = new u[this.g];
      this.a = new l[this.i];
      this.b = new l[this.j];
      this.c = new l[this.k];
      this.a = new d[this.m];
      this.b = new d[this.n];
      this.c = new d[this.o];
      this.d = new d[this.p];
      this.a = new i[this.r];
      this.a = new q[this.t];
      this.b = new q[this.u];
      this.c = new q[this.v];
      this.d = new q[this.w];
      this.a = new int[this.a + this.b + this.c + this.d + this.e + this.f + this.g][2];
      this.b = new int[this.i + this.j + this.k][2];
      this.c = new int[this.m + this.n + this.o + this.p][2];
      this.a = new int[this.r];
      this.d = new int[this.t + this.u + this.v + this.w][2];

      for(int var18 = 0; var18 < this.a.l.length; ++var18) {
         int[] var19 = new int[2];
         int[] var20 = new int[2];
         int[] var21 = new int[2];
         int[] var22 = new int[2];
         int[] var23 = new int[2];
         switch(this.a.l[var18]) {
         case 5:
            var19[0] = 131072;
            var19[1] = 131073;
            var20[0] = 131074;
            var20[1] = 131075;
            var23[0] = 131076;
            var23[1] = 131077;
            this.a[var15] = new q(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var23);
            ++var15;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 46:
         case 51:
         case 55:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         default:
            break;
         case 42:
            var19[0] = 131112;
            var19[1] = 131113;
            var20[0] = 131112;
            var20[1] = 131113;
            var23[0] = 131112;
            var23[1] = 131113;
            this.a[var7] = new l(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 1, 50, var19, var20, var23);
            ++var7;
            break;
         case 43:
            var19[0] = 131086;
            var19[1] = 131087;
            var20[0] = 131088;
            var20[1] = 131089;
            var23[0] = 131086;
            var23[1] = 131087;
            this.a[var10] = new d(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 2, 50, var19, var20, var23);
            ++var10;
            break;
         case 44:
            var19[0] = 131158;
            var19[1] = 131159;
            var20[0] = 131160;
            var20[1] = 131161;
            var23[0] = 131158;
            var23[1] = 131159;
            this.b[var11] = new d(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var23);
            ++var11;
            break;
         case 45:
            var19[0] = 131082;
            var19[1] = 131083;
            var20[0] = 131084;
            var20[1] = 131085;
            var23[0] = 131082;
            var23[1] = 131083;
            this.b[var16] = new q(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var23);
            ++var16;
            break;
         case 47:
            var19[0] = 131090;
            var19[1] = 131091;
            var20[0] = 131092;
            var20[1] = 131093;
            var23[0] = 131090;
            var23[1] = 131091;
            this.d[var17] = new q(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 2, 50, var19, var20, var23);
            ++var17;
            break;
         case 48:
            var19[0] = 131078;
            var19[1] = 131079;
            var20[0] = 131080;
            var20[1] = 131081;
            var23[0] = 131078;
            var23[1] = 131078;
            this.b[var8] = new l(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 1, 50, var19, var20, var23);
            ++var8;
            break;
         case 49:
            var19[0] = 131124;
            var19[1] = 131125;
            var20[0] = 131126;
            var20[1] = 131127;
            var23[0] = 131128;
            var23[1] = 131129;
            this.c[var12] = new d(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 2, 50, var19, var20, var23);
            ++var12;
            break;
         case 50:
            var19[0] = 131118;
            var19[1] = 131119;
            var20[0] = 131120;
            var20[1] = 131121;
            var23[0] = 131122;
            var23[1] = 131123;
            this.d[var13] = new d(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 1, 50, var19, var20, var23);
            ++var13;
            break;
         case 52:
            var19[0] = 131174;
            var19[1] = 131175;
            var20[0] = 131176;
            var20[1] = 131177;
            var21[0] = 131178;
            var21[1] = 131179;
            var22[0] = 131180;
            var22[1] = 131181;
            var23[0] = 131176;
            var23[1] = 131177;
            this.b[var2] = new u(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var21, var22, var23);
            ++var2;
            break;
         case 53:
            var19[0] = 131142;
            var19[1] = 131143;
            var20[0] = 131144;
            var20[1] = 131145;
            var21[0] = 131146;
            var21[1] = 131147;
            var22[0] = 131148;
            var22[1] = 131149;
            var23[0] = 131144;
            var23[1] = 131145;
            this.c[var3] = new u(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var21, var22, var23);
            ++var3;
            break;
         case 54:
            var19[0] = 131150;
            var19[1] = 131151;
            var20[0] = 131152;
            var20[1] = 131153;
            var21[0] = 131154;
            var21[1] = 131155;
            var22[0] = 131156;
            var22[1] = 131157;
            var23[0] = 131152;
            var23[1] = 131153;
            this.d[var4] = new u(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 3, 50, var19, var20, var21, var22, var23);
            ++var4;
            break;
         case 56:
            int[] var24 = new int[]{131162, 131163, 131164};
            int[] var25 = new int[]{131165, 131166, 131167};
            this.a[var14] = new i(this.a, this.a.l[var18], var18 % 180, var18 / 180, 5, var24, var25);
            ++var14;
            break;
         case 62:
            var19[0] = 131114;
            var19[1] = 131115;
            var20[0] = 131116;
            var20[1] = 131117;
            var23[0] = 131114;
            var23[1] = 131114;
            this.c[var9] = new l(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 1, 50, var19, var20, var23);
            ++var9;
            break;
         case 63:
            var19[0] = 131190;
            var19[1] = 131191;
            var20[0] = 131192;
            var20[1] = 131193;
            var21[0] = 131194;
            var21[1] = 131195;
            var22[0] = 131196;
            var22[1] = 131197;
            var23[0] = 131192;
            var23[1] = 131193;
            this.f[var5] = new u(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 3, 50, var19, var20, var21, var22, var23);
            ++var5;
            break;
         case 64:
            var19[0] = 131182;
            var19[1] = 131183;
            var20[0] = 131184;
            var20[1] = 131185;
            var21[0] = 131186;
            var21[1] = 131187;
            var22[0] = 131188;
            var22[1] = 131189;
            var23[0] = 131184;
            var23[1] = 131185;
            this.g[var6] = new u(this.a, this.a.l[var18], var18 % 180, var18 / 180, 7, 4, 50, var19, var20, var21, var22, var23);
            ++var6;
         }
      }

   }

   private void o() {
      this.b[0] = 65536;
      this.b[1] = 65537;
      this.b[2] = 65538;
      this.b[3] = 65539;
      this.b[4] = 65540;
      this.b[5] = 65541;
      this.b[6] = 65542;
      this.b[7] = 65543;
      this.b[8] = 65544;
      this.b[9] = 65545;
      this.b[10] = 65546;
      this.b[11] = 65547;
      this.b[12] = 65548;
      this.b[13] = 65549;
      this.b[14] = 65550;
      this.b[15] = 65551;
      this.a.e[0] = 0;
      this.a.e[1] = 1;
      this.a.e[2] = 2;
      this.a.e[3] = 3;
      this.a.e[4] = 4;
      this.a.e[5] = 5;
      this.a.e[6] = 6;
      this.a.e[7] = 7;
      this.a.e[8] = 8;
      this.a.e[9] = 9;
      this.a.e[10] = 10;
      this.a.e[11] = 11;
      this.a.e[12] = 12;
      this.a.e[13] = 13;
      this.a.e[14] = 14;
      this.a.e[15] = 15;
   }

   private void p() {
      this.e[0] = 0;
      this.e[1] = 262144;
      this.e[2] = 262145;
      this.e[3] = 262146;
      this.e[4] = 262147;
      this.e[5] = 262148;
      this.e[6] = 262149;
      this.e[7] = 262150;
      this.e[8] = 262151;
      this.e[9] = 262152;
      this.e[10] = 262153;
      this.e[11] = 262154;
      this.e[12] = 262155;
      this.e[13] = 262156;
      this.e[14] = 262157;
      this.e[15] = 262158;
      this.e[16] = 262159;
      this.e[17] = 262160;
      this.e[18] = 262161;
      this.e[19] = 262162;
      this.e[20] = 262163;
      this.e[21] = 262164;
      this.e[22] = 262165;
      this.e[23] = 262166;
      this.e[24] = 262167;
      this.e[25] = 262168;
      this.e[26] = 262169;
      this.e[27] = 262170;
      this.e[28] = 262171;
      this.e[29] = 262172;
      this.e[30] = 262173;
      this.e[31] = 262174;
      this.e[32] = 262175;
      this.e[33] = 262176;
      this.e[34] = 262177;
      this.e[35] = 262178;
      this.e[36] = 262179;
      this.e[37] = 262180;
      this.e[38] = 262181;
      this.e[39] = 262182;
      this.e[40] = 262183;
      this.e[41] = 262184;
      this.e[42] = 262185;
      this.e[43] = 262186;
      this.e[44] = 262187;
      this.e[45] = 262188;
      this.e[46] = 262189;
      this.e[47] = 262190;
      this.e[48] = 262191;
      this.f[0] = 0;
      this.f[1] = 1;
      this.f[2] = 2;
      this.f[3] = 3;
      this.f[4] = 4;
      this.f[5] = 5;
      this.f[6] = 6;
      this.f[7] = 7;
      this.f[8] = 8;
      this.f[9] = 9;
      this.f[10] = 10;
      this.f[11] = 11;
      this.f[12] = 12;
      this.f[13] = 13;
      this.f[14] = 14;
      this.f[15] = 15;
      this.f[16] = 16;
      this.f[17] = 17;
      this.f[18] = 18;
      this.f[19] = 19;
      this.f[20] = 20;
      this.f[21] = 21;
      this.f[22] = 22;
      this.f[23] = 23;
      this.f[24] = 24;
      this.f[25] = 25;
      this.f[26] = 26;
      this.f[27] = 27;
      this.f[28] = 28;
      this.f[29] = 29;
      this.f[30] = 30;
      this.f[31] = 31;
      this.f[32] = 32;
      this.f[33] = 33;
      this.f[34] = 34;
      this.f[35] = 35;
      this.f[36] = 36;
      this.f[37] = 37;
      this.f[38] = 38;
      this.f[39] = 39;
      this.f[40] = 40;
      this.f[41] = 41;
      this.f[42] = 42;
      this.f[43] = 43;
      this.f[44] = 44;
      this.f[45] = 45;
      this.f[46] = 46;
      this.f[47] = 47;
      this.f[48] = 48;
   }

   private void q() {
      this.a.p[0] = 0;
      this.a.p[1] = 458752;
      this.a.p[2] = 458753;
      this.a.p[3] = 458754;
      this.a.p[4] = 458756;
      this.a.p[5] = 458836;
      this.a.p[6] = 458837;
      this.a.p[7] = 458758;
      this.a.p[8] = 458760;
      this.a.p[9] = 458762;
      this.a.p[10] = 458764;
      this.a.p[11] = 458766;
      this.a.p[12] = 458767;
      this.a.p[13] = 458769;
      this.a.p[14] = 458770;
      this.a.p[15] = 458771;
      this.a.p[16] = 458772;
      this.a.p[17] = 458774;
      this.a.p[18] = 458776;
      this.a.p[19] = 458777;
      this.a.p[20] = 458778;
      this.a.p[21] = 458779;
      this.a.p[22] = 458780;
      this.a.p[23] = 458781;
      this.a.p[24] = 458782;
      this.a.p[25] = 458783;
      this.a.p[26] = 458784;
      this.a.p[27] = 458785;
      this.a.p[28] = 458786;
      this.a.p[29] = 458787;
      this.a.p[30] = 458788;
      this.a.p[31] = 458789;
      this.a.p[32] = 458790;
      this.a.p[33] = 458791;
      this.a.p[34] = 458792;
      this.a.p[35] = 458793;
      this.a.p[36] = 458794;
      this.a.p[37] = 458795;
      this.a.p[38] = 458796;
      this.a.p[39] = 458797;
      this.a.p[40] = 458798;
      this.a.p[41] = 458799;
      this.a.p[42] = 458800;
      this.a.p[43] = 458802;
      this.a.p[44] = 458804;
      this.a.p[45] = 458805;
      this.a.p[46] = 458806;
      this.a.p[47] = 458807;
      this.a.p[48] = 458812;
      this.a.p[49] = 458814;
      this.a.p[50] = 458815;
      this.a.p[51] = 458817;
      this.a.p[52] = 458818;
      this.a.p[53] = 458819;
      this.a.p[54] = 458820;
      this.a.p[55] = 458821;
      this.a.p[56] = 458822;
      this.a.p[57] = 458823;
      this.a.p[58] = 458824;
      this.a.p[59] = 458825;
      this.a.p[60] = 458826;
      this.a.p[61] = 458827;
      this.a.p[62] = 458828;
      this.a.p[63] = 458829;
      this.a.p[64] = 458830;
      this.a.p[65] = 458831;
      this.a.p[66] = 458832;
      this.a.p[67] = 458833;
      this.a.p[68] = 458834;
      this.a.p[69] = 458835;
      this.a.p[70] = 458808;
      this.a.p[71] = 458809;
      this.a.p[72] = 458810;
      this.a.p[73] = 458811;
      this.a.p[74] = 458803;
      this.a.p[75] = 458757;
      this.a.p[76] = 458755;
      this.a.p[77] = 458761;
      this.a.p[78] = 458759;
      this.a.p[79] = 458763;
      this.a.p[80] = 458765;
      this.a.p[81] = 458768;
      this.a.p[82] = 458775;
      this.a.p[83] = 458801;
      this.a.p[84] = 458816;
      this.a.p[85] = 458813;
      this.a.p[86] = 458773;
      this.d[0] = 0;
      this.d[1] = 1;
      this.d[2] = 2;
      this.d[3] = 3;
      this.d[4] = 4;
      this.d[5] = 5;
      this.d[6] = 6;
      this.d[7] = 7;
      this.d[8] = 8;
      this.d[9] = 9;
      this.d[10] = 10;
      this.d[11] = 11;
      this.d[12] = 12;
      this.d[13] = 13;
      this.d[14] = 14;
      this.d[15] = 15;
      this.d[16] = 16;
      this.d[17] = 17;
      this.d[18] = 18;
      this.d[19] = 19;
      this.d[20] = 20;
      this.d[21] = 21;
      this.d[22] = 22;
      this.d[23] = 23;
      this.d[24] = 24;
      this.d[25] = 25;
      this.d[26] = 26;
      this.d[27] = 27;
      this.d[28] = 28;
      this.d[29] = 29;
      this.d[30] = 30;
      this.d[31] = 31;
      this.d[32] = 32;
      this.d[33] = 33;
      this.d[34] = 34;
      this.d[35] = 35;
      this.d[36] = 36;
      this.d[37] = 37;
      this.d[38] = 38;
      this.d[39] = 39;
      this.d[40] = 40;
      this.d[41] = 41;
      this.d[42] = 42;
      this.d[43] = 43;
      this.d[44] = 44;
      this.d[45] = 45;
      this.d[46] = 46;
      this.d[47] = 47;
      this.d[48] = 48;
      this.d[49] = 49;
      this.d[50] = 50;
      this.d[51] = 51;
      this.d[52] = 52;
      this.d[53] = 53;
      this.d[54] = 54;
      this.d[55] = 55;
      this.d[56] = 56;
      this.d[57] = 57;
      this.d[58] = 58;
      this.d[59] = 59;
      this.d[60] = 60;
      this.d[61] = 61;
      this.d[62] = 62;
      this.d[63] = 63;
      this.d[64] = 64;
      this.d[65] = 65;
      this.d[66] = 66;
      this.d[67] = 67;
      this.d[68] = 68;
      this.d[69] = 69;
      this.d[70] = 70;
      this.d[71] = 71;
      this.d[72] = 72;
      this.d[73] = 73;
      this.d[74] = 74;
      this.d[75] = 75;
      this.d[76] = 76;
      this.d[77] = 77;
      this.d[78] = 78;
      this.d[79] = 79;
      this.d[80] = 80;
      this.d[81] = 81;
      this.d[82] = 82;
      this.d[83] = 83;
      this.d[84] = 84;
      this.d[85] = 85;
      this.d[86] = 86;
   }

   private void r() {
      this.a.o[0] = 524288;
      this.a.o[1] = 524289;
      this.a.o[2] = 524290;
      this.a.o[3] = 524291;
      this.a.o[4] = 720896;
      this.a.o[5] = 720897;
      this.a.o[6] = 720898;
      this.a.o[7] = 524292;
      this.a.o[8] = 524293;
      this.a.o[9] = 524294;
      this.a.o[10] = 524295;
      this.a.o[11] = 524296;
      this.a.o[12] = 524297;
      this.a.o[13] = 524298;
      this.a.o[14] = 524299;
      this.a.o[15] = 524300;
      this.a.o[16] = 720899;
      this.a.o[17] = 720900;
      this.a.o[18] = 720901;
      this.a.o[19] = 720902;
      this.a.o[20] = 720903;
      this.a.o[21] = 720904;
      this.c[0] = 1;
      this.c[1] = 2;
      this.c[2] = 3;
      this.c[3] = 4;
      this.c[4] = 5;
      this.c[5] = 6;
      this.c[6] = 7;
      this.c[7] = 8;
      this.c[8] = 9;
      this.c[9] = 10;
      this.c[10] = 11;
      this.c[11] = 12;
      this.c[12] = 13;
      this.c[13] = 14;
      this.c[14] = 15;
      this.c[15] = 16;
      this.c[16] = 17;
      this.c[17] = 18;
      this.c[18] = 19;
      this.c[19] = 20;
      this.c[20] = 21;
      this.c[21] = 22;
   }

   public final boolean a(String var1, byte[] var2) {
      boolean var3 = false;

      try {
         boolean var6 = false;
         int var7 = 0;

         try {
            InputStream var4 = this.getClass().getResourceAsStream("/" + var1 + ".byt");

            DataInputStream var5;
            for(int var11 = (var5 = new DataInputStream(var4)).read(); var11 != -1; ++var7) {
               var2[var7] = (byte)var11;
               var11 = var5.read();
               if((var1.equals("BIGislandObjects") || var1.equals("islandObjects")) && !this.a && this.a.a.a((int)var2[var7])) {
                  var2[var7] = 0;
               }
            }

            var4.close();
            var3 = true;
            if(this.a.a.a == 0L && var1.equals("BIGislandObjects")) {
               for(int var8 = 0; var8 < this.a.l.length; ++var8) {
                  if(this.a.l[var8] == 85 || this.a.l[var8] == 95) {
                     this.a.b = (long)var8;
                  }
               }
            }
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      } catch (Exception var10) {
         ;
      }

      return var3;
   }

   public final void f() {
      int var1 = 0;
      int var2 = 0;

      try {
         for(int var3 = this.a.ac - 1; var3 <= this.a.ac + this.a.O + 2; ++var3) {
            for(int var4 = this.a.ab - 1; var4 < this.a.ab + this.a.N + 2; ++var4) {
               if(var3 >= 0 && var4 >= 0 && var3 < 180 && var4 < 180 && this.a.j[var4 + var3 * 180] != 0 && this.a.j[var4 + var3 * 180] < 50) {
                  this.a.a.a(this.a.a(), this.e[this.a.j[var4 + var3 * 180]], this.a.aM + this.a.M * var1 - this.a.M + this.a.U, this.a.aN + this.a.M * var2 - this.a.M + this.a.V);
               }

               ++var1;
            }

            var1 = 0;
            ++var2;
         }

      } catch (Exception var5) {
         System.out.println("Erreur Decor " + var1 + " " + var2);
         var5.printStackTrace();
      }
   }

   public final void g() {
      int var1 = 0;
      int var2 = 0;

      try {
         for(int var3 = this.a.ac - 2; var3 <= this.a.ac + this.a.O + 2; ++var3) {
            for(int var4 = this.a.ab - 2; var4 < this.a.ab + this.a.N + 2; ++var4) {
               if(var3 >= 0 && var4 >= 0 && var3 < 180 && var4 < 180 && this.a.i[var4 + var3 * 180] != 0) {
                  this.a.a.a(this.a.a(), this.a.o[this.a.i[var4 + var3 * 180] - 1], this.a.aM + this.a.M * var1 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var2 - this.a.M * 2 + this.a.V + this.a.M / 2);
               }

               ++var1;
            }

            var1 = 0;
            ++var2;
         }

      } catch (Exception var5) {
         System.out.println("Erreur Border " + var1 + " " + var2);
         var5.printStackTrace();
      }
   }

   public final void h() {
      int var1 = 0;
      int var2 = 0;

      try {
         for(int var3 = this.a.ac - 1; var3 <= this.a.ac + this.a.O + 2; ++var3) {
            for(int var4 = this.a.ab - 1; var4 <= this.a.ab + this.a.N + 2; ++var4) {
               if(var3 >= 0 && var4 >= 0 && var3 < 180 && var4 < 180) {
                  this.a.a.a(this.a.a(), this.b[this.a.k[var4 + var3 * 180]], this.a.aM + this.a.M * var1 - this.a.M + this.a.U, this.a.aN + this.a.M * var2 - this.a.M + this.a.V);
               }

               ++var1;
            }

            var1 = 0;
            ++var2;
         }

      } catch (Exception var5) {
         System.out.println("Erreur Tile " + var1 + " " + var2);
         var5.printStackTrace();
      }
   }

   public final int a(int var1, int var2) {
      return var1 + var2 * 180;
   }

   public final byte a(int var1, int var2) {
      int var4 = var1 + var2 * 180;
      return this.a.k[var4];
   }

   public final byte b(int var1, int var2) {
      int var4 = var1 + var2 * 180;
      return this.a.j[var4];
   }

   public final byte c(int var1, int var2) {
      int var4 = var1 + var2 * 180;
      return this.a.g[var4];
   }

   public final byte d(int var1, int var2) {
      int var4 = var1 + var2 * 180;
      return this.a.l[var4];
   }

   public final boolean a(int var1, int var2) {
      this.c = true;
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
         if(this.a.k[var1] == this.a.e[5]) {
            this.c = false;
         } else if(this.a.k[var1] == this.a.e[6]) {
            this.c = false;
         } else if(this.a.k[var1] == this.a.e[12]) {
            this.c = false;
         } else if(this.a.k[var1] == this.a.e[13]) {
            this.c = false;
         } else if(this.a.k[var1] == this.a.e[14]) {
            this.c = false;
         } else {
            this.c = true;
         }
      default:
         return this.c;
      }
   }

   public final boolean a(int var1) {
      this.c = true;
      if(this.a.k[var1] == this.a.e[5]) {
         this.c = false;
      } else if(this.a.k[var1] == this.a.e[6]) {
         this.c = false;
      } else if(this.a.k[var1] == this.a.e[4]) {
         this.c = false;
      } else if(this.a.k[var1] == this.a.e[12]) {
         this.c = false;
      } else if(this.a.k[var1] == this.a.e[13]) {
         this.c = false;
      } else if(this.a.k[var1] == this.a.e[14]) {
         this.c = false;
      } else {
         this.c = true;
      }

      return this.c;
   }

   public final boolean b(int var1, int var2) {
      this.c = true;
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
         if(this.a.k[var1] != this.a.e[12] && this.a.k[var1] != this.a.e[13] && this.a.k[var1] != this.a.e[14]) {
            this.c = false;
         }
      default:
         return this.c;
      }
   }

   public final boolean c(int var1, int var2) {
      this.c = true;
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
         if(this.a.g[var1] != 0) {
            return false;
         }
      default:
         return this.c;
      }
   }

   public final boolean d(int var1, int var2) {
      this.c = true;
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
         if(this.a.l[var1] != 0) {
            return false;
         }
      default:
         return this.c;
      }
   }

   public final boolean e(int var1, int var2) {
      this.c = true;
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
         if(this.a.j[var1] == this.f[0]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[10]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[11]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[12]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[18]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[20]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[22]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[23]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[24]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[30]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[31]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[32]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[38]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[41]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[42]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[43]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[44]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[45]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[46]) {
            this.c = true;
         } else if(this.a.j[var1] == this.f[47]) {
            this.c = true;
         } else if(this.a.j[var1] >= 50) {
            this.c = true;
         } else {
            this.c = false;
         }
      default:
         return this.c;
      }
   }

   public final void i() {
      int var1 = 0;
      int var2 = 0;

      try {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         for(int var3 = this.a.ac - 2; var3 <= this.a.ac + this.a.O + 4; ++var3) {
            for(var4 = this.a.ab - 2; var4 < this.a.ab + this.a.N + 4; ++var4) {
               if(var3 >= 0 && var4 >= 0 && var3 < 180 && var4 < 180 && this.a.A) {
                  if(this.a.g[var4 + var3 * 180] == 44) {
                     this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var1 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var2 - this.a.M * 2 + this.a.V + this.a.M / 2);
                  }

                  if(this.a.g[var4 + var3 * 180] != 0 && this.a.g[var4 + var3 * 180] != 1 && this.a.g[var4 + var3 * 180] != 5 && this.a.g[var4 + var3 * 180] != 18 && this.a.g[var4 + var3 * 180] != 13 && this.a.g[var4 + var3 * 180] != 21 && this.a.g[var4 + var3 * 180] != 22 && this.a.g[var4 + var3 * 180] != 49) {
                     if(this.a.g[var4 + var3 * 180] != 0) {
                        this.a.a.a(this.a.a(), this.a.p[this.a.g[var4 + var3 * 180]], this.a.aM + this.a.M * var1 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var2 - this.a.M * 2 + this.a.V + this.a.M / 2);
                     }
                  } else {
                     this.a(var4, var3, var1, var2);
                  }
               }

               if(var3 == this.a.aa && var4 == this.a.Z) {
                  var5 = var1;
                  var6 = var2;

                  for(var7 = this.a.aa; var7 < this.a.aa + 10; ++var7) {
                     for(var8 = this.a.Z - 5; var8 < this.a.Z + 5; ++var8) {
                        if(var7 >= 0 && var8 >= 0 && var7 < 180 && var8 < 180) {
                           if(this.a.g[var8 + var7 * 180] != 0) {
                              if(this.a.g[var8 + var7 * 180] != 0 && this.a.g[var8 + var7 * 180] != 1 && this.a.g[var8 + var7 * 180] != 5 && this.a.g[var8 + var7 * 180] != 18 && this.a.g[var8 + var7 * 180] != 13 && this.a.g[var8 + var7 * 180] != 21 && this.a.g[var8 + var7 * 180] != 22 && this.a.g[var8 + var7 * 180] != 49) {
                                 if(!this.a.T) {
                                    this.a.a.a();
                                 } else {
                                    this.a.a.b();
                                 }
                              } else {
                                 this.a(var4, var3, var5, var6);
                                 if(!this.a.T) {
                                    this.a.a.a();
                                 } else {
                                    this.a.a.b();
                                 }
                              }
                           } else if(!this.a.T) {
                              this.a.a.a();
                           } else {
                              this.a.a.b();
                           }
                        }

                        ++var5;
                     }

                     var5 = 0;
                     ++var6;
                  }
               }

               if(var3 >= 0 && var4 >= 0 && var3 < 180 && var4 < 180) {
                  if(this.a.l[var4 + var3 * 180] == 51) {
                     for(var5 = 0; var5 < this.a; ++var5) {
                        if(this.a[var5].c == var4 && this.a[var5].d == var3) {
                           if(this.a[var5].m != 1) {
                              this.a[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 51;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 52) {
                     for(var5 = 0; var5 < this.b; ++var5) {
                        if(this.b[var5].c == var4 && this.b[var5].d == var3) {
                           if(this.b[var5].m != 1) {
                              this.b[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 52;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 53) {
                     for(var5 = 0; var5 < this.c; ++var5) {
                        if(this.c[var5].c == var4 && this.c[var5].d == var3) {
                           if(this.c[var5].m != 1) {
                              this.c[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 53;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 54) {
                     for(var5 = 0; var5 < this.d; ++var5) {
                        if(this.d[var5].c == var4 && this.d[var5].d == var3) {
                           if(this.d[var5].m != 1) {
                              this.d[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 54;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 55) {
                     for(var5 = 0; var5 < this.e; ++var5) {
                        if(this.e[var5].c == var4 && this.e[var5].d == var3) {
                           if(this.e[var5].m != 1) {
                              this.e[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 55;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 63) {
                     for(var5 = 0; var5 < this.f; ++var5) {
                        if(this.f[var5].c == var4 && this.f[var5].d == var3) {
                           if(this.f[var5].m != 1) {
                              this.f[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 63;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 64) {
                     for(var5 = 0; var5 < this.g; ++var5) {
                        if(this.g[var5].c == var4 && this.g[var5].d == var3) {
                           if(this.g[var5].m != 1) {
                              this.g[var5].a(var1 - 1, var2 - 1);
                              this.a[this.h][0] = 64;
                              this.a[this.h][1] = var5;
                              ++this.h;
                           }
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 42) {
                     for(var5 = 0; var5 < this.i; ++var5) {
                        if(this.a[var5].c == var4 && this.a[var5].d == var3) {
                           this.a[var5].a(var1 - 1, var2 - 1);
                           this.b[this.l][0] = 42;
                           this.b[this.l][1] = var5;
                           ++this.l;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 48) {
                     for(var5 = 0; var5 < this.j; ++var5) {
                        if(this.b[var5].c == var4 && this.b[var5].d == var3) {
                           this.b[var5].a(var1 - 1, var2 - 1);
                           this.b[this.l][0] = 48;
                           this.b[this.l][1] = var5;
                           ++this.l;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 62) {
                     for(var5 = 0; var5 < this.k; ++var5) {
                        if(this.c[var5].c == var4 && this.c[var5].d == var3) {
                           this.c[var5].a(var1 - 1, var2 - 1);
                           this.b[this.l][0] = 62;
                           this.b[this.l][1] = var5;
                           ++this.l;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 43) {
                     for(var5 = 0; var5 < this.m; ++var5) {
                        if(this.a[var5].c == var4 && this.a[var5].d == var3) {
                           this.a[var5].a(var1 - 1, var2 - 1);
                           this.c[this.q][0] = 43;
                           this.c[this.q][1] = var5;
                           ++this.q;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 44) {
                     for(var5 = 0; var5 < this.n; ++var5) {
                        if(this.b[var5].c == var4 && this.b[var5].d == var3) {
                           this.b[var5].a(var1 - 1, var2 - 1);
                           this.c[this.q][0] = 44;
                           this.c[this.q][1] = var5;
                           ++this.q;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 49) {
                     for(var5 = 0; var5 < this.o; ++var5) {
                        if(this.c[var5].c == var4 && this.c[var5].d == var3) {
                           this.c[var5].a(var1 - 1, var2 - 1);
                           this.c[this.q][0] = 49;
                           this.c[this.q][1] = var5;
                           ++this.q;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 50) {
                     for(var5 = 0; var5 < this.p; ++var5) {
                        if(this.d[var5].c == var4 && this.d[var5].d == var3) {
                           this.d[var5].a(var1 - 1, var2 - 1);
                           this.c[this.q][0] = 50;
                           this.c[this.q][1] = var5;
                           ++this.q;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 5) {
                     for(var5 = 0; var5 < this.t; ++var5) {
                        if(this.a[var5].c == var4 && this.a[var5].d == var3) {
                           this.a[var5].a(var1 - 1, var2 - 1);
                           this.d[this.x][0] = 5;
                           this.d[this.x][1] = var5;
                           ++this.x;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 45) {
                     for(var5 = 0; var5 < this.t; ++var5) {
                        if(this.b[var5].c == var4 && this.b[var5].d == var3) {
                           this.b[var5].a(var1 - 1, var2 - 1);
                           this.d[this.x][0] = 45;
                           this.d[this.x][1] = var5;
                           ++this.x;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 46) {
                     for(var5 = 0; var5 < this.v; ++var5) {
                        if(this.c[var5].c == var4 && this.c[var5].d == var3) {
                           this.c[var5].a(var1 - 1, var2 - 1);
                           this.d[this.x][0] = 46;
                           this.d[this.x][1] = var5;
                           ++this.x;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 47) {
                     for(var5 = 0; var5 < this.w; ++var5) {
                        if(this.d[var5].c == var4 && this.d[var5].d == var3) {
                           this.d[var5].a(var1 - 1, var2 - 1);
                           this.d[this.x][0] = 47;
                           this.d[this.x][1] = var5;
                           ++this.x;
                           break;
                        }
                     }
                  } else if(this.a.l[var4 + var3 * 180] == 56) {
                     for(var5 = 0; var5 < this.r; ++var5) {
                        if(this.a[var5].a == var4 && this.a[var5].b == var3) {
                           this.a[var5].a(var1 - 1, var2 - 1);
                           this.a[this.s] = var5;
                           ++this.s;
                           break;
                        }
                     }
                  }
               }

               ++var1;
            }

            var1 = 0;
            ++var2;
         }

         if(this.a.m != 2) {
            for(var4 = 0; var4 < this.h; ++var4) {
               switch(this.a[var4][0]) {
               case 51:
                  this.a[this.a[var4][1]].a();
                  break;
               case 52:
                  this.b[this.a[var4][1]].a();
                  break;
               case 53:
                  this.c[this.a[var4][1]].a();
                  break;
               case 54:
                  this.d[this.a[var4][1]].a();
                  break;
               case 55:
                  this.e[this.a[var4][1]].a();
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               default:
                  break;
               case 63:
                  this.f[this.a[var4][1]].a();
                  break;
               case 64:
                  this.g[this.a[var4][1]].a();
               }
            }

            for(var5 = 0; var5 < this.l; ++var5) {
               switch(this.b[var5][0]) {
               case 42:
                  this.a[this.b[var5][1]].a();
                  break;
               case 48:
                  this.b[this.b[var5][1]].a();
                  break;
               case 62:
                  this.c[this.b[var5][1]].a();
               }
            }

            for(var6 = 0; var6 < this.q; ++var6) {
               switch(this.c[var6][0]) {
               case 43:
                  this.a[this.c[var6][1]].a();
                  break;
               case 44:
                  this.b[this.c[var6][1]].a();
               case 45:
               case 46:
               case 47:
               case 48:
               default:
                  break;
               case 49:
                  this.c[this.c[var6][1]].a();
                  break;
               case 50:
                  this.d[this.c[var6][1]].a();
               }
            }

            for(var7 = 0; var7 < this.x; ++var7) {
               switch(this.d[var7][0]) {
               case 5:
                  this.a[this.d[var7][1]].a();
                  break;
               case 45:
                  this.b[this.d[var7][1]].a();
                  break;
               case 46:
                  this.c[this.d[var7][1]].a();
                  break;
               case 47:
                  this.d[this.d[var7][1]].a();
               }
            }

            for(var8 = 0; var8 < this.s; ++var8) {
               this.a[this.a[var8]].a();
            }
         }

         this.h = 0;
         this.l = 0;
         this.q = 0;
         this.x = 0;
         this.s = 0;
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   private void a(int var1, int var2, int var3, int var4) {
      if(this.a.g[var1 + var2 * 180] == this.d[18]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[18], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.a(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.b(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.c(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.d(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 4) {
            this.a.a.e(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 5) {
            this.a.a.f(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 6) {
            this.a.a.g(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 7) {
            this.a.a.h(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 8) {
            this.a.a.i(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 9) {
            this.a.a.j(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 10) {
            this.a.a.k(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 11) {
            this.a.a.l(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 12) {
            this.a.a.m(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[1]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[1], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.n(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.o(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.p(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.q(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 4) {
            this.a.a.r(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 5) {
            this.a.a.s(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 6) {
            this.a.a.t(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 7) {
            this.a.a.u(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[5]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[5], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.v(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.w(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.x(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.y(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 4) {
            this.a.a.z(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 5) {
            this.a.a.A(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 6) {
            this.a.a.B(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 7) {
            this.a.a.C(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 8) {
            this.a.a.D(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[13]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[13], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.E(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.F(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.G(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.H(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 4) {
            this.a.a.I(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 5) {
            this.a.a.J(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 6) {
            this.a.a.K(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 7) {
            this.a.a.L(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 8) {
            this.a.a.M(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 9) {
            this.a.a.N(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 10) {
            this.a.a.O(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 11) {
            this.a.a.P(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[21]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[21], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.Q(var3, var4);
         }

         if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.R(var3, var4);
         }

         if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.S(var3, var4);
         }

         if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.T(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[22]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[22], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.U(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.V(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.V(var3, var4);
         } else if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.V(var3, var4);
         }
      }

      if(this.a.g[var1 + var2 * 180] == this.d[49]) {
         this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         this.a.a.a(this.a.a(), this.a.p[49], this.a.aM + this.a.M * var3 - this.a.M * 2 + this.a.U + this.a.M / 2, this.a.aN + this.a.M * var4 - this.a.M * 2 + this.a.V + this.a.M / 2);
         if(this.a.h[var1 + var2 * 180] == 0) {
            this.a.a.W(var3, var4);
            return;
         }

         if(this.a.h[var1 + var2 * 180] == 1) {
            this.a.a.X(var3, var4);
            return;
         }

         if(this.a.h[var1 + var2 * 180] == 2) {
            this.a.a.Y(var3, var4);
            return;
         }

         if(this.a.h[var1 + var2 * 180] == 3) {
            this.a.a.Z(var3, var4);
            return;
         }

         if(this.a.h[var1 + var2 * 180] == 4) {
            this.a.a.aa(var3, var4);
            return;
         }

         if(this.a.h[var1 + var2 * 180] == 5) {
            this.a.a.ab(var3, var4);
         }
      }

   }

   public final void a(boolean var1) {
      int var2;
      if(var1) {
         for(var2 = 0; var2 < 32400; ++var2) {
            this.c[var2] = this.a.k[var2];
            this.d[var2] = this.a.i[var2];
            if(this.a.k[var2] == 4) {
               this.a.k[var2] = 0;
            }

            if(this.a.k[var2] == 5) {
               this.a.k[var2] = 4;
            }

            if(this.a.k[var2] == 6) {
               this.a.k[var2] = 5;
            }

            if(this.a.i[var2] == 7) {
               this.a.i[var2] = 0;
            }

            if(this.a.i[var2] == 19) {
               this.a.i[var2] = 7;
            }

            if(this.a.i[var2] == 22) {
               this.a.i[var2] = 19;
            }

            if(this.a.i[var2] == 6) {
               this.a.i[var2] = 0;
            }

            if(this.a.i[var2] == 18) {
               this.a.i[var2] = 6;
            }

            if(this.a.i[var2] == 21) {
               this.a.i[var2] = 18;
            }

            if(this.a.i[var2] == 5) {
               this.a.i[var2] = 0;
            }

            if(this.a.i[var2] == 17) {
               this.a.i[var2] = 5;
            }

            if(this.a.i[var2] == 20) {
               this.a.i[var2] = 17;
            }
         }
      } else {
         for(var2 = 0; var2 < 32400; ++var2) {
            this.a.k[var2] = this.c[var2];
            this.a.i[var2] = this.d[var2];
         }
      }

      if(!this.a.ax) {
         this.a("BIGislandObjects", this.a.l);
         this.a.a();
         this.d();
         this.a.a();
         this.a.a.b();
         this.a.a();
      }

   }

   public final void j() {
      this.a.v = null;
      this.a.aH = -1;
      this.a.b = null;
      switch(this.a.j[this.a(this.a.Z - 1, this.a.aa - 1)]) {
      case 50:
         if(!this.a.aj) {
            this.a.c = this.a.a.a(0);
            this.a.aj = true;
            this.a.m = 9;
            this.a.aw = true;
            return;
         }
         break;
      case 51:
         if(!this.a.ak) {
            this.a.c = this.a.a.a(1);
            this.a.ak = true;
            this.a.m = 9;
            this.a.aw = true;
            return;
         }
         break;
      case 52:
         if(!this.a.al) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(2).toString() + "\\n \\n" + this.a.a.a(4).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(2).toString() + "\\n \\n" + this.a.a.a(3).toString());
            }

            this.a.al = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{3, 6, 5};
            return;
         }
         break;
      case 53:
         if(!this.a.am) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(5).toString() + "\\n \\n" + this.a.a.a(7).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(5).toString() + "\\n \\n" + this.a.a.a(6).toString());
            }

            this.a.am = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{9, 7, 4};
            this.a.aH = 9;
            return;
         }
         break;
      case 54:
         if(!this.a.an) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(8).toString() + "\\n \\n" + this.a.a.a(10).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(8).toString() + "\\n \\n" + this.a.a.a(9).toString());
            }

            this.a.an = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{9, 7, 4};
            this.a.aH = 4;
            return;
         }
         break;
      case 55:
         if(!this.a.ao) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(11).toString() + "\\n \\n" + this.a.a.a(13).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(11).toString() + "\\n \\n" + this.a.a.a(12).toString());
            }

            this.a.ao = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{13};
            this.a.aH = 13;
            return;
         }
         break;
      case 56:
         if(!this.a.ap) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(14).toString() + "\\n \\n" + this.a.a.a(16).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(14).toString() + "\\n \\n" + this.a.a.a(15).toString());
            }

            this.a.ap = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{12};
            this.a.aH = 12;
            return;
         }
         break;
      case 57:
         if(!this.a.aq) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(17).toString() + "\\n \\n" + this.a.a.a(19).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(17).toString() + "\\n \\n" + this.a.a.a(18).toString());
            }

            this.a.aq = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{11};
            this.a.aH = 11;
            return;
         }
         break;
      case 58:
         if(!this.a.ar) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(20).toString() + "\\n \\n" + this.a.a.a(22).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(20).toString() + "\\n \\n" + this.a.a.a(21).toString());
            }

            this.a.ar = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{14};
            this.a.aH = 14;
            return;
         }
         break;
      case 59:
         if(!this.a.as) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(23).toString() + "\\n \\n" + this.a.a.a(25).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(23).toString() + "\\n \\n" + this.a.a.a(24).toString());
            }

            this.a.as = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{10, 9, 6};
            this.a.aH = 9;
            return;
         }
         break;
      case 60:
         if(!this.a.at) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(26).toString() + "\\n \\n" + this.a.a.a(28).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(26).toString() + "\\n \\n" + this.a.a.a(27).toString());
            }

            this.a.at = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{9, 7, 4};
            this.a.aH = 7;
            this.a.b = this.a.a.a(60);
            return;
         }
         break;
      case 61:
         if(!this.a.au) {
            this.a.c = this.a.a.a(29);
            this.a.au = true;
            this.a.m = 9;
            this.a.aw = true;
            return;
         }
         break;
      case 62:
         if(!this.a.av) {
            if(this.a.hasPointerEvents()) {
               this.a.c = new StringBuffer(this.a.a.a(30).toString() + "\\n \\n" + this.a.a.a(32).toString());
            } else {
               this.a.c = new StringBuffer(this.a.a.a(30).toString() + "\\n \\n" + this.a.a.a(31).toString());
            }

            this.a.av = true;
            this.a.m = 9;
            this.a.aw = true;
            this.a.v = new int[]{9, 7, 4};
            this.a.aH = 7;
            this.a.b = this.a.a.a(68);
         }
      }

   }
}
