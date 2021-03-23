package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {

	@RequestMapping("/quiz20")
	public void quiz20() {
	}

	@RequestMapping("/input20")
	public void input20() {
	}

	@PostMapping("/result20")
	public void result20(Model model, QuizVO qvo) {
		int biggest = 0;
		biggest = Math.max(qvo.getA(), Math.max(qvo.getB(), qvo.getC()));
		model.addAttribute("biggest", biggest);
	}
}
