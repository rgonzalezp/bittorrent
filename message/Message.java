package message;

/**
 * Harvey Xia.
 */
public class Message {
    private MessageID messageID;
    private int pieceIndex;
    private String filename;
    private Request request;
    private Piece piece;
    private Bitfield bitfield;

    public enum MessageID {
        INTERESTED_ID, NOT_INTERESTED_ID, HAVE_ID, REQUEST_ID, PIECE_ID, BITFIELD_ID, HANDSHAKE_ID, CHOKE_ID
    }

    // CHOKED, INTERESTED, NOT_INTERESTED
    public Message(MessageID messageID) {
        this.messageID = messageID;
    }

    // HANDSHAKE
    public Message(MessageID messageID, String filename) {
        this.messageID = messageID;
        this.filename = filename;
    }

    // HAVE
    public Message(MessageID messageID, int pieceIndex) {
        this.messageID = messageID;
        this.pieceIndex = pieceIndex;
    }

    // BITFIELD
    public Message(MessageID messageID, Bitfield bitfield) {
        this.messageID = messageID;
        this.bitfield = bitfield;
    }

    // PIECE
    public Message(MessageID messageID, Piece piece) {
        this.messageID = messageID;
        this.piece = piece;
    }

    // REQUEST
    public Message(MessageID messageID, Request request) {
        this.messageID = messageID;
        this.request = request;
    }

    public int getPieceIndex() {
        return pieceIndex;
    }

    public String getFilename() {
        return filename;
    }

    public Request getRequest() {
        return request;
    }

    public Piece getPiece() {
        return piece;
    }

    public Bitfield getBitfield() {
        return bitfield;
    }
}
