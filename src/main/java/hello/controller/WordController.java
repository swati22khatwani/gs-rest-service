package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hello.model.ResponseWrapper;
import hello.service.WordService;

@RestController
public class WordController {

	@Autowired
	public WordService wordService;

	// TODO Implement the /words/{word} endpoint
	@CrossOrigin
	@RequestMapping(value = "/words/{word}", method = RequestMethod.GET, produces = {
			"application/json; charset=utf-8" })
	public @ResponseBody ResponseWrapper getSiteDetails(@PathVariable String word) {
		return wordService.checkForPalindromeAndAnalogOfIt(word);
	}
}
