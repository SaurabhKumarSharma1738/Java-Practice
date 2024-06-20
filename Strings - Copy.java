public class Strings {
    public static void main(String args[]){
        // String name = "TonyStark";
        // System.out.println(name.substring(0,4));
        
        // //StringBuilder initialization...
        // StringBuilder sc = new StringBuilder("Tony");
        // System.out.println(sc);

        // //char at index 0
        // System.out.println(sc.charAt(0));

        // //set char at index...
        // sc.setCharAt(0,'P');
        // System.out.println(sc);

    
        // //insert char at index...
        // sc.insert(0,'S');
        // System.out.println(sc);

        // //delete the char...
        // sc.delete(0,2);
        // System.out.println(sc);

        // //adding char "T" at starting...
        // sc.insert(0,'T');
        // System.out.println(sc);


        // //append adds the char at the end...
        // StringBuilder sc = new StringBuilder("h");
        // sc.append("e"); //str = str +"e";
        // sc.append("l"); //str = str + "l";
        // sc.append("l");
        // sc.append("o");
        // System.out.println(sc);
        // System.out.println(sc.length());

        StringBuilder sc = new StringBuilder("hello");
        for(int i=0; i<sc.length()/2; i++){
            int front = i;
            int back = sc.length() - 1 - i;

            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front, backChar);
            sc.setCharAt(back, frontChar);
        }
        System.out.println(sc);
    }

}
