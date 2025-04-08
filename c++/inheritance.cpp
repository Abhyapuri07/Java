#include<iostream>
#include<string>
using namespace std;

class Person{

    public:
    string name;
    int age;

    ~Person(){
        cout<<"Parent destructor"<<endl;
    }
};

class Student : public Person{
    public:
    int rollno;

    ~Student(){
        cout<<"Child destructor"<<endl;
    }

    void getInfo(){
        cout<<"name: "<<name<<endl;
        cout<<"age: "<<age<<endl;
        cout<<"rollno: "<<rollno<<endl;
    }
};

int main(){
    Student s1;
    s1.name = "Abhya";
    s1.age = 25;
    s1.rollno = 7029;
    s1.getInfo();
    return 0;
}
