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
public class DescribeRecordingsRequest extends RpcAcsRequest<DescribeRecordingsResponse> {
	   

	private Boolean needSignedUrl;

	private Integer signedUrlExpireMinutes;

	private String startTime;

	private String nextToken;

	private String desktopId;

	private String endTime;

	private Integer maxResults;

	private String policyGroupId;
	public DescribeRecordingsRequest() {
		super("ecd", "2020-09-30", "DescribeRecordings", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getNeedSignedUrl() {
		return this.needSignedUrl;
	}

	public void setNeedSignedUrl(Boolean needSignedUrl) {
		this.needSignedUrl = needSignedUrl;
		if(needSignedUrl != null){
			putQueryParameter("NeedSignedUrl", needSignedUrl.toString());
		}
	}

	public Integer getSignedUrlExpireMinutes() {
		return this.signedUrlExpireMinutes;
	}

	public void setSignedUrlExpireMinutes(Integer signedUrlExpireMinutes) {
		this.signedUrlExpireMinutes = signedUrlExpireMinutes;
		if(signedUrlExpireMinutes != null){
			putQueryParameter("SignedUrlExpireMinutes", signedUrlExpireMinutes.toString());
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

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
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

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	@Override
	public Class<DescribeRecordingsResponse> getResponseClass() {
		return DescribeRecordingsResponse.class;
	}

}
