scoreTally =  input("Input chars indicating who has scored a point: ")
scoreBoard = {}

for letter in scoreTally:
    if letter.lower() not in scoreBoard:  
        scoreBoard[letter.lower()] = 0
    if letter.islower():
        scoreBoard[letter.lower()] += 1
    else:
        scoreBoard[letter.lower()] -= 1

print(*sorted(scoreBoard.items(), key = lambda x: x[1], reverse=True))

