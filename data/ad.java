package data;

import data.l;
import data.p;

public final class ad {

   private p a;
   private boolean b = true;
   private int[] a = new int[120];
   public boolean a = true;
   private long a = 0L;
   private boolean c = false;
   private int a = 0;
   private boolean d = false;
   private byte[] a = new byte[120];
   private boolean e = true;
   private boolean f = true;


   public ad(p var1) {
      this.a = var1;
   }

   public final void a() {
      int var1 = (int)(this.a.c * 100.0F / this.a.d);
      int var2 = (int)(this.a.f * 100.0F / this.a.d);
      int var3 = (int)(this.a.e * 100.0F / this.a.d);
      this.a.af = true;
      this.a = true;
      int var4;
      if(this.a.f[this.a.al] == 1) {
         for(var4 = 0; var4 < this.a.av; ++var4) {
            if(this.a.a[var4] == (byte)this.a.al) {
               ++this.a.g[var4];
               this.a = false;
            }
         }

         if(this.a) {
            this.a.a[this.a.av] = (byte)this.a.al;
            this.a.g[this.a.av] = 1;
            ++this.a.av;
         }
      } else if(this.a.f[this.a.al] == 0) {
         for(var4 = 0; var4 < this.a.aB; ++var4) {
            if(this.a.m[var4] == (byte)this.a.al) {
               ++this.a.q[var4];
               this.a = false;
            }
         }

         if(this.a) {
            this.a.m[this.a.aB] = (byte)this.a.al;
            this.a.q[this.a.aB] = 1;
            ++this.a.aB;
         }
      } else if(this.a.f[this.a.al] == 3) {
         for(var4 = 0; var4 < this.a.aw; ++var4) {
            if(this.a.a[var4] == (new Integer(this.a.al)).toString()) {
               ++this.a.h[var4];
               this.a = false;
            }
         }

         if(this.a) {
            this.a.a[this.a.aw] = this.a.b[this.a.al];
            this.a.h[this.a.aw] = 1;
            ++this.a.aw;
         }
      } else if(this.a.f[this.a.al] == 5) {
         for(var4 = 0; var4 < this.a.aw; ++var4) {
            if(this.a.a[var4] == this.a.b[this.a.al]) {
               ++this.a.h[var4];
               this.a = false;
            }
         }

         if(this.a) {
            this.a.a[this.a.aw] = this.a.b[this.a.al];
            this.a.h[this.a.aw] = 1;
            ++this.a.aw;
         }
      } else if(this.a.f[this.a.al] == 10) {
         for(var4 = 0; var4 < this.a.H; ++var4) {
            if(this.a.a[var4] == this.a.al) {
               this.a = false;
            }
         }

         if(this.a) {
            this.a.a[this.a.H] = this.a.al;
            ++this.a.H;
         }
      } else if(this.a.f[this.a.al] == 7) {
         for(var4 = 0; var4 < this.a.I; ++var4) {
            if(this.a.b[var4] == this.a.al) {
               this.a = false;
            }
         }

         if(this.a) {
            this.a.b[this.a.I] = this.a.al;
            ++this.a.I;
         }
      } else if(this.a.f[this.a.al] == 8) {
         for(var4 = 0; var4 < this.a.J; ++var4) {
            if(this.a.c[var4] == this.a.al) {
               this.a = false;
            }
         }

         if(this.a) {
            this.a.c[this.a.J] = this.a.al;
            ++this.a.J;
         }
      } else if(this.a.f[this.a.al] == 9) {
         for(var4 = 0; var4 < this.a.K; ++var4) {
            if(this.a.d[var4] == this.a.al) {
               this.a = false;
            }
         }

         if(this.a) {
            this.a.d[this.a.K] = this.a.al;
            ++this.a.K;
         }
      } else {
         for(var4 = 0; var4 < this.a.aB; ++var4) {
            if(this.a.m[var4] == (byte)this.a.al) {
               ++this.a.q[var4];
               this.a = false;
            }
         }

         if(this.a) {
            this.a.m[this.a.aB] = (byte)this.a.al;
            this.a.q[this.a.aB] = 1;
            ++this.a.aB;
         }
      }

      if(this.a.b[this.a.al] != -1 && this.a.c[this.a.al] == -1) {
         if(this.a.l[this.a.al] != 0) {
            if((var2 += this.a.l[this.a.al]) > 100) {
               var2 = 100;
            }

            this.a.f = (float)var2 * this.a.d / 100.0F;
         }

         if(this.a.n[this.a.al] != 0) {
            if((var3 += this.a.n[this.a.al]) > 100) {
               var3 = 100;
            }

            this.a.e = (float)var3 * this.a.d / 100.0F;
         }

         if(this.a.m[this.a.al] != 0) {
            var4 = this.a.m[this.a.al];
            if((var1 += var4) > 100) {
               var1 = 100;
            }

            if(var1 <= 0) {
               this.b();
            }

            this.a.c = (float)var1 * this.a.d / 100.0F;
         }
      }

      if(this.a.a.b(this.a.al)) {
         this.a.F = 0L;
         this.a.aM = true;
         this.a.af = false;
      }

      if(this.a.af) {
         if(this.a.X) {
            if(this.a.f[this.a.al] == 0) {
               if(this.a.al != 93 && this.a.al != 21 && this.a.al != 38) {
                  this.c(this.a.P + 180);
               } else {
                  this.a(this.a.P + 180);
               }
            }

            this.a.l[this.a.P + 180] = 0;
         } else if(this.a.Y) {
            if(this.a.f[this.a.al] == 0) {
               if(this.a.al != 93 && this.a.al != 21 && this.a.al != 38) {
                  this.c(this.a.P + 180 + 2);
               } else {
                  this.a(this.a.P + 180 + 2);
               }
            }

            this.a.l[this.a.P + 180 + 2] = 0;
         } else if(this.a.V) {
            if(this.a.f[this.a.al] == 0) {
               if(this.a.al != 93 && this.a.al != 21 && this.a.al != 38) {
                  this.c(this.a.P + 1);
               } else {
                  this.a(this.a.P + 1);
               }
            }

            this.a.l[this.a.P + 1] = 0;
         } else if(this.a.W) {
            if(this.a.f[this.a.al] == 0) {
               if(this.a.al != 93 && this.a.al != 21 && this.a.al != 38) {
                  this.c(this.a.P + 360 + 1);
               } else {
                  this.a(this.a.P + 360 + 1);
               }
            }

            this.a.l[this.a.P + 360 + 1] = 0;
         }

         this.a.m = 0;
         this.a.a.f();
         this.a.aw = true;
      }

   }

   public final void b() {
      this.a.l = 8;
      this.a.aw = true;
      this.a.c = false;
      this.a.y = 0L;
      this.a.r = 0;
      if(this.a.b) {
         this.a.r = 0;
      } else {
         this.a.r = 1;
      }
   }

   private void c(int var1) {
      this.a.s[this.a.aD] = this.a.a[var1];
      ++this.a.aD;
      if(this.a.aD == 20) {
         this.a.aD = 0;
      }

   }

   private void w() {
      for(int var1 = 0; var1 < this.a.s.length; ++var1) {
         this.a.s[var1] = 0;
      }

      this.a.aD = 0;
   }

   public final void a(int var1) {
      this.a.r[this.a.aC] = this.a.a[var1];
      ++this.a.aC;
      if(this.a.aC == 70) {
         this.a.aC = 0;
      }

   }

   public final void c() {
      this.a.U = true;
      this.a.m = 0;
      this.a.n = 0;
      this.a.q = 0L;
   }

   public final void d() {
      if(this.a.q > 10000L) {
         this.a.U = false;
         this.a.q = 0L;
         this.b(30);
      }

   }

   public final void e() {
      if(this.a.u > 2000L) {
         this.a.aN = false;
         this.a.u = 0L;
         this.a.a.c();
         this.a.m = 7;
         this.a.q = 0;
         this.a.aw = true;
      }

   }

   public final void f() {
      if(!this.a.F) {
         if(this.a.aL) {
            this.a = this.a.J;
            this.a.aL = false;
         }

         if(this.a.J == this.a + 1L) {
            this.a.a -= this.a.d / 100.0F * 10.0F;
            this.a.b -= this.a.d / 100.0F * 14.0F;
            this.a.c -= this.a.d / 100.0F * 4.0F;
            if(this.a.a < 0.0F) {
               this.a.a = 0.0F;
            }

            if(this.a.b < 0.0F) {
               this.a.b = 0.0F;
            }

            if(this.a.c < 0.0F) {
               this.a.c = 0.0F;
            }
         }

         if(this.a < this.a.J) {
            this.a = this.a.J;
         }

         if(this.a.a == 0.0F || this.a.b == 0.0F || this.a.c == 0.0F) {
            this.a.l = 8;
            this.a.aw = true;
            this.a.c = false;
            this.a.y = 0L;
            this.a.r = 0;
            return;
         }
      } else if(this.a.aw) {
         this.a.a = this.a.d;
         this.a.b = this.a.d;
         this.a.c = this.a.d;
      }

   }

   public final void g() {
      int var1 = (int)(this.a.a * 100.0F / this.a.d);
      int var2 = (int)(this.a.b * 100.0F / this.a.d);
      int var3 = (int)(this.a.c * 100.0F / this.a.d);
      int var4 = (int)(this.a.f * 100.0F / this.a.d);
      int var5 = (int)(this.a.e * 100.0F / this.a.d);

      for(int var6 = 0; var6 < 120; ++var6) {
         if(this.a.m[this.a.z] == (byte)var6) {
            int var7;
            if(this.a.c[var6] != -1 && this.a.c[var6] != 0) {
               this.a.a.a(this.a.j[var6]);
               if((var1 += this.a.j[var6]) > 100) {
                  var1 = 100;
               }

               this.a.a = (float)var1 * this.a.d / 100.0F;
               if((var2 += this.a.k[var6]) > 100) {
                  var2 = 100;
               }

               this.a.b = (float)var2 * this.a.d / 100.0F;
               var7 = this.a.m[var6];
               if((var3 += var7) > 100) {
                  var3 = 100;
               }

               if(var3 <= 0) {
                  this.b();
               }

               this.a.c = (float)var3 * this.a.d / 100.0F;
               if(this.a.c[var6] != 0 || this.a.c[var6] != -1) {
                  if(this.a.l[var6] != 0) {
                     if((var4 += this.a.l[var6]) > 100) {
                        var4 = 100;
                     }

                     this.a.f = (float)var4 * this.a.d / 100.0F;
                  }

                  if(this.a.n[var6] != 0) {
                     if((var5 += this.a.n[var6]) > 100) {
                        var5 = 100;
                     }

                     this.a.e = (float)var5 * this.a.d / 100.0F;
                  }

                  if(this.a.m[var6] != 0) {
                     int var8 = this.a.m[var6];
                     if((var3 += var8) > 100) {
                        var3 = 100;
                     }

                     if(var3 <= 0) {
                        this.b();
                     }

                     this.a.c = (float)var3 * this.a.d / 100.0F;
                  }
               }

               this.h();
            } else {
               if(this.a.j[var6] != -1) {
                  this.a.a.a(this.a.j[var6]);
                  if((var1 += this.a.j[var6]) > 100) {
                     var1 = 100;
                  }

                  this.a.a = (float)var1 * this.a.d / 100.0F;
                  this.h();
               }

               if(this.a.k[var6] != -1) {
                  if((var2 += this.a.k[var6]) > 100) {
                     var2 = 100;
                  }

                  this.a.b = (float)var2 * this.a.d / 100.0F;
                  this.h();
               }

               if(this.a.m[var6] != 0) {
                  var7 = this.a.m[var6];
                  if((var3 += var7) > 100) {
                     var3 = 100;
                  }

                  if(var3 <= 0) {
                     this.b();
                  }

                  this.a.c = (float)var3 * this.a.d / 100.0F;
                  this.h();
               }
            }
         }
      }

   }

   public final void h() {
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      boolean var5 = true;
      if(!this.a.ay) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var12;
         if(this.a.q[this.a.z] > 1) {
            var12 = this.a.q[this.a.z];
            --var12;
            this.a.q[this.a.z] = var12;

            for(var6 = 0; var6 <= 120; ++var6) {
               if(this.a.m[this.a.z] == var6) {
                  var2 = var6;
                  break;
               }
            }

            if(this.a.c[var2] == 3) {
               if(this.a.a.a >= 5) {
                  for(var7 = 0; var7 <= this.a.aB; ++var7) {
                     if(this.a.m[var7] == 3) {
                        var3 = var7;
                        break;
                     }
                  }

                  --this.a.q[var3];
                  if(this.a.q[var3] == 0) {
                     for(var8 = 0; var8 <= this.a.aB; ++var8) {
                        this.a[var8] = this.a.m[var8];
                        this.a[var8] = this.a.q[var8];
                     }

                     for(var9 = var3; var9 < this.a.aB - 1; ++var9) {
                        this.a.m[var9] = this.a[var9 + 1];
                        this.a.q[var9] = this.a[var9 + 1];
                     }

                     --this.a.aB;
                     --this.a.z;
                     if(this.a.z < 0) {
                        this.a.z = 0;
                     } else if(this.a.au > 0) {
                        --this.a.au;
                     }
                  }

                  this.a.a.a = 0;
               } else {
                  ++this.a.a.a;
               }
            } else if(this.a.c[var2] != 0 && this.a.c[var2] != -1 && this.a.c[var2] != 3) {
               for(var7 = 0; var7 <= this.a.aB; ++var7) {
                  if(this.a.m[var7] == this.a.c[var2]) {
                     var4 = var7;
                     var5 = false;
                     break;
                  }
               }

               if(!var5) {
                  if(this.a.q[this.a.c[var2]] > 1) {
                     var12 = this.a.q[this.a.c[var2]];
                     --var12;
                     this.a.q[this.a.c[var2]] = var12;
                  } else {
                     for(var8 = 0; var8 <= this.a.aB; ++var8) {
                        this.a[var8] = this.a.m[var8];
                        this.a[var8] = this.a.q[var8];
                     }

                     for(var9 = var4; var9 < this.a.aB - 1; ++var9) {
                        this.a.m[var9] = this.a[var9 + 1];
                        this.a.q[var9] = this.a[var9 + 1];
                     }

                     --this.a.aB;
                     --this.a.z;
                     if(this.a.z < 0) {
                        this.a.z = 0;
                     } else if(this.a.au > 0) {
                        --this.a.au;
                     }
                  }
               }
            }

            this.a.ay = true;
            this.a.n = 0;
            this.a.a.f();
            this.a.a.j();
            this.a.aw = true;
            return;
         }

         for(var6 = 0; var6 <= 120; ++var6) {
            if(this.a.m[this.a.z] == var6) {
               var2 = var6;
               break;
            }
         }

         for(var7 = 0; var7 <= this.a.aB; ++var7) {
            this.a[var7] = this.a.m[var7];
            this.a[var7] = this.a.q[var7];
         }

         for(var8 = this.a.z; var8 < this.a.aB - 1; ++var8) {
            this.a.m[var8] = this.a[var8 + 1];
            this.a.q[var8] = this.a[var8 + 1];
         }

         --this.a.aB;
         --this.a.z;
         if(this.a.z < 0) {
            this.a.z = 0;
         } else if(this.a.au > 0) {
            --this.a.au;
         }

         int var10;
         int var11;
         if(this.a.c[var2] == 3) {
            if(this.a.a.a >= 5) {
               for(var9 = 0; var9 <= this.a.aB; ++var9) {
                  if(this.a.m[var9] == 3) {
                     var3 = var9;
                     break;
                  }
               }

               --this.a.q[var3];
               if(this.a.q[var3] == 0) {
                  for(var10 = 0; var10 <= this.a.aB; ++var10) {
                     this.a[var10] = this.a.m[var10];
                     this.a[var10] = this.a.q[var10];
                  }

                  for(var11 = var3; var11 < this.a.aB - 1; ++var11) {
                     this.a.m[var11] = this.a[var11 + 1];
                     this.a.q[var11] = this.a[var11 + 1];
                  }

                  --this.a.aB;
                  --this.a.z;
                  if(this.a.z < 0) {
                     this.a.z = 0;
                  } else if(this.a.au > 0) {
                     --this.a.au;
                  }
               }

               this.a.a.a = 0;
            } else {
               ++this.a.a.a;
            }
         } else if(this.a.c[var2] != 0 && this.a.c[var2] != -1 && this.a.c[var2] != 3) {
            for(var9 = 0; var9 <= this.a.aB; ++var9) {
               if(this.a.m[var9] == this.a.c[var2]) {
                  var4 = var9;
                  var5 = false;
                  break;
               }
            }

            if(!var5) {
               if(this.a.q[this.a.c[var2]] > 1) {
                  var12 = this.a.q[this.a.c[var2]];
                  --var12;
                  this.a.q[this.a.c[var2]] = var12;
               } else {
                  for(var10 = 0; var10 <= this.a.aB; ++var10) {
                     this.a[var10] = this.a.m[var10];
                     this.a[var10] = this.a.q[var10];
                  }

                  for(var11 = var4; var11 < this.a.aB - 1; ++var11) {
                     this.a.m[var11] = this.a[var11 + 1];
                     this.a.q[var11] = this.a[var11 + 1];
                  }

                  --this.a.aB;
                  --this.a.z;
                  if(this.a.z < 0) {
                     this.a.z = 0;
                  } else if(this.a.au > 0) {
                     --this.a.au;
                  }
               }
            }
         }

         this.a.ay = true;
         this.a.n = 0;
         this.a.a.f();
         this.a.a.j();
      }

   }

   public final void i() {
      if(!this.a.ay) {
         int var1;
         if(this.a.h[this.a.w] > 1) {
            var1 = this.a.h[this.a.w];
            --var1;
            this.a.h[this.a.w] = var1;
            this.a.p = 0;
            this.a.ay = true;
            return;
         }

         for(var1 = 0; var1 <= this.a.aw; ++var1) {
            this.a[var1] = (byte)Integer.parseInt(this.a.a[var1]);
         }

         for(int var2 = this.a.w; var2 < this.a.aw - 1; ++var2) {
            this.a.a[var2] = (new Integer(this.a[var2 + 1])).toString();
         }

         this.a.ay = true;
         this.a.w = 0;
         --this.a.aw;
         this.a.p = 0;
         this.a.a.f();
         this.a.a.j();
      }

   }

   public final void j() {
      int var1 = (int)(this.a.a * 100.0F / this.a.d);
      int var2 = (int)(this.a.b * 100.0F / this.a.d);
      int var3 = (int)(this.a.c * 100.0F / this.a.d);
      int var4 = (int)(this.a.f * 100.0F / this.a.d);
      int var5 = (int)(this.a.e * 100.0F / this.a.d);
      if(this.a.X) {
         this.a = this.a.P + 180;
      } else if(this.a.Y) {
         this.a = this.a.P + 180 + 2;
      } else if(this.a.V) {
         this.a = this.a.P + 1;
      } else if(this.a.W) {
         this.a = this.a.P + 360 + 1;
      }

      for(int var6 = 0; var6 < 120; ++var6) {
         if(this.a.l[this.a] == this.a.i[var6]) {
            if(this.a.j[var6] != -1) {
               if((var1 += this.a.j[var6]) > 100) {
                  var1 = 100;
               }

               this.a.a = (float)var1 * this.a.d / 100.0F;
               this.d = true;
            }

            if(this.a.k[var6] != -1) {
               if((var2 += this.a.k[var6]) > 100) {
                  var2 = 100;
               }

               this.a.b = (float)var2 * this.a.d / 100.0F;
               this.d = true;
            }

            int var7;
            if(this.a.m[var6] != 0) {
               var7 = this.a.m[var6];
               if((var3 += var7) > 100) {
                  var3 = 100;
               }

               if(var3 <= 0) {
                  this.b();
                  return;
               }

               this.a.c = (float)var3 * this.a.d / 100.0F;
               this.d = true;
            }

            if(this.a.c[var6] != 0 || this.a.c[var6] != -1) {
               if(this.a.l[var6] != 0) {
                  if((var4 += this.a.l[var6]) > 100) {
                     var4 = 100;
                  }

                  this.a.f = (float)var4 * this.a.d / 100.0F;
               }

               if(this.a.n[var6] != 0) {
                  if((var5 += this.a.n[var6]) > 100) {
                     var5 = 100;
                  }

                  this.a.e = (float)var5 * this.a.d / 100.0F;
               }

               if(this.a.m[var6] != 0) {
                  var7 = this.a.m[var6];
                  if((var3 += var7) > 100) {
                     var3 = 100;
                  }

                  if(var3 <= 0) {
                     this.b();
                     return;
                  }

                  this.a.c = (float)var3 * this.a.d / 100.0F;
               }
            }

            if(this.d) {
               this.a.a.a(this.a.j[var6]);
               if(this.a.X) {
                  this.a.l[this.a.P + 180] = 0;
               } else if(this.a.Y) {
                  this.a.l[this.a.P + 180 + 2] = 0;
               } else if(this.a.V) {
                  this.a.l[this.a.P + 1] = 0;
               } else if(this.a.W) {
                  this.a.l[this.a.P + 360 + 1] = 0;
               }

               this.a.m = 0;
               this.a.a.f();
               this.d = false;
               this.a.aw = true;
            }
         }
      }

   }

   public final void b(int var1) {
      int var2;
      if((var2 = (int)(this.a.c * 100.0F / this.a.d) + var1) > 100) {
         var2 = 100;
      }

      if(var2 <= 0) {
         this.b();
      }

      this.a.c = (float)var2 * this.a.d / 100.0F;
   }

   public final void k() {
      this.b = true;

      for(int var1 = 0; var1 < this.a.av; ++var1) {
         if(this.a.a[var1] == this.a.ao) {
            this.b = false;
            this.a.z = var1;
            this.a.au = var1 + 1 - this.a.as;
            if(this.a.au < 0) {
               this.a.au = 0;
            }
            break;
         }
      }

      if(this.b) {
         this.a.a[this.a.av] = (byte)this.a.ao;
         this.a.g[this.a.av] = 1;
         ++this.a.av;
         this.a.z = this.a.av - 1;
         this.a.au = this.a.av - this.a.as;
         this.a.v = this.a.av - 1;
         if(this.a.au < 0) {
            this.a.au = 0;
         }
      }

      this.l();
   }

   public final void l() {
      int var1 = (int)(this.a.c * 100.0F / this.a.d);
      int var2 = (int)(this.a.f * 100.0F / this.a.d);
      int var3 = (int)(this.a.e * 100.0F / this.a.d);
      if(this.a.m[this.a.ao] != 0) {
         int var4 = this.a.m[this.a.ao];
         if((var1 += var4) > 100) {
            var1 = 100;
         }

         if(var1 <= 0) {
            this.b();
         }

         this.a.c = (float)var1 * this.a.d / 100.0F;
      }

      if(this.a.l[this.a.ao] != 0) {
         if((var2 += this.a.l[this.a.ao]) > 100) {
            var2 = 100;
         }

         this.a.f = (float)var2 * this.a.d / 100.0F;
      }

      if(this.a.n[this.a.ao] != 0) {
         if((var3 += this.a.n[this.a.ao]) > 100) {
            var3 = 100;
         }

         this.a.e = (float)var3 * this.a.d / 100.0F;
      }

   }

   public final void m() {
      this.b = true;

      for(int var1 = 0; var1 < this.a.aw; ++var1) {
         if(this.a.a[var1].equals(this.a.b[this.a.ao])) {
            this.b = false;
            this.a.z = var1;
            this.a.au = var1 + 1 - this.a.as;
            if(this.a.au < 0) {
               this.a.au = 0;
            }
            break;
         }
      }

      if(this.b) {
         this.a.a[this.a.aw] = this.a.b[this.a.ao];
         this.a.h[this.a.aw] = 1;
         ++this.a.aw;
         this.a.z = this.a.aw - 1;
         this.a.au = this.a.aw - this.a.as;
         this.a.w = this.a.aw - 1;
         if(this.a.au < 0) {
            this.a.au = 0;
         }
      }

      this.l();
   }

   public final void n() {
      this.b = true;

      for(int var1 = 0; var1 < this.a.aB; ++var1) {
         if(this.a.m[var1] == this.a.ao) {
            ++this.a.q[var1];
            this.b = false;
            this.a.z = var1;
            this.a.au = var1 + 1 - this.a.as;
            if(this.a.au < 0) {
               this.a.au = 0;
            }
            break;
         }
      }

      if(this.b) {
         this.a.m[this.a.aB] = (byte)this.a.ao;
         this.a.q[this.a.aB] = 1;
         ++this.a.aB;
         this.a.z = this.a.aB - 1;
         this.a.au = this.a.aB - this.a.as;
         if(this.a.au < 0) {
            this.a.au = 0;
         }
      }

      this.l();
   }

   public final void a(String var1) {
      int var2;
      if(var1.equals("hat")) {
         this.b = true;

         for(var2 = 0; var2 < this.a.H; ++var2) {
            if(this.a.a[var2] == this.a.ao) {
               this.b = false;
            }
         }

         if(this.b) {
            this.a.a[this.a.H] = this.a.ao;
            ++this.a.H;
         }
      } else if(var1.equals("shirt")) {
         this.b = true;

         for(var2 = 0; var2 < this.a.I; ++var2) {
            if(this.a.b[var2] == this.a.ao) {
               this.b = false;
            }
         }

         if(this.b) {
            this.a.b[this.a.I] = this.a.ao;
            ++this.a.I;
         }
      } else if(var1.equals("trousers")) {
         this.b = true;

         for(var2 = 0; var2 < this.a.J; ++var2) {
            if(this.a.c[var2] == this.a.ao) {
               this.b = false;
            }
         }

         if(this.b) {
            this.a.c[this.a.J] = this.a.ao;
            ++this.a.J;
         }
      } else if(var1.equals("shoes")) {
         this.b = true;

         for(var2 = 0; var2 < this.a.K; ++var2) {
            if(this.a.d[var2] == this.a.ao) {
               this.b = false;
            }
         }

         if(this.b) {
            this.a.d[this.a.K] = this.a.ao;
            ++this.a.K;
         }
      }

      this.l();
   }

   public final void o() {
      if(this.a.an == 1) {
         this.a(this.a.a[this.a.ao][0], this.a.a.u);
      } else if(this.a.an == 2) {
         this.a(this.a.a[this.a.ao][0], this.a.a.u);
         this.a(this.a.a[this.a.ao][2], this.a.a.v);
      } else if(this.a.an == 3) {
         this.a(this.a.a[this.a.ao][0], this.a.a.u);
         this.a(this.a.a[this.a.ao][2], this.a.a.v);
         this.a(this.a.a[this.a.ao][4], this.a.a.w);
      } else if(this.a.an == 4) {
         this.a(this.a.a[this.a.ao][0], this.a.a.u);
         this.a(this.a.a[this.a.ao][2], this.a.a.v);
         this.a(this.a.a[this.a.ao][4], this.a.a.w);
         this.a(this.a.a[this.a.ao][6], this.a.a.x);
      } else if(this.a.an == 5) {
         this.a(this.a.a[this.a.ao][0], this.a.a.u);
         this.a(this.a.a[this.a.ao][2], this.a.a.v);
         this.a(this.a.a[this.a.ao][4], this.a.a.w);
         this.a(this.a.a[this.a.ao][6], this.a.a.x);
         this.a(this.a.a[this.a.ao][8], this.a.a.y);
      } else {
         if(this.a.an == 6) {
            this.a(this.a.a[this.a.ao][0], this.a.a.u);
            this.a(this.a.a[this.a.ao][2], this.a.a.v);
            this.a(this.a.a[this.a.ao][4], this.a.a.w);
            this.a(this.a.a[this.a.ao][6], this.a.a.x);
            this.a(this.a.a[this.a.ao][8], this.a.a.y);
            this.a(this.a.a[this.a.ao][10], this.a.a.z);
         }

      }
   }

   private void a(byte var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 <= this.a.aB; ++var4) {
         this.a[var4] = this.a.m[var4];
         this.a[var4] = this.a.q[var4];
      }

      for(int var5 = 0; var5 < this.a.aB; ++var5) {
         if(this.a.m[var5] == var1) {
            var3 = var5;
         }
      }

      int var6;
      if(this.a[var3] > var2) {
         var6 = this.a[var3] - var2;
         this.a.q[var3] = var6;
      } else {
         for(var6 = var3; var6 < this.a.aB - 1; ++var6) {
            this.a.m[var6] = this.a[var6 + 1];
            this.a.q[var6] = this.a[var6 + 1];
         }

         --this.a.aB;
         if(this.a.au > 0) {
            --this.a.au;
         }

         --this.a.z;
      }
   }

   public final void p() {
      if((this.a.J < 0L || this.a.J > 5L) && (this.a.J < 12L || this.a.J > 17L) && (this.a.J < 24L || this.a.J > 29L) && (this.a.J < 36L || this.a.J > 41L) && (this.a.J < 48L || this.a.J > 53L)) {
         if((this.a.J >= 6L && this.a.J <= 11L || this.a.J >= 18L && this.a.J <= 23L || this.a.J >= 30L && this.a.J <= 35L || this.a.J >= 42L && this.a.J <= 47L || this.a.J >= 54L && this.a.J <= 59L) && !this.a.r) {
            this.a.s = true;
            if(!this.e) {
               if(this.a.m == 0) {
                  this.a.aK = true;
               }
            } else {
               this.e = false;
            }

            this.a.r = true;
            this.a.a.a(this.a.r);
            this.r();
            this.x();
            this.a(this.a.a.a, this.a.a.i);
            this.a(this.a.a.b, this.a.a.j);
            this.a(this.a.a.c, this.a.a.k);
            this.a.a.b();
            this.a.g = 0L;
         }
      } else if(this.a.r) {
         this.a.s = true;
         if(!this.e) {
            if(this.a.m == 0) {
               this.a.aK = true;
            }
         } else {
            this.e = false;
         }

         this.a.r = false;
         this.a.a.a(this.a.r);
         this.r();
         this.x();
         this.a(this.a.a.a, this.a.a.i);
         this.a(this.a.a.b, this.a.a.j);
         this.a(this.a.a.c, this.a.a.k);
         this.a.g = 0L;
         return;
      }

   }

   public final void q() {
      if(this.a.ab < 0) {
         this.a.ab = 0;
      }

      if(this.a.ab > 180 - this.a.N) {
         this.a.ab = 180 - this.a.N;
      }

      if(this.a.ac < 0) {
         this.a.ac = 0;
      }

      if(this.a.ac > 180 - this.a.O) {
         this.a.ac = 180 - this.a.O - 1;
      }

   }

   public final void r() {
      if(!this.f && this.a.a.a(this.a.Z, this.a.aa) == 5 || this.a.a.a(this.a.Z, this.a.aa) == 6) {
         boolean var1 = false;
         boolean[][] var2 = new boolean[31][31];

         for(int var3 = 0; var3 < 31; ++var3) {
            for(int var4 = 0; var4 < 31; ++var4) {
               var2[var3][var4] = false;
            }
         }

         boolean var5 = false;
         var2[15][15] = true;
         if(this.a.Z > 169 && this.a.Z < 176 && this.a.aa > 104 && this.a.aa < 113) {
            this.a.ae = 0;
            this.a.aa = 101;
            this.a.ad = 0;
            this.a.Z = 166;
            this.a.ac = this.a.aa - this.a.O / 2;
            this.a.ab = this.a.Z - this.a.N / 2;
            return;
         }

         for(int var6 = 1; var6 < 15; ++var6) {
            for(int var7 = this.a.aa - var6; var7 <= this.a.aa + var6; ++var7) {
               if(var7 > -1 && var7 < 180) {
                  for(int var8 = this.a.Z - var6; var8 <= this.a.Z + var6; ++var8) {
                     if(var8 > -1 && var8 < 180 && !var2[15 + (var8 - this.a.Z)][15 + (var7 - this.a.aa)]) {
                        if(this.a.a.b(var8, var7) == 0 && this.a.a.c(var8, var7) == 0 && this.a.a.d(var8, var7) == 0 && this.a.a.a(var8, var7) == 4) {
                           if((var7 == this.a.aa - var6 || var7 == this.a.aa + var6) && var8 < this.a.Z && this.a.a.b(this.a.Z, var7) == 0 && this.a.a.c(this.a.Z, var7) == 0 && this.a.a.d(this.a.Z, var7) == 0 && this.a.a.a(this.a.Z, var7) == 4) {
                              this.a.ae = 0;
                              this.a.aa = var7;
                              this.a.ad = 0;
                              this.a.Z = this.a.Z;
                              if(this.a.aa > this.a.O / 2 && this.a.aa < 180 - this.a.O / 2) {
                                 this.a.ac = this.a.aa - this.a.O / 2;
                              }

                              if(this.a.Z > this.a.N / 2 && this.a.Z < 180 - this.a.N / 2) {
                                 this.a.ab = this.a.Z - this.a.N / 2;
                              }

                              return;
                           }

                           if((var8 == this.a.Z - var6 || var8 == this.a.Z + var6) && var7 < this.a.aa && this.a.a.b(var8, this.a.aa) == 0 && this.a.a.c(var8, this.a.aa) == 0 && this.a.a.d(var8, this.a.aa) == 0 && this.a.a.a(var8, this.a.aa) == 4) {
                              this.a.ae = 0;
                              this.a.aa = this.a.aa;
                              this.a.ad = 0;
                              this.a.Z = var8;
                              if(this.a.aa > this.a.O / 2 && this.a.aa < 180 - this.a.O / 2) {
                                 this.a.ac = this.a.aa - this.a.O / 2;
                              }

                              if(this.a.Z > this.a.N / 2 && this.a.Z < 180 - this.a.N / 2) {
                                 this.a.ab = this.a.Z - this.a.N / 2;
                              }

                              return;
                           }

                           this.a.ae = 0;
                           this.a.aa = var7;
                           this.a.ad = 0;
                           this.a.Z = var8;
                           if(this.a.aa > this.a.O / 2 && this.a.aa < 180 - this.a.O / 2) {
                              this.a.ac = this.a.aa - this.a.O / 2;
                           }

                           if(this.a.Z > this.a.N / 2 && this.a.Z < 180 - this.a.N / 2) {
                              this.a.ab = this.a.Z - this.a.N / 2;
                           }

                           return;
                        }

                        var2[15 + (var8 - this.a.Z)][15 + (var7 - this.a.aa)] = true;
                     }
                  }
               }
            }
         }
      }

      this.f = false;
   }

   private void a(l[] var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         if(this.a.k[var1[var3].d * 180 + var1[var3].c] > 4 && this.a.k[var1[var3].d * 180 + var1[var3].c] < 7) {
            this.a.l[var1[var3].d * 180 + var1[var3].c] = 0;
            var1[var3].c = var1[var3].a;
            var1[var3].d = var1[var3].b;
         }
      }

   }

   private void x() {
      for(int var1 = 0; var1 < this.a.a.r; ++var1) {
         boolean var2 = false;
         if(this.a.k[this.a.a.a[var1].b * 180 + this.a.a.a[var1].a] < 5) {
            this.a.l[this.a.a.a[var1].b * 180 + this.a.a.a[var1].a] = 0;
            int var3 = 0;

            while(var3 < 10 && !var2) {
               int var4 = 0;

               while(true) {
                  if(var4 < 10) {
                     if(this.a.a.a[var1].a - var3 > 0 && this.a.a.a[var1].a - var3 < 180 && this.a.a.a[var1].b - var4 > 0 && this.a.a.a[var1].b - var4 < 180 && this.a.k[(this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3)] > 4 && this.a.k[(this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3)] < 7 && this.a.a.e((this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3), 1) && this.a.a.d((this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3), 1) && this.a.a.c((this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3), 1)) {
                        this.a.l[(this.a.a.a[var1].b - var4) * 180 + (this.a.a.a[var1].a - var3)] = 56;
                        this.a.a.a[var1].a -= var3;
                        this.a.a.a[var1].b -= var4;
                        var2 = true;
                     }

                     if(!var2) {
                        if(this.a.a.a[var1].a + var3 > 0 && this.a.a.a[var1].a + var3 < 180 && this.a.a.a[var1].b + var4 > 0 && this.a.a.a[var1].b + var4 < 180 && this.a.k[(this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3] > 4 && this.a.k[(this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3] < 7 && this.a.a.e((this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3, 1) && this.a.a.d((this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3, 1) && this.a.a.c((this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3, 1)) {
                           this.a.l[(this.a.a.a[var1].b + var4) * 180 + this.a.a.a[var1].a + var3] = 56;
                           this.a.a.a[var1].a += var3;
                           this.a.a.a[var1].b += var4;
                           var2 = true;
                        }

                        if(!var2) {
                           ++var4;
                           continue;
                        }
                     }
                  }

                  ++var3;
                  break;
               }
            }
         }
      }

   }

   public final void s() {
      if(this.a.K == 4L && !this.c) {
         this.w();
         this.a.a.a("BIGislandObjects", this.a.l);
         this.a.a.b();
         this.a.a.d();
         this.c = true;
      }

      if(this.a.K != 4L) {
         this.c = false;
      }

   }

   public final void t() {
      this.a.a.a("BIGislandObjects", this.a.l);
      this.a.a.d();
      this.a.a.b();
   }

   public final void u() {
      if(this.a.X) {
         this.a.a.a(4);
         this.a.l[this.a.P + 180] = 0;
      } else if(this.a.Y) {
         this.a.a.b(4);
         this.a.l[this.a.P + 180 + 2] = 0;
      } else if(this.a.V) {
         this.a.a.c(4);
         this.a.l[this.a.P + 1] = 0;
      } else if(this.a.W) {
         this.a.a.d(4);
         this.a.l[this.a.P + 360 + 1] = 0;
      }

      if(this.a.f[94] == 393224) {
         this.a.X = true;
         this.a.Y = false;
      } else {
         this.a.X = false;
         this.a.Y = true;
      }

      this.a.T = true;
   }

   public final void v() {
      this.a.T = false;
      if(this.a.X) {
         this.a.f[94] = 393224;
      } else {
         this.a.f[94] = 393225;
      }

      if(this.a.Z) {
         this.a.l[this.a.P + 180 + 1] = 95;
         this.a.a.a(4);
         this.a.b = (long)(this.a.P + 180 + 1);
      } else if(this.a.aa) {
         this.a.l[this.a.P + 180 + 1] = 95;
         this.a.a.b(4);
         this.a.b = (long)(this.a.P + 180 + 1);
      } else if(this.a.ab) {
         this.a.l[this.a.P + 180 + 1] = 95;
         this.a.a.c(4);
         this.a.b = (long)(this.a.P + 180 + 1);
      } else {
         if(this.a.ac) {
            this.a.l[this.a.P + 180 + 1] = 95;
            this.a.a.d(4);
            this.a.b = (long)(this.a.P + 180 + 1);
         }

      }
   }
}
