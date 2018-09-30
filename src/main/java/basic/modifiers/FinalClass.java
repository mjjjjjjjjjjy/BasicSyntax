package basic.modifiers;

/**
* @author MoJianyue
* @version 创建时间：2018年9月28日 下午7:01:21
*/
public final class FinalClass {
    String aString = "1";
    Integer aInteger;
    
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.aString = "2";
        System.out.println(finalClass.aString);
    }
}
