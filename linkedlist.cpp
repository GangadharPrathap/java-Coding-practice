// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

// Node class for the linked list
class Node {
public:
    int data;
    Node* next;

    // Constructor to initialize a node
    Node(int value) {
        data = value;
        next = nullptr; // Use nullptr instead of NULL
    }
};

int main() {
    // Create new nodes on the heap
    Node* newNode1 = new Node(10);
    Node* newNode2 = new Node(11);
    Node* newNode3 = new Node(12);
    Node* newNode4 = new Node(13);

    // Link the nodes together to form a list
    newNode1->next = newNode2;
    newNode2->next = newNode3;
    newNode3->next = newNode4;
    // newNode4->next is already nullptr from the constructor

    // Traverse the linked list and print the data
    Node* temp = newNode1; // Start from the first node
    while (temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next; // Move to the next node
    }
    cout << "nullptr" << endl;

    // Remember to deallocate memory to prevent memory leaks
    delete newNode1;
    delete newNode2;
    delete newNode3;
    delete newNode4;

    return 0;
}
