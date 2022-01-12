package Excute_python.Run_Python_CLI;

public class Buffered_Readline_Main {

    public static void main(String[] args) {
        /// execPath는 CLI 입력문구
        String execPath ="python .\\pythonfiles\\fake_test.py";
        Buffered_Readline buffered_readline = new Buffered_Readline();
        buffered_readline.Execpython(execPath);
    }
}
