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
    var soChan = 1
    while (soChan <= 20) {
        if (soChan % 2 == 0) {
            print("$soChan ")
        }
        soChan++
    }
}