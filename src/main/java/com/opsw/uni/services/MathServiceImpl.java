/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.services;

import com.opsw.uni.cat.CatException;
import com.opsw.uni.repositories.MathRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author oulis
 */
public class MathServiceImpl implements MathService
{
  @Autowired
  private MathRepository mathRepository;

  @Override
  public List<Math> Maths_List01() throws CatException
  {
    List<Math> res = null;
    try
    {
      res = this.mathRepository.findAll();
    }
    catch(Exception E)
    {
      CatException.RethrowCatException(E);
    }
    
    return res;
  }
  
}
