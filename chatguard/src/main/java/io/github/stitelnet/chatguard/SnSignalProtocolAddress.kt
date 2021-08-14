package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.SignalProtocolAddress

class SnSignalProtocolAddress(name: String?, deviceId: Int) :
    SignalProtocolAddress(name, deviceId) {

    override fun getName(): String {
        return super.getName()
    }

    override fun getDeviceId(): Int {
        return super.getDeviceId()
    }
}