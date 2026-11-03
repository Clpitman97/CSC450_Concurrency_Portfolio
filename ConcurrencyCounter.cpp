/*
 * ConcurrencyCounter.cpp
 *
 *  Created on: Nov 3, 2026
 *      Author: cryst
 */
#include <iostream>
#include <thread>

using namespace std;

// Count from 0 to 20.
void countUp() {
    for (int i = 0; i <= 20; i++) {
        cout << "Counting up: " << i << endl;
    }
}

// Count from 20 to 0.
void countDown() {
    for (int i = 20; i >= 0; i--) {
        cout << "Counting down: " << i << endl;
    }
}

int main() {
    cout << "Starting the counter program." << endl;

    // Start the first thread.
    thread firstThread(countUp);

    // Wait for the first thread to finish.
    firstThread.join();

    // Start the second thread.
    thread secondThread(countDown);

    // Wait for the second thread to finish.
    secondThread.join();

    cout << "Counter program completed." << endl;

    return 0;
}
