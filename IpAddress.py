"""Imagine you are working on a network configuration tool for a company. This tool needs to validate the IPv4 
addresses entered by users to ensure they are correctly formatted before saving them in the system. An incorrectly
formatted IP address could lead to network connectivity issues, making validation a crucial part of the tool."""

IpAddress = input("Enter Address: ")
addressList = IpAddress.split(".")
res = "true"
for address in addressList:
    if int(address) not in range(0,256) or len(addressList)<4 or len(address)>3:
        res = "false"
print(res)