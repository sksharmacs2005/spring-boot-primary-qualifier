package com.primary.qualifier.primary;

import com.primary.qualifier.inter.University;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("alfa")
@Primary
public class AlfaCollege implements University {
    @Override
    public String display() {
        return " This is the Alfa College! ";
    }
}
