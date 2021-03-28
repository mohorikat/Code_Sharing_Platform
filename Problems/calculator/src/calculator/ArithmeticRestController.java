package calculator;

import org.springframework.web.bind.annotation.*;
@RestController
class ArithmeticRestController {

    @GetMapping("/{operation}")
    @ResponseBody
    public String calculate(
            @PathVariable String operation, @RequestParam int a, @RequestParam int b) {
        if (operation.equals("add")) {
            return String.valueOf(a + b);
        } else if (operation.equals("subtract")) {
            return String.valueOf(a - b);
        } else if (operation.equals("mult")) {
            return String.valueOf(a * b);
        } else return "Unknown operation";
    }
}
