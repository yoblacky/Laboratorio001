public class Main2 {
    public static void main(String[] args) {

        int x = 1, y = 2, z = 3;
        if (x < y){
            System.out.println("####");
            System.out.println("****");
        }else{
            System.out.println("&&&&");
        }
        // #### ****

        if ( 'x' > 'y' || 66 > (int)('A')){
            System.out.println("#*#");
        }
        // #*#

        if (x < z) {
            System.out.println("*");
        }else if (x == z){
            System.out.println("&");
        }else{
            System.out.println("$");
        }
        // *

        int numA = 0, numB = 0;
        if (numA % 2 != 0 && numA > 0){
            System.out.println("true");
        }

        if (numA > 0 && numB > 0){
            System.out.println("true");
        }

        if (numA > 0 && numB > 0){
            System.out.println("true");
        }else{
            System.out.println("true");
        }

    }
}
