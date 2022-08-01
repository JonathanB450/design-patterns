package state.states;

import state.context.AuthContext;

public class LoggedOutState implements AuthState{

    public String toString(){
        return "Logged out State";
    }

    @Override
    public void handleAuth(AuthContext context) {
        System.out.println("We will miss you :(");
        context.setState(this);
    }    
    
}