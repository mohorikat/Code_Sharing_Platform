package platform;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Code {

    private String code;

    private LocalDateTime date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getDate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Code(String Code, LocalDateTime Date) {
        this.code = Code;
        this.date = Date;
    }
}
