public class Main {
    public static void main(String[] args) {

        if(6 < 6 * 5){
            System.out.print("Hello");
            System.out.print(" There");
        }
        // Hello There

        int x=1, y=2, z=3;
        if (x > y) {
            if(x>z){
                System.out.print("1111");
            }else{
                System.out.print("2222");
            }
        }
        //

        if (x < z) {
            System.out.println("*");
        }else if (x == z){
            System.out.println("&");
        }else{
            System.out.println("$");
        }
        // *

        if (x < y){
            System.out.println("####");
        }else{
            System.out.println("&&&&");
            System.out.println("****");
        }
        // ####
        if (x > y){
            System.out.println("####");
        }else{
            System.out.println("&&&&");
            System.out.println("****");
        }
        // &&&& ****

        int a1 = 100; int a2 = 200;
        if (a1 > 100 && a2 <= 200){
            System.out.println(a1 + " " + a2 + " " + (a1 + a2));
        }else{
            System.out.println(a1 + " " + a2 + " " + (2 * a1 - a2));
        }
        // 100 200 0

        if (++x > y++ || x-- > 0){
            z++;
        }else{
            z--;
        }
        System.out.println(x + " " + y + " " + z);
        // 1 3 4
    }
}