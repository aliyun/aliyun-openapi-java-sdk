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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAclEntriesRequest extends RpcAcsRequest<ModifyAclEntriesResponse> {
	   

	private List<String> sourceIds;

	private String sourceType;

	private String policy;
	public ModifyAclEntriesRequest() {
		super("ecd", "2020-09-30", "ModifyAclEntries", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSourceIds() {
		return this.sourceIds;
	}

	public void setSourceIds(List<String> sourceIds) {
		this.sourceIds = sourceIds;	
		if (sourceIds != null) {
			for (int i = 0; i < sourceIds.size(); i++) {
				putQueryParameter("SourceId." + (i + 1) , sourceIds.get(i));
			}
		}	
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	@Override
	public Class<ModifyAclEntriesResponse> getResponseClass() {
		return ModifyAclEntriesResponse.class;
	}

}
