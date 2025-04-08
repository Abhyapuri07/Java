#include<iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
};

struct Node *head = NULL;

void insert(int new_data){
    struct Node *new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->next = head;
    head = new_node;
}


void display(){
    struct Node *temp;
    temp = head;
    while(temp!=NULL){
        cout<<temp->data;
        temp=temp->next;
    }
}

int main(){
    insert(7);
    insert(29);
    insert(16);
    cout<<"The linked list is:"<<endl;
    display();
    return 0;
}