package data;

import data.p;

public final class a {

   private p a;
   private boolean a = false;
   private boolean b = false;
   private int a = 4;
   private boolean c = false;
   private byte a;
   private int b = 0;
   private boolean d = false;


   public a(p var1) {
      this.a = var1;
   }

   public final int a(int var1, int var2, int var3) {
      if((this.a.bu & 4) != 0 || this.a.a.e == 2) {
         if(this.a.m == 1 || this.a.m == 5 || this.a.m == 8) {
            this.a.m = 0L;
            this.a.n = 0L;
            this.a.h = true;
         }

         if(var1 > var2 && var1 <= var3 && !this.a) {
            if(this.a.hasPointerEvents()) {
               if((this.a.a.e == -1 || this.a.l != 6 || (this.a.m != 1 || this.a.n != 0 && this.a.n != 4) && this.a.m != 5 && this.a.m != 8) && (this.a.a.e == -1 || this.a.l != 3)) {
                  --var1;
               } else if(this.a.l == 3) {
                  this.a.a.b = true;
                  var1 -= ((Integer)this.a.a.elementAt(this.a.f)).intValue();
               } else if(var1 > var2 + this.a.as) {
                  var1 -= this.a.as;
               } else {
                  var1 = var2;
               }
            } else {
               --var1;
            }

            this.a.aw = true;
         }
      }

      if((this.a.bu & 8) != 0 || this.a.a.e == 8) {
         if(this.a.m == 1 || this.a.m == 5 || this.a.m == 8) {
            this.a.m = 0L;
            this.a.n = 0L;
            this.a.i = true;
         }

         if(var1 >= var2 && var1 < var3) {
            if(this.a.hasPointerEvents()) {
               if((this.a.a.e == -1 || this.a.l != 6 || (this.a.m != 1 || this.a.n != 0 && this.a.n != 4) && this.a.m != 5 && this.a.m != 8) && (this.a.a.e == -1 || this.a.l != 3)) {
                  ++var1;
               } else if(this.a.l == 3) {
                  this.a.a.b = false;
                  var1 += ((Integer)this.a.a.elementAt(this.a.g)).intValue();
               } else if(var1 < var3 - this.a.as) {
                  var1 += this.a.as;
               } else {
                  var1 = var3;
               }
            } else {
               ++var1;
            }

            this.a.aw = true;
         }
      }

      return var1;
   }

   public final int b(int var1, int var2, int var3) {
      if((this.a.bu & 1) != 0 || this.a.a.e == 4) {
         if(this.a.m == 1) {
            this.a.m = 0L;
            this.a.f = true;
         }

         if(var1 == var2) {
            var1 = var3;
            this.a.aw = true;
         } else if(var1 > var2 && var1 <= var3) {
            --var1;
            this.a.aw = true;
         }

         if(var1 == 3) {
            this.a.aE = true;
         }

         this.a.z = 0;
         this.a.u = 0;
         this.a.v = 0;
         this.a.au = 0;
      }

      if((this.a.bu & 2) != 0 || this.a.a.e == 6) {
         if(this.a.m == 1) {
            this.a.m = 0L;
            this.a.g = true;
         }

         if(var1 == var3) {
            var1 = var2;
            this.a.aw = true;
         } else if(var1 >= var2 && var1 < var3) {
            ++var1;
            this.a.aw = true;
         }

         if(var1 == 3) {
            this.a.aE = true;
         }

         this.a.z = 0;
         this.a.u = 0;
         this.a.v = 0;
         this.a.au = 0;
      }

      if(this.a.m == 1) {
         this.b(var1);
      }

      return var1;
   }

   private void b(int var1) {
      if(var1 == 0) {
         this.a.n = 0;
      } else if(var1 == 1) {
         this.a.n = 2;
      } else if(var1 == 2) {
         this.a.n = 3;
      } else if(var1 == 3) {
         this.a.n = 5;
         this.t();
      } else if(var1 == 4) {
         this.a.n = 6;
      } else {
         if(var1 == 5) {
            this.a.n = 4;
         }

      }
   }

   private void t() {
      if(this.a.Z >= 0 && this.a.Z <= 60 && this.a.aa >= 0 && this.a.aa <= 60) {
         this.a.Q = this.a.R = 0;
      }

      if(this.a.Z >= 60 && this.a.Z <= 120 && this.a.aa >= 0 && this.a.aa <= 60) {
         this.a.Q = 60;
         this.a.R = 0;
      }

      if(this.a.Z >= 120 && this.a.Z <= 180 && this.a.aa >= 0 && this.a.aa <= 60) {
         this.a.Q = 120;
         this.a.R = 0;
      }

      if(this.a.Z >= 0 && this.a.Z <= 60 && this.a.aa >= 60 && this.a.aa <= 120) {
         this.a.Q = 0;
         this.a.R = 60;
      }

      if(this.a.Z >= 60 && this.a.Z <= 120 && this.a.aa >= 60 && this.a.aa <= 120) {
         this.a.Q = 60;
         this.a.R = 60;
      }

      if(this.a.Z >= 120 && this.a.Z <= 180 && this.a.aa >= 60 && this.a.aa <= 120) {
         this.a.Q = 120;
         this.a.R = 60;
      }

      if(this.a.Z >= 0 && this.a.Z <= 60 && this.a.aa >= 120 && this.a.aa <= 180) {
         this.a.Q = 0;
         this.a.R = 120;
      }

      if(this.a.Z >= 60 && this.a.Z <= 120 && this.a.aa >= 120 && this.a.aa <= 180) {
         this.a.Q = 60;
         this.a.R = 120;
      }

      if(this.a.Z >= 120 && this.a.Z <= 180 && this.a.aa >= 120 && this.a.aa <= 180) {
         this.a.Q = this.a.R = 120;
      }

   }

   public final void a() {
      if((this.a.bu & 4) != 0 || this.a.a.e == 2) {
         this.a.n = 0L;
         this.a.h = true;
         if(this.a.f > 0) {
            if(this.a.hasPointerEvents()) {
               if(this.a.a.e != -1 && this.a.d <= ((Integer)this.a.a.elementAt(this.a.f)).intValue()) {
                  --this.a.f;
                  --this.a.g;
                  this.a.aw = true;
               } else if(this.a.d == ((Integer)this.a.a.elementAt(this.a.f)).intValue() - 1 && this.a.d != 0) {
                  --this.a.f;
                  --this.a.g;
                  this.a.aw = true;
               }
            } else if(this.a.d == ((Integer)this.a.a.elementAt(this.a.f)).intValue() - 1 && this.a.d != 0) {
               --this.a.f;
               --this.a.g;
               this.a.aw = true;
            }
         }
      }

      if((this.a.bu & 8) != 0 || this.a.a.e == 8) {
         this.a.n = 0L;
         this.a.i = true;
         if(this.a.g < this.a.a.size() - 1 && this.a.d >= ((Integer)this.a.a.elementAt(this.a.g)).intValue() && this.a.d != this.a.e) {
            ++this.a.f;
            ++this.a.g;
            this.a.aw = true;
         }
      }

   }

   public final void b() {
      if(((this.a.bu & 4) != 0 || this.a.a.e == 2) && this.a.au > 0) {
         if(this.a.hasPointerEvents()) {
            if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 1 && this.a.n == 0) {
               if(this.a.z >= this.a.as) {
                  this.a.au -= this.a.as;
               } else {
                  this.a.au = 0;
               }
            } else {
               --this.a.au;
            }
         } else {
            --this.a.au;
         }

         this.a.aw = true;
      }

      if(((this.a.bu & 8) != 0 || this.a.a.e == 8) && this.a.z >= this.a.as) {
         if(this.a.au < this.a.aB - this.a.as) {
            if(this.a.hasPointerEvents()) {
               if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 1 && this.a.n == 0) {
                  this.a.au += this.a.as;
               } else {
                  ++this.a.au;
               }
            } else {
               ++this.a.au;
            }
         }

         this.a.aw = true;
      }

   }

   public final void c() {
      if(((this.a.bu & 4) != 0 || this.a.a.e == 2) && this.a.au > 0) {
         if(this.a.hasPointerEvents()) {
            if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 1 && this.a.n == 4) {
               if(this.a.v >= this.a.as) {
                  this.a.au -= this.a.as;
               } else {
                  this.a.au = 0;
               }
            } else {
               --this.a.au;
            }
         } else {
            --this.a.au;
         }

         this.a.aw = true;
      }

      if(((this.a.bu & 8) != 0 || this.a.a.e == 8) && this.a.v >= this.a.as) {
         if(this.a.au < this.a.av - this.a.as) {
            if(this.a.hasPointerEvents()) {
               if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 1 && this.a.n == 4) {
                  this.a.au += this.a.as;
               } else {
                  ++this.a.au;
               }
            } else {
               ++this.a.au;
            }
         }

         this.a.aw = true;
      }

   }

   public final void d() {
      if(this.a.aB) {
         if(((this.a.bu & 4) != 0 || this.a.a.e == 2) && this.a.au > 0) {
            if(this.a.hasPointerEvents()) {
               if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 5) {
                  if(this.a.y >= this.a.as) {
                     this.a.au -= this.a.as;
                  } else {
                     this.a.au = 0;
                  }
               } else {
                  --this.a.au;
               }
            } else {
               --this.a.au;
            }

            this.a.aw = true;
         }

         if(((this.a.bu & 8) != 0 || this.a.a.e == 8) && this.a.y >= this.a.as) {
            if(this.a.au < this.a.ay - this.a.as) {
               if(this.a.hasPointerEvents()) {
                  if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 5) {
                     this.a.au += this.a.as;
                  } else {
                     ++this.a.au;
                  }
               } else {
                  ++this.a.au;
               }
            }

            this.a.aw = true;
            return;
         }
      } else {
         if(((this.a.bu & 4) != 0 || this.a.a.e == 2) && this.a.au > 0) {
            if(this.a.hasPointerEvents()) {
               if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 5) {
                  if(this.a.y >= this.a.as) {
                     this.a.au -= this.a.as;
                  } else {
                     this.a.au = 0;
                  }
               } else {
                  --this.a.au;
               }
            } else {
               --this.a.au;
            }

            this.a.aw = true;
         }

         if(((this.a.bu & 8) != 0 || this.a.a.e == 8) && this.a.y >= this.a.as) {
            if(this.a.au < this.a.ax - this.a.as) {
               if(this.a.hasPointerEvents()) {
                  if(this.a.a.e != -1 && this.a.l == 6 && this.a.m == 5) {
                     this.a.au += this.a.as;
                  } else {
                     ++this.a.au;
                  }
               } else {
                  ++this.a.au;
               }
            }

            this.a.aw = true;
         }
      }

   }

   public final void e() {
      if(!this.a.c) {
         if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
            if(this.a.r == 0) {
               this.a.a.a(14);
               this.a.ax = true;
               this.a.a.a(0);
               this.a.a.e();
               this.a.a.a(true);
            } else if(this.a.r == 1) {
               this.a.a.a(14);
               if(this.a.b) {
                  this.a.a = 1;
                  this.a.l = 11;
                  this.a.aw = true;
               } else {
                  this.a.ax = true;
                  this.a.a.a(1);
                  this.a.a.e();
                  this.a.a.a(false);
               }
            } else if(this.a.r == 2) {
               this.a.l = 2;
               this.a.a();
               this.a.a.h();
            } else if(this.a.r == 3) {
               this.a.l = 3;
               this.a.a();
               this.a.a.h();
            } else if(this.a.r == 4) {
               this.a.l = 4;
               this.a.a();
               this.a.a.h();
            } else if(this.a.r == 5) {
               try {
                  Thread.sleep(1000L);
               } catch (Exception var3) {
                  ;
               }

               try {
                  this.a.a.platformRequest(this.a.a);
                  this.a.a.destroyApp(true);
               } catch (Exception var2) {
                  this.a.a.destroyApp(true);
               }
            }
         }

         if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
            this.a.a = 0;
            this.a.l = 11;
            this.a.aw = true;
         }
      }

      if(this.a.c) {
         this.a.a.e();
         if(this.a.r == 0) {
            this.a.a.a(true);
            return;
         }

         if(this.a.r == 1) {
            this.a.a.a(false);
         }
      }

   }

   public final void f() {
      if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
         this.a.l = 10;
         this.a.l = true;
      }

      if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
         this.a.l = 1;
         this.a.d = 0;
         this.a.f = 0;
         this.a.g = 1;
         this.a.a.removeAllElements();
         this.a.l = true;
         this.a.a.h();
         this.a.a();
      }

   }

   public final void g() {
      if((this.a.bu & 2) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 6 || this.a.a.e == 5) {
         if(this.a.A == 0) {
            if(this.a.ah) {
               this.a.ah = false;
            } else {
               this.a.ah = true;
            }

            this.a.a.d();
            this.a.aw = true;
         }

         if(this.a.A == 1) {
            ++this.a.aF;
            this.a.aw = true;
            if(this.a.aF == 5) {
               this.a.aF = 0;
            }

            switch(this.a.aF) {
            case 0:
               this.a.a.a(0);
               break;
            case 1:
               this.a.a.a(1);
               break;
            case 2:
               this.a.a.a(2);
               break;
            case 3:
               this.a.a.a(3);
               break;
            case 4:
               this.a.a.a(4);
            }
         }
      }

      if((this.a.bu & 1) != 0 || this.a.a.e == 4) {
         if(this.a.A == 0) {
            if(this.a.ah) {
               this.a.ah = false;
            } else {
               this.a.ah = true;
            }

            this.a.a.d();
            this.a.aw = true;
         }

         if(this.a.A == 1) {
            --this.a.aF;
            this.a.aw = true;
            if(this.a.aF == -1) {
               this.a.aF = 4;
            }

            switch(this.a.aF) {
            case 0:
               this.a.a.a(0);
               break;
            case 1:
               this.a.a.a(1);
               break;
            case 2:
               this.a.a.a(2);
               break;
            case 3:
               this.a.a.a(3);
               break;
            case 4:
               this.a.a.a(4);
            }
         }
      }

      if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
         this.a.ah = this.a.ai;
         this.a.aF = this.a.aE;
         switch(this.a.aE) {
         case 0:
            this.a.a.a(0);
            break;
         case 1:
            this.a.a.a(1);
            break;
         case 2:
            this.a.a.a(2);
            break;
         case 3:
            this.a.a.a(3);
            break;
         case 4:
            this.a.a.a(4);
         }

         this.a.l = 1;
         this.a.a.h();
         this.a.A = 0;
         this.a.ag = false;
         this.a.a();
      }

      if((this.a.bu & 16384) != 0 || this.a.a.e == 1) {
         this.a.a.a(this.a.aF);
         this.a.a.a(this.a.ah);
         this.a.ai = this.a.ah;
         this.a.aE = this.a.aF;
         this.a.l = 1;
         this.a.a.h();
         this.a.A = 0;
         this.a.ag = true;
         this.a.a();
      }

   }

   public final void h() {
      if((this.a.bu & 1) != 0) {
         this.a.l = 0L;
         if(this.a.x > 0 && this.a.x <= this.a.C - 1) {
            --this.a.x;
            this.a.j = true;
            this.a.aw = true;
         }
      }

      if((this.a.bu & 2) != 0) {
         this.a.l = 0L;
         if(this.a.x >= 0 && this.a.x < this.a.C - 1) {
            ++this.a.x;
            this.a.k = true;
            this.a.aw = true;
         }
      }

      if(this.a.m == 2) {
         if(!this.a()) {
            this.u();
            return;
         }
      } else {
         if(this.a.m == 1) {
            this.E();
            return;
         }

         if(this.a.p == 1) {
            this.F();
         }
      }

   }

   public final void i() {
      int var1;
      if(this.a.n == 1) {
         if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 5) {
            if(this.a.t[this.a.x] == 655388) {
               for(var1 = 0; var1 < 120; ++var1) {
                  if(this.a.o == 0 && this.a.m[this.a.z] == (byte)var1) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }

                  if(this.a.o == 4 && this.a.a[this.a.v] == (byte)var1) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }
               }
            }

            if(this.a.t[this.a.x] == 655387) {
               if(this.a.m[this.a.z] == 31) {
                  this.a.aP = true;
               }

               this.a.ay = false;
               this.a.a.g();
               this.a.aw = true;
               this.a.a();
            }

            if(this.a.t[this.a.x] == 655390) {
               this.a.ay = false;
               this.a.a.h();
               this.a.aw = true;
               this.a.a();
               return;
            }
         }
      } else if(this.a.p == 1) {
         if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 5) {
            if(this.a.t[this.a.x] == 655388 && this.a.aw != 0) {
               for(var1 = 0; var1 < 120; ++var1) {
                  if(this.a.a[this.a.w] == this.a.b[var1]) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }
               }
            }

            if(this.a.t[this.a.x] == 655390) {
               this.a.ay = false;
               this.a.a.i();
               this.a.aw = true;
               this.a.a();
               return;
            }
         }
      } else if(this.a.m == 2 && ((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 5)) {
         this.a.az = false;
         if(this.a.t[this.a.x] == 655389) {
            this.a.m = 1;
            this.a.n = 0;
            this.a.s = 0;
            this.a.aw = true;
            this.a.a();
         }

         if(this.a.t[this.a.x] == 655391) {
            if(this.a.aC) {
               this.a.m = 6;

               for(var1 = 0; var1 < this.a.g.length; ++var1) {
                  this.a.g[var1] = null;
               }

               this.a.aA = 0;
               this.a.aw = true;
            } else if(this.a.aD) {
               this.a.m = 6;

               for(var1 = 0; var1 < this.a.g.length; ++var1) {
                  this.a.g[var1] = null;
               }

               this.a.aA = 0;
               this.a.aw = true;
            } else {
               this.a.m = 5;
               this.a.aA = true;
               this.a.aw = true;

               for(var1 = 0; var1 < 120; ++var1) {
                  this.a.f[var1] = "";
                  this.a.e[var1] = "";
                  this.a.d[var1] = "";
               }

               this.a.az = 0;
               this.a.ay = 0;
               this.a.ax = 0;
               this.a.y = 0;
            }

            this.a.a();
         }

         if(this.a.t[this.a.x] == 655386) {
            this.a.m = 4;
            this.a.aw = true;
            this.a.a();
         }

         if(this.a.t[this.a.x] == 655385) {
            this.a.a.a();
         }

         if(this.a.t[this.a.x] == 655387) {
            if(this.a.m[this.a.z] == 31) {
               this.a.aP = true;
            }

            this.a.a.j();
         }

         if(this.a.t[this.a.x] == 655392) {
            if(this.a.aB) {
               this.a.m = 8;
               this.a.p = 0;
               this.a.w = 0;
            }

            if(this.d) {
               if(!this.a.T) {
                  this.a.a.u();
               } else {
                  this.a.a.v();
               }

               this.a.m = 0;
               this.a.a.f();
               this.d = false;
            }

            this.a.aw = true;
            this.a.a();
         }

         if(this.a.t[this.a.x] == 851976) {
            this.a.a.c();
            this.a.m = 7;
            this.a.q = 0;
            this.a.aw = true;
         }

         if(this.a.t[this.a.x] == 851986) {
            this.a.a.f();
            this.a.m = 7;
            this.a.q = 1;
            this.a.aw = true;
         }

         if(this.a.t[this.a.x] == 851985) {
            this.a.a.b();
            this.a.m = 7;
            this.a.q = 2;
            this.a.aw = true;
         }

         if(this.a.t[this.a.x] == 851977) {
            this.a.a.b();
            this.a.m = 7;
            this.a.q = 3;
            this.a.aw = true;
         }

         if(this.a.t[this.a.x] == 655388) {
            for(var1 = 0; var1 < 120; ++var1) {
               if(this.a.X) {
                  if(this.a.l[this.a.P + 180] == this.a.i[var1]) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }
               } else if(this.a.Y) {
                  if(this.a.l[this.a.P + 180 + 2] == this.a.i[var1]) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }
               } else if(this.a.V) {
                  if(this.a.l[this.a.P + 1] == this.a.i[var1]) {
                     this.a.m = 3;
                     this.a.ar = var1;
                     this.a.aw = true;
                     this.a.a();
                  }
               } else if(this.a.W && this.a.l[this.a.P + 360 + 1] == this.a.i[var1]) {
                  this.a.m = 3;
                  this.a.ar = var1;
                  this.a.aw = true;
                  this.a.a();
               }
            }
         }
      }

   }

   private boolean a() {
      this.a.C = 0;
      this.b = false;
      if(this.a.m == 2) {
         boolean var1 = false;
         if(this.a.T) {
            if(this.b()) {
               this.A();
            } else {
               this.v();
            }

            return true;
         } else {
            int var2;
            if(this.a.X) {
               if(this.c()) {
                  var1 = true;
               }

               if(this.g()) {
                  var1 = true;
               }

               if(this.a((int)18, 8)) {
                  var1 = true;
               }

               if(this.k()) {
                  var1 = true;
               }

               for(var2 = 0; var2 < 120; ++var2) {
                  if(this.a.l[this.a.P + 180] == this.a.i[var2]) {
                     if(this.a.i[var2] == 17) {
                        var1 = false;
                     } else {
                        this.c = false;
                        this.c(var2);
                        var1 = true;
                     }
                  }
               }
            } else if(this.a.Y) {
               if(this.d()) {
                  var1 = true;
               }

               if(this.h()) {
                  var1 = true;
               }

               if(this.b(18, 8)) {
                  var1 = true;
               }

               if(this.l()) {
                  var1 = true;
               }

               for(var2 = 0; var2 < 120; ++var2) {
                  if(this.a.l[this.a.P + 180 + 2] == this.a.i[var2]) {
                     if(this.a.i[var2] == 17) {
                        var1 = false;
                     } else {
                        this.c = false;
                        this.c(var2);
                        var1 = true;
                     }
                  }
               }
            } else if(this.a.V) {
               if(this.e()) {
                  var1 = true;
               }

               if(this.i()) {
                  var1 = true;
               }

               if(this.c(18, 8)) {
                  var1 = true;
               }

               if(this.m()) {
                  var1 = true;
               }

               for(var2 = 0; var2 < 120; ++var2) {
                  if(this.a.l[this.a.P + 1] == this.a.i[var2]) {
                     if(this.a.i[var2] == 17) {
                        var1 = false;
                     } else {
                        this.c = false;
                        this.c(var2);
                        var1 = true;
                     }
                  }
               }
            } else if(this.a.W) {
               if(this.f()) {
                  var1 = true;
               }

               if(this.j()) {
                  var1 = true;
               }

               if(this.d(18, 8)) {
                  var1 = true;
               }

               if(this.n()) {
                  var1 = true;
               }

               for(var2 = 0; var2 < 120; ++var2) {
                  if(this.a.l[this.a.P + 360 + 1] == this.a.i[var2]) {
                     if(this.a.i[var2] == 17) {
                        var1 = false;
                     } else {
                        this.c = false;
                        this.c(var2);
                        var1 = true;
                     }
                  }
               }
            }

            if(var1 && this.a.C == 0) {
               this.u();
            }

            return var1;
         }
      } else {
         return false;
      }
   }

   private boolean b() {
      this.a.Z = false;
      this.a.aa = false;
      this.a.ab = false;
      this.a.ac = false;
      if(this.a.a.a(this.a.P + 180, 0) && this.a.a.a(this.a.P + 180, 0) && this.a.a.d(this.a.P + 180, 0) && this.a.a.c(this.a.P + 180, 0)) {
         this.a.Z = true;
         return true;
      } else if(this.a.a.a(this.a.P + 180 + 2, 1) && this.a.a.a(this.a.P + 180 + 2, 1) && this.a.a.d(this.a.P + 180 + 2, 1) && this.a.a.c(this.a.P + 180 + 2, 1)) {
         this.a.aa = true;
         return true;
      } else if(this.a.a.a(this.a.P + 1, 2) && this.a.a.a(this.a.P + 1, 2) && this.a.a.d(this.a.P + 1, 2) && this.a.a.c(this.a.P + 1, 2)) {
         this.a.ab = true;
         return true;
      } else if(this.a.a.a(this.a.P + 360 + 1, 3) && this.a.a.a(this.a.P + 360 + 1, 3) && this.a.a.d(this.a.P + 360 + 1, 3) && this.a.a.c(this.a.P + 360 + 1, 3)) {
         this.a.ac = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean c() {
      if(this.a.k[this.a.P + 180] == 5) {
         this.c = true;
         this.c(40);
         return true;
      } else {
         return false;
      }
   }

   private boolean d() {
      if(this.a.k[this.a.P + 180 + 2] == 5) {
         this.c = true;
         this.c(40);
         return true;
      } else {
         return false;
      }
   }

   private boolean e() {
      if(this.a.k[this.a.P + 1] == 5) {
         this.c = true;
         this.c(40);
         return true;
      } else {
         return false;
      }
   }

   private boolean f() {
      if(this.a.k[this.a.P + 360 + 1] == 5) {
         this.c = true;
         this.c(40);
         return true;
      } else {
         return false;
      }
   }

   private boolean g() {
      if(this.a.k[this.a.P + 180] == 4) {
         this.c = true;
         this.c(59);
         return true;
      } else {
         return false;
      }
   }

   private boolean h() {
      if(this.a.k[this.a.P + 180 + 2] == 4) {
         this.c = true;
         this.c(59);
         return true;
      } else {
         return false;
      }
   }

   private boolean i() {
      if(this.a.k[this.a.P + 1] == 4) {
         this.c = true;
         this.c(59);
         return true;
      } else {
         return false;
      }
   }

   private boolean j() {
      if(this.a.k[this.a.P + 360 + 1] == 4) {
         this.c = true;
         this.c(59);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(int var1, int var2) {
      if(this.a.g[this.a.P + 180] == var1 && this.a.h[this.a.P + 180] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P] == var1 && this.a.h[this.a.P] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 360] == var1 && this.a.h[this.a.P + 360] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int var1, int var2) {
      if(this.a.g[this.a.P + 180 + 2] == var1 && this.a.h[this.a.P + 180 + 2] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 2] == var1 && this.a.h[this.a.P + 2] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 360 + 2] == var1 && this.a.h[this.a.P + 360 + 2] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else {
         return false;
      }
   }

   private boolean c(int var1, int var2) {
      if(this.a.g[this.a.P + 1] == var1 && this.a.h[this.a.P + 1] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P] == var1 && this.a.h[this.a.P] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 2] == var1 && this.a.h[this.a.P + 2] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else {
         return false;
      }
   }

   private boolean d(int var1, int var2) {
      if(this.a.g[this.a.P + 360 + 1] == var1 && this.a.h[this.a.P + 360 + 1] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 360] == var1 && this.a.h[this.a.P + 360] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else if(this.a.g[this.a.P + 360 + 2] == var1 && this.a.h[this.a.P + 360 + 2] == var2) {
         this.c = false;
         this.c(-1);
         return true;
      } else {
         return false;
      }
   }

   private boolean k() {
      this.a = 4;
      this.a.aT = 0;

      while(this.a != 64) {
         if(this.a.l[this.a.P - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 180 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 180 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 180 - 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 180 - 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 - 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 - 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a == 4) {
            this.a = 41;
         } else if(this.a < 54) {
            ++this.a;
         } else if(this.a == 54) {
            this.a = 61;
         } else {
            ++this.a;
         }
      }

      if(this.a.aT != 0) {
         this.c = true;
         this.c(this.a.a.c[0]);
         this.b = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean l() {
      this.a.aT = 0;
      this.a = 4;

      while(this.a != 64) {
         if(this.a.l[this.a.P - 180 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 180 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 180 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 180 + 4] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 4] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 180 + 4] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 + 4] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 4] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a == 4) {
            this.a = 41;
         } else if(this.a < 54) {
            ++this.a;
         } else if(this.a == 54) {
            this.a = 61;
         } else {
            ++this.a;
         }
      }

      if(this.a.aT != 0) {
         this.c = true;
         this.c(this.a.a.c[0]);
         this.b = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean m() {
      this.a.aT = 0;
      this.a = 4;

      while(this.a != 64) {
         if(this.a.l[this.a.P - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 1 - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 1 - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 2 - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 3 - 180] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 1 - 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P - 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 1 - 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 2 - 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 3 - 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a == 4) {
            this.a = 41;
         } else if(this.a < 54) {
            ++this.a;
         } else if(this.a == 54) {
            this.a = 61;
         } else {
            ++this.a;
         }
      }

      if(this.a.aT != 0) {
         this.c = true;
         this.c(this.a.a.c[0]);
         this.b = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean n() {
      this.a.aT = 0;
      this.a = 4;

      while(this.a != 64) {
         if(this.a.l[this.a.P + 360 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 360 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 540 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 720 - 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 720] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 720 + 1] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 720 + 2] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a.l[this.a.P + 720 + 3] == this.a + 1 && this.a.aT < 5) {
            this.a.a.c[this.a.aT] = this.a;
            ++this.a.aT;
         }

         if(this.a == 4) {
            this.a = 41;
         } else if(this.a < 54) {
            ++this.a;
         } else if(this.a == 54) {
            this.a = 61;
         } else {
            ++this.a;
         }
      }

      if(this.a.aT != 0) {
         this.c = true;
         this.c(this.a.a.c[0]);
         this.b = true;
         return true;
      } else {
         return false;
      }
   }

   private void c(int var1) {
      if(var1 == -1) {
         this.a((byte)121, -1);
         this.c = true;
      } else {
         if(var1 != 18 && var1 != 9 && var1 != 10 && var1 != 17) {
            if(var1 == 94) {
               this.A();
            } else if(var1 == 84) {
               this.B();
            } else {
               int var2;
               if(this.a.d[var1] != -1) {
                  if(this.a.av != 0) {
                     for(var2 = 0; var2 < this.a.av; ++var2) {
                        if(this.a.d[var1] == this.a.a[var2]) {
                           this.a(this.a.d[var1], var1);
                           this.c = true;
                        }
                     }

                     if(!this.c) {
                        this.w();
                     }
                  } else if(!this.c) {
                     this.w();
                  }
               } else {
                  int var3;
                  if(this.a.c[var1] != -1) {
                     if(this.a.c[var1] == 0) {
                        this.D();
                     } else if(this.a.aB != 0) {
                        for(var2 = 0; var2 < this.a.aB; ++var2) {
                           this.a = this.a.m[var2];
                           if(this.a.c[var1] == this.a) {
                              this.D();
                              this.c = true;
                              break;
                           }
                        }

                        if(!this.c) {
                           if(this.a.av != 0) {
                              for(var3 = 0; var3 < this.a.av; ++var3) {
                                 if(this.a.c[var1] == this.a.a[var3]) {
                                    this.D();
                                    this.c = true;
                                    break;
                                 }
                              }

                              if(!this.c) {
                                 this.C();
                              }
                           } else {
                              this.C();
                           }
                        }
                     } else if(this.a.av != 0) {
                        for(var2 = 0; var2 < this.a.av; ++var2) {
                           if(this.a.c[var1] == this.a.a[var2]) {
                              this.D();
                              this.c = true;
                              break;
                           }
                        }

                        if(!this.c) {
                           this.C();
                        }
                     } else {
                        this.C();
                     }
                  } else if(this.a.b[var1] != -1) {
                     if(this.a.b[var1] == 0) {
                        this.C();
                     } else if(this.a.av != 0) {
                        for(var2 = 0; var2 < this.a.av; ++var2) {
                           if(this.a.b[var1] == this.a.a[var2]) {
                              this.C();
                              this.c = true;
                              break;
                           }
                        }

                        if(!this.c) {
                           if(this.a.aB != 0) {
                              for(var3 = 0; var3 < this.a.aB; ++var3) {
                                 this.a = this.a.m[var3];
                                 if(this.a.b[var1] == this.a) {
                                    this.C();
                                    this.c = true;
                                    break;
                                 }
                              }

                              if(!this.c) {
                                 this.x();
                              }
                           } else {
                              this.x();
                           }
                        }
                     } else if(this.a.aB != 0) {
                        for(var2 = 0; var2 < this.a.aB; ++var2) {
                           this.a = this.a.m[var2];
                           if(this.a.b[var1] == this.a) {
                              this.C();
                              this.c = true;
                              break;
                           }
                        }

                        if(!this.c) {
                           this.x();
                        }
                     } else {
                        this.x();
                     }
                  } else {
                     this.u();
                  }
               }
            }
         } else if(var1 == 18) {
            this.z();
         } else {
            this.y();
         }

         this.a.al = var1;
      }
   }

   private void u() {
      if(!this.a.U) {
         if(this.a.a.a(this.a.P + 180 + 1)) {
            this.a.t[this.a.C] = 655391;
            ++this.a.C;
         }

         this.a.t[this.a.C] = 655389;
         ++this.a.C;
         if(this.a.a.a(this.a.P + 180 + 1)) {
            this.a.t[this.a.C] = 655386;
            ++this.a.C;
         }

         this.a.o = true;
      }

   }

   private void v() {
      this.a.t[this.a.C] = 655389;
      ++this.a.C;
   }

   private void w() {
      this.a.t[this.a.C] = 655388;
      ++this.a.C;
   }

   private void x() {
      this.a.t[this.a.C] = 655388;
      ++this.a.C;
   }

   private void y() {
      this.a.t[this.a.C] = 655392;
      this.a.t[this.a.C + 1] = 655391;
      this.a.t[this.a.C + 2] = 655388;
      this.a.C += 3;
      this.a.aB = true;
   }

   private void z() {
      this.a.t[this.a.C] = 655391;
      this.a.t[this.a.C + 1] = 655388;
      this.a.C += 2;
      this.a.aC = true;
   }

   private void A() {
      this.a.t[this.a.C] = 655392;
      ++this.a.C;
      if(!this.a.T) {
         this.a.t[this.a.C] = 655388;
         ++this.a.C;
      }

      this.d = true;
   }

   private void B() {
      this.a.t[this.a.C] = 655391;
      ++this.a.C;
      if(!this.a.T) {
         this.a.t[this.a.C] = 655388;
         ++this.a.C;
      }

      this.a.aD = true;
   }

   private void C() {
      this.a.t[this.a.C] = 655388;
      this.a.t[this.a.C + 1] = 655385;
      this.a.C += 2;
   }

   private void D() {
      this.a.t[this.a.C] = 655387;
      this.a.t[this.a.C + 1] = 655385;
      this.a.t[this.a.C + 2] = 655388;
      this.a.C += 3;
   }

   private void a(byte var1, int var2) {
      if(var1 == 14) {
         this.a.t[this.a.C] = 851976;
         ++this.a.C;
      } else if(var1 == 83) {
         this.a.t[this.a.C] = 851986;
         ++this.a.C;
      } else if(var1 == 121) {
         this.a.t[this.a.C] = 851985;
         ++this.a.C;
      } else {
         if(var1 == 81) {
            if(!this.b) {
               if(this.a.aT == 0) {
                  this.a.t[this.a.C + 1] = 851977;
                  this.a.t[this.a.C] = 655388;
                  this.a.C += 2;
                  this.a.a.c[0] = var2;
                  ++this.a.aT;
                  return;
               }

               this.a.t[this.a.C] = 851977;
               ++this.a.C;
               return;
            }

            this.a.t[this.a.C] = 655388;
            ++this.a.C;
            if(this.a.aT < 5) {
               this.a.a.c[this.a.aT] = var2;
               ++this.a.aT;
            }
         }

      }
   }

   private void E() {
      this.a.C = 0;
      int var1;
      if(this.a.o == 0) {
         for(var1 = 0; var1 < 120; ++var1) {
            if(this.a.m[this.a.z] == (byte)var1) {
               this.c = false;
               this.d(var1);
            }
         }
      }

      if(this.a.o == 4) {
         for(var1 = 0; var1 < 120; ++var1) {
            if(this.a.a[this.a.v] == (byte)var1) {
               this.c = false;
               this.e(var1);
            }
         }
      }

   }

   private void F() {
      this.a.C = 0;

      for(int var1 = 0; var1 < 120; ++var1) {
         if(this.a.a[this.a.w] == this.a.b[var1]) {
            this.c = false;
            this.e(var1);
         }
      }

   }

   private void d(int var1) {
      boolean var2 = false;
      int var3;
      if(this.a.aB != 0) {
         for(var3 = 0; var3 < this.a.aB; ++var3) {
            this.a = this.a.m[var3];
            if(this.a.c[var1] == 0) {
               this.k();
               var2 = true;
               break;
            }

            if(this.a.c[var1] == this.a) {
               this.k();
               this.c = true;
               var2 = true;
               break;
            }

            if(!this.c) {
               this.j();
            }
         }

         this.a.al = var1;
      }

      if(!var2 && this.a.av != 0) {
         for(var3 = 0; var3 < this.a.av; ++var3) {
            if(this.a.c[var1] == 0) {
               this.k();
               break;
            }

            if(this.a.c[var1] == this.a.a[var3]) {
               this.k();
               this.c = true;
               break;
            }

            if(!this.c) {
               this.j();
            }
         }

         this.a.al = var1;
      }

   }

   private void e(int var1) {
      this.a.al = var1;
      this.w();
   }

   public final void j() {
      this.a.C = 2;
      this.a.t[0] = 655390;
      this.a.t[1] = 655388;
   }

   public final void k() {
      this.a.C = 3;
      this.a.t[0] = 655388;
      this.a.t[1] = 655387;
      this.a.t[2] = 655390;
   }

   public final void a(int var1) {
      if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
         if(var1 == 0 && this.a.aB > 0 || var1 == 4 && this.a.av > 0) {
            this.a.n = 1;
         }

         this.a.o = var1;
         this.a.a.f();
      }

   }

   public final void l() {
      if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
         this.a.p = 1;
         this.a.a.f();
      }

   }

   public final void m() {
      if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
         this.a.a.f();
         if(this.a.t == 0) {
            this.a.a.c();
         }

         if(this.a.t == 1) {
            this.a.c = 1;
            this.a.a.a();
            this.a.a.b(this.a.aG);
            this.a.a.g();
            this.a.l = 1;
         }
      }

   }

   public final void n() {
      if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
         int var1;
         if(this.a.aB) {
            if(this.a.ay > 0) {
               this.a.m = 6;

               for(var1 = 0; var1 < this.a.g.length; ++var1) {
                  this.a.g[var1] = null;
               }

               this.a.aA = 0;
               this.a.aw = true;
               return;
            }
         } else if(this.a.ax > 0) {
            this.a.m = 6;

            for(var1 = 0; var1 < this.a.g.length; ++var1) {
               this.a.g[var1] = null;
            }

            this.a.aA = 0;
            this.a.aw = true;
         }
      }

   }

   public final void o() {
      if(!this.a.ae && ((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 5 || this.a.a.e == 1)) {
         this.a.a.e = 0;
         if(this.a.ak == 1 && this.a.am == 1) {
            if(this.a.G && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 1) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M) {
               this.G();
            }
         } else if(this.a.ak == 1 && this.a.am == 2) {
            if(this.a.G && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 2) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N) {
               this.G();
            }
         } else if(this.a.ak == 1 && this.a.am == 3) {
            if(this.a.G && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 3) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O) {
               this.G();
            }
         } else if(this.a.ak == 1 && this.a.am == 4) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P) {
               this.G();
            }
         } else if(this.a.ak == 1 && this.a.am == 5) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q) {
               this.G();
            }
         } else if(this.a.ak == 1 && this.a.am == 6) {
            if(this.a.G && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 2 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 3 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 4 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 5 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.am == 6) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L && this.a.M && this.a.N && this.a.O && this.a.P && this.a.Q && this.a.R) {
               this.G();
            }
         } else if(this.a.ak == 1) {
            if(this.a.G) {
               this.G();
            }
         } else if(this.a.ak == 2) {
            if(this.a.G && this.a.H) {
               this.G();
            }
         } else if(this.a.ak == 3) {
            if(this.a.G && this.a.H && this.a.I) {
               this.G();
            }
         } else if(this.a.ak == 4) {
            if(this.a.G && this.a.H && this.a.I && this.a.J) {
               this.G();
            }
         } else if(this.a.ak == 5) {
            if(this.a.G && this.a.H && this.a.I && this.a.J && this.a.K) {
               this.G();
            }
         } else if(this.a.ak == 6 && this.a.G && this.a.H && this.a.I && this.a.J && this.a.K && this.a.L) {
            this.G();
         }
      }

      if(this.a.ae && this.a.l != 8) {
         this.a.a.a();

         for(int var1 = 0; var1 < 120; ++var1) {
            this.a.e[var1] = "";
            this.a.d[var1] = "";
         }

         this.a.ay = 0;
         this.a.ax = 0;
         if(this.a.t > 8000L) {
            if(this.b == 0) {
               this.a.m = 1;
               this.a.n = 4;
               this.a.s = 5;
            } else if(this.b == 1) {
               this.a.m = 8;
               this.a.p = 0;
            } else if(this.b == 2) {
               this.a.m = 0;
               this.a.z = 0;
               this.a.au = 0;
            } else if(this.b == 3) {
               this.a.m = 1;
               this.a.n = 0;
               this.a.s = 0;
            } else if(this.b == 4) {
               this.a.m = 1;
               this.a.n = 3;
               this.a.s = 2;
               this.a.z = 0;
               this.a.au = 0;
            }

            this.b = -1;
            this.a.aw = true;
            this.a.ae = false;
            this.a.an = 0;
            this.a.ak = 0;
            this.a.am = 0;
            this.a.B = 0;
            if(this.a.aC) {
               this.a.y = 0L;
               this.a.H = 0L;
            }

            this.a.aB = false;
            this.a.aC = false;
            this.a.aD = false;
         }

         if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || (this.a.bu & '\u8000') != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
            this.a.t = 8001L;
         }
      }

   }

   private void G() {
      if(this.a.ao == 9) {
         this.a.f[17] = this.a.f[9];
         this.a.c[17] = this.a.c[9];
         this.a.b[17] = this.a.b[9];
         this.b = 2;
         this.a.a.l();
      } else if(this.a.ao == 10) {
         this.a.f[17] = this.a.f[10];
         this.a.c[17] = this.a.c[10];
         this.a.b[17] = this.a.b[10];
         this.b = 2;
         this.a.a.l();
      } else if(this.a.ao == 19) {
         this.a.f[18] = this.a.f[19];
         this.a.ac -= 2;
         this.a.aa = this.a.ac + this.a.O / 2;
         this.a.af = 0;
         this.a.V = false;
         this.a.W = true;
         this.a.X = false;
         this.a.Y = false;
         this.a.aF = true;
         this.a.H = 0L;
         this.b = 2;
         this.a.a.l();
      } else if(this.a.ao == 94) {
         this.a.ap = 1;

         for(int var1 = 0; var1 < this.a.l.length; ++var1) {
            if(this.a.l[var1] == 85) {
               this.a.l[var1] = 95;
            }
         }

         this.b = 2;
         this.a.a.l();
      } else if(this.a.f[this.a.ao] == 1) {
         this.a.a.k();
         this.b = 0;
      } else if(this.a.f[this.a.ao] != 3 && this.a.f[this.a.ao] != 5) {
         if(this.a.f[this.a.ao] == 0) {
            this.a.a.n();
            this.b = 3;
         } else if(this.a.f[this.a.ao] == 10) {
            this.a.a.a("hat");
            this.b = 4;
         } else if(this.a.f[this.a.ao] == 7) {
            this.a.a.a("shirt");
            this.b = 4;
         } else if(this.a.f[this.a.ao] == 8) {
            this.a.a.a("trousers");
            this.b = 4;
         } else if(this.a.f[this.a.ao] == 9) {
            this.a.a.a("shoes");
            this.b = 4;
         }
      } else {
         this.a.a.m();
         this.b = 1;
      }

      this.a.a.o();
      this.a.ae = true;
      this.a.aw = true;
      this.a.t = 0L;
      this.a.b();
   }

   public final void p() {
      if((this.a.bu & 1) != 0 || this.a.a.e == 4) {
         switch(this.a.u) {
         case 0:
            --this.a.D;
            if(this.a.D == -1) {
               this.a.D = this.a.H - 1;
            }
            break;
         case 1:
            --this.a.E;
            if(this.a.E == -1) {
               this.a.E = this.a.I - 1;
            }
            break;
         case 2:
            --this.a.F;
            if(this.a.F == -1) {
               this.a.F = this.a.J - 1;
            }
            break;
         case 3:
            --this.a.G;
            if(this.a.G == -1) {
               this.a.G = this.a.K - 1;
            }
         }

         this.a.aw = true;
         this.a.t = true;
         this.a.o = 0L;
      }

      if((this.a.bu & 2) != 0 || this.a.a.e == 6) {
         switch(this.a.u) {
         case 0:
            ++this.a.D;
            if(this.a.D == this.a.H) {
               this.a.D = 0;
            }
            break;
         case 1:
            ++this.a.E;
            if(this.a.E == this.a.I) {
               this.a.E = 0;
            }
            break;
         case 2:
            ++this.a.F;
            if(this.a.F == this.a.J) {
               this.a.F = 0;
            }
            break;
         case 3:
            ++this.a.G;
            if(this.a.G == this.a.K) {
               this.a.G = 0;
            }
         }

         this.a.aw = true;
         this.a.u = true;
         this.a.o = 0L;
      }

   }

   public final void q() {
      if((this.a.bu & 16384) != 0 || (this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
         switch(this.a.l) {
         case 4:
            this.a.l = 1;
            this.a.a.h();
            break;
         case 10:
            this.a.l = 3;
            this.a.aw = true;
         }

         if(this.a.m == 9) {
            this.a.m = 0;
         }

         this.a.l = true;
         this.a.a();
      }

      if(((this.a.bu & 4) != 0 || this.a.a.e == 2) && this.a.b.size() > 1 && this.a.h != 0) {
         this.a.n = true;
         this.a.m = true;
         --this.a.h;
         this.a.i = 1;
      }

      if(((this.a.bu & 8) != 0 || this.a.a.e == 8) && this.a.b.size() > 1 && this.a.h != this.a.b.size() - 1) {
         this.a.n = true;
         this.a.m = true;
         ++this.a.h;
         this.a.i = 2;
      }

   }

   public final void r() {
      this.a.u[0] = 655382;
      this.a.u[1] = 655383;
      this.a.u[2] = 655384;
      this.a.u[3] = 655385;
      this.a.u[4] = 655386;
      this.a.u[5] = 655387;
      this.a.u[6] = 655388;
      this.a.u[7] = 655389;
      this.a.u[8] = 655390;
      this.a.u[9] = 655391;
      this.a.u[10] = 655392;
      this.a.u[11] = 851976;
      this.a.u[12] = 851986;
      this.a.u[13] = 851985;
      this.a.u[14] = 851977;
      this.a.u[15] = 655393;
      this.a.u[16] = 655394;
      this.a.u[17] = 655395;
      this.a.u[18] = 655396;
      this.a.u[19] = 655397;
      this.a.u[20] = 655398;
   }

   public final void s() {
      if(this.a.a.getAppProperty("UNITYGAMECATALOGURL") == null) {
         this.a.a = false;
         this.a.a = "";
         this.a.b = 5;
      } else {
         this.a.a = true;
         this.a.a = this.a.a.getAppProperty("UNITYGAMECATALOGURL");
         this.a.b = 6;
      }
   }
}
