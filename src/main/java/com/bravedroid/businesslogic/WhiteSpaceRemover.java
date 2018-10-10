package com.bravedroid.businesslogic;

public class WhiteSpaceRemover {
  private String inputText;
  private OnTextChangeListener onTextChangeListener;

  public WhiteSpaceRemover(OnTextChangeListener onTextChangeListener) {
    this.onTextChangeListener = onTextChangeListener;
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }

  public void removeWhiteSpace() {
    inputText = inputText.replaceAll("\\s", "");
    onTextChangeListener.onTextChange(inputText);
  }

  public void unsubscribe() {
    onTextChangeListener = null;
  }

  public interface OnTextChangeListener {
    void onTextChange(String updatedText);
  }
}
