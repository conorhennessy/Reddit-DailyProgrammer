def qcheck(rowArray):
    for i in rowArray:
        for j in rowArray:
            if i == j or rowArray[i] + i == rowArray[j] + j: return False
    return True

print(qcheck({2, 5, 7, 4, 1, 8, 6, 3}))



