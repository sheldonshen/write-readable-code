package chapter_02;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example4 {

    private int hash;
    private int c = 2018;

    public void calcHash() {
        // Fast version of "hash = (65599 * hash) + c"//优秀(注释)版本
        hash = (hash << 6) + (hash << 16) - hash + c;//普通版本
    }

}
