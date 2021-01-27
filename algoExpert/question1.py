def summation(list, integer):
    if list == []:
        print("this is not allowed")
    else:
        for i in range(0, len(list)):
            for j in range(0, len(list)):
                if (list[i] + list[j] == 10):
                    if i != j:
                        print("kudos")
                        print(i, j, "happened, which are ", list[i], list[j])
                        if list[i] > list[j]:
                            print("the sorted version is [", list[j], list[i], "]")
                        else:
                            print("the sorted version is [", list[i], list[j], "]")



                else:
                    continue

summation([3,5,-4,8,11,1,-1,6],10)

def main():
    pass

if __name__ == '__main__':
    main()
