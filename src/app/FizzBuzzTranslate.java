package app;

import java.sql.SQLOutput;

public class FizzBuzzTranslate {
	public static final String ONE   = "một";
	public static final String TWO   = "hai";
	public static final String THREE = "ba";
	public static final String FOUR  = "bốn";
	public static final String FIVE  = "năm";
	public static final String SIX   = "sáu";
	public static final String SEVEN = "bảy";
	public static final String EIGHT = "tám";
	public static final String NINE  = "chín";
	public static final String ZERO  = "không";

	public static final String FIZZ  = "Fizz";
	public static final String BUZZ  = "Buzz";

	public static String translateToString(String input) {
		switch (input) {
			case "0":
				return ZERO;
			case "1":
				return ONE;
			case "2":
				return TWO;
			case "4":
				return FOUR;
			case "6":
				return SIX;
			case "7":
				return SEVEN;
			case "8":
				return EIGHT;
			case "9":
				return NINE;
			default:
				throw new ExceptionInInitializerError("Lỗi bất ngờ.");
		}
	}
	public static String translate(int input){
		if (input <= 100 && input >= 0){
			String string         = String.valueOf(input);
			String numberToString = new String();
			for (int i = 0; i < string.length(); i++){
				String item = String.valueOf(string.charAt(i));
				if (item.equals("3")){
					return FIZZ;
				}else if (item.equals("5")){
					return BUZZ;
				}else{
					numberToString += translateToString(item) + " ";
				}
			}
			return numberToString;
		}else{
			throw new ExceptionInInitializerError("Giới từ 0 - 100");
		}
	}
}
