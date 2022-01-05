package data;

import data.ac;
import data.k;
import data.p;

public final class r {

   private p a;


   public r(p var1) {
      this.a = var1;
   }

   public final void a(StringBuffer var1) {
      int var2;
      if(this.a.hasPointerEvents()) {
         var2 = 52 + this.a.aI * this.a.as;
      } else {
         var2 = 40 + this.a.aI * this.a.as;
      }

      if(this.a.aw) {
         this.a.aA = 0;
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

         for(var4 = 0; var4 < 120; ++var4) {
            if(this.a.aB) {
               if(this.a.e[this.a.y] == this.a.b[var4]) {
                  this.a.ao = var4;
               }
            } else if(this.a.aC) {
               if(var4 == 19) {
                  this.a.ao = var4;
               }
            } else if(this.a.aD) {
               if(var4 == 94) {
                  this.a.ao = var4;
               }
            } else if(this.a.d[this.a.y] == this.a.b[var4]) {
               this.a.ao = var4;
            }
         }

         this.a.a.n = 0;
         this.a.a.o = 0;
         this.a.a.p = 0;
         this.a.a.q = 0;
         this.a.a.r = 0;
         this.a.a.s = 0;
         this.a.am = 0;
         this.a.ak = 0;
         int var5;
         int var6;
         if(this.a.a[this.a.ao][0] != 0) {
            this.a.G = false;
            this.a.ak = 1;
            this.a.an = 1;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][0]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][1] == this.a.n[var6]) {
                        this.a.a.u = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.u) {
                     this.a.G = true;
                  }

                  this.a.a.n = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.a.a(108).toString();
            ++this.a.aA;
            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][0]] + ".." + this.a.a[this.a.ao][1] + " (" + this.a.a.n + ")";
            ++this.a.aA;
         }

         if(this.a.a[this.a.ao][2] != 0) {
            this.a.H = false;
            this.a.ak = 2;
            this.a.an = 2;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][2]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][3] == this.a.n[var6]) {
                        this.a.a.v = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.v) {
                     this.a.H = true;
                  }

                  this.a.a.o = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][2]] + ".." + this.a.a[this.a.ao][3] + " (" + this.a.a.o + ")";
            ++this.a.aA;
         }

         if(this.a.a[this.a.ao][4] != 0) {
            this.a.I = false;
            this.a.ak = 3;
            this.a.an = 3;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][4]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][5] == this.a.n[var6]) {
                        this.a.a.w = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.w) {
                     this.a.I = true;
                  }

                  this.a.a.p = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][4]] + ".." + this.a.a[this.a.ao][5] + " (" + this.a.a.p + ")";
            ++this.a.aA;
         }

         if(this.a.a[this.a.ao][6] != 0) {
            this.a.J = false;
            this.a.ak = 4;
            this.a.an = 4;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][6]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][7] == this.a.n[var6]) {
                        this.a.a.x = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.x) {
                     this.a.J = true;
                  }

                  this.a.a.q = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][6]] + ".." + this.a.a[this.a.ao][7] + " (" + this.a.a.q + ")";
            ++this.a.aA;
         }

         if(this.a.a[this.a.ao][8] != 0) {
            this.a.K = false;
            this.a.ak = 5;
            this.a.an = 5;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][8]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][9] == this.a.n[var6]) {
                        this.a.a.y = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.y) {
                     this.a.K = true;
                  }

                  this.a.a.r = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][8]] + ".." + this.a.a[this.a.ao][9] + " (" + this.a.a.r + ")";
            ++this.a.aA;
         }

         if(this.a.a[this.a.ao][10] != 0) {
            this.a.L = false;
            this.a.ak = 6;
            this.a.an = 6;

            for(var5 = 0; var5 < this.a.aB; ++var5) {
               if(this.a.m[var5] == this.a.a[this.a.ao][10]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.a[this.a.ao][11] == this.a.n[var6]) {
                        this.a.a.z = var6;
                     }
                  }

                  if(this.a.q[var5] >= this.a.a.z) {
                     this.a.L = true;
                  }

                  this.a.a.s = this.a.q[var5];
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.a[this.a.ao][10]] + ".." + this.a.a[this.a.ao][11] + " (" + this.a.a.s + ")";
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][0] != 0 && this.a.b[this.a.ao][0] != -1) {
            this.a.M = false;
            this.a.am = 1;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][0]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][1] == this.a.n[var6]) {
                        this.a.a.A = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.A) {
                     this.a.M = true;
                  }
               }
            }

            this.a.g[this.a.aA] = "";
            ++this.a.aA;
            this.a.g[this.a.aA] = this.a.a.a(109).toString();
            ++this.a.aA;
            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][0]];
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][2] != 0) {
            this.a.N = false;
            this.a.am = 2;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][2]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][3] == this.a.n[var6]) {
                        this.a.a.B = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.B) {
                     this.a.N = true;
                  }
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][2]];
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][4] != 0) {
            this.a.O = false;
            this.a.am = 3;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][4]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][5] == this.a.n[var6]) {
                        this.a.a.C = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.C) {
                     this.a.O = true;
                  }
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][4]];
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][6] != 0) {
            this.a.P = false;
            this.a.am = 4;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][6]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][7] == this.a.n[var6]) {
                        this.a.a.D = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.D) {
                     this.a.P = true;
                  }
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][6]];
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][8] != 0) {
            this.a.Q = false;
            this.a.am = 5;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][8]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][9] == this.a.n[var6]) {
                        this.a.a.E = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.E) {
                     this.a.Q = true;
                  }
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][8]];
            ++this.a.aA;
         }

         if(this.a.b[this.a.ao][10] != 0) {
            this.a.R = false;
            this.a.am = 6;

            for(var5 = 0; var5 < this.a.av; ++var5) {
               if(this.a.a[var5] == this.a.b[this.a.ao][10]) {
                  for(var6 = 1; var6 < this.a.n.length; ++var6) {
                     if(this.a.b[this.a.ao][11] == this.a.n[var6]) {
                        this.a.a.F = var6;
                     }
                  }

                  if(this.a.g[var5] >= this.a.a.F) {
                     this.a.R = true;
                  }
               }
            }

            this.a.g[this.a.aA] = this.a.b[this.a.b[this.a.ao][10]];
            ++this.a.aA;
         }

         this.a.at = this.a.aA;
         if(this.a.at > this.a.as) {
            this.a.at = this.a.as;
         }

         for(var5 = 0; var5 < this.a.at; ++var5) {
            this.b(var5 + this.a.B);
            StringBuffer var7 = (new StringBuffer()).append(this.a.g[var5 + this.a.B]);
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, var7, k.a() >> 1, 52 + this.a.aI * var5 + this.a.aI / 2 + 4, this.a.a.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            } else {
               this.a.a.a(this.a.a, var7, k.a() >> 1, 40 + this.a.aI * var5 + this.a.aI / 2 + 4, this.a.a.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }
         }
      }

      if(!this.a.ae) {
         if(this.a.hasPointerEvents()) {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, 40);
            } else if(this.a.B > 0) {
               this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, 40);
            } else {
               this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var2);
            } else if(this.a.B < this.a.aA - this.a.as) {
               this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var2);
            } else {
               this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
            }
         } else {
            if(this.a.h) {
               this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, 32);
            } else if(this.a.B > 0) {
               this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, 32);
            } else {
               this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
            }

            if(this.a.i) {
               this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var2);
            } else if(this.a.B < this.a.aA - this.a.as) {
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

   }

   private void b(int var1) {
      if(this.a.ak == 1 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.N) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.O) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.P) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 13) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2 || var1 == 3) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 4) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3 || var1 == 4) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 5) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4 || var1 == 5) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 6) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5 || var1 == 6) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 7) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 8) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6 || var1 == 7) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 8) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 9) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 13) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6 && this.a.am == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 7 || var1 == 8) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 9) {
            if(this.a.M) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 10) {
            if(this.a.N) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 11) {
            if(this.a.O) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 12) {
            if(this.a.P) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 13) {
            if(this.a.Q) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 14) {
            if(this.a.R) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 1) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 2) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 3) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 4) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 5) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
            return;
         }
      } else if(this.a.ak == 6) {
         if(var1 == 0) {
            this.a.a.k = '\u99ff';
         }

         if(var1 == 1) {
            if(this.a.G) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 2) {
            if(this.a.H) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 3) {
            if(this.a.I) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 4) {
            if(this.a.J) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 5) {
            if(this.a.K) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = 9737364;
            }
         }

         if(var1 == 6) {
            if(this.a.L) {
               this.a.a.k = 16777215;
               return;
            }

            this.a.a.k = 9737364;
         }
      }

   }

   public final void a() {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.d = (new StringBuffer()).append(this.a.b[this.a.ao] + this.a.a.a(76));
         this.a.a.a(this.a.a, this.a.a.d, k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.b();
      }

   }

   public final void b() {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.a(this.a.a, this.a.a.a(81), k.a() >> 1, (k.b() >> 1) - 10, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

   }

   public final void c() {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         this.a.a.a(this.a.a, this.a.a.a(82), k.a() >> 1, (k.b() >> 1) - 10, 16777215, 65, 0, 1, 8, this.a.aJ, k.a() / 3 * 2, k.b(), 0, 0);
      }

   }

   public final void b(StringBuffer var1) {
      int var2;
      if(this.a.hasPointerEvents()) {
         var2 = 52 + 16 * this.a.as;
      } else {
         var2 = 40 + 16 * this.a.as;
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
               this.a.a.fillRect(0, 52 + var3 * 16, k.a(), 16);
            } else {
               this.a.a.fillRect(0, 40 + var3 * 16, k.a(), 16);
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

         this.a.at = 0;
         this.a.at = this.a.aw;
         if(this.a.at > this.a.as) {
            this.a.at = this.a.as;
         }

         for(var4 = 0; var4 < this.a.at; ++var4) {
            if(var4 == this.a.w) {
               this.a.a.k = 16777215;
            } else {
               this.a.a.k = '\u99ff';
            }

            StringBuffer var5 = (new StringBuffer()).append(this.a.a[var4] + ".." + this.a.h[var4]);
            if(this.a.hasPointerEvents()) {
               this.a.a.a(this.a.a, var5, k.a() >> 1, 52 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.a.a.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            } else {
               this.a.a.a(this.a.a, var5, k.a() >> 1, 40 + this.a.aI * (var4 - this.a.au) + this.a.aI / 2 + 4, this.a.a.k, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            }
         }
      }

      if(this.a.hasPointerEvents()) {
         if(this.a.h) {
            this.a.a.a(this.a.a, 655419, (k.a() >> 1) - 12, 40);
         } else if(this.a.au > this.a.as) {
            this.a.a.a(this.a.a, 655417, (k.a() >> 1) - 12, 40);
         } else {
            this.a.a.a(this.a.a, 655421, (k.a() >> 1) - 12, 40);
         }

         if(this.a.i) {
            this.a.a.a(this.a.a, 655420, (k.a() >> 1) - 12, var2);
         } else if(this.a.at > this.a.as && this.a.au != this.a.at - 1) {
            this.a.a.a(this.a.a, 655418, (k.a() >> 1) - 12, var2);
         } else {
            this.a.a.a(this.a.a, 655422, (k.a() >> 1) - 12, var2);
         }
      } else {
         if(this.a.h) {
            this.a.a.a(this.a.a, 655407, (k.a() >> 1) - 8, 32);
         } else if(this.a.au > this.a.as) {
            this.a.a.a(this.a.a, 655405, (k.a() >> 1) - 8, 32);
         } else {
            this.a.a.a(this.a.a, 655409, (k.a() >> 1) - 8, 32);
         }

         if(this.a.i) {
            this.a.a.a(this.a.a, 655408, (k.a() >> 1) - 8, var2);
         } else if(this.a.at > this.a.as && this.a.au != this.a.at - 1) {
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

   public final void d() {
      this.a.a.setColor(13158);
      this.a.a.fillRect((k.a() >> 1) - this.a.a.a(79).length() * this.a.a.l / 2, (k.b() >> 1) - 10, this.a.a.a(79).length() * this.a.a.l, 20);
      this.a.a.a(this.a.a, this.a.a.a(79), k.a() >> 1, (k.b() >> 1) + 4, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }

   public final void c(StringBuffer var1) {
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

         String var3 = this.a.a.a(99).toString() + "\\n" + this.a.a.a(100).toString();
         this.a.a.a(this.a.a, new StringBuffer(var3), k.a() >> 1, k.b() >> 1, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
         this.a.a.b();
      }

   }

   public final void e() {
      this.a.a.b = (new StringBuffer()).append("X:" + this.a.Z);
      this.a.a.c = (new StringBuffer()).append("Y:" + this.a.aa);
      this.a.a.a(this.a.a, this.a.a.b, 10, 20, 16777215, 20, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      this.a.a.a(this.a.a, this.a.a.c, 10, 30, 16777215, 20, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
   }

   public final void f() {
      int var1 = 0;
      int var2 = 0;
      this.a.a.setColor(0);

      for(int var3 = this.a.ac - 1; var3 <= this.a.ac + this.a.O + 2; ++var3) {
         for(int var4 = this.a.ab - 1; var4 <= this.a.ab + this.a.N + 2; ++var4) {
            if(var3 >= 0 && var4 >= 0) {
               this.a.a.drawLine(this.a.aM + 0, this.a.aN + this.a.M * var2 - this.a.M + this.a.V, this.a.aM + k.a(), this.a.aN + this.a.M * var2 - this.a.M + this.a.V);
               this.a.a.drawLine(this.a.aM + this.a.M * var1 - this.a.M + this.a.U, this.a.aN, this.a.aM + this.a.M * var1 - this.a.M + this.a.U, this.a.aN + k.b());
            }

            ++var1;
         }

         var1 = 0;
         ++var2;
      }

   }

   public final void g() {
      int var1 = 0;
      int var2 = 0;
      this.a.a.setColor(0);

      for(int var3 = this.a.Z - 1 - this.a.ab + 1 + this.a.N / 2; var3 <= this.a.Z - 1 - this.a.ab + 2 + this.a.N / 2; ++var3) {
         for(int var4 = this.a.aa - 1 - this.a.ac + 1 + this.a.N / 2; var4 <= this.a.aa - 1 - this.a.ac + 2 + this.a.N / 2; ++var4) {
            this.a.a.drawLine(this.a.aM + 0 + (this.a.N / 2 - 1) * this.a.M + this.a.U, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + (this.a.N / 2 + 2) * this.a.M, this.a.aM + k.a() - (this.a.N / 2 - 1) * this.a.M + this.a.U, this.a.aN + this.a.M * var2 - this.a.M + this.a.V + (this.a.N / 2 + 2) * this.a.M);
            this.a.a.drawLine(this.a.aM + this.a.M * var1 - this.a.M + this.a.U + (this.a.N / 2 + 1) * this.a.M, this.a.aN + this.a.N / 2 * this.a.M + this.a.V, this.a.aM + this.a.M * var1 - this.a.M + this.a.U + (this.a.N / 2 + 1) * this.a.M, this.a.aN + k.b() + 3 - this.a.N / 2 * this.a.M + this.a.V);
            ++var1;
         }

         var1 = 0;
         ++var2;
      }

   }

   public final void d(StringBuffer var1) {
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

         var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;

         for(int var6 = 0; var6 < 32400; ++var6) {
            if(this.a.k[var6] == 0) {
               this.a.a.G = 13421721;
            } else if(this.a.k[var6] == 1) {
               this.a.a.G = 6723891;
            } else if(this.a.k[var6] == 2) {
               this.a.a.G = 13395558;
            } else if(this.a.k[var6] == 3) {
               this.a.a.G = 6710835;
            } else if(this.a.k[var6] == 4) {
               this.a.a.G = 6750156;
            } else if(this.a.k[var6] == 5) {
               this.a.a.G = 3407871;
            } else if(this.a.k[var6] == 6) {
               this.a.a.G = '\u99cc';
            } else if(this.a.k[var6] == 7) {
               this.a.a.G = 3355443;
            } else if(this.a.k[var6] == 8) {
               this.a.a.G = 13408563;
            } else if(this.a.k[var6] == 9) {
               this.a.a.G = 13056;
            } else if(this.a.k[var6] == 10) {
               this.a.a.G = 10053171;
            } else if(this.a.k[var6] == 11) {
               this.a.a.G = 6697779;
            } else if(this.a.k[var6] == 12) {
               this.a.a.G = 3355392;
            } else if(this.a.k[var6] == 13) {
               this.a.a.G = 13107;
            } else if(this.a.k[var6] == 14) {
               this.a.a.G = 3368499;
            } else if(this.a.k[var6] == 15) {
               this.a.a.G = 3342387;
            }

            if(var6 == 180 * var3) {
               var2 = 0;
               var4 = 0;
               ++var3;
               ++var5;
            }

            if(var2 >= 0 + this.a.Q && var2 < 60 + this.a.Q && var3 >= 0 + this.a.R && var3 < 60 + this.a.R) {
               this.a.a.setColor(this.a.a.G);
               this.a.a.drawLine(k.a() / 2 - 30 + var4, 48 + var5 - this.a.R - this.a.a.e, k.a() / 2 - 30 + var4, 48 + var5 - this.a.R - this.a.a.e);
               ++var4;
            }

            ++var2;
         }

         this.a.a.a(this.a.a, 655423, k.a() / 2 - 16 - 1, 140 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655424, k.a() / 2, 140 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655425, k.a() / 2 + 16 + 1, 140 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655426, k.a() / 2 - 16 - 1, 157 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655427, k.a() / 2, 157 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655428, k.a() / 2 + 16 + 1, 157 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655429, k.a() / 2 - 16 - 1, 174 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655430, k.a() / 2, 174 - this.a.a.f - this.a.a.e);
         this.a.a.a(this.a.a, 655431, k.a() / 2 + 16 + 1, 174 - this.a.a.f - this.a.a.e);
         if(this.a.Q == 0 && this.a.R == 0) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 - 16 - 1, 140 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 60 && this.a.R == 0) {
            this.a.a.a(this.a.a, 655432, k.a() / 2, 140 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 120 && this.a.R == 0) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 + 16 + 1, 140 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 0 && this.a.R == 60) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 - 16 - 1, 157 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 60 && this.a.R == 60) {
            this.a.a.a(this.a.a, 655432, k.a() / 2, 157 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 120 && this.a.R == 60) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 + 16 + 1, 157 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 0 && this.a.R == 120) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 - 16 - 1, 174 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 60 && this.a.R == 120) {
            this.a.a.a(this.a.a, 655432, k.a() / 2, 174 - this.a.a.f - this.a.a.e);
         }

         if(this.a.Q == 120 && this.a.R == 120) {
            this.a.a.a(this.a.a, 655432, k.a() / 2 + 16 + 1, 174 - this.a.a.f - this.a.a.e);
         }
      }

      if(this.a.w > 300L) {
         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.a.I = 1;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.a.I = 2;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.a.I = 3;
         }

         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.a.I = 4;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.a.I = 5;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.a.I = 6;
         }

         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.a.I = 7;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.a.I = 8;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.a.I = 9;
         }

         this.a.a.a(this.a.a, 655389, this.a.W, this.a.X);
      } else {
         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.Y = 655423;
            this.a.a.I = 1;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.Y = 655424;
            this.a.a.I = 2;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 0 && this.a.aa < 60) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 140 - this.a.a.f - this.a.a.e;
            this.a.Y = 655425;
            this.a.a.I = 3;
         }

         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.Y = 655426;
            this.a.a.I = 4;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.Y = 655427;
            this.a.a.I = 5;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 60 && this.a.aa < 120) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 157 - this.a.a.f - this.a.a.e;
            this.a.Y = 655428;
            this.a.a.I = 6;
         }

         if(this.a.Z >= 0 && this.a.Z < 60 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2 - 16 - 1;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.Y = 655429;
            this.a.a.I = 7;
         }

         if(this.a.Z >= 60 && this.a.Z < 120 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.Y = 655430;
            this.a.a.I = 8;
         }

         if(this.a.Z >= 120 && this.a.Z < 180 && this.a.aa >= 120 && this.a.aa < 180) {
            this.a.W = k.a() / 2 + 16 + 1;
            this.a.X = 174 - this.a.a.f - this.a.a.e;
            this.a.Y = 655431;
            this.a.a.I = 9;
         }

         this.a.a.a(this.a.a, this.a.Y, this.a.W, this.a.X);
      }

      if(this.a.aE) {
         this.a.aO = this.a.a.I;
         this.a.aE = false;
      }

      if(this.a.a.I == this.a.aO) {
         if(this.a.w > 300L) {
            this.a.a.setColor(16776960);
            this.a.a.drawLine(k.a() / 2 - 30 + this.a.Z - this.a.Q, 48 + this.a.aa - this.a.R - this.a.a.e, k.a() / 2 - 30 + this.a.Z - this.a.Q + 1, 48 + this.a.aa - this.a.R - this.a.a.e);
            this.a.a.drawLine(k.a() / 2 - 30 + this.a.Z - this.a.Q, 48 + this.a.aa - this.a.R + 1 - this.a.a.e, k.a() / 2 - 30 + this.a.Z - this.a.Q + 1, 48 + this.a.aa - this.a.R + 1 - this.a.a.e);
         } else {
            this.a.a.setColor(0);
            this.a.a.drawLine(k.a() / 2 - 30 + this.a.Z - this.a.Q, 48 + this.a.aa - this.a.R - this.a.a.e, k.a() / 2 - 30 + this.a.Z - this.a.Q + 1, 48 + this.a.aa - this.a.R - this.a.a.e);
            this.a.a.drawLine(k.a() / 2 - 30 + this.a.Z - this.a.Q, 48 + this.a.aa - this.a.R + 1 - this.a.a.e, k.a() / 2 - 30 + this.a.Z - this.a.Q + 1, 48 + this.a.aa - this.a.R + 1 - this.a.a.e);
         }
      }

      if(this.a.w > 600L) {
         this.a.w = 0L;
      }

      if(!this.a.hasPointerEvents()) {
         this.a.a.a(this.a.a, 655403, k.a() / 2 - 30 - 8 - 8 + this.a.a.g, 70 - this.a.a.e);
         this.a.a.a(this.a.a, 655404, k.a() / 2 + 30 + 8 - this.a.a.g, 70 - this.a.a.e);
         this.a.a.a(this.a.a, 655409, k.a() / 2 - 8, 32 + this.a.a.h - this.a.a.e);
         this.a.a.a(this.a.a, 655410, k.a() / 2 - 8, 116 - this.a.a.h - this.a.a.e);
         if(this.a.S) {
            if(this.a.Q > 0) {
               if(this.a.aG) {
                  this.a.a.a(this.a.a, 655401, k.a() / 2 - 30 - 8 - 8 + this.a.a.g, 70 - this.a.a.e);
               } else {
                  this.a.a.a(this.a.a, 655399, k.a() / 2 - 30 - 8 - 8 + this.a.a.g, 70 - this.a.a.e);
               }
            }

            if(this.a.Q < 120) {
               if(this.a.aH) {
                  this.a.a.a(this.a.a, 655402, k.a() / 2 + 30 + 8 - this.a.a.g, 70 - this.a.a.e);
               } else {
                  this.a.a.a(this.a.a, 655400, k.a() / 2 + 30 + 8 - this.a.a.g, 70 - this.a.a.e);
               }
            }

            if(this.a.R > 0) {
               if(this.a.aI) {
                  this.a.a.a(this.a.a, 655407, k.a() / 2 - 8, 32 + this.a.a.h - this.a.a.e);
               } else {
                  this.a.a.a(this.a.a, 655405, k.a() / 2 - 8, 32 + this.a.a.h - this.a.a.e);
               }
            }

            if(this.a.R < 120) {
               if(this.a.aJ) {
                  this.a.a.a(this.a.a, 655408, k.a() / 2 - 8, 116 - this.a.a.h - this.a.a.e);
               } else {
                  this.a.a.a(this.a.a, 655406, k.a() / 2 - 8, 116 - this.a.a.h - this.a.a.e);
               }
            }

            if(this.a.o > 1000L) {
               if(this.a.aG) {
                  this.a.aG = false;
               }

               if(this.a.aH) {
                  this.a.aH = false;
               }

               if(this.a.aI) {
                  this.a.aI = false;
               }

               if(this.a.aJ) {
                  this.a.aJ = false;
               }
            }
         }
      }

      this.a.a.i();
   }

   public final void e(StringBuffer var1) {
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

         if((this.a.J < 0L || this.a.J > 5L) && (this.a.J < 12L || this.a.J > 17L) && (this.a.J < 24L || this.a.J > 29L) && (this.a.J < 36L || this.a.J > 41L) && (this.a.J < 48L || this.a.J > 53L)) {
            if(this.a.J >= 6L && this.a.J <= 11L || this.a.J >= 18L && this.a.J <= 23L || this.a.J >= 30L && this.a.J <= 35L || this.a.J >= 42L && this.a.J <= 47L || this.a.J >= 54L && this.a.J <= 59L) {
               this.a.a.a = this.a.a.a(107).toString();
               if(this.a.J >= 6L && this.a.J <= 11L) {
                  this.a.a.H = 12 - (int)this.a.J;
               } else if(this.a.J >= 18L && this.a.J <= 23L) {
                  this.a.a.H = 24 - (int)this.a.J;
               } else if(this.a.J >= 30L && this.a.J <= 35L) {
                  this.a.a.H = 36 - (int)this.a.J;
               } else if(this.a.J >= 42L && this.a.J <= 47L) {
                  this.a.a.H = 48 - (int)this.a.J;
               } else if(this.a.J >= 54L && this.a.J <= 59L) {
                  this.a.a.H = 60 - (int)this.a.J;
               }
            }
         } else {
            this.a.a.a = this.a.a.a(106).toString();
            if(this.a.J >= 0L && this.a.J <= 5L) {
               this.a.a.H = 6 - (int)this.a.J;
            } else if(this.a.J >= 12L && this.a.J <= 17L) {
               this.a.a.H = 18 - (int)this.a.J;
            } else if(this.a.J >= 24L && this.a.J <= 29L) {
               this.a.a.H = 30 - (int)this.a.J;
            } else if(this.a.J >= 36L && this.a.J <= 41L) {
               this.a.a.H = 42 - (int)this.a.J;
            } else if(this.a.J >= 48L && this.a.J <= 53L) {
               this.a.a.H = 54 - (int)this.a.J;
            }
         }

         String var3 = this.a.a.a(101).toString() + " " + this.a.a.a + "\\n" + this.a.a.a(102).toString() + " " + this.a.a.H + " " + this.a.a.a(103).toString() + "\\n" + this.a.a.a(104).toString() + " " + this.a.aG + "\\n" + this.a.a.a(105).toString() + " " + this.a.a;
         this.a.a.a(this.a.a, new StringBuffer(var3), k.a() >> 1, (k.b() >> 1) - 20, '\u99ff', 65, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }

      this.a.a.i();
   }

   public final void h() {
      if(this.a.l) {
         this.a.a.a = this.a.c;
         if(this.a.v == null) {
            this.a.a.j = 21;
            this.a.a.i = k.b() - 37 - 20;
         } else if(this.a.b == null) {
            this.a.a.j = 52;
            this.a.a.i = k.b() - 68 - 20;
         } else {
            this.a.a.j = 72;
            this.a.a.i = k.b() - 88 - 20;
         }

         this.a(this.a.a.a, k.a() >> 1, this.a.a.j + 16, k.a(), this.a.a.i);
         this.a.l = false;
      }

      if(this.a.n) {
         this.a.n = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         int var1;
         if(this.a.v != null) {
            for(var1 = 0; var1 < this.a.v.length; ++var1) {
               this.a.a.a(this.a.a, this.a.u[1], k.a() / 2 - ((this.a.v.length - 1) * 10 + (this.a.v.length - 1) * 3) + var1 * 26, 32);
               if(this.a.v[var1] == this.a.aH) {
                  this.a.a.a(this.a.a, this.a.u[0], k.a() / 2 - ((this.a.v.length - 1) * 10 + (this.a.v.length - 1) * 3) + var1 * 26, 32);
               }

               this.a.a.a(this.a.a, this.a.u[this.a.v[var1]], k.a() / 2 - ((this.a.v.length - 1) * 10 + (this.a.v.length - 1) * 3) + var1 * 26, 32);
            }
         }

         if(this.a.b != null) {
            this.a.a.a(this.a.a, 655360, 0, 52);

            for(var1 = 1; var1 < this.a.aV + 1; ++var1) {
               this.a.a.a(this.a.a, 655361, 2 * var1, 52);
            }

            this.a.a.a(this.a.a, 655362, k.a() - 2, 52);
            this.a.a.a(this.a.a, this.a.b, k.a() >> 1, 52 + (16 - this.a.aJ) / 2, 16777215, 17, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
            this.a.a.a(this.a.a, 655399, 8, 52);
            this.a.a.a(this.a.a, 655400, k.a() - 16, 52);
         }

         ac.c(Integer.parseInt(this.a.b.elementAt(this.a.h).toString()));
         if(ac.b() != -1) {
            this.a.a.a(this.a.a, this.a.a.a, k.a() >> 1, this.a.a.j + 16, 16777215, 1041, 0, 1, 8, this.a.aJ, k.a(), this.a.a.i, 0, 0);
         }

         this.a.a.c();
      }

      if(this.a.m) {
         this.a((k.a() >> 1) - 8, this.a.a.j, k.b() - 16);
      }

   }

   public final void i() {
      if(this.a.aw) {
         this.a.aw = false;
         this.a.a.setColor(13158);
         this.a.a.fillRect(0, 0, k.a(), k.b());
         StringBuffer var1 = (new StringBuffer()).append(this.a.a.a(80));
         this.a.a.a(this.a.a, var1, k.a() >> 1, this.a.a.a + 20, 16777215, 65, 0, 1, 8, this.a.aJ, k.a(), 2 * k.b() / 3, 0, 0);
      }

   }

   public final void a(int var1) {
      this.a.a.setColor(16777215);
      this.a.a.fillRect(0, 0, k.a(), k.b());

      for(int var2 = 1; var2 < this.a.aK + 1; ++var2) {
         this.a.a.a(this.a.a, this.a.a.c, k.a() / 6 + 2 * var2, k.b() / 6 + (this.a.aP + this.a.aL - this.a.aQ) - this.a.aR);
      }

      if(var1 == 0) {
         this.a.a.a(this.a.a, this.a.a.a(50), k.a() >> 1, k.b() / 6 + (this.a.aP + this.a.aL - this.a.aQ) - this.a.aR + (this.a.aP - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      } else {
         this.a.a.a(this.a.a, this.a.a.a(51), k.a() >> 1, k.b() / 6 + (this.a.aP + this.a.aL - this.a.aQ) - this.a.aR + (this.a.aP - this.a.aJ) / 2, 16777215, 273, 0, 1, 8, this.a.aJ, k.a(), k.b(), 0, 0);
      }
   }

   public final void a(StringBuffer var1, int var2, int var3, int var4, int var5) {
      this.a.b.removeAllElements();
      ac.c(0);
      this.a.l = true;
      this.a.h = 0;
      this.a.p = 0L;
      this.a.b.addElement(new Integer(0));

      while(this.a.a.a) {
         this.a.a.a(this.a.a, var1, var2, var3, 16777215, 1089, 0, 1, 8, this.a.aJ, var4, var5, 0, 0);
         this.a.b.addElement(new Integer(ac.b()));
         if(ac.b() == 0) {
            this.a.a.a = false;
         }
      }

      this.a.b.removeElementAt(this.a.b.size() - 1);
      this.a.n = true;
      this.a.m = true;
      this.a.a.a = true;
   }

   public final void a(int var1, int var2, int var3) {
      if(this.a.hasPointerEvents()) {
         if(this.a.b.size() > 1) {
            if(this.a.h == 0) {
               this.a.a.a(this.a.a, 655421, var1, var2);
            } else {
               this.a.a.a(this.a.a, 655417, var1, var2);
            }

            if(this.a.h == this.a.b.size() - 1) {
               this.a.a.a(this.a.a, 655422, var1, var3);
            } else {
               this.a.a.a(this.a.a, 655418, var1, var3);
            }

            this.a.m = false;
         }

         switch(this.a.i) {
         case 1:
            this.a.p += this.a.f;
            if(this.a.p < 500L) {
               this.a.a.a(this.a.a, 655419, var1, var2);
               this.a.m = true;
            } else {
               this.a.p = 0L;
               this.a.i = 0;
               if(this.a.h == 0) {
                  this.a.a.a(this.a.a, 655421, var1, var2);
               }

               this.a.m = false;
            }
            break;
         case 2:
            this.a.p += this.a.f;
            if(this.a.p < 500L) {
               this.a.a.a(this.a.a, 655420, var1, var3);
               this.a.m = true;
            } else {
               this.a.p = 0L;
               this.a.i = 0;
               if(this.a.h == this.a.b.size() - 1) {
                  this.a.a.a(this.a.a, 655422, var1, var3);
               }

               this.a.m = false;
            }
         }

      } else {
         if(this.a.b.size() > 1) {
            if(this.a.h == 0) {
               this.a.a.a(this.a.a, 655409, var1, var2);
            } else {
               this.a.a.a(this.a.a, 655405, var1, var2);
            }

            if(this.a.h == this.a.b.size() - 1) {
               this.a.a.a(this.a.a, 655410, var1, var3);
            } else {
               this.a.a.a(this.a.a, 655406, var1, var3);
            }

            this.a.m = false;
         }

         switch(this.a.i) {
         case 1:
            this.a.p += this.a.f;
            if(this.a.p < 500L) {
               this.a.a.a(this.a.a, 655407, var1, var2);
               this.a.m = true;
               return;
            }

            this.a.p = 0L;
            this.a.i = 0;
            if(this.a.h == 0) {
               this.a.a.a(this.a.a, 655409, var1, var2);
            }

            this.a.m = false;
            return;
         case 2:
            this.a.p += this.a.f;
            if(this.a.p < 500L) {
               this.a.a.a(this.a.a, 655408, var1, var3);
               this.a.m = true;
               return;
            } else {
               this.a.p = 0L;
               this.a.i = 0;
               if(this.a.h == this.a.b.size() - 1) {
                  this.a.a.a(this.a.a, 655410, var1, var3);
               }

               this.a.m = false;
            }
         default:
         }
      }
   }
}
