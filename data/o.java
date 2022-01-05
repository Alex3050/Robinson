package data;

import java.util.Random;

public final class o {

   public static Random a = new Random();


   public static final int a(int var0) {
      try {
         return (a.nextInt() << 1 >>> 1) % var0;
      } catch (Exception var2) {
         return 0;
      }
   }

}
