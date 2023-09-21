import java.util.ArrayList;

public class main {




    public static void runforInterview(String str)
    {
        ArrayList<String> resp = new ArrayList<>();
        String repString ="";

        for (int i = 0 ; i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                resp.add(repString);
                repString="";
            }
            else {
                repString+= String.valueOf(str.charAt(i)) ;
            }
        }

        String resultString ="";

        for (int i =resp.size()-1;i>=0;i--)
        {
            resultString=resultString+" "+resp.get(i);
        }
        System.out.println(resultString);
    }


    public static void main(String[] args) {

        runforInterview("I am ismet donmez");
    }
}
