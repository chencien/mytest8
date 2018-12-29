package com.itheima;

public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    //覆盖Object里的hashCode方法
    @Override
    public int hashCode() {
        return userName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof User)){
            return false;
        }
        User user = (User)obj;
//如果名字相同，则表示属于同一个对象。
        if (user.getUserName().equals(this.getUserName())){
            return true;
        }else{
            return false;
        }

    }
}
