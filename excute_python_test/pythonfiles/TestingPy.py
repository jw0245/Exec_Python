from faker import Faker

# 기존 데이터라고 가정
data = [['이진우',27,'xx6677as@gmail.com','010-3098-9353','서울시 강남구 선릉로 12길 10',
        '매니저','한국']]

#faker 한국용으로 사용
fake = Faker('ko-KR')

data[0][0] = fake.name()
data[0][1] = fake.pyint(min_value=19, max_value=100)
data[0][2] = fake.email()
data[0][3] = fake.phone_number()
data[0][4] = fake.address()
data[0][5] = fake.job()
data[0][6] = fake.country()

### DB연동
import pymysql
conn = pymysql.connect(host='localhost', user='root', password='fourfive12@@', db='Privacy', charset='utf8mb4')
# Connection 으로부터 Cursor 생성
cur = conn.cursor()

cur.execute("insert into privacy (name, age, email, phone, address, job, country) values (%s, %s, %s, %s, %s, %s, %s)"
                , (data[0][0], data[0][1], data[0][2], data[0][3], data[0][4]
                , data[0][5], data[0][6]))
conn.commit()
cur.execute("select * from privacy")
row = cur.fetchall()
print(row)

conn.close()