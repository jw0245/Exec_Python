package Excute_python.Jython_Test;

import org.python.util.*;

public class Testing_Jython {
    public static void main(String[] args) {

        System.setProperty("python.cachedir.skip", "true");
        PythonInterpreter interpreter = new PythonInterpreter();

        //시험 파일 테스트(Jython에서 지원하는 파이썬2.7은 한글을 지원하지 않아 오류)
        interpreter.execfile(".\\pythonfiles\\TestingPy.py");

    }
}
