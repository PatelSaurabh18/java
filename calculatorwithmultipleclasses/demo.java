
public class demo {

  public static void main(String[] args) {
    // advcalc obj1 = new advcalc();
    // // System.out.println(obj1.add(3, 6) );

    // System.out.println(obj1.add(2, 3));
    // System.out.println(obj1.sub(7, 3));
    // System.out.println(obj1.mul(2, 3));
    // System.out.println(obj1.sub(15, 3));

    calc obj2 = new calc();
    int ans1 =  obj2.add(4, 6);
    int ans2 = obj2.sub(2343, 357);
    System.out.println(ans1 +"     "+ ans2);

  }

}
