package day01_2024

import readLines
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.math.abs

fun main() {
    part1()
    part2()
}

fun part1() {
    println("=== Part 1")
    val lines = readLines(1, "input.txt")

    val pairs = lines.map{it.split("   ")}
    val l1 = pairs.map { it[0].toInt() }.sorted()
    val l2 = pairs.map { it[1].toInt() }.sorted()
    val combinedList = l1.zip(l2)

    val score = combinedList.sumOf { abs(it.first - it.second) }

    println(score)
}

fun part2() {
    println("=== Part 2")
    val lines = readLines(1, "input.txt")

    val pairs = lines.map{it.split("   ")}
    val l1 = pairs.map { it[0].toInt() }.sorted()
    val l2 = pairs.map { it[1].toInt() }.sorted()

    val score = l1.sumOf { l1Item -> l1Item * l2.count { it == l1Item } }

    println(score)

}