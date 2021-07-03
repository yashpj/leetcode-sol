class Solution {
public:
    vector<vector<int>> generate(int numRows) {
                
        vector<vector<int>> ptr;
        int sum=0;
        
        for(int i=0;i< numRows;i++)
        {
            vector<int> v;
            v.push_back(1);
            
            if(i==0)
            {
                ptr.push_back(v);
                continue;
            }
            
            if(i==1)
            {
                v.push_back(1);
                ptr.push_back(v);
                continue;
            }
        
            for(int j=1;j< i;j++)
            {
                sum = ptr[i-1][j-1] + ptr[i-1][j];
                v.push_back(sum);
            }
            v.push_back(1);
            ptr.push_back(v);
        }
        return ptr;
    }
};
