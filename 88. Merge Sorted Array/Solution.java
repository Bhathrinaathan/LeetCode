class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m,j=0;j<n;j++,i++)
                nums1[i]=nums2[j];
        int min,temp;
        for (int i=0;i<(m+n);i++)
        {
            min=i;
            for (int j=i;j<(m+n);j++)
                if (nums1[j]<nums1[min])
                    min=j;
            temp=nums1[i];
            nums1[i]=nums1[min];
            nums1[min]=temp;
        }
    }
}
