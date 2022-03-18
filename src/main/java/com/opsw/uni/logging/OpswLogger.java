/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.logging;

import com.opsw.uni.cat.CatException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;

/**
 *
 * @author oulis
 */
public class OpswLogger
{

  private static final SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

  private static final Logger logger = Logger.getLogger(OpswLogger.class);

  public static Logger getLogger()
  {
    return logger;
  }

  public static void LoggerLogException(Throwable th)
  {
    String vmessage = th.getMessage() != null ? th.getMessage() : "";
    if (th instanceof CatException)
    {
      CatException catException = (CatException) th;
      vmessage += catException.getTechMessage() != null ? catException.getTechMessage() : "";
    }
    getLogger().error(getStringTimeNow() + ": " + th.getClass().getName() + ": " + th.getClass().getName() + ", " + vmessage, th);
  }

  public static void LoggerLogException(String message, Throwable th)
  {
    String vmessage = th.getMessage() != null ? th.getMessage() : "";
    if (th instanceof CatException)
    {
      CatException catException = (CatException) th;
      vmessage += catException.getTechMessage() != null ? catException.getTechMessage() : "";
    }
    getLogger().error(getStringTimeNow() + ": " + th.getClass().getName() + ", " + vmessage, th);
  }

  public static void LoggerLogDebug(String message)
  {
    getLogger().debug(getStringTimeNow() + ": " + message);
  }

  private static String getStringTimeNow()
  {
    return (String) getStringTime(Calendar.getInstance());
  }

  private static String getStringTime(Calendar calendar)
  {
    String result = "N/A";
    try
    {
      result = df.format(calendar.getTime());
    }
    catch (Exception ex)
    {
      getLogger().error(ex.getMessage(), ex);
    }

    return result;
  }
}