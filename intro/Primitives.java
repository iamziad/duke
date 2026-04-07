class Primitives {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        float f = 0.5f;
        int x = 5;
        boolean isFun = true;

        int overflowInt1 = Integer.MAX_VALUE + 1; // will compile
        int overflowInt2 = 2147483647 + 1; // will compile
 //       int overflowInt3 = 2147483648; // will crash before compile-time
        int overflowInt4 = 2_147_483_647; // underscore separator

        System.out.println(""+ ++f +"");
        System.out.println("Maximum integer = " + maxInt + "");
        System.out.println(isFun ? "yes" : "no");
        System.out.println("2: "+overflowInt2+" ");
    }
}
