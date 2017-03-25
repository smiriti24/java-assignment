class MyIdentifier{
        public static void main(String args[])
	{
        	/* In java, we can start the variable name with underscore ,
                currency sign, and even have name with multiple underscores.*/

                int _xyz = 40;
                int $f = 20;
                int this_is_my_variable = 10;
                int _$ ;
                //int 2num = 10;    this is illegel identifier

                System.out.println(_xyz);
                System.out.println($f);
                System.out.println(this_is_my_variable);
                //System.out.println("variable declared but not initialized"+_$); 
	}
}