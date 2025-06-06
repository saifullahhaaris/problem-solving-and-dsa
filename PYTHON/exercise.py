# # Check if a Number is Prime
# # Write a function that checks whether a number is prime.


# primenumbers = int(input("Enter a number to check: "))

# def prime():
#     if primenumbers<1:
#         print(f"{primenumbers} isn't a prime number")
#         return

#     for i in range (2,primenumbers):
#         if primenumbers % i == 0:
#             print(f"{primenumbers} is not a prime number")
#             return

#     print(f"{primenumbers} is a prime number")

# prime()










# # Find the Largest Number in a List
# # Given a list of numbers, write code to find the largest number without using max().


# rownumbers = input("Enter few numbers with space deviding: ")
# listing = list(map(int,rownumbers.split(" ")))
# bignumber = listing[0]

# for i in listing:
#         if i>bignumber:
#             bignumber=i
#             print(i)

# print(bignumber)










# # Count Vowels in a Word
# # Write a function that counts how many vowels (a, e, i, o, u) are in a given word.


# sentence = input("Enter a sentence: ")
# vowelsCount = 0
# vowels = ['a', 'e', 'i', 'o', 'u']
# sliced = list(sentence.lower())
# for i in sliced:
#     if i in vowels:
#         vowelsCount += 1
# print(vowelsCount)










# # Reverse a String
# # Ask the user for a string and print its reverse.


# # 1st method
# string = input("Enter a string: ")
# reversed = string[::-1]
# print("Reversed string: ", reversed)

# # 2nd method
# string2 = input("Enter a String to reverse: ")
# reversed2 = []
# splitted = list(string2)
# print(splitted)
# for i in splitted:
#     reversed2.insert(0, i)
#     print(reversed2)

# print(reversed2)
# print("Reversed string is ", "".join(reversed2))










# # Print All Even Numbers from 1 to 20
# # Write a loop that prints only the even numbers between 1 and 20.


# numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

# for even_numbers in numbers:
#     if (even_numbers % 2 == 0):
#         print (even_numbers)



















