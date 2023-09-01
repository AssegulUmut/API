package calisma;

import org.json.JSONObject;
import org.junit.Test;

public class C02_Get_API_Sorgulama {
     /*
    Asagidaki JSON Objesini olusturup konsola yazdirin

    {
        “title”:“Asya”,
        “body”:“Merhaba”,
        “userId”:1
}
     */
    @Test
    public void JSonObjesiOlusturma(){
        JSONObject jSonObjeOlusturma=new JSONObject();
        jSonObjeOlusturma.put("title","Asya");
        jSonObjeOlusturma.put("body","Merhaba");
        jSonObjeOlusturma.put("userId",7);

        System.out.println("jSonObjeOlusturma = " + jSonObjeOlusturma);
        
        
        
    }
}
