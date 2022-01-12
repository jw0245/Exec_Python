package Excute_python.JEP_Test;

import jep.Jep;
import jep.SubInterpreter;

import java.io.File;

public class Jep_Test2 {

    public boolean TestJep(String path){

        try{
            File pwd = new File(".");
            Jep jep = new SubInterpreter();
            jep.set("test","value from java");
            jep.runScript(path);
            return true;
        } catch(Throwable t){
            t.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {

        Jep_Test2 test2 = new Jep_Test2();
        System.out.println(test2.TestJep(".\\pythonfiles\\Test1.py"));
    }
}
