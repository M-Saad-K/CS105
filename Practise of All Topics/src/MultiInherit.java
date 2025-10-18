public interface MultiInherit {
    public int age = 0;
    public static String name = " ";
    public double balance = 0.0;

    public default boolean haveBalance(){

        if(balance > 0){
            return true;
        }

        return false;
    }

}
