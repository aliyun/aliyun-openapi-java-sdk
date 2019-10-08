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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateKeyRequest extends RpcAcsRequest<CreateKeyResponse> {
	   

	private String protectionLevel;

	private String keyUsage;

	private String origin;

	private String description;

	private String rotationInterval;

	private Boolean enableAutomaticRotation;
	public CreateKeyRequest() {
		super("Kms", "2016-01-20", "CreateKey", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProtectionLevel() {
		return this.protectionLevel;
	}

	public void setProtectionLevel(String protectionLevel) {
		this.protectionLevel = protectionLevel;
		if(protectionLevel != null){
			putQueryParameter("ProtectionLevel", protectionLevel);
		}
	}

	public String getKeyUsage() {
		return this.keyUsage;
	}

	public void setKeyUsage(String keyUsage) {
		this.keyUsage = keyUsage;
		if(keyUsage != null){
			putQueryParameter("KeyUsage", keyUsage);
		}
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
		if(origin != null){
			putQueryParameter("Origin", origin);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRotationInterval() {
		return this.rotationInterval;
	}

	public void setRotationInterval(String rotationInterval) {
		this.rotationInterval = rotationInterval;
		if(rotationInterval != null){
			putQueryParameter("RotationInterval", rotationInterval);
		}
	}

	public Boolean getEnableAutomaticRotation() {
		return this.enableAutomaticRotation;
	}

	public void setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
		this.enableAutomaticRotation = enableAutomaticRotation;
		if(enableAutomaticRotation != null){
			putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation.toString());
		}
	}

	@Override
	public Class<CreateKeyResponse> getResponseClass() {
		return CreateKeyResponse.class;
	}

}
