package se.wesource.otherspringbootservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import se.wesource.otherspringbootservice.model.Other;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Service
@Slf4j
public class OtherService {
    HashMap<String, Other> otherStorage = new HashMap<>();

    @PostConstruct
    void init() {
        Other me = new Other("me", "meStr", 20);
        Other self = new Other("self", "selfStr", 30);
        otherStorage.put("me", me);
        otherStorage.put("self", self);
    }

    public Other findOtherByName(String name) {
        log.info("I'm here!");
        return otherStorage.get(name);
    }
}
