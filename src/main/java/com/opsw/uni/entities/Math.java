/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author oulis
 */
@Entity
@Table(name = "MATH")
public class Math implements Serializable
{
  @Id
  private Long id;
  @Temporal(TemporalType.TIME)
  private Calendar start;
  @Temporal(TemporalType.TIME)
  private Calendar end;
  private String math1;
  private String math2;
  private String math3;
  private String math4;
  private String math5;

  public Math()
  {
    this.start = null;
    this.end = null;
    this.math1 = null;
    this.math2 = null;
    this.math3 = null;
    this.math4 = null;
    this.math5 = null;
  }

  public Calendar getStart()
  {
    return start;
  }

  public void setStart(Calendar start)
  {
    this.start = start;
  }

  public Calendar getEnd()
  {
    return end;
  }

  public void setEnd(Calendar end)
  {
    this.end = end;
  }

  public String getMath1()
  {
    return math1;
  }

  public void setMath1(String math1)
  {
    this.math1 = math1;
  }

  public String getMath2()
  {
    return math2;
  }

  public void setMath2(String math2)
  {
    this.math2 = math2;
  }

  public String getMath3()
  {
    return math3;
  }

  public void setMath3(String math3)
  {
    this.math3 = math3;
  }

  public String getMath4()
  {
    return math4;
  }

  public void setMath4(String math4)
  {
    this.math4 = math4;
  }

  public String getMath5()
  {
    return math5;
  }

  public void setMath5(String math5)
  {
    this.math5 = math5;
  }  
  
  
}
