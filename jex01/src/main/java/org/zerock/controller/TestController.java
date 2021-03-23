package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/ex05")
	public void ex_05() {
		// ex05.jsp 페이지가 열린다.
	}

	@RequestMapping("/test2")
	public String test_2() {
		return "redirect:/result";
		// result로 리다이렉트 요청
	}

	@RequestMapping("/result")
	public String result_test() {
		return "result"; // 리턴값의 .jsp 페이지가 열린다.
	}

	// view 데이터를 전달해야 하는 경우 (Model 이용)
	@RequestMapping("/test3")
	public String test3(Model model) {
		ProductVO product = new ProductVO("sample p", 100);
//		model.addAttribute(product); // 보내는 이름 생략 시 객체가 해당하는 클래스의 이름으로 전송(맨 앞 소문자로)
		model.addAttribute("productVO", product);
		return "productDetail"; // productDetail.jsp
	}

	@PostMapping("/ex01")
	public void ex01(ProductVO pvo) {
		System.out.println("이름" + pvo.getName());
		System.out.println("번호" + pvo.getNumber());
	}

	@RequestMapping("/quiz")
	public String quiz1() {
		return "quiz1";
	}

//	@GetMapping("/answer1")
//	public String answer1(NumberVO nvo) {
//		return "abc";
//	}

	@GetMapping("/answer1")
	public String answer(Model model, int num1, int num2) {
		int sum;
		sum = num1 + num2;
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("sum", sum);
		return "abc";
	}

	@RequestMapping("/quiz2")
	public String quiz2() {
		return "quiz3";
	}

	@GetMapping("/answer2")
	public void answer2(Model model, int a) {
		model.addAttribute("a", a);
	}

	@RequestMapping("/eltest")
	public void eltest() {
	}

	@RequestMapping("/quiz5")
	public String quiz5() {
		return "quiz6";
	}

//	@GetMapping("/quiz7")
//	public String result10(Model model, int num1, int num2) {
//		if (num1 > num2) {
//			int temp;
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		int sum = 0;
//		for (int i = num1; i < num2; i++) {
//			if (i != num1) {
//				sum += i;
//			}
//		}
//		model.addAttribute("sum", sum);
//		return "result10";
//	}
//}

@GetMapping("/quiz7")
public String result10(Model model, NumberVO nvo) {
	if (nvo.getNum1() > nvo.getNum2()) {
		int temp;
		temp = nvo.getNum1();
		nvo.setNum1(nvo.getNum2());
		nvo.setNum2(temp);
	}
	int sum = 0;
	for (int i = nvo.getNum1(); i < nvo.getNum2(); i++) {
		if (i != nvo.getNum1()) {
			sum += i;
		}
	}
	model.addAttribute("sum", sum);
	return "result10";
}
}
