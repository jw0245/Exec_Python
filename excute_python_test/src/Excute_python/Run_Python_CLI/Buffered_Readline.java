package Excute_python.Run_Python_CLI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Readline {

    public void Execpython(String execPath)  {

    BufferedReader input =null;

            try {
                long start, end;
                String line;
                // n 결과 열 index
                int n = 1;

                // 명령어 + 파일 위치 = execPath, 한글깨짐 현상 euc-kr
                Process p = Runtime.getRuntime().exec(execPath);
                input = new BufferedReader(new InputStreamReader(p.getInputStream(),"EUC-KR"));

                while ((line = input.readLine()) !=null) {
                    System.out.println(n + "줄 : " + line);
                    n += 1;
                }

            }catch (IOException err) {
                err.printStackTrace();
            }finally {
                if (input !=null)
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }

        }
    }


