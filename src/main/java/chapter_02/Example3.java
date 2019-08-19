package chapter_02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example3 {

    private Map<String, Coder> coderMap = new HashMap<String, Coder>();

    public Example3() {
        coderMap.put("biezhi", new Coder(true));
        coderMap.put("80k", new Coder(false));
    }

    private Coder findCoder(String key) {
        return coderMap.get(key);
    }

    /**
     * 普通版本
     */
    public void before() {
        Coder   coder;
        boolean hasGirlFriend = (null != (coder = findCoder("biezhi"))) && coder.hasGirlFriend();
        System.out.println("是否有女朋友: " + hasGirlFriend);
    }

    /**
     * 优秀版本
     */
    public void after() {
        Coder coder = this.findCoder("biezhi");
        if(null != coder){
            System.out.println("是否有女朋友: " + coder.hasGirlFriend());
        }
    }

    public static void main(String[] args) {
        new Example3().before();
        new Example3().after();
    }

}
