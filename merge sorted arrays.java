class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        
        int x=m-1,y=n-1,z=m+n-1,t;
        while(x>=0 && y>=0)
        {
            
            if(nums1[x]<nums2[y])
            {
                nums1[z]=nums2[y];
                z--;
                y--;
            }
            else
            {
                nums1[z] = nums1[x];
                x--;
                z--;
            }
        }
        if(y>=0)
        {
            for(int i=y;i>=0;i--)
            {
                nums1[z]=nums2[i];
                z--;
            }
        }
        
        
    }
}
