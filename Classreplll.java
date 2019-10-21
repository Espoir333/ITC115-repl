/***************************************************
* This Program creates and demonstrates the method *
* repl which returns the string.                   *
*
* Compile: javac replDemo. Java                    *
*Run: java replDemo                                *
/**************************************************/

/***************************************************
*Class used    : replDemo                          *
*Method used   : repl                              *
*Input Data    : string value and integer          *      
*Out put Data  : In: Displays thong.               * 
****************************************************

/* Importing the i0 package for input and output and 
     util for scanner class to scan input data*/

import java. Io. *;
inport java. Util. scanner:

public class replDemo
{
       public static void main (String[] args)
       {
            //variable declaration
              String str,output;
              int times;
              //Declaring scanner object
              Scanner input-new Scanner (System. in)

             //Inputting string
             System. out.print ("Enter a string:");
             str-input.nextLine ();
             system. out.print ("Enter a number of  
                                 repetitions:");
             times-input.nextInt ();

             /*function call repl with input parameter
             string and integer and stores returned
             string in output  variable* /
             output-repl (str,times);

            //Display output
            system. out.println ("The call repl (\""
                              + str+"\","+times+") should 
                              return\""+output+"\".") ;
}

/* Method returns string by concatenating the string
 *  number of times the integer passed*/
  public static String repl (String str,int times)
  {
       String newStr="";
       //condition for times value
       if (times<=0)
             return newStr;
       else
       {
       for (int i-1;i<=times;i++)
             newStr=newStr+str;
        return newStr
     }

