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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResetMainPasswordRequest extends RpcAcsRequest<ResetMainPasswordResponse> {
	   

	private String externalUid;

	private String initPassword;

	private String externalAliyunUid;

	private Boolean useRandomPassword;

	private Boolean enableKMS;

	private String externalBizAliyunUid;
	public ResetMainPasswordRequest() {
		super("openanalytics-open", "2018-06-19", "ResetMainPassword", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExternalUid() {
		return this.externalUid;
	}

	public void setExternalUid(String externalUid) {
		this.externalUid = externalUid;
		if(externalUid != null){
			putBodyParameter("ExternalUid", externalUid);
		}
	}

	public String getInitPassword() {
		return this.initPassword;
	}

	public void setInitPassword(String initPassword) {
		this.initPassword = initPassword;
		if(initPassword != null){
			putBodyParameter("InitPassword", initPassword);
		}
	}

	public String getExternalAliyunUid() {
		return this.externalAliyunUid;
	}

	public void setExternalAliyunUid(String externalAliyunUid) {
		this.externalAliyunUid = externalAliyunUid;
		if(externalAliyunUid != null){
			putBodyParameter("ExternalAliyunUid", externalAliyunUid);
		}
	}

	public Boolean getUseRandomPassword() {
		return this.useRandomPassword;
	}

	public void setUseRandomPassword(Boolean useRandomPassword) {
		this.useRandomPassword = useRandomPassword;
		if(useRandomPassword != null){
			putBodyParameter("UseRandomPassword", useRandomPassword.toString());
		}
	}

	public Boolean getEnableKMS() {
		return this.enableKMS;
	}

	public void setEnableKMS(Boolean enableKMS) {
		this.enableKMS = enableKMS;
		if(enableKMS != null){
			putBodyParameter("EnableKMS", enableKMS.toString());
		}
	}

	public String getExternalBizAliyunUid() {
		return this.externalBizAliyunUid;
	}

	public void setExternalBizAliyunUid(String externalBizAliyunUid) {
		this.externalBizAliyunUid = externalBizAliyunUid;
		if(externalBizAliyunUid != null){
			putBodyParameter("ExternalBizAliyunUid", externalBizAliyunUid);
		}
	}

	@Override
	public Class<ResetMainPasswordResponse> getResponseClass() {
		return ResetMainPasswordResponse.class;
	}

}
