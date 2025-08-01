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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListPolicyGroupsRequest extends RpcAcsRequest<ListPolicyGroupsResponse> {
	   

	private String policyGroupName;

	private String policyType;

	private List<String> policyGroupIdss;

	private String nextToken;

	private Integer maxResults;
	public ListPolicyGroupsRequest() {
		super("eds-aic", "2023-09-30", "ListPolicyGroups");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPolicyGroupName() {
		return this.policyGroupName;
	}

	public void setPolicyGroupName(String policyGroupName) {
		this.policyGroupName = policyGroupName;
		if(policyGroupName != null){
			putBodyParameter("PolicyGroupName", policyGroupName);
		}
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putBodyParameter("PolicyType", policyType);
		}
	}

	public List<String> getPolicyGroupIdss() {
		return this.policyGroupIdss;
	}

	public void setPolicyGroupIdss(List<String> policyGroupIdss) {
		this.policyGroupIdss = policyGroupIdss;	
		if (policyGroupIdss != null) {
			for (int i = 0; i < policyGroupIdss.size(); i++) {
				putBodyParameter("PolicyGroupIds." + (i + 1) , policyGroupIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListPolicyGroupsResponse> getResponseClass() {
		return ListPolicyGroupsResponse.class;
	}

}
