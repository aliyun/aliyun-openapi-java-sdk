/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveLinkeBahamutBuildconfigregistryRequest extends RpcAcsRequest<RemoveLinkeBahamutBuildconfigregistryResponse> {
	   

	private String host;

	private List<String> secretKeysRepeatLists;

	private String token;

	private String user;
	public RemoveLinkeBahamutBuildconfigregistryRequest() {
		super("SOFA", "2019-08-15", "RemoveLinkeBahamutBuildconfigregistry", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putBodyParameter("Host", host);
		}
	}

	public List<String> getSecretKeysRepeatLists() {
		return this.secretKeysRepeatLists;
	}

	public void setSecretKeysRepeatLists(List<String> secretKeysRepeatLists) {
		this.secretKeysRepeatLists = secretKeysRepeatLists;	
		if (secretKeysRepeatLists != null) {
			for (int i = 0; i < secretKeysRepeatLists.size(); i++) {
				putBodyParameter("SecretKeysRepeatList." + (i + 1) , secretKeysRepeatLists.get(i));
			}
		}	
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putBodyParameter("User", user);
		}
	}

	@Override
	public Class<RemoveLinkeBahamutBuildconfigregistryResponse> getResponseClass() {
		return RemoveLinkeBahamutBuildconfigregistryResponse.class;
	}

}
