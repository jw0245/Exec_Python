import pandas as pd

### dataframe

fake = Faker('ko-KR')
plist = [
    ['test1', 1, 'x', 1],
    ['test2', 3, 'y', 2],
    ['test3', 5, 'z' ,3]
]
df = pd.DataFrame(plist, columns=['name','age','email','phone'], index=[i for i in range(3)])
a = df['name'][0]
print(a)
