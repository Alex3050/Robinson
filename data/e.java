// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

// Referenced classes of package data:
//			b, k, z

public final class e
{

	private static e a = null;

	private e()
	{
	}

	public static final e a()
	{
		if (k.a())
		{
			if (a == null)
				a = new e();
			return a;
		} else
		{
			throw new b("Unauthorised operation");
		}
	}

	public final void a(String s, int i, int j, byte abyte0[])
		throws z
	{
		Object obj = null;
		i++;
		try
		{
			RecordStore recordstore;
			for (int i1 = (recordstore = RecordStore.openRecordStore(s, true)).getNumRecords(); i1 < i; i1++)
				recordstore.addRecord(null, 0, 0);

			int l;
			if ((l = recordstore.getSizeAvailable() + recordstore.getRecordSize(i)) < j)
			{
				recordstore.closeRecordStore();
				throw new z("Not enought space");
			}
			recordstore.setRecord(i, abyte0, 0, j);
			if (recordstore != null)
				recordstore.closeRecordStore();
			return;
		}
		catch (RecordStoreException recordstoreexception)
		{
			throw new z("CelsiusRecordStoreManager: " + recordstoreexception.getMessage());
		}
	}

	public final byte[] a(String s, int i)
		throws z
	{
		Object obj = null;
		i++;
		byte abyte0[];
		try
		{
			RecordStore recordstore;
			int j;
			if ((j = (recordstore = RecordStore.openRecordStore(s, false)).getNumRecords()) < i)
				return null;
			abyte0 = recordstore.getRecord(i);
			if (recordstore != null)
				recordstore.closeRecordStore();
		}
		catch (RecordStoreException recordstoreexception)
		{
			throw new z("CelsiusRecordStoreManager: " + recordstoreexception.getMessage());
		}
		return abyte0;
	}

}
