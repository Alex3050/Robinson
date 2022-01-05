package data;


public final class z extends Exception {

   public z() {
      System.out.println("CelsiusException: " + this.getMessage());
   }

   public z(String var1) {
      super(var1);
      System.out.println("CelsiusException: " + var1);
   }
}
