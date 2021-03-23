package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // 스프링에서 관리해야될 대상
@Data
public class Chef {
	private String name = "나는 요리사";

}