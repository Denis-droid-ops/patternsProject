package com.kuznecov.patterns.behavioral.chainOfResponsibility;

public interface Logger { // можно заменить на абстрактный класс
    void writeMessage(String message, int level);
}
