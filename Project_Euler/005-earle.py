__author__ = 'jamesearle' 

list = [1,2,3,5,7,11,13,17,19]

ctr = 1
while True:
	check = True
	for val in list:
		if ctr % val != 0:
			check = False
			break

	if check:
		print ctr
		break
	else:
		ctr = ctr + 1

	print ctr
