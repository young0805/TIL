import heapq // headq 라이브러리 활용 우선순위 큐 사용.

queue = []

heapq.heappush(queue, [2, 'A'])
heapq.heappush(queue, [5, 'B'])
heapq.heappush(queue, [1, 'C'])
heapq.heappush(queue, [7, 'D'])
print (queue)
for index in range(len(queue)):
    print (heapq.heappop(queue))