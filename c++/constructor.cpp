#include<iostream>
#include<string>
using namespace std;

class Teacher{

    string name;
    string subject;
    string dept;

    private:
       double salary;

    public:
       
       //non-parameterized constructor  (no parameters are passed inside braces)
       Teacher(){
        dept = "Computer Science";
       }



       //parameterized constructor  (parameters inside braces)
       Teacher(string n, string s, string d, double sal){

        name = n;
        subject = s;
        dept = d;
        salary = sal;
       }

    void getInfo(){
        cout<<"name: "<<name<<endl;
        cout<<"subject: "<<subject<<endl;
        cout<<"dept: "<<dept<<endl;
        cout<<"salary: "<<salary<<endl;

    }

};

int main(){
    Teacher t1("Abhya", "OOPM", "ComputerScience", 20000);  //parameterized cons called
    t1.getInfo();
    return 0;
}