package data;

import data.k;
import data.p;
import java.util.Random;

public final class s {

   private p a;
   private int a = 0;
   private boolean a = false;
   private boolean b = false;
   private boolean c = true;
   private boolean d = false;
   private int b;
   private int c;
   private int d = 0;
   private int e = 0;
   private int f = 0;
   private int g = 0;
   private int[] a = new int[]{851993, 851995, 851991, 851996, 851994, 851992};
   private int h;
   private int i;
   private int j;
   private int[] b = new int[10];
   private int[] c = new int[10];
   private int[] d = new int[10];
   private boolean[] a = new boolean[10];
   private int[] e = new int[9];
   private int[] f = new int[9];
   private boolean[] b = new boolean[10];
   private boolean[] c = new boolean[10];
   private int[] g = new int[10];
   private int[] h = new int[10];
   private int[] i = new int[10];
   private int[] j = new int[10];
   private boolean[] d = new boolean[10];
   private int[][] a = new int[10][2];
   private int[][] b = new int[10][2];
   private int[][] c = new int[10][2];
   private int[] k = new int[10];
   private int[] l = new int[10];
   private boolean[] e = new boolean[10];
   private boolean e;
   private int k;
   private long a;
   private boolean f = true;
   private int l;
   public Random a = new Random();


   public s(p var1) {
      this.a = var1;
   }

   public final void a() {
      if(this.a.a.a == 0) {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.v = 0L;
            this.q();
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

         int var5;
         if(!this.d) {
            this.e();
            this.f();
            if(this.a.aw) {
               String var1 = (new Integer(this.i)).toString() + "/" + (new Integer(10)).toString();
               if(this.a.hasPointerEvents()) {
                  this.a.a.a(this.a.a, 851991, k.a() / 7 - 16, k.b() - 32);
                  this.a.a.a(this.a.a, new StringBuffer(var1), k.a() / 7 + 16, k.b() - 30, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               } else {
                  this.a.a.a(this.a.a, 851991, k.a() / 2 - 16, k.b() - 32);
                  this.a.a.a(this.a.a, new StringBuffer(var1), k.a() / 2 + 16, k.b() - 30, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               }

               this.a.aw = false;
            }

            this.h();
            this.g();
            this.i();
            this.j();
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, 655417, k.a() / 2 - 12, k.b() - 2 - 12 - 2 - 24 - 12);
               this.a.a.a(this.a.a, 655411, k.a() / 2 - 24 - 2, k.b() - 2 - 12 - 2 - 24);
               this.a.a.a(this.a.a, 655412, k.a() / 2 + 12 + 2, k.b() - 2 - 12 - 2 - 24);
               this.a.a.a(this.a.a, 655418, k.a() / 2 - 12, k.b() - 2 - 12);
            }

            if(this.e && this.a.D >= 1500L) {
               for(var5 = 0; var5 < this.a.aT; ++var5) {
                  if(this.a[var5]) {
                     switch(this.a.a.c[var5]) {
                     case 42:
                        if(this.a.c[this.a.F] != -1) {
                           this.a.c -= this.a.d / 100.0F * 25.0F;
                        } else {
                           this.a.c -= this.a.d / 100.0F * 50.0F;
                        }
                        break;
                     case 43:
                        if(this.a.b[this.a.E] != -1) {
                           this.a.c -= this.a.d / 100.0F * 25.0F;
                        } else {
                           this.a.c -= this.a.d / 100.0F * 50.0F;
                        }
                     case 44:
                     case 45:
                     case 46:
                     case 47:
                     default:
                        break;
                     case 48:
                        if(this.a.d[this.a.G] != -1) {
                           this.a.c -= this.a.d / 100.0F * 5.0F;
                        } else {
                           this.a.c -= this.a.d / 100.0F * 10.0F;
                        }
                        break;
                     case 49:
                        if(this.a.a[this.a.D] != -1) {
                           this.a.c -= this.a.d / 100.0F * 10.0F;
                        } else {
                           this.a.c -= this.a.d / 100.0F * 20.0F;
                        }
                     }
                  }
               }

               this.d = true;
               this.a.z = 0L;
            }
         }

         int var2;
         int var3;
         if(this.d) {
            this.a.a.a = true;
            this.a.a.a(851990);
            if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.z = 8001L;
               this.a.aK = true;
            }

            if(this.a.z > 8000L) {
               this.d = false;
               this.a.m = 0;
               this.a.a.f();
               --this.a.q[this.a.a.b];
               if(this.a.q[this.a.a.b] == 0) {
                  for(var5 = this.a.a.b; var5 < this.a.aB - 1; ++var5) {
                     this.a.m[var5] = this.a.m[var5 + 1];
                     this.a.q[var5] = this.a.q[var5 + 1];
                  }

                  --this.a.aB;
               }

               for(var5 = 0; var5 < this.a.n[81]; ++var5) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               if((var2 = this.a.m[81]) < 0) {
                  var2 = -var2;

                  for(var3 = 0; var3 < var2; ++var3) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var3 = 0; var3 < this.a.m[81]; ++var3) {
                     this.a.c += this.a.d / 100.0F;
                     if(this.a.c >= this.a.d) {
                        this.a.c = this.a.d;
                        break;
                     }
                  }
               }
            }

            this.a.a.b = true;
         }

         if(this.b) {
            this.a.a.a = true;
            this.l();
            if(this.a.a.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.z = 8001L;
               this.a.aK = true;
            }

            if(this.a.z > 8000L) {
               this.b = false;
               this.a.m = 0;
               this.a.a.f();
               this.a.a.a = true;

               for(var5 = 0; var5 < this.a.aB; ++var5) {
                  if(this.a.m[var5] == this.a.a.c[this.a]) {
                     ++this.a.q[var5];
                     this.a.a.a = false;
                  }
               }

               if(this.a.a.a) {
                  this.a.m[this.a.aB] = (byte)this.a.a.c[this.a];
                  this.a.q[this.a.aB] = 1;
                  ++this.a.aB;
               }

               if(this.a.X) {
                  this.m();
               } else if(this.a.Y) {
                  this.n();
               } else if(this.a.V) {
                  this.o();
               } else if(this.a.W) {
                  this.p();
               }

               --this.a.q[this.a.a.b];
               if(this.a.q[this.a.a.b] == 0) {
                  for(var2 = this.a.a.b; var2 < this.a.aB - 1; ++var2) {
                     this.a.m[var2] = this.a.m[var2 + 1];
                     this.a.q[var2] = this.a.q[var2 + 1];
                  }

                  --this.a.aB;
               }

               for(var2 = 0; var2 < this.a.n[81]; ++var2) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               int var4;
               if((var3 = this.a.m[81]) < 0) {
                  var3 = -var3;

                  for(var4 = 0; var4 < var3; ++var4) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var4 = 0; var4 < this.a.m[81]; ++var4) {
                     this.a.c += this.a.d / 100.0F;
                     if(this.a.c >= this.a.d) {
                        this.a.c = this.a.d;
                        break;
                     }
                  }
               }
            }

            this.a.a.b = true;
         }

      }
   }

   private void e() {
      if(!this.a) {
         this.a.a.setColor(26265);
         this.a.a.fillArc(this.b - this.a.a.e * (k.b() - 50 >> 1) / 100, this.c - this.a.a.e * (k.b() - 50 >> 1) / 100, 2 * this.a.a.e * (k.b() - 50 >> 1) / 100, 2 * this.a.a.e * (k.b() - 50 >> 1) / 100, this.a.a.c, 30);
      }

   }

   private void f() {
      this.a.a.a(this.a.a, 851990, 10, k.b() - 50);
   }

   private void g() {
      for(int var1 = 0; var1 < this.a.aT; ++var1) {
         if(!this.b) {
            if(this.e && this.a[var1]) {
               this.e[var1] = this.h[var1] + this.j[var1] * (int)this.a.D / 1500;
               this.f[var1] = this.g[var1] + this.i[var1] * (int)this.a.D / 1500;
               if(this.j[var1] > 0) {
                  if(this.a.r < 600L) {
                     this.a.a.a(this.a.a, this.a[var1][0], this.e[var1], this.f[var1]);
                  } else {
                     this.a.a.a(this.a.a, this.a[var1][1], this.e[var1], this.f[var1]);
                  }

                  if(this.a.r >= 1200L) {
                     this.a.r = 0L;
                  }
               } else {
                  if(this.a.r < 600L) {
                     this.a.a.a(this.a.a, this.b[var1][0], this.e[var1], this.f[var1]);
                  } else {
                     this.a.a.a(this.a.a, this.b[var1][1], this.e[var1], this.f[var1]);
                  }

                  if(this.a.r >= 1200L) {
                     this.a.r = 0L;
                  }
               }
            } else {
               if(this.i[var1] >= 0) {
                  if(this.b[var1] && this.d[var1]) {
                     this.f[var1] += this.g[var1];
                     this.i[var1] -= this.g[var1];
                     if(this.i[var1] < 0 || this.f[var1] > k.b() / 3) {
                        this.b[var1] = false;
                     }

                     if(this.f[var1] > k.b() / 3) {
                        this.f[var1] = k.b() / 3;
                     }
                  }
               } else if(this.b[var1] && this.d[var1]) {
                  this.f[var1] -= this.g[var1];
                  this.i[var1] += this.g[var1];
                  if(this.i[var1] >= 0 || this.f[var1] <= 45) {
                     this.b[var1] = false;
                  }

                  if(this.f[var1] <= 45) {
                     this.f[var1] = 45;
                  }
               }

               if(!this.c[var1] && !this.b[var1] && !this.e[var1]) {
                  if(Math.abs(this.a.nextInt()) % this.l == 0) {
                     this.e[var1] = true;
                     this.a = (long)((20 + Math.abs(this.a.nextInt()) % 30) * 100);
                     this.a.A = 0L;
                  } else {
                     this.i[var1] = Math.abs(this.a.nextInt()) % (2 * (k.b() / 3 - 30)) - (k.b() / 3 - 30);
                     this.j[var1] = Math.abs(this.a.nextInt()) % (4 * k.a() / 3 - 40) - (2 * k.a() / 3 - 20);
                     this.c[var1] = true;
                     this.b[var1] = true;
                  }
               }

               if(this.e[var1]) {
                  if(!this.f && this.a.A > this.a) {
                     this.e[var1] = false;
                  }

                  if(this.a.r < 600L) {
                     this.a.a.a(this.a.a, this.c[var1][0], this.e[var1], this.f[var1]);
                  } else {
                     this.a.a.a(this.a.a, this.c[var1][1], this.e[var1], this.f[var1]);
                  }

                  if(this.a.r >= 1200L) {
                     this.a.r = 0L;
                  }
               } else if(this.j[var1] >= 0) {
                  if(this.c[var1] && this.d[var1]) {
                     this.e[var1] += this.h[var1];
                     this.j[var1] -= this.h[var1];
                     if(this.j[var1] < 0 || this.e[var1] >= k.a() - 24) {
                        this.c[var1] = false;
                     }

                     if(this.e[var1] >= k.a() - 24) {
                        this.e[var1] = k.a() - 24;
                     }

                     if(this.a.r >= 1200L) {
                        this.a.r = 0L;
                     }
                  }

                  if(this.a.r < 600L) {
                     this.a.a.a(this.a.a, this.a[var1][0], this.e[var1], this.f[var1]);
                  } else {
                     this.a.a.a(this.a.a, this.a[var1][1], this.e[var1], this.f[var1]);
                  }
               } else {
                  if(this.c[var1] && this.d[var1]) {
                     this.e[var1] -= this.h[var1];
                     this.j[var1] += this.h[var1];
                     if(this.j[var1] >= 0 || this.e[var1] < 24) {
                        this.c[var1] = false;
                     }

                     if(this.e[var1] < 24) {
                        this.e[var1] = 24;
                     }

                     if(this.a.r >= 1200L) {
                        this.a.r = 0L;
                     }
                  }

                  if(this.a.r < 600L) {
                     this.a.a.a(this.a.a, this.b[var1][0], this.e[var1], this.f[var1]);
                  } else {
                     this.a.a.a(this.a.a, this.b[var1][1], this.e[var1], this.f[var1]);
                  }
               }
            }
         }
      }

   }

   private void h() {
      for(int var1 = 0; var1 < 10; ++var1) {
         if(this.d[var1] == 3) {
            this.a.a.a(this.a.a, 851992, this.b[var1], this.c[var1] - 7);
         }
      }

   }

   private void i() {
      byte var1 = 0;
      byte var2 = 0;
      if(this.d[this.k] == 1) {
         if(this.b[this.k] < this.g) {
            this.c[this.k] = k.b() - 50 - (-(this.d * (this.b[this.k] - 10) * (this.b[this.k] - 10) / this.e) + this.f * (this.b[this.k] - 10) / this.a.a.b[this.a.a.d]);
            this.b[this.k] = 10 + (int)(this.a.G * 2L * (long)this.a.a.b[this.a.a.d] / 100L * (long)this.a.a.e * (long)this.j / 100L / this.a.a.a);
            if(this.a.a.d > 12) {
               if(this.b[this.k] >= this.g - 1 && this.h < 4) {
                  this.h = 4;
                  var1 = -4;
               } else if(this.b[this.k] >= this.g - 2 && this.h < 3) {
                  this.h = 3;
                  var1 = -3;
               } else if(this.b[this.k] >= this.g - 3 && this.h < 2) {
                  this.h = 2;
                  var2 = -4;
               } else if(this.b[this.k] >= this.g - 4 && this.h < 1) {
                  this.h = 1;
                  var2 = -4;
               }
            } else if(this.b[this.k] >= this.g - 2 && this.h < 4) {
               this.h = 4;
               var1 = -4;
            } else if(this.b[this.k] >= this.g - 4 && this.h < 3) {
               this.h = 3;
               var1 = -3;
            } else if(this.b[this.k] >= this.g - 6 && this.h < 2) {
               this.h = 2;
               var2 = -4;
            } else if(this.b[this.k] >= this.g - 8 && this.h < 1) {
               this.h = 1;
               var2 = -4;
            }
         } else {
            this.d[this.k] = 2;
         }
      }

      if(this.d[this.k] != 0) {
         if(this.d[this.k] == 1) {
            this.a.a.a(this.a.a, this.a[this.h], this.b[this.k] + var1, this.c[this.k] + var2);
         } else {
            this.a.a.a(this.a.a, 851992, this.b[this.k], this.c[this.k] - 7);
         }
      } else {
         switch(this.h) {
         case 0:
            var1 = -4;
            var2 = 0;
            break;
         case 1:
            var1 = -3;
            var2 = 0;
            break;
         case 2:
            var1 = 0;
            var2 = 0;
            break;
         case 3:
            var1 = 0;
            var2 = 2;
         }

         this.a.a.a(this.a.a, this.a[this.h], 10 + var1, k.b() - 50 + var2);
      }
   }

   private void j() {
      if(!this.b && !this.e && this.d[this.k] == 2) {
         for(int var1 = 0; var1 < this.a.aT; ++var1) {
            if(this.e[var1] - (this.k[var1] >> 1) < this.b[this.k] + 8 && this.e[var1] + (this.k[var1] >> 1) > this.b[this.k]) {
               if(this.f[var1] - (this.l[var1] >> 1) < this.c[this.k] + 1 && this.f[var1] + (this.l[var1] >> 1) > this.c[this.k] - 7) {
                  this.b = true;
                  this.a = var1;
                  this.d[var1] = false;
                  this.a.z = 0L;
               } else if(this.k == 0) {
                  this.i[var1] = Math.abs(this.a.nextInt()) % (2 * (k.b() / 3 - 30)) - (k.b() / 3 - 30);
                  this.j[var1] = Math.abs(this.a.nextInt()) % (4 * k.a() / 3) - 2 * k.a() / 3;
                  this.b[var1] = true;
                  this.c[var1] = true;
                  this.f = false;
               }
            } else if(this.k == 0) {
               this.i[var1] = Math.abs(this.a.nextInt()) % (2 * (k.b() / 3 - 30)) - (k.b() / 3 - 30);
               this.j[var1] = Math.abs(this.a.nextInt()) % (4 * k.a() / 3) - 2 * k.a() / 3;
               this.b[var1] = true;
               this.c[var1] = true;
               this.f = false;
            }
         }

         if(this.k == 9) {
            for(int var2 = 0; var2 < this.a.aT; ++var2) {
               if(this.a[var2]) {
                  this.e = true;
                  this.a.D = 0L;
                  this.j[var2] = this.b - this.e[var2];
                  this.i[var2] = this.c - this.f[var2];
                  this.h[var2] = this.e[var2];
                  this.g[var2] = this.f[var2];
               }
            }

            if(!this.e && !this.b) {
               this.d = !this.b;
               this.a.z = 0L;
            }
         } else {
            this.d[this.k] = 3;
            ++this.k;
            this.a = false;
            this.a.a.c = 70;
            this.a.a.e = 40;
         }

         this.h = 0;
      }

   }

   public final void b() {
      this.a.a.a = 0;
      this.a.a.b = -1;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         if(this.a.m[var1] == 45) {
            this.a.a.b = var1;
            this.a.a.a = this.a.q[var1];
         }
      }

      if(this.a.a.a <= 0) {
         this.a.aw = true;
      } else {
         this.b = 10;
         this.c = k.b() - 50;

         for(int var2 = 0; var2 < 10; ++var2) {
            this.b[var2] = 10;
            this.c[var2] = k.b() - 50;
            this.d[var2] = 0;
         }

         this.h = 0;
         this.k = 0;
         this.a.a.e = 40;
         this.a.a.c = 70;
         this.i = 0;
         this.e = false;
         this.l = 0;
         this.j = k.b() - 50;
         this.c();

         for(int var3 = 0; var3 < this.a.aT; ++var3) {
            this.d[var3] = true;
            this.b[var3] = false;
            this.c[var3] = false;
            this.e[var3] = true;
            this.a[var3] = false;
         }

         this.k();
         this.a.a.b = true;
         this.a.aK = false;
         this.a = false;
         this.c = true;
         this.b = false;
         this.d = false;
         this.a.aw = true;
         this.f = true;
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

      while(this.j * this.j < var1 * var1 + var2 * var2) {
         ++this.j;
      }

   }

   private void k() {
      for(int var1 = 0; var1 < this.a.aT; ++var1) {
         switch(this.a.a.c[var1]) {
         case 4:
            this.a[var1][0] = 131074;
            this.a[var1][1] = 131075;
            this.b[var1][0] = 131072;
            this.b[var1][1] = 131073;
            this.c[var1][0] = 131076;
            this.c[var1][1] = 131077;
            this.k[var1] = 24;
            this.l[var1] = 20;
            this.g[var1] = 2;
            this.h[var1] = 2;
         case 5:
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
         case 45:
         case 50:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         default:
            break;
         case 41:
            this.a[var1][0] = 131112;
            this.a[var1][1] = 131113;
            this.b[var1][0] = 131112;
            this.b[var1][1] = 131113;
            this.c[var1][0] = 131112;
            this.c[var1][1] = 131113;
            this.k[var1] = 16;
            this.l[var1] = 15;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 42:
            this.a[var1][0] = 131088;
            this.a[var1][1] = 131089;
            this.b[var1][0] = 131086;
            this.b[var1][1] = 131087;
            this.c[var1][0] = 131088;
            this.c[var1][1] = 131089;
            this.k[var1] = 48;
            this.l[var1] = 14;
            this.g[var1] = 2;
            this.h[var1] = 2;
            this.a[var1] = true;
            break;
         case 43:
            this.a[var1][0] = 131160;
            this.a[var1][1] = 131161;
            this.b[var1][0] = 131158;
            this.b[var1][1] = 131159;
            this.c[var1][0] = 131160;
            this.c[var1][1] = 131161;
            this.k[var1] = 32;
            this.l[var1] = 24;
            this.g[var1] = 2;
            this.h[var1] = 2;
            this.a[var1] = true;
            break;
         case 44:
            this.a[var1][0] = 131084;
            this.a[var1][1] = 131085;
            this.b[var1][0] = 131082;
            this.b[var1][1] = 131083;
            this.c[var1][0] = 131084;
            this.c[var1][1] = 131085;
            this.k[var1] = 24;
            this.l[var1] = 18;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 46:
            this.a[var1][0] = 131092;
            this.a[var1][1] = 131093;
            this.b[var1][0] = 131090;
            this.b[var1][1] = 131091;
            this.c[var1][0] = 131092;
            this.c[var1][1] = 131093;
            this.k[var1] = 20;
            this.l[var1] = 12;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 47:
            this.a[var1][0] = 131080;
            this.a[var1][1] = 131081;
            this.b[var1][0] = 131078;
            this.b[var1][1] = 131079;
            this.c[var1][0] = 131080;
            this.c[var1][1] = 131080;
            this.k[var1] = 20;
            this.l[var1] = 16;
            this.g[var1] = 1;
            this.h[var1] = 1;
            break;
         case 48:
            this.a[var1][0] = 131126;
            this.a[var1][1] = 131127;
            this.b[var1][0] = 131124;
            this.b[var1][1] = 131125;
            this.c[var1][0] = 131128;
            this.c[var1][1] = 131129;
            this.k[var1] = 24;
            this.l[var1] = 7;
            this.g[var1] = 2;
            this.h[var1] = 2;
            this.a[var1] = true;
            break;
         case 49:
            this.a[var1][0] = 131120;
            this.a[var1][1] = 131121;
            this.b[var1][0] = 131118;
            this.b[var1][1] = 131119;
            this.c[var1][0] = 131122;
            this.c[var1][1] = 131123;
            this.k[var1] = 28;
            this.l[var1] = 7;
            this.g[var1] = 2;
            this.h[var1] = 2;
            this.a[var1] = true;
            break;
         case 51:
            this.a[var1][0] = 131180;
            this.a[var1][1] = 131181;
            this.b[var1][0] = 131178;
            this.b[var1][1] = 131179;
            this.c[var1][0] = 131174;
            this.c[var1][1] = 131175;
            this.k[var1] = 19;
            this.l[var1] = 16;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 52:
            this.a[var1][0] = 131148;
            this.a[var1][1] = 131149;
            this.b[var1][0] = 131146;
            this.b[var1][1] = 131147;
            this.c[var1][0] = 131142;
            this.c[var1][1] = 131143;
            this.k[var1] = 19;
            this.l[var1] = 19;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 53:
            this.a[var1][0] = 131156;
            this.a[var1][1] = 131157;
            this.b[var1][0] = 131154;
            this.b[var1][1] = 131155;
            this.c[var1][0] = 131150;
            this.c[var1][1] = 131151;
            this.k[var1] = 24;
            this.l[var1] = 21;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 61:
            this.a[var1][0] = 131116;
            this.a[var1][1] = 131117;
            this.b[var1][0] = 131114;
            this.b[var1][1] = 131115;
            this.c[var1][0] = 131116;
            this.c[var1][1] = 131116;
            this.k[var1] = 32;
            this.l[var1] = 11;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 62:
            this.a[var1][0] = 131192;
            this.a[var1][1] = 131193;
            this.b[var1][0] = 131190;
            this.b[var1][1] = 131191;
            this.c[var1][0] = 131190;
            this.c[var1][1] = 131191;
            this.k[var1] = 20;
            this.l[var1] = 20;
            this.g[var1] = 2;
            this.h[var1] = 2;
            break;
         case 63:
            this.a[var1][0] = 131188;
            this.a[var1][1] = 131189;
            this.b[var1][0] = 131186;
            this.b[var1][1] = 131187;
            this.c[var1][0] = 131184;
            this.c[var1][1] = 131185;
            this.k[var1] = 20;
            this.l[var1] = 30;
            this.g[var1] = 2;
            this.h[var1] = 2;
         }

         this.e[var1] = (k.a() >> 1) + Math.abs(this.a.nextInt()) % ((k.a() >> 1) - 24);
         this.f[var1] = 40 + Math.abs(this.a.nextInt()) % (k.b() / 3 - 30 - 10);
      }

   }

   public final void d() {
      if(!this.a && !this.b && !this.a.aK) {
         if((this.a.bu & 16) != 0 || this.a.a.e == 5) {
            if(!this.c) {
               this.a = true;
               this.a.a.d = (this.a.a.c + 15) / 5 - 3;
               this.d = this.a.a.a[this.a.a.d] * 10000 / (this.a.a.b[this.a.a.d] * this.a.a.b[this.a.a.d]);
               this.e = this.a.a.e * this.j;
               this.f = 2 * this.a.a.a[this.a.a.d];
               this.g = this.a.a.b[this.a.a.d] * this.a.a.e * this.j / 10000 + 10;
               this.a.a.a = (long)(3000 / k.a() * this.a.a.b[this.a.a.d] / 100 * this.a.a.e * this.j / 100 + 2000 / (k.b() - 50) * this.a.a.a[this.a.a.d] / 100 * this.a.a.e * this.j / 100);
               this.a.G = 0L;
               ++this.i;
               this.a.aw = true;
               this.d[this.k] = 1;
               this.l += 4;
            } else {
               this.c = false;
            }
         }

         if((this.a.bt & 4) == 0 && this.a.a.e != 2) {
            if((this.a.bt & 8) == 0 && this.a.a.e != 8) {
               if((this.a.bt & 1) == 0 && this.a.a.e != 4) {
                  if(((this.a.bt & 2) != 0 || this.a.a.e == 6) && this.a.a.c - 5 >= 10) {
                     this.a.a.c -= 5;
                  }
               } else if(this.a.a.c + 5 <= 70) {
                  this.a.a.c += 5;
               }
            } else if(this.a.a.e > 40) {
               this.a.a.e -= 2;
            }
         } else if(this.a.a.e < 100) {
            this.a.a.e += 2;
         }

         if(this.a.a.c < 25) {
            this.h = 3;
         } else if(this.a.a.c < 35) {
            this.h = 2;
         } else if(this.a.a.c < 65) {
            this.h = 1;
         } else {
            this.h = 0;
         }
      } else {
         this.a.aK = false;
      }
   }

   private void l() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, 851990, k.a() >> 1, k.b() / 3);
      this.a.a.a(this.a.a, 851991, k.a() >> 1, k.b() / 3);
      String var1 = this.a.a.a(93).toString() + this.a.b[this.a.a.c[this.a]];
      this.a.a.a(this.a.a, new StringBuffer(var1), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      this.a.a.c();
   }

   private void m() {
      if(this.a.l[this.a.P - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180] = 0;
      } else if(this.a.l[this.a.P] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P] = 0;
      } else if(this.a.l[this.a.P + 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180] = 0;
      } else if(this.a.l[this.a.P + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360] = 0;
      } else if(this.a.l[this.a.P + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 540] = 0;
      } else if(this.a.l[this.a.P - 180 - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180 - 1] = 0;
      } else if(this.a.l[this.a.P - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1] = 0;
      } else if(this.a.l[this.a.P + 180 - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180 - 1] = 0;
      } else if(this.a.l[this.a.P + 360 - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360 - 1] = 0;
      } else if(this.a.l[this.a.P + 540 - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 540 - 1] = 0;
      } else if(this.a.l[this.a.P - 180 - 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180 - 2] = 0;
      } else if(this.a.l[this.a.P - 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 2] = 0;
      } else if(this.a.l[this.a.P + 180 - 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180 - 2] = 0;
      } else if(this.a.l[this.a.P + 360 - 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360 - 2] = 0;
      } else {
         if(this.a.l[this.a.P + 540 - 2] == this.a.a.c[this.a] + 1) {
            this.a.l[this.a.P + 540 - 2] = 0;
         }

      }
   }

   private void n() {
      if(this.a.l[this.a.P - 180 + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180 + 2] = 0;
      } else if(this.a.l[this.a.P + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2] = 0;
      } else if(this.a.l[this.a.P + 180 + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180 + 2] = 0;
      } else if(this.a.l[this.a.P + 360 + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360 + 2] = 0;
      } else if(this.a.l[this.a.P + 540 + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 540 + 2] = 0;
      } else if(this.a.l[this.a.P - 180 + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180 + 3] = 0;
      } else if(this.a.l[this.a.P + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 3] = 0;
      } else if(this.a.l[this.a.P + 180 + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180 + 3] = 0;
      } else if(this.a.l[this.a.P + 360 + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360 + 3] = 0;
      } else if(this.a.l[this.a.P + 540 + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 540 + 3] = 0;
      } else if(this.a.l[this.a.P - 180 + 4] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180 + 4] = 0;
      } else if(this.a.l[this.a.P + 4] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 4] = 0;
      } else if(this.a.l[this.a.P + 180 + 4] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 180 + 4] = 0;
      } else if(this.a.l[this.a.P + 360 + 4] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360 + 4] = 0;
      } else {
         if(this.a.l[this.a.P + 540 + 4] == this.a.a.c[this.a] + 1) {
            this.a.l[this.a.P + 540 + 4] = 0;
         }

      }
   }

   private void o() {
      if(this.a.l[this.a.P - 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1] = 0;
      } else if(this.a.l[this.a.P] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P] = 0;
      } else if(this.a.l[this.a.P + 1] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1] = 0;
      } else if(this.a.l[this.a.P + 2] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2] = 0;
      } else if(this.a.l[this.a.P + 3] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 3] = 0;
      } else if(this.a.l[this.a.P - 1 - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1 - 180] = 0;
      } else if(this.a.l[this.a.P - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 180] = 0;
      } else if(this.a.l[this.a.P + 1 - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1 - 180] = 0;
      } else if(this.a.l[this.a.P + 2 - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2 - 180] = 0;
      } else if(this.a.l[this.a.P + 3 - 180] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 3 - 180] = 0;
      } else if(this.a.l[this.a.P - 1 - 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1 - 360] = 0;
      } else if(this.a.l[this.a.P - 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 360] = 0;
      } else if(this.a.l[this.a.P + 1 - 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1 - 360] = 0;
      } else if(this.a.l[this.a.P + 2 - 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2 - 360] = 0;
      } else {
         if(this.a.l[this.a.P + 3 - 360] == this.a.a.c[this.a] + 1) {
            this.a.l[this.a.P + 3 - 360] = 0;
         }

      }
   }

   private void p() {
      if(this.a.l[this.a.P - 1 + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1 + 360] = 0;
      } else if(this.a.l[this.a.P + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 360] = 0;
      } else if(this.a.l[this.a.P + 1 + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1 + 360] = 0;
      } else if(this.a.l[this.a.P + 2 + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2 + 360] = 0;
      } else if(this.a.l[this.a.P + 3 + 360] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 3 + 360] = 0;
      } else if(this.a.l[this.a.P - 1 + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1 + 540] = 0;
      } else if(this.a.l[this.a.P + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 540] = 0;
      } else if(this.a.l[this.a.P + 1 + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1 + 540] = 0;
      } else if(this.a.l[this.a.P + 2 + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2 + 540] = 0;
      } else if(this.a.l[this.a.P + 3 + 540] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 3 + 540] = 0;
      } else if(this.a.l[this.a.P - 1 + 720] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P - 1 + 720] = 0;
      } else if(this.a.l[this.a.P + 720] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 720] = 0;
      } else if(this.a.l[this.a.P + 1 + 720] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 1 + 720] = 0;
      } else if(this.a.l[this.a.P + 2 + 720] == this.a.a.c[this.a] + 1) {
         this.a.l[this.a.P + 2 + 720] = 0;
      } else {
         if(this.a.l[this.a.P + 3 + 720] == this.a.a.c[this.a] + 1) {
            this.a.l[this.a.P + 3 + 720] = 0;
         }

      }
   }

   private void q() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, this.a.a.a(92), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }
}
