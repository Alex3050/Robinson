// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   rs.java

import java.io.*;

public class rs
{

	public static byte a_byte_array1d_fld[] = new byte[4];
	public static StringBuffer a_java_lang_StringBuffer_array2d_fld[][];

	public rs()
	{
	}

	public static void main(String args[])
		throws Exception
	{
		read_def("3");
	}

	public static int a(int i, int j)
	{
		if (a_java_lang_StringBuffer_array2d_fld == null)
			a_java_lang_StringBuffer_array2d_fld = new StringBuffer[4][];
		for (int k1 = 0; k1 < 4; k1++)
			if (a_byte_array1d_fld[k1] == j)
				a_byte_array1d_fld[k1] = -1;

		try
		{
			int j1 = 9366;
			int l = 0;
			int i1 = 5;
			InputStream inputstream;
			(inputstream = java.lang.Object.class.getClass().getResourceAsStream("/D0")).skip(0x138b0L);
			if (i == -2)
			{
				l = inputstream.read();
			} else
			{
				inputstream.skip(1 + 27 * i);
				i1 = inputstream.read() | inputstream.read() << 8;
				inputstream.skip(0L);
				l = inputstream.read();
				j1 = inputstream.read() | inputstream.read() << 8 | inputstream.read() << 16 | inputstream.read() << 24;
			}
			inputstream.close();
			a_java_lang_StringBuffer_array2d_fld[j] = new StringBuffer[i1];
			(inputstream = java.lang.Object.class.getClass().getResourceAsStream("/D" + Integer.toString(l))).skip(j1);
			for (int l1 = 0; l1 < i1; l1++)
			{
				StringBuffer stringbuffer = new StringBuffer();
				int i2;
				while ((i2 = inputstream.read()) != 0) 
				{
					int j2 = i2 & 0x7f;
					if ((i2 & 0x80) != 0)
					{
						i2 = inputstream.read();
						j2 |= (i2 & 0x7f) << 7;
						if ((i2 & 0x80) != 0)
							j2 |= inputstream.read() << 14;
					}
					stringbuffer.append((char)j2);
				}
				a_java_lang_StringBuffer_array2d_fld[j][l1] = stringbuffer;
			}

			inputstream.close();
		}
		catch (Exception exception) { }
		if (i >= 0)
			a_byte_array1d_fld[i] = (byte)j;
		for (int l1 = 0; l1 < a_java_lang_StringBuffer_array2d_fld[j].length; l1++)
		{
			System.out.println(a_java_lang_StringBuffer_array2d_fld[j][l1]);
			System.out.println(l1);
		}

		String arg = Integer.toString(i);
		return j;
	}

	public static void writ_no_jiami(String arg, int j)
		throws Exception
	{
		ByteArrayOutputStream bytearrayoutputstream = null;
		DataOutputStream dataoutputstream = null;
		bytearrayoutputstream = new ByteArrayOutputStream();
		dataoutputstream = new DataOutputStream(bytearrayoutputstream);
		FileOutputStream fos = new FileOutputStream("C:\\Documents and Settings\\Administrator\\workspace\\Robinson\\res\\" + arg);
		DataOutputStream dos = new DataOutputStream(fos);
		String s1 = null;
		dos.writeInt(a_java_lang_StringBuffer_array2d_fld[j].length);
		for (int l1 = 0; l1 < a_java_lang_StringBuffer_array2d_fld[j].length; l1++)
			dos.writeUTF(s1 = new String(a_java_lang_StringBuffer_array2d_fld[j][l1]));

		dos.close();
	}

	private void ZHRES(int i, int j)
	{
		DataInputStream in = new DataInputStream(getClass().getResourceAsStream("/" + Integer.toString(i)));
		try
		{
			int i1 = in.readInt();
			String as = null;
			for (int l1 = 0; l1 < i1; l1++)
			{
				StringBuffer s1 = new StringBuffer();
				short t = in.readShort();
				byte v[] = new byte[t];
				for (int z = t - 1; z > -1; z--)
					v[z] = (byte)(~in.readByte());

				as = new String(v, "UTF-8");
				s1.append(as);
				a_java_lang_StringBuffer_array2d_fld[j][l1] = s1;
			}

			in.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static void read_def(String arg)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = null;
		DataOutputStream dataoutputstream = null;
		FileInputStream fis = new FileInputStream(arg);
		FileOutputStream fos = new FileOutputStream("new/" + arg);
		DataInputStream datainputstream = new DataInputStream(fis);
		bytearrayoutputstream = new ByteArrayOutputStream();
		dataoutputstream = new DataOutputStream(fos);
		int i = datainputstream.readInt();
		dataoutputstream.writeInt(i);
		String as = null;
		for (int l1 = 0; l1 < i; l1++)
		{
			as = datainputstream.readUTF();
			System.out.println(as);
			byte v[] = as.getBytes("UTF-8");
			System.out.println(v.length);
			dataoutputstream.writeShort(v.length);
			for (int t = v.length - 1; t > -1; t--)
				dataoutputstream.writeByte(~v[t]);

		}

		dataoutputstream.close();
		datainputstream.close();
		fis.close();
		fos.close();
	}

}