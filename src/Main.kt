fun main()
{
    println("Please enter the number you wish to convert to a phone number: ")
    val PhoneNumber = readln().uppercase()
    val ConvertedNumber = StringBuilder()

    for (char in PhoneNumber)
    {
        when (char)
        {
            'A', 'B', 'C' -> ConvertedNumber.append('2')
            'D', 'E', 'F' -> ConvertedNumber.append('3')
            'G', 'H', 'I' -> ConvertedNumber.append('4')
            'J', 'K', 'L' -> ConvertedNumber.append('5')
            'M', 'N', 'O' -> ConvertedNumber.append('6')
            'P', 'Q', 'R', 'S' -> ConvertedNumber.append('7')
            'T', 'U', 'V' -> ConvertedNumber.append('8')
            'W', 'X', 'Y', 'Z' -> ConvertedNumber.append('9')
            in '0'..'9' -> ConvertedNumber.append(char)
            else -> ConvertedNumber.append(char)
        }
    }
    println("The Converted Number is: $ConvertedNumber")
}