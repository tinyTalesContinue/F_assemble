//アセンブリコード出力用のフォーマッター

public class Format {

    //セクションの指定など
    public void init() {
        System.out.println(".data");
        System.out.println("L_fmt:");
        System.out.println("  .ascii \"%d\n\0\"");
        System.out.println(".text");
        System.out.println(".globl _main");
        System.out.println("_main:");
        System.out.println("  pushq %rbp");
        System.out.println("  movq %rsp, %rbp");
        System.out.println("  movl $0, %ecx");
        System.out.println("  movl $0, %edx");
        System.out.println("  movl $0, %ebx");
        System.out.println("  movl $0, %esi");
        System.out.println("  movl $0, %edi");
        System.out.println("  movl $0, %eax");
    }

    //スタック領域を閉じる
    public void close() {
        System.out.println("  leaq L_fmt(%rip), %rdi");
        System.out.println("  movslq %ecx, %rsi");
        System.out.println("  movb $0, %al");
        System.out.println("  call _printf");
        System.out.println("  movq $0, %rdi");
        System.out.println("  callq _exit ");
    }

}
