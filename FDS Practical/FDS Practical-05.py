#!/usr/bin/env python
# coding: utf-8

# In[6]:


#for inline plots in jupyter
get_ipython().run_line_magic('matplotlib', 'inline')
#import matplotlib
import matplotlib.pyplot as plt
#  for Latex equations
from IPython.display import Math,Latex
# for displaying images
from IPython.core.display import Image
import numpy as np


# In[7]:


# import seaborn
import seaborn as sns
# setting for seaborn plotting style 
sns.set(color_codes=True)
# setting for seaborn plot sizes
sns.set(rc={'figure.figsize':(5,5)})


# # Uniform Distribution

# In[8]:


from scipy.stats import uniform
n = 10000
start = 10
width = 20
data_uniform = uniform.rvs(size = n, loc = start, scale = width)

ax = sns.displot(data_uniform, bins = 100, kde = True, color = "red", linewidth = 15, alpha = 1)
ax.set(xlabel = "Uniform Continuous Dist.", ylabel = "Frequency")


# # Normal Distribution

# In[9]:


from scipy.stats import norm
data_norm = norm.rvs(size = 10000, loc = 0, scale = 1)

ax = sns.displot(data_norm, bins = 100, kde = True, color = "red", linewidth = 15, alpha = 1)
ax.set(xlabel = "Normal Dist.", ylabel = "Frequency")


# # Exponential Distribution

# The exponential distribution describes the time between events in a Poisson point process. i.e a process in which events occurs 
# continuously and independently at a constant average rate. It has a parameter lambda
# called rate parameter, and its eqution is described as:image.png
#     
#     A decreasing exponential distribution looks like :

# In[10]:


from scipy.stats import expon 
data_expon = expon.rvs(scale =1,loc=0,size=1000)


# In[11]:


ax = sns.distplot(data_expon,kde = True, bins=100, color = 'skyblue', hist_kws={'linewidth':15,'alpha':1})
ax.set(xlabel='Exponential Distribution', ylabel='Frequency')


# # Chi Square Distribution
# Chi Square distribution is used as a basis to verify the hypothesis.
# It has two parameters.
# 
# df-(degree of freedom).
# size - The shape of the returned array.
# Draw out a sample for chi squared distribution with degree of freedom 2 with size 2x3

# In[12]:


from numpy import random
x = random.chisquare(df=2,size=(2,3))
print(x)


# In[13]:


from numpy import random 
import matplotlib.pyplot as plt
import seaborn as sns

sns.distplot(random.chisquare(df=1,size=1000),hist=False)
plt.show()


# # Weibull Distribution

# In[14]:


a = 5
s = random.weibull(5, 10)


x = np.arange(1, 100) / 50

print(x)

def weib(x, n, a):
    return (a / n) * (x / n) ** (a - 1) * np.exp(- (x / n) ** a)

count, bins, ignored = plt.hist(np.random.weibull(5, 1000))
x = np.arange(1, 100) / 50
scale = count.max() / weib(x, 1, 5).max()
plt.plot(x, weib(x, 1, 5) * scale)
plt.show()


# In[ ]:




