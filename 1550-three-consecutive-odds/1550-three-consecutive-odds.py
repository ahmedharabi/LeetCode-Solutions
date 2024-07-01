class Solution(object):
    def threeConsecutiveOdds(self, arr):
        j=0
        l=[]
        k=[]
        for i in arr:
            if(j<3 and i%2!=0):
                l.append(i)
                j+=1
            else:
                k.append(l)
                l=[]
                j=0
        k.append(l)
        for i in k:
            if(len(i)==3):
                return True
        return False
        
            

        