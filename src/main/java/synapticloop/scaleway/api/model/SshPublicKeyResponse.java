package synapticloop.scaleway.api.model;

/*
 * Copyright (c) 2016 synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SshPublicKeyResponse {

	@JsonProperty("ssh_public_keys") private List<SshPublicKey> sshPublicKeys;

	public List<SshPublicKey> getSshPublicKeys() {
		return sshPublicKeys;
	}

	public void setSshPublicKeys(List<SshPublicKey> sshPublicKeys) {
		this.sshPublicKeys = sshPublicKeys;
	}

}
