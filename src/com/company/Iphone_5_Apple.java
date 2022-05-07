package com.company;

public class Iphone_5_Apple extends Iphone_4_Apple {
  private ColorOfPhones colorOfPhones;
  private  int power;
  private PhonesInfo phonesInfo;
   private  int heigthOfPhones;

  public int getPower() {
    return power;
  }

  @Override
  public ColorOfPhones getColorOfPhones() {
    return colorOfPhones;
  }

  @Override
  public PhonesInfo getPhonesInfo() {
    return phonesInfo;
  }

  @Override
  public void VoiceOfCameras() {
    super.VoiceOfCameras();
    System.out.println("prrchkuku 18px");
  }

  public final int getHeigthOfPhones() {
    return heigthOfPhones;
  }
}
