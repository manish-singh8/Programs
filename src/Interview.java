import java.util.HashMap;

public class Interview {

    public static void main(String[] args) {
        String input="intetrviewsp";
        //Output-

        String inputs[]=input.split(" ");
        HashMap<Character,Integer>mappings= new HashMap<>();
        int len=0;


        for(String i: inputs)
        {
            char ch[]=i.toCharArray();
            for(int j=0;j< ch.length;j++)
            {
                if(mappings.containsKey(ch[j]))
                {
                    len=j;

                }
                else
                {
                    mappings.put(ch[j],1);
                }
            }


        }
        System.out.println(len);
    }

//    baseURI="https://endpoint";
    //auth basic rest assured

//    Response response=given().headers("Key":"Value").queryParams().when().get().extract().response();
//    AssertEquals(response.statusCode(),200);//stateless-->bandwidth-->low--->fast--->scalable
}
//POST-->
//endpoint
//1-invoke wrong method GET, DELETE
//2-Semantically doing wrong combinations in request body
//3-Valid Request-->Happy flow--verify status and result
//4-Doing POST call again and again
//5-Tampering headers and other mandatory parameters breaking its contrscat like int is accepted giving string
//"-" 422