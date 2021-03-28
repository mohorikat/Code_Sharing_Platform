package platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class CodeSharingPlatformController {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private String code =
            "public static void main(String[] args)"
            +
            " {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}";

   @JsonIgnore
    private final Code newCodeObject = new Code(code, LocalDateTime.now());


    @GetMapping(value = "/api/code", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Code CodeSharingPlatformController() {
        return newCodeObject;
    }


    @GetMapping("/code")
    public String viewCode(Model model) {
        model.addAttribute("theNewCode", newCodeObject);
        return "viewcode";
    }


    @GetMapping("/code/new")
    public String getNewAsHTML(Model model) {

        model.addAttribute("theNewCode", newCodeObject);
        return "index";
    }


    @PostMapping("/api/code/new")
    @ResponseBody
    public Code newPostedCode(String code) {
    //    Code returnedCodeObject = new Code(null,LocalDateTime.now());

        newCodeObject.setCode(code);

        newCodeObject.setDate(LocalDateTime.now());
        //return new ResponseEntity(new EmptyJsonResponse(), HttpStatus.OK);
        //return new ResponseEntity("{}", HttpStatus.OK);

      // System.out.println("{}");
      return newCodeObject;

    }

    @PostMapping("/code/new")
    public String postNewCode(@ModelAttribute Code newCode, Model model) {
        model.addAttribute("index", newCode);
        newCode.setDate(LocalDateTime.now());
        newCodeObject.setDate(newCode.getDate());
        newCodeObject.setCode(newCode.getCode());
        return "index";
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
