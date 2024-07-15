public class Output extends Object {
    private Student [] array; //field

    public Output(Student[] array) {
        this.array = array;
    }
    void output(){
        for(Student std : this.array){
            System.out.println(std); // std.toString
        }
    }
}
