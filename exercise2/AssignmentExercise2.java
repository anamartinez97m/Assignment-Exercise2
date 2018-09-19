package assignment.exercise2;

public class AssignmentExercise2 {

    public static void main(String[] args) {
        String s1 = "    12345!*k";
        int n1 = atoiFunction(s1);
        System.out.println("    12345!*k --> " + n1);
        
        String s2 = "    123456789101112";
        int n2 = atoiFunction(s2);
        System.out.println("    123456789101112 --> " + n2);
        
        String s3 = "   ";
        int n3 = atoiFunction(s3);
        System.out.println("   --> " + n3);
        
        String s4 = " jdfj";
        int n4 = atoiFunction(s4);
        System.out.println(" jdfj --> " + n4);
        
        String s5 = "  12345";
        int n5 = atoiFunction(s5);
        System.out.println("  12345 --> " + n5);
        
        String s6 = "  12345*/1344";
        int n6 = atoiFunction(s6);
        System.out.println("  12345*/1344 --> " + n6);
    }
    
    public static int atoiFunction(String s){
        long number = 0 ;
        
        s = s.trim();
        
        if(s.isEmpty() || (s.charAt(0) <= '0' || s.charAt(0) >= '9')){
            number = 0;
        } else{
            int lastPos = 0;
            boolean lastPositionIsNotANumber = false;
            
            for(int i = 0; i < s.length() && !lastPositionIsNotANumber; i++){
                    if( (s.charAt(i) >= '0') && (s.charAt(i) <= '9') ){
                        lastPos++;
                    } else{
                        lastPositionIsNotANumber = true;
                    }
            }
            
            s = s.substring(0, lastPos);
            number = Long.parseLong(s);
        }
        
        if(number > Integer.MAX_VALUE){
            number = Integer.MAX_VALUE;
        }
        
        return (int) number;
    }
}