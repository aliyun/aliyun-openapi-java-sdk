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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAsrConfigRequest extends RpcAcsRequest<GetAsrConfigResponse> {
	   

	private String entryId;

	private Integer configLevel;
	public GetAsrConfigRequest() {
		super("VoiceNavigator", "2018-06-12", "GetAsrConfig", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
		if(entryId != null){
			putQueryParameter("EntryId", entryId);
		}
	}

	public Integer getConfigLevel() {
		return this.configLevel;
	}

	public void setConfigLevel(Integer configLevel) {
		this.configLevel = configLevel;
		if(configLevel != null){
			putQueryParameter("ConfigLevel", configLevel.toString());
		}
	}

	@Override
	public Class<GetAsrConfigResponse> getResponseClass() {
		return GetAsrConfigResponse.class;
	}

}
