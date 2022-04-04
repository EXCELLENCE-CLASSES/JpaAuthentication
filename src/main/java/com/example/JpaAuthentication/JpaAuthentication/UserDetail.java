package com.example.JpaAuthentication.JpaAuthentication;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class UserDetail implements UserDetails 
{
    String userName;
	
	String password;
	
	boolean active ;
	
	private List<GrantedAuthority> authorities ;
	
	
	
	UserDetail(Optional<ExcellenceClass> exc) 
	{
		this.userName=exc.get().getUserName();
		this.active=exc.get().isActive();
		this.password=exc.get().getPassword();
		this.authorities=Arrays.stream(exc.get().getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		
	}
	UserDetail(){
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active ;
	}
	
	

}
