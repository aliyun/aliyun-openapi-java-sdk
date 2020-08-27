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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCorpMetricsRequest extends RpcAcsRequest<ListCorpMetricsResponse> {
	   

	private String corpId;

	private String endTime;

	private String startTime;

	private String pageNumber;

	private String deviceGroupList;

	private String tagCode;

	private String userGroupList;

	private String pageSize;

	private String deviceIdList;
	public ListCorpMetricsRequest() {
		super("Vcs", "2020-05-15", "ListCorpMetrics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber);
		}
	}

	public String getDeviceGroupList() {
		return this.deviceGroupList;
	}

	public void setDeviceGroupList(String deviceGroupList) {
		this.deviceGroupList = deviceGroupList;
		if(deviceGroupList != null){
			putBodyParameter("DeviceGroupList", deviceGroupList);
		}
	}

	public String getTagCode() {
		return this.tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
		if(tagCode != null){
			putBodyParameter("TagCode", tagCode);
		}
	}

	public String getUserGroupList() {
		return this.userGroupList;
	}

	public void setUserGroupList(String userGroupList) {
		this.userGroupList = userGroupList;
		if(userGroupList != null){
			putBodyParameter("UserGroupList", userGroupList);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getDeviceIdList() {
		return this.deviceIdList;
	}

	public void setDeviceIdList(String deviceIdList) {
		this.deviceIdList = deviceIdList;
		if(deviceIdList != null){
			putBodyParameter("DeviceIdList", deviceIdList);
		}
	}

	@Override
	public Class<ListCorpMetricsResponse> getResponseClass() {
		return ListCorpMetricsResponse.class;
	}

}
