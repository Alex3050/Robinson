package data;

import data.b;
import data.k;
import data.z;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class e {

   private static e a = null;


   public static final e a() {
      if(k.a()) {
         if(a == null) {
            a = new e();
         }

         return a;
      } else {
         throw new b("Unauthorised operation");
      }
   }

   public final void a(String var1, int var2, int var3, byte[] var4) throws z {
      RecordStore var5 = null;
      ++var2;

      try {
         for(int var7 = (var5 = RecordStore.openRecordStore(var1, true)).getNumRecords(); var7 < var2; ++var7) {
            var5.addRecord((byte[])null, 0, 0);
         }

         if(var5.getSizeAvailable() + var5.getRecordSize(var2) < var3) {
            var5.closeRecordStore();
            throw new z("Not enought space");
         } else {
            var5.setRecord(var2, var4, 0, var3);
            if(var5 != null) {
               var5.closeRecordStore();
            }

         }
      } catch (RecordStoreException var9) {
         throw new z("CelsiusRecordStoreManager: " + var9.getMessage());
      }
   }

   public final byte[] a(String var1, int var2) throws z {
      RecordStore var3 = null;
      ++var2;

      try {
         if((var3 = RecordStore.openRecordStore(var1, false)).getNumRecords() < var2) {
            return null;
         } else {
            byte[] var5 = var3.getRecord(var2);
            if(var3 != null) {
               var3.closeRecordStore();
            }

            return var5;
         }
      } catch (RecordStoreException var7) {
         throw new z("CelsiusRecordStoreManager: " + var7.getMessage());
      }
   }

}
