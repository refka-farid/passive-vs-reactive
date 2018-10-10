package com.bravedroid;

import com.bravedroid.presenter.StringPrinter;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    StringPrinter stringPrinter = new StringPrinter();
    stringPrinter.readInputFromUser();
  }
}
