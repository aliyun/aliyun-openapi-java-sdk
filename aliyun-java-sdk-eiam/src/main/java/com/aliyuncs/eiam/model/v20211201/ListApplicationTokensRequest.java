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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationTokensRequest extends RpcAcsRequest<ListApplicationTokensResponse> {
	   

	private String applicationId;

	private String applicationTokenType;

	private String instanceId;
	public ListApplicationTokensRequest() {
		super("Eiam", "2021-12-01", "ListApplicationTokens", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getApplicationTokenType() {
		return this.applicationTokenType;
	}

	public void setApplicationTokenType(String applicationTokenType) {
		this.applicationTokenType = applicationTokenType;
		if(applicationTokenType != null){
			putQueryParameter("ApplicationTokenType", applicationTokenType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<ListApplicationTokensResponse> getResponseClass() {
		return ListApplicationTokensResponse.class;
	}

}
