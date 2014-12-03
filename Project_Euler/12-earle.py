# Project Euler - Problem 12
# James Earle, je11zi@brocku.ca
# Brock University
import timeit

def run():
	i = 0
	length = 0
	while length < 500:
		length = list_num_divisors(triangle_number(i))
		i += 1
	return (triangle_number(i), length) 

def triangle_number(n):
	x = (n * (n+1))/2
	return x

def list_num_divisors(n):
	x = 0
	for i in range(1,n+1):
		if n%i == 0:
			x += 1
	return x
start = timeit.default_timer()
print run()
stop = timeit.default_timer()
print stop - start 
print '\a'
