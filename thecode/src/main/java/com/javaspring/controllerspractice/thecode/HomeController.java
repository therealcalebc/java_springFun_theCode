/**
 * 
 */
package com.javaspring.controllerspractice.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author ccomstock
 *
 */
@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
		
	@PostMapping("/submit")
    public String tryCode(@RequestParam(value="code") String theCode, RedirectAttributes redirectAttributes) {
		if(theCode.trim().equalsIgnoreCase("bushido"))
			return "redirect:/code";
        redirectAttributes.addFlashAttribute("error", String.format("You must train harder!", theCode));
        return "redirect:/";
    }
	
	@GetMapping("/code")
	public String code() {
		return "code.jsp";
	}
	
}
