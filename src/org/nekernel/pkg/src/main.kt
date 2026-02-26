import java.io.File

fun main(args: Array<String>) {
    val pkgUrl = if (args.contains("-s")) args[1 + args.indexOf("-s")]  else "localhost:3000"
    println("pkg: updating " + pkgUrl + "...");
}
