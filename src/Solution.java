import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Solution {


    public int[] mergeSorttedArray(int[] arrayA,int[] arrayB){

        int lengthA = arrayA.length;
        int lengthB = arrayB.length;
        //int[lengthA+lengthB] result = {};
        //List<Integer> result = new ArrayList<>(lengthA + lengthB);
        int[] result = new int[lengthA+lengthB];

        int i=0,j=0,k=0;
        while(i < lengthA || j < lengthB){
            if(arrayA[i] <= arrayB[j]){
                result[k++] = arrayA[i];
                i++;
            }else{
                result[k++] = arrayB[j];
                j++;
            }
        }
        if(i<lengthA){
            while(i<lengthA){
                result[k++] = arrayA[i++];
            }
        }else if(j<lengthB){
            while(j<lengthB){
                result[k++] = arrayB[j++];
            }
        }
        return result;
    }




    public String serilize(Tree root){

        //StringBuilder result = new StringBuilder();
        String result = "";
        Tree t = root;
        Queue<Tree> queue = new ConcurrentLinkedDeque<>();

        queue.add(t);

        while(!queue.isEmpty()){

            Tree head = queue.peek();
            if(head.left != null){
                queue.add(t.left);
            }else if(head.left == null){
                result.concat("#");
            }
            if(head.right != null){
                queue.add(t.right);
            }else if(head.right == null){
                result.concat("#");
            }

            ((ConcurrentLinkedDeque<Tree>) queue).pop();
            result.concat(String.valueOf(t.value));
        }
        return result;
    }


    public Tree deSerilize(String data){
        Tree t = new Tree(0);
        return t;
    }

    private static Boolean barachJudge(String tips,List<String> branchTips){
        if(tips==null || branchTips.size()==0){
            return false;
        }
        int i,j;
        int index = 0;
        for(i=0;i<branchTips.size();){
            for(j=index;j<tips.length();j++){
                if(String.valueOf(tips.charAt(j)).equals(branchTips.get(i))){
                    index=j+1;
                    i++;
                    break;
                }
            }
            if(j == tips.length()){
                return false;
            }
        }
        return true;
    }

    public String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }

        Math.
        Collections.sort(list,new Comparator<Integer>(){

            @Override
            public int compare(Integer num1,Integer num2){
                StringBuilder sb1 = new StringBuilder(String.valueOf(num1));
                sb1.append(String.valueOf(num2));
                StringBuilder sb2 = new StringBuilder(String.valueOf(num2));
                sb2.append(String.valueOf(num1));
                return sb1.toString().compareTo(sb2.toString());
            }
        });
        StringBuffer res = new StringBuffer();
        for(Integer num:list){
            res.append(String.valueOf(num));
        }
        return res.toString();
    }

    public static void main(String[] args){

        int[] a = {1,2,3,4};
        Integer[] b = new Integer[]{1,2,3};
        List<Integer> list = new LinkedList<>();
        list.size();
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(b));

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(4,5,6,7));
        Integer[] c = arrayList.toArray(new Integer[0]);

        List<Integer> d = new ArrayList<Integer>(){{add(6);add(7);}};
        ArrayList<Integer> arrayList1 = new ArrayList<>();


        arrayList.addAll(3,d);
        List<Integer> e = new ArrayList<>(d);
        e.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(e);

        int[][] matrix = {{1,2,3},{5,6,7}};
        int len = matrix.length;
        int broad = matrix[0].length;

        System.out.println(broad);

    }
}
