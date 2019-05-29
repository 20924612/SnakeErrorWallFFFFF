
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author victor
 */
public class Config implements Serializable {
    private String playerName;
    private int level;
    
    private static Config instance = null;
    
    private Config() {
        playerName = "NoName";
        level = 0;
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(
                    new FileInputStream("config.dat"));
            Config readInstance = (Config) input.readObject();
            playerName = readInstance.getPlayerName();
            level = readInstance.getLevel();
        } catch (IOException ex) {
            // Do nothing.
        } catch (ClassNotFoundException ex) {
            // Do nothing
        } finally{
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                }
                
            }
        }
    }
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
        save();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        save();
    }

    public int getDeltaTime() {
        switch (level) {
            case 0: return 500;
            case 1: return 200;
            case 2: return 100;
            case 3: return 40;
        }
        return 500;
    }
    
    public void save() {
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream( 
                    new FileOutputStream("config.dat"));
            output.writeObject(this);
        } catch (IOException ex) {
            
        } finally{
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex) {
                }
                
            }
        }
        
                
    }
    
}
