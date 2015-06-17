package com.lamptt.db;

import java.util.List;

public class TestDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTestVBHC hl = new DataTestVBHC();
		List<VBHC> halong = hl.getAllResult();
		System.out.println(halong.size());
//		for (int i=0; i<halong.size(); i++)
//			if (halong.get(i).getPathuri()!=null) {
//				System.out.println(halong.get(i).getPathuri() + " a1: "+ halong.get(i).getA1());				
//				//System.out.println(halong.get(i).getFormid());
//				
//				if (halong.get(i).getFormid() != 0) System.out.println("dung");
//			}
//		
			//System.out.println("vi tri " + i + ":"+halong.get(i).getPathuri());
	}

}
