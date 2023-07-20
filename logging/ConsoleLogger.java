package hometask.logging;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String str) {

        System.out.println(" " + LocalDateTime.now() + " " + str);
    }
}
