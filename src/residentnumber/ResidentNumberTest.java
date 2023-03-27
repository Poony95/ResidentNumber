package residentnumber;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class ResidentNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisyear = today.getYear()+1900;
		int age=0;
		String jumin, name;
		
		System.out.println("이름 입력");
		name = sc.next();
		
		System.out.println("주민등록번호를 입력하세요(하이픈포함)");
		jumin = sc.next();

		int year = Integer.parseInt(jumin.substring(0,2));
		String gender = jumin.substring(8, 9);
		
		if(gender.equals("1")||gender.equals("3")||gender.equals("5")||
				gender.equals("7")||gender.equals("9")) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
		year = 1900 + year;
		age = thisyear - year;
		System.out.println("출생연도 :"+ year);
		System.out.println("현재연도 :"+ thisyear);
		System.out.println("나이 :"+ age);
		System.out.println("이름 :"+ name);
		
		
		String num1 = jumin.substring(0, 9);
		String num2 = jumin.substring(9,13);
		
		for (int i = 0; i < num1.length(); i++) {
			String []arr = num1.split("");
			if(!arr[i].equals("-")) {
				int r = Integer.parseInt(arr[i]);
				int a =r*(i+1);
				System.out.println(a);
			}	
		}
		int j=1;
		for (j = 0; j < num2.length(); j++) {
			String []arr2 = num2.split("");
			int r2 = Integer.parseInt(arr2[j]);
			int b= r2*(j+1);
			System.out.println(b);
		}
		/*
		 * 방법 찾아보기, 수정
		 ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. 
(단, 10은 0, 11은 1로 표기한다.)
		 */
	}
}