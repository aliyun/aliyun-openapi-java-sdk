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
public class DescribeDesktopOversoldUserGroupRequest extends RpcAcsRequest<DescribeDesktopOversoldUserGroupResponse> {
	   

	private String oversoldGroupId;

	private List<String> userGroupIdss;

	private String nextToken;

	private Integer maxResults;
	public DescribeDesktopOversoldUserGroupRequest() {
		super("ecd", "2020-09-30", "DescribeDesktopOversoldUserGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOversoldGroupId() {
		return this.oversoldGroupId;
	}

	public void setOversoldGroupId(String oversoldGroupId) {
		this.oversoldGroupId = oversoldGroupId;
		if(oversoldGroupId != null){
			putQueryParameter("OversoldGroupId", oversoldGroupId);
		}
	}

	public List<String> getUserGroupIdss() {
		return this.userGroupIdss;
	}

	public void setUserGroupIdss(List<String> userGroupIdss) {
		this.userGroupIdss = userGroupIdss;	
		if (userGroupIdss != null) {
			for (int i = 0; i < userGroupIdss.size(); i++) {
				putQueryParameter("UserGroupIds." + (i + 1) , userGroupIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeDesktopOversoldUserGroupResponse> getResponseClass() {
		return DescribeDesktopOversoldUserGroupResponse.class;
	}

}
