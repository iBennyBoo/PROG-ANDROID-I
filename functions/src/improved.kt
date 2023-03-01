import java.util.*

fun improved(args: Array<String>) {
    println("What shape would you like to find the area for?");
    println("1.) Circle");
    println("2.) Triangle");
    println("3.) Rectangle");
    println("4.) Trapezoid");
    println("Please enter a number 1-4.");
    val console = Scanner.console();
    val entry = console.readLine().toInt();
    selectShape(entry);

    fun selectShape(x: Int){
        when (x) {
            1 -> circle()
            2 -> triangle()
            3 -> rectangle()
            4 -> trapezoid()
            else -> {
                println("not an option")
            }
        }
    }

    fun circle(){
        //(pie)(R)^2
        println("What is the radius?");
        val radius = console.readLine().toInt();
        val answer = Math.PI * (radius * radius);
        println("The answer is : $answer");
    }
    fun triangle(){
        //(base * height)/2
        println("What is the length?");
        val length = console.readLine().toInt();
        println("What is the height?");
        val height = console.readLine().toInt();
        val answer: Double = length * height / 2;
        println("The answer is : $answer");
    }
    fun rectangle(){
        //(length)(width)
        println("What is the length?");
        val length = console.readLine().toInt();
        println("What is the width?");
        val width = console.readLine().toInt();
        val answer: Double = length * width;
        println("The answer is : $answer");
    }
    fun trapezoid(){
        //((length1 + length2)/2) * height
        println("What is the first length?")
        val length1 = console.readLine().toInt()
        println("What is the second length?")
        val length2 = console.readLine().toInt()
        println("What is the height?")
        val height = console.readLine.toInt()
        val answer = (length1 + length2) / 2 * height
        println("The answer is : $answer")
    }
}