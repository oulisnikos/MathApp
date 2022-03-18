/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.services;

import com.opsw.uni.cat.CatEjbJpaServiceBase;
import com.opsw.uni.cat.CatException;
import java.util.List;

/**
 *
 * @author oulis
 */
public interface MathService extends CatEjbJpaServiceBase
{
  public List<Math> Maths_List01() throws CatException;
}
