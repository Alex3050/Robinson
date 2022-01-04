// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// Referenced classes of package data:
//			b, k

public final class m
{

	private static m a = null;

	private m()
	{
	}

	public static final m a()
	{
		if (k.a())
		{
			if (a == null)
				a = new m();
			return a;
		} else
		{
			throw new b("Unauthorised operation");
		}
	}

	public final byte[] a(String s)
	{
		byte abyte1[];
label0:
		{
			boolean flag = false;
			byte abyte0[] = new byte[1024];
			abyte1 = null;
			InputStream inputstream = null;
			ByteArrayOutputStream bytearrayoutputstream = null;
			try
			{
				inputstream = getClass().getResourceAsStream("/" + s);
				bytearrayoutputstream = new ByteArrayOutputStream();
				for (int i = 0; i >= 0;)
					if ((i = inputstream.read(abyte0, 0, 1024)) > 0)
						bytearrayoutputstream.write(abyte0, 0, i);

				abyte1 = bytearrayoutputstream.toByteArray();
			}
			catch (Exception )
			{
				try
				{
					if (bytearrayoutputstream != null)
						bytearrayoutputstream.close();
				}
				catch (Exception 2) { }
				try
				{
					if (inputstream != null)
						inputstream.close();
				}
				catch (Exception 2) { }
				break label0;
			}
			finally
			{
				try
				{
					if (bytearrayoutputstream != null)
						bytearrayoutputstream.close();
				}
				catch (Exception ) { }
				try
				{
					if (inputstream != null)
						inputstream.close();
				}
				catch (Exception ) { }
				throw exception;
			}
			try
			{
				bytearrayoutputstream.close();
			}
			catch (Exception ) { }
			try
			{
				if (inputstream != null)
					inputstream.close();
			}
			catch (Exception ) { }
			break label0;
		}
		return abyte1;
	}

}
