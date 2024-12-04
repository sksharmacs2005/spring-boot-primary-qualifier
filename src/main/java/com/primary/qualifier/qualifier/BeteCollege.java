package com.primary.qualifier.qualifier;

import com.primary.qualifier.inter.University;
import org.springframework.stereotype.Service;

@Service("beta")
public class BeteCollege implements University {
    @Override
    public String display() {
        return " This is the Beta College!. ";
    }
}
