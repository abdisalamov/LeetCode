class Solution:
    def romanToInt(self, s: str) -> int:
        roman_n = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000  
        }
        output = 0
        roman = list(s)
        for i, char in enumerate(roman):
            roman[i] = roman_n[char]
        for i, char in enumerate(roman):
            if i+1 < len(roman):
                if roman[i] >= roman[i+1]:
                    output += roman[i]
                elif roman[i] < roman[i+1]:
                    output -= roman[i]

        output += roman[-1]

        return output

        
