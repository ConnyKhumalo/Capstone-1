#Create a program that allows the user to access two different financial calculators
#an investment calculater and a home loan repayment calculater.
import math
#The user should be  allowed to choose  which calculation they want to do
print("Choose either 'investment' or 'bond' from  the menu below:")
print("investment - to calculate the amount of interest you'll earn on interest.")
print("bond - to calculate the amount of interest you'll have to pay on a home loan.")
#The   way the user capitalises their selection should not have any affect on how the program proceeds
financial_choice=input("Enter:\n")
#If user selects investment as financial_choice
if financial_choice == "investment" or financial_choice == "Investment" or financial_choice == "INVESTMENT":
#ask user to answer the following questions
    P=int(input("Enter the amount of money you are depositing: "))
    r=int(input("Enter the number of interest rate:  "))
    t=int(input("Enter the number of years you plan on investing for: "))
    interest=input("Enter:'Simple'  or 'Compound' or '' interest: ")
#If user selects "Simple" interest
#Calculate the total amount when simple interest is applied
    if interest=="Simple":
        A=P*(1 + r*t)/100
        print(f"R{A}")
#If user selects "Compound" interest
#Calculate the total amount when  compound interest is applied
    if interest=="Compound":
        A=P*(math.pow((1 + (r/100)),t))
        print(f"R{A}")
#If user selects bond as financial_choice
#Calculate how much the user will have to repay each month
if financial_choice =="bond" or financial_choice ==  "Bond" or financial_choice == "BOND":
    P=float(input("Enter present value of the house: "))
    i=float(input("Enter the interest rate: "))
    n=int(input("Enter the number of months you plan to take to repay the bond: "))
    x= i*P / (1-math.pow((1+i),(-(n))))
    y= x/12
    print(f"Total bond = R{round(x,2)}")
    print(f"Monthly payment = R{round(y,2)}")
