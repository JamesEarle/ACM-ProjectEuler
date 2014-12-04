__author__ = 'jamesearle'

max = 0
for x in range(999,100,-1):
	for y in range(x,100,-1):
		val = x*y
		if val > max:
			s = str(val)
			if s == s[::-1]:
				max = val
print max