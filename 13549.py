import heapq

n, k = map(int, input().split())
distance = [int(1e9)] * 100001

q = []
heapq.heappush(q, (0, n))
distance[n] = 0

while q:
    dist, current = heapq.heappop(q)
    if current - 1 >= 0:
        if distance[current - 1] > dist + 1:
            distance[current - 1] = dist + 1
            heapq.heappush(q, (dist + 1, current - 1))
    if current + 1 <= 100000:
        if distance[current + 1] > dist + 1:
            distance[current + 1] = dist + 1
            heapq.heappush(q, (dist + 1, current + 1))
    if current * 2 <= 100000:
        if distance[current * 2] > dist:
            distance[current * 2] = dist
            heapq.heappush(q, (dist, current * 2))

print(distance[k])
