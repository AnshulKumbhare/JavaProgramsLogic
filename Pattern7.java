public class Pattern7 {
    public static void main(String[] args) {

        boolean flag = true;

        for (int i = 0; i < 4; i++){
            int num;
            if (flag){
               num = 1;
            }
            else{
                 num = 0;
            }
            for (int j = 0; j < i + 1; j ++){
                System.out.print(num + "  ");
                if (num == 1){
                    num = 0;
                }
                else{
                    num = 1;
                }
            }
            System.out.println();
            flag = !flag;
        }
    }
}
