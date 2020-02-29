package com.rubypaper.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

public enum Role {
	ROLE_ADMIN, ROLE_MANAGER, ROLE_MEMBER

}
