package data;

import data.b;
import data.k;
import data.m;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class w {

   private static w a = null;
   private byte[] a;
   private short[][] a;
   private short[][] b;
   private short[][] c;
   private short[][] d;
   private short[][] e;
   private short[][] f;
   private Image[] a;
   private int[] a;
   private int a;
   private int b;
   private int c;
   private int d;
   private static int e = 0;
   public boolean a = false;


   private w() {
      this.b(0, 0, k.a(), k.b());
   }

   public static final w a() {
      if(k.a()) {
         if(a == null) {
            a = new w();
         }

         return a;
      } else {
         throw new b("Unauthorised operation");
      }
   }

   public final int a() {
      return 15;
   }

   public final boolean a() {
      if(this.a[e] >= 0) {
         this.a(e, this.a[e], "");
      }

      ++e;
      if(e == 15) {
         e = 0;
         return true;
      } else {
         return false;
      }
   }

   public final void a(int var1) {
      byte var2;
      if((var2 = this.a[var1]) >= 0) {
         this.a[var2] = null;
         this.a[var2] = this.b[var2] = this.c[var2] = this.d[var2] = this.e[var2] = this.f[var2] = null;
         this.a[var1] = -1;
         System.gc();
      }

   }

   public final int a(int var1) {
      return this.a(var1, "");
   }

   public final int a(int var1, String var2) {
      if(this.a[var1] > 0) {
         return this.a[var1];
      } else {
         for(int var3 = 1; var3 < 15; ++var3) {
            if(this.a[var3] == null) {
               return this.a(var1, var3, var2);
            }
         }

         return this.a(var1, 0, var2);
      }
   }

   private int a(int var1, int var2, String var3) {
      boolean var8 = false;
      if(this.a[var1] == (byte)var2 && this.a[var2] != null) {
         return var2;
      } else {
         while(true) {
            int var4;
            for(var4 = 0; var4 < 15; ++var4) {
               if(this.a[var4] == var2) {
                  this.a[var4] = -1;
               }
            }

            if(var1 >= 15) {
               return var2;
            }

            try {
               if(var2 == 0 || this.a[var2] == null) {
                  InputStream var7;
                  (var7 = this.getClass().getResourceAsStream("/data/D0")).skip(0L);
                  var4 = 0;

                  int var5;
                  for(var5 = 0; var4 < var1; ++var4) {
                     var5 += var7.read() | var7.read() << 8;
                  }

                  int var6 = var7.read() | var7.read() << 8;
                  this.a[var1] = var6;
                  var7.skip((long)((15 - var1 - 1) * 2 + var5 * 12));
                  this.a[var2] = new short[var6];
                  this.b[var2] = new short[var6];
                  this.c[var2] = new short[var6];
                  this.d[var2] = new short[var6];
                  this.e[var2] = new short[var6];
                  this.f[var2] = new short[var6];

                  for(var4 = 0; var4 < var6; ++var4) {
                     this.a[var2][var4] = (short)(var7.read() | var7.read() << 8);
                     this.b[var2][var4] = (short)(var7.read() | var7.read() << 8);
                     this.c[var2][var4] = (short)(var7.read() | var7.read() << 8);
                     this.d[var2][var4] = (short)(var7.read() | var7.read() << 8);
                     this.e[var2][var4] = (short)(var7.read() | var7.read() << 8);
                     this.f[var2][var4] = (short)(var7.read() | var7.read() << 8);
                  }

                  var7.close();
               }

               if(!var3.equals("")) {
                  Object var9 = null;
                  boolean var10 = false;
                  int var16 = this.a(var1, (byte[])null);
                  byte[] var11 = m.a().a(var3);
                  int var12;
                  if((var12 = a((byte[])null)) != -1) {
                     var12 += 4;

                     try {
                        System.arraycopy(var11, 0, (Object)null, var12, var11.length);
                        this.a[var2] = Image.createImage((byte[])null, 0, var16);
                     } catch (Exception var14) {
                        this.a[var2] = Image.createImage("/data/BS" + var1 + ".png");
                     }
                  } else {
                     this.a[var2] = Image.createImage("/data/BS" + var1 + ".png");
                  }
               } else {
                  this.a[var2] = Image.createImage("/data/BS" + var1 + ".png");
               }

               this.a[var1] = (byte)var2;
               return var2;
            } catch (Exception var15) {
               ;
            }
         }
      }
   }

   public static final int a(byte[] var0) {
      int var1 = 0;
      boolean var2 = false;

      while(!var2) {
         if(var0[var1] == 80 && var0[var1 + 1] == 76 && var0[var1 + 2] == 84 && var0[var1 + 3] == 69) {
            var2 = true;
         }

         ++var1;
         if(var1 > var0.length - 4) {
            var2 = true;
         }
      }

      if(var2) {
         return var1 - 1;
      } else {
         return -1;
      }
   }

   public final void a() {
      InputStream var6 = null;

      try {
         (var6 = this.getClass().getResourceAsStream("/data/D0")).skip(0L);

         int var1;
         for(var1 = 0; var1 < 15; ++var1) {
            this.a[var1] = var6.read() | var6.read() << 8;
         }

         int var8 = 0;

         for(int var7 = 0; var7 < 15; ++var8) {
            this.a[var8] = null;
            int var4 = this.a[var8];
            this.a[var8] = new short[var4];
            this.b[var8] = new short[var4];
            this.c[var8] = new short[var4];
            this.d[var8] = new short[var4];
            this.e[var8] = new short[var4];
            this.f[var8] = new short[var4];

            for(var1 = 0; var1 < var4; ++var1) {
               this.a[var8][var1] = (short)(var6.read() | var6.read() << 8);
               this.b[var8][var1] = (short)(var6.read() | var6.read() << 8);
               this.c[var8][var1] = (short)(var6.read() | var6.read() << 8);
               this.d[var8][var1] = (short)(var6.read() | var6.read() << 8);
               this.e[var8][var1] = (short)(var6.read() | var6.read() << 8);
               this.f[var8][var1] = (short)(var6.read() | var6.read() << 8);
            }

            this.a[var7] = (byte)var8;
            ++var7;
         }
      } catch (Exception var19) {
         var19.printStackTrace();
      } finally {
         try {
            if(var6 != null) {
               var6.close();
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         }

      }

      System.gc();
   }

   public final int a(int var1, byte[] var2) {
      InputStream var3 = null;
      boolean var4 = false;

      int var18;
      try {
         var3 = this.getClass().getResourceAsStream("/data/BS" + var1 + ".png");
         if(var2 == null) {
            var2 = new byte[var3.available()];
         }

         boolean var5 = false;
         var18 = 0;

         for(int var6 = var3.read(); var6 >= 0; var6 = var3.read()) {
            var2[var18++] = (byte)var6;
         }
      } catch (Exception var16) {
         var16.printStackTrace();
         var18 = 0;
      } finally {
         try {
            if(var3 != null) {
               var3.close();
            }
         } catch (IOException var15) {
            var15.printStackTrace();
         }

      }

      return var18;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, -1);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 >> 16;
      var2 &= '\uffff';
      int var7;
      if((var7 = this.a[var6]) < 0) {
         if(this.a) {
            var7 = this.a(var6, "");
         } else {
            var7 = this.a(var6, 0, "");
         }
      } else if(this.a[var7] == null) {
         try {
            this.a[var7] = Image.createImage("/data/BS" + var6 + ".png");
         } catch (IOException var18) {
            var18.printStackTrace();
         }
      }

      int var16 = 0;
      if(var5 == -1) {
         if((this.c[var7][var2] & '\u8000') != 0) {
            var16 = 2;
         }
      } else if(var5 >= 0) {
         var16 = var5;
      }

      var3 -= this.e[var7][var2];
      var4 -= this.f[var7][var2];
      int var8 = var3;
      int var9 = var4;
      int var10 = this.c[var7][var2] & 32767;
      int var11 = this.d[var7][var2] & 32767;
      if(var5 == 5 || var5 == 6 || var5 == 4 || var5 == 7) {
         int var17 = this.d;
         this.d = this.c;
         this.c = var17;
      }

      if(var3 + var10 > this.a + this.c) {
         var10 = this.a + this.c - var3;
      }

      if(var4 + var11 > this.b + this.d) {
         var11 = this.b + this.d - var4;
      }

      if(var3 < this.a) {
         var10 -= this.a - var3;
         var8 = this.a;
      }

      if(var4 < this.b) {
         var11 -= this.b - var4;
         var9 = this.b;
      }

      if(var10 > 0 && var11 > 0) {
         if(var16 != 0) {
            var1.drawRegion(this.a[var7], this.a[var7][var2] + (this.c[var7][var2] & 32767) - var8 + var3 - var10, this.b[var7][var2] + var9 - var4, var10, var11, var16, var8, var9, 0);
            return;
         }

         var1.drawRegion(this.a[var7], this.a[var7][var2] + var8 - var3, this.b[var7][var2] + var9 - var4, var10, var11, var16, var8, var9, 0);
      }

   }

   public final Image a(int var1) {
      int var2 = var1 >> 16;
      byte var3 = this.a[var2];
      var1 &= '\uffff';
      return this.a[var3] != null?Image.createImage(this.a[var3], this.a[var3][var1], this.b[var3][var1], this.c[var3][var1] & 32767, this.d[var3][var1] & 32767, 0):null;
   }

   public final void a(Graphics var1, Image var2, int var3, int var4) {
      if(var1 != null && var2 != null) {
         this.a(var1, var2, var3, var4, -1);
      }

   }

   public final void a(Graphics var1, Image var2, int var3, int var4, int var5) {
      int var6 = 0;
      if(var5 >= 0 && var5 >= 0) {
         var6 = var5;
      }

      var1.drawRegion(var2, 0, 0, var2.getWidth(), var2.getHeight(), var6, var3, var4, 0);
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
      this.a = new byte[15];
      this.a = new short[15][];
      this.b = new short[15][];
      this.c = new short[15][];
      this.d = new short[15][];
      this.e = new short[15][];
      this.f = new short[15][];
      this.a = new Image[15];
      this.a = new int[15];

      int var6;
      try {
         InputStream var5;
         (var5 = this.getClass().getResourceAsStream("/data/D0")).skip(0L);

         for(var6 = 0; var6 < 15; ++var6) {
            this.a[var6] = var5.read();
            this.a[var6] |= var5.read() << 8;
         }

         var5.close();
      } catch (Exception var7) {
         ;
      }

      for(var6 = 0; var6 < 15; this.a[var6++] = -1) {
         ;
      }

   }

}
