#include <iostream>
#include <stack>

using namespace std;

int main ()
{
    stack<int> myCollection;
    myCollection.push(100);
    myCollection.push(200);
    myCollection.push(300);
//  myCollection.pop();

    while(!myCollection.empty())
    {
        cout<<myCollection.top()<<endl;
        myCollection.pop();
    }

    return 0;
}
