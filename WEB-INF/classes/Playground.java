public class Playground {
    public static void main(String[] args) {

        var rank = "a";
        if (rank.equals("a")) {
            System.out.println("Good");
        }
        // switch
        switch (rank) {
            case "a":
                System.out.println("Good");
                break;
            case "b":
                System.out.println("Bad");
                break;
            default:
                System.out.println("null");
                break;
        }

        // switch式
        var drink = "beer";
        System.out.println(switch(drink) {
            case "japan", "beer", "wine" -> "jouzou";
            case "whisky" -> "jouryu";
            default -> "none";
        });
        // while
        var i1 = 1;
        while (i1 < 6) {
            System.out.println(i1 + "番目のループです。");
            i1++;
        }
        // do-while
        var i2 = 1;
        do {
            System.out.println(i2 + "番目のループです。");
            i2++;
        } while (i2 < 6);
        // for
        for (var i = 1; i < 6; i++) {
            System.out.println(i + "番目のループです。");
        }
        // 拡張for
        var data = new String[] {"a", "b", "c"};
        for (final String value: data) {
            System.out.println(value);
        }
        // コマンドライン引数
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (var first: list) {
            for (var second: list) {
                System.out.print(first * second + " ");
            }
            System.out.println("");
        }
        // ネストしたループをbreakする
        limit:
        for (var i = 1; i < 10; i++) {
            for (var j = 1; j < 10; j++) {
                var result = i * j;
                if (result < 50) {
                    break limit;
                }
            }
        }
        /* ラッパークラス
        基本型をオブジェクト型として扱うことができるクラス
        int -> Integer
        オブジェクトとしての機能が付与されている
        ラッパークラスはメモリの消費量が大きく処理効率が低い
        参照型のためnullがありえる
        コレクションに対して数値をセットするなどの限られた場合だけに使用する
        # ボクシング
        基本型からラッパーオブジェクトへの暗黙的な変換を行う仕組み
        Integer int_obj = 100;
        # アンボクシング
        ラッパーオブジェクトから基本型への暗黙的な変換を行う仕組み
        int i = int_obj;
        ボクシング/アンボクシングのことをオートボクシングという
        オートボクシングは極力避ける
        */

        // 文字列から数値への変換
        System.out.println(Integer.parseInt("100"));
        System.out.println(Double.parseDouble("1.23"));
        System.out.println(Integer.parseInt("FF", 16));
        System.out.println(Double.parseDouble("0.653e2"));

        // Stringオブジェクト
        var str1 = new String("abc");
        var str2 = "叱る"; // 「サロゲートペア」'叱'が4バイト文字で2バイトを1文字としているのでlengthが合計3になる
        System.out.println(str1.length());
        System.out.println(str2.codePointCount(0, str2.length()));

        var str3 = "Wings";
        System.out.println(str3.equals("WINGS")); // false
        System.out.println(str3.equalsIgnoreCase("WINGS")); // true
        // isBlank(): 空白文字列も「空」と判定する
        var str4 = " ";
        System.out.println(str4.isEmpty()); // false
        System.out.println(str4.isBlank()); // true
    }
}
