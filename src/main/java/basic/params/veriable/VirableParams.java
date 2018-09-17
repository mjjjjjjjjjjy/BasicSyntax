/**
 * 
 */
package basic.params.veriable;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mo Jianyue
 *
 * @date 创建时间 2018年9月16日 下午1:28:33
 * 
 */
public class VirableParams {
    
    private static final Logger log = LoggerFactory.getLogger(VirableParams.class);

    
    public static void testVirable(String aString,String ... aStrings){
        log.info(aString);
        Arrays.stream(aStrings).forEach(log::info);
    }
    
    public static void main(String[] args) {
        VirableParams.testVirable("ss");
    }
}
