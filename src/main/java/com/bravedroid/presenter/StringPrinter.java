package com.bravedroid.presenter;

import com.bravedroid.businesslogic.WhiteSpaceRemover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPrinter implements WhiteSpaceRemover.OnTextChangeListener {
  private WhiteSpaceRemover whiteSpaceRemover;
  private BufferedReader input;

  public StringPrinter() {
    whiteSpaceRemover = new WhiteSpaceRemover(this);
    input = new BufferedReader(new InputStreamReader(System.in));
  }


  public void readInputFromUser() throws IOException {
    System.out.println("Please enter your text");
    String inputFromUser = input.readLine();
    whiteSpaceRemover.setInputText(inputFromUser);
    whiteSpaceRemover.removeWhiteSpace();
  }

  @Override
  public void onTextChange(String updatedText) {
    System.out.println("output = " + updatedText);
    whiteSpaceRemover.unsubscribe();
  }

}
