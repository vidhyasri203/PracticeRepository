package com.cg.day4;

public class SimpleCalculator {
	enum Operation {
		 
	    PLUS("+") {
	          double apply(double x, double y) {
	            return x + y;
	          }
	        },
	    MINUS("-") {
	          double apply(double x, double y) {
	            return x - y;
	          }
	        },
	    TIMES("*") {
	          double apply(double x, double y) {
	            return x * y;
	          }
	        },
	    DIVIDE("/") {
	          double apply(double x, double y) {
	            return x / y;
	          }
	        };
	 
	    private final String symbol;
	 
	    Operation(String symbol) {
	      this.symbol = symbol;
	    }
	 
	    @Override
	    public String toString() {
	      return symbol;
	    }
	 
	    abstract double apply(double x, double y);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
	    double y = 3.0;
	 
	    for (Operation op : Operation.values()) {
	      System.out.print(x + " ");
	      System.out.print(op.toString() + " ");
	      System.out.print(y + " = ");
	      System.out.println(op.apply(x, y));
	 
	    }
	}

}
