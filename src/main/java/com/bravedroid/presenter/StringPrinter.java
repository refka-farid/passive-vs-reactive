package com.bravedroid.presenter;

import com.bravedroid.businesslogic.WhiteSpaceRemover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPrinter {
  private WhiteSpaceRemover whiteSpaceRemover;
  private BufferedReader input;
  private String inputFromUser;

  public StringPrinter(WhiteSpaceRemover whiteSpaceRemover) {
    this.whiteSpaceRemover = whiteSpaceRemover;
    input = new BufferedReader(new InputStreamReader(System.in));
  }

  public void readInputFromUser() throws IOException {
    System.out.println("Please enter your text");
    inputFromUser = input.readLine();
  }

  public void printText() {
    System.out.println("output =" + whiteSpaceRemover.removeWhiteSpace(inputFromUser));
  }
}
