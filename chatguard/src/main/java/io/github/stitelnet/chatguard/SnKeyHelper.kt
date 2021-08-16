package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.util.KeyHelper

object SnKeyHelper  {

    @Throws(InvalidKeyException::class)
    fun generateSignedPreKey(identityKeyPair: SnIdentityKeyPair, signedPreKeyId: Int): SnSignedPreKeyRecord{

        val signedPreKeyRecord =  KeyHelper.generateSignedPreKey(identityKeyPair, signedPreKeyId)
        return SnSignedPreKeyRecord(signedPreKeyRecord.serialize())

    }


    fun generatePreKeys(start: Int, count: Int): List<SnPreKeyRecord>{
        val list = KeyHelper.generatePreKeys(start, count)
        val snList = ArrayList<SnPreKeyRecord>()
        list.forEach {
            snList.add(SnPreKeyRecord(it.serialize()))
        }
        return snList
    }

    fun generateRegistrationId(extendedRange: Boolean): Int{
        return KeyHelper.generateRegistrationId(extendedRange)
    }
}