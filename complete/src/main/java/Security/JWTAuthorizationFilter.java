package Security;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import static Security.SecurityConstants.*;
//
//public class JWTAuthorizationFilter extends BasicAuthenticationFilter{
//
//		private final CustomUserDetailsService customUserDetailsService;
//		public JWTAuthorizationFilter(AuthenticationManager authenticationManager,
//									CustomUserDetailsService customUserDetailsService) {
//			super(authenticationManager);
//			this.customUserDetailsService = customUserDetailsService;
//		}
//		
//		@Override
//		protected void doFilterInternal(HttpServletRequest request,
//										HttpServletResponse response,
//										FilterChain chain)throws IOException, ServletException{
//			String header = request.getHeader(HEADER_STRING);
//			if(header == null || header.startsWith(TOKEN_PREFIX)) {
//				chain.doFilter(request, response);
//				return;
//			}
//			UsernamePasswordAuthenticationToken usernamePasswordAuth = getAuthenticationToken(request);
//			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuth);
//			chain.doFilter(request, response);
//		}
//		
//		private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
//			String token = request.getHeader(HEADER_STRING);
//			if(token == null) return null;
//			String username = Jwts.parser().setSigningKey(SECRET)
//					.parseClaimsJws(token.replace(TOKEN_PREFIX,""))
//					.getBody()
//					.getSubject();
//			return null;
//			
//		}
//}
