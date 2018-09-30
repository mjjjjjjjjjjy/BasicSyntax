package basic.enumtest;
/**
* @author MoJianyue
* @version 创建时间：2018年9月28日 下午8:05:24
*/
public enum Season {
    SPIRNG("春"),SUMBER("夏");
    private String name;
    private Season(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public static void set() {
        SPIRNG.name = "春a";
    }
    
}
