import java.math.BigInteger;
import java.util.*;

public class Aircraft {
	public String nearMiss(int[] p1, int[] v1, int[] p2, int[] v2, int R) {
        BigInteger a = BigInteger.valueOf(p1[0]).subtract(BigInteger.valueOf(p2[0]));
        BigInteger b = BigInteger.valueOf(v1[0]).subtract(BigInteger.valueOf(v2[0]));
        BigInteger c = BigInteger.valueOf(p1[1]).subtract(BigInteger.valueOf(p2[1]));
        BigInteger d = BigInteger.valueOf(v1[1]).subtract(BigInteger.valueOf(v2[1]));
        BigInteger e = BigInteger.valueOf(p1[2]).subtract(BigInteger.valueOf(p2[2]));
        BigInteger f = BigInteger.valueOf(v1[2]).subtract(BigInteger.valueOf(v2[2]));
        BigInteger C = a.multiply(a).add(c.multiply(c)).add(e.multiply(e));
        BigInteger B = a.multiply(b).multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(2).multiply(c).multiply(d)).add(BigInteger.valueOf(2).multiply(e).multiply(f));
        BigInteger A = b.multiply(b).add(d.multiply(d)).add(f.multiply(f));

        if (C.compareTo(BigInteger.valueOf(R).multiply(BigInteger.valueOf(R))) <= 0) return "YES";
        if (A.equals(BigInteger.ZERO)) return "NO";
        if (B.compareTo(BigInteger.ZERO) >=0) return "NO";
        if (BigInteger.valueOf(4).multiply(A).multiply(C).subtract(B.multiply(B)).compareTo(BigInteger.valueOf(R).multiply(BigInteger.valueOf(R).multiply(BigInteger.valueOf(4)).multiply(A))) <= 0) return "YES";
        return "NO";
	}
}
