package Excute_python.Jython_Test;
import org.python.util.*;

public class jython_test {

    public static void main(String[] args) {
        System.setProperty("python.cachedir.skip", "true");
        PythonInterpreter interpreter = new PythonInterpreter();
        //결과  ('a+b=', 7)
        interpreter.execfile(".\\pythonfiles\\test1.py");
        //예상결과 test1
        //Jython은 외부라이브러리를 지원하지 않아 오류발생 예정
        interpreter.execfile(".\\pythonfiles\\pandas_test.py");
    }

}
