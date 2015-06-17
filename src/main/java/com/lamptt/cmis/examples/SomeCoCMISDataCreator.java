package com.lamptt.cmis.examples;

import com.lamptt.db.DataTestVBHC;



/**
 * This class creates an la:vbhc and add aspect la:pages
 * 
 * @author lamptt
 */
public class SomeCoCMISDataCreator extends CMISExampleBase {

	public static void main(String[] args) throws Exception {
    	//if (args.length != 5) doUsage(SomeCoCMISDataCreator.USAGE);
    	SomeCoCMISDataCreator doc = new SomeCoCMISDataCreator();
    	
    	doc.setServiceUrl("http://localhost:8080/alfresco/cmisatom");
    	doc.setUser("admin");
    	doc.setPassword("123456");
    	
    	//set for database
    	DataTestVBHC hl = new DataTestVBHC();
    	doc.setHalong(hl.getAllResult());
    	
    	
    	doc.setFolderName("03/01");
    	doc.setContentType("D:la:vbhc");
    	
    	//noi luu tru anh tren o dia
    	//doc.setContentName("/home/applelam/Documents/Eco/DuAn/My_HaLong/HaLongGoc2/DataHaLong/");
    	doc.setContentName("/home/applelam/Documents/Eco/DuAn/My_HaLong/HaLongGoc2/DataHaLong/a.pdf");
    	
		doc.create();
    }
	
	public void create() {
		createTestDocHaLong(getContentName(), getContentType());
		return;
	}

}

