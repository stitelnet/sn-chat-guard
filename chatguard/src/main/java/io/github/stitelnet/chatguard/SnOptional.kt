package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.protocol.PreKeySignalMessage

object SnOptional {
    data class OptionalPreKeyId(var isPresent: Boolean, var preKeyId: Int)

    fun getOptionalPreKeyId(ciphertextMessage: SnCiphertextMessage): OptionalPreKeyId{
            val optionalPreKeyId = (ciphertextMessage as PreKeySignalMessage).getPreKeyId()
            return OptionalPreKeyId(optionalPreKeyId.isPresent, optionalPreKeyId.get())
        }
}