class TrigApp
{
	String stringRatio;
	String inptDegOrRad;

	public void start()
	{
		//Ask User to input SIN COS or TAN 
		stringRatio = ct.inputString("Input: SIN, COS, or TAN");
		findExactValueOf(stringRatio); //Calls findExactValue funtion
	}

	//Function if user doesn't input correct info
	void dumbAss()
	{
		ct.println("DUMBASS!");
	}

	//Function instructs user to input SIN COS or TAN correctly
	void entSinCosTan()
	{
		stringRatio = ct.inputString("MUST ENTER: SIN, COS, or TAN");
		findExactValueOf(stringRatio); //Calls findExactValueOf() funtion
	}

	//Function instructs user to input a Degree or Radian value
	String inptDegOrRad()
	{
		inptDegOrRad = ct.inputString("Input: Degree(ex: 30) or Radian (ex: pi/6)");
		ct.println(inptDegOrRad);
		return inptDegOrRad;
	}

	//Function instructs user to input Degree or Radian value correctly
	String entDegOrRad()
	{
		inptDegOrRad = ct.inputString("MUST ENTER: Degree(ex: 30) or Radian (ex: pi/6)");
		ct.println(inptDegOrRad);
		return inptDegOrRad;
	}

	//Funiton to find exact trig value w/ given user input
	void findExactValueOf(String sinCosTan)
	{
		//If user inputs SIN or sin run the code
		if(sinCosTan.equals("SIN") || sinCosTan.equals("sin") || sinCosTan.equals("Sin"))
		{
			ct.println(stringRatio);
			stringRatio = "sin";
			sinExactValue(inptDegOrRad()); //Calls function sinExactValue()	and asks user input		
		}
		//If user inputs COS or cos run the code
		else if(sinCosTan.equals("COS") || sinCosTan.equals("cos") || sinCosTan.equals("Cos"))
		{
			ct.println(stringRatio);
			stringRatio = "cos";
			cosExactValue(inptDegOrRad()); //Calls function cosExactValue() and asks user input
		}
		//If user inputs TAN or tan run the code
		else if(sinCosTan.equals("TAN") || sinCosTan.equals("tan") || sinCosTan.equals("Tan"))
		{
			ct.println(stringRatio);
			stringRatio = "tan";
			tanExactValue(inptDegOrRad()); //Calls function tanExactValue() and asks user input
		}
		//If user doesn't input SIN COS or TAN print message and ask user for correct input
		else
		{
			dumbAss(); //Calls dumbAss() funtion 
			entSinCosTan(); //Calls entSinCosTan() function
		}
	}

	//Function to print exact value of SIN value 
	void sinExactValue(String degreeOrRadian)
	{
		if(degreeOrRadian.equals("0"))
		{
			ct.println("Exact Value of SIN(0) = 0");
		}
		else if(degreeOrRadian.equals("30") || degreeOrRadian.equals("pi/6"))
		{
			ct.println("Exact Value of SIN(30) / SIN(pi/6) = 1/2");
		}
		else if(degreeOrRadian.equals("45") || degreeOrRadian.equals("pi/4"))
		{
			ct.println("Exact Value of SIN(45) / SIN(pi/4) = Sqrt2/2");
		}
		else if(degreeOrRadian.equals("60") || degreeOrRadian.equals("pi/3"))
		{
			ct.println("Exact Value of SIN(60) / SIN(pi/3) = Sqrt3/2");
		}
		else if(degreeOrRadian.equals("90") || degreeOrRadian.equals("pi/2"))
		{
			ct.println("Exact Value of SIN(90) / SIN(pi/2) = 1");
		}
		else if(degreeOrRadian.equals("120") || degreeOrRadian.equals("2pi/3"))
		{
			ct.println("Exact Value of SIN(120) / SIN(2pi/3) = Sqrt3/2");
		}
		else if(degreeOrRadian.equals("135") || degreeOrRadian.equals("3pi/4"))
		{
			ct.println("Exact Value of SIN(135) / SIN(3pi/4) = Sqrt2/2");
		}
		else if(degreeOrRadian.equals("150") || degreeOrRadian.equals("5pi/6"))
		{
			ct.println("Exact Value of SIN(150) / SIN(5pi/6) = 1/2");
		}
		else if(degreeOrRadian.equals("180") || degreeOrRadian.equals("pi"))
		{
			ct.println("Exact Value of SIN(180) / SIN(pi) = 0");
		}
		else if(degreeOrRadian.equals("210") || degreeOrRadian.equals("7pi/6"))
		{
			ct.println("Exact Value of SIN(210) / SIN(7pi/6) = -1/2");
		}
		else if(degreeOrRadian.equals("225") || degreeOrRadian.equals("5pi/4"))
		{
			ct.println("Exact Value of SIN(225) / SIN(5pi/4) = - Sqrt2/2");
		}
		else if(degreeOrRadian.equals("240") || degreeOrRadian.equals("4pi/3"))
		{
			ct.println("Exact Value of SIN(240) / SIN(4pi/3) = - Sqrt3/2");
		}
		else if(degreeOrRadian.equals("270") || degreeOrRadian.equals("3pi/2"))
		{
			ct.println("Exact Value of SIN(270) / SIN(3pi/2) = -1");
		}
		else if(degreeOrRadian.equals("300") || degreeOrRadian.equals("5pi/3"))
		{
			ct.println("Exact Value of SIN(300) / SIN(5pi/3) = - Sqrt3/2");
		}
		else if(degreeOrRadian.equals("315") || degreeOrRadian.equals("7pi/4"))
		{
			ct.println("Exact Value of SIN(315) / SIN(7pi/4) = - Sqrt2/2");
		}
		else if(degreeOrRadian.equals("330") || degreeOrRadian.equals("11pi/6"))
		{
			ct.println("Exact Value of SIN(330) / SIN(11pi/6) = -1/2");
		}
		else if(degreeOrRadian.equals("360") || degreeOrRadian.equals("2pi"))
		{
			ct.println("Exact Value of SIN(360) / SIN(2pi) = 0");
		}
		//If user doesn't input Degree or Radian correctly print message and ask user for correct input
		else
		{
			dumbAss(); //Calls dumbAss() funtion
			sinExactValue(entDegOrRad()); //Calls sinExactValue() funtion again and asks user for correct input
		}

		goAgain();
	}

	void cosExactValue(String degreeOrRadian)
	{
		if(degreeOrRadian.equals("0"))
		{
			ct.println("Exact Value of COS(0) = 1");
		}
		else if(degreeOrRadian.equals("30") || degreeOrRadian.equals("pi/6"))
		{
			ct.println("Exact Value of COS(30) / COS(pi/6) = Sqrt3/2");
		}
		else if(degreeOrRadian.equals("45") || degreeOrRadian.equals("pi/4"))
		{
			ct.println("Exact Value of COS(45) / COS(pi/4) = Sqrt2/2");
		}
		else if(degreeOrRadian.equals("60") || degreeOrRadian.equals("pi/3"))
		{
			ct.println("Exact Value of COS(60) / COS(pi/3) = 1/2");
		}
		else if(degreeOrRadian.equals("90") || degreeOrRadian.equals("pi/2"))
		{
			ct.println("Exact Value of COS(90) / COS(pi/2) = 0");
		}
		else if(degreeOrRadian.equals("120") || degreeOrRadian.equals("2pi/3"))
		{
			ct.println("Exact Value of COS(120) / COS(2pi/3) = -1/2");
		}
		else if(degreeOrRadian.equals("135") || degreeOrRadian.equals("3pi/4"))
		{
			ct.println("Exact Value of COS(135) / COS(3pi/4) = - Sqrt2/2");
		}
		else if(degreeOrRadian.equals("150") || degreeOrRadian.equals("5pi/6"))
		{
			ct.println("Exact Value of COS(150) / COS(5pi/6) = - Sqrt3/2");
		}
		else if(degreeOrRadian.equals("180") || degreeOrRadian.equals("pi"))
		{
			ct.println("Exact Value of COS(180) / COS(pi) = -1");
		}
		else if(degreeOrRadian.equals("210") || degreeOrRadian.equals("7pi/6"))
		{
			ct.println("Exact Value of COS(210) / COS(7pi/6) = - Sqrt3/2");
		}
		else if(degreeOrRadian.equals("225") || degreeOrRadian.equals("5pi/4"))
		{
			ct.println("Exact Value of COS(225) / COS(5pi/4) = - Sqrt2/2");
		}
		else if(degreeOrRadian.equals("240") || degreeOrRadian.equals("4pi/3"))
		{
			ct.println("Exact Value of COS(240) / COS(4pi/3) = - 1/2");
		}
		else if(degreeOrRadian.equals("270") || degreeOrRadian.equals("3pi/2"))
		{
			ct.println("Exact Value of COS(270) / COS(3pi/2) = 0");
		}
		else if(degreeOrRadian.equals("300") || degreeOrRadian.equals("5pi/3"))
		{
			ct.println("Exact Value of COS(300) / COS(5pi/3) = 1/2");
		}
		else if(degreeOrRadian.equals("315") || degreeOrRadian.equals("7pi/4"))
		{
			ct.println("Exact Value of COS(315) / COS(7pi/4) = Sqrt2/2");
		}
		else if(degreeOrRadian.equals("330") || degreeOrRadian.equals("11pi/6"))
		{
			ct.println("Exact Value of COS(330) / COS(11pi/6) = Sqrt3/2");
		}
		else if(degreeOrRadian.equals("360") || degreeOrRadian.equals("2pi"))
		{
			ct.println("Exact Value of COS(360) / COS(2pi) = 1");
		}
		//If user doesn't input Degree or Radian correctly print message and ask user for correct input
		else
		{
			dumbAss(); //Calls dumbAss() funtion
			cosExactValue(entDegOrRad()); //Calls cosExactValue() funtion again and asks user for correct input
		}

		goAgain();
	}

	void tanExactValue(String degreeOrRadian)
	{
		if(degreeOrRadian.equals("0"))
		{
			ct.println("Exact Value of TAN(0) = 0");
		}
		else if(degreeOrRadian.equals("30") || degreeOrRadian.equals("pi/6"))
		{
			ct.println("Exact Value of TAN(30) / TAN(pi/6) = Sqrt3/3");
		}
		else if(degreeOrRadian.equals("45") || degreeOrRadian.equals("pi/4"))
		{
			ct.println("Exact Value of TAN(45) / TAN(pi/4) = 1");
		}
		else if(degreeOrRadian.equals("60") || degreeOrRadian.equals("pi/3"))
		{
			ct.println("Exact Value of TAN(60) / TAN(pi/3) = Sqrt3");
		}
		else if(degreeOrRadian.equals("90") || degreeOrRadian.equals("pi/2"))
		{
			ct.println("Exact Value of TAN(90) / TAN(pi/2) = UNDEFINED");
		}
		else if(degreeOrRadian.equals("120") || degreeOrRadian.equals("2pi/3"))
		{
			ct.println("Exact Value of TAN(120) / TAN(2pi/3) = - Sqrt3");
		}
		else if(degreeOrRadian.equals("135") || degreeOrRadian.equals("3pi/4"))
		{
			ct.println("Exact Value of TAN(135) / TAN(3pi/4) = -1");
		}
		else if(degreeOrRadian.equals("150") || degreeOrRadian.equals("5pi/6"))
		{
			ct.println("Exact Value of TAN(150) / TAN(5pi/6) = - Sqrt3/3");
		}
		else if(degreeOrRadian.equals("180") || degreeOrRadian.equals("pi"))
		{
			ct.println("Exact Value of TAN(180) / TAN(pi) = 0");
		}
		else if(degreeOrRadian.equals("210") || degreeOrRadian.equals("7pi/6"))
		{
			ct.println("Exact Value of TAN(210) / TAN(7pi/6) = Sqrt3/3");
		}
		else if(degreeOrRadian.equals("225") || degreeOrRadian.equals("5pi/4"))
		{
			ct.println("Exact Value of TAN(225) / TAN(5pi/4) = 1");
		}
		else if(degreeOrRadian.equals("240") || degreeOrRadian.equals("4pi/3"))
		{
			ct.println("Exact Value of TAN(240) / TAN(4pi/3) = Sqrt3");
		}
		else if(degreeOrRadian.equals("270") || degreeOrRadian.equals("3pi/2"))
		{
			ct.println("Exact Value of TAN(270) / TAN(3pi/2) = UNDEFINED");
		}
		else if(degreeOrRadian.equals("300") || degreeOrRadian.equals("5pi/3"))
		{
			ct.println("Exact Value of TAN(300) / TAN(5pi/3) = - Sqrt3");
		}
		else if(degreeOrRadian.equals("315") || degreeOrRadian.equals("7pi/4"))
		{
			ct.println("Exact Value of TAN(315) / TAN(7pi/4) = -1");
		}
		else if(degreeOrRadian.equals("330") || degreeOrRadian.equals("11pi/6"))
		{
			ct.println("Exact Value of TAN(330) / TAN(11pi/6) = - Sqrt3/3");
		}
		else if(degreeOrRadian.equals("360") || degreeOrRadian.equals("2pi"))
		{
			ct.println("Exact Value of TAN(360) / TAN(2pi) = 0");
		}
		//If user doesn't input Degree or Radian correctly print message and ask user for correct input
		else
		{
			dumbAss(); //Calls dumbAss() funtion
			tanExactValue(entDegOrRad()); //Calls tanExactValue() funtion again and asks user for correct input
		}

		goAgain();
	}

	void goAgain()
	{
		//Asks user if they want to find a new exact value
		boolean goAgain = ct.inputYesNo("Would You Like to Enter New Value?");
		//If user input is yes asks the user to input new value and run code again
		if(goAgain == true)
		{
			//Ask User to input SIN COS or TAN 
			stringRatio = ct.inputString("Enter: SIN, COS, or TAN");
			findExactValueOf(stringRatio); //Calls findExactValue funtion
		}
		else
		{
			ct.println("Thank You, Come Again!");
			ct.stop();
		}
	}

	public void update()
	{
		// Code here runs before each animation frame
	}
}