package state;

import java.util.Scanner;

import state.context.AuthContext;
import state.states.BannedState;
import state.states.GuestState;
import state.states.LoggedOutState;
import state.states.LoggedState;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AuthContext context = new AuthContext();
        GuestState guestState = new GuestState();
        LoggedState loggedState = new LoggedState();
        LoggedOutState loggedOutState = new LoggedOutState();
        BannedState bannedState = new BannedState();

        startSession(context, guestState, loggedState, bannedState, loggedOutState, scanner);

    }

    public static void startSession(AuthContext context, GuestState guestState, LoggedState loggedState, BannedState bannedState, LoggedOutState loggedOutState, Scanner scanner){
        System.out.println(context.getState().toString());
        System.out.println("please write your password(Admin0000):");
        String password = scanner.next();
        if(password.equals("Admin0000")){
            context.setState(loggedState);
            // loggedState.handleAuth(context);
            shouldLogout(context, guestState, loggedState, bannedState, loggedOutState, scanner);
        }
        else{
            context.setState(bannedState);
            // bannedState.handleAuth(context);
        }
    }

    public static void shouldLogout( AuthContext context, GuestState guestState, LoggedState loggedState, BannedState bannedState, LoggedOutState loggedOutState, Scanner scanner){
        System.out.println("Do you want to log out?(Y o N) ");
        String logout = scanner.next();
        if(logout.equals("Y")){           
            context.setState(loggedOutState);
            context.setState(guestState);     
            // loggedOutState.handleAuth(context);
            // guestState.handleAuth(context);
            startSession(context, guestState, loggedState, bannedState, loggedOutState, scanner);
        }
        else{
            System.out.println(context.getState().toString());
        }
    }
    
}
