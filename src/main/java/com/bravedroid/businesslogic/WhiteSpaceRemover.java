package com.bravedroid.businesslogic;

public class WhiteSpaceRemover {
  public String removeWhiteSpace(String input) {
    return input.replaceAll("\\s", "");
  }
}
