package basic.gc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xml.internal.security.Init;

/**
* @author MoJianyue
* @version 创建时间：2018年9月28日 下午8:42:44
*/
@Controller
@RequestMapping
public class GcTest1 {

    @RequestMapping(value = "/222", method = RequestMethod.GET)
    @ResponseBody
    public void testGc() {
        int i = 0;
        for (; i < 1000000000; i++) {
            new GcTest1();
        }
        System.out.println("i:"+i);
        System.out.println("gc....");
        Runtime.getRuntime().gc();
    }
}
