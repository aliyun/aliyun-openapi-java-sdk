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
public class DescribeDesktopOversoldUserRequest extends RpcAcsRequest<DescribeDesktopOversoldUserResponse> {
	   

	private String oversoldGroupId;

	private String clientToken;

	private String userGroupId;

	private String nextToken;

	private Integer maxResults;

	private String endUserId;

	private List<String> userDesktopIdss;
	public DescribeDesktopOversoldUserRequest() {
		super("ecd", "2020-09-30", "DescribeDesktopOversoldUser", "gwsecd");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putQueryParameter("UserGroupId", userGroupId);
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

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public List<String> getUserDesktopIdss() {
		return this.userDesktopIdss;
	}

	public void setUserDesktopIdss(List<String> userDesktopIdss) {
		this.userDesktopIdss = userDesktopIdss;	
		if (userDesktopIdss != null) {
			for (int i = 0; i < userDesktopIdss.size(); i++) {
				putQueryParameter("UserDesktopIds." + (i + 1) , userDesktopIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeDesktopOversoldUserResponse> getResponseClass() {
		return DescribeDesktopOversoldUserResponse.class;
	}

}
