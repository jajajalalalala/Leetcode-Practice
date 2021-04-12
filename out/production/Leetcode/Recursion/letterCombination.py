def letterCombinations(self, digits: str) -> List[str]:
    if not digits:
        return []
    digitMap = {
        2: ["a", "b", "c"],
        3: ["d", "e", "f"],
        4: ["g", "h", "i"],
        5: ["j", "k", "l"],
        6: ["m", "n", "o"],
        7: ["p", "q", "r", "s"],
        8: ["t", "u", "v"],
        9: ["w", "x", "y", "z"]

    }

    digitList = [int(i) for i in digits]
    result = list(self.getCombination(digitList, digitMap, "", 0).split(","))
    result = [i for i in result if i]
    return result



def getCombination(self, digitList, digitMap, cur, pos):
    result = ""


    if len(cur) == len(digitList):

        result += cur

        return result

    number = digitList[pos]

    for j in digitMap[number]:
        cur += j

        result += self.getCombination(digitList,digitMap, cur, pos + 1) + ","
        cur = cur[:-1]


    return result