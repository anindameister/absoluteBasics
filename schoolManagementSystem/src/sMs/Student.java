package sMs;

/**
 * this class is responsible to keep track of students'
 * id
 * name
 * fees paid
 * fees total
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initialising the values
     * @param id:id for the student :unique
     * @param name: name of the student:unique
     * @param grade:grade of the student
     */
    public Student (int id, String name, int grade){
        /**
         * this.id is the id from the student class which is witten at the top like private int id;
         * this.id=id, the second id mentioned is the id of the argument
         */
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0; //this keyword was not necessary here
        feesTotal=500;

    }
    /**
     * not going to alter student's id or name
     * that's why it is not there as the setId or setName methods
     * setGrade method is used to update the student's grade
     * @param grade would be the new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @param fees, fees that the student paid
     */
//    updateFeesPaid was the original name selected
    public void payFees(int fees){
        feesPaid=feesPaid+fees; //feesPaid+=fees
        /**
         * I want to access the attribute, totalMoneyEarned from School class
         * since this attribute is a private attribute so I have to get hold of the associated setter method
         * the setter method named is changed and kept as updateTotalMoneyEarned
         * in order to access this method, I can create an object of the Class School and then access the method, like Alex Lee
         * or I can just set this method as static, so let's do that
         * attempted to do that and had to change the corresponding attribute to static as well
         * now, instead of creating an object and then accessing the method of the class, am able to directly call the method using the class name
         */
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }
/*
setters are being used so that whatever is not unique can be set
getters are being used to that we are able to work with the returned variable
lastly, setters are used for setting values to a variable and hence it doesn't need to return anything. Whatever is required to be returned is done by the corresponding getters.
 */
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}
