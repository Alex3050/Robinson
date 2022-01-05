import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class rs {

   public static byte[] a_byte_array1d_fld = new byte[4];
   public static StringBuffer[][] a_java_lang_StringBuffer_array2d_fld;
   static Class class$0;


   public static void main(String[] args) throws Exception {
      read_def("3");
   }

   public static int a(int i, int j) {
      if(a_java_lang_StringBuffer_array2d_fld == null) {
         a_java_lang_StringBuffer_array2d_fld = new StringBuffer[4][];
      }

      int arg;
      for(arg = 0; arg < 4; ++arg) {
         if(a_byte_array1d_fld[arg] == j) {
            a_byte_array1d_fld[arg] = -1;
         }
      }

      try {
         arg = 9366;
         boolean l = false;
         int i1 = 5;
         Class var10000 = class$0;
         if(class$0 == null) {
            try {
               var10000 = Class.forName("java.lang.Object");
            } catch (ClassNotFoundException var11) {
               throw new NoClassDefFoundError(var11.getMessage());
            }

            class$0 = var10000;
         }

         InputStream inputstream;
         (inputstream = var10000.getClass().getResourceAsStream("/D0")).skip(80048L);
         int var13;
         if(i == -2) {
            var13 = inputstream.read();
         } else {
            inputstream.skip((long)(1 + 27 * i));
            i1 = inputstream.read() | inputstream.read() << 8;
            inputstream.skip(0L);
            var13 = inputstream.read();
            arg = inputstream.read() | inputstream.read() << 8 | inputstream.read() << 16 | inputstream.read() << 24;
         }

         inputstream.close();
         a_java_lang_StringBuffer_array2d_fld[j] = new StringBuffer[i1];
         var10000 = class$0;
         if(class$0 == null) {
            try {
               var10000 = Class.forName("java.lang.Object");
            } catch (ClassNotFoundException var10) {
               throw new NoClassDefFoundError(var10.getMessage());
            }

            class$0 = var10000;
         }

         (inputstream = var10000.getClass().getResourceAsStream("/D" + Integer.toString(var13))).skip((long)arg);

         for(int l1 = 0; l1 < i1; ++l1) {
            StringBuffer stringbuffer;
            int i2;
            int j2;
            for(stringbuffer = new StringBuffer(); (i2 = inputstream.read()) != 0; stringbuffer.append((char)j2)) {
               j2 = i2 & 127;
               if((i2 & 128) != 0) {
                  i2 = inputstream.read();
                  j2 |= (i2 & 127) << 7;
                  if((i2 & 128) != 0) {
                     j2 |= inputstream.read() << 14;
                  }
               }
            }

            a_java_lang_StringBuffer_array2d_fld[j][l1] = stringbuffer;
         }

         inputstream.close();
      } catch (Exception var12) {
         ;
      }

      if(i >= 0) {
         a_byte_array1d_fld[i] = (byte)j;
      }

      for(arg = 0; arg < a_java_lang_StringBuffer_array2d_fld[j].length; ++arg) {
         System.out.println(a_java_lang_StringBuffer_array2d_fld[j][arg]);
         System.out.println(arg);
      }

      String var14 = Integer.toString(i);
      return j;
   }

   public static void writ_no_jiami(String arg, int j) throws Exception {
      ByteArrayOutputStream bytearrayoutputstream = null;
      Object dataoutputstream = null;
      bytearrayoutputstream = new ByteArrayOutputStream();
      new DataOutputStream(bytearrayoutputstream);
      FileOutputStream fos = new FileOutputStream("C:\\Documents and Settings\\Administrator\\workspace\\Robinson\\res\\" + arg);
      DataOutputStream dos = new DataOutputStream(fos);
      Object s1 = null;
      dos.writeInt(a_java_lang_StringBuffer_array2d_fld[j].length);

      for(int l1 = 0; l1 < a_java_lang_StringBuffer_array2d_fld[j].length; ++l1) {
         dos.writeUTF(new String(a_java_lang_StringBuffer_array2d_fld[j][l1]));
      }

      dos.close();
   }

   private void ZHRES(int i, int j) {
      DataInputStream in = new DataInputStream(this.getClass().getResourceAsStream("/" + Integer.toString(i)));

      try {
         int e = in.readInt();
         String as = null;

         for(int l1 = 0; l1 < e; ++l1) {
            StringBuffer s1 = new StringBuffer();
            short t = in.readShort();
            byte[] v = new byte[t];

            for(int z = t - 1; z > -1; --z) {
               v[z] = (byte)(~in.readByte());
            }

            as = new String(v, "UTF-8");
            s1.append(as);
            a_java_lang_StringBuffer_array2d_fld[j][l1] = s1;
         }

         in.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }

   }

   private static void read_def(String arg) throws IOException {
      Object bytearrayoutputstream = null;
      DataOutputStream dataoutputstream = null;
      FileInputStream fis = new FileInputStream(arg);
      FileOutputStream fos = new FileOutputStream("new/" + arg);
      DataInputStream datainputstream = new DataInputStream(fis);
      new ByteArrayOutputStream();
      dataoutputstream = new DataOutputStream(fos);
      int i = datainputstream.readInt();
      dataoutputstream.writeInt(i);
      String as = null;

      for(int l1 = 0; l1 < i; ++l1) {
         as = datainputstream.readUTF();
         System.out.println(as);
         byte[] v = as.getBytes("UTF-8");
         System.out.println(v.length);
         dataoutputstream.writeShort(v.length);

         for(int t = v.length - 1; t > -1; --t) {
            dataoutputstream.writeByte(~v[t]);
         }
      }

      dataoutputstream.close();
      datainputstream.close();
      fis.close();
      fos.close();
   }
}
