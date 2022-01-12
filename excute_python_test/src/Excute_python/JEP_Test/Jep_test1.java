package Excute_python.JEP_Test;
import jep.*;
import jep.SubInterpreter;

public class Jep_test1 {

    public static void main(String[] args)  throws JepException {


        // 3.9 버전 이상부터 Jep()가 지원이 안됨
        Jep jep = new SubInterpreter();

        jep.eval("from java.lang import System");
        jep.eval("from faker import Faker");
        jep.eval("import numpy as np");
        jep.eval("import pandas as pd");

        jep.eval("plist = [\r\n"
                + "    ['test1', 1, 'x', 1],\r\n"
                + "    ['test2', 3, 'y', 2],\r\n"
                + "    ['test3', 5, 'z' ,3]\r\n"
                + "]");
        jep.eval("df = pd.DataFrame(plist, columns=['name','age','email','phone'], index=[i for i in range(3)])\r\n"
                + "");

        jep.eval("fake = Faker('ko-KR')");
        jep.eval("f = fake.email()");
        jep.eval("a= df['name'][0]");
        jep.eval("s = 'Hello World'");
        jep.eval("System.out.println(s)");
        jep.eval("System.out.println(a)");
        jep.eval("System.out.println(f)");

        jep.eval("Test = 'Hello World'");
        System.out.println(jep.getValue("Test"));

    }
}
