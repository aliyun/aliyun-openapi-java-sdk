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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateInspectItemThresholdParamSettingRequest extends RpcAcsRequest<UpdateInspectItemThresholdParamSettingResponse> {
	   

	private Long associateUid;

	private String data;

	private String clientToken;

	private String token;

	private String inspectCode;
	public UpdateInspectItemThresholdParamSettingRequest() {
		super("Advisor-Share", "2018-06-08", "UpdateInspectItemThresholdParamSetting", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getAssociateUid() {
		return this.associateUid;
	}

	public void setAssociateUid(Long associateUid) {
		this.associateUid = associateUid;
		if(associateUid != null){
			putQueryParameter("AssociateUid", associateUid.toString());
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getInspectCode() {
		return this.inspectCode;
	}

	public void setInspectCode(String inspectCode) {
		this.inspectCode = inspectCode;
		if(inspectCode != null){
			putQueryParameter("InspectCode", inspectCode);
		}
	}

	@Override
	public Class<UpdateInspectItemThresholdParamSettingResponse> getResponseClass() {
		return UpdateInspectItemThresholdParamSettingResponse.class;
	}

}
