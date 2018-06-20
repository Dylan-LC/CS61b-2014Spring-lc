/* Date.java */

import java.io.*;

class Date {

  /* Put your private data fields here. */
    private int day;
    private int month;
    private int year;

  /** Constructs a date with the given month, day and year.   If the date is
   *  not valid, the entire program will halt with an error message.
   *  @param month is a month, numbered in the range 1...12.
   *  @param day is between 1 and the number of days in the given month.
   *  @param year is the year in question, with no digits omitted.
   */
  public Date(int month, int day, int year) {
      if (isValidDate(month, day, year)) {
	  this.day = day;
	  this.month = month;
	  this.year = year;
      } else {
	  System.out.println("Your input Date is not valid! ");
	  System.exit(0);
      }
  }

  /** Constructs a Date object corresponding to the given string.
   *  @param s should be a string of the form "month/day/year" where month must
   *  be one or two digits, day must be one or two digits, and year must be
   *  between 1 and 4 digits.  If s does not match these requirements or is not
   *  a valid date, the program halts with an error message.
   */
  public Date(String s) {
      String[] parts = s.split("/");
      String mstr = parts[0];
      String dstr = parts[1];
      String ystr = parts[2];
      if (mstr.length()==1 || mstr.length()==2 || dstr.length()==1 ||
	  dstr.length()==2 || (ystr.length()>=1 && ystr.length()<=4)) {
	  this.month = Integer.parseInt(mstr);
	  this.day = Integer.parseInt(dstr);
	  this.year = Integer.parseInt(ystr);
      }
      
  }

  /** Checks whether the given year is a leap year.
   *  @return true if and only if the input year is a leap year.
   */
  public static boolean isLeapYear(int year) {
      if (year%4 == 0) {
	  if (year%100 == 0) {
	      if (year%400 == 0) {
		  return true;
	      } else {
		  return false;
	      }
	  } else {
	      return true;
	  }
      } else {
	  return false;
      }
  }

  /** Returns the number of days in a given month.
   *  @param month is a month, numbered in the range 1...12.
   *  @param year is the year in question, with no digits omitted.
   *  @return the number of days in the given month.
   */
  public static int daysInMonth(int month, int year) {
      int bigMonthDays = 31;
      int smlMonthDays = 30;
      switch (month) {
      case 2:
	  if (isLeapYear(year)) {
	      return 29;
	  } else {
	      return 28;
	  }
      case 4:
      case 6:
      case 9:
      case 11:
	  return smlMonthDays;
      default:
	  return bigMonthDays;
      }
  }

  /** Checks whether the given date is valid.
   *  @return true if and only if month/day/year constitute a valid date.
   *
   *  Years prior to A.D. 1 are NOT valid.
   */
  public static boolean isValidDate(int month, int day, int year) {
      int bigMonthDays = 31;
      int smlMonthDays = 30;
      if (year<1 || day<1 || day>bigMonthDays || month<1 || month>12) {
	  return false;
      } else {
	  switch (month) {
	  case 2:
	      if (isLeapYear(year)) {
		  if (day>29) {
		      return false;
		  }
	      } else {
		  if (day>28) {
		      return false;
		  }
	      }
	  case 4:
	      if (day>smlMonthDays) {
		  return false;
	      }
	  case 6:
	      if (day>smlMonthDays) {
		  return false;
	      }
	  case 9:
	      if (day>smlMonthDays) {
		  return false;
	      }
	  case 11:
	      if (day>smlMonthDays) {
		  return false;
	      }
	  default:
	      return true;
	  }
      }
  }

  /** Returns a string representation of this date in the form month/day/year.
   *  The month, day, and year are expressed in full as integers; for example,
   *  12/7/2006 or 3/21/407.
   *  @return a String representation of this date.
   */
  public String toString() {
      String srd = month + "/" + day + "/" + year;
      return srd;
  }

  /** Determines whether this Date is before the Date d.
   *  @return true if and only if this Date is before d. 
   */
  public boolean isBefore(Date d) {
      if (isValidDate(d.month, d.day, d.year)) {
	  if (year<d.year) {
	      return true;
	  } else if (year==d.year) {
	      if (month<d.month) {
		  return true;
	      } else if (month==d.month) {
		  if (day<d.day) {
		      return true;
		  } else {
		      return false;
		  }
	      } else {
		  return false;
	      }
	  } else {
	      return false;
	  }
      }
      return false;
  }

  /** Determines whether this Date is after the Date d.
   *  @return true if and only if this Date is after d. 
   */
  public boolean isAfter(Date d) {
      if (isValidDate(d.month, d.day, d.year)) {
	  if (this.isBefore(d) || this.equals(d)) {
	      return false;
	  } else {
	      return true;
	  }
      }
      return false;
  }

  /** Returns the number of this Date in the year.
   *  @return a number n in the range 1...366, inclusive, such that this Date
   *  is the nth day of its year.  (366 is used only for December 31 in a leap
   *  year.)
   */
  public int dayInYear() {
      /*
      int numOfDay;
      int numBeforeMonth = 0;
      int numBeforeMonthExceptFeb = 0;
      int bigMonthDays = 31;
      int smlMonthDays = 30;
      switch (month) {
      case 1:
	  return day;
      case 2:
	  return bigMonthDays + day;
      case 3:
	  numBeforeMonthExceptFeb = bigMonthDays*1;
      case 4:
	  numBeforeMonthExceptFeb = bigMonthDays*2;
      case 5:
	  numBeforeMonthExceptFeb = bigMonthDays*2 + smlMonthDays*1;
      case 6:
	  numBeforeMonthExceptFeb = bigMonthDays*3 + smlMonthDays*1;
      case 7:
	  numBeforeMonthExceptFeb = bigMonthDays*3 + smlMonthDays*2;
      case 8:
	  numBeforeMonthExceptFeb = bigMonthDays*4 + smlMonthDays*2;
      case 9:
	  numBeforeMonthExceptFeb = bigMonthDays*5 + smlMonthDays*2;
      case 10:
	  numBeforeMonthExceptFeb = bigMonthDays*5 + smlMonthDays*3;
      case 11:
	  numBeforeMonthExceptFeb = bigMonthDays*6 + smlMonthDays*3;
      case 12:
	  numBeforeMonthExceptFeb = bigMonthDays*6 + smlMonthDays*4;
      }

      if (isLeapYear(year)) {
	  numBeforeMonth = numBeforeMonthExceptFeb + 29;
      } else {
	  numBeforeMonth = numBeforeMonthExceptFeb + 28;
      }
      numOfDay = numBeforeMonth + day;
      return numOfDay;
      */

      int days = 0;
      int numBeforeMonth = 0;
      for (int i=1; i<month; i++) {
	  days += daysInMonth(i, year);
      }
      days = days + day;
      return days;
  }

  /** Determines the difference in days between d and this Date.  For example,
   *  if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1.
   *  If this Date occurs before d, the result is negative.
   *  @return the difference in days between d and this date.
   */
  public int difference(Date d) {
      int diffDays = 0;
	  if (year == d.year) {
	      diffDays =  this.dayInYear() - d.dayInYear();
	      return diffDays;
	  } else if (year == d.year-1) {
	      if (isLeapYear(year)) {
		  diffDays = -(366-this.dayInYear()+d.dayInYear());
	      } else {
		  diffDays = -(365-this.dayInYear()+d.dayInYear());
	      }
	      return diffDays;
	  } else if (d.year == year-1) {
	      if (isLeapYear(d.year)) {
		  diffDays = 366-d.dayInYear()+this.dayInYear();
	      } else {
		  diffDays = 365-d.dayInYear()+this.dayInYear();
	      }
	      return diffDays;
	  } else if (d.year < year) {
	      for (int i=d.year+1; i<year; i++) {
		  if (isLeapYear(i)) {
		      diffDays += 366;
		  } else {
		      diffDays += 365;
		  }
	      }
	      if (isLeapYear(d.year)) {
		  diffDays = diffDays + 366 - d.dayInYear() + this.dayInYear();
	      } else {
		  diffDays = diffDays + 365 - d.dayInYear() + this.dayInYear();
	      }
	      return diffDays;
	  } else {
	      for (int i=year+1; i<d.year; i++) {
		  if (isLeapYear(i)) {
		      diffDays += 366;
		  } else {
		      diffDays += 365;
		  }
	      }
	      if (isLeapYear(year)) {
		  diffDays = diffDays + 366 - this.dayInYear() + d.dayInYear();
	      } else {
		  diffDays = diffDays + 365 - this.dayInYear() + d.dayInYear();
	      }
	      return -diffDays;
	  }
      
  }

  public static void main(String[] argv) {
    System.out.println("\nTesting constructors.");
    Date d1 = new Date(1, 1, 1);
    System.out.println("Date should be 1/1/1: " + d1);
    d1 = new Date("2/4/2");
    System.out.println("Date should be 2/4/2: " + d1);
    d1 = new Date("2/29/2000");
    System.out.println("Date should be 2/29/2000: " + d1);
    d1 = new Date("2/29/1904");
    System.out.println("Date should be 2/29/1904: " + d1);

    d1 = new Date(12, 31, 1975);
    System.out.println("Date should be 12/31/1975: " + d1);
    Date d2 = new Date("1/1/1976");
    System.out.println("Date should be 1/1/1976: " + d2);
    Date d3 = new Date("1/2/1976");
    System.out.println("Date should be 1/2/1976: " + d3);

    Date d4 = new Date("2/27/1977");
    Date d5 = new Date("8/31/2110");
    Date d6 = new Date("6/24/2016");
    Date d7 = new Date("12/31/2018");
    Date d8 = new Date("12/31/2017");
    Date d9 = new Date("10/25/2017");
    Date d10 = new Date("1/17/1995");

    /* I recommend you write code to test the isLeapYear function! */

    System.out.println("\nTesting before and after.");
    System.out.println(d2 + " after " + d1 + " should be true: " + 
                       d2.isAfter(d1));
    System.out.println(d3 + " after " + d2 + " should be true: " + 
                       d3.isAfter(d2));
    System.out.println(d1 + " after " + d1 + " should be false: " + 
                       d1.isAfter(d1));
    System.out.println(d1 + " after " + d2 + " should be false: " + 
                       d1.isAfter(d2));
    System.out.println(d2 + " after " + d3 + " should be false: " + 
                       d2.isAfter(d3));

    System.out.println(d1 + " before " + d2 + " should be true: " + 
                       d1.isBefore(d2));
    System.out.println(d2 + " before " + d3 + " should be true: " + 
                       d2.isBefore(d3));
    System.out.println(d1 + " before " + d1 + " should be false: " + 
                       d1.isBefore(d1));
    System.out.println(d2 + " before " + d1 + " should be false: " + 
                       d2.isBefore(d1));
    System.out.println(d3 + " before " + d2 + " should be false: " + 
                       d3.isBefore(d2));

    System.out.println("\nTesting difference.");
    System.out.println(d1 + " - " + d1  + " should be 0: " + 
                       d1.difference(d1));
    System.out.println(d2 + " - " + d1  + " should be 1: " + 
                       d2.difference(d1));
    System.out.println(d3 + " - " + d1  + " should be 2: " + 
                       d3.difference(d1));
    System.out.println(d3 + " - " + d4  + " should be -422: " + 
                       d3.difference(d4));
    System.out.println(d5 + " - " + d4  + " should be 48762: " + 
                       d5.difference(d4));
    System.out.println(d7 + " - " + d6  + " should be 920: " + 
                       d7.difference(d6));
    System.out.println(d6 + " - " + d7  + " should be -920: " + 
                       d6.difference(d7));
    System.out.println(d8 + " - " + d6  + " should be 555: " + 
                       d8.difference(d6));
    System.out.println(d9 + " - " + d8  + " should be -67: " + 
                       d9.difference(d8));
    System.out.println("The number of date "+ d8 + ", in the year should be 365: " + d8.dayInYear());
    System.out.println("The number of date "+ d4 + ", in the year should be 58: " + d4.dayInYear());
    System.out.println("The number of date "+ d9 + ", in the year should be 298: " + d9.dayInYear());
    System.out.println("The number of date "+ d10 + ", in the year should be 17: " + d10.dayInYear());
  }
}
