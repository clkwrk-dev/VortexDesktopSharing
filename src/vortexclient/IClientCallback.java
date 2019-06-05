/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vortexclient;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Skalitz
 */
public interface IClientCallback extends Remote {
    public void receiveFile(byte[] mydata, String clientpath, int length) throws RemoteException;
}
