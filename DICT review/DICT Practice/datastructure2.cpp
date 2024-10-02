#include <iostream>
#include <queue>

using namespace std;

struct Node{
    int value;
    Node* next;
};
int main()
{

    Node* one = new Node();
    Node* two = new Node();
    Node* three = new Node();
    //Initializing a value in each Node
    one->value = 1;
    two->value = 2;
    three->value = 3;

    //Connecting Node
    one->next = two;
    two->next = three;
    three->next = NULL;

    //print the output
    while(one != NULL)
        {
            cout<<one->value<<endl;
            one = one->next;
        }

return 0;
}
