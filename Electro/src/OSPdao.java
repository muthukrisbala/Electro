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

   public  static String main(String args) {
	   DBCursor cursor = null;
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
         	System.out.println(cursor.next().get("fp_title"));
         }
         
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
      return (String) cursor.next().get("fp_title");
   }
}