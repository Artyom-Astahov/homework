package by.artem.apigateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtUtil {
    public static String SECRET = "pQN8CB1Zt4kVWOasraPwC+CLGl/Du+eENX+jalUzGaQ=";

    public void validateToken(final String token){
        Jwts.parser().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }

    private Key getSignKey(){
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
