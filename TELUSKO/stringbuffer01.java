public class stringbuffer01 {
    
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("saurabh");

        // sb.append(" patel");

        System.out.println(sb.capacity());

        System.out.println(sb);
        System.out.println(sb.length());

        String str=sb.toString();

        System.out.println(str);
    }
}
