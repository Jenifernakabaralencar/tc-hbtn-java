public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++){
            if (i % 2 == 0){
               if (i == 98){
                   System.out.println(i);
               }else{
                   System.out.print(i + ", ");
               }
            }

        }
    }
}
