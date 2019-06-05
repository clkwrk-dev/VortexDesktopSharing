/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vortexserver;
import java.rmi.*;
import vortexclient.IClientCallback;
/**
 *
 * @author Skalitz
 */
public interface IRMIServer extends Remote {
    public byte[] getVideo() throws RemoteException;
    public void uploadFileToServer(byte[] mydata, String fileName, int length) throws RemoteException;
    public void registerClient(String id, IClientCallback client) throws RemoteException;
    public void unregisterClient(String id) throws RemoteException;
}

