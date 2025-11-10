/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.ArrayList;

public class MessagingService {
    private ArrayList <Message> Lista;
    
    public MessagingService(){
        this.Lista = new ArrayList<>();
    }
    
    public void add(Message message){
        if (message.contentSize()<=280){
            Lista.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return Lista;
    }
}
