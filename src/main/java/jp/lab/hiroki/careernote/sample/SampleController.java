package jp.lab.hiroki.careernote.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.lab.hiroki.careernote.domain.config.ApplicationConfig;

@Controller
public class SampleController {
	
	@Autowired
	ApplicationConfig applcationConfig;
	
	@RequestMapping(path = "/sample")
    public ModelAndView showSamplePage() {
        Map<String, String> model = new HashMap<String, String>();
        model.put("message", "THIS IS TEMPLATE SAMPLE");
        
        // arg1:templateファイル名 arg2:パラメータ
        return new ModelAndView("sample/sample", model);
    }

}
