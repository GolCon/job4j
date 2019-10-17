package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third){
          int result=third;
          if (first>=second){
              if (first>=third){
                  return first;
              }
              else if (second>third){
                  return second;
              }
          }
          else if (second>=third){
              return second;
          }
          return result;
    }
}
