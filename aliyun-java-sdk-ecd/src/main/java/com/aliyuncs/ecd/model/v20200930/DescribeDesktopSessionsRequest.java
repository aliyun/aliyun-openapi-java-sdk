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
public class DescribeDesktopSessionsRequest extends RpcAcsRequest<DescribeDesktopSessionsResponse> {
	   

	private String officeSiteId;

	private String startTime;

	private Integer pageNumber;

	private String sessionStatus;

	private Integer pageSize;

	private String endUserId;

	private List<String> desktopIds;

	private String desktopName;

	private String endTime;

	private String subPayType;

	private Boolean checkOsSession;
	public DescribeDesktopSessionsRequest() {
		super("ecd", "2020-09-30", "DescribeDesktopSessions", "gwsecd");
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSessionStatus() {
		return this.sessionStatus;
	}

	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
		if(sessionStatus != null){
			putQueryParameter("SessionStatus", sessionStatus);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
			}
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getSubPayType() {
		return this.subPayType;
	}

	public void setSubPayType(String subPayType) {
		this.subPayType = subPayType;
		if(subPayType != null){
			putQueryParameter("SubPayType", subPayType);
		}
	}

	public Boolean getCheckOsSession() {
		return this.checkOsSession;
	}

	public void setCheckOsSession(Boolean checkOsSession) {
		this.checkOsSession = checkOsSession;
		if(checkOsSession != null){
			putQueryParameter("CheckOsSession", checkOsSession.toString());
		}
	}

	@Override
	public Class<DescribeDesktopSessionsResponse> getResponseClass() {
		return DescribeDesktopSessionsResponse.class;
	}

}
