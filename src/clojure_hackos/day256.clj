(ns clojure-hackos.day256
  "Solution to the *Day of the Programmer* challenge.
   See: https://www.hackerrank.com/challenges/day-of-the-programmer"
  (:import
   java.util.GregorianCalendar
   java.text.SimpleDateFormat))

(set! *warn-on-reflection* true)

(defn day-of-programmer
  "Finds the 256<sup>th</sup> day of the given `year` and returns it as a
  formatted date string."
  [year]
  (let [day-of 256
        days-before 243
        day-256 (condp #(%1 %2 1918) year
                  < (if (zero? (mod year 4))
                      (- day-of (inc days-before))
                      (- day-of days-before))
                  = (- day-of (- days-before 13))
                  :else (if (or (zero? (mod year 400))
                                (and (zero? (mod year 4))
                                     (not (zero? (mod year 100)))))
                          (- day-of (inc days-before))
                          (- day-of days-before)))
        date (GregorianCalendar. year 8 day-256)
        formatter (SimpleDateFormat. "dd.MM.yyyy")]

    (.setCalendar formatter date)
    (.format formatter (.getTime date))))
