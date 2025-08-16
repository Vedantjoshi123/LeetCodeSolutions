class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> mainlist = new ArrayList<>();
        // List<Integer> el = new ArrayList<>();
        // mainlist.add(el);
        // for(int i=1; i<=nums.length; i++){
        //     List<Integer> list = new ArrayList<>();
        //     for(int j=i; j<nums.length; j++){
        //         list.add(j);
        //     }
        //     mainlist.add(list);
        // }
        // return mainlist;

        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> el = new ArrayList<>();
        mainlist.add(el);

        for(int num : nums){
            int size = mainlist.size();
            for(int i=0; i<size; i++){
                List<Integer> list = new ArrayList<>(mainlist.get(i));
                list.add(num);
                mainlist.add(list);
            }
        }
        return mainlist;
    }
}