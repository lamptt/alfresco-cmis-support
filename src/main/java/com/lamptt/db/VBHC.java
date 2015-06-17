package com.lamptt.db;

import java.util.Date;


public class VBHC {
	private String a1, a2, a3, a5, a6, a7, a8, a9, a10, a11;
	private Date a4;
	private int sotrang;

	public VBHC() {
		this(null, null, null, null, null, null, null, null, null,
				null, null, 0);
	}

	public VBHC(String a1, String a2, String a3, Date a4, String a5, 
			String a6, String a7, String a8, String a9, String a10, String a11, int sotrang) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
		this.a7 = a7;
		this.a8 = a8;
		this.a9 = a9;
		this.a10 = a10;
		this.a11 = a11;
		this.sotrang = sotrang;
	}


	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public String getA6() {
		return a6;
	}

	public void setA6(String a6) {
		this.a6 = a6;
	}

	public String getA7() {
		return a7;
	}

	public void setA7(String a7) {
		this.a7 = a7;
	}

	public String getA8() {
		return a8;
	}

	public void setA8(String a8) {
		this.a8 = a8;
	}

	public String getA9() {
		return a9;
	}

	public void setA9(String a9) {
		this.a9 = a9;
	}

	public String getA10() {
		return a10;
	}

	public void setA10(String a10) {
		this.a10 = a10;
	}

	public String getA11() {
		return a11;
	}

	public void setA11(String a11) {
		this.a11 = a11;
	}

	public Date getA4() {
		return a4;
	}

	public void setA4(Date a4) {
		this.a4 = a4;
	}

}
