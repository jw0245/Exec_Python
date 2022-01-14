package Excute_python.Run_Python_CLI;

public class DB_Connect_test {
    public static void main(String[] args) {
        /// execPath는 CLI 입력문구
        String execPath ="python .\\pythonfiles\\Mysql_connect.py";
        Execute_py executepy = new Execute_py();
        executepy.Execpython(execPath);
    }
}
