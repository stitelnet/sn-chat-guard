package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.util.KeyHelper

object SnKeyHelper  {

    @Throws(SnInvalidKeyException::class)
    fun generateSignedPreKey(identityKeyPair: SnIdentityKeyPair, signedPreKeyId: Int): SnSignedPreKeyRecord{
        try {
            return KeyHelper.generateSignedPreKey(identityKeyPair, signedPreKeyId) as SnSignedPreKeyRecord
        }
        catch (e: InvalidKeyException){
            throw e
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun generatePreKeys(start: Int, count: Int): List<SnPreKeyRecord>{
        return KeyHelper.generatePreKeys(start, count) as List<SnPreKeyRecord>
    }

    fun generateRegistrationId(extendedRange: Boolean): Int{
        return KeyHelper.generateRegistrationId(extendedRange)
    }
}