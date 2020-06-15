package com.kpi.is8106.view.exceptions;

import java.io.IOException;

public class WrongMenuItemException extends IOException {
    public WrongMenuItemException(String message) {
        super(message);
    }
}
