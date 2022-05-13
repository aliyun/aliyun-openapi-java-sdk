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
public class DescribeUserConnectionRecordsRequest extends RpcAcsRequest<DescribeUserConnectionRecordsResponse> {
	   

	private Long connectEndTimeFrom;

	private Long connectDurationFrom;

	private Long connectDurationTo;

	private String endUserType;

	private String desktopGroupId;

	private String nextToken;

	private Long connectStartTimeFrom;

	private String endUserId;

	private String desktopId;

	private Long connectEndTimeTo;

	private Long connectStartTimeTo;

	private Integer maxResults;
	public DescribeUserConnectionRecordsRequest() {
		super("ecd", "2020-09-30", "DescribeUserConnectionRecords");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getConnectEndTimeFrom() {
		return this.connectEndTimeFrom;
	}

	public void setConnectEndTimeFrom(Long connectEndTimeFrom) {
		this.connectEndTimeFrom = connectEndTimeFrom;
		if(connectEndTimeFrom != null){
			putQueryParameter("ConnectEndTimeFrom", connectEndTimeFrom.toString());
		}
	}

	public Long getConnectDurationFrom() {
		return this.connectDurationFrom;
	}

	public void setConnectDurationFrom(Long connectDurationFrom) {
		this.connectDurationFrom = connectDurationFrom;
		if(connectDurationFrom != null){
			putQueryParameter("ConnectDurationFrom", connectDurationFrom.toString());
		}
	}

	public Long getConnectDurationTo() {
		return this.connectDurationTo;
	}

	public void setConnectDurationTo(Long connectDurationTo) {
		this.connectDurationTo = connectDurationTo;
		if(connectDurationTo != null){
			putQueryParameter("ConnectDurationTo", connectDurationTo.toString());
		}
	}

	public String getEndUserType() {
		return this.endUserType;
	}

	public void setEndUserType(String endUserType) {
		this.endUserType = endUserType;
		if(endUserType != null){
			putQueryParameter("EndUserType", endUserType);
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
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

	public Long getConnectStartTimeFrom() {
		return this.connectStartTimeFrom;
	}

	public void setConnectStartTimeFrom(Long connectStartTimeFrom) {
		this.connectStartTimeFrom = connectStartTimeFrom;
		if(connectStartTimeFrom != null){
			putQueryParameter("ConnectStartTimeFrom", connectStartTimeFrom.toString());
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

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	public Long getConnectEndTimeTo() {
		return this.connectEndTimeTo;
	}

	public void setConnectEndTimeTo(Long connectEndTimeTo) {
		this.connectEndTimeTo = connectEndTimeTo;
		if(connectEndTimeTo != null){
			putQueryParameter("ConnectEndTimeTo", connectEndTimeTo.toString());
		}
	}

	public Long getConnectStartTimeTo() {
		return this.connectStartTimeTo;
	}

	public void setConnectStartTimeTo(Long connectStartTimeTo) {
		this.connectStartTimeTo = connectStartTimeTo;
		if(connectStartTimeTo != null){
			putQueryParameter("ConnectStartTimeTo", connectStartTimeTo.toString());
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
	public Class<DescribeUserConnectionRecordsResponse> getResponseClass() {
		return DescribeUserConnectionRecordsResponse.class;
	}

}
