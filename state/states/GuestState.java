package state.states;

import state.context.AuthContext;

public class GuestState implements AuthState{

    public String toString(){
        return "Guest State";
    }

    @Override
    public void handleAuth(AuthContext context) {
        System.out.println("Welcome back");
        context.setState(this);
    }    
    
}