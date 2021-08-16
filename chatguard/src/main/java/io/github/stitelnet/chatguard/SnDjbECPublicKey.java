package io.github.stitelnet.chatguard;

import org.whispersystems.libsignal.ecc.Curve;
import org.whispersystems.libsignal.ecc.ECPublicKey;
import org.whispersystems.libsignal.util.ByteUtil;

import java.math.BigInteger;
import java.util.Arrays;

public class SnDjbECPublicKey implements SnECPublicKey {
    private final byte[] publicKey;

    SnDjbECPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public byte[] serialize() {
        byte[] type = {Curve.DJB_TYPE};
        return ByteUtil.combine(type, publicKey);
    }

    @Override
    public int getType() {
        return Curve.DJB_TYPE;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)                      return false;
        if (!(other instanceof SnDjbECPublicKey)) return false;

        SnDjbECPublicKey that = (SnDjbECPublicKey)other;
        return Arrays.equals(this.publicKey, that.publicKey);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(publicKey);
    }

    @Override
    public int compareTo(ECPublicKey another) {
        return new BigInteger(publicKey).compareTo(new BigInteger(((SnDjbECPublicKey)another).publicKey));
    }

    public byte[] getPublicKey() {
        return publicKey;
    }
}
