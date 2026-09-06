fun main() {
    println("--- BÀI 3: IN CÁC SỐ CHẴN TỪ 1 ĐẾN 20 ---")
    // for
    print("Dùng for: ")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println()

    // while
    print("Dùng while: ")
    var num = 1
    while (num <= 20) {
        if (num % 2 == 0) {
            print("$num ")
        }
        num++
    }
    println()
}