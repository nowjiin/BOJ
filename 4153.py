while True:
    triangle = list(map(int, input().split()))
    triangle.sort()

    if 0 in triangle:
        break

    if triangle[0]**2 + triangle[1]**2 == triangle[2]**2:
        print("right")
    else:
        print("wrong")
