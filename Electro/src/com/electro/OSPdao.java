package com.electro;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.util.Arrays;

public class OSPdao {
	
	
public   ProductDo main(String args) {
	String title="Default Title";
	   DBCursor cursor = null;
	   ProductDo productdo=null;
	  
      try{   
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "52.172.189.224" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "Electro" );
         System.out.println("Connect to database successfully");
			
        // boolean auth = db.authenticate(myUserName, myPassword);
         //System.out.println("Authentication: "+auth);         
        // DBCollection coll = db.getCollection("fk_products");
         System.out.println("Collection mycol selected successfully");
			
        
				
         DBCollection table = db.getCollection("product");

         BasicDBObject searchQuery = new BasicDBObject();
         searchQuery.put("fp_title", "Vivo Y69");

          cursor = table.find(searchQuery);

         while (cursor.hasNext()) {
         	//System.out.println(cursor.next().get("fp_title"));
        	DBObject dbobj= cursor.next();
         	
         	productdo=new ProductDo();
         	productdo.setFp_Title((String) dbobj.get("fp_title"));
            productdo.setFp_Battery((String)dbobj.get("fp_batery"));
            productdo.setFp_Display((String)dbobj.get("fp_display"));
            productdo.setFp_FrontCamera((String)dbobj.get("fp_front_camera"));
            productdo.setFp_RearCamera((String)dbobj.get("fp_rear_camera"));
            productdo.setFp_RAM((String)dbobj.get("fp_memory"));
            productdo.setFp_Storage((String)dbobj.get("fp_storage"));
            productdo.setFp_MaximumRetailPrice((String)dbobj.get("fp_listprice"));
            productdo.setFp_SellingPrice((String)dbobj.get("fp_offerprice"));
            productdo.setFp_Image2((String)dbobj.get("fp_image2"));
         }
         
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
      return productdo;
   }
}