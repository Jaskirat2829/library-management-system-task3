public class user{
    private String name; //each person have its own name and id
    private int userId;

    public user(String name, int userId){
        this.name=name;
        this.userId=userId;
    }//constructor to initialize user object
    public String getName(){
        return name;
    }
    public int getUserId(){
        return userId;
    }

    public String toString(){
       return "UserId:"+userId +", Name:"+name;
    }//toString method to print user information
    //act as a getter for name and userId
}