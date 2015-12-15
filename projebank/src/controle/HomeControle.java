package controle;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/inicio")
public class HomeControle {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String home(Model model) {
		model.addAttribute("data_enviada", new Date());

		return "home";
	}

}
