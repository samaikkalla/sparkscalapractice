package sparkpackage

object RunRationalNumber {
    def main(args: Array[String]): Unit ={
      val firstnumber = new RationalNumber(2,7)
      val secondnumber = new RationalNumber(3,8)
      val resultnumber = firstnumber.add(secondnumber)
      val subofnumbers = firstnumber.sub(secondnumber)
      val mulofnumbers = firstnumber.mul(secondnumber)
      val divofnumbers = firstnumber.div(secondnumber)



      println("First Number:  "+firstnumber)
      println("Second Number: "+secondnumber)
      println("Addition of two Rational Number: "+resultnumber)
      println("Substraction of two Rational Number: "+subofnumbers)
      println("Multiplication of two Rational Number: "+mulofnumbers)
      println("Division of two Rational Number: "+divofnumbers)


    }


  }
