package com.devops.lottery.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Pietro Caselani on 11/07/17.
 */
@RestController
public final class HelloController {
	public static String UmaVarfora_dos_padroes = "que zoera...";

	private final Random random = new Random(System.currentTimeMillis());

	@RequestMapping("/hello")
	public String hello() {
		return "Hello cuzão";
	}

	@RequestMapping(value = "/lottery", method = RequestMethod.POST)
	public String lottery(@RequestBody Map<String, List<String>> jsonNames) {
		final List<String> names = jsonNames.get("names");

		final int size = names.size();

		final int selected = random.nextInt(size);

		return names.get(selected);
	}

}
