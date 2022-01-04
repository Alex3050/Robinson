// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package data;

import Robinson.MyMidlet;
import java.util.Vector;
import javax.microedition.lcdui.*;
import javax.microedition.rms.RecordStore;

// Referenced classes of package data:
//			k, a, aa, ab, 
//			ac, ad, c, g, 
//			h, j, n, r, 
//			s, t, v, w, 
//			x, y

public final class p extends k
	implements Runnable
{

	public MyMidlet a_Robinson_MyMidlet;
	private boolean aQ_boolean;
	public w a_data_w;
	public ac a_data_ac;
	public int a_int;
	public boolean a_boolean;
	public String a_java_lang_String;
	public int b_int;
	public boolean b_boolean;
	private boolean aR_boolean;
	public boolean c_boolean;
	public int c_int;
	public boolean d_boolean;
	public long a_long;
	public StringBuffer a_java_lang_StringBuffer;
	public long b_long;
	public boolean e_boolean;
	public long c_long;
	public long d_long;
	public long e_long;
	private long L_long;
	public long f_long;
	private long M_long;
	public long g_long;
	private long N_long;
	private long O_long;
	public long h_long;
	public long i_long;
	public long j_long;
	public long k_long;
	public long l_long;
	public long m_long;
	public long n_long;
	public long o_long;
	public long p_long;
	public long q_long;
	private long P_long;
	private long Q_long;
	public long r_long;
	private long R_long;
	public long s_long;
	public long t_long;
	public long u_long;
	public long v_long;
	public long w_long;
	public long x_long;
	public long y_long;
	public long z_long;
	public long A_long;
	public long B_long;
	public long C_long;
	public long D_long;
	public long E_long;
	public long F_long;
	public long G_long;
	public long H_long;
	public long I_long;
	public boolean f_boolean;
	public boolean g_boolean;
	public boolean h_boolean;
	public boolean i_boolean;
	public boolean j_boolean;
	public boolean k_boolean;
	public int d_int;
	public int e_int;
	public Vector a_java_util_Vector;
	public int f_int;
	public int g_int;
	public Vector b_java_util_Vector;
	public boolean l_boolean;
	public int h_int;
	public int i_int;
	public boolean m_boolean;
	public boolean n_boolean;
	public boolean o_boolean;
	public long J_long;
	public long K_long;
	public int j_int;
	private boolean aS_boolean;
	public boolean p_boolean;
	public boolean q_boolean;
	public boolean r_boolean;
	public boolean s_boolean;
	public int k_int;
	public int l_int;
	public int m_int;
	public int n_int;
	public int o_int;
	public int p_int;
	public int q_int;
	public int r_int;
	public int s_int;
	public int t_int;
	public int u_int;
	public int v_int;
	public int w_int;
	public int x_int;
	public int y_int;
	public int z_int;
	public int A_int;
	public int B_int;
	public int C_int;
	public int D_int;
	public int E_int;
	public int F_int;
	public int G_int;
	public int H_int;
	public int I_int;
	public int J_int;
	public int K_int;
	public boolean t_boolean;
	public boolean u_boolean;
	public boolean v_boolean;
	public int a_int_array1d[];
	public int b_int_array1d[];
	public int c_int_array1d[];
	public int d_int_array1d[];
	public boolean w_boolean;
	public boolean x_boolean;
	public boolean y_boolean;
	public boolean z_boolean;
	public boolean A_boolean;
	public boolean B_boolean;
	public boolean C_boolean;
	public boolean D_boolean;
	public boolean E_boolean;
	public boolean F_boolean;
	private int bw;
	public boolean G_boolean;
	public boolean H_boolean;
	public boolean I_boolean;
	public boolean J_boolean;
	public boolean K_boolean;
	public boolean L_boolean;
	public boolean M_boolean;
	public boolean N_boolean;
	public boolean O_boolean;
	public boolean P_boolean;
	public boolean Q_boolean;
	public boolean R_boolean;
	public float a_float;
	public float b_float;
	public float c_float;
	public float d_float;
	public float e_float;
	public float f_float;
	public float g_float;
	public int L_int;
	public int M_int;
	public int N_int;
	public int O_int;
	public int P_int;
	public int e_int_array1d[];
	public boolean S_boolean;
	public int Q_int;
	public int R_int;
	public int S_int;
	public int T_int;
	public int U_int;
	public int V_int;
	public int W_int;
	public int X_int;
	public int Y_int;
	public int Z_int;
	public int aa_int;
	public int ab_int;
	public int ac_int;
	public boolean T_boolean;
	public boolean U_boolean;
	public boolean V_boolean;
	public boolean W_boolean;
	public boolean X_boolean;
	public boolean Y_boolean;
	public boolean Z_boolean;
	public boolean aa_boolean;
	public boolean ab_boolean;
	public boolean ac_boolean;
	public int ad_int;
	public int ae_int;
	public int af_int;
	public int ag_int;
	public int ah_int;
	public int ai_int;
	public int aj_int;
	public int ak_int;
	public int al_int;
	public int am_int;
	public int an_int;
	public boolean ad_boolean;
	public int ao_int;
	public boolean ae_boolean;
	public int ap_int;
	public int aq_int;
	public int ar_int;
	public int as_int;
	public int at_int;
	public int au_int;
	public boolean af_boolean;
	public int f_int_array1d[];
	public byte a_byte_array1d[];
	public int g_int_array1d[];
	public int av_int;
	public String a_java_lang_String_array1d[];
	public int h_int_array1d[];
	public int aw_int;
	public int i_int_array1d[];
	public String b_java_lang_String_array1d[];
	public String c_java_lang_String_array1d[];
	public byte b_byte_array1d[];
	public byte c_byte_array1d[];
	public byte d_byte_array1d[];
	public int j_int_array1d[];
	public int k_int_array1d[];
	public int l_int_array1d[];
	public int m_int_array1d[];
	public int n_int_array1d[];
	public byte a_byte_array2d[][];
	public byte b_byte_array2d[][];
	public byte e_byte_array1d[];
	public byte f_byte_array1d[];
	public int o_int_array1d[];
	public int p_int_array1d[];
	public String d_java_lang_String_array1d[];
	public int ax_int;
	public String e_java_lang_String_array1d[];
	public int ay_int;
	public String f_java_lang_String_array1d[];
	public int az_int;
	public byte g_byte_array1d[];
	public byte h_byte_array1d[];
	public byte i_byte_array1d[];
	public byte j_byte_array1d[];
	public short a_short_array1d[];
	public byte k_byte_array1d[];
	public byte l_byte_array1d[];
	public String g_java_lang_String_array1d[];
	public int aA_int;
	public byte m_byte_array1d[];
	public int q_int_array1d[];
	public int aB_int;
	public int r_int_array1d[];
	public int aC_int;
	public int s_int_array1d[];
	public int aD_int;
	public int t_int_array1d[];
	public int u_int_array1d[];
	public byte n_byte_array1d[];
	public int aE_int;
	public int aF_int;
	public boolean ag_boolean;
	public boolean ah_boolean;
	public boolean ai_boolean;
	public int aG_int;
	public int v_int_array1d[];
	public int aH_int;
	public StringBuffer b_java_lang_StringBuffer;
	public StringBuffer c_java_lang_StringBuffer;
	public boolean aj_boolean;
	public boolean ak_boolean;
	public boolean al_boolean;
	public boolean am_boolean;
	public boolean an_boolean;
	public boolean ao_boolean;
	public boolean ap_boolean;
	public boolean aq_boolean;
	public boolean ar_boolean;
	public boolean as_boolean;
	public boolean at_boolean;
	public boolean au_boolean;
	public boolean av_boolean;
	public ad a_data_ad;
	public ab a_data_ab;
	public c a_data_c;
	public v a_data_v;
	public a a_data_a;
	public g a_data_g;
	public y a_data_y;
	public aa a_data_aa;
	public r a_data_r;
	public s a_data_s;
	public n a_data_n;
	public x a_data_x;
	public t a_data_t;
	public j a_data_j;
	public h a_data_h;
	private boolean aT_boolean;
	public boolean aw_boolean;
	public boolean ax_boolean;
	public int aI_int;
	public int aJ_int;
	public boolean ay_boolean;
	public boolean az_boolean;
	public boolean aA_boolean;
	public int aK_int;
	public int aL_int;
	public int aM_int;
	public int aN_int;
	private int bx;
	public boolean aB_boolean;
	public boolean aC_boolean;
	public boolean aD_boolean;
	public boolean aE_boolean;
	public boolean aF_boolean;
	public boolean aG_boolean;
	public boolean aH_boolean;
	public boolean aI_boolean;
	public boolean aJ_boolean;
	public int aO_int;
	public boolean aK_boolean;
	public boolean aL_boolean;
	public int aP_int;
	public int aQ_int;
	public int aR_int;
	public int aS_int;
	public boolean aM_boolean;
	public boolean aN_boolean;
	public boolean aO_boolean;
	public boolean aP_boolean;
	public int aT_int;
	public int aU;
	public int aV;
	public int aW;
	public int aX;
	public int aY;
	public int aZ;
	public int ba;
	public int bb;
	public int bc;
	public int bd;
	public int be;
	public int bf;
	public int bg;
	public int bh;
	public int bi;
	public int bj;
	public int bk;
	public int bl;
	public int bm;
	public static final int w_int_array1d_static[] = {
		4128, 4101, 4100, 4102, 4097, 4112, 4098, 4105, 4104, 4106, 
		4096, 8192, 16, 128, 128, 16384, 32768, 80, 4, 8, 
		1, 2, 16, 4, 8, 1, 2, 80, 16, 16, 
		16, 16, 16, 128, 256
	};
	public int bn;

	public p(MyMidlet mymidlet)
	{
		aQ_boolean = false;
		a_int = 1;
		a_boolean = false;
		b_int = 5;
		b_boolean = false;
		aR_boolean = true;
		c_boolean = false;
		c_int = 0;
		d_boolean = true;
		a_long = 0L;
		b_long = 0L;
		e_boolean = false;
		c_long = 0L;
		d_long = 0L;
		e_long = 0L;
		L_long = 0L;
		f_long = 0L;
		M_long = 0L;
		g_long = 0L;
		N_long = 0L;
		O_long = 0L;
		h_long = 0L;
		i_long = 0L;
		j_long = 0L;
		k_long = 60000L;
		l_long = 0L;
		m_long = 0L;
		n_long = 0L;
		o_long = 0L;
		p_long = 0L;
		q_long = 0L;
		P_long = 0L;
		Q_long = 0L;
		r_long = 0L;
		R_long = 0L;
		s_long = 0L;
		t_long = 0L;
		u_long = 0L;
		v_long = 0L;
		w_long = 0L;
		x_long = 0L;
		y_long = 0L;
		z_long = 0L;
		A_long = 0L;
		B_long = 0L;
		C_long = 0L;
		D_long = 0L;
		E_long = 0L;
		F_long = 0L;
		G_long = 0L;
		H_long = 0L;
		I_long = 0L;
		f_boolean = false;
		g_boolean = false;
		h_boolean = false;
		i_boolean = false;
		j_boolean = false;
		k_boolean = false;
		d_int = 0;
		e_int = 11;
		a_java_util_Vector = new Vector(0, 1);
		f_int = 0;
		g_int = 1;
		b_java_util_Vector = new Vector(0, 1);
		l_boolean = true;
		h_int = 0;
		i_int = 0;
		m_boolean = true;
		n_boolean = true;
		o_boolean = false;
		J_long = 0L;
		K_long = 0L;
		j_int = -1;
		aS_boolean = false;
		p_boolean = false;
		q_boolean = false;
		r_boolean = false;
		s_boolean = false;
		l_int = 1;
		m_int = 0;
		n_int = 0;
		o_int = 0;
		p_int = 0;
		q_int = 3;
		r_int = 0;
		s_int = 0;
		t_int = 0;
		u_int = -1;
		v_int = 0;
		w_int = 0;
		x_int = 1;
		y_int = 0;
		z_int = 0;
		A_int = 0;
		B_int = 0;
		C_int = 0;
		D_int = 0;
		E_int = 0;
		F_int = 0;
		G_int = 0;
		H_int = 1;
		I_int = 1;
		J_int = 1;
		K_int = 1;
		t_boolean = false;
		u_boolean = false;
		v_boolean = false;
		a_int_array1d = new int[5];
		b_int_array1d = new int[5];
		c_int_array1d = new int[5];
		d_int_array1d = new int[5];
		w_boolean = true;
		x_boolean = true;
		y_boolean = true;
		z_boolean = true;
		A_boolean = true;
		B_boolean = false;
		C_boolean = false;
		D_boolean = false;
		E_boolean = false;
		F_boolean = false;
		bw = 39423;
		G_boolean = false;
		H_boolean = false;
		I_boolean = false;
		J_boolean = false;
		K_boolean = false;
		L_boolean = false;
		M_boolean = false;
		N_boolean = false;
		O_boolean = false;
		P_boolean = false;
		Q_boolean = false;
		R_boolean = false;
		e_float = 0.0F;
		f_float = 0.0F;
		g_float = 0.0F;
		L_int = 0;
		M_int = 16;
		N_int = 0;
		O_int = 0;
		P_int = 0;
		e_int_array1d = new int[16];
		S_boolean = false;
		Q_int = 0;
		R_int = 0;
		S_int = 0;
		T_int = 0;
		U_int = 0;
		V_int = 0;
		W_int = 0;
		X_int = 0;
		Y_int = 0;
		Z_int = 0;
		aa_int = 0;
		ab_int = 0;
		ac_int = 0;
		T_boolean = false;
		U_boolean = false;
		V_boolean = false;
		W_boolean = false;
		X_boolean = false;
		Y_boolean = false;
		Z_boolean = false;
		aa_boolean = false;
		ab_boolean = false;
		ac_boolean = false;
		ad_int = 0;
		ae_int = 0;
		af_int = 0;
		ag_int = 0;
		ah_int = 0;
		ai_int = 0;
		aj_int = M_int / 2;
		ak_int = 1;
		al_int = 0;
		am_int = 0;
		an_int = 0;
		ad_boolean = true;
		ao_int = 0;
		ae_boolean = false;
		ap_int = -1;
		aq_int = 0;
		ar_int = 0;
		at_int = 0;
		au_int = 0;
		af_boolean = true;
		f_int_array1d = new int[120];
		a_byte_array1d = new byte[120];
		g_int_array1d = new int[120];
		av_int = 0;
		a_java_lang_String_array1d = new String[120];
		h_int_array1d = new int[120];
		aw_int = 0;
		i_int_array1d = new int[120];
		b_java_lang_String_array1d = new String[120];
		c_java_lang_String_array1d = new String[120];
		b_byte_array1d = new byte[120];
		c_byte_array1d = new byte[120];
		d_byte_array1d = new byte[120];
		j_int_array1d = new int[120];
		k_int_array1d = new int[120];
		l_int_array1d = new int[120];
		m_int_array1d = new int[120];
		n_int_array1d = new int[120];
		a_byte_array2d = new byte[120][12];
		b_byte_array2d = new byte[120][12];
		e_byte_array1d = new byte[120];
		f_byte_array1d = new byte[120];
		o_int_array1d = new int[22];
		p_int_array1d = new int[87];
		d_java_lang_String_array1d = new String[120];
		ax_int = 0;
		e_java_lang_String_array1d = new String[120];
		ay_int = 0;
		f_java_lang_String_array1d = new String[120];
		az_int = 0;
		g_byte_array1d = new byte[32400];
		h_byte_array1d = new byte[32400];
		i_byte_array1d = new byte[32400];
		j_byte_array1d = new byte[32400];
		a_short_array1d = new short[32400];
		k_byte_array1d = new byte[32400];
		l_byte_array1d = new byte[32400];
		g_java_lang_String_array1d = new String[15];
		aA_int = 0;
		m_byte_array1d = new byte[120];
		q_int_array1d = new int[120];
		aB_int = 0;
		r_int_array1d = new int[70];
		aC_int = 0;
		s_int_array1d = new int[20];
		aD_int = 0;
		t_int_array1d = new int[11];
		u_int_array1d = new int[21];
		n_byte_array1d = new byte[10];
		aE_int = 0;
		aF_int = 0;
		ag_boolean = false;
		ah_boolean = true;
		ai_boolean = true;
		aG_int = 0;
		v_int_array1d = null;
		aH_int = -1;
		b_java_lang_StringBuffer = null;
		c_java_lang_StringBuffer = null;
		aj_boolean = false;
		ak_boolean = false;
		al_boolean = false;
		am_boolean = false;
		an_boolean = false;
		ao_boolean = false;
		ap_boolean = false;
		aq_boolean = false;
		ar_boolean = false;
		as_boolean = false;
		at_boolean = false;
		au_boolean = false;
		av_boolean = false;
		a_data_ad = new ad(this);
		a_data_ab = new ab(this);
		a_data_c = new c(this);
		a_data_v = new v(this);
		a_data_a = new a(this);
		a_data_g = new g(this);
		a_data_y = new y(this);
		a_data_aa = new aa(this);
		a_data_r = new r(this);
		a_data_s = new s(this);
		a_data_n = new n(this);
		a_data_x = new x(this);
		a_data_t = new t(this);
		a_data_j = new j(this);
		a_data_h = new h(this);
		aT_boolean = true;
		aw_boolean = true;
		ax_boolean = false;
		aI_int = 16;
		ay_boolean = false;
		az_boolean = false;
		aA_boolean = true;
		aK_int = 0;
		aL_int = 10;
		aM_int = 0;
		aN_int = 8;
		bx = 0;
		aB_boolean = false;
		aC_boolean = false;
		aD_boolean = false;
		aE_boolean = false;
		aF_boolean = false;
		aG_boolean = false;
		aH_boolean = false;
		aI_boolean = false;
		aJ_boolean = false;
		aO_int = 0;
		aK_boolean = false;
		aL_boolean = false;
		aM_boolean = false;
		aN_boolean = false;
		aO_boolean = false;
		aP_boolean = false;
		aT_int = 0;
		aU = 0;
		aV = 0;
		aW = 0;
		aX = 0;
		aY = 0;
		aZ = 0;
		ba = 0;
		bb = 0;
		bc = 0;
		bd = 0;
		be = 0;
		bf = 0;
		bg = 0;
		bh = 0;
		bi = 0;
		bj = 0;
		bk = 0;
		bl = 0;
		bm = 0;
		bn = 0;
		a_Robinson_MyMidlet = mymidlet;
		c();
	}

	public final void a()
	{
		a(100);
	}

	public final void a(int i1, long l1)
	{
		switch (i1)
		{
		case 10: // '\n'
			if (bn > 0)
			{
				bn--;
				return;
			}
			break;

		case 0: // '\0'
			aQ_boolean = true;
			return;

		case 1: // '\001'
			c(super.a);
			aQ_boolean = false;
			aw_boolean = true;
			return;

		case 2: // '\002'
			aQ_boolean = true;
			return;

		case 3: // '\003'
			c(super.a);
			return;

		case 4: // '\004'
			aQ_boolean = false;
			break;
		}
	}

	private void c(Graphics g1)
	{
		b(11);
		super.y = w_int_array1d_static;
		a(true);
		d(g1);
	}

	public final void a(Graphics g1)
	{
		if (aT_boolean)
		{
			k_int = 1;
			M_long = System.currentTimeMillis();
			g1.setFont(Font.getFont(0, 1, 8));
			ah_boolean = a_data_t.a();
			ai_boolean = ah_boolean;
			aF_int = a_data_t.a();
			aE_int = aF_int;
			switch (aF_int)
			{
			case 0: // '\0'
				a_data_ac.a(0);
				break;

			case 1: // '\001'
				a_data_ac.a(1);
				break;

			case 2: // '\002'
				a_data_ac.a(2);
				break;

			case 3: // '\003'
				a_data_ac.a(3);
				break;

			case 4: // '\004'
				a_data_ac.a(4);
				break;
			}
			aT_boolean = false;
			if (aI_int < data.k.f() + 2)
				aI_int = data.k.f() + 2;
		}
		if (!aQ_boolean)
		{
			L_long = System.currentTimeMillis();
			f_long = L_long - M_long;
			M_long = System.currentTimeMillis();
			e_long += f_long;
			O_long += f_long;
			j_long = i_long += f_long;
			h_long += f_long;
			k_long += f_long;
			l_long += f_long;
			m_long += f_long;
			n_long += f_long;
			o_long += f_long;
			q_long += f_long;
			P_long += f_long;
			Q_long += f_long;
			r_long += f_long;
			R_long += f_long;
			s_long += f_long;
			t_long += f_long;
			u_long += f_long;
			v_long += f_long;
			g_long += f_long;
			w_long += f_long;
			x_long += f_long;
			y_long += f_long;
			z_long += f_long;
			A_long += f_long;
			B_long += f_long;
			H_long += f_long;
			G_long += f_long;
			N_long += f_long;
			if (l_int == 1)
				C_long += f_long;
			D_long += f_long;
			E_long += f_long;
			F_long += f_long;
			I_long += f_long;
			switch (k_int)
			{
			case 1: // '\001'
				if (bx == 0)
					a_data_ac.a(0);
				else
				if (bx == 10)
					a_data_w.a(0);
				else
				if (bx == 20)
				{
					a_data_w.a(1);
					a_data_w.a(2);
				} else
				if (bx == 30)
				{
					a_data_w.a(3);
					a_data_w.a(4);
					a_data_w.a(5);
				} else
				if (bx == 40)
				{
					a_data_w.a(13);
					a_data_w.a(6);
					a_data_w.a(7);
					a();
				} else
				if (bx == 50)
				{
					a_data_w.a(8);
					a_data_w.a(9);
				} else
				if (bx == 60)
					a_data_g.a();
				else
				if (bx == 70)
					a_data_g.b();
				else
				if (bx == 80)
					a_data_g.c();
				else
				if (bx == 90)
				{
					String as1[] = RecordStore.listRecordStores();
					b_boolean = false;
					if (as1 != null)
					{
						for (int i1 = 0; i1 < as1.length; i1++)
						{
							if (!as1[i1].equals("RobinsonSave_1"))
								continue;
							b_boolean = true;
							break;
						}

					}
					if (!b_boolean)
						r_int = 1;
				} else
				if (bx == 100)
				{
					a_data_w.a(10);
					a_data_w.a(11);
					a_data_a.r();
				}
				bx = bx + 2;
				if (bx <= 100)
				{
					a_data_w.a(g1, a_data_w.a(0xc0000), data.k.a() / 2 - 67, data.k.b() / 3 - 18);
					a(g1, 20, (data.k.b() / 3) * 2, data.k.a() - 40, 12, bx, 100, 0, bw);
				} else
				{
					bx = 0;
					k_int = 2;
					e_long = 0L;
				}
				break;

			case 2: // '\002'
				g1.setColor(13158);
				g1.fillRect(0, 0, data.k.a(), data.k.b());
				a_data_w.a(g1, 0, data.k.a() / 2, 0);
				if (e_long > 5000L)
				{
					a_data_w.a(0);
					a_data_w.a(12);
					a_data_w.a(14);
					k_int = 0;
				}
				if (hasPointerEvents() && a_data_j.c > 0)
					e_long = 5001L;
				if (super.bu != 0)
					e_long = 5001L;
				break;

			case 0: // '\0'
label0:
				switch (l_int)
				{
				case 0: // '\0'
				default:
					break;

				case 1: // '\001'
					a_data_aa.a();
					break;

				case 11: // '\013'
					if (a_int == 1)
						a_data_aa.b(114);
					else
						a_data_aa.b(113);
					break;

				case 2: // '\002'
					a_data_aa.a(a_data_ac.a(52));
					break;

				case 3: // '\003'
					a_data_aa.a(53);
					break;

				case 10: // '\n'
					StringBuffer stringbuffer = null;
					int ai1[] = null;
					byte byte0 = -1;
					StringBuffer stringbuffer1 = null;
					switch (d_int)
					{
					default:
						break;

					case 0: // '\0'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(45);
						else
							stringbuffer = a_data_ac.a(44);
						break;

					case 1: // '\001'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(4);
						else
							stringbuffer = a_data_ac.a(3);
						ai1 = (new int[] {
							3, 6, 5
						});
						break;

					case 2: // '\002'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(7);
						else
							stringbuffer = a_data_ac.a(6);
						ai1 = (new int[] {
							9, 7, 4
						});
						byte0 = 9;
						break;

					case 3: // '\003'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(10);
						else
							stringbuffer = a_data_ac.a(9);
						ai1 = (new int[] {
							9, 7, 4
						});
						byte0 = 4;
						break;

					case 4: // '\004'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(13);
						else
							stringbuffer = a_data_ac.a(12);
						ai1 = (new int[] {
							13
						});
						byte0 = 13;
						break;

					case 5: // '\005'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(16);
						else
							stringbuffer = a_data_ac.a(15);
						ai1 = (new int[] {
							12
						});
						byte0 = 12;
						break;

					case 6: // '\006'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(19);
						else
							stringbuffer = a_data_ac.a(18);
						ai1 = (new int[] {
							11
						});
						byte0 = 11;
						break;

					case 7: // '\007'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(22);
						else
							stringbuffer = a_data_ac.a(21);
						ai1 = (new int[] {
							14
						});
						byte0 = 14;
						break;

					case 8: // '\b'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(25);
						else
							stringbuffer = a_data_ac.a(24);
						ai1 = (new int[] {
							10, 9, 6
						});
						byte0 = 9;
						break;

					case 9: // '\t'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(28);
						else
							stringbuffer = a_data_ac.a(27);
						ai1 = (new int[] {
							9, 7, 4
						});
						byte0 = 7;
						stringbuffer1 = a_data_ac.a(60);
						break;

					case 10: // '\n'
						if (hasPointerEvents())
							stringbuffer = a_data_ac.a(32);
						else
							stringbuffer = a_data_ac.a(31);
						ai1 = (new int[] {
							9, 7, 4
						});
						byte0 = 7;
						stringbuffer1 = a_data_ac.a(68);
						break;
					}
					a_data_aa.a(53, stringbuffer, ai1, byte0, stringbuffer1);
					break;

				case 4: // '\004'
					a_data_aa.a(54, 46);
					break;

				case 5: // '\005'
					a_data_r.c(a_data_ac.a(50));
					break;

				case 6: // '\006'
					if (ax_boolean)
						ax_boolean = false;
					if (!o_boolean)
					{
						a_data_v.f();
						if ((J_long == 5L || J_long == 11L || J_long == 17L || J_long == 23L || J_long == 29L || J_long == 35L || J_long == 41L || J_long == 47L || J_long == 53L || J_long == 59L) && !aS_boolean && m_int != 10)
						{
							j_int = m_int;
							aS_boolean = true;
							g_long = 0L;
							m_int = 10;
							p_boolean = true;
							aw_boolean = true;
						}
						if ((J_long == 0L || J_long == 6L || J_long == 12L || J_long == 18L || J_long == 24L || J_long == 30L || J_long == 36L || J_long == 42L || J_long == 48L || J_long == 54L) && aS_boolean && m_int != 10)
						{
							j_int = m_int;
							aS_boolean = false;
							s_boolean = false;
							g_long = 0L;
							m_int = 10;
							q_boolean = true;
							aw_boolean = true;
						}
						if (!s_boolean)
						{
							a_data_ad.p();
							if (aR_boolean)
								aR_boolean = false;
						}
					}
					switch (m_int)
					{
					default:
						break;

					case 2: // '\002'
						a_data_aa.e();
						break label0;

					case 1: // '\001'
						a_data_aa.j();
						a_data_aa.b();
						break label0;

					case 0: // '\0'
						a_data_v.a();
						break label0;

					case 3: // '\003'
						a_data_aa.a(a_data_ac.a(59), ar_int);
						a_data_aa.b();
						break label0;

					case 4: // '\004'
						a_data_aa.b(a_data_ac.a(61));
						a_data_aa.b();
						break label0;

					case 5: // '\005'
						if (aB_boolean)
							a_data_aa.c(a_data_ac.a(63));
						else
							a_data_aa.c(a_data_ac.a(62));
						a_data_aa.b();
						break label0;

					case 6: // '\006'
						a_data_r.a(a_data_ac.a(64));
						a_data_aa.b();
						break label0;

					case 7: // '\007'
						switch (q_int)
						{
						case 0: // '\0'
							a_data_x.a();
							a_data_aa.b();
							break;

						case 1: // '\001'
							a_data_x.d();
							a_data_aa.b();
							break;

						case 2: // '\002'
							a_data_n.a();
							a_data_aa.b();
							break;

						case 3: // '\003'
							a_data_s.a();
							a_data_aa.b();
							break;
						}
						break label0;

					case 8: // '\b'
						switch (p_int)
						{
						case 0: // '\0'
							a_data_r.b(a_data_ac.a(66));
							a_data_aa.b();
							break;

						case 1: // '\001'
							a_data_r.b(a_data_ac.a(66));
							a_data_aa.e();
							a_data_aa.b();
							break;
						}
						break label0;

					case 9: // '\t'
						a_data_r.h();
						a_data_aa.b();
						break label0;

					case 10: // '\n'
						if (p_boolean)
							a_data_r.b();
						if (q_boolean)
							a_data_r.c();
						a_data_aa.b();
						break;
					}
					break;

				case 7: // '\007'
					if (N_long > 8000L)
						a_Robinson_MyMidlet.destroyApp(true);
					else
						a_data_r.i();
					break;

				case 8: // '\b'
					a_data_v.c();
					a_data_aa.b();
					break;

				case 9: // '\t'
					a_data_v.d();
					a_data_aa.b();
					break;
				}
				a_data_v.b();
				if (E_boolean)
				{
					g1.setColor(0xffffff);
					g1.fillRect(3, 13, 50, 20);
					a_data_ac.a(g1, new StringBuffer("fps:" + 1000L / f_long), 5, 15, 0);
				}
				break;

			case 3: // '\003'
				super.a.setColor(13158);
				super.a.fillRect(0, 0, data.k.a(), data.k.b());
				a_data_ac.a(super.a, a_data_ac.a(112), data.k.a() / 2, data.k.b() / 3, 0xffffff, 273, 0, 1, 8, aJ_int, data.k.a(), data.k.b(), 0, 0);
				break;
			}
			if (hasPointerEvents() && !a_data_j.a)
				a_data_j.e = -1;
		}
	}

	private void c()
	{
		a_data_w = data.w.a();
		a_data_ac = data.ac.a();
		a_data_w.a(12);
		data.k.a(a_data_w.a(0xc0000), data.k.a() / 2 - 67, data.k.b() / 3 - 18, 0, 0xffffff, 0, 0, 0, 0, 0xffffff, 0xffffff);
		a_data_w.a = true;
		a_data_ac.a = true;
		a_data_w.a();
		a_data_a.s();
		aJ_int = Font.getFont(0, 1, 8).getHeight();
		a_float = (data.k.a() / 3 - 16) / 1;
		b_float = a_float;
		c_float = a_float;
		d_float = a_float;
		aK_int = ((data.k.a() / 6) * 4) / 2;
		aU = data.k.b() - 8;
		aV = data.k.a() / 2;
		if (data.k.b() < 160)
		{
			if (hasPointerEvents())
				as_int = 2;
			else
				as_int = 3;
			aP_int = 16;
			aQ_int = 4;
			aR_int = 10;
			aL_int = 5;
		} else
		if (data.k.b() < 210)
		{
			if (hasPointerEvents())
				as_int = 3;
			else
				as_int = 5;
			aP_int = 24;
			aQ_int = 5;
			aR_int = 25;
			aL_int = 5;
		} else
		if (data.k.b() < 290)
		{
			if (hasPointerEvents())
				as_int = 7;
			else
				as_int = 8;
			aP_int = 24;
			aQ_int = 0;
			aR_int = 25;
			aL_int = 5;
		} else
		if (data.k.b() < 321)
		{
			if (hasPointerEvents())
				as_int = 9;
			else
				as_int = 10;
			aP_int = 24;
			aQ_int = 0;
			aR_int = 10;
			aL_int = 10;
		} else
		{
			if (hasPointerEvents())
				as_int = 11;
			else
				as_int = 13;
			aP_int = 24;
			aQ_int = 0;
			aR_int = 10;
			aL_int = 10;
		}
		aW = 0;
		aX = data.k.b() - 20;
		aY = data.k.a() - 23;
		aZ = data.k.b() - 20;
		ba = 4;
		bb = 2;
		bc = data.k.b() - 5;
		bd = data.k.a() - 2;
		be = data.k.b() - 5;
		if (hasPointerEvents())
		{
			bf = 0;
			bg = 48;
			bh = data.k.b() - 20;
			bi = data.k.b();
			bj = data.k.a() - 48;
			bk = data.k.a();
			bl = data.k.b() - 20;
			bm = data.k.b();
		}
	}

	public final void pointerPressed(int i1, int j1)
	{
		a_data_j.a(i1, j1);
	}

	public final void pointerReleased(int i1, int j1)
	{
		a_data_j.b(i1, j1);
	}

	public final void pointerDragged(int i1, int j1)
	{
		a_data_j.c(i1, j1);
	}

	private void d(Graphics g1)
	{
		a(g1, 0, 0, data.k.a(), data.k.b());
	}

	private void a(Graphics g1, int i1, int j1, int k1, int l1)
	{
		g1.setColor(0xffffff);
		g1.fillRect(i1, j1, k1, l1);
	}

}
