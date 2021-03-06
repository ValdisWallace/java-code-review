package main.java.mkutcher.examples;

import java.util.HashMap;
import java.util.Map;

public class ByteMap {

    private static final Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();

    public static byte[] generate(byte[] src) {
        byte[] generated = cache.get(src);
        if (generated == null) {
            synchronized (cache) {
                generated = cache.get(src);
                if (generated == null) {
                    generated = doGenerate(src);
                    cache.put(src, generated);
                }
            }
        }
        return generated;
    }

    private static byte[] doGenerate(byte[] src) {
        // omitted
        return new byte[0];
    }
}
