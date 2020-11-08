package driver;

import lombok.Getter;

public enum  DriverTypes {
    CHROME("chrome"),
    FIREFOX("firefox");

    @Getter
    private String type;
    DriverTypes(String type){
        this.type = type;
    }
}
