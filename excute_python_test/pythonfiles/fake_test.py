### fake, pandas import
from faker import Faker
import pandas as pd


fake = Faker('ko-KR')
plist = [
    ['test1', 1, 'x', 1],
    ['test2', 3, 'y', 2],
    ['test3', 5, 'z' ,3]
]
### DataFrame
df = pd.DataFrame(plist, columns=['name','age','email','phone'], index=[i for i in range(3)])
a = df['name'][0]
print(a)

class changedf():
    
    def rename(row):
        newname = fake.name()
        return newname
    
    def reage(row):
        newage = fake.pyint(min_value=19, max_value=100)
        return newage
    
    def readress(row):
        newadress = fake.address()
        return newadress
    
    def reemail(row):
        newemail = fake.email()
        return newemail
    
    def rephone(row):
        newphone = fake.phone_number()
        return newphone
    
    def rejob(row):
        rejob = fake.job()
        return rejob
    

df['name']= df.apply(changedf.rename, axis=1)    
df['age']= df.apply(changedf.reage, axis=1)    
df['address'] = df.apply(changedf.readress, axis=1)    
df['email']= df.apply(changedf.reemail, axis=1)    
df['phone']= df.apply(changedf.rephone, axis=1)    
df['job'] = df.apply(changedf.rejob, axis=1)

country = pd.Series([ fake.country() for i in range(3) ], index = [n for n in range(3)])
df['country'] = country

print(df)
print('The END')