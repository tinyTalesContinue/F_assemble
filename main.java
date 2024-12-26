


class main {
    public static void main(String args[]){
        //スペース有り

        //Format.init()

        //1+1+2*32=
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }


        //args[] の中身を一文字ずつ見て、適宜関数呼び出し
        //Operand :
        /*
        Plus()足し算
        Minus()引き算
        Mult()掛け算
        Div()割り算
        Num(String num)数字入力
        */
        for (int i=0; i<args.length; i++) {

            if (args[i] == "+") {
                //Operand.Plus();
                //足し算を実行するアセンブリコードを出力する関数
            }

            if (args[i] == "-") {
                //Operand.Minus();
            }

            if (true) {
                //
            }
        }

        //Format.close()
    }
}