class WRAPPER {
	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(2345);
		int billNo = num1.intValue();
		System.out.println(billNo);
		
		Double num2 = Double.valueOf(67.0);
		double avg = num2.doubleValue();
		System.out.println(avg);

		//autoboxing
		int a = 30;
		Integer b = a;

		//unboxing
		Integer c = 30;
		int d = c;

		//converting string to primitive
		String num3 = "2345";		
		int billNo1 = Integer.parseInt(num3);
		System.out.println(billNo1);
		
		double avg1 = Double.parseDouble(num3);
		System.out.println(avg1);
		
		//string to wrapper class
		String num ="2345";
		int billNo2 = Integer.parseInt(num);
		System.out.println(billNo2);

		int billNo3 = 2345;
		String num4 = String.valueOf(billNo3);
		System.out.println(num4);
		Integer num5 = Integer.valueOf(billNo3);
		System.out.println(num5);

		int billNo4 = 2345;
		Integer num6 = billNo4;
		int no = num6.intValue();
		System.out.println(no);

	}
}
