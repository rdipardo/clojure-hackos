(set! *warn-on-reflection* true)
(ns clojure-hackos.day256
  "Solution to the *Day of the Programmer* challenge.
   See: https://www.hackerrank.com/challenges/day-of-the-programmer"
  (:import
   java.util.GregorianCalendar
   java.text.SimpleDateFormat))

(defn day-of-programmer
  "Finds the 256^th day of the given `year` and returns it as a formatted date 
   string."
  [year]
  (let [day-of 256
        days-before 243
        day-of-programmer
        (cond
          (< year 1918)
          (if (zero? (mod year 4))
            (- day-of (inc days-before))
            (- day-of days-before))
          (= year 1918)
          (- day-of (- days-before 13))
          :else
          (if (or (zero? (mod year 400))
                  (and (zero? (mod year 4))
                       (not (zero? (mod year 100)))))
            (- day-of (inc days-before))
            (- day-of days-before)))
        date (GregorianCalendar. year 8 day-of-programmer)
        formatter (SimpleDateFormat. "dd.MM.yyyy")]

    (.setCalendar formatter date)
    (.format formatter (.getTime date))))