import time 

def Recursion(n):
	if n <= 1:
		return n
	return Recursion(n-1) + Recursion(n-2)
start=time.time()

for i in range(10,51,10):
	print('재귀호출(%d)=%i', Recursion(i))
print('재귀호출 소요 시간:%s ms'%(time.time()-start))