package data;

import data.b;
import data.k;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class ac {

   private static ac a = null;
   private byte a;
   private byte[] a;
   private StringBuffer[][] a;
   private int a = 0;
   public boolean a = false;
   private boolean b = true;
   public int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   private Vector a;
   private Vector b;
   private Vector c;
   private Vector d;
   private int b;
   private int c;
   private int d;
   private boolean c;
   private static int e;
   public static StringBuffer[] a;


   private ac() {
      this.b();
   }

   public static final ac a() {
      if(k.a()) {
         if(a == null) {
            a = new ac();
         }

         return a;
      } else {
         throw new b("Unauthorised operation");
      }
   }

   public final void a(int var1) {
      if(this.a != var1) {
         this.a(true);
         this.a = (byte)var1;
         this.a();
      }

   }

   public final int a() {
      return 4;
   }

   public final boolean a() {
      if(this.a[this.a] != -1) {
         this.a(this.a, (int)this.a[this.a]);
      }

      ++this.a;
      if(this.a == 4) {
         this.a = 0;
         return true;
      } else {
         return false;
      }
   }

   private void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if(this.a[var1] != -1) {
            this.a(var1, (int)this.a[var1]);
         }
      }

   }

   public final void a(boolean var1) {
      if(this.a != null) {
         for(int var2 = 0; var2 < 4; ++var2) {
            if(!var1) {
               this.a[var2] = -1;
            }

            if(this.a != null && this.a[var2] != null) {
               for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
                  this.a[var2][var3] = null;
               }

               this.a[var2] = null;
            }
         }

         this.a = null;
         System.gc();
      }
   }

   public final void b(int var1) {
      byte var2;
      if((var2 = this.a[var1]) != -1) {
         for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
            this.a[var2][var3] = null;
         }

         this.a[var2] = null;
         this.a[var1] = -1;
      }

      System.gc();
   }

   public final StringBuffer a(int var1) {
      int var2 = var1 >> 16;
      int var3;
      if((var3 = this.a[var2]) < 0) {
         if(this.a) {
            var3 = this.a(var2);
         } else {
            var3 = this.a(var2, (int)0);
         }
      }

      return this.a[var3][var1 & '\uffff'];
   }

   public final int a(int var1) {
      if(this.a[var1] > 0) {
         return this.a[var1];
      } else {
         for(int var2 = 1; var2 < 4; ++var2) {
            if(this.a == null || this.a[var2] == null) {
               return this.a(var1, var2);
            }
         }

         return this.a(var1, (int)0);
      }
   }

   private int a(int var1, int var2) {
      if(this.a == null) {
         this.a = new StringBuffer[4][];
      }

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         if(this.a[var7] == var2) {
            this.a[var7] = -1;
         }
      }

      try {
         int var6 = 9366;
         boolean var4 = false;
         int var5 = 5;
         InputStream var3;
         (var3 = this.getClass().getResourceAsStream("/data/D0")).skip(80048L);
         int var12;
         if(var1 == -2) {
            var12 = var3.read();
         } else {
            var3.skip((long)(1 + 27 * var1));
            var5 = var3.read() | var3.read() << 8;
            var3.skip((long)(5 * this.a));
            var12 = var3.read();
            var6 = var3.read() | var3.read() << 8 | var3.read() << 16 | var3.read() << 24;
         }

         var3.close();
         this.a[var2] = new StringBuffer[var5];
         if(this.a == 0 && var1 >= 0) {
            this.ZHRES(var1, var2);
         } else {
            (var3 = this.getClass().getResourceAsStream("/data/D" + Integer.toString(var12))).skip((long)var6);

            for(var7 = 0; var7 < var5; ++var7) {
               int var8;
               StringBuffer var9;
               int var10;
               for(var9 = new StringBuffer(); (var8 = var3.read()) != 0; var9.append((char)var10)) {
                  var10 = var8 & 127;
                  if((var8 & 128) != 0) {
                     var8 = var3.read();
                     var10 |= (var8 & 127) << 7;
                     if((var8 & 128) != 0) {
                        var10 |= var3.read() << 14;
                     }
                  }
               }

               this.a[var2][var7] = var9;
            }

            var3.close();
         }
      } catch (Exception var11) {
         ;
      }

      if(var1 >= 0) {
         this.a[var1] = (byte)var2;
      }

      return var2;
   }

   private String a(Vector var1, int var2) {
      return (String)var1.elementAt(var2);
   }

   private int a(Vector var1, int var2) {
      return ((Integer)var1.elementAt(var2)).intValue();
   }

   private void a(Vector var1, String var2, int var3) {
      var1.setElementAt(var2, var3);
   }

   private void a(Vector var1, int var2, int var3) {
      var1.setElementAt(new Integer(var2), var3);
   }

   private void a(String var1, Graphics var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 != null) {
         if((var5 & 256) != 0) {
            var2.setColor(var7);
            this.a(var1, var2, var3, var4, var5 & 127);
            var2.setColor(var6);
         }

         var2.drawString(var1, var3, var4, var5 & 127);
      }
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         var1.setColor(var5);
         var1.setFont(Font.getFont(var2, var3, var4));
      }
   }

   private boolean a(String var1, int var2, int var3, int var4, int var5) {
      this.c = false;
      if(var1 == null) {
         return false;
      } else if(var1.length() == 0) {
         return false;
      } else {
         int var6 = this.a(var1, var3, var4, var5);
         boolean var7 = false;
         if(var6 + this.d > this.c) {
            var7 = true;
            if(var1.endsWith(" ") && this.d + this.a(var1.substring(0, var1.length() - 1), var3, var4, var5) <= this.c) {
               if(var1.length() <= 1) {
                  return false;
               }

               var1 = var1.substring(0, var1.length() - 1);
               var7 = false;
            }

            if(var7 && this.a.size() > 0) {
               int var8 = this.a.size() - 1;
               String var9;
               if((var9 = this.a(this.a, var8)).endsWith(" ") && this.a(this.d, var8) <= this.c) {
                  var9 = var9.substring(0, var9.length() - 1);
                  this.d -= this.a(this.d, var8);
                  this.a(this.a, var9, var8);
                  this.a(this.d, this.a(var9, var3, this.a(this.c, var8), var5), var8);
                  this.d += this.a(this.d, var8);
                  --this.b;
                  this.c = true;
               }
            }
         }

         if(var1.endsWith(" ")) {
            ++this.b;
         }

         this.a.addElement(var1);
         this.b.addElement(new Integer(var2));
         this.c.addElement(new Integer(var4));
         this.d.addElement(new Integer(this.a(var1, var3, var4, var5)));
         return var7;
      }
   }

   private int a(String var1, int var2, int var3, int var4) {
      return Font.getFont(var2, var3, var4).stringWidth(var1) + var1.length() * k.g();
   }

   private int a(char var1, char var2) {
      if(var2 == 37) {
         if(var1 == 99) {
            return -1;
         }

         if(var1 == 117) {
            return -4;
         }

         if(var1 == 98) {
            return -1;
         }

         if(var1 == 105) {
            return -2;
         }
      } else {
         if(var1 == 99 && var2 >= 48 && var2 <= 57) {
            return this.a[var2 - 48];
         }

         if(var1 == 117) {
            return 4;
         }

         if(var1 == 98) {
            return 1;
         }

         if(var1 == 105) {
            return 2;
         }
      }

      return -999;
   }

   public static final int b() {
      return e;
   }

   public static final void c(int var0) {
      e = var0;
   }

   private void a(String var1, Graphics var2, int var3, int var4, int var5) {
      for(int var6 = -1; var6 < 2; ++var6) {
         for(int var7 = -1; var7 < 2; ++var7) {
            var2.drawString(var1, var3 + var6, var4 + var7, var5);
         }
      }

   }

   public final int a(Graphics var1, StringBuffer var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if(var2 == null) {
         return var4;
      } else {
         if((var6 & 127) == 0) {
            var6 = var6 | 16 | 4;
         }

         if((var6 & 2) != 0) {
            if((var6 & 512) == 0) {
               var6 |= 512;
            }

            var6 = (var6 &= -3) | 16;
         }

         if((var6 & 512) != 0) {
            if((var6 & 1) != 0) {
               var6 = var6 & -128 | 16 | 1;
            } else if((var6 & 8) != 0) {
               var6 = var6 & -128 | 16 | 8;
            }
         }

         if((var6 & 2048) != 0) {
            if((var6 & 512) != 0) {
               var4 -= var10 / 2;
            }

            this.a(var1, var7, var8, var9, var5);
            this.a(var2.toString(), var1, var3, var4, var6, var5, var13);
            return var4 + var10;
         } else {
            this.a = new Vector();
            this.b = new Vector();
            this.c = new Vector();
            this.d = new Vector();
            this.d = 0;
            this.c = var11;
            this.b = 0;
            String var15 = var2.toString();
            String var16 = "";
            int var17 = var5;
            int var18 = var8;
            int var19 = var4;
            int var20 = 1;
            boolean var21 = false;
            int var22 = 0;
            boolean var23 = false;
            byte var24 = 0;
            int var25 = 0;
            int var26 = 0;
            int var27 = 0;
            Vector var28 = new Vector();

            boolean var29;
            int var45;
            int var46;
            for(var45 = var15.indexOf("\\&"); var45 != -1; var45 = var15.indexOf("\\&", var45 + 2)) {
               var29 = false;
               char var30;
               if((var30 = var15.charAt(var45 + 2)) >= 48 && var30 <= 57 && (var46 = var30 - 48) < a.length) {
                  if(a[var46] != null) {
                     var15 = var15.substring(0, var45) + a[var46].toString() + var15.substring(var45 + 3);
                  } else {
                     var15 = var15.substring(0, var45) + "***ISSUE WITH TEXT PARAM***" + var15.substring(var45 + 3);
                  }
               }
            }

            int var32;
            int var48;
            if((var6 & 1024) != 0 && e > 0) {
               if(var1 != null) {
                  String var47;
                  if(e >= 0 && e <= var15.length()) {
                     var47 = var15.substring(0, e);
                  } else {
                     var47 = "***ISSUE WITH DRAWSTRINGOFFSET***";
                  }

                  for(var48 = var47.indexOf("\\"); var48 > -1; var48 = var47.indexOf("\\", var48 + 3)) {
                     char var31;
                     if(((var31 = var47.charAt(var48 + 1)) == 99 || var31 == 117 || var31 == 105 || var31 == 98) && (var32 = this.a(var31, var47.charAt(var48 + 2))) != -999) {
                        if(var31 == 99) {
                           if(var32 == -1) {
                              var17 = var5;
                           } else {
                              var17 = var32;
                           }
                        } else if(var32 < 0 && (var18 & -var32) != 0) {
                           var18 &= ~(-var32);
                        } else if(var32 >= 0 && (var18 & var32) == 0) {
                           var18 |= var32;
                        }
                     }
                  }
               }

               if(e >= 0 && e <= var15.length()) {
                  var15 = var15.substring(e);
               } else {
                  var15 = "***ISSUE WITH DRAWSTRINGOFFSET***";
               }
            }

            this.a(var1, var7, var18, var9, var17);
            if((var6 & 4096) != 0 && (var6 & 127) != 0) {
               if((var6 & 1) != 0) {
                  var3 -= var11 / 2;
                  var6 = (var6 &= -2) | 4;
               } else if((var6 & 8) != 0) {
                  var3 -= var11;
                  var6 = (var6 &= -9) | 4;
               }
            }

            int var50;
            while(var22 < var15.length() || this.a.size() > var27) {
               char var49 = 120;
               var48 = 0;
               var50 = -1;
               boolean var51 = false;
               boolean var33 = false;
               if(var22 < var15.length()) {
                  int var44;
                  if((var44 = var15.indexOf(" ", var22)) == -1) {
                     var33 = true;
                     var44 = var15.length() - 1;
                  }

                  if((var45 = (var16 = var15.substring(var22, var44 + 1)).indexOf("\\")) + 1 >= var16.length()) {
                     var45 = -1;
                     var33 = true;
                  }
               } else {
                  var45 = -2;
                  var33 = true;
               }

               int var34;
               int var35;
               if(var45 == -1) {
                  var24 = 0;
                  var22 += var16.length();
                  if(!(var51 = this.a(var16, var17, var7, var18, var9))) {
                     this.d += this.a(this.d, this.d.size() - 1);
                  }
               } else {
                  var24 = 0;
                  var25 = 0;

                  while(var45 > -1) {
                     var49 = var16.charAt(var45 + 1);
                     var34 = this.a.size();
                     if(var49 != 99 && var49 != 117 && var49 != 105 && var49 != 98) {
                        if(var49 != 64 && var49 != 110 && var49 != 112) {
                           if(var49 == 167) {
                              if(var16.substring(var45 + 2).indexOf("\\") == -1) {
                                 var51 = this.a(var16.substring(var48, var45) + " " + var16.substring(var45 + 2), var17, var7, var18, var9);
                                 var24 = 2;
                                 --var22;
                              } else {
                                 var16 = var16.substring(var48, var45) + " " + var16.substring(var45 + 2);
                                 var24 = 1;
                                 var45 = -1;
                              }

                              ++var25;
                           } else if(var49 == 116) {
                              var51 = this.a(var16.substring(var48, var45) + "   ", var17, var7, var18, var9);
                              var24 = 2;
                              var22 -= "   ".length();
                           } else if(var16.substring(var45 + 1).indexOf("\\") == -1) {
                              var51 = this.a(var16.substring(var48), var17, var7, var18, var9);
                              var24 = 0;
                              ++var45;
                           } else {
                              var24 = 0;
                              ++var45;
                           }
                        } else if(!(var51 = this.a(var16.substring(var48, var45), var17, var7, var18, var9))) {
                           var50 = var45;
                           var24 = 2;
                        } else {
                           var50 = -1;
                           var24 = 0;
                        }
                     } else if((var35 = this.a(var49, var16.charAt(var45 + 2))) != -999) {
                        if(var45 > 0) {
                           var51 = this.a(var16.substring(var48, var45), var17, var7, var18, var9);
                        }

                        if(var49 == 99) {
                           if(var35 == -1) {
                              var17 = var5;
                           } else {
                              var17 = var35;
                           }

                           var24 = 3;
                        } else {
                           if(var35 < 0 && (var18 & -var35) != 0) {
                              var18 &= ~(-var35);
                           } else if(var35 >= 0 && (var18 & var35) == 0) {
                              var18 |= var35;
                           }

                           if(var35 < 0) {
                              var24 = 3;
                           } else {
                              var24 = 2;
                           }
                        }
                     }

                     var48 = var45 + var24;
                     var45 += var24;
                     var22 += var24;
                     var45 = var16.indexOf("\\", var45);
                     if(var33 && var45 == -1 && var48 < var16.length()) {
                        var33 = false;
                     }

                     if(this.a.size() > var34) {
                        var22 += ((String)this.a.lastElement()).length();
                        if(!var51) {
                           this.d += ((Integer)this.d.lastElement()).intValue();
                        }
                     }

                     if(var51 || var50 > -1) {
                        break;
                     }
                  }
               }

               if(var51 || var33 || var50 > -1) {
                  if(this.a.size() > var27) {
                     int var36;
                     int var37;
                     if(this.a(this.d, var27) > var11) {
                        String var52 = this.a(this.a, var27);
                        var35 = this.a(this.d, var27);
                        var36 = this.a(this.c, var27);

                        for(var37 = var52.length(); var35 > var11; var35 = this.a(var52.substring(0, var37), var7, var36, var9)) {
                           if(var37 > 1) {
                              --var37;
                           }
                        }

                        this.a(this.a, var52.substring(0, var37), var27);
                        this.a(this.d, var35, var27);
                        this.a.insertElementAt(var52.substring(var37), var27 + 1);
                        this.b.insertElementAt(new Integer(this.a(this.b, var27)), var27 + 1);
                        this.c.insertElementAt(new Integer(var36), var27 + 1);
                        this.d.insertElementAt(new Integer(this.a(var52.substring(var37), var7, var36, var9)), var27 + 1);
                        this.d = var35;
                        var26 = var27 + 1;
                        if(var50 > -1) {
                           var22 -= 2;
                        }
                     } else if(var51) {
                        var26 = this.a.size() - 1;
                        if((var6 & 4096) != 0 && this.a(this.a, this.a.size() - 1).endsWith(" ")) {
                           --this.b;
                        }
                     } else {
                        var26 = this.a.size();
                     }

                     var34 = var3;
                     var35 = var6;
                     if(var6 != 0) {
                        if(this.b) {
                           if((var6 & 1) != 0) {
                              var34 = var3 - this.d / 2;
                              var35 = (var35 = var6 & -2) | 4;
                           } else if((var6 & 8) != 0) {
                              var34 = var3 - this.d;
                              var35 = (var35 = var6 & -9) | 4;
                           }
                        } else if((var6 & 1) != 0) {
                           var34 = var3 + this.d / 2;
                           var35 = (var35 = var6 & -2) | 8;
                        } else if((var6 & 4) != 0) {
                           var34 = var3 + this.d;
                           var35 = (var35 = var6 & -5) | 8;
                        } else if((var6 & 8) != 0) {
                           var34 = var3 + this.d;
                        }
                     }

                     var36 = var11 - this.d;
                     var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     if((var6 & 4096) != 0 && var50 == -1 && var36 < var11 / 3 && this.b > 0) {
                        var37 = var36 / this.b;
                        var39 = (var38 = var36 - var37 * this.b) / this.b + 1;
                     }

                     int var41 = var27;

                     for(int var42 = var27; var42 < var26; ++var42) {
                        if((var6 & 512) == 0) {
                           int var40 = this.a(this.b, var27);
                           this.a(var1, var7, this.a(this.c, var27), var9, var40);
                           this.a(this.a(this.a, var27), var1, var34, var19, var35, var40, var13);
                        } else {
                           var28.addElement(new Integer(var34));
                           var41 = var42;
                        }

                        if(this.b) {
                           var34 += this.a(this.d, var41);
                        } else {
                           var34 -= this.a(this.d, var41);
                        }

                        if((var6 & 4096) != 0 && this.a(this.a, var41).endsWith(" ")) {
                           var34 += var37;
                           if(var38 > 0) {
                              var34 += var39;
                              if((var38 -= var39) < 0) {
                                 var38 = 0;
                                 var39 = 0;
                              }
                           }
                        }

                        if((var6 & 512) == 0) {
                           this.a.removeElementAt(var27);
                           this.d.removeElementAt(var27);
                           this.b.removeElementAt(var27);
                           this.c.removeElementAt(var27);
                        }
                     }

                     if((var6 & 512) == 0) {
                        var27 = 0;
                     } else {
                        var27 = var26;
                     }

                     this.d = 0;
                     this.b = 0;
                     if(this.a.size() > var27) {
                        for(int var43 = var27; var43 < this.a.size(); ++var43) {
                           this.d += this.a(this.d, var43);
                           if((var6 & 4096) != 0 && this.a(this.a, var43).endsWith(" ")) {
                              ++this.b;
                           }
                        }
                     }
                  }

                  var19 += var10;
                  if(var49 == 112 && var50 < var26 && var50 > -1) {
                     while(var19 < var4 + var12 * var20) {
                        var19 += var10;
                     }

                     ++var20;
                  }

                  if((var6 & 1024) != 0 && var19 + var10 > var4 + var12 && var1 != null) {
                     break;
                  }
               }
            }

            if((var6 & 512) != 0 && var28.size() > 0) {
               var29 = false;
               var48 = this.a(var28, 0);
               var32 = var4 - (var19 - var4) / 2;

               for(int var53 = 0; var53 < var28.size(); ++var53) {
                  var50 = this.a(this.b, var53);
                  this.a(var1, var7, this.a(this.c, var53), var9, var50);
                  this.a(this.a(this.a, var53), var1, var48, var32, var6 & -640, var50, var13);
                  if(var53 + 1 < var28.size()) {
                     var48 = this.a(var28, var53 + 1);
                  }

                  if(var48 < var48 + this.a(this.d, var53)) {
                     var32 += var10;
                  }
               }

               var19 = var32;
            }

            if((var6 & 1024) != 0) {
               if(this.a.size() > var27) {
                  for(var46 = var27; var46 < this.a.size(); ++var46) {
                     var22 -= this.a(this.a, var46).length();
                  }

                  var22 = var22 - var24 - var25;
               }

               if(var22 < var15.length()) {
                  e += var22;
               } else {
                  e = 0;
               }
            }

            this.a = null;
            this.c = null;
            this.b = null;
            this.d = null;
            return var19;
         }
      }
   }

   public final int a(Graphics var1, StringBuffer var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5, 20, 0, 0, k.e(), k.f(), k.a(), k.b(), 0, 0);
   }

   private void b() {
      this.a = new byte[4];
      this.a = 0;

      for(int var1 = 0; var1 < 4; this.a[var1++] = -1) {
         ;
      }

      a = new StringBuffer[10];
   }

   private void ZHRES(int var1, int var2) {
      DataInputStream var3 = new DataInputStream(this.getClass().getResourceAsStream("/" + Integer.toString(var1)));

      try {
         int var4 = var3.readInt();
         String var5 = null;

         for(int var6 = 0; var6 < var4; ++var6) {
            StringBuffer var7 = new StringBuffer();
            short var8 = var3.readShort();
            byte[] var9 = new byte[var8];

            for(int var10 = var8 - 1; var10 > -1; --var10) {
               var9[var10] = (byte)(~var3.readByte());
            }

            var5 = new String(var9, "UTF-8");
            var7.append(var5);
            this.a[var2][var6] = var7;
         }

         var3.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }

   }
}
