class Solution:
    def largestTimeFromDigits(self, A: List[int]) -> str:
        combinations = sorted(list(itertools.permutations(A)),reverse=True)
        #hour should be first two digits to be 00 -- 23
        #minute should be next two digits to be 00 -- 59
        for ix in combinations:
            hr,hr_i,sec,sec_i=ix
            hour_hand = hr*10 + hr_i
            minute_hand = sec*10 + sec_i
            
            if(hour_hand<24 and minute_hand<60):
                #return "{}:{}".format(hour_hand,minute_hand)
                return f"{hr}{hr_i}:{sec}{sec_i}"
            
        return ""

