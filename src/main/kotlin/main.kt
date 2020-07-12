import java.util.*
import kotlin.system.exitProcess

fun main() {
    var pw = "000000"
    var money = 0
    var i = 1
    println("``````````````````````````````````````````")
    println("              欢迎使用中国建设银行                  ")
    println("``````````````````````````````````````````")
    print("请输入密码：")
    var scanner = Scanner(System.`in`)
    for(j in 0..2){
        var pw1 = scanner.next()
        if(pw==pw1)
            break
        else if(pw1 != pw && j<=2){
            print("密码错误，亲重新输入：")
            j+1
        }else if(j ==3){
            println("错误次数过多，请联系工作人员")
            exitProcess(0)
        }
    }
    println()
    while (i == 1){
        println("``````````````````````````````````````````")
        println("    1.修改密码                   2.存款  ")
        println("    3.取款                      4.查询余额 ")
        println("    5.退出")
        println("``````````````````````````````````````````")
        print("请输入选择的操作：")

        var text = scanner.nextInt()
        when(text){
            1->{
                println("请输入旧密码:")
                var pw2 = scanner.next()
                if(pw!=pw2){
                    print("密码错误，请重新输入：")
                    pw2 = scanner.next()
                }else{
                    print("请输入新密码：")
                    var pw3 = scanner.next()
                    println()
                    print("请再次确认新密码：")
                    var pw4 = scanner.next()
                    while(true){
                        if(pw3 == pw4){
                            println("密码修改成功！")
                            pw=pw3
                            break
                        }else{
                            print("两次密码不一致，请重新输入：")
                            pw3 = scanner.next()
                            println()
                            print("请再次确认新密码：")
                            pw4 = scanner.next()
                        }
                    }
                }
            }
            2->{
                print("请输入存款金额：")
                var money1 = scanner.nextInt()
                money += money1
                println("存款成功!")
                println("余额为:$money")
                print("是否继续：")

                while(true){
                   var zim = scanner.next()
                    if(zim == "no")
                        break
                    else if(zim == "yes"){
                        print("请输入存款金额：")
                        money1 = scanner.nextInt()
                        money += money1
                        println("存款成功!")
                        println("余额为:$money")
                        print("是否继续：")
                    }
                }
            }
            3->{
                print("请输入取款金额：")
                var draw_money = scanner.nextInt()
                while(true){
                    if(draw_money<=money){
                        println("取款成功！")
                        money -= draw_money
                        println("余额为：$money")
                        break
                    }else{
                        println("余额不足，请重新输入取款金额：")
                        draw_money = scanner.nextInt()
                    }
                }
            }
            4->{
                println("余额为:$money")
            }
            5->{
                exitProcess(0)
            }

        }
    }
}