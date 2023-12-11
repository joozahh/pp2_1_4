package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();
    @Autowired
    public Timer(Long nanoTime){
        this.nanoTime = nanoTime;
    }
    public Long getTime() {
        return nanoTime;
    }
}
