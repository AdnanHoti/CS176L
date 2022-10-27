public class ArrayAssignment1
{
    public static void main(String args[])
    {
        double[] values=new double[]{25.3,100,-10,-1.5,13,98.6,17,123.145,125.6,123.146};
        //upto length of numbersay,print every element
        for(int i = 0; i < values.length; i++) 
        System.out.print(values[i]+" ");
        //compute max and count 
        double max=-10000;
        int c=0;
        for(int i=0;i<values.length;i++)
        {
            if(values[i]<0) //CHECK NEGATIVE NUMBER OR NOT
            {
                c+=1;
            }
            if(max<values[i])  //CHECK MAXIMUM NUMBER
            max=values[i];
        }
        System.out.println("\nCount of negative numbers:"+c);
        System.out.println("Maximum number:"+max);
        
    }
}