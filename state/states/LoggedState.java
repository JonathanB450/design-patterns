package state.states;

import state.context.AuthContext;

public class LoggedState implements AuthState{

    public String toString(){
        return "Logged State";
    }

    @Override
    public void handleAuth(AuthContext context) {
        System.out.println("Welcome back! :)");
        context.setState(this);
    }    
    
}