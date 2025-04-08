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
       
       //parameterized constructor  (parameters inside braces)
       Teacher(string name, string subject, string dept, double salary){

        this->name = name;
        this->subject = subject;
        this->dept = dept;
        this->salary = salary;
       }

       //Copy Constructor
       //Custom Copy Constructor
       Teacher(Teacher &orgObj){//pass by reference
        cout<<"I'm custom copy constructor"<<endl;
        this->name = orgObj.name;
        this->subject = orgObj.subject;
        this->dept = orgObj.dept;
        this->salary = orgObj.salary;       
       }

       void getInfo(){
        cout<<"name: "<<name<<endl;
        cout<<"subject: "<<subject<<endl;
        cout<<"dept: "<<dept<<endl;
        cout<<"salary: "<<salary<<endl;
       }
    
};

int main(){
    Teacher t1("Abhya", "OOPM", "Computer Science", 20000);
    Teacher t2(t1);
    t2.getInfo();
    return 0;
}