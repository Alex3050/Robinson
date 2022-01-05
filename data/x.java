package data;

import data.k;
import data.p;
import java.util.Random;

public final class x {

   private p a;
   public boolean a = false;
   public int a = 0;
   public int b;
   public boolean b = false;
   public int c;
   public int[] a = new int[]{26, 34, 42, 50, 57, 64, 71, 77, 81, 87, 91, 94, 96, 98, 99, 100};
   public int[] b = new int[]{97, 94, 91, 87, 81, 77, 71, 64, 57, 50, 42, 34, 26, 17, 9, 0};
   public int d;
   public int e;
   public boolean c = false;
   private boolean d = false;
   private boolean e = false;
   public int[] c = new int[9];
   public long a = 0L;
   private boolean f = false;
   private boolean g = true;
   private boolean h = false;
   private boolean i = true;
   private boolean j = true;
   private boolean k = false;
   private int i = 0;
   private int j = 0;
   public int f;
   public int g;
   private int[] d = new int[5];
   private int k = 0;
   private int l = 0;
   private int m = 0;
   private int n;
   private int[] e = new int[3];
   private int[] f = new int[3];
   private int o = 0;
   private int p = 0;
   private int q = 0;
   private int r = 0;
   private boolean l = true;
   private boolean m = true;
   private int s = 0;
   private int t = 0;
   private int u = 0;
   private int[] g = new int[]{131171, 0, 0};
   private boolean n = false;
   private int v = 0;
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B = 7;
   private int C = 0;
   private int D = 0;
   private int E;
   private int[] h;
   private int[] i;
   private int[] j;
   private int[][] a;
   private int[][] b;
   public int h = 0;
   private int[] k;
   public Random a = new Random();


   public x(p var1) {
      this.a = var1;
   }

   public final void a() {
      if(this.a == 0) {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.v = 0L;
            this.i();
            this.a.a.c();
         }

         if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
            this.a.v = 2001L;
            this.a.aK = true;
         }

         if(this.a.v > 2000L) {
            this.c = false;
            this.a.m = 0;
            this.a.a.f();
         }

         this.b = true;
      } else {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.a.setColor(13158);
            this.a.a.fillRect(0, 0, k.a(), k.b());
            this.a.a.setColor(26265);
            this.a.a.fillRect(20, k.b() / 11 + 30, k.a() - 40, k.b() - 60 - k.b() / 11 * 2);
         }

         this.a.a.setColor(16777215);
         this.a.a.drawLine((k.a() >> 1) + this.i, (k.b() >> 1) - 3 + this.j, (k.a() >> 1) + 4 + this.i / 3 * 2, (k.b() >> 1) - 3 + this.j / 3 * 2 - 20);
         this.a.a.drawLine((k.a() >> 1) + 4 + this.i / 3 * 2, (k.b() >> 1) - 3 - 20 + this.j / 3 * 2, (k.a() >> 1) + 4 + 3 + this.i / 3, (k.b() >> 1) - 3 - 20 - 40 + this.j / 3);
         this.a.a.drawLine((k.a() >> 1) + 4 + 3 + this.i / 3, (k.b() >> 1) - 3 - 20 - 40 + this.j / 3, (k.a() >> 1) + 4 + 3 + 2, (k.b() >> 1) - 3 - 20 - 40 - 60 - 20);
         this.a.a.drawLine((k.a() >> 1) + this.i, (k.b() >> 1) + 3 + this.j, (k.a() >> 1) + this.f + 1, (k.b() >> 1) + this.g - 7);
         this.a.a.a(this.a.a, 851979, (k.a() >> 1) + this.i, (k.b() >> 1) + this.j);
         if(this.k < 3) {
            this.a.a.a(this.a.a, 851980, (k.a() >> 1) + this.f, (k.b() >> 1) + this.g);
            ++this.k;
         } else {
            this.a.a.a(this.a.a, 851981, (k.a() >> 1) + this.f, (k.b() >> 1) + this.g);
            ++this.k;
            if(this.k == 6) {
               this.k = 0;
            }
         }

         this.g();
         this.h();
         int var1;
         int var2;
         int var3;
         if(this.c) {
            this.a = true;
            this.a(851976);
            if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.v = 2001L;
               this.a.aK = true;
            }

            if(this.a.v > 2000L) {
               this.c = false;
               --this.a.q[this.b];
               if(this.a.q[this.b] == 0) {
                  for(var1 = this.b; var1 < this.a.aB - 1; ++var1) {
                     this.a.m[var1] = this.a.m[var1 + 1];
                     this.a.q[var1] = this.a.q[var1 + 1];
                  }

                  --this.a.aB;
               }

               for(var1 = 0; var1 < this.a.n[14]; ++var1) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               if((var2 = this.a.m[14]) < 0) {
                  var2 = -var2;

                  for(var3 = 0; var3 < var2; ++var3) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var3 = 0; var3 < this.a.m[14]; ++var3) {
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

            this.b = true;
            this.a.a.c();
         }

         if(this.e) {
            this.a = true;
            this.b(851976);
            if(this.j > -k.a()) {
               this.l = this.i;
               this.m = this.j;
               this.j -= 12;
               this.a.v = 0L;
            }

            if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.v = 2001L;
               this.a.aK = true;
            }

            if(this.a.v > 2000L) {
               this.e = false;
               this.a.m = 0;
               this.a.a.f();
               this.a.a.a = true;

               for(var1 = 0; var1 < this.a.aB; ++var1) {
                  if(this.a.m[var1] == this.n) {
                     ++this.a.q[var1];
                     this.a.a.a = false;
                  }
               }

               if(this.a.a.a) {
                  this.a.m[this.a.aB] = (byte)this.n;
                  this.a.q[this.a.aB] = 1;
                  ++this.a.aB;
               }

               --this.a.q[this.b];
               if(this.a.q[this.b] == 0) {
                  for(var2 = this.b; var2 < this.a.aB - 1; ++var2) {
                     this.a.m[var2] = this.a.m[var2 + 1];
                     this.a.q[var2] = this.a.q[var2 + 1];
                  }

                  --this.a.aB;
               }

               for(var2 = 0; var2 < this.a.n[14]; ++var2) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               int var4;
               if((var3 = this.a.m[14]) < 0) {
                  var3 = -var3;

                  for(var4 = 0; var4 < var3; ++var4) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var4 = 0; var4 < this.a.m[14]; ++var4) {
                     this.a.c += this.a.d / 100.0F;
                     if(this.a.c >= this.a.d) {
                        this.a.c = this.a.d;
                        break;
                     }
                  }
               }
            }

            this.b = true;
            this.a.a.c();
         }

      }
   }

   public final void b() {
      if(!this.e) {
         if((this.a.bt & 1) == 0 && this.a.a.e != 4) {
            if((this.a.bt & 2) == 0 && this.a.a.e != 6) {
               if((this.a.bt & 4) == 0 && this.a.a.e != 2) {
                  if(((this.a.bt & 8) != 0 || this.a.a.e == 8) && this.g < (k.b() >> 1) - 37 - k.b() / 11) {
                     this.j += 3;
                     this.a.aw = true;
                  }
               } else {
                  if(!this.d) {
                     if(this.g > -((k.b() >> 1) - 37 - k.b() / 11)) {
                        this.j -= 3;
                     }
                  } else {
                     this.j -= 3;
                  }

                  this.a.aw = true;
               }
            } else if(this.i < (k.a() >> 1) - 23) {
               this.i += 3;
               this.a.aw = true;
            }
         } else if(this.i > -((k.a() >> 1) - 23)) {
            this.i -= 3;
            this.a.aw = true;
         }

         if(!this.d) {
            if(this.s == 3) {
               this.j();
               this.s = 0;
            }

            ++this.s;
         }
      }

      this.g = this.j + 3 + 17;
      this.f = this.a(this.i);
      if(this.d) {
         this.l = this.f;
         this.m = this.g;
         if(this.g < -((k.b() >> 1) - 37 - k.b() / 11)) {
            this.e = true;
            this.a.v = 0L;
            this.d = false;
         }
      }

   }

   private int a(int var1) {
      for(int var2 = 0; var2 < 4; ++var2) {
         this.d[var2] = this.d[var2 + 1];
      }

      this.d[4] = var1;
      return this.d[0];
   }

   private void g() {
      this.a.a.a(this.a.a, this.g[this.v], (k.a() >> 1) + this.l, (k.b() >> 1) + this.m);
      if(this.d) {
         if(this.f >= 0) {
            this.g[0] = this.e[0];
            this.g[1] = this.e[1];
            this.g[2] = this.e[2];
            ++this.l;
            this.f = this.l;
            ++this.i;
            if(this.l >= (k.a() >> 1) - 23) {
               this.c = true;
               this.a.v = 0L;
               this.d = false;
            }
         } else {
            this.g[0] = this.f[0];
            this.g[1] = this.f[1];
            this.g[2] = this.f[2];
            --this.l;
            this.f = this.l;
            --this.i;
            if(this.l <= -((k.a() >> 1) - 23)) {
               this.c = true;
               this.a.v = 0L;
               this.d = false;
            }
         }

         if(this.g >= -((k.b() >> 1) - 37 - k.b() / 11)) {
            ++this.m;
            this.g = this.m;
            this.j = this.g - 3 - 17;
            if(this.m >= (k.b() >> 1) - 37 - k.b() / 11) {
               this.c = true;
               this.a.v = 0L;
               this.d = false;
            }
         }
      }

      if(this.v == 2) {
         this.v = 0;
      } else {
         ++this.v;
      }

      if(!this.n) {
         if(!this.c && !this.d) {
            this.g[0] = this.e[0];
            this.g[1] = this.e[1];
            this.g[2] = this.e[2];
         }

         if(!this.c) {
            if(!this.d) {
               if(this.l < k.a() / 2 && !this.e) {
                  ++this.l;
               }

               if(this.l == k.a() / 2) {
                  this.n = true;
               }
            }
         } else {
            this.l += 4;
         }
      } else {
         if(!this.c && !this.d) {
            this.g[0] = this.f[0];
            this.g[1] = this.f[1];
            this.g[2] = this.f[2];
         }

         if(!this.c) {
            if(!this.d) {
               if(this.l > -(k.a() / 2) && !this.e) {
                  --this.l;
               }

               if(this.l == -(k.a() / 2)) {
                  this.n = false;
               }
            }
         } else {
            this.l -= 4;
         }
      }

      if(!this.d) {
         if(this.t == 0) {
            this.u = Math.abs(this.a.nextInt()) % 20;
            this.t = 5 + Math.abs(this.a.nextInt()) % (k.a() / 10);
         }

         if(this.u < 10) {
            if(this.m > -((k.b() >> 1) - 50 - k.b() / 11)) {
               --this.m;
            }
         } else if(this.m < (k.b() >> 1) - 50 - k.b() / 11) {
            ++this.m;
         }

         --this.t;
      }

      this.a.aw = true;
   }

   private void h() {
      if((this.a.bu & 16) != 0 || this.a.a.e == 5) {
         if(this.f < this.l + (this.o >> 1) && this.f > this.l - (this.o >> 1)) {
            if(this.g < this.m + (this.p >> 1) && this.g > this.m - (this.p >> 1)) {
               this.d = true;
               return;
            }

            this.c = true;
            this.a.v = 0L;
            return;
         }

         this.c = true;
         this.a.v = 0L;
      }

   }

   public final void a(int var1) {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, var1, k.a() >> 1, k.b() / 3);
      if(var1 == 851990) {
         this.a.a.a(this.a.a, 851991, k.a() >> 1, k.b() / 3);
      }

      this.a.a.a(this.a.a, this.a.a.a(83), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      this.a.a.c();
   }

   private void i() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, this.a.a.a(85), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }

   private void b(int var1) {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, var1, k.a() >> 1, k.b() / 3);
      switch(this.a.q) {
      case 0:
         this.a.a.a(this.a.a, this.a.a.a(84), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         return;
      case 1:
         this.a.a.a(this.a.a, this.a.a.a(86), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      default:
      }
   }

   private void j() {
      if(this.m) {
         if(this.r < 5) {
            ++this.i;
         }

         if(this.r == 5) {
            this.m = false;
         }

         ++this.r;
      } else {
         if(this.r > 0) {
            --this.i;
         }

         if(this.r == 0) {
            this.m = true;
         }

         --this.r;
      }

      if(this.l) {
         if(this.q < 3) {
            ++this.j;
         }

         if(this.q == 3) {
            this.l = false;
         }

         ++this.q;
      } else {
         if(this.q > 0) {
            --this.j;
         }

         if(this.q == 0) {
            this.l = true;
         }

         --this.q;
      }
   }

   public final void c() {
      this.a = 0;
      this.b = -1;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         if(this.a.m[var1] == 90) {
            this.b = var1;
            this.a = this.a.q[var1];
         }
      }

      if(this.a <= 0) {
         this.a.aw = true;
      } else {
         this.c = false;
         this.a.v = 0L;
         this.d = false;
         this.l = -k.a() / 2 + 1;
         this.m = 0;
         this.f = 0;
         this.g = 0;
         this.i = 0;
         this.j = this.g - 3 - 17;
         switch(Math.abs(this.a.nextInt()) % 4) {
         case 0:
            this.n = 40;
            this.e[0] = 131103;
            this.e[1] = 131104;
            this.e[2] = 131105;
            this.f[0] = 131100;
            this.f[1] = 131101;
            this.f[2] = 131102;
            this.o = 16;
            this.p = 10;
            break;
         case 1:
            this.n = 56;
            this.e[0] = 131109;
            this.e[1] = 131110;
            this.e[2] = 131111;
            this.f[0] = 131106;
            this.f[1] = 131107;
            this.f[2] = 131108;
            this.o = 16;
            this.p = 9;
            break;
         case 2:
            this.n = 57;
            this.e[0] = 131097;
            this.e[1] = 131098;
            this.e[2] = 131099;
            this.f[0] = 131094;
            this.f[1] = 131095;
            this.f[2] = 131096;
            this.o = 16;
            this.p = 12;
            break;
         case 3:
            this.n = 58;
            this.e[0] = 131171;
            this.e[1] = 131172;
            this.e[2] = 131173;
            this.f[0] = 131168;
            this.f[1] = 131169;
            this.f[2] = 131170;
            this.o = 20;
            this.p = 14;
         }

         for(int var3 = 0; var3 < 5; ++var3) {
            this.d[var3] = this.i;
         }

         this.b = false;
      }
   }

   public final void d() {
      if(this.a == 0) {
         if(this.a.aw) {
            this.a.aw = false;
            this.a.v = 0L;
            this.o();
            this.a.a.c();
         }

         if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
            this.a.v = 2001L;
            this.a.aK = true;
         }

         if(this.a.v > 2000L) {
            this.c = false;
            this.a.m = 0;
            this.a.a.f();
         }

         this.b = true;
      } else {
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b() - 44);
         this.a.a.setColor(26265);
         this.a.a.fillRect((k.a() >> 1) - (this.A >> 1), 35, this.A, k.b() - 80);
         if(this.g) {
            this.a.v = 0L;
            this.h = true;
            this.g = false;
         }

         if(this.h) {
            if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.v = 4001L;
               this.a.aK = true;
            }

            if(this.a.v > 4000L) {
               this.h = false;
            }

            this.a.a.setColor(13158);
            this.a.a.fillRect(0, 0, k.a(), k.b());
            this.a.a.a(this.a.a, 851986, k.a() >> 1, k.b() / 3);
            this.a.a.a(this.a.a, this.a.a.a(87), k.a() >> 1, (k.b() >> 1) - 6, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            this.a.a.c();
         } else {
            this.l();
            this.k();
            if(!this.k || this.a.v <= 2000L) {
               this.a.a.a(this.a.a, this.y, (k.a() >> 1) + this.w - 1, (k.b() >> 1) + this.x - 1);
            }

            this.m();
            if(this.a.aw) {
               this.a.a.setColor(13158);
               this.a.a.fillRect(0, k.b() - 44, k.a(), 44);
               String var1 = (new Integer(this.D)).toString() + "/10";
               String var2 = (new Integer(this.B)).toString() + "/5";
               this.a.a.a(this.a.a, 131171, k.a() / 5, k.b() - 28);
               this.a.a.a(this.a.a, new StringBuffer(var1), k.a() / 5 + 32, k.b() - 24, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               this.a.a.a(this.a.a, 851984, k.a() / 5 * 3 + k.a() / 5 / 2, k.b() - 28);
               this.a.a.a(this.a.a, new StringBuffer(var2), k.a() / 5 * 3 + k.a() / 5 / 2 + 32, k.b() - 24, 16776960, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
               this.a.aw = false;
            }

            if(!this.f) {
               if(this.B == 5) {
                  this.a.a.setColor(13158);
                  this.a.a.fillRect(0, 0, k.a(), k.b());
                  if(this.D >= 10) {
                     this.e = true;
                  } else {
                     ++this.B;
                     this.c = true;
                  }
               } else if(this.D >= 10) {
                  this.a.a.setColor(13158);
                  this.a.a.fillRect(0, 0, k.a(), k.b());
                  this.e = true;
               }
            }
         }

         int var3;
         if(this.c) {
            this.a = true;
            this.a(851986);
            if(this.j) {
               this.a.v = 0L;
               this.j = false;
            }

            if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.v = 4001L;
               this.a.aK = true;
            }

            if(this.a.v > 4000L) {
               this.c = false;
               --this.a.q[this.b];
               int var7;
               if(this.a.q[this.b] == 0) {
                  for(var7 = this.b; var7 < this.a.aB - 1; ++var7) {
                     this.a.m[var7] = this.a.m[var7 + 1];
                     this.a.q[var7] = this.a.q[var7 + 1];
                  }

                  --this.a.aB;
               }

               for(var7 = 0; var7 < this.a.n[83]; ++var7) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               int var8;
               if((var8 = this.a.m[83]) < 0) {
                  var8 = -var8;

                  for(var3 = 0; var3 < var8; ++var3) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var3 = 0; var3 < this.a.m[83]; ++var3) {
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

            this.b = true;
            this.a.a.c();
         }

         if(this.e) {
            this.a = true;
            this.b(851986);
            if(this.j) {
               this.a.v = 0L;
               this.j = false;
            }

            if(this.b && ((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3)) {
               this.a.v = 2001L;
               this.a.aK = true;
            }

            if(this.a.v > 2000L) {
               this.e = false;
               this.a.m = 0;
               this.a.a.f();
               this.a.a.a = true;
               byte var9 = 0;
               switch(Math.abs(this.a.nextInt()) % 3) {
               case 0:
                  var9 = 59;
                  break;
               case 1:
                  var9 = 60;
                  break;
               case 2:
                  var9 = 2;
               }

               for(var3 = 0; var3 < this.a.aB; ++var3) {
                  if(this.a.m[var3] == var9) {
                     ++this.a.q[var3];
                     this.a.a.a = false;
                  }
               }

               if(this.a.a.a) {
                  this.a.m[this.a.aB] = (byte)var9;
                  this.a.q[this.a.aB] = 1;
                  ++this.a.aB;
               }

               --this.a.q[this.b];
               int var4;
               if(this.a.q[this.b] == 0) {
                  for(var4 = this.b; var4 < this.a.aB - 1; ++var4) {
                     this.a.m[var4] = this.a.m[var4 + 1];
                     this.a.q[var4] = this.a.q[var4 + 1];
                  }

                  --this.a.aB;
               }

               for(var4 = 0; var4 < this.a.n[83]; ++var4) {
                  this.a.e += this.a.d / 100.0F;
                  if(this.a.e >= this.a.d) {
                     this.a.e = this.a.d;
                     break;
                  }
               }

               int var5;
               int var6;
               if((var5 = this.a.m[83]) < 0) {
                  var5 = -var5;

                  for(var6 = 0; var6 < var5; ++var6) {
                     this.a.c -= this.a.d / 100.0F;
                     if(this.a.c <= 0.0F) {
                        this.a.a.b();
                        break;
                     }
                  }
               } else {
                  for(var6 = 0; var6 < this.a.m[83]; ++var6) {
                     this.a.c += this.a.d / 100.0F;
                     if(this.a.c >= this.a.d) {
                        this.a.c = this.a.d;
                        break;
                     }
                  }
               }
            }

            this.a.a.c();
         }

         this.b = true;
      }
   }

   public final void e() {
      if(!this.a.aK && !this.e && !this.f && !this.k && ((this.a.bu & 16) != 0 || this.a.a.e == 5)) {
         ++this.B;
         this.f = true;
         this.a.aw = true;
      }

   }

   private void k() {
      if(this.f) {
         if(this.x + (this.z >> 1) >= (k.b() >> 1) - 45) {
            this.a.aw = true;
            if(this.i) {
               for(int var1 = 0; var1 < this.E; ++var1) {
                  if(this.k[var1] == 1) {
                     ++this.C;
                     this.k[var1] = 2;
                  }
               }

               this.D += this.C;
               this.a.v = 0L;
               this.k = true;
               this.i = false;
            }

            if(this.k) {
               if(this.a.v > 2000L) {
                  this.k = false;
                  this.a.aw = true;
                  return;
               }

               if(this.a.v > 0L) {
                  this.a.aw = false;
                  return;
               }
            } else {
               this.x = -(k.b() >> 1) + 35 - (this.z >> 1);
               this.f = false;
               this.C = 0;
               if(this.D < 10 && this.B < 5) {
                  this.n();
                  return;
               }
            }
         } else {
            this.i = true;
            this.x += 5;
         }
      }

   }

   private void l() {
      if(this.D < 10 && this.B < 6) {
         for(int var1 = 0; var1 < this.E; ++var1) {
            if(this.k[var1] != 2) {
               this.a.a.a(this.a.a, this.a[var1][this.h], this.h[var1], this.i[var1]);
               if(!this.k) {
                  if(this.k[var1] != 1) {
                     if(this.j[var1] > 0) {
                        if(this.h[var1] + 8 + this.j[var1] >= k.a() + 70) {
                           this.c(var1);
                        } else {
                           this.h[var1] += this.j[var1];
                        }
                     } else if(this.h[var1] - 8 + this.j[var1] <= -70) {
                        this.c(var1);
                     } else {
                        this.h[var1] += this.j[var1];
                     }
                  } else if(this.f) {
                     this.i[var1] += 5;
                  }
               } else if(this.k[var1] != 1) {
                  int var2;
                  if(this.h[var1] > k.a() >> 1) {
                     if(this.j[var1] < 0) {
                        for(var2 = 0; var2 < 3; ++var2) {
                           this.a[var1][var2] = this.b[var1][var2];
                        }
                     }

                     this.j[var1] = 10;
                  } else {
                     if(this.j[var1] > 0) {
                        for(var2 = 0; var2 < 3; ++var2) {
                           this.a[var1][var2] = this.b[var1][var2];
                        }
                     }

                     this.j[var1] = -10;
                  }

                  this.h[var1] += this.j[var1];
               }
            }
         }

         ++this.h;
         if(this.h > 2) {
            this.h = 0;
         }
      }

   }

   private void m() {
      for(int var1 = 0; var1 < this.E; ++var1) {
         if(this.k[var1] == 0 && this.h[var1] > (k.a() >> 1) + this.w - (this.A >> 1) && this.h[var1] < (k.a() >> 1) + this.w + (this.A >> 1) && this.i[var1] > (k.b() >> 1) + this.x - (this.z >> 1) && this.i[var1] < (k.b() >> 1) + this.x + (this.z >> 1)) {
            this.k[var1] = 1;
         }
      }

   }

   public final void f() {
      this.a = 0;
      this.b = -1;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         if(this.a.m[var1] == 26) {
            this.b = var1;
            this.a = this.a.q[var1];
         }
      }

      if(this.a > 0) {
         this.c = false;
         this.a.v = 0L;
         this.d = false;
         this.y = 851984;
         this.z = 16;
         this.A = 32;
         this.n();
         this.w = 0;
         this.x = -(k.b() >> 1) + 35 - (this.z >> 1);
         this.B = 0;
         this.C = 0;
         this.D = 0;
         this.b = true;
         this.g = true;
         this.i = true;
         this.j = true;
         this.f = false;
         this.a.aK = true;
         this.k = false;
         this.a.aw = false;
      } else {
         this.a.aw = true;
      }
   }

   private void n() {
      this.E = 3 + Math.abs(this.a.nextInt()) % 5;
      this.h = new int[this.E];
      this.i = new int[this.E];
      this.j = new int[this.E];
      this.k = new int[this.E];
      this.a = new int[this.E][3];
      this.b = new int[this.E][3];

      for(int var1 = 0; var1 < this.E; ++var1) {
         this.c(var1);
      }

   }

   private void c(int var1) {
      int var2;
      if((var2 = Math.abs(this.a.nextInt()) % 2) == 0) {
         this.h[var1] = -Math.abs(this.a.nextInt()) % 60;
      } else {
         this.h[var1] = k.a() + Math.abs(this.a.nextInt()) % 60;
      }

      this.i[var1] = 42 + Math.abs(this.a.nextInt()) % (k.b() - 80 - 14);
      this.j[var1] = 2 + Math.abs(this.a.nextInt()) % 3;
      if(var2 != 0) {
         this.j[var1] = -this.j[var1];
      }

      this.k[var1] = 0;
      int var3;
      if((var3 = Math.abs(this.a.nextInt()) % 100) < 45) {
         if(var2 == 0) {
            this.a[var1][0] = 131133;
            this.a[var1][1] = 131134;
            this.a[var1][2] = 131135;
            this.b[var1][0] = 131130;
            this.b[var1][1] = 131131;
            this.b[var1][2] = 131132;
         } else {
            this.a[var1][0] = 131130;
            this.a[var1][1] = 131131;
            this.a[var1][2] = 131132;
            this.b[var1][0] = 131133;
            this.b[var1][1] = 131134;
            this.b[var1][2] = 131135;
         }
      } else if(var3 < 65) {
         if(var2 == 0) {
            this.a[var1][0] = 131139;
            this.a[var1][1] = 131140;
            this.a[var1][2] = 131141;
            this.b[var1][0] = 131136;
            this.b[var1][1] = 131137;
            this.b[var1][2] = 131138;
         } else {
            this.a[var1][0] = 131136;
            this.a[var1][1] = 131137;
            this.a[var1][2] = 131138;
            this.b[var1][0] = 131139;
            this.b[var1][1] = 131140;
            this.b[var1][2] = 131141;
         }
      } else if(var3 < 75) {
         if(var2 == 0) {
            this.a[var1][0] = 131097;
            this.a[var1][1] = 131098;
            this.a[var1][2] = 131099;
            this.b[var1][0] = 131094;
            this.b[var1][1] = 131095;
            this.b[var1][2] = 131096;
         } else {
            this.a[var1][0] = 131094;
            this.a[var1][1] = 131095;
            this.a[var1][2] = 131096;
            this.b[var1][0] = 131097;
            this.b[var1][1] = 131098;
            this.b[var1][2] = 131099;
         }
      } else if(var3 < 85) {
         if(var2 == 0) {
            this.a[var1][0] = 131103;
            this.a[var1][1] = 131104;
            this.a[var1][2] = 131105;
            this.b[var1][0] = 131100;
            this.b[var1][1] = 131101;
            this.b[var1][2] = 131102;
         } else {
            this.a[var1][0] = 131100;
            this.a[var1][1] = 131101;
            this.a[var1][2] = 131102;
            this.b[var1][0] = 131103;
            this.b[var1][1] = 131104;
            this.b[var1][2] = 131105;
         }
      } else {
         if(var3 < 100) {
            if(var2 == 0) {
               this.a[var1][0] = 131109;
               this.a[var1][1] = 131110;
               this.a[var1][2] = 131111;
               this.b[var1][0] = 131106;
               this.b[var1][1] = 131107;
               this.b[var1][2] = 131108;
               return;
            }

            this.a[var1][0] = 131106;
            this.a[var1][1] = 131107;
            this.a[var1][2] = 131108;
            this.b[var1][0] = 131109;
            this.b[var1][1] = 131110;
            this.b[var1][2] = 131111;
         }

      }
   }

   private void o() {
      this.a.a.setColor(13158);
      this.a.a.fillRect(0, 0, k.a(), k.b());
      this.a.a.a(this.a.a, this.a.a.a(88), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }
}
