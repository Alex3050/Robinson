package data;

import data.p;
import java.util.Random;

public final class l {

   public byte a;
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int[] a = new int[2];
   public int[] b = new int[2];
   public int[] c = new int[2];
   public int i;
   public int j;
   public long a;
   public long b;
   public int k;
   public int l;
   public boolean a = true;
   public boolean b = true;
   public int m;
   private Random a = new Random();
   private p a;


   public l(p var1, byte var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int[] var9, int[] var10) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.b = var4;
      this.c = var3;
      this.d = var4;
      this.e = var1.M >> 1;
      this.f = var1.M >> 1;
      this.g = var5;
      switch(var6) {
      case 1:
         this.h = var1.aj / 6;
         break;
      case 2:
         this.h = var1.aj / 5;
         break;
      case 3:
         this.h = var1.aj / 4;
         break;
      case 4:
         this.h = var1.aj / 3;
         break;
      case 5:
         this.h = var1.aj / 2;
      }

      this.j = var7;
      this.a = var8;
      this.b = var9;
      this.c = var10;
      this.i = 0;
      this.a = 0L;
      this.b();
      this.m = 0;
   }

   public final void a() {
      switch(this.m) {
      case 0:
         if(this.a) {
            if(this.k > 0) {
               if(this.e < this.a.M - this.h) {
                  this.k -= this.h;
                  this.e += this.h;
               } else {
                  this.a = this.a.a.a(this.d * 180 + this.c + 1, 1) && this.a.a.e(this.d * 180 + this.c + 1, 1) && this.a.a.d(this.d * 180 + this.c + 1, 1) && this.a.a.c(this.d * 180 + this.c + 1, 1) && (this.c + 1 != this.a.Z || this.d != this.a.aa);
                  if(this.a) {
                     this.k -= this.h;
                     this.e = this.e + this.h - this.a.M;
                     this.a.l[this.d * 180 + this.c] = 0;
                     ++this.c;
                     this.a.l[this.d * 180 + this.c] = this.a;
                  }
               }

               if(this.k <= 0) {
                  this.a = false;
               }
            } else {
               if(this.e > 0) {
                  this.k += this.h;
                  this.e -= this.h;
               } else {
                  this.a = this.a.a.a(this.d * 180 + this.c - 1, 0) && this.a.a.e(this.d * 180 + this.c - 1, 0) && this.a.a.d(this.d * 180 + this.c - 1, 0) && this.a.a.c(this.d * 180 + this.c - 1, 0) && (this.c - 1 != this.a.Z || this.d != this.a.aa);
                  if(this.a) {
                     this.k += this.h;
                     this.e = this.e - this.h + this.a.M;
                     this.a.l[this.d * 180 + this.c] = 0;
                     --this.c;
                     this.a.l[this.d * 180 + this.c] = this.a;
                  }
               }

               if(this.k > 0) {
                  this.a = false;
               }
            }
         }

         if(this.b) {
            if(this.l > 0) {
               if(this.f < this.a.M - this.h) {
                  this.l -= this.h;
                  this.f += this.h;
               } else {
                  this.b = this.a.a.a(this.d * 180 + this.c + 180, 3) && this.a.a.e(this.d * 180 + this.c + 180, 3) && this.a.a.d(this.d * 180 + this.c + 180, 3) && this.a.a.c(this.d * 180 + this.c + 180, 3) && (this.c != this.a.Z || this.d + 1 != this.a.aa);
                  if(this.b) {
                     this.l -= this.h;
                     this.f = this.f + this.h - this.a.M;
                     this.a.l[this.d * 180 + this.c] = 0;
                     ++this.d;
                     this.a.l[this.d * 180 + this.c] = this.a;
                  }
               }

               if(this.l <= 0) {
                  this.b = false;
               }
            } else {
               if(this.f > 0) {
                  this.l += this.h;
                  this.f -= this.h;
               } else {
                  this.b = this.a.a.a(this.d * 180 + this.c - 180, 2) && this.a.a.e(this.d * 180 + this.c - 180, 2) && this.a.a.d(this.d * 180 + this.c - 180, 2) && this.a.a.c(this.d * 180 + this.c - 180, 2) && (this.c != this.a.Z || this.d - 1 != this.a.aa);
                  if(this.b) {
                     this.l += this.h;
                     this.f = this.f - this.h + this.a.M;
                     this.a.l[this.d * 180 + this.c] = 0;
                     --this.d;
                     this.a.l[this.d * 180 + this.c] = this.a;
                  }
               }

               if(this.l > 0) {
                  this.b = false;
               }
            }
         }

         if(!this.a && !this.b) {
            if(Math.abs(this.a.nextInt()) % 5 == 0) {
               if(this.a == 48 && this.a.k[this.d * 180 + this.c] == this.a.e[4]) {
                  this.b();
                  this.a = true;
                  this.b = true;
               } else {
                  this.b = (long)((this.j + Math.abs(this.a.nextInt()) % 50) * 100);
                  this.a = 0L;
                  this.m = 1;
               }
            } else {
               this.b();
               this.a = true;
               this.b = true;
            }
         }
         break;
      case 1:
         if(this.a > this.b) {
            if(Math.abs(this.a.nextInt()) % 5 == 0) {
               this.b = (long)((this.j + Math.abs(this.a.nextInt()) % 50) * 100);
               this.a = 0L;
            } else {
               this.b();
               this.a = true;
               this.b = true;
               this.m = 0;
            }
         }
      }

      this.a += this.a.f;
   }

   public final void a(int var1, int var2) {
      switch(this.m) {
      case 0:
         if(this.a.k[this.d * 180 + this.c] != this.a.e[4]) {
            this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         }

         if((this.k <= 0 || !this.a) && (this.k > 0 || this.a)) {
            if(this.i < 2) {
               this.a.a.a(this.a.a(), this.a[0], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
            } else {
               this.a.a.a(this.a.a(), this.a[1], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
            }
         } else if(this.i < 2) {
            this.a.a.a(this.a.a(), this.b[0], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         } else {
            this.a.a.a(this.a.a(), this.b[1], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         }
         break;
      case 1:
         if(this.a.k[this.d * 180 + this.c] != this.a.e[4]) {
            this.a.a.a(this.a.a(), 589827, this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         }

         if(this.i < 2) {
            this.a.a.a(this.a.a(), this.c[0], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         } else {
            this.a.a.a(this.a.a(), this.c[1], this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         }
      }

      if(this.a.k[this.d * 180 + this.c] == this.a.e[4]) {
         if(this.i < 2) {
            this.a.a.a(this.a.a(), 589826, this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         } else {
            this.a.a.a(this.a.a(), 589830, this.a.aM + this.a.M * var1 - this.a.M + this.a.U + this.e, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + this.f);
         }
      }

      if(++this.i == 4) {
         this.i = 0;
      }

   }

   public final void b() {
      if(Math.abs(this.a - this.c) < this.g) {
         this.k = Math.abs(this.a.nextInt()) % (2 * this.a.M * Math.abs(this.g - Math.abs(this.a - this.c))) - this.a.M * Math.abs(this.g - Math.abs(this.a - this.c));
      } else {
         this.k = Math.abs(this.a.nextInt()) % (this.a.M * this.g);
         if(this.c > this.a) {
            this.k = -this.k;
         }
      }

      if(Math.abs(this.b - this.d) < this.g) {
         this.l = Math.abs(this.a.nextInt()) % (2 * this.a.M * Math.abs(this.g - Math.abs(this.b - this.d))) - this.a.M * Math.abs(this.g - Math.abs(this.b - this.d));
      } else {
         this.l = Math.abs(this.a.nextInt()) % (this.a.M * this.g);
         if(this.d > this.b) {
            this.l = -this.l;
         }

      }
   }
}
