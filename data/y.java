// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import java.io.*;

// Referenced classes of package data:
//			ac, c, d, g, 
//			k, p, q, u, 
//			w

public final class y
{

	private p a_data_p;
	private String a_java_lang_String_array1d[];
	private String b_java_lang_String_array1d[];
	private int b_int_array1d[];
	private int c_int_array1d[];
	public int a_int_array1d[];
	private int d_int_array1d[];
	private int c_int;
	private int d_int;
	private int e;
	private int f;
	private String b_java_lang_String;
	private int g;
	private String c_java_lang_String;
	private int h;
	private byte a_byte;
	private int i;
	private String c_java_lang_String_array1d[];
	public String a_java_lang_String;
	public int a_int;
	public int b_int;

	public y(p p1)
	{
		a_java_lang_String_array1d = new String[26];
		b_java_lang_String_array1d = new String[26];
		b_int_array1d = new int[3];
		c_int_array1d = new int[2];
		a_int_array1d = new int[64];
		d_int_array1d = new int[120];
		c_int = 0;
		d_int = 0;
		e = 0;
		f = 0;
		g = 0;
		h = 0;
		a_byte = 0;
		i = 0;
		c_java_lang_String_array1d = new String[50];
		a_data_p = p1;
	}

	public final void a()
	{
		if (a_data_p.ad)
		{
			a_data_p.ad = false;
			a_data_p.n_byte_array1d[0] = 0;
			a_data_p.n_byte_array1d[1] = 1;
			a_data_p.n_byte_array1d[2] = 2;
			a_data_p.n_byte_array1d[3] = 3;
			a_data_p.n_byte_array1d[4] = 4;
			a_data_p.n_byte_array1d[5] = 5;
			a_data_p.n_byte_array1d[6] = 6;
			a_data_p.n_byte_array1d[7] = 7;
			a_data_p.n_byte_array1d[8] = 8;
			a_data_p.n_byte_array1d[9] = 9;
			a_java_lang_String_array1d[0] = "a";
			a_java_lang_String_array1d[1] = "b";
			a_java_lang_String_array1d[2] = "c";
			a_java_lang_String_array1d[3] = "d";
			a_java_lang_String_array1d[4] = "e";
			a_java_lang_String_array1d[5] = "f";
			a_java_lang_String_array1d[6] = "g";
			a_java_lang_String_array1d[7] = "h";
			a_java_lang_String_array1d[8] = "i";
			a_java_lang_String_array1d[9] = "j";
			a_java_lang_String_array1d[10] = "k";
			a_java_lang_String_array1d[11] = "l";
			a_java_lang_String_array1d[12] = "m";
			a_java_lang_String_array1d[13] = "n";
			a_java_lang_String_array1d[14] = "o";
			a_java_lang_String_array1d[15] = "p";
			a_java_lang_String_array1d[16] = "q";
			a_java_lang_String_array1d[17] = "r";
			a_java_lang_String_array1d[18] = "s";
			a_java_lang_String_array1d[19] = "t";
			a_java_lang_String_array1d[20] = "u";
			a_java_lang_String_array1d[21] = "v";
			a_java_lang_String_array1d[22] = "w";
			a_java_lang_String_array1d[23] = "x";
			a_java_lang_String_array1d[24] = "y";
			a_java_lang_String_array1d[25] = "z";
			b_java_lang_String_array1d[0] = "A";
			b_java_lang_String_array1d[1] = "B";
			b_java_lang_String_array1d[2] = "C";
			b_java_lang_String_array1d[3] = "D";
			b_java_lang_String_array1d[4] = "E";
			b_java_lang_String_array1d[5] = "F";
			b_java_lang_String_array1d[6] = "G";
			b_java_lang_String_array1d[7] = "H";
			b_java_lang_String_array1d[8] = "I";
			b_java_lang_String_array1d[9] = "J";
			b_java_lang_String_array1d[10] = "K";
			b_java_lang_String_array1d[11] = "L";
			b_java_lang_String_array1d[12] = "M";
			b_java_lang_String_array1d[13] = "N";
			b_java_lang_String_array1d[14] = "O";
			b_java_lang_String_array1d[15] = "P";
			b_java_lang_String_array1d[16] = "Q";
			b_java_lang_String_array1d[17] = "R";
			b_java_lang_String_array1d[18] = "S";
			b_java_lang_String_array1d[19] = "T";
			b_java_lang_String_array1d[20] = "U";
			b_java_lang_String_array1d[21] = "V";
			b_java_lang_String_array1d[22] = "W";
			b_java_lang_String_array1d[23] = "X";
			b_java_lang_String_array1d[24] = "Y";
			b_java_lang_String_array1d[25] = "Z";
			for (int j = 0; j < 120; j++)
				a_data_p.i[j] = j + 1;

			b_int_array1d[0] = -2;
			b_int_array1d[1] = -2;
			b_int_array1d[2] = -2;
			a_data_p.f_int_array1d[0] = 0xd0003;
			a_data_p.f_int_array1d[1] = 0xd0002;
			a_data_p.f_int_array1d[2] = 0x2003a;
			a_data_p.f_int_array1d[3] = 0xd0004;
			a_data_p.f_int_array1d[4] = 0x20004;
			a_data_p.f_int_array1d[5] = 0xd0014;
			a_data_p.f_int_array1d[6] = 0xd0005;
			a_data_p.f_int_array1d[7] = 0xd0006;
			a_data_p.f_int_array1d[8] = 0xd0007;
			a_data_p.f_int_array1d[9] = 0x60000;
			a_data_p.f_int_array1d[10] = 0x60001;
			a_data_p.f_int_array1d[11] = 0xd000e;
			a_data_p.f_int_array1d[12] = 0xd000f;
			a_data_p.f_int_array1d[13] = 0xd0013;
			a_data_p.f_int_array1d[14] = 0xd0008;
			a_data_p.f_int_array1d[15] = -1;
			a_data_p.f_int_array1d[16] = 0xd0000;
			a_data_p.f_int_array1d[17] = 0x60003;
			a_data_p.f_int_array1d[18] = 0x60013;
			a_data_p.f_int_array1d[19] = 0x60014;
			a_data_p.f_int_array1d[20] = 0xd0037;
			a_data_p.f_int_array1d[21] = 0xd0038;
			a_data_p.f_int_array1d[22] = 0xd003d;
			a_data_p.f_int_array1d[23] = 0xd003e;
			a_data_p.f_int_array1d[24] = 0xd0023;
			a_data_p.f_int_array1d[25] = 0xd0028;
			a_data_p.f_int_array1d[26] = 0xd0027;
			a_data_p.f_int_array1d[27] = 0xd0024;
			a_data_p.f_int_array1d[28] = 0xd0029;
			a_data_p.f_int_array1d[29] = 0xd0054;
			a_data_p.f_int_array1d[30] = 0xd001e;
			a_data_p.f_int_array1d[31] = 0xd001f;
			a_data_p.f_int_array1d[32] = 0xd001d;
			a_data_p.f_int_array1d[33] = 0xd0020;
			a_data_p.f_int_array1d[34] = 0xd0053;
			a_data_p.f_int_array1d[35] = 0xd0026;
			a_data_p.f_int_array1d[36] = 0xd0021;
			a_data_p.f_int_array1d[37] = 0xd0022;
			a_data_p.f_int_array1d[38] = 0xd002f;
			a_data_p.f_int_array1d[39] = 0xd0025;
			a_data_p.f_int_array1d[40] = 0x2001c;
			a_data_p.f_int_array1d[41] = 0x20028;
			a_data_p.f_int_array1d[42] = 0x2000e;
			a_data_p.f_int_array1d[43] = 0x20056;
			a_data_p.f_int_array1d[44] = 0x2000a;
			a_data_p.f_int_array1d[45] = 0xd0017;
			a_data_p.f_int_array1d[46] = 0x20012;
			a_data_p.f_int_array1d[47] = 0x20006;
			a_data_p.f_int_array1d[48] = 0x20034;
			a_data_p.f_int_array1d[49] = 0x2002e;
			a_data_p.f_int_array1d[50] = 0xd0049;
			a_data_p.f_int_array1d[51] = 0x20066;
			a_data_p.f_int_array1d[52] = 0x20046;
			a_data_p.f_int_array1d[53] = 0x2004e;
			a_data_p.f_int_array1d[54] = -1;
			a_data_p.f_int_array1d[55] = 0x2005a;
			a_data_p.f_int_array1d[56] = 0x20022;
			a_data_p.f_int_array1d[57] = 0x20016;
			a_data_p.f_int_array1d[58] = 0x20060;
			a_data_p.f_int_array1d[59] = 0x20040;
			a_data_p.f_int_array1d[60] = -1;
			a_data_p.f_int_array1d[61] = 0x2002a;
			a_data_p.f_int_array1d[62] = 0x20076;
			a_data_p.f_int_array1d[63] = 0x20072;
			a_data_p.f_int_array1d[64] = 0xd0033;
			a_data_p.f_int_array1d[65] = 0xd0036;
			a_data_p.f_int_array1d[66] = 0xd003f;
			a_data_p.f_int_array1d[67] = 0xd003b;
			a_data_p.f_int_array1d[68] = 0xd0034;
			a_data_p.f_int_array1d[69] = 0xd0055;
			a_data_p.f_int_array1d[70] = 0xd0032;
			a_data_p.f_int_array1d[71] = 0xd0035;
			a_data_p.f_int_array1d[72] = 0xd0031;
			a_data_p.f_int_array1d[73] = 0xd0030;
			a_data_p.f_int_array1d[74] = 0xd003c;
			a_data_p.f_int_array1d[75] = 0xd002a;
			a_data_p.f_int_array1d[76] = 0xd0015;
			a_data_p.f_int_array1d[77] = 0xd0040;
			a_data_p.f_int_array1d[78] = 0xd0041;
			a_data_p.f_int_array1d[79] = 0xd0042;
			a_data_p.f_int_array1d[80] = 0xd0043;
			a_data_p.f_int_array1d[81] = 0xd0009;
			a_data_p.f_int_array1d[82] = 0xd0057;
			a_data_p.f_int_array1d[83] = 0xd0012;
			a_data_p.f_int_array1d[84] = 0x60010;
			a_data_p.f_int_array1d[85] = -1;
			a_data_p.f_int_array1d[86] = 0xd0045;
			a_data_p.f_int_array1d[87] = 0xd0046;
			a_data_p.f_int_array1d[88] = 0xd0047;
			a_data_p.f_int_array1d[89] = 0xd0044;
			a_data_p.f_int_array1d[90] = 0xd002b;
			a_data_p.f_int_array1d[91] = 0xd0048;
			a_data_p.f_int_array1d[92] = 0xd004b;
			a_data_p.f_int_array1d[93] = 0xd0039;
			a_data_p.f_int_array1d[94] = 0x60008;
			a_data_p.f_int_array1d[95] = 0xd005b;
			a_data_p.f_int_array1d[96] = 0xd0056;
			a_data_p.f_int_array1d[97] = 0xd0052;
			a_data_p.f_int_array1d[98] = 0xd004d;
			a_data_p.f_int_array1d[99] = 0x50000;
			a_data_p.f_int_array1d[100] = 0x50005;
			a_data_p.f_int_array1d[101] = 0x5000a;
			a_data_p.f_int_array1d[102] = 0x5003c;
			a_data_p.f_int_array1d[103] = 0x50041;
			a_data_p.f_int_array1d[104] = 0x50046;
			a_data_p.f_int_array1d[105] = 0x50078;
			a_data_p.f_int_array1d[106] = 0x5007d;
			a_data_p.f_int_array1d[107] = 0x50082;
			a_data_p.f_int_array1d[108] = 0x500b4;
			a_data_p.f_int_array1d[109] = 0x500b9;
			a_data_p.f_int_array1d[110] = 0x500be;
			a_data_p.f_int_array1d[111] = 0x500f0;
			a_data_p.f_int_array1d[112] = 0x500f4;
			a_data_p.f_int_array1d[113] = 0x500f8;
			a_data_p.f_int_array1d[114] = 0x500fc;
			a_data_p.f_int_array1d[115] = 0xd004e;
			a_data_p.f_int_array1d[116] = 0xd004f;
			a_data_p.f_int_array1d[117] = 0xd0050;
			a_data_p.f_int_array1d[118] = 0xd0051;
			a_data_p.f_int_array1d[119] = 0xd004c;
			c_int_array1d[0] = 0x90002;
			c_int_array1d[1] = 0x90006;
			a_int_array1d[0] = 6;
			a_int_array1d[1] = 10;
			a_int_array1d[2] = 11;
			a_int_array1d[3] = 15;
			a_int_array1d[4] = 16;
			a_int_array1d[5] = 17;
			a_int_array1d[6] = 18;
			a_int_array1d[7] = 19;
			a_int_array1d[8] = 20;
			a_int_array1d[9] = 22;
			a_int_array1d[10] = 23;
			a_int_array1d[11] = 24;
			a_int_array1d[12] = 41;
			a_int_array1d[13] = 42;
			a_int_array1d[14] = 43;
			a_int_array1d[15] = 44;
			a_int_array1d[16] = 45;
			a_int_array1d[17] = 46;
			a_int_array1d[18] = 47;
			a_int_array1d[19] = 48;
			a_int_array1d[20] = 49;
			a_int_array1d[21] = 50;
			a_int_array1d[22] = 51;
			a_int_array1d[23] = 52;
			a_int_array1d[24] = 53;
			a_int_array1d[25] = 54;
			a_int_array1d[26] = 55;
			a_int_array1d[27] = 56;
			a_int_array1d[28] = 57;
			a_int_array1d[29] = 58;
			a_int_array1d[30] = 59;
			a_int_array1d[31] = 60;
			a_int_array1d[32] = 61;
			a_int_array1d[33] = 62;
			a_int_array1d[34] = 63;
			a_int_array1d[35] = 64;
			a_int_array1d[36] = 77;
			a_int_array1d[37] = 78;
			a_int_array1d[38] = 79;
			a_int_array1d[39] = 80;
			a_int_array1d[40] = 81;
			a_int_array1d[41] = 82;
			a_int_array1d[42] = 83;
			a_int_array1d[43] = 84;
			a_int_array1d[44] = 85;
			a_int_array1d[45] = 86;
			a_int_array1d[46] = 87;
			a_int_array1d[47] = 88;
			a_int_array1d[48] = 89;
			a_int_array1d[49] = 90;
			a_int_array1d[50] = 90;
			a_int_array1d[51] = 93;
			a_int_array1d[52] = 94;
			a_int_array1d[53] = 95;
			a_int_array1d[54] = 13;
			a_int_array1d[55] = 39;
			a_int_array1d[56] = 96;
			a_int_array1d[57] = 97;
			a_int_array1d[58] = 39;
			a_int_array1d[59] = 101;
			a_int_array1d[60] = 105;
			a_int_array1d[61] = 109;
			a_int_array1d[62] = 112;
			a_int_array1d[63] = 98;
			a_data_p.a();
			d();
		}
	}

	public final boolean a(int j)
	{
		if (j == 3)
			return true;
		if (j == 5)
			return true;
		if (j >= 41 && j <= 45)
			return true;
		if (j >= 47 && j <= 50)
			return true;
		if (j >= 52 && j <= 54)
			return true;
		if (j >= 56 && j <= 60)
			return true;
		return j >= 62 && j <= 64;
	}

	public final void b()
	{
		for (int j = 0; j < a_data_p.a_data_g.a_int; j++)
			if (a_data_p.a_data_g.a_data_u_array1d[j].m != 1)
			{
				a_data_p.a_data_g.a_data_u_array1d[j].d = a_data_p.a_data_g.a_data_u_array1d[j].b;
				a_data_p.a_data_g.a_data_u_array1d[j].c = a_data_p.a_data_g.a_data_u_array1d[j].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.a_data_u_array1d[j].d * 180 + a_data_p.a_data_g.a_data_u_array1d[j].c] = 51;
			}

		for (int l = 0; l < a_data_p.a_data_g.b_int; l++)
			if (a_data_p.a_data_g.b_data_u_array1d[l].m != 1)
			{
				a_data_p.a_data_g.b_data_u_array1d[l].d = a_data_p.a_data_g.b_data_u_array1d[l].b;
				a_data_p.a_data_g.b_data_u_array1d[l].c = a_data_p.a_data_g.b_data_u_array1d[l].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.b_data_u_array1d[l].d * 180 + a_data_p.a_data_g.b_data_u_array1d[l].c] = 52;
			}

		for (int i1 = 0; i1 < a_data_p.a_data_g.c_int; i1++)
			if (a_data_p.a_data_g.c_data_u_array1d[i1].m != 1)
			{
				a_data_p.a_data_g.c_data_u_array1d[i1].d = a_data_p.a_data_g.c_data_u_array1d[i1].b;
				a_data_p.a_data_g.c_data_u_array1d[i1].c = a_data_p.a_data_g.c_data_u_array1d[i1].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.c_data_u_array1d[i1].d * 180 + a_data_p.a_data_g.c_data_u_array1d[i1].c] = 53;
			}

		for (int j1 = 0; j1 < a_data_p.a_data_g.d_int; j1++)
			if (a_data_p.a_data_g.d_data_u_array1d[j1].m != 1)
			{
				a_data_p.a_data_g.d_data_u_array1d[j1].d = a_data_p.a_data_g.d_data_u_array1d[j1].b;
				a_data_p.a_data_g.d_data_u_array1d[j1].c = a_data_p.a_data_g.d_data_u_array1d[j1].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.d_data_u_array1d[j1].d * 180 + a_data_p.a_data_g.d_data_u_array1d[j1].c] = 54;
			}

		for (int k1 = 0; k1 < a_data_p.a_data_g.e_int; k1++)
			if (a_data_p.a_data_g.e_data_u_array1d[k1].m != 1)
			{
				a_data_p.a_data_g.e_data_u_array1d[k1].d = a_data_p.a_data_g.e_data_u_array1d[k1].b;
				a_data_p.a_data_g.e_data_u_array1d[k1].c = a_data_p.a_data_g.e_data_u_array1d[k1].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.e_data_u_array1d[k1].d * 180 + a_data_p.a_data_g.e_data_u_array1d[k1].c] = 55;
			}

		for (int l1 = 0; l1 < a_data_p.a_data_g.f_int; l1++)
			if (a_data_p.a_data_g.f_data_u_array1d[l1].m != 1)
			{
				a_data_p.a_data_g.f_data_u_array1d[l1].d = a_data_p.a_data_g.f_data_u_array1d[l1].b;
				a_data_p.a_data_g.f_data_u_array1d[l1].c = a_data_p.a_data_g.f_data_u_array1d[l1].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.f_data_u_array1d[l1].d * 180 + a_data_p.a_data_g.f_data_u_array1d[l1].c] = 63;
			}

		for (int i2 = 0; i2 < a_data_p.a_data_g.g_int; i2++)
			if (a_data_p.a_data_g.g_data_u_array1d[i2].m != 1)
			{
				a_data_p.a_data_g.g_data_u_array1d[i2].d = a_data_p.a_data_g.g_data_u_array1d[i2].b;
				a_data_p.a_data_g.g_data_u_array1d[i2].c = a_data_p.a_data_g.g_data_u_array1d[i2].a;
				a_data_p.l_byte_array1d[a_data_p.a_data_g.g_data_u_array1d[i2].d * 180 + a_data_p.a_data_g.g_data_u_array1d[i2].c] = 64;
			}

		for (int j2 = 0; j2 < a_data_p.a_data_g.m; j2++)
		{
			a_data_p.a_data_g.a_data_d_array1d[j2].d = a_data_p.a_data_g.a_data_d_array1d[j2].b;
			a_data_p.a_data_g.a_data_d_array1d[j2].c = a_data_p.a_data_g.a_data_d_array1d[j2].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.a_data_d_array1d[j2].d * 180 + a_data_p.a_data_g.a_data_d_array1d[j2].c] = 43;
		}

		for (int k2 = 0; k2 < a_data_p.a_data_g.n; k2++)
		{
			a_data_p.a_data_g.b_data_d_array1d[k2].d = a_data_p.a_data_g.b_data_d_array1d[k2].b;
			a_data_p.a_data_g.b_data_d_array1d[k2].c = a_data_p.a_data_g.b_data_d_array1d[k2].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.b_data_d_array1d[k2].d * 180 + a_data_p.a_data_g.b_data_d_array1d[k2].c] = 44;
		}

		for (int l2 = 0; l2 < a_data_p.a_data_g.o; l2++)
		{
			a_data_p.a_data_g.c_data_d_array1d[l2].d = a_data_p.a_data_g.c_data_d_array1d[l2].b;
			a_data_p.a_data_g.c_data_d_array1d[l2].c = a_data_p.a_data_g.c_data_d_array1d[l2].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.c_data_d_array1d[l2].d * 180 + a_data_p.a_data_g.c_data_d_array1d[l2].c] = 49;
		}

		for (int i3 = 0; i3 < a_data_p.a_data_g.p; i3++)
		{
			a_data_p.a_data_g.d_data_d_array1d[i3].d = a_data_p.a_data_g.d_data_d_array1d[i3].b;
			a_data_p.a_data_g.d_data_d_array1d[i3].c = a_data_p.a_data_g.d_data_d_array1d[i3].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.d_data_d_array1d[i3].d * 180 + a_data_p.a_data_g.d_data_d_array1d[i3].c] = 50;
		}

		for (int j3 = 0; j3 < a_data_p.a_data_g.t; j3++)
		{
			a_data_p.a_data_g.a_data_q_array1d[j3].d = a_data_p.a_data_g.a_data_q_array1d[j3].b;
			a_data_p.a_data_g.a_data_q_array1d[j3].c = a_data_p.a_data_g.a_data_q_array1d[j3].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.a_data_q_array1d[j3].d * 180 + a_data_p.a_data_g.a_data_q_array1d[j3].c] = 5;
		}

		for (int k3 = 0; k3 < a_data_p.a_data_g.u; k3++)
		{
			a_data_p.a_data_g.b_data_q_array1d[k3].d = a_data_p.a_data_g.b_data_q_array1d[k3].b;
			a_data_p.a_data_g.b_data_q_array1d[k3].c = a_data_p.a_data_g.b_data_q_array1d[k3].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.b_data_q_array1d[k3].d * 180 + a_data_p.a_data_g.b_data_q_array1d[k3].c] = 45;
		}

		for (int l3 = 0; l3 < a_data_p.a_data_g.v; l3++)
		{
			a_data_p.a_data_g.c_data_q_array1d[l3].d = a_data_p.a_data_g.c_data_q_array1d[l3].b;
			a_data_p.a_data_g.c_data_q_array1d[l3].c = a_data_p.a_data_g.c_data_q_array1d[l3].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.c_data_q_array1d[l3].d * 180 + a_data_p.a_data_g.c_data_q_array1d[l3].c] = 46;
		}

		for (int i4 = 0; i4 < a_data_p.a_data_g.w; i4++)
		{
			a_data_p.a_data_g.d_data_q_array1d[i4].d = a_data_p.a_data_g.d_data_q_array1d[i4].b;
			a_data_p.a_data_g.d_data_q_array1d[i4].c = a_data_p.a_data_g.d_data_q_array1d[i4].a;
			a_data_p.l_byte_array1d[a_data_p.a_data_g.d_data_q_array1d[i4].d * 180 + a_data_p.a_data_g.d_data_q_array1d[i4].c] = 47;
		}

	}

	public final void c()
	{
		a_data_p.a_int_array1d[0] = -1;
		a_data_p.b_int_array1d[0] = -1;
		a_data_p.c_int_array1d[0] = -1;
		a_data_p.d_int_array1d[0] = -1;
		a_data_p.H = a_data_p.I = a_data_p.J = a_data_p.K = 1;
	}

	private void g()
	{
		b_int_array1d[0] = -2;
		b_int_array1d[1] = -2;
		b_int_array1d[2] = -2;
		d_int = 0;
		e = 0;
		f = 0;
		c_int = 0;
		b_java_lang_String = null;
		g = 0;
		c_java_lang_String = null;
		h = 0;
	}

	private String a(byte byte0)
	{
		a_java_lang_String = null;
		for (int j = 0; j < 26; j++)
		{
			if (byte0 == 65 + j)
				a_java_lang_String = b_java_lang_String_array1d[j];
			if (byte0 == 97 + j)
				a_java_lang_String = a_java_lang_String_array1d[j];
		}

		for (int l = 0; l < a_data_p.n_byte_array1d.length; l++)
			if (byte0 == 48 + l)
				a_java_lang_String = (new Integer(a_data_p.n_byte_array1d[l])).toString();

		if (byte0 == 44)
			a_java_lang_String = ",";
		if (byte0 == 46)
			a_java_lang_String = ".";
		if (byte0 == -110 || byte0 == 39)
			a_java_lang_String = "'";
		if (byte0 == 32)
			a_java_lang_String = " ";
		if (byte0 == 33)
			a_java_lang_String = "!";
		if (byte0 == 63)
			a_java_lang_String = "?";
		if (byte0 == 95)
			a_java_lang_String = "_";
		if (byte0 == 45)
			a_java_lang_String = "-";
		if (byte0 == -23)
			a_java_lang_String = "\351";
		if (byte0 == -32)
			a_java_lang_String = "\340";
		if (byte0 == -24)
			a_java_lang_String = "\350";
		return a_java_lang_String;
	}

	private int a(byte byte0)
	{
		a_int = 0;
		for (int j = 0; j < 10; j++)
		{
			if (byte0 == 48 + j)
				a_int = 0 + j;
			if (byte0 == 45)
				a_int = -1;
		}

		return a_int;
	}

	private String a(String as[])
	{
		b_int = 0;
		c_java_lang_String = "";
		for (; as[b_int] != null; b_int++);
		for (int j = 0; j < b_int; j++)
			c_java_lang_String = c_java_lang_String.concat(as[j]);

		return c_java_lang_String;
	}

	private int a(int ai[])
	{
		if (ai[1] == -2)
			return ai[0];
		if (ai[2] == -2)
		{
			if (ai[0] < 0)
				ai[1] = -ai[1];
			return ai[0] * 10 + ai[1];
		} else
		{
			return ai[0] * 100 + ai[1] * 10 + ai[2];
		}
	}

	public final void d()
	{
		int j = 3;
		boolean flag = false;
		a_data_p.a_data_ac.a(1);
		for (int l = 0; l < 120; l++)
			a_data_p.b_java_lang_String_array1d[l] = a_data_p.a_data_ac.a(0x10000 + l).toString();

		a_data_p.a_data_ac.b(1);
		a_data_p.a();
		a_data_p.a_data_ac.a(2);
		for (int i1 = 0; i1 < 60; i1++)
			a_data_p.c_java_lang_String_array1d[i1] = a_data_p.a_data_ac.a(0x20000 + i1).toString();

		a_data_p.a_data_ac.b(2);
		a_data_p.a();
		try
		{
			InputStream inputstream = getClass().getResourceAsStream("/objects.csv");
			DataInputStream datainputstream = new DataInputStream(inputstream);
			byte byte0;
			if (inputstream != null)
				while ((byte0 = datainputstream.readByte()) != 64) 
				{
					switch (j)
					{
					case 3: // '\003'
						a(byte0, a_data_p.b_byte_array1d);
						break;

					case 4: // '\004'
						a(byte0, a_data_p.c_byte_array1d);
						break;

					case 5: // '\005'
						a(byte0, a_data_p.d_byte_array1d);
						break;

					case 6: // '\006'
						a(byte0, a_data_p.j);
						break;

					case 7: // '\007'
						a(byte0, a_data_p.k);
						break;

					case 8: // '\b'
						a(byte0, a_data_p.l_int_array1d);
						break;

					case 9: // '\t'
						if (byte0 != 13 || d_int == 119)
							a(byte0);
						break;

					case 10: // '\n'
						a(byte0, a_data_p.n_int_array1d);
						break;

					case 11: // '\013'
						a(byte0, a_data_p.a_byte_array2d);
						break;

					case 12: // '\f'
						a(byte0, a_data_p.b_byte_array2d);
						break;

					case 13: // '\r'
						a(byte0, a_data_p.e);
						break;

					case 14: // '\016'
						a(byte0, d_int_array1d);
						break;

					case 15: // '\017'
						a(byte0, a_data_p.f_byte_array1d);
						break;
					}
					if (byte0 == 13)
					{
						g();
						j++;
					}
				}
			d_int = 0;
			return;
		}
		catch (Exception exception)
		{
			System.out.println("Erreur lecture fichier objets.csv " + d_int + " " + j);
			exception.printStackTrace();
			return;
		}
	}

	private void a(byte byte0, byte abyte0[])
	{
		if (byte0 == 59 || byte0 == 13)
		{
			a_byte = (byte)a(b_int_array1d);
			abyte0[d_int] = a_byte;
			d_int++;
			f = 0;
			for (int j = 0; j <= 2; j++)
				b_int_array1d[j] = -2;

			return;
		}
		if (byte0 == 10)
		{
			d_int = 0;
			return;
		}
		if (b_int_array1d[0] != -1)
		{
			e = a(byte0);
			b_int_array1d[f] = e;
			f++;
		}
	}

	private void a(byte byte0, int ai[])
	{
		if (byte0 == 59 || byte0 == 13)
		{
			c_int = a(b_int_array1d);
			ai[d_int] = c_int;
			d_int++;
			f = 0;
			for (int j = 0; j <= 2; j++)
				b_int_array1d[j] = -2;

			return;
		}
		if (byte0 == 10)
		{
			d_int = 0;
			return;
		}
		if (b_int_array1d[0] != -1)
		{
			e = a(byte0);
			b_int_array1d[f] = e;
			f++;
		}
	}

	private void a(byte byte0)
	{
		if (byte0 == 59 || byte0 == 13)
		{
			c_int = a(b_int_array1d);
			a_data_p.m_int_array1d[d_int] = c_int;
			d_int++;
			f = 0;
			for (int j = 0; j <= 2; j++)
				b_int_array1d[j] = -2;

			return;
		}
		if (byte0 == 10)
			return;
		if (byte0 == 45)
		{
			i = -1;
			return;
		}
		e = a(byte0);
		if (i == -1)
		{
			e = i * e;
			i = 0;
		}
		b_int_array1d[f] = e;
		f++;
	}

	private void a(byte byte0, byte abyte0[][])
	{
		if (byte0 == 59 || byte0 == 13)
		{
			c_java_lang_String_array1d[g] = null;
			c_java_lang_String = a(c_java_lang_String_array1d);
			c_int = (new Integer(Integer.parseInt(c_java_lang_String))).intValue();
			abyte0[d_int][h] = (byte)c_int;
			d_int++;
			g = 0;
			h = 0;
			return;
		}
		if (byte0 == 10)
		{
			d_int = 0;
			return;
		}
		if (byte0 == 124 || byte0 == 35)
		{
			if (byte0 == 124)
			{
				c_java_lang_String_array1d[g] = null;
				c_java_lang_String = a(c_java_lang_String_array1d);
				c_int = (new Integer(Integer.parseInt(c_java_lang_String))).intValue();
				for (int j = 0; j < 120; j++)
					if (c_int == j)
						c_int = j;

				abyte0[d_int][h] = (byte)c_int;
				h++;
				g = 0;
			}
			if (byte0 == 35)
			{
				c_java_lang_String_array1d[g] = null;
				c_java_lang_String = a(c_java_lang_String_array1d);
				c_int = (new Integer(Integer.parseInt(c_java_lang_String))).intValue();
				abyte0[d_int][h] = (byte)c_int;
				h++;
				g = 0;
				return;
			}
		} else
		{
			b_java_lang_String = a(byte0);
			c_java_lang_String_array1d[g] = b_java_lang_String;
			g++;
		}
	}

	private boolean c(int j)
	{
		return j == 23 || j == 24 || j == 77 || j == 78 || j == 79 || j == 80 || j == 81 || j == 90 || j == 93 || j == 97 || j == 98;
	}

	public final boolean b(int j)
	{
		return j == 21 || j == 38 || j == 93;
	}

	public final void e()
	{
		int j = 0;
		int l = 0;
		try
		{
			for (int i1 = a_data_p.ac - 1; i1 <= a_data_p.ac + a_data_p.O + 2; i1++)
			{
				for (int j1 = a_data_p.ab - 1; j1 < a_data_p.ab + a_data_p.N + 2; j1++)
				{
					if (i1 >= 0 && j1 >= 0 && i1 < 180 && j1 < 180 && a_data_p.l_byte_array1d[j1 + i1 * 180] != 0 && a_data_p.l_byte_array1d[j1 + i1 * 180] != 5 && (a_data_p.l_byte_array1d[j1 + i1 * 180] < 42 || a_data_p.l_byte_array1d[j1 + i1 * 180] > 56) && (a_data_p.l_byte_array1d[j1 + i1 * 180] < 62 || a_data_p.l_byte_array1d[j1 + i1 * 180] > 64))
					{
						if (a_data_p.l_byte_array1d[j1 + i1 * 180] != 85 && a_data_p.l_byte_array1d[j1 + i1 * 180] != 95 && a_data_p.l_byte_array1d[j1 + i1 * 180] != 96)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, 0x90003, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + (a_data_p.M / 3) * 2 + 2);
						a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1], ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
						if (a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1] == 0x60003)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, (((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2) - 24);
						else
						if (a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1] == 0x60000)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2 + 7, (((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2) - 22);
						else
						if (a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1] == 0x60001)
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, (((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2) - 25);
						else
						if (a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1] == 0x60013)
						{
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], (((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M * 2) + a_data_p.U) - 1, (((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M) - 84 - 6);
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], (a_data_p.aM_int + a_data_p.M * j + a_data_p.U + a_data_p.M / 2) - 1, (a_data_p.aN + a_data_p.M * l + a_data_p.V_int + a_data_p.M / 2) - 84 - 6);
						} else
						if (a_data_p.f_int_array1d[a_data_p.l_byte_array1d[j1 + i1 * 180] - 1] == 0x60014)
						{
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], (((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M * 2) + a_data_p.U) - 1, (((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M) - 91);
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.a_data_c.a[0], (a_data_p.aM_int + a_data_p.M * j + a_data_p.U + a_data_p.M / 2) - 1, ((a_data_p.aN + a_data_p.M * l + a_data_p.V_int + a_data_p.M / 2) - 91) + 10);
						}
						if (c(a_data_p.l_byte_array1d[j1 + i1 * 180]) && a_data_p.E > 4000L)
							if (a_data_p.E < 4100L)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0058, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
							else
							if (a_data_p.E < 4200L)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0059, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
							else
							if (a_data_p.E < 4300L)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd005a, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
							else
							if (a_data_p.E < 4400L)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0059, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
							else
							if (a_data_p.E < 4500L)
								a_data_p.a_data_w.a(((k) (a_data_p)).a, 0xd0058, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
							else
								a_data_p.E = 0L;
						if (b(a_data_p.l_byte_array1d[j1 + i1 * 180] - 1) && a_data_p.aM_boolean && (a_data_p.X && j1 + i1 * 180 == a_data_p.P + 180 || a_data_p.Y && j1 + i1 * 180 == a_data_p.P + 180 + 2 || a_data_p.V_boolean && j1 + i1 * 180 == a_data_p.P + 1 || a_data_p.W && j1 + i1 * 180 == a_data_p.P + 360 + 1))
							a_data_p.a_data_w.a(((k) (a_data_p)).a, a_data_p.aS, ((a_data_p.aM_int + a_data_p.M * j) - a_data_p.M) + a_data_p.U + a_data_p.M / 2, ((a_data_p.aN + a_data_p.M * l) - a_data_p.M) + a_data_p.V_int + a_data_p.M / 2);
					}
					j++;
				}

				j = 0;
				l++;
			}

			return;
		}
		catch (Exception exception)
		{
			System.out.println("Erreur Object " + j + " " + l);
			exception.printStackTrace();
			return;
		}
	}

	public final void f()
	{
		for (int j = 0; j < a_data_p.a_data_g.a_int; j++)
			if (a_data_p.a_data_g.a_data_u_array1d[j].a() && a_data_p.a_data_g.a_data_u_array1d[j].m == 1)
			{
				a_data_p.a_data_g.a_data_u_array1d[j].a((a_data_p.a_data_g.a_data_u_array1d[j].c - a_data_p.ab) + 1, (a_data_p.a_data_g.a_data_u_array1d[j].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.a_data_u_array1d[j].a();
			}

		for (int l = 0; l < a_data_p.a_data_g.b_int; l++)
			if (a_data_p.a_data_g.b_data_u_array1d[l].a() && a_data_p.a_data_g.b_data_u_array1d[l].m == 1)
			{
				a_data_p.a_data_g.b_data_u_array1d[l].a((a_data_p.a_data_g.b_data_u_array1d[l].c - a_data_p.ab) + 1, (a_data_p.a_data_g.b_data_u_array1d[l].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.b_data_u_array1d[l].a();
			}

		for (int i1 = 0; i1 < a_data_p.a_data_g.c_int; i1++)
			if (a_data_p.a_data_g.c_data_u_array1d[i1].a() && a_data_p.a_data_g.c_data_u_array1d[i1].m == 1)
			{
				a_data_p.a_data_g.c_data_u_array1d[i1].a((a_data_p.a_data_g.c_data_u_array1d[i1].c - a_data_p.ab) + 1, (a_data_p.a_data_g.c_data_u_array1d[i1].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.c_data_u_array1d[i1].a();
			}

		for (int j1 = 0; j1 < a_data_p.a_data_g.d_int; j1++)
			if (a_data_p.a_data_g.d_data_u_array1d[j1].a() && a_data_p.a_data_g.d_data_u_array1d[j1].m == 1)
			{
				a_data_p.a_data_g.d_data_u_array1d[j1].a((a_data_p.a_data_g.d_data_u_array1d[j1].c - a_data_p.ab) + 1, (a_data_p.a_data_g.d_data_u_array1d[j1].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.d_data_u_array1d[j1].a();
			}

		for (int k1 = 0; k1 < a_data_p.a_data_g.e_int; k1++)
			if (a_data_p.a_data_g.e_data_u_array1d[k1].a() && a_data_p.a_data_g.e_data_u_array1d[k1].m == 1)
			{
				a_data_p.a_data_g.e_data_u_array1d[k1].a((a_data_p.a_data_g.e_data_u_array1d[k1].c - a_data_p.ab) + 1, (a_data_p.a_data_g.e_data_u_array1d[k1].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.e_data_u_array1d[k1].a();
			}

		for (int l1 = 0; l1 < a_data_p.a_data_g.f_int; l1++)
			if (a_data_p.a_data_g.f_data_u_array1d[l1].a() && a_data_p.a_data_g.f_data_u_array1d[l1].m == 1)
			{
				a_data_p.a_data_g.f_data_u_array1d[l1].a((a_data_p.a_data_g.f_data_u_array1d[l1].c - a_data_p.ab) + 1, (a_data_p.a_data_g.f_data_u_array1d[l1].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.f_data_u_array1d[l1].a();
			}

		for (int i2 = 0; i2 < a_data_p.a_data_g.g_int; i2++)
			if (a_data_p.a_data_g.g_data_u_array1d[i2].a() && a_data_p.a_data_g.g_data_u_array1d[i2].m == 1)
			{
				a_data_p.a_data_g.g_data_u_array1d[i2].a((a_data_p.a_data_g.g_data_u_array1d[i2].c - a_data_p.ab) + 1, (a_data_p.a_data_g.g_data_u_array1d[i2].d - a_data_p.ac) + 1);
				if (a_data_p.m_int != 2)
					a_data_p.a_data_g.g_data_u_array1d[i2].a();
			}

	}
}
