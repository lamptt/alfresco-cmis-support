package com.lamptt.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataTestVBHC {
	// private static final String GET_ALL_RESULT_SQL =
	// "SELECT * FROM [dbo].[Result] WHERE ID=1790 ORDER BY ID ";

	public List<VBHC> getAllResult() {
		ArrayList<VBHC> listHalong = new ArrayList<VBHC>();
		for (int i=0; i<10; i++){
			VBHC halong = new VBHC();
			halong.setA1("1: " + i);
			halong.setA2("1: " + i);
			halong.setA3("1: " + i);
			halong.setA4(new Date());
			halong.setA5("1: " + i);
			halong.setA6("1: " + i);
			halong.setA7("1: " + i);
			halong.setA8("1: " + i);
			halong.setA9("1: " + i);
			halong.setA10("1: " + i);
			halong.setA11("1: " + i);
			listHalong.add(halong);
		}

		return listHalong;
	}

}
