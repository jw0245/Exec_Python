package Excute_python.Run_Python_CLI;

public class Execute_py_Main {

    public static void main(String[] args) {
        /// execPath는 CLI 입력문구
        String execPath ="python C:\\Mydata\\Res_log\\Res_data\\Anonymization_data.py";
        Execute_py executepy = new Execute_py();
        executepy.Execpython(execPath);
    }
}

