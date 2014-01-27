'''
Power digit sum
Problem 16
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 21000?
'''
__author__ = 'SUN'

if __name__ == '__main__':
    num = 2 ** 1000
    res = 0
    while num > 0:
        res += num % 10
        num //= 10
    print(res)