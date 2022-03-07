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
public class BatchCreateSandBoxWhileListRequest extends RpcAcsRequest<BatchCreateSandBoxWhileListResponse> {
	   

	private String whiteListJson;
	public BatchCreateSandBoxWhileListRequest() {
		super("VoiceNavigator", "2018-06-12", "BatchCreateSandBoxWhileList", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWhiteListJson() {
		return this.whiteListJson;
	}

	public void setWhiteListJson(String whiteListJson) {
		this.whiteListJson = whiteListJson;
		if(whiteListJson != null){
			putQueryParameter("WhiteListJson", whiteListJson);
		}
	}

	@Override
	public Class<BatchCreateSandBoxWhileListResponse> getResponseClass() {
		return BatchCreateSandBoxWhileListResponse.class;
	}

}
