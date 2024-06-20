public class Bits {
    public static void main(String args[]){
        
        // //Get Bit... (finding the bit at any place)
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1 << pos;

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was Zero");
        // }else{
        //     System.out.println("Bit was One");
        //     }


        //set Bit (setting the bit of our need)
        //  int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n ;
        // System.out.println(newNumber);


        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n ;
        System.out.println(newNumber);

    }
}
