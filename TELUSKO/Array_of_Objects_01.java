class students {

    int rollno;
    String name;
    Float marks;

}

public class Array_of_Objects_01 {

    public static void main(String[] args) {
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        // students s1[] = new students[3];

        students s1 = new students();
        students s2 = new students();
        students s3 = new students();

        s1.rollno = 1;
        s1.name = "saurabh";
        s1.marks = 56.4f;

        s2.rollno = 2;
        s2.name = "Suraj";
        s2.marks = 68.2f;

        s3.rollno = 3;
        s3.name = "Abhishek";
        s3.marks = 74.9f;

        students arr1[] = new students[3];

        arr1[0] = s1;
        arr1[1] = s2;
        arr1[2] = s3;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].rollno + " " + arr1[i].name);
        }

    }
}
