package Excute_python.Run_Python_CLI;

public class Test_python_execute {

    public static void main(String[] args) {

        /// execPath는 CLI 입력문구
        String execPath ="python .\\pythonfiles\\TestingPy.py";
        Execute_py executepy = new Execute_py();
        executepy.Execpython(execPath);
    }
}
