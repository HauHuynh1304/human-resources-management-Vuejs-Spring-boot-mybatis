package com.company.hrsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.company.hrsystem.commons.configs.SystemProperties;
import com.company.hrsystem.commons.exceptions.UsernameNotFoundException;
import com.company.hrsystem.commons.utils.MessageUtil;
import com.company.hrsystem.dto.AuthenAccountDto;
import com.company.hrsystem.mapper.SystemAccountMapper;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

	@Autowired
	private SystemAccountMapper systemAccountMapper;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AuthenAccountDto accountModel = systemAccountMapper.findAuthenAccountByEmail(email);
		if (ObjectUtils.isEmpty(accountModel)) {
			throw new UsernameNotFoundException(SystemProperties.SYSTEM_NAME, SystemProperties.SYSTEM_VERSION,
					MessageUtil.getMessagelangUS("user.login.err"));
		}
		return UserDetailsImpl.build(accountModel);
	}

}
