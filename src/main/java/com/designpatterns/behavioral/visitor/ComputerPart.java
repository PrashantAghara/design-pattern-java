package com.designpatterns.behavioral.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
