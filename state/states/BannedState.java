package state.states;

import state.context.AuthContext;

public class BannedState implements AuthState{

    public String toString(){
        return "banned State";
    }

    @Override
    public void handleAuth(AuthContext context) {
        System.out.println("Wrong password, you have been banned :(");
        context.setState(this);
    }    
    
}