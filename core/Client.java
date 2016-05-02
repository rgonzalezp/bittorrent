package core;

import utils.DataFile;

import java.net.Inet4Address;
import java.util.HashMap;

/**
 * Bittorrent client.
 */
public class Client {

    private HashMap<Inet4Address, ConnectionState> peers;

    public Client() {
        this.peers = new HashMap<>();
    }

    public static void main(String[] argv) {
    }

    public void listen() {
        // TODO: start server socket thread listening for peer connections
    }

    public Inet4Address[] getPeers() {
        // TODO: get peer list from tracker
        return new Inet4Address[0];
    }

    public void connectPeer(Inet4Address peer) {
        // TODO: setup TCP connection with peer
        // TODO: send desired filename
    }

    public void sendHave(Inet4Address peer) {
    }

    public void sendChoke(Inet4Address peer) {
    }

    public void sendUnchoke(Inet4Address peer) {
    }

    public void sendInterested(Inet4Address peer) {
    }

    public void sendUninterested(Inet4Address peer) {
    }

    // TODO: implementing keep-alive messages?
    public void sendKeepAlive(Inet4Address peer) {
    }

    public void sendRequest(Inet4Address peer, int index, int begin, int length) {
    }

    public void sendPiece(Inet4Address peer, DataFile file, int index, int begin, int length) {
    }

    // TODO: do we need this if not implementing end-game behavior?
    public void sendCancel(Inet4Address peer) {
    }
}