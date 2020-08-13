# clojure-hackos

[![TravisCI][trav-badge]][trav-stats]  [![CircleCI][cci-badge]][cci-stats]

Solutions to various *HackerRank* challenges, in Clojure.

## Contents
|                                              |                               |                                             |
| :------------------------------------------- | :---------------------------- | :------------------------------------------ |
| **Math**                                     | **Strings**                   | **Fun**                                     |
| [Apple and Orange][Fruit]                    | [Caesar Cipher][Caesar]       | [Beautiful Days at the Movies][Palindromes] |
| [Between Two Sets][Two Sets]                 | [String Compression][Str-red] | [Bon Appétit][Bon Appétit]                  |
| [Circular Array Rotation][Circular Rotation] | [String Rotation][Str-rot]    | [Day of the Programmer][Day 256]            |
| [Compute the Area of a Polygon][Poly-a]      | [Time in Words][Time]         | [Designer PDF Viewer][PDF]                  |
| [Compute the Perimeter of a Polygon][Poly-p] |                               | [Electronics Shop][Shopper]                 |
| [Extra Long Factorials][Factorials]          |                               | [Halloween Sale][Halloween]                 |
| [Find Digits][Divisors]                      |                               |                                             |
| [Minimum Distances][Min Distances]           |                               |                                             |
| [Sequence Equation][Sequence Equation]       |                               |                                             |

*Links to the challenges are in each source file*

## Testing the solutions

##### Leiningen

    lein do -U deps, check, test

##### Docker

*Requires `BUILDKIT` support (Docker versions >= 18.09)*

    DOCKER_BUILDKIT=1 docker build -t clojure-hackos .

## The REPL environment

*The default namespace is a [tiny helper library](src/clojure_hackos/lib/helpers.clj) as some solutions depend on external functions.*

##### Leiningen

    lein repl

##### Docker

    docker run --volume=$(pwd):/app -it clojure-hackos


## Contribute

I'm an apprentice Clojurian (at best), so expect to find lots of sub-optimal implementations.
Your suggestions for improvement will be greatly appreciated!


## License

Any copyright is dedicated to the Public Domain.
For more information, please refer to https://unlicense.org.


<!-- toc -->
[Fruit]: src/clojure_hackos/apple_and_orange.clj
[Palindromes]: src/clojure_hackos/palindromes.clj
[Two Sets]: src/clojure_hackos/between_2_sets.clj
[Bon Appétit]: src/clojure_hackos/bon_appetit.clj
[Caesar]: src/clojure_hackos/caesar_cipher.clj
[Circular Rotation]: src/clojure_hackos/circular_rotation.clj
[Day 256]: src/clojure_hackos/day256.clj
[PDF]: src/clojure_hackos/pdf.clj
[Shopper]: src/clojure_hackos/electronics_shop.clj
[Factorials]: src/clojure_hackos/extra_long_factorials.clj
[Divisors]: src/clojure_hackos/divisors.clj
[Halloween]: src/clojure_hackos/halloween_sale.clj
[Min Distances]: src/clojure_hackos/minimum_distances.clj
[Poly-p]: src/clojure_hackos/perimeter.clj
[Poly-a]: src/clojure_hackos/polygonal_area.clj
[Sequence Equation]: src/clojure_hackos/sequence_equation.clj
[Str-red]: src/clojure_hackos/string_compression.clj
[Str-rot]: src/clojure_hackos/string_rotation.clj
[Time]: src/clojure_hackos/time_in_words.clj

<!-- ci -->
[trav-badge]: https://travis-ci.com/rdipardo/clojure-hackos.svg?token=yCqYFpeQtymaztY4Spav&branch=master
[cci-badge]: https://circleci.com/gh/rdipardo/clojure-hackos.svg?style=svg
[trav-stats]: https://travis-ci.com/rdipardo/clojure-hackos
[cci-stats]: https://circleci.com/gh/rdipardo/clojure-hackos
