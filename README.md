# CSC450 Concurrency Portfolio

This repository contains C++ and Java multithreading applications developed for the CSC450 Programming III portfolio project.

## Program Description

Both applications use two threads to perform sequential counting operations. The first thread counts from 0 to 20, while the second counts backward from 20 to 0. The `join()` method ensures that the first thread finishes before the second begins.

## Development Environment

- **C++:** Eclipse CDT, MinGW GCC
- **Java:** Eclipse IDE, Java SE 25

## Source Files

- `ConcurrencyCounter.cpp` – C++ implementation using `std::thread`.
- `ConcurrencyCounter.java` – Java implementation using the `Thread` class.
