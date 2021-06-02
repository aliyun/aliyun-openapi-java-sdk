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
public class SetDeletionProtectionRequest extends RpcAcsRequest<SetDeletionProtectionResponse> {
	   

	private Boolean enableDeletionProtection;

	private String protectedResourceArn;

	private String deletionProtectionDescription;
	public SetDeletionProtectionRequest() {
		super("Kms", "2016-01-20", "SetDeletionProtection", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEnableDeletionProtection() {
		return this.enableDeletionProtection;
	}

	public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
		this.enableDeletionProtection = enableDeletionProtection;
		if(enableDeletionProtection != null){
			putQueryParameter("EnableDeletionProtection", enableDeletionProtection.toString());
		}
	}

	public String getProtectedResourceArn() {
		return this.protectedResourceArn;
	}

	public void setProtectedResourceArn(String protectedResourceArn) {
		this.protectedResourceArn = protectedResourceArn;
		if(protectedResourceArn != null){
			putQueryParameter("ProtectedResourceArn", protectedResourceArn);
		}
	}

	public String getDeletionProtectionDescription() {
		return this.deletionProtectionDescription;
	}

	public void setDeletionProtectionDescription(String deletionProtectionDescription) {
		this.deletionProtectionDescription = deletionProtectionDescription;
		if(deletionProtectionDescription != null){
			putQueryParameter("DeletionProtectionDescription", deletionProtectionDescription);
		}
	}

	@Override
	public Class<SetDeletionProtectionResponse> getResponseClass() {
		return SetDeletionProtectionResponse.class;
	}

}
