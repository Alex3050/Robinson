package data;

import data.e;
import data.k;
import data.p;
import data.z;

public final class t {

   private p a;
   private e a = e.a();
   private byte[] a;
   private int a = 0;


   public t(p var1) {
      this.a = var1;
   }

   public final void a(int var1) {
      byte[] var2;
      (var2 = new byte[1])[0] = (byte)var1;

      try {
         this.a.a("lang", 0, var2.length, var2);
      } catch (z var4) {
         ;
      }
   }

   public final int a() {
      byte[] var1 = null;

      try {
         var1 = this.a.a("lang", 0);
      } catch (z var3) {
         ;
      }

      byte var2;
      if(var1 != null) {
         var2 = var1[0];
      } else {
         var2 = 0;
      }

      return var2;
   }

   public final void a(boolean var1) {
      byte[] var2 = new byte[1];
      byte var3;
      if(var1) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      var2[0] = (byte)var3;

      try {
         this.a.a("daylightSaving", 1, var2.length, var2);
      } catch (z var5) {
         ;
      }
   }

   public final boolean a() {
      byte[] var1 = null;

      try {
         var1 = this.a.a("daylightSaving", 1);
      } catch (z var4) {
         ;
      }

      byte var2;
      if(var1 != null) {
         var2 = var1[0];
      } else {
         var2 = 1;
      }

      boolean var3;
      if(var2 == 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public final void b(int var1) {
      byte[] var2;
      (var2 = new byte[1])[0] = (byte)var1;

      try {
         this.a.a("days", 2, var2.length, var2);
      } catch (z var4) {
         ;
      }
   }

   public final int b() {
      byte[] var1 = null;

      try {
         var1 = this.a.a("days", 2);
      } catch (z var3) {
         ;
      }

      byte var2;
      if(var1 != null) {
         var2 = var1[0];
      } else {
         var2 = 1;
      }

      return var2;
   }

   public final void a() {
      this.a = 70 + this.a.aB + this.a.av + this.a.aw + this.a.s.length * 20 + this.a.r.length * 20 + this.a.a.length + this.a.b.length + this.a.c.length + this.a.d.length;
      this.a = new byte[this.a];
      this.a = 0;
      this.a[this.a++] = (byte)this.a.ab;
      this.a[this.a++] = (byte)this.a.ac;
      if(this.a.ad < 0) {
         this.a[this.a++] = 1;
         this.a.ad = -this.a.ad;
         this.a[this.a++] = (byte)this.a.ad;
      } else {
         this.a[this.a++] = 0;
         this.a[this.a++] = (byte)this.a.ad;
      }

      if(this.a.ae < 0) {
         this.a[this.a++] = 1;
         this.a.ae = -this.a.ae;
         this.a[this.a++] = (byte)this.a.ae;
      } else {
         this.a[this.a++] = 0;
         this.a[this.a++] = (byte)this.a.ae;
      }

      this.a[this.a++] = (byte)this.a.Z;
      this.a[this.a++] = (byte)this.a.aa;
      this.a[this.a++] = (byte)this.a.aB;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         this.a[this.a++] = (byte)this.a.q[var1];
      }

      int var3;
      for(int var2 = 0; var2 < this.a.aB; ++var2) {
         for(var3 = 0; var3 < this.a.b.length; ++var3) {
            if(this.a.m[var2] == (byte)var3) {
               this.a[this.a++] = (byte)var3;
            }
         }
      }

      this.a[this.a++] = (byte)this.a.av;

      for(var3 = 0; var3 < this.a.av; ++var3) {
         this.a[this.a++] = (byte)this.a.g[var3];
      }

      int var5;
      for(int var4 = 0; var4 < this.a.av; ++var4) {
         for(var5 = 0; var5 < this.a.b.length; ++var5) {
            if(this.a.a[var4] == (byte)var5) {
               this.a[this.a++] = (byte)var5;
            }
         }
      }

      this.a[this.a++] = (byte)this.a.aw;

      for(var5 = 0; var5 < this.a.aw; ++var5) {
         this.a[this.a++] = (byte)this.a.h[var5];
      }

      int var7;
      for(int var6 = 0; var6 < this.a.aw; ++var6) {
         for(var7 = 0; var7 < this.a.b.length; ++var7) {
            if(this.a.a[var6].equals(this.a.b[var7])) {
               this.a[this.a++] = (byte)var7;
            }
         }
      }

      this.a[this.a++] = (byte)((int)this.a.a);
      this.a[this.a++] = (byte)((int)this.a.b);
      this.a[this.a++] = (byte)((int)this.a.c);
      this.a[this.a++] = (byte)((int)this.a.e);
      this.a[this.a++] = (byte)((int)this.a.f);
      this.a[this.a++] = (byte)((int)this.a.g);
      this.a[this.a++] = (byte)this.a.L;
      this.a[this.a++] = (byte)((int)this.a.K);
      this.a[this.a++] = (byte)((int)this.a.J);
      if(this.a.f[17] == 393219) {
         this.a[this.a++] = 17;
      } else if(this.a.f[17] == 393216) {
         this.a[this.a++] = 9;
      } else if(this.a.f[17] == 393217) {
         this.a[this.a++] = 10;
      }

      for(var7 = 0; var7 < this.a.s.length; ++var7) {
         this.a((long)this.a.s[var7]);
      }

      this.a[this.a++] = (byte)this.a.aD;
      this.a[this.a++] = (byte)this.a.c;

      for(int var8 = 0; var8 < this.a.r.length; ++var8) {
         this.a((long)this.a.r[var8]);
      }

      this.a[this.a++] = (byte)this.a.aC;
      this.a[this.a++] = (byte)this.a.ap;
      if(this.a.T) {
         this.a.b = (long)(this.a.P + 180 + 1);
      } else {
         for(int var9 = 0; var9 < this.a.l.length; ++var9) {
            if(this.a.l[var9] == 85 || this.a.l[var9] == 95) {
               this.a.b = (long)var9;
            }
         }
      }

      if(this.a.b == 14925L) {
         this.a.b = 14926L;
      }

      this.a(this.a.b);
      if(this.a.T) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      for(int var10 = 0; var10 < this.a.a.length; ++var10) {
         this.a[this.a++] = (byte)this.a.a[var10];
      }

      for(int var11 = 0; var11 < this.a.b.length; ++var11) {
         this.a[this.a++] = (byte)this.a.b[var11];
      }

      for(int var12 = 0; var12 < this.a.c.length; ++var12) {
         this.a[this.a++] = (byte)this.a.c[var12];
      }

      for(int var13 = 0; var13 < this.a.d.length; ++var13) {
         this.a[this.a++] = (byte)this.a.d[var13];
      }

      this.a[this.a++] = (byte)this.a.H;
      this.a[this.a++] = (byte)this.a.I;
      this.a[this.a++] = (byte)this.a.J;
      this.a[this.a++] = (byte)this.a.K;
      this.a[this.a++] = (byte)this.a.D;
      this.a[this.a++] = (byte)this.a.E;
      this.a[this.a++] = (byte)this.a.F;
      this.a[this.a++] = (byte)this.a.G;
      if(this.a.aj) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.ak) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.al) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.am) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.an) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.ao) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.ap) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.aq) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.ar) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.as) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.at) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.au) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      if(this.a.av) {
         this.a[this.a++] = 1;
      } else {
         this.a[this.a++] = 0;
      }

      this.a[this.a++] = (byte)this.a.a.a;
      this.a(this.a.a);

      try {
         this.a.a("RobinsonSave_1", 3, this.a.length, this.a);
      } catch (z var15) {
         ;
      }

      this.a.b = true;
   }

   private void a(long var1) {
      this.a[this.a++] = (byte)((int)(var1 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 7 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 14 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 21 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 28 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 35 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 42 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 49 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 56 & 127L));
      this.a[this.a++] = (byte)((int)(var1 >> 63 & 1L));
   }

   private long a() {
      return (long)(this.a[this.a++] + (this.a[this.a++] << 7) + (this.a[this.a++] << 14) + (this.a[this.a++] << 21) + (this.a[this.a++] << 28) + (this.a[this.a++] << 35) + (this.a[this.a++] << 42) + (this.a[this.a++] << 49) + (this.a[this.a++] << 56) + (this.a[this.a++] << 63));
   }

   public final void a(boolean var1, boolean var2) {
      try {
         this.a = this.a.a("RobinsonSave_1", 3);
         var2 = false;
      } catch (z var16) {
         var2 = true;
      }

      this.a.d = this.a.e = var2;
      if(var2) {
         this.a.Z = 8;
         this.a.aa = 148;
         this.a.ab = this.a.Z - this.a.N / 2;
         this.a.ac = this.a.aa - this.a.O / 2;
      } else {
         this.a = 0;
         this.a.ab = this.a[this.a++];
         this.a.ac = this.a[this.a++];
         int var3;
         if(this.a.ab < 0) {
            var3 = 128 + this.a.ab;
            this.a.ab = 128 + var3;
         }

         if(this.a.ac < 0) {
            var3 = 128 + this.a.ac;
            this.a.ac = 128 + var3;
         }

         if(this.a[this.a++] == 1) {
            this.a.ad = this.a[this.a++];
            this.a.ad = -this.a.ad;
         } else {
            this.a.ad = this.a[this.a++];
         }

         if(this.a[this.a++] == 1) {
            this.a.ae = this.a[this.a++];
            this.a.ae = -this.a.ae;
         } else {
            this.a.ae = this.a[this.a++];
         }

         this.a.Z = this.a[this.a++];
         this.a.aa = this.a[this.a++];
         if(this.a.Z < 0) {
            var3 = 128 + this.a.Z;
            this.a.Z = 128 + var3;
         }

         if(this.a.aa < 0) {
            var3 = 128 + this.a.aa;
            this.a.aa = 128 + var3;
         }

         this.a.aB = this.a[this.a++];

         for(var3 = 0; var3 < this.a.aB; ++var3) {
            this.a.q[var3] = this.a[this.a++];
         }

         for(int var4 = 0; var4 < this.a.aB; ++var4) {
            byte var5 = this.a[this.a++];
            this.a.m[var4] = (byte)var5;
         }

         this.a.av = this.a[this.a++];

         for(int var17 = 0; var17 < this.a.av; ++var17) {
            this.a.g[var17] = this.a[this.a++];
         }

         for(int var6 = 0; var6 < this.a.av; ++var6) {
            byte var7 = this.a[this.a++];
            this.a.a[var6] = (byte)var7;
         }

         this.a.aw = this.a[this.a++];

         for(int var18 = 0; var18 < this.a.aw; ++var18) {
            this.a.h[var18] = this.a[this.a++];
         }

         byte var9;
         for(int var8 = 0; var8 < this.a.aw; ++var8) {
            var9 = this.a[this.a++];
            this.a.a[var8] = this.a.b[var9];
         }

         this.a.a = (float)this.a[this.a++];
         this.a.b = (float)this.a[this.a++];
         this.a.c = (float)this.a[this.a++];
         this.a.e = (float)this.a[this.a++];
         this.a.f = (float)this.a[this.a++];
         this.a.g = (float)this.a[this.a++];
         this.a.L = this.a[this.a++];
         this.a.d = (float)((k.a() / 3 - 16) / 1);
         this.a.c = (long)this.a[this.a++];
         this.a.d = (long)this.a[this.a++];
         var9 = this.a[this.a++];
         this.a.f[17] = this.a.f[var9];
         this.a.c[17] = this.a.c[var9];
         this.a.b[17] = this.a.b[var9];

         for(int var10 = 0; var10 < this.a.s.length; ++var10) {
            this.a.s[var10] = (int)this.a();
         }

         this.a.aD = this.a[this.a++];
         this.a.c = this.a[this.a++];

         for(int var11 = 0; var11 < this.a.r.length; ++var11) {
            this.a.r[var11] = (int)this.a();
         }

         this.a.aC = this.a[this.a++];
         this.a.ap = this.a[this.a++];
         this.a.b = this.a();
         if(this.a[this.a++] == 1) {
            this.a.T = true;
         } else {
            this.a.T = false;
         }

         for(int var12 = 0; var12 < this.a.a.length; ++var12) {
            this.a.a[var12] = this.a[this.a++];
         }

         for(int var13 = 0; var13 < this.a.b.length; ++var13) {
            this.a.b[var13] = this.a[this.a++];
         }

         for(int var14 = 0; var14 < this.a.c.length; ++var14) {
            this.a.c[var14] = this.a[this.a++];
         }

         for(int var15 = 0; var15 < this.a.d.length; ++var15) {
            this.a.d[var15] = this.a[this.a++];
         }

         this.a.H = this.a[this.a++];
         this.a.I = this.a[this.a++];
         this.a.J = this.a[this.a++];
         this.a.K = this.a[this.a++];
         this.a.D = this.a[this.a++];
         this.a.E = this.a[this.a++];
         this.a.F = this.a[this.a++];
         this.a.G = this.a[this.a++];
         if(this.a[this.a++] == 1) {
            this.a.aj = true;
         } else {
            this.a.aj = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.ak = true;
         } else {
            this.a.ak = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.al = true;
         } else {
            this.a.al = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.am = true;
         } else {
            this.a.am = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.an = true;
         } else {
            this.a.an = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.ao = true;
         } else {
            this.a.ao = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.ap = true;
         } else {
            this.a.ap = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.aq = true;
         } else {
            this.a.aq = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.ar = true;
         } else {
            this.a.ar = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.as = true;
         } else {
            this.a.as = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.at = true;
         } else {
            this.a.at = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.au = true;
         } else {
            this.a.au = false;
         }

         if(this.a[this.a++] == 1) {
            this.a.av = true;
         } else {
            this.a.av = false;
         }

         this.a.a.a = this.a[this.a++];
         this.a.a = this.a();
      }
   }
}
