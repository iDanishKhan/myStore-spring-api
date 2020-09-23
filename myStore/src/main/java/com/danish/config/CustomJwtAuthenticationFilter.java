package com.danish.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CustomJwtAuthenticationFilter extends OncePerRequestFilter
{
	
	@Autowired
	private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
			
			String jwtToken = extractJwtFromRequest(request);
			
			if(StringUtils.hasLength(jwtToken) && jwtUtil.validateToken(jwtToken))
			{
				UserDetails userDetails = new User(jwtUtil.getUserNameFromToken(jwtToken), 
						"", jwtUtil.getRolesFromToken(jwtToken));
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
						new UsernamePasswordAuthenticationToken(userDetails,
								"",jwtUtil.getRolesFromToken(jwtToken));
				
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
			else {
				System.out.print("Cannot set Security Context");
			}
		filterChain.doFilter(request, response);
	}

	private String extractJwtFromRequest(HttpServletRequest request) {
			String bearerToken = request.getHeader("Authorization");
			if(StringUtils.hasLength(bearerToken) && bearerToken.startsWith("Bearer "))
			{
				return bearerToken.substring(7,bearerToken.length());
			}
		return null;
	}

}
