# Last updated: 1/9/2026, 12:41:18 pm
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return len(set(sentence))==26
        