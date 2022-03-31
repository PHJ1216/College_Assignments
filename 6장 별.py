import numpy as np

a = np.array([-1,-2,3])   
b = np.array([4,5,-6])

print("a와b를 외적한 후 b와 내적하면 0 증명 : ",np.dot(np.cross(a,b),b))