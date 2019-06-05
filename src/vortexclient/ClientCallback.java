/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vortexclient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 *
 * @author Skalitz
 */
public class ClientCallback implements IClientCallback {

    @Override
    public void receiveFile(byte[] mydata, String fileName, int length) throws RemoteException {
        try {
            String pathFiles = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "Vortex" + File.separator + "Files" + File.separator + fileName;
            File clientPathFile = new File(pathFiles);
            clientPathFile.getParentFile().mkdirs();
            try (FileOutputStream out = new FileOutputStream(clientPathFile)) {
                byte [] data = mydata;
                out.write(data);
                out.flush();
                System.out.println("DEBUG-CLIENT: Done writing data...");
            }
	 
        } catch (IOException e) {
	}
    }
    
}
