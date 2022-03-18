/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.cat;

/**
 *
 * @author oulis
 */
public interface CatEjbJpaServiceBase
{

  default void OpswProgressEvent(double percent) throws CatException
  {

  }
}
