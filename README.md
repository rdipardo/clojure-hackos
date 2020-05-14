# clojure-hackos

[![Build Status](https://travis-ci.com/rdipardo/clojure-hackos.svg?token=yCqYFpeQtymaztY4Spav&branch=master)](https://travis-ci.com/rdipardo/clojure-hackos)

Solutions to various *HackerRank* challenges, in Clojure.

## Contents
*Most of the following can be found on [HackerRank](https://www.hackerrank.com) under `Practice > Algorithms > Implementation`*

- [Apple and Orange](src/clojure_hackos/apple_and_orange.clj)

- [Beautiful Days at the Movies](src/clojure_hackos/palindromes.clj)

- [Between Two Sets](src/clojure_hackos/between_2_sets.clj)

- [Bon Appétit](src/clojure_hackos/bon_appetit.clj)

- [Caesar Cipher](src/clojure_hackos/caesar_cipher.clj)

- [Circular Array Rotation](src/clojure_hackos/circular_rotation.clj)

- [Day of the Programmer](src/clojure_hackos/day256.clj)

- [Designer PDF Viewer](src/clojure_hackos/pdf.clj)

- [Electronics Shop](src/clojure_hackos/electronics_shop.clj)

- [Extra Long Factorials](src/clojure_hackos/extra_long_factorials.clj)

- [Find Digits](src/clojure_hackos/divisors.clj)

- [Halloween Sale](src/clojure_hackos/halloween_sale.clj)

- [Minimum Distances](src/clojure_hackos/minimum_distances.clj)

- [Sequence Equation](src/clojure_hackos/sequence_equation.clj)

- [Time in Words](src/clojure_hackos/time_in_words.clj)


## Testing the solutions

### Leiningen

    lein do -U deps, check, test

### Docker

*Requires `BUILDKIT` support (Docker versions >= 18.09)*

    DOCKER_BUILDKIT=1 docker build -t clojure-hackos:0.1.0 .

## The REPL environment

*The default namespace is a [tiny helper library](src/clojure_hackos/helpers.clj) as some solutions depend on external functions.*

### Leiningen

    lein repl

### Docker

    docker run --volume=$(pwd):/app -it clojure-hackos:0.1.0


## Contribute

I'm an apprentice Clojurian (at best), so expect to find lots of sub-optimal implementations.
Your suggestions for improvement will be greatly appreciated!


## License

Any copyright is dedicated to the Public Domain.
For more information, please refer to http://unlicense.org.
