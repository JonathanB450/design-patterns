package state.context;

import state.states.AuthState;
import state.states.GuestState;

public class AuthContext{
    private AuthState state;

    public AuthContext(){
        this.state = new GuestState();
    }

    public void setState(AuthState state){
        this.state = state;
    }

    public AuthState getState(){
        return this.state;
    }
}