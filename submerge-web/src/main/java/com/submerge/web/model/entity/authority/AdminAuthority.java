package com.submerge.web.model.entity.authority;

import com.submerge.web.model.entity.Authorities;

public class AdminAuthority extends Authorities {

	static final long serialVersionUID = -2999316433182978941L;

	public AdminAuthority() {
		super();
		this.id = 1;
		this.name = "ROLE_ADMIN";
	}

}
