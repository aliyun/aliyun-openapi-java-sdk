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
public class DescribeFotaPendingDesktopsRequest extends RpcAcsRequest<DescribeFotaPendingDesktopsResponse> {
	   

	private String officeSiteId;

	private String desktopName;

	private String taskUid;

	private String nextToken;

	private Integer maxResults;

	private String desktopId;
	public DescribeFotaPendingDesktopsRequest() {
		super("ecd", "2020-09-30", "DescribeFotaPendingDesktops", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getDesktopName() {
		return this.desktopName;
	}

	public void setDesktopName(String desktopName) {
		this.desktopName = desktopName;
		if(desktopName != null){
			putQueryParameter("DesktopName", desktopName);
		}
	}

	public String getTaskUid() {
		return this.taskUid;
	}

	public void setTaskUid(String taskUid) {
		this.taskUid = taskUid;
		if(taskUid != null){
			putQueryParameter("TaskUid", taskUid);
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

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	@Override
	public Class<DescribeFotaPendingDesktopsResponse> getResponseClass() {
		return DescribeFotaPendingDesktopsResponse.class;
	}

}
