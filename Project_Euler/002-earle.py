__author__ = 'jamesearle'

def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

def evenFibs():
    sum = 0
    ctr = 0
    while True:
        val = fib(ctr)
        if val < 4000000:
            if val % 2 == 0:
                sum += val
        else:
            break
        ctr += 1
    return sum

print(evenFibs())