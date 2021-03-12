# clojure-hackos

[![TravisCI][trav-badge]][trav-stats]  [![CircleCI][cci-badge]][cci-stats]

Solutions to various *HackerRank* challenges, in Clojure.

## Contents
|                                        |                          |                                  |
| :------------------------------------- | :----------------------- | :------------------------------- |
| **Math**                               | **Strings**              | **Fun**                          |
| [Apple and Orange][]                   | [Caesar Cipher][]        | [Beautiful Days at the Movies][] |
| [Between Two Sets][]                   | [Ransom Note][]          | [Bon Appétit][]                  |
| [Bubble Sort][]                        | [String Compression][]   | [Day of the Programmer][]        |
| [Circular Array Rotation][]            | [String Rotation][]      | [Designer PDF Viewer][]          |
| [Compute the Area of a Polygon][]      | [Super Reduced String][] | [Electronics Shop][]             |
| [Compute the Perimeter of a Polygon][] | [Time in Words][]        | [Halloween Sale][]               |
| [Extra Long Factorials][]              |                          |                                  |
| [Find Digits][]                        |                          |                                  |
| [Minimum Distances][]                  |                          |                                  |
| [Pascal's Triangle][]                  |                          |                                  |
| [Sequence Equation][]                  |                          |                                  |

*Links to the challenges are in each source file*

## Testing the solutions

##### Leiningen

    lein do -U deps, check, test

##### Docker

*Requires `BUILDKIT` support (Docker versions >= 18.09)*

    DOCKER_BUILDKIT=1 docker build -t clojure-hackos .

## The REPL environment

*The default namespace is a [tiny helper library](src/clojure_hackos/utils/helpers.clj) as some solutions depend on external functions.*

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
[Apple and Orange]: src/clojure_hackos/apple_and_orange.clj
[Beautiful Days at the Movies]: src/clojure_hackos/palindromes.clj
[Between Two Sets]: src/clojure_hackos/between_2_sets.clj
[Bon Appétit]: src/clojure_hackos/bon_appetit.clj
[Bubble Sort]: src/clojure_hackos/bubble_sort.clj
[Caesar Cipher]: src/clojure_hackos/caesar_cipher.clj
[Circular Array Rotation]: src/clojure_hackos/circular_rotation.clj
[Compute the Area of a Polygon]: src/clojure_hackos/polygonal_area.clj
[Compute the Perimeter of a Polygon]: src/clojure_hackos/perimeter.clj
[Day of the Programmer]: src/clojure_hackos/day256.clj
[Designer PDF Viewer]: src/clojure_hackos/pdf.clj
[Electronics Shop]: src/clojure_hackos/electronics_shop.clj
[Extra Long Factorials]: src/clojure_hackos/extra_long_factorials.clj
[Find Digits]: src/clojure_hackos/divisors.clj
[Halloween Sale]: src/clojure_hackos/halloween_sale.clj
[Minimum Distances]: src/clojure_hackos/minimum_distances.clj
[Pascal's Triangle]: src/clojure_hackos/triangle_arithmétique.clj
[Ransom Note]: src/clojure_hackos/word_frequencies.clj
[Sequence Equation]: src/clojure_hackos/sequence_equation.clj
[String Compression]: src/clojure_hackos/string_compression.clj
[String Rotation]: src/clojure_hackos/string_rotation.clj
[Super Reduced String]: src/clojure_hackos/string_reduction.clj
[Time in Words]: src/clojure_hackos/time_in_words.clj

<!-- ci -->
[trav-badge]: https://travis-ci.com/rdipardo/clojure-hackos.svg?token=yCqYFpeQtymaztY4Spav&branch=master
[cci-badge]: https://circleci.com/gh/rdipardo/clojure-hackos.svg?style=svg
[trav-stats]: https://travis-ci.com/rdipardo/clojure-hackos
[cci-stats]: https://circleci.com/gh/rdipardo/clojure-hackos
