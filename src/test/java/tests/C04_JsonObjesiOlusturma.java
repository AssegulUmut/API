package tests;

import org.json.JSONObject;
import org.junit.Test;

public class C04_JsonObjesiOlusturma {
    /*
    Asagidaki JSON Objesini olusturup konsola yazdirin

    {
        “title”:“Asya”,
        “body”:“Merhaba”,
        “userId”:1
}
     */
    @Test
    public void jsonObjesiOlusturma(){
        JSONObject ilkJsonObjesi=new JSONObject();
        ilkJsonObjesi.put("title","Asya");
        ilkJsonObjesi.put("body","Hello");
        ilkJsonObjesi.put("userId",1);

        System.out.println("ilkJsonObjesi:"+ilkJsonObjesi);
    }

}
