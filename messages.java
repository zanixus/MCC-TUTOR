public class messages {
//Ch. 11 Messages
//        Imagine that you have a communication system that allows you to use two signals,
//        a dot and a dash. All messages must be sent using dots and dashes.
//        A dot requires 2 nanoseconds to send and a dash requires 3 nanoseconds to
//        send. When you send a message you must use all the time allotted.
//        You are to develop a program that asks for and that gets time from
//        the user and displays the value of the number of message that can be sent,
//        let's call that, M(time), which must be calculated by a recursive method.
//
//        So,
//
//        if time  == 0 or time == 1 then the number of different messages
//        that can be sent is 1 (the empty message)
//        if time  == 2 or time == 3 then the number of different messages
//    if time  == 0 or time == 1
//    then the number of different messages that can be sent is 1 (the empty message)
//    if time  == 2 or time == 3
//    then the number of different messages that can be sent is 1
//    (2 nanoseconds allows us to send a dot and 3 nanoseconds allows us to send a dash).
//    if time is > 3 and the message starts with a dot the number
//    of messages that can be sent is M(time - 2),
//    if time is > 3 and the message starts
//    with a dash the number of messages that can be sent is M(time - 3)
//    the number of messages that can be sent in time nanoseconds is therefore M(time - 2)  + M(time - 3)
    static int M(int time, char bit) {
        if (time < 4) {
            return 1;
        } else if (bit == '-') {
            System.out.printf("%d : ", time);
            return M(time - 3, bit);
        } else {
            System.out.printf("%d : ", time);
            return M(time - 2, bit);
        }
    }

//    If time is <= 3 the value to be printed is 1 (the base case)
//    If time is 4 the value to be printed is 2
//    If time is 5 the value to be printed is 2
//    If time is 6 the value to be printed is 3
//    If time is 7 the value to be printed is 4
//    If time is 8 the value to be printed is 5
//    If time is 9 the value to be printed is 7
//    If time is 10 the value to be printed is 9
//    If time is 20 the value to be printed is 151
//    If time is 30 the value to be printed is 2513

    public static void main(String[] args) {
        System.out.printf("%d | ", M(6, '.'));
        System.out.println();
        System.out.printf("%d | ", M(10, '.'));
    }

}

