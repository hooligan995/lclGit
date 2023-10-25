package BitVetory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liucl5
 * @version 1.0
 * @date 2023/10/25 11:57
 * @since 1.0
 */
public class Mybitvetorytest {
    //问题描述：将一组不重复的整数（特别大的）按顺序输出。
    //n个整数。一个整数32位。一位（bit）可以表示一个整数（位置）。可以表示 0~n-1个整数,从左到右开始算，从0开始算。7，6，5，4，3，2，1，0
    //(a+b-1)/b向上取值的表达。
    //位向量表示0/1的数组
    //当前值/32 的商表示下标。 当前值%32的余数表示第几位。
    //初始化位向量数组位0。如001010=={1,3}
    //将在某个位置上存在的数标为1。
    //排序输出
    private int n;//当前数最大值范围
    public static final int bitLength = 32;//一个整数32位。
    private int[] bitArr;

    public Mybitvetorytest(int n) {
        this.n = n;
        bitArr = new int[(n - 1) / bitLength + 1];
        for (int i = 0; i < n; i++) {
            setTo0(i);
        }
    }

    /**
     * 置1
     *
     * @param
     * @return
     * @date 2023/10/25 12:11
     * @author liucl5
     */
    public void setTo1(int i) {
        bitArr[i / bitLength] |= 1 << (i % bitLength);
    }

    /**
     * 置0
     * arr所有数组值的位，都置为0
     *
     * @param null
     * @return {@link null}
     * @date 2023/10/25 12:11
     * @author liucl5
     */
    public void setTo0(int i) {
        bitArr[i / bitLength] &= ~(1 << (i % bitLength));
    }

    /**
     * 取值(某个数组值下面的第几位是否存在1)
     *
     * @param
     * @return {@link int}
     * @date 2023/10/25 12:13
     * @author liucl5
     */
    public int getValue(int i) {
        return Integer.bitCount(bitArr[i / bitLength] & (1 << (i % bitLength)));
    }

    public List<Integer> getSortList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (getValue(i) == 1) {
                list.add(i);
            }
        }
        return list;
    }
}
