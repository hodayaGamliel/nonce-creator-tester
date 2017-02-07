public class Nonce1
{
    public static void main(String[] args) throws Exception
    {
        Thread.sleep(5000);
        throwExcep1();
        Thread.sleep(5000);
        throwExcep1();
        Thread.sleep(5000);
    }

    public static void throwExcep1() throws Exception
    {
        int throwExcep1_int1 = 1;
        int throwExcep1_int2 = 2;
        int throwExcep1_int3 = 3;
        int throwExcep1_int4 = 4;
        int throwExcep1_int5 = 5;
        int throwExcep1_int6 = 6;
        int throwExcep1_int7 = 7;
        int throwExcep1_int8 = 8;
        int throwExcep1_int9 = 9;
        
        String throwExcep1_str1 = "1";
        String throwExcep1_str2 = "2";
        String throwExcep1_str3 = "3";
        String throwExcep1_str4 = "4";
        String throwExcep1_str5 = "5";
        String throwExcep1_str6 = "6";
        String throwExcep1_str7 = "7";
        String throwExcep1_str8 = "8";
        String throwExcep1_str9 = "9";

        long throwExcep1_lng1 = 1;
        long throwExcep1_lng2 = 2;
        long throwExcep1_lng3 = 3;
        long throwExcep1_lng4 = 4;
        long throwExcep1_lng5 = 5;
        long throwExcep1_lng6 = 6;
        long throwExcep1_lng7 = 7;
        long throwExcep1_lng8 = 8;
        long throwExcep1_lng9 = 9;
        
        System.out.println(throwExcep1_int1 + throwExcep1_int2 + throwExcep1_int3 + throwExcep1_int4 + throwExcep1_int5);
        System.out.println(throwExcep1_int6 + throwExcep1_int7 + throwExcep1_int8 + throwExcep1_int9);
        System.out.println(throwExcep1_str1 + throwExcep1_str2 + throwExcep1_str3 + throwExcep1_str4 + throwExcep1_str5);
        System.out.println(throwExcep1_str6 + throwExcep1_str7 + throwExcep1_str8 + throwExcep1_str9);
        
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Thread.sleep(5000);
        }
    }
}
