package vortexserver;

import com.healthmarketscience.rmiio.RemoteInputStream;
import com.healthmarketscience.rmiio.RemoteInputStreamClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skalitz
 */
public class RemoteFileUploadService {
    public void uploadFile(String fileName, RemoteInputStream remoteFileData) {
        try {
            InputStream fileData = RemoteInputStreamClient.wrap(remoteFileData);
            // ... copy fileData to local storage ...
        } catch (IOException ex) {
            Logger.getLogger(RemoteFileUploadService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
