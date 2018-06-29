# [2017-06-27] Challenge #321 [Easy] Talking Clock

def talkingClock(time):
    ones = ["one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "eleven ", "twelve ", "twelve ",
                    "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ",
                    "eighteen ", "nineteen "]
    tens = ["oh ", "ten", "twenty ", "thirty ", "fourty ", "fifty"]


    if int(time[3]) == 0:
        print('a')
        minute = tens[0] + ones[int(time[4])-1]
        if int(time[4]) == 0: minute = " "
    elif int(time[3:5]) <= 19:
        print('b')
        minute = ones[int(time[3:5])]
    else:
        print('c')
        if int(time[4]) == 0: minute = tens[int(time[3])]
        else: minute = tens[int(time[3])] + ones[int(time[4])-1]

    if int(time[0:2]) <= 12:
        hour = ones[int(time[0:2]) - 1]
        meridiem = "am"
        if int(time[0:2]) == 00: hour = ones[int(time[0:2]) + 11]
        if int(time[0:2]) == 12: meridiem = "pm"

    else:
        hour = ones[int(time[0:2]) - 13]
        meridiem = "pm"


    return print("It's " + hour + minute + meridiem)

while True:
    time = input("Time input: ")
    talkingClock(time)

# Inspiration from this solution...
# https://old.reddit.com/r/dailyprogrammer/comments/6jr76h/20170627_challenge_321_easy_talking_clock/djgj0ny/
