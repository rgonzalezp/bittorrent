package tests;

import utils.MessageBuilder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Parses client to client messages.
 */
public class MessageParser {

    private static int byteToInt(byte[] bytes) {
        return ByteBuffer.wrap(bytes).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static MessageBuilder.MessageId getMessageId(byte[] message) {
        byte[] messageId = new byte[MessageBuilder.intByteLength];
        System.arraycopy(message, 0, messageId, 0, MessageBuilder.intByteLength);
        return MessageBuilder.MessageId.values()[byteToInt(messageId)];
    }
}
