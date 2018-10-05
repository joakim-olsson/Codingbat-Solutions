/**
 * @Author: Joakim Olsson <lomo133>
 * @Date:   2018-10-05T17:53:01+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T17:53:51+02:00
 */

 public boolean sleepIn(boolean weekday, boolean vacation) {
   if (!weekday) {
     return true;
   }
   else if (vacation) {
     return true;
   } else {
     return false;
   }
 }
