package com.bravedroid;

import com.bravedroid.businesslogic.WhiteSpaceRemover;
import com.bravedroid.presenter.StringPrinter;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    WhiteSpaceRemover whiteSpaceRemover = new WhiteSpaceRemover();
    StringPrinter stringPrinter = new StringPrinter(whiteSpaceRemover);
    stringPrinter.readInputFromUser();
    stringPrinter.printText();
  }
}
