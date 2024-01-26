fun main() {


    println("Был(а) " + agoToText(48887676557))
    }

    fun agoToText(secondsAgo: Long): String {
        return when {
            secondsAgo in 0..60 -> {
                "был(а) только что"
            }
            secondsAgo in 61..60 * 60 -> {
                minutesAgoToText(secondsAgo)
            }
            secondsAgo in 60 * 60 + 1..24 * 60 * 60 -> {
                hoursAgoToText(secondsAgo)
            }
            secondsAgo in 24 * 60 * 60 + 1..48 * 60 * 60 -> {
                "вчера"
            }
            secondsAgo in 48 * 60 * 60 + 1..72 * 60 * 60 -> {
                "позавчера"
            }
            else -> {
                "давно"
            }
        }
    }

    fun minutesAgoToText(secondsAgo: Long): String {
        val minutes = (secondsAgo / 60).toInt()
        return when {
            minutes % 10 == 1 && minutes != 11 -> "$minutes минуту назад"
            minutes % 10 in 2..4 && (minutes < 10 || minutes > 20) -> "$minutes минуты назад"
            else -> "$minutes минут назад"
        }
    }

    fun hoursAgoToText(secondsAgo: Long): String {
        val hours = (secondsAgo / (60 * 60)).toInt()
        return when {
            hours % 10 == 1 && hours != 11 -> "$hours час назад"
            hours % 10 in 2..4 && (hours < 10 || hours > 20) -> "$hours часа назад"
            else -> "$hours часов назад"
        }
    }



