package data;

import data.b;
import data.k;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class m {

   private static m a = null;


   public static final m a() {
      if(k.a()) {
         if(a == null) {
            a = new m();
         }

         return a;
      } else {
         throw new b("Unauthorised operation");
      }
   }

   public final byte[] a(String var1) {
      boolean var2 = false;
      byte[] var3 = new byte[1024];
      byte[] var4 = null;
      InputStream var5 = null;
      ByteArrayOutputStream var6 = null;
      boolean var19 = false;

      label154: {
         try {
            var19 = true;
            var5 = this.getClass().getResourceAsStream("/" + var1);
            var6 = new ByteArrayOutputStream();
            int var7 = 0;

            while(var7 >= 0) {
               if((var7 = var5.read(var3, 0, 1024)) > 0) {
                  var6.write(var3, 0, var7);
               }
            }

            var4 = var6.toByteArray();
            var19 = false;
            break label154;
         } catch (Exception var26) {
            var19 = false;
         } finally {
            if(var19) {
               try {
                  if(var6 != null) {
                     var6.close();
                  }
               } catch (Exception var21) {
                  ;
               }

               try {
                  if(var5 != null) {
                     var5.close();
                  }
               } catch (Exception var20) {
                  ;
               }

            }
         }

         try {
            if(var6 != null) {
               var6.close();
            }
         } catch (Exception var23) {
            ;
         }

         try {
            if(var5 != null) {
               var5.close();
               return var4;
            }
         } catch (Exception var22) {
            ;
         }

         return var4;
      }

      try {
         var6.close();
      } catch (Exception var25) {
         ;
      }

      try {
         if(var5 != null) {
            var5.close();
         }
      } catch (Exception var24) {
         ;
      }

      return var4;
   }

}
