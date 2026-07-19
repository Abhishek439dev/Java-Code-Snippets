class SumOfNnaturalnumbers {
    public static void main(String[] args) {
        int i =5;     //value until which we have to count.
        int sum = 0;  //variable to store the sum of all values.

        //for loop to count from 1 to the value of 'i'.
        for(int a = 1; a<=i; a++){
            sum += a;  //sum = sum+a
        }
        System.out.println(sum);  //result printing.
    }
}
