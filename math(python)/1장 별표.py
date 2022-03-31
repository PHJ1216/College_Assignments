import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(0,10,301)
fx = 0.5*(x**2-6*x+8)
plt.plot(x,fx)
plt.show()

x1 = np.linspace(-5,-1.01,301)
k1 = -0.5+1/(x1+1)
x2 = np.linspace(-1,5,301) 
k2 = -0.5+1/(x2+1)
plt.plot(x1,k1,x2,k2)
plt.show()