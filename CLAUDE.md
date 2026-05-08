# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Objetivo

Repositório de estudos para preparação para teste técnico backend Java.
Foco em algoritmos, estruturas de dados e SQL conforme cobrado em processos seletivos.
Cada classe resolve um cenário específico com comentários explicando a lógica em português.

## Commands

```bash
# Build
mvn compile

# Run all tests
mvn test

# Run a single test class
mvn test -Dtest=ClassName

# Run a single test method
mvn test -Dtest=ClassName#methodName
```

## Architecture

This is a plain Java 21 / Maven project for DSA (Data Structures and Algorithms) practice. There is no framework — the only dependency is JUnit Jupiter 5.10.0 for tests.

Each topic lives in its own package under `src/main/java/com/dsa/`:

| Package | Topic |
|---|---|
| `strings` | Anagrams, palindromes, reversal, duplicate removal, character counting |
| `arrays` | Linear search, range search, filters, element insertion/removal |
| `hashmap` | Frequency counting, grouping, deduplication with HashMap/HashSet |
| `sorting` | Bubble Sort, Merge Sort, Binary Search |
| `logic` | FizzBuzz variants, even/odd, sequences, number manipulation |
| `sql` | SQL exercises (SELECT, JOINs, GROUP BY, aggregate functions) |

The pattern throughout is: one class per problem, with a corresponding JUnit test class mirroring the same package path under `src/test/java/com/dsa/`.