package main.com.shawood.daily;

public class FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            // 二分法
            int pivot = 1;
            int left = 1;
            int right = n;
            while (left < right){
                pivot = left + (right - left) / 2;
                if (isBadVersion(pivot)){
                    if (isBadVersion(pivot+1)){
                        left = pivot;
                    }else{
                        return (pivot + 1);
                    }
                }else{
                    if (isBadVersion(pivot-1)){
                        return pivot;
                    }else{
                        right = pivot + 1;
                    }
                }
            }
            return pivot;
        }
    }*/
}
