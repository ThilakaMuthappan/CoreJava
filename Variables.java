public class Variables {
    public static void main(String[] args) {
        
        //valid variable names

        int $validName =0;
        String _ValidName = "Hello";
        //char 1Valid = 13; ->not valid
        //String validName. = "World" ;  -> not valid
        String validName = "World" ; 
        String VAlidName = "Hello World";


        System.out.println($validName);

        System.out.println(_ValidName);

        System.out.println(validName);

        System.out.println(VAlidName);

        System.out.println(validName);


        //Primitive Variable types
        int num = 5;
        double salary = 1000000.5;
        char department = 'A';
        boolean isCurrentEmployee = true; 

        byte i = 120;
        byte j = 56;
        byte z = (byte) ((byte) i + j);
        System.out.println(z);
    }
    
}
