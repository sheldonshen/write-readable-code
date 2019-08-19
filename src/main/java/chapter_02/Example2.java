package chapter_02;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example2 {

    private int    cap    = 2333;
    private double weight = 1.5;

    /**
     * 普通版本
     */
    public double before() {
        return cap >= 0 ? weight * (1 << cap) : weight / (1 << -cap);
    }

    /**
     * 优秀版本
     */
    public double after() {
        if (cap >= 0){
            return weight * (1 << cap);
        }
        return weight / (1 << -cap);
    }

}
