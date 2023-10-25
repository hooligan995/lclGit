package BitVetory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author liucl5
 * @version 1.0
 * @date 2023/10/25 11:58
 * @since 1.0
 */
public class TestV {
    public static void main(String[] args) {
        Integer[] arr = {3,12,4,6,7,2,8,9,10};
        Mybitvetorytest mybitvetorytest = new Mybitvetorytest(13);
        for(int a:arr){
            mybitvetorytest.setTo1(a);
        }
        List<Integer> result = mybitvetorytest.getSortList();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.toArray()));
        System.out.println(Arrays.toString(getRandom(16).toArray()));
    }
    public static List<Integer> getRandom(Integer n){
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        while(randomList.size()<(n-1)){
            int e = random.nextInt(n-1)+1;
            if(!randomList.contains(e)){
                randomList.add(e);
            }

        }
        return randomList;

    }
}
