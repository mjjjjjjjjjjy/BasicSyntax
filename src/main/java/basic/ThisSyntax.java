/**
 * 
 */
package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mo Jianyue
 *
 * @date 创建时间 2018年9月16日 上午11:15:42
 * 
 */
public class ThisSyntax {
    
    private static final Logger log = LoggerFactory.getLogger(ThisSyntax.class);

    private int a;
    
    public ThisSyntax add(){
        a++;
        return this;
    }
    
    
    public static void main(String[] args) {
        ThisSyntax thisSyntax = new ThisSyntax();
        log.info(thisSyntax.a+"");
        thisSyntax.add().add().add();
        log.info(thisSyntax.a+"");
    }
}
