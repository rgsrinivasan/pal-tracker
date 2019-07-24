package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

<<<<<<< HEAD
    private final String port;
    private final String memoryLimit;
    private final String cfInstanceIndex;
    private final String cfInstanceAddress;

    public EnvController(
        @Value("${port:NOT SET}") String port,
        @Value("${memory.limit:NOT SET}") String memoryLimit,
        @Value("${cf.instance.index:NOT SET}") String cfInstanceIndex,
        @Value("${cf.instance.addr:NOT SET}") String cfInstanceAddress
    ) {
=======
        String port;
        String memoryLimit;
        String cfInstanceIndex;
        String cfInstanceAddress;

    public EnvController(@Value("${port:NOT SET}")  String port,
                         @Value("${memory.limit:NOT SET}") String memoryLimit,
                         @Value("${cf.instance.index:NOT SET}") String cfInstanceIndex,
                         @Value("${cf.instance.addr:NOT SET}") String cfInstanceAddress){

>>>>>>> 4ec24e575cf6fe2cdd91496554bd0762428fc883
        this.port = port;
        this.memoryLimit = memoryLimit;
        this.cfInstanceIndex = cfInstanceIndex;
        this.cfInstanceAddress = cfInstanceAddress;
    }

    @GetMapping("/env")
<<<<<<< HEAD
    public Map<String, String> getEnv() {
        Map<String, String> env = new HashMap<>();

=======
    public Map<String, String> getEnv(){
        Map<String, String> env = new HashMap<>();
>>>>>>> 4ec24e575cf6fe2cdd91496554bd0762428fc883
        env.put("PORT", port);
        env.put("MEMORY_LIMIT", memoryLimit);
        env.put("CF_INSTANCE_INDEX", cfInstanceIndex);
        env.put("CF_INSTANCE_ADDR", cfInstanceAddress);
<<<<<<< HEAD

        return env;
    }
}
=======
        return env;
    }
}
>>>>>>> 4ec24e575cf6fe2cdd91496554bd0762428fc883
