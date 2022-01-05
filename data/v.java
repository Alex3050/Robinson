package data;

import data.k;
import data.p;

public final class v {

   private p a;
   public boolean a = false;
   public int a = -2;
   private boolean b = false;
   private boolean c = false;
   public long a = 0L;
   private boolean d = true;
   private boolean e = true;
   private int b = '\u99ff';


   public v(p var1) {
      this.a = var1;
   }

   public final void a() {
      this.a.a.s();
      this.a.a.h();
      if(this.a.z) {
         this.a.a.g();
      }

      if(this.a.y) {
         this.a.a.f();
      }

      if(this.a.x) {
         this.a.a.e();
      }

      if(this.a.B) {
         this.a.a.g();
      }

      this.a.a.i();
      this.a.a.f();
      this.a.a.b();
      this.a.a.c();
      this.a.a.a();
      this.a.a.b();
      if(this.a) {
         this.a.a.d();
      }

      if(this.a.B) {
         this.a.a.e();
      }

      if(this.a.C) {
         this.a.a.f();
      }

   }

   public final void b() {
      switch(this.a.l) {
      case 0:
         return;
      case 1:
         if(!this.a.c) {
            if(this.a.b) {
               this.a.r = this.a.a.a(this.a.r, 0, this.a.b - 1);
            } else {
               this.a.r = this.a.a.a(this.a.r, 1, this.a.b - 1);
            }
         }

         this.a.a.e();
         return;
      case 2:
         this.a.A = this.a.a.a(this.a.A, 0, 1);
         this.a.a.g();
         return;
      case 3:
         this.a.d = this.a.a.a(this.a.d, 0, this.a.e - 1);
         if(this.a.hasPointerEvents() && this.a.d > this.a.e - 1) {
            if(this.a.a.b) {
               this.a.d = ((Integer)this.a.a.elementAt(this.a.f)).intValue();
               this.a.a.b = false;
            } else {
               this.a.d = ((Integer)this.a.a.elementAt(this.a.g)).intValue();
            }
         }

         this.a.a.a();
         this.a.a.f();
         return;
      case 4:
         this.a.a.q();
         return;
      case 5:
         if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
            this.a.l = 6;
            this.a.a();
         }

         if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
            this.a.a.r();
            this.a.a.a();
            this.a.a.b(this.a.aG);
            this.g();
            this.a.l = 1;
            this.a.a.h();
            this.a.a();
            return;
         }
         break;
      case 6:
         this.a.a.f();
         switch(this.a.m) {
         case 0:
            this.a.o = false;
            this.b = true;
            this.a.az = true;
            if(!this.a.aK && !this.a.aF) {
               if(!this.a && !this.a.U && !this.a.aN) {
                  this.a.a.c();
               }

               if(this.a.U) {
                  this.a.a.d();
               }

               if(this.a.aN) {
                  this.a.a.e();
               }

               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.l = 5;
                  this.a.aL = true;
                  this.a.aw = true;
               }

               if(this.a && ((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1)) {
                  this.a.c = 0;
                  this.a.a.a();
                  this.a.a.b(this.a.aG);
                  this.g();
                  this.a.l = 1;
               }

               if(!this.a && !this.a.U && ((this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1)) {
                  this.a.m = 2;
               }
            }

            if(this.a.aF && this.a.H > 8000L) {
               this.a.l = 9;
               this.a.y = 0L;
               this.a.aw = true;
            }

            this.a.aK = false;
            break;
         case 1:
            if(this.a.n != 1 && !this.a.S && !this.a.v) {
               this.a.s = this.a.a.b(this.a.s, 0, 5);
            }

            switch(this.a.n) {
            case 0:
               this.b = false;
               this.a.z = this.a.a.a(this.a.z, 0, this.a.aB - 1);
               this.a.a.b();
               this.a.a.a(0);
               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.m = 0;
                  this.a.a.f();
                  this.a.z = 0;
                  this.a.au = 0;
               }
               break;
            case 1:
               this.a.a.h();
               this.a.a.i();
               if((this.a.bu & '\u8000') != 0 || (this.a.bu & 4) != 0 || (this.a.bu & 8) != 0 || this.a.a.e == 3 || this.a.a.e == 2 || this.a.a.e == 8) {
                  this.a.n = this.a.o;
                  this.a.aw = true;
                  this.a.aK = true;
               }
               break;
            case 2:
               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.m = 0;
                  this.a.n = 0;
                  this.a.a.f();
               }
               break;
            case 3:
               if(this.a.v) {
                  this.a.u = this.a.a.a(this.a.u, 0, 3);
                  this.a.a.p();
                  if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                     this.a.v = false;
                     this.a.u = -1;
                     this.a.aw = true;
                  }
               } else {
                  if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
                     this.a.v = true;
                     this.a.u = 0;
                     this.a.aw = true;
                  }

                  if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                     this.a.m = 0;
                     this.a.n = 0;
                     this.a.a.f();
                  }
               }
               break;
            case 4:
               this.b = false;
               this.a.v = this.a.a.a(this.a.v, 0, this.a.av - 1);
               this.a.a.c();
               this.a.a.a(4);
               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.m = 0;
                  this.a.n = 0;
                  this.a.a.f();
                  this.a.v = 0;
                  this.a.au = 0;
               }
               break;
            case 5:
               if(this.a.S) {
                  if((this.a.bu & 4) != 0) {
                     if(this.a.R > 0) {
                        this.a.R -= 60;
                     }

                     this.a.aw = true;
                     this.a.o = 0L;
                     this.a.aI = true;
                     if(this.a.aO - 3 > 0) {
                        this.a.aO -= 3;
                     }
                  }

                  if((this.a.bu & 8) != 0) {
                     if(this.a.R < 120) {
                        this.a.R += 60;
                     }

                     this.a.aw = true;
                     this.a.o = 0L;
                     this.a.aJ = true;
                     if(this.a.aO + 3 <= 9) {
                        this.a.aO += 3;
                     }
                  }

                  if((this.a.bu & 1) != 0) {
                     if(this.a.Q > 0) {
                        this.a.Q -= 60;
                     }

                     this.a.aw = true;
                     this.a.o = 0L;
                     this.a.aG = true;
                     if(this.a.aO - 1 == 2 || this.a.aO - 1 == 1 || this.a.aO - 1 == 4 || this.a.aO - 1 == 5 || this.a.aO - 1 == 7 || this.a.aO - 1 == 8) {
                        --this.a.aO;
                     }
                  }

                  if((this.a.bu & 2) != 0) {
                     if(this.a.Q < 120) {
                        this.a.Q += 60;
                     }

                     this.a.aw = true;
                     this.a.o = 0L;
                     this.a.aH = true;
                     if(this.a.aO + 1 == 2 || this.a.aO + 1 == 3 || this.a.aO + 1 == 5 || this.a.aO + 1 == 6 || this.a.aO + 1 == 8 || this.a.aO + 1 == 9) {
                        ++this.a.aO;
                     }
                  }

                  if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                     this.a.S = false;
                     this.a.aw = true;
                  }
               } else {
                  if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
                     this.a.S = true;
                     this.a.aw = true;
                  }

                  if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                     this.a.m = 0;
                     this.a.n = 0;
                     this.a.a.f();
                  }
               }
               break;
            case 6:
               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.m = 0;
                  this.a.n = 0;
                  this.a.a.f();
               }
            }

            this.a.o = true;
            break;
         case 2:
            if(!this.a.aM) {
               this.a.a.h();
               this.a.a.i();
               if((this.a.bu & '\u8000') != 0 || (this.a.bu & 4) != 0 || (this.a.bu & 8) != 0 || this.a.a.e == 3 || this.a.a.e == 2 || this.a.a.e == 8) {
                  this.a.m = 0;
                  this.a.a.f();
                  this.a.aK = true;
                  this.a.aw = true;
               }
            }

            this.a.o = true;
            break;
         case 3:
            if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
               if(this.b) {
                  if(this.c) {
                     this.a.p = 0;
                     this.a.m = 8;
                     this.a.w = 0;
                     this.a.a.f();
                     this.c = false;
                  } else {
                     this.a.n = 0;
                     this.a.m = 0;
                     this.a.a.f();
                     this.a.aB = false;
                     this.a.aC = false;
                     this.a.aD = false;
                  }

                  this.b = false;
               } else {
                  this.a.m = 1;
                  this.a.n = this.a.o;
                  if(this.a.o == 0) {
                     this.a.s = 0;
                  }

                  if(this.a.o == 4) {
                     this.a.s = 5;
                  }

                  this.a.a.f();
               }

               this.a.aw = true;
               this.a.a();
            }

            this.a.a.q();
            this.a.o = true;
            break;
         case 4:
            this.a.t = this.a.a.a(this.a.t, 0, 1);
            this.a.a.m();
            if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
               this.a.m = 0;
               this.a.a.f();
            }

            this.a.o = true;
            break;
         case 5:
            if(this.a.aB) {
               this.a.y = this.a.a.a(this.a.y, 0, this.a.ay - 1);
            } else {
               this.a.y = this.a.a.a(this.a.y, 0, this.a.ax - 1);
            }

            this.a.a.d();
            this.a.a.n();
            if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
               this.a.a.k();
               this.a.a.f();
            }

            this.a.o = true;
            break;
         case 6:
            this.a.a.o();
            if((this.a.bu & 8) != 0 || this.a.a.e == 8) {
               if(this.a.B < this.a.aA - this.a.as) {
                  ++this.a.B;
               }

               this.a.aw = true;
               this.a.n = 0L;
               this.a.i = true;
               this.a.aA = 0;
            }

            if((this.a.bu & 4) != 0 || this.a.a.e == 2) {
               if(this.a.B > 0) {
                  --this.a.B;
               }

               this.a.aw = true;
               this.a.n = 0L;
               this.a.h = true;
               this.a.aA = 0;
            }

            if(!this.a.ae && ((this.a.bu & '\u8000') != 0 || this.a.a.e == 3)) {
               if(!this.a.aC && !this.a.aD) {
                  this.a.m = 5;
               } else {
                  this.a.m = 0;
                  this.a.aD = false;
                  this.a.aC = false;
                  this.a.a.f();
               }

               this.a.aw = true;
               this.a.B = 0;
               this.a.a.f();
            }

            this.a.o = true;
            break;
         case 7:
            int var1;
            switch(this.a.q) {
            case 0:
               this.a.a.b();
               if(this.a.a.a) {
                  this.a.a.a = false;
                  if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                     if(this.a.a.a > 0) {
                        --this.a.q[this.a.a.b];
                        if(this.a.q[this.a.a.b] == 0) {
                           for(var1 = this.a.a.b; var1 < this.a.aB - 1; ++var1) {
                              this.a.m[var1] = this.a.m[var1 + 1];
                              this.a.q[var1] = this.a.q[var1 + 1];
                           }

                           --this.a.aB;
                        }
                     }

                     this.a.m = 0;
                     this.a.a.f();
                  }
               }
               break;
            case 1:
               this.a.a.e();
               if(this.a.a.a) {
                  this.a.a.a = false;
                  if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                     if(this.a.a.a > 0) {
                        --this.a.q[this.a.a.b];
                        if(this.a.q[this.a.a.b] == 0) {
                           for(var1 = this.a.a.b; var1 < this.a.aB - 1; ++var1) {
                              this.a.m[var1] = this.a.m[var1 + 1];
                              this.a.q[var1] = this.a.q[var1 + 1];
                           }

                           --this.a.aB;
                        }
                     }

                     this.a.m = 0;
                     this.a.a.f();
                  }
               }
               break;
            case 2:
               this.a.a.d();
               if(this.a.a.a) {
                  this.a.a.a = false;
                  if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                     if(this.a.a.a > 0) {
                        --this.a.q[this.a.a.b];
                        if(this.a.q[this.a.a.b] == 0) {
                           for(var1 = this.a.a.b; var1 < this.a.aB - 1; ++var1) {
                              this.a.m[var1] = this.a.m[var1 + 1];
                              this.a.q[var1] = this.a.q[var1 + 1];
                           }

                           --this.a.aB;
                        }
                     }

                     this.a.m = 0;
                     this.a.a.f();
                  }
               }
               break;
            case 3:
               this.a.a.d();
               if(this.a.a.a) {
                  this.a.a.a = false;
                  if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                     if(this.a.a.a > 0) {
                        --this.a.q[this.a.a.b];
                        if(this.a.q[this.a.a.b] == 0) {
                           for(var1 = this.a.a.b; var1 < this.a.aB - 1; ++var1) {
                              this.a.m[var1] = this.a.m[var1 + 1];
                              this.a.q[var1] = this.a.q[var1 + 1];
                           }

                           --this.a.aB;
                        }
                     }

                     this.a.m = 0;
                     this.a.a.f();
                  }
               }
            }

            this.a.aw = true;
            this.a.o = true;
            this.a.aK = false;
            break;
         case 8:
            switch(this.a.p) {
            case 0:
               this.b = this.c = true;
               this.a.w = this.a.a.a(this.a.w, 0, this.a.aw - 1);
               this.a.a.l();
               if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
                  this.a.m = 0;
                  this.b = this.c = false;
                  this.a.aB = false;
                  this.a.a.f();
               }
               break;
            case 1:
               this.a.a.h();
               this.a.a.i();
               if((this.a.bu & '\u8000') != 0 || (this.a.bu & 4) != 0 || (this.a.bu & 8) != 0 || this.a.a.e == 3 || this.a.a.e == 2 || this.a.a.e == 8) {
                  this.a.p = 0;
                  this.c = false;
                  this.a.aw = true;
               }
            }

            this.a.o = true;
            break;
         case 9:
            this.a.a.q();
            break;
         case 10:
            if(this.a.p) {
               this.a.aw = true;
               if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                  this.a.g = 4001L;
               }

               if(this.a.g > 4000L) {
                  this.a.aK = false;
                  this.a.g = 0L;
                  this.a.p = false;
                  this.a.n = true;
                  this.a.m = true;
                  this.a.m = this.a.j;
                  this.a.b();
               }
            }

            if(this.a.q) {
               this.a.aw = true;
               if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
                  this.a.g = 8001L;
               }

               if(this.a.g > 8000L) {
                  this.a.aK = false;
                  this.a.g = 0L;
                  this.a.q = false;
                  this.a.n = true;
                  this.a.m = true;
                  this.a.m = this.a.j;
                  this.a.b();
               }
            }
         }

         return;
      case 7:
         return;
      case 8:
         if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
            this.a.y = 8001L;
         }

         if(this.a.y > 8000L) {
            this.g();
         }

         this.a.a.h();
         return;
      case 9:
         if((this.a.bu & '\u8000') != 0 || (this.a.bu & 16) != 0 || (this.a.bu & 16384) != 0 || this.a.a.e == 1 || this.a.a.e == 3) {
            this.a.y = 8001L;
         }

         if(this.a.y > 8000L) {
            this.g();
         }

         this.a.a.h();
         break;
      case 10:
         this.a.a.q();
         return;
      case 11:
         if(this.a.a == 1) {
            if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
               this.a.ax = true;
               this.a.a.a(1);
               this.a.a.e();
               this.a.a.a(false);
               this.a.l = 1;
               return;
            }

            if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
               this.a.l = 1;
               this.a.aw = true;
               return;
            }
         } else {
            if((this.a.bu & 16384) != 0 || (this.a.bu & 16) != 0 || this.a.a.e == 1) {
               this.a.a.destroyApp(true);
               return;
            }

            if((this.a.bu & '\u8000') != 0 || this.a.a.e == 3) {
               this.a.l = 1;
               this.a.aw = true;
               return;
            }
         }
      }

   }

   public final void c() {
      if(this.a.aw) {
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.a(this.a.a, this.a.a.a(94), k.a() >> 1, (k.b() >> 1) - 30, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         if(this.a.aO) {
            this.a.a.a(this.a.a, this.a.a.a(95), k.a() >> 1, k.b() >> 1, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            return;
         }

         if(this.a.aP) {
            this.a.a.a(this.a.a, this.a.a.a(110), k.a() >> 1, k.b() >> 1, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            return;
         }

         this.a.a.a(this.a.a, this.a.a.a(96), k.a() >> 1, k.b() >> 1, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }

   public final void d() {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.a(this.a.a, this.a.a.a(97), k.a() >> 1, k.b() / 4, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.a(this.a.a, this.a.a.a(98), k.a() >> 1, k.b() / 4 + 20, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }

   public final void a(boolean var1) {
      this.b(var1);
      if(var1) {
         if(this.a == 70) {
            if(this.a.c == 0) {
               this.c(false);
               return;
            }

            this.c(true);
            return;
         }

         if(this.a == 80) {
            return;
         }

         if(this.a == 100) {
            this.a.a.a(true, true);
            this.a = (long)this.a.a.b();
            this.a.a.q();
            this.a.a.d();
            this.a.a.p();
            this.a.a.t();
            return;
         }
      } else {
         if(this.a == 80) {
            this.a.a.d();
            this.a.a.b();
            return;
         }

         if(this.a == 100) {
            this.a.Z = 8;
            this.a.aa = 148;
            this.a.ab = this.a.Z - this.a.N / 2;
            this.a.ac = this.a.aa - this.a.O / 2;
            this.a.a.q();
            this.a.d = true;
         }
      }

   }

   private void b(boolean var1) {
      this.a.p = false;
      this.a.c = true;
      if(this.a != 0) {
         if(this.a == 20) {
            if(this.d) {
               this.a.a.e();
               this.d = false;
               this.e = false;
               this.a.a();
               return;
            }

            if(!var1 && this.e) {
               this.e = false;
               this.a.a.a = 0;
               this.a.a.b = 0;
               this.a.a.c = 0;
               this.a.a.d = 0;
               this.a.a.e = 0;
               this.a.a.f = 0;
               this.a.a.g = 0;
               this.a.a.h = 0;
               this.a.a.i = 0;
               this.a.a.j = 0;
               this.a.a.k = 0;
               this.a.a.l = 0;
               this.a.a.m = 0;
               this.a.a.n = 0;
               this.a.a.o = 0;
               this.a.a.p = 0;
               this.a.a.q = 0;
               this.a.a.r = 0;
               this.a.a.s = 0;
               this.a.a.t = 0;
               this.a.a.u = 0;
               this.a.a.v = 0;
               this.a.a.w = 0;
               this.a.a.x = 0;
               this.a.a.e();
               this.a.a();
               return;
            }
         } else {
            if(this.a == 40) {
               this.a.a.c();
               this.a.a.f();
               this.a.a.g();
               this.a.a();
               return;
            }

            if(this.a == 60) {
               if(!var1) {
                  this.a.a.d();
                  this.a.a.p();
               }

               this.a.m = 0;
               this.a.n = 0;
               this.a.a = (float)((k.a() / 3 - 16) / 1);
               this.a.b = this.a.a;
               this.a.c = this.a.a;
               this.a.e = 0.0F;
               this.a.f = 0.0F;
               this.a.g = 0.0F;
               this.a.L = 0;
               this.a.a();
            }
         }

      } else {
         this.a.aj = false;
         this.a.ak = false;
         this.a.al = false;
         this.a.am = false;
         this.a.an = false;
         this.a.ao = false;
         this.a.ap = false;
         this.a.aq = false;
         this.a.ar = false;
         this.a.as = false;
         this.a.at = false;
         this.a.au = false;
         this.a.av = false;
         this.a.a();
         if(!var1) {
            this.a.ad = true;
         } else if(this.a.ag) {
            for(int var2 = 0; var2 < 120; ++var2) {
               if(this.a.c[var2] != null) {
                  this.a.c[var2] = null;
               }
            }

            this.a.a.d();
         }

         if(!this.d) {
            this.a.a.a("BIGislandObjects", this.a.l);
         }

         this.a.a.d();
         this.a.a.a();
         this.a.aj = this.a.M / 2;
         this.a.a();
      }
   }

   public final void e() {
      this.a += 2;
      if(this.a <= 100) {
         if(this.a.r == 0) {
            this.a.a.a(0);
         } else if(this.a.r == 1) {
            this.a.a.a(1);
         }

         this.a.a(this.a.a, 20, k.b() / 3 * 2, k.a() - 40, 12, this.a, 100, 0, this.b);
      } else {
         this.a = -2;
         this.a.a.h();
         if(this.a.e) {
            this.a.aw = true;
            this.a.C = 0L;
            this.a.c = false;
            this.a.e = false;
         } else {
            this.a.l = 6;
         }

         this.a.a();
      }
   }

   private void c(boolean var1) {
      long var2 = (long)this.a.aG - this.a;
      byte var10 = 0;
      long var4;
      if(this.a.K < this.a.c) {
         if(var2 > 0L) {
            --var2;
         }

         var4 = 24L - this.a.c + this.a.K;
      } else {
         var4 = this.a.K - this.a.c;
      }

      long var6;
      if(this.a.J < this.a.d) {
         if(var4 > 0L) {
            --var4;
         }

         var6 = 0L;
      }

      var6 = 0L;
      long var8;
      if((var8 = 24L * var2 + var4) >= 1L && var8 <= 15L) {
         var10 = 10;
      } else if(var8 >= 16L && var8 <= 35L) {
         var10 = 20;
      } else if(var8 >= 36L && var8 <= 72L) {
         var10 = 30;
      } else if(var8 >= 73L && var8 <= 119L) {
         var10 = 40;
      } else if(var8 > 119L) {
         var10 = 50;
      }

      if(var1) {
         this.a.a += this.a.d / 100.0F * (float)var10;
         this.a.b += this.a.d / 100.0F * (float)var10;
         this.a.c += this.a.d / 100.0F * (float)var10;
         if(this.a.a >= this.a.d) {
            this.a.a = this.a.d;
         }

         if(this.a.b >= this.a.d) {
            this.a.b = this.a.d;
         }

         if(this.a.c >= this.a.d) {
            this.a.c = this.a.d;
            return;
         }
      } else {
         if(this.a.a > 10.0F) {
            this.a.a -= this.a.d / 100.0F * (float)var10;
            if(this.a.a < 10.0F) {
               this.a.a = 10.0F;
            }
         }

         if(this.a.b > 10.0F) {
            this.a.b -= this.a.d / 100.0F * (float)var10;
            if(this.a.b < 0.0F) {
               this.a.b = 10.0F;
            }
         }

         if(this.a.c > 10.0F) {
            this.a.c -= this.a.d / 100.0F * (float)var10;
            if(this.a.c < 0.0F) {
               this.a.c = 10.0F;
            }
         }
      }

   }

   public final void a(int var1) {
      this.a.L += var1;
      if(this.a.L >= 50) {
         this.a.L -= 50;
         if(this.a.g < this.a.d) {
            ++this.a.g;
         }
      }

   }

   public final void f() {
      if(!this.a.D) {
         if(this.a.k >= 60000L) {
            this.a.a.d();
            if(this.a.J < 10L) {
               this.a.a = (new StringBuffer()).append(this.a.K + ":0" + this.a.J);
            } else {
               this.a.a = (new StringBuffer()).append(this.a.K + ":" + this.a.J);
            }

            this.a.k = 0L;
            this.a.aw = true;
            return;
         }
      } else if(this.a.e > 4000L) {
         if(this.a.J < 60L) {
            ++this.a.J;
         }

         if(this.a.J == 60L) {
            this.a.J = 0L;
            ++this.a.K;
            if(this.a.K == 24L) {
               this.a.K = 0L;
            }
         }

         this.a.e = 0L;
         this.a.aw = true;
         if(this.a.J < 10L) {
            this.a.a = (new StringBuffer()).append(this.a.K + ":0" + this.a.J);
            return;
         }

         this.a.a = (new StringBuffer()).append(this.a.K + ":" + this.a.J);
      }

   }

   public final void g() {
      this.a.a.a(14);
      this.a.l = 1;
      this.a.ap = 0;
      this.a.b = 0L;
      this.a.aO = false;
      this.a.aP = false;
      if(this.a.b) {
         this.a.r = 0;
      } else {
         this.a.r = 1;
      }

      this.a = false;
      this.a.aF = false;
      this.a.c = false;
      this.a.aw = true;
      this.a.T = false;
      this.a.aB = 0;

      for(int var1 = 0; var1 < this.a.m.length; ++var1) {
         this.a.q[var1] = 0;
      }

      this.a.av = 0;

      for(int var2 = 0; var2 < this.a.a.length; ++var2) {
         this.a.g[var2] = 0;
      }

      this.a.aw = 0;

      for(int var3 = 0; var3 < this.a.a.length; ++var3) {
         this.a.a[var3] = null;
         this.a.h[var3] = 0;
      }

      for(int var4 = 0; var4 < this.a.r.length; ++var4) {
         this.a.r[var4] = 0;
      }

      this.a.aC = 0;

      for(int var5 = 0; var5 < this.a.s.length; ++var5) {
         this.a.s[var5] = 0;
      }

      this.a.aD = 0;
      this.a.a = new int[5];
      this.a.b = new int[5];
      this.a.c = new int[5];
      this.a.d = new int[5];
      this.a.H = 1;
      this.a.I = 1;
      this.a.J = 1;
      this.a.K = 1;
      this.a.D = 0;
      this.a.E = 0;
      this.a.F = 0;
      this.a.G = 0;
   }
}
