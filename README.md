# Scala Native Example

A very quick example of making a binary executable with Scala Native.

We build a simple terminal app that takes input in `argv` of some strings and prints to the terminal the way to say those words using the [NATO phonetic alphabet](https://en.wikipedia.org/wiki/NATO_phonetic_alphabet).

## Requirements

`sbt` build tool. I'm using 1.6.2.

## Steps

1. Check out this project, and `cd` to it's directory
1. Build the binary with `sbt nativeLink`
1. Find the executable at `./target/scala-3.1.3/native-out`
1. run it with `./target/scala-3.1.3/native-out` and enjoy the output


```
$ sbt nativeLink
(snip output)

$ ./target/scala-3.1.3/native-out nick
november
india
charlie
kilo
```

## Further Reading

[scala-native.org](http://scala-native.org)

