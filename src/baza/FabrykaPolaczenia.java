package baza;

/**
 * Created by mat-bi on 15.06.16.
 */


import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class FabrykaPolaczenia {

    private static FabrykaPolaczenia fabryka;
    private DB db;

    private FabrykaPolaczenia() throws UnknownHostException {
        MongoClient klient = new MongoClient("localhost");
        db = klient.getDB("baza");
    }

    public static FabrykaPolaczenia getInstance() throws UnknownHostException {
        if(fabryka == null) fabryka = new FabrykaPolaczenia();
        return fabryka;
    }

    public DB getConnection() {
        return db;
    }
}
