__author__ = 'jamesearle'


def factors(n):
    list = []

    i = 1
    while i < n:
        if n % i == 0:
            list.append(i)
    list.append(n)
    i += 1
    return list


def primefactors(n):
    list = factors(n)
    primefacts = []
    for i in range(1, len(list)):
        val = list[i]
        les = factors(val)
        if len(les) == 2:
            # print val
            primefacts.append(val)
    return primefacts


print factors(600851475143)
# reaches memory error, refactor code to break down problem
#print primefactors(600851475143)