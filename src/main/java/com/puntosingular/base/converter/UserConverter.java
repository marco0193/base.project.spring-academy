package com.puntosingular.base.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;

@Component("UserConverter")
public class UserConverter {

	public UserDTO usertoUserDTO(User user) {
		if(user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreatData(user.getCreatData());
			userDTO.setStatus(user.isStatus());
			userDTO.setRoles(user.getRoles());
			return userDTO;
		}
		 return null;
	}
	
	public User userDTOtoUser(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setLastname(userDTO.getLastname());
		user.setCreatData(userDTO.getCreatData());
		user.setStatus(userDTO.isStatus());
		user.setRoles(userDTO.getRoles());
		return user;
	}
	
	public List<UserDTO> userstoUsersDTO(Iterable<User> users){
		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		
		for(User user: users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreatData(user.getCreatData());
			userDTO.setStatus(user.isStatus());
			userDTO.setRoles(user.getRoles());
			usersDTO.add(userDTO);
		}
		
		return usersDTO;
	}
}