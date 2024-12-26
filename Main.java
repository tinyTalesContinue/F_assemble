import sample.Format;
import sample.Operand;

class Main {
    public static void main(String args[]){

        //スペース有り
        Format.init();

        //文字列、演算子連続はエラー
        //前の入力が演算子or数値をフラグで持っておく

        //args[] の中身を一文字ずつ見て、適宜関数呼び出し
        //Operand :
        /*
        plus()足し算
        minus()引き算
        mult()掛け算
        div()割り算
        num(String num)数字入力
        */
        for (int i=0; i < args.length; i++) {
            if (args[i] == "+") {
                //足し算を実行するアセンブリコードを出力する関数
                Operand.plus();
            }

            else if (args[i] == "-") {
                //引き算を実行するアセンブリコードを出力する関数
                Operand.minus();
            }

            else if (args[i] == "*"){
                //掛け算を実行するアセンブリコードを出力する関数
                Operand.mult();
            }

            else if (args[i] == "/"){
                //割り算を実行するアセンブリコードを出力する関数
                Operand.div();
            }

            else if (isNumeric(args[i])){
                Operand.num(args[i]);
            }
        }
        Format.close();
    }

    // 引数が数値かどうか判定する関数
    private static boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
