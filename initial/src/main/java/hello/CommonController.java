package hello;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CommonController {
	@RequestMapping(value="/vi", method = RequestMethod.GET)
	public String getVIPage(HttpServletResponse response, Model model){
//			model.addAttribute("demoContent", "taskProc.aspx");
			return "demo";
	
	}

    
    @ModelAttribute("demoContent")
    public String demoContent() {
        return "hello ModelAttribute!";
    }
	
}
