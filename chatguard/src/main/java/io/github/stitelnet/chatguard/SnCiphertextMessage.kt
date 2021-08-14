package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.protocol.CiphertextMessage

interface SnCiphertextMessage : CiphertextMessage{
    fun snSerialize(): ByteArray {
        return serialize()
    }

    fun snGetType(): Int {
        return type
    }
}