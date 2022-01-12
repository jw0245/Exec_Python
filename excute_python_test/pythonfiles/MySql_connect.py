import pandas as pd
import pymysql
from faker import Faker

fake = Faker('ko-KR')
#원하는 데이터 개수
n = 100
#2차배열 초기화
test_list = [[0] * 4 for _ in range(n)]

### 데이터프레임 생성
df = pd.DataFrame(test_list, columns=['name','age','email','phone'], index=[i for i in range(n)])

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

country = pd.Series([ fake.country() for i in range(n) ], index = [n for n in range(n)])
df['country'] =country

# MySQL Connection 연결
# password 삭제
conn = pymysql.connect(host='localhost', user='root', password='', db='Privacy', charset='utf8mb4')
# Connection 으로부터 Cursor 생성
cur = conn.cursor()

for i in range(len(df)):
    cur.execute("insert into privacy (name, age, email, phone, address, job, country) values (%s, %s, %s, %s, %s, %s, %s)"
                , (list(df['name'])[i], list(df['age'])[i], list(df['email'])[i], list(df['phone'])[i], list(df['address'])[i]
                , list(df['job'])[i], list(df['country'])[i]))
conn.commit()
cur.execute("select * from privacy")
row = cur.fetchall()
print(row)

conn.close()