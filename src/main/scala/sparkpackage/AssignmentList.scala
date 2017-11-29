package sparkpackage

import scala.math

object AssignmentList
{
  def main(args:Array[String]): Unit =
  {
    val words = List("spark", "scala", "training")
    println(words)
    words.map(x=>println(x))
//    words.foreach(println)
    println("2nd element in list:" + words(1))
    println("length of list: " + words.length)
    println("count words of length 5:" + words.count(x => x.length == 5))


    val list1 = words.drop(1)
    println(list1)
    val list2 = words.dropRight(2)
    println(list2)
    println("Does list contain spark: " + words.contains("spark"))
    val list3 = words.filter(x=>x.length == 5)
    println("list of 5 letter words: " + list3)
    println("First word in a list: " + words.head)
    println("words except last word: " + words.init)
    println("list is empty or not: " + words.isEmpty)
    println("last element of the list: " + words.last)
    val list4 = words.map(x=> x.concat("easy"))
    println("list after appending easy to each word: " + list4)


  }

}
