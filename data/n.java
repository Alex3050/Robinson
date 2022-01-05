package data;

import data.k;
import data.p;
import java.util.Random;

public final class n {

   private p a;
   public int a = 0;
   private int b;
   private int c;
   private int d;
   private int e = 0;
   private int f = 0;
   private int g = 0;
   private boolean a = false;
   private boolean b = true;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = true;
   private int h = 0;
   private int i;
   private int j = 0;
   private int k = 0;
   private int l;
   private int[] a;
   private int[] b;
   private int[] c;
   private int m;
   private int[] d;
   private int[] e;
   private int[] f;
   private int[] g;
   private int[] h;
   private boolean[] a;
   public Random a = new Random();


   public n(p var1) {
      this.a = var1;
   }

   public final void a() {
      if(this.a.a.a == 0) {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.v = 0L;
            this.m();
            this.a.a.c();
         }

         if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
            this.a.v = 2001L;
            this.a.aK = true;
         }

         if(this.a.v > 2000L) {
            this.a.a.c = false;
            this.a.m = 0;
            this.a.a.f();
         }

         this.a.a.b = true;
      } else {
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b() - 44);
         if(this.a.aw) {
            this.a.a.setColor(13158);
            this.a.a.fillRect(0, k.b() - 44, k.a(), k.b());
         }

         if(this.f) {
            this.a.x = 0L;
            this.e = true;
            this.f = false;
         }

         if(this.e) {
            if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.x = 8001L;
               this.a.aK = true;
            }

            if(this.a.x > 8000L) {
               this.e = false;
            }

            this.a.a.setColor(13158);
            this.a.a.fillRect(0, 0, k.a(), k.b());
            this.a.a.a(this.a.a, 851985, k.a() >> 1, k.b() / 3);
            this.a.a.a(this.a.a, this.a.a.a(90), k.a() >> 1, (k.b() >> 1) - 6, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            this.a.a.c();
         } else {
            if(!this.c && !this.d) {
               this.e();
               this.f();
               if(this.a.aw) {
                  String var1 = (new Integer(this.h)).toString() + "/5";
                  String var2 = (new Integer(this.i)).toString() + "/10";
                  this.a.a.a(this.a.a, 851970, k.a() / 7, k.b() - 32);
                  this.a.a.a(this.a.a, new StringBuffer(var1), k.a() / 7 + 28, k.b() - 30, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
                  this.a.a.a(this.a.a, 851985, k.a() / 5 * 3 + k.a() / 5 / 2, k.b() - 32);
                  this.a.a.a(this.a.a, new StringBuffer(var2), k.a() / 5 * 3 + k.a() / 5 / 2 + 28, k.b() - 30, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
                  this.a.aw = false;
               }

               this.g();
               this.h();
               this.i();
               if(this.a.hasPointerEvents()) {
                  this.a.a.a(this.a.a, 655417, k.a() / 2 - 12, k.b() - 2 - 12 - 2 - 24 - 12);
                  this.a.a.a(this.a.a, 655411, k.a() / 2 - 24 - 2, k.b() - 2 - 12 - 2 - 24);
                  this.a.a.a(this.a.a, 655412, k.a() / 2 + 12 + 2, k.b() - 2 - 12 - 2 - 24);
                  this.a.a.a(this.a.a, 655418, k.a() / 2 - 12, k.b() - 2 - 12);
               }
            }

            int var4;
            int var5;
            if(this.d) {
               this.a.a.a = true;
               this.a.a.a(851985);
               if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
                  this.a.x = 8001L;
                  this.a.aK = true;
               }

               if(this.a.x > 8000L) {
                  this.d = false;
                  if(this.a >= 5) {
                     --this.a.q[this.a.a.b];
                     if(this.a.q[this.a.a.b] == 0) {
                        for(var4 = this.a.a.b; var4 < this.a.aB - 1; ++var4) {
                           this.a.m[var4] = this.a.m[var4 + 1];
                           this.a.q[var4] = this.a.q[var4 + 1];
                        }

                        --this.a.aB;
                     }

                     this.a = 0;
                  } else {
                     ++this.a;
                  }

                  if((var4 = this.a.m[3]) < 0) {
                     var4 = -var4;

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.a.c -= this.a.d / 100.0F;
                        if(this.a.c <= 0.0F) {
                           this.a.a.b();
                           break;
                        }
                     }
                  } else {
                     for(var5 = 0; var5 < this.a.m[3]; ++var5) {
                        this.a.c += this.a.d / 100.0F;
                        if(this.a.c >= this.a.d) {
                           this.a.c = this.a.d;
                           break;
                        }
                     }
                  }

                  this.a.m = 0;
                  this.a.a.f();
               }

               this.a.a.b = true;
               this.a.a.c();
            }

            if(this.c) {
               this.a.a.a = true;
               this.l();
               if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
                  this.a.x = 8001L;
                  this.a.aK = true;
               }

               if(this.a.x > 8000L) {
                  this.c = false;
                  this.a.m = 0;
                  this.a.a.f();
                  this.a.a.a = true;

                  for(var4 = 0; var4 < this.a.aB; ++var4) {
                     if(this.a.m[var4] == 1) {
                        ++this.a.q[var4];
                        this.a.a.a = false;
                     }
                  }

                  if(this.a.a.a) {
                     this.a.m[this.a.aB] = 1;
                     this.a.q[this.a.aB] = 1;
                     ++this.a.aB;
                  }

                  if(this.a >= 5) {
                     --this.a.q[this.a.a.b];
                     if(this.a.q[this.a.a.b] == 0) {
                        for(var5 = this.a.a.b; var5 < this.a.aB - 1; ++var5) {
                           this.a.m[var5] = this.a.m[var5 + 1];
                           this.a.q[var5] = this.a.q[var5 + 1];
                        }

                        --this.a.aB;
                     }

                     this.a = 1;
                  } else {
                     ++this.a;
                  }

                  int var3;
                  if((var5 = this.a.m[3]) < 0) {
                     var5 = -var5;

                     for(var3 = 0; var3 < var5; ++var3) {
                        this.a.c -= this.a.d / 100.0F;
                        if(this.a.c <= 0.0F) {
                           this.a.a.b();
                           break;
                        }
                     }
                  } else {
                     for(var3 = 0; var3 < this.a.m[3]; ++var3) {
                        this.a.c += this.a.d / 100.0F;
                        if(this.a.c >= this.a.d) {
                           this.a.c = this.a.d;
                           break;
                        }
                     }
                  }

                  this.a.q = 1;
                  this.a.a.f();
               }

               this.a.a.b = true;
               this.a.a.c();
            }

         }
      }
   }

   private void e() {
      if(!this.a) {
         this.a.a.setColor(26265);
         this.a.a.fillArc(this.c - this.a.a.e * (k.b() - 50 >> 1) / 100, this.d - this.a.a.e * (k.b() - 50 >> 1) / 100, 2 * this.a.a.e * (k.b() - 50 >> 1) / 100, 2 * this.a.a.e * (k.b() - 50 >> 1) / 100, this.a.a.c, 30);
      }

   }

   private void f() {
      for(int var1 = 0; var1 < this.l; ++var1) {
         this.a.a.a(this.a.a, this.c[var1], this.a[var1], this.b[var1]);
      }

   }

   private void g() {
      for(int var1 = 0; var1 < this.m; ++var1) {
         switch(this.f[var1]) {
         case 0:
            this.a.a.a(this.a.a, 851970, this.d[var1], this.e[var1]);
            break;
         case 1:
            this.a.a.a(this.a.a, 851970, this.d[var1] + this.j, this.e[var1]);
            if((long)this.g[var1] > 11000L) {
               this.f[var1] = 0;
               this.g[var1] = 0;
            } else {
               this.g[var1] = (int)((long)this.g[var1] + this.a.f);
            }
            break;
         case 2:
            this.a.a.a(this.a.a, 851970, this.d[var1], this.e[var1]);
            if(this.e[var1] < k.b() - 50) {
               this.e[var1] += 5;
            } else {
               this.e[var1] = k.b() - 50;
               this.f[var1] = 3;
               if(this.h >= 5) {
                  this.c = true;
                  this.a.x = 0L;
               }
            }
            break;
         case 3:
            this.a.a.a(this.a.a, 851970, this.d[var1], this.e[var1]);
         }
      }

      if(this.j == 1) {
         this.k = 0;
      }

      if(this.j == -1) {
         this.k = 1;
      }

      if(this.k == 0) {
         --this.j;
      } else {
         ++this.j;
      }
   }

   private void h() {
      this.a.a.a(this.a.a, 851985, this.c, this.d);
      if(this.a) {
         this.d = k.b() - 50 - (-(this.e * (this.c - 10) * (this.c - 10) / this.f) + this.g * (this.c - 10) / this.a.a.b[this.a.a.d]);
         this.c = 10 + (int)(this.a.G * 2L * (long)this.a.a.b[this.a.a.d] / 100L * (long)this.a.a.e * (long)this.b / 100L / this.a.a.a);
         if(this.d > k.b() - 50) {
            this.a = false;
            this.c = 10;
            this.d = k.b() - 50;
            this.a.a.e = 40;
            this.a.a.d = 15;
            this.a.a.c = 70;

            for(int var1 = 0; var1 < this.m; ++var1) {
               this.h[var1] = 0;
            }

            if(this.i == 10 && this.h < 5) {
               this.d = true;
               this.a.x = 0L;
            }
         }
      }

   }

   private void i() {
      for(int var1 = 0; var1 < this.m; ++var1) {
         if(this.h[var1] == 0 && this.d[var1] - 7 < this.c + 4 && this.d[var1] + 7 > this.c - 4 && this.e[var1] - 5 < this.d + 4 && this.e[var1] + 5 > this.d - 4) {
            if(this.f[var1] == 0) {
               this.f[var1] = 1;
               this.g[var1] = 0;
               this.h[var1] = 1;
            } else if(this.f[var1] == 1) {
               ++this.h;
               this.a.aw = true;
               this.f[var1] = 2;
            }
         }
      }

   }

   public final void b() {
      this.a.a.a = 0;
      this.a.a.b = -1;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         if(this.a.m[var1] == 3) {
            this.a.a.b = var1;
            this.a.a.a = this.a.q[var1];
         }
      }

      if(this.a.a.a > 0) {
         this.c = 10;
         this.d = k.b() - 50;
         this.a.a.e = 40;
         this.a.a.c = 70;
         this.h = 0;
         this.i = 0;
         this.b = k.b() - 50;
         this.c();
         this.j();
         this.k();
         this.a.a.b = true;
         this.a.aK = false;
         this.a = false;
         this.b = true;
         this.c = false;
         this.d = false;
         this.f = true;
         this.a.aw = true;
      } else {
         this.a.aw = true;
      }
   }

   public final void c() {
      int var1 = k.b() - 50;
      int var2;
      if(k.a() - 10 <= var1) {
         var2 = k.a() - 10;
      } else {
         var2 = var1;
      }

      while(this.b * this.b < var1 * var1 + var2 * var2) {
         ++this.b;
      }

   }

   private void j() {
      int var1 = (k.a() - 15) / 14 * ((k.b() / 3 - 30) / 5);
      this.l = 9 + Math.abs(this.a.nextInt()) % (k.a() / 12);
      if(this.l > var1) {
         this.l = var1;
      }

      this.a = new int[this.l];
      this.b = new int[this.l];
      this.c = new int[this.l];
      boolean[] var3 = new boolean[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = false;
      }

      for(int var6 = 0; var6 < this.l; ++var6) {
         int var5;
         for(var5 = Math.abs(this.a.nextInt()) % var1; var3[var5]; var5 = Math.abs(this.a.nextInt()) % var1) {
            ;
         }

         var3[var5] = true;
         this.a[var6] = 15 + 14 * (var5 % ((k.a() - 15) / 14));
         this.b[var6] = 30 + 5 * (var5 / ((k.a() - 15) / 14));
         switch(Math.abs(this.a.nextInt()) % 3) {
         case 0:
            this.c[var6] = 458805;
            break;
         case 1:
            this.c[var6] = 458806;
            break;
         case 2:
            this.c[var6] = 458807;
         }
      }

   }

   private void k() {
      this.m = 5 + Math.abs(this.a.nextInt()) % 3;
      this.d = new int[this.m];
      this.e = new int[this.m];
      this.f = new int[this.m];
      this.g = new int[this.m];
      this.h = new int[this.m];
      this.a = new boolean[this.l];

      for(int var1 = 0; var1 < this.l; ++var1) {
         this.a[var1] = false;
      }

      for(int var3 = 0; var3 < this.m; ++var3) {
         int var2;
         for(var2 = 3 + Math.abs(this.a.nextInt()) % (this.l - 3); this.a[var2] || this.a[var2] < 15 || this.a[var2] > k.a() - 7; var2 = 3 + Math.abs(this.a.nextInt()) % (this.l - 3)) {
            ;
         }

         this.a[var2] = true;
         this.d[var3] = this.a[var2];
         this.e[var3] = this.b[var2];
         this.f[var3] = 0;
         this.g[var3] = 0;
         this.h[var3] = 0;
      }

   }

   public final void d() {
      if(!this.a && !this.c && !this.a.aK) {
         if((this.a.bu & 16) != 0 || this.a.a.e == 5) {
            if(!this.b) {
               this.a = true;
               this.a.a.d = (this.a.a.c + 15) / 5 - 3;
               this.e = this.a.a.a[this.a.a.d] * 10000 / (this.a.a.b[this.a.a.d] * this.a.a.b[this.a.a.d]);
               this.f = this.a.a.e * this.b;
               this.g = 2 * this.a.a.a[this.a.a.d];
               this.a.a.a = (long)(3000 / k.a() * this.a.a.b[this.a.a.d] / 100 * this.a.a.e * this.b / 100 + 2000 / (k.b() - 50) * this.a.a.a[this.a.a.d] / 100 * this.a.a.e * this.b / 100);
               this.a.G = 0L;
               ++this.i;
               this.a.aw = true;
            } else {
               this.b = false;
            }
         }

         if((this.a.bt & 4) == 0 && this.a.a.e != 2) {
            if((this.a.bt & 8) == 0 && this.a.a.e != 8) {
               if((this.a.bt & 1) == 0 && this.a.a.e != 4) {
                  if(((this.a.bt & 2) != 0 || this.a.a.e == 6) && this.a.a.c - 5 >= 10) {
                     this.a.a.c -= 5;
                     return;
                  }
               } else if(this.a.a.c + 5 <= 70) {
                  this.a.a.c += 5;
                  return;
               }
            } else if(this.a.a.e > 40) {
               this.a.a.e -= 2;
               return;
            }
         } else if(this.a.a.e < 100) {
            this.a.a.e += 2;
            return;
         }
      } else {
         this.a.aK = false;
      }

   }

   private void l() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, 851985, k.a() >> 1, k.b() / 3);
      this.a.a.a(this.a.a, this.a.a.a(89), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }

   private void m() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, this.a.a.a(91), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }
}
