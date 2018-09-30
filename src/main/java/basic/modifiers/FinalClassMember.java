package basic.modifiers;
/**
* @author MoJianyue
* @version 创建时间：2018年9月28日 下午4:48:36
*/
public class FinalClassMember {
    
    public final String name;
    public final String age;
    {
        name = "a";
    }
    
    public FinalClassMember(String age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        FinalClassMember finalClass = new FinalClassMember("age");
        String name2 = finalClass.name;
        System.out.println(name2);
        
        System.out.println("age:"+finalClass.age);
    }
    
}
