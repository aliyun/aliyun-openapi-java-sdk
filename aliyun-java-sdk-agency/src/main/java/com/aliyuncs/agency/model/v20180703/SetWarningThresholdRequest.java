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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetWarningThresholdRequest extends RpcAcsRequest<SetWarningThresholdResponse> {
	   

	private Long uid;

	private String warningValue;
	public SetWarningThresholdRequest() {
		super("Agency", "2018-07-03", "SetWarningThreshold", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getWarningValue() {
		return this.warningValue;
	}

	public void setWarningValue(String warningValue) {
		this.warningValue = warningValue;
		if(warningValue != null){
			putQueryParameter("WarningValue", warningValue);
		}
	}

	@Override
	public Class<SetWarningThresholdResponse> getResponseClass() {
		return SetWarningThresholdResponse.class;
	}

}
