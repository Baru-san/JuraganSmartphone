package main;

import Classes.Smartphone;
import Databases.*;

public class Main {
    
    public static void main(String args[]) {
        
        Database db = new Database();
        db.buatObjekSmartphone();
        
        //Smartphone[] sp = new Smartphone[20];
        
//        sp = db.buatObjekSmartphone();
//        
//            for(int i=0;i<3;i++){
//            System.out.println(sp[i].getNama());
//            System.out.println(sp[i].getHarga());
//            System.out.println(sp[i].getRating());
//            //System.out.println(namamenu[i].getJenis());
//        }
    }
}
