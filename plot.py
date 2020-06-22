import numpy as np
import matplotlib.pyplot as plt

s=[]
i=[]
r=[]
t=[]
f=open("SirData.txt","r")
j=0
for line in f:
    str=line.split()
    s.append(float(str[0]))
    i.append(float(str[1]))
    r.append(float(str[2]))
    t.append(j*0.001)
    j=j+1
f.close()

print(j)
plt.figure()
plt.plot(t,s,label="S")
plt.plot(t,i,label="I")
plt.plot(t,r,label="R")
plt.legend()
plt.xlabel("t")
plt.ylabel("y")
plt.savefig("SIR.jpg")
plt.show()


		
