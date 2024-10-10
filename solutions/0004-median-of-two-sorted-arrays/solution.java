class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0&&nums2.length==0){
            return 0.0;
        }
        else if(nums1.length==1 && nums2.length==0){
            return (double)nums1[0];
        }
        else if(nums1.length==0 && nums2.length==1){
            return (double)nums2[0];
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
       Integer[] nums3=arr.toArray(new Integer[0]);
        Arrays.sort(nums3);

       if(nums3.length%2==0){
        double median=(nums3[nums3.length/2]+nums3[nums3.length/2-1])/2.0;
        return median;
       }

       else {
        return (double) nums3[nums3.length/2];
       }
    }
        
    }

