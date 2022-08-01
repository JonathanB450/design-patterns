package state.states;

import state.context.AuthContext;

public interface AuthState {
    public void handleAuth(AuthContext context);
}
