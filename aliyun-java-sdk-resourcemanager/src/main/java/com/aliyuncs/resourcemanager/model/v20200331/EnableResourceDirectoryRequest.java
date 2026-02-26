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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableResourceDirectoryRequest extends RpcAcsRequest<EnableResourceDirectoryResponse> {
	   

	private String enableMode;

	private String mASecureMobilePhone;

	private String mAName;

	private String verificationCode;
	public EnableResourceDirectoryRequest() {
		super("ResourceManager", "2020-03-31", "EnableResourceDirectory", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEnableMode() {
		return this.enableMode;
	}

	public void setEnableMode(String enableMode) {
		this.enableMode = enableMode;
		if(enableMode != null){
			putQueryParameter("EnableMode", enableMode);
		}
	}

	public String getMASecureMobilePhone() {
		return this.mASecureMobilePhone;
	}

	public void setMASecureMobilePhone(String mASecureMobilePhone) {
		this.mASecureMobilePhone = mASecureMobilePhone;
		if(mASecureMobilePhone != null){
			putQueryParameter("MASecureMobilePhone", mASecureMobilePhone);
		}
	}

	public String getMAName() {
		return this.mAName;
	}

	public void setMAName(String mAName) {
		this.mAName = mAName;
		if(mAName != null){
			putQueryParameter("MAName", mAName);
		}
	}

	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
		if(verificationCode != null){
			putQueryParameter("VerificationCode", verificationCode);
		}
	}

	@Override
	public Class<EnableResourceDirectoryResponse> getResponseClass() {
		return EnableResourceDirectoryResponse.class;
	}

}
