public class array_01 {

    public static void main(String[] args)
    {

        // int nums1[] = {1,2,3,4,5};

        // System.out.println(nums1);


        // int nums2[]= new int[5];

        // for(int i=0;i<5;i++)
        // {
        //     nums2[i]=10*i;
        // }

        // for (int i : nums2)
        // {
        //     System.out.println(i);
        // }


        // int nums3[][] =  new int[3][4];
        

        // System.out.println("Input Taken : ....");
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)

        //     {
        //         nums3[i][j]= (int) ( Math.random()*100);
        //     }
        //     // System.out.println();
        // }


        // System.out.println("Printing");
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)

        //     {
        //         System.out.print(nums3[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int nums4[][] = new int[3][];


        nums4[0]=new int[3];
        nums4[1]=new int[4];
        nums4[2]=new int[2];


        for(int i=0;i<nums4.length;i++)
        {
            for(int j=0;j<nums4[i].length;j++)
            {
                nums4[i][j]= (int) (Math.random()*100);
            }
            System.out.println();
        }

        for(int i=0;i<nums4.length;i++)
        {
            for(int j=0;j<nums4[i].length;j++)
            {
                System.out.print(nums4[i][j] + " ");
            }
            System.out.println();
        }




    }
}