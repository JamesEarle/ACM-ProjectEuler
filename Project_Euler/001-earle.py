__author__ = 'jamesearle'

def fizzbuzz(n):
    sum = 0
    for i in range(1,n):
        if i % 3 == 0 or i % 5 == 0:
            sum += i
    return sum

print(fizzbuzz(1000))