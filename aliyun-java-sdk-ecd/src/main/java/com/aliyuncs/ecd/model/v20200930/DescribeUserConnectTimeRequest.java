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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserConnectTimeRequest extends RpcAcsRequest<DescribeUserConnectTimeResponse> {
	   

	private String userDesktopId;

	private String startTime;

	private String nextToken;

	private String endUserId;

	private String oversoldGroupId;

	private String userGroupId;

	private String endTime;

	private Integer maxResults;
	public DescribeUserConnectTimeRequest() {
		super("ecd", "2020-09-30", "DescribeUserConnectTime", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserDesktopId() {
		return this.userDesktopId;
	}

	public void setUserDesktopId(String userDesktopId) {
		this.userDesktopId = userDesktopId;
		if(userDesktopId != null){
			putQueryParameter("UserDesktopId", userDesktopId);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
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

	public String getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putQueryParameter("UserGroupId", userGroupId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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
	public Class<DescribeUserConnectTimeResponse> getResponseClass() {
		return DescribeUserConnectTimeResponse.class;
	}

}
