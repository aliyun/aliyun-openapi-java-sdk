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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.rdc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetChangeLogRequest extends RpcAcsRequest<GetChangeLogResponse> {
	
	public GetChangeLogRequest() {
		super("Rdc", "2018-08-21", "GetChangeLog");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String targetType;

	private String targetIds;

	private String corpIdentifier;

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putBodyParameter("TargetType", targetType);
		}
	}

	public String getTargetIds() {
		return this.targetIds;
	}

	public void setTargetIds(String targetIds) {
		this.targetIds = targetIds;
		if(targetIds != null){
			putBodyParameter("TargetIds", targetIds);
		}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	@Override
	public Class<GetChangeLogResponse> getResponseClass() {
		return GetChangeLogResponse.class;
	}

}
