/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class AdaptiveCardObjectModel {
  public static String AdaptiveCardSchemaKeyToString(AdaptiveCardSchemaKey type) {
    return AdaptiveCardObjectModelJNI.AdaptiveCardSchemaKeyToString(type.swigValue());
  }

  public static AdaptiveCardSchemaKey AdaptiveCardSchemaKeyFromString(String type) {
    return AdaptiveCardSchemaKey.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCardSchemaKeyFromString(type));
  }

  public static String CardElementTypeToString(CardElementType elementType) {
    return AdaptiveCardObjectModelJNI.CardElementTypeToString(elementType.swigValue());
  }

  public static CardElementType CardElementTypeFromString(String elementType) {
    return CardElementType.swigToEnum(AdaptiveCardObjectModelJNI.CardElementTypeFromString(elementType));
  }

  public static String HorizontalAlignmentToString(HorizontalAlignment type) {
    return AdaptiveCardObjectModelJNI.HorizontalAlignmentToString(type.swigValue());
  }

  public static HorizontalAlignment HorizontalAlignmentFromString(String type) {
    return HorizontalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.HorizontalAlignmentFromString(type));
  }

  public static String TextColorToString(TextColor type) {
    return AdaptiveCardObjectModelJNI.TextColorToString(type.swigValue());
  }

  public static TextColor TextColorFromString(String type) {
    return TextColor.swigToEnum(AdaptiveCardObjectModelJNI.TextColorFromString(type));
  }

  public static String TextWeightToString(TextWeight type) {
    return AdaptiveCardObjectModelJNI.TextWeightToString(type.swigValue());
  }

  public static TextWeight TextWeightFromString(String type) {
    return TextWeight.swigToEnum(AdaptiveCardObjectModelJNI.TextWeightFromString(type));
  }

  public static String TextSizeToString(TextSize type) {
    return AdaptiveCardObjectModelJNI.TextSizeToString(type.swigValue());
  }

  public static TextSize TextSizeFromString(String type) {
    return TextSize.swigToEnum(AdaptiveCardObjectModelJNI.TextSizeFromString(type));
  }

  public static String ImageSizeToString(ImageSize type) {
    return AdaptiveCardObjectModelJNI.ImageSizeToString(type.swigValue());
  }

  public static ImageSize ImageSizeFromString(String type) {
    return ImageSize.swigToEnum(AdaptiveCardObjectModelJNI.ImageSizeFromString(type));
  }

  public static String SeparationStyleToString(SeparationStyle type) {
    return AdaptiveCardObjectModelJNI.SeparationStyleToString(type.swigValue());
  }

  public static SeparationStyle SeparationStyleFromString(String type) {
    return SeparationStyle.swigToEnum(AdaptiveCardObjectModelJNI.SeparationStyleFromString(type));
  }

  public static String ImageStyleToString(ImageStyle style) {
    return AdaptiveCardObjectModelJNI.ImageStyleToString(style.swigValue());
  }

  public static ImageStyle ImageStyleFromString(String style) {
    return ImageStyle.swigToEnum(AdaptiveCardObjectModelJNI.ImageStyleFromString(style));
  }

}
