package Excute_python.Run_Python_CLI;

public class DB_Connect_test {
    public static void main(String[] args) {
        /// execPath는 CLI 입력문구
        String execPath ="python .\\pythonfiles\\Mysql_connect.py";
        Buffered_Readline buffered_readline = new Buffered_Readline();
        buffered_readline.Execpython(execPath);
    }
}
