import java.util.*

fun main() {
    intMountain()
}

fun candiesVsKids() {
    val sc = Scanner(System.`in`)
    val candies = sc.nextInt()
    val children = sc.nextInt()
    val result = candies % children
    println(result)
}

fun divisibleNumbers() {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    val divisible: Boolean = number % 2 == 0 && number % 3 == 0 && number % 5 == 0 && number % 8 == 0
    if (divisible) {
        println("SI")
    } else {
        println("NO")
    }
}

fun rockPaperScissors() {
    // 1 = pedra, 2 = paper, 3 = tissora
    val sc = Scanner(System.`in`)
    val player1 = sc.nextInt()
    val player2 = sc.nextInt()
    if (player1 == 3 && player2 == 2) {
        println("Jugador1")
    } else if (player1 == 2 && player2 == 1) {
        println("Jugador1")
    } else if (player1 == 1 && player2 == 3) {
        println("Jugador1")
    } else if (player1 == 1 && player2 == 2) {
        println("Jugador2")
    } else if (player1 == 2 && player2 == 3) {
        println("Jugador2")
    } else if (player1 == 3 && player2 == 1) {
        println("Jugador2")
    } else if (player1 !in 1..3 || player2 !in 1..3) {
        println("ERROR")
    } else {
        println("EMPAT")
    }
}

fun getHowgartsHouse() {
    val sc = Scanner(System.`in`)
    val userChoice = sc.next()
    when (userChoice) {
        "Coratge" -> {
            println("Gryffindor")
        }

        "Ambició" -> {
            println("Slytherin")
        }

        "Coneixement" -> {
            println("Ravenclaw")
        }

        else -> {
            println("Hufflepuff")
        }
    }
}


fun getMonthFromDay() {
    val sc = Scanner(System.`in`)
    val day = sc.nextInt()
    if (day in 1..365) {
        when (day) {
            in 1..31 -> println(1)
            in 32..59 -> println(2)
            in 60..90 -> println(3)
            in 91..120 -> println(4)
            in 121..151 -> println(5)
            in 152..181 -> println(6)
            in 182..212 -> println(7)
            in 213..243 -> println(8)
            in 244..273 -> println(9)
            in 274..304 -> println(10)
            in 305..334 -> println(11)
            in 335..365 -> println(12)
            else -> println("ERROR")
        }
    }
}

fun majorasMaskDays() {
    val sc = Scanner(System.`in`)
    val seconds = sc.nextInt()
    if (seconds in 1..43200) {

    }
}

fun getDayFromMonth() {
    val sc = Scanner(System.`in`)
    val month = sc.nextInt()
    if (month in 1..12) {
        when (month) {
            1 -> println(1)
            2 -> println(32)
            3 -> println(60)
            4 -> println(91)
            5 -> println(121)
            6 -> println(152)
            7 -> println(182)
            8 -> println(213)
            9 -> println(244)
            10 -> println(274)
            11 -> println(305)
            12 -> println(335)
        }
    }
}

fun nextPresident() {
    val sc = Scanner(System.`in`)
    var jidenVotes = sc.nextInt()
    var drumpVotes = sc.nextInt()
    var bandersVotes = sc.nextInt()
    if (jidenVotes > drumpVotes && jidenVotes > bandersVotes) {
        println("Jiden")
    } else if (drumpVotes > jidenVotes && drumpVotes > bandersVotes) {
        println("Drump")
    } else if (bandersVotes > jidenVotes && bandersVotes > drumpVotes) {
        println("Banders")
    } else {
        println("Si us plau, vota per algun candidat")
    }
}

fun contiguousNumbers() {
    val sc = Scanner(System.`in`)
    val firstNum = sc.nextInt()
    val secondNum = sc.nextInt()

    val difference = if (firstNum > secondNum) {
        firstNum - secondNum
    } else secondNum - firstNum

    if (difference == 1) {
        println("SI")
    } else {
        println("NO")
    }
}

fun daysOfTheWeek() {
    val sc = Scanner(System.`in`)
    val day = sc.nextInt()
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
    }
}

fun intMountain() {
    //mayor >
    //menor <
    //Els nombres fan muntanyes si el segon és més gran que el primer, el tercer més petit que el segon,
    // el quart més gran que el tercer, etc.
    // També al revès, si el segón es més petit que el primer, el tercer més gran que el segon, etc.
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val num3 = sc.nextInt()
    val num4 = sc.nextInt()
    val num5 = sc.nextInt()
    if ((num2 > num1) && (num3 < num2) && (num4 > num3) && (num5 < num4)
        || (num2 < num1) && (num3 > num2) && (num4 < num3) && (num5 > num4)) {
        println("SI")
    } else {
        println("NO")
    }
}