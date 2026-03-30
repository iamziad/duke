class Casting {
    public static void main(String[] args) {
        /*
          In C, this is totaly fine. the C compiler won't shout at u for doing this,
          as long as the value of 'i' didn't exceed the range of 's'

          But, in Java, the compiler won't allow this from the beginning,
          unless you explicitly cast it,

        int i = Short.MAX_VALUE; // 32767
        short s = (i + 1); // won't compile
        short ss = 32764 + 1; // compiles cuz the compiler knows the actual value at compile time

        */

        int i = Short.MAX_VALUE; // 32767
        short s = (short)(i + 1); /* compiles, because it's guaranteed that the expression value won't exceed the short's range,
                                     even if the value is not known at compile time */

        System.out.println(s);
    }
}
