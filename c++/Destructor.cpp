#include<iostream>
#include<string>
using namespace std;

class Student{

    public:
    string name;
    double* cgpaPtr;


    Student(string name, double cgpa){
        this->name = name;
        cgpaPtr = new double;
        *cgpaPtr = cgpa;
    }

    

     //Destructor
     ~Student(){
        cout<<"Hi, i delete everything"<<endl;
        delete cgpaPtr; //delete dynamically allocated memory
        }

     
     void getInfo(){
        cout<<"name: "<<name<<endl;
        cout<<"cgpa: "<<*cgpaPtr<<endl;
     }
};

int main(){
    Student s1("Abhya", 8.9);
    s1.getInfo();
    return 0;
}