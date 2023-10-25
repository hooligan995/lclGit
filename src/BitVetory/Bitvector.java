package BitVetory;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>        修改记录
 * <BR>-----------------------------------------------
 * <BR>        修改日期                        修改人                        修改内容
 * </PRE>
 *
 * @author liucl5
 * @version 1.0
 * @date 2023/10/23 12:23
 * @since 1.0
 */
public class Bitvector {
    public static void main(String[] args) {
        int i = 7<<3;//7*2^3
        System.out.println(i);
        int n = 238<<3;
        System.out.println(n);
        String s = Integer.toBinaryString(238);
        System.out.println(s);
        String s1 = Integer.toBinaryString(1904);
        System.out.println(s1);
        String q = "11101110";
        System.out.println(Integer.parseInt(q,2));
        int max = 214748;
        System.out.println(Integer.toBinaryString(max));
        int m = max<<3;
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));
        int o = -3;
        int j = o<<3;
        System.out.println(Integer.toBinaryString(o));
        System.out.println(Integer.toBinaryString(j));
        String S11 ="11111111111111111111111111111101";
        System.out.println(S11.length());

        int p = 89;
        System.out.println(Integer.toBinaryString(p));
        System.out.println(p>>3);
        System.out.println(Integer.toBinaryString(p>>3));

        System.out.println(3>>3);
        System.out.println(Integer.toBinaryString(3>>3));

        System.out.println(-3>>3);
        System.out.println(Integer.toBinaryString(-3>>3));

        System.out.println(1<<5);
        System.out.println(Integer.toBinaryString(1<<5));

        int arr[] = {0,1,2,3,4,5,6,7};
        int n1 = 8;
        System.out.println("arr===="+Integer.bitCount(arr[n1/32] &= ~(1<<(n1%32))));
    }
}
