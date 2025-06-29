class Pattern{

    static void rectangle(int num){
        for (int i = 0 ;i< num ;i++){
            for (int j=0;j<num;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inverted_star(int num){
        for (int i =0;i<num;i++){
            for (int j=0;j<(num-i);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void half_pyramid(int num){
        for (int i= 1 ;i<=num;i++){
            for (int j= i ;j  <=num;j++){
                System.out.print((j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void char_pattern(int num){

        char ch = 'A';

        for(int i=0 ;i<num;i++){
           for(int j=i;j<num;j++){
               System.out.print(ch++ + " ");
           }
            System.out.println();
        }
        System.out.println();
    }

    static void hollow_rectangle(int num){
        for(int i = 1 ;i <= num ; i++ ){
            for(int j = 1 ;j<=num ;j++){
                if (i==1|| i==num || j == 1 || j==num){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inverted_rotated_half_pyramid(int num){
        for (int i = 1 ;i<=num ;i++){
            for(int j = 1 ;j<=(num-i) ;j++){
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inverted_rotated_half_pyramid_number(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= (num-i) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void floyds_triangle(int num){
        int count=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void zero_one_triangle(int num){
        int count=0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2==1){
                    count=1;
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
                count++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void butterfly_pattern(int num){
        for (int i = 1; i <= num; i++ ) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j =1 ; j <=(num-i) ; j++) {
                System.out.print("  ");
            }

            for (int j =1 ; j <=(num-i) ; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++ ) {
            for (int j = 1; j <= (num-i); j++) {
                System.out.print("* ");
            }

            for (int j = 0; j <i ; j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= (num-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rohmbus(int num){
        for (int i = 0 ;i<num ;i++){
            for (int j = 0; j < (num-i); j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hollow_rohmbus(int num){
        for (int i = 0 ;i<num;i++){
            for (int j= 0 ;j<(num-i);j++){
                System.out.print("  ");
            }

            for (int j = 0; j < num; j++) {
                if(i==0 || i==(num-1) || j==0 || j==(num-1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pyramid(int num){
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < (num-i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void diamond(int num){
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < ((num-1)-i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=0;i<num;i++){
            for (int j = 0; j <i ; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2*((num-1)-i)+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rectangle(4);
        inverted_star(4);
        half_pyramid(4);
        char_pattern(4);
        hollow_rectangle(4);
        inverted_rotated_half_pyramid(4);
        inverted_rotated_half_pyramid_number(5);
        floyds_triangle(5);
        zero_one_triangle(5);
        butterfly_pattern(4);
        rohmbus(4);
        hollow_rohmbus(4);
        pyramid(4);
        diamond(4);
    }
}