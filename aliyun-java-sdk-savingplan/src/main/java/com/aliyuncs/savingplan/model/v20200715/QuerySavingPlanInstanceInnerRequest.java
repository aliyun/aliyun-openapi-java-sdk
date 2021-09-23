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

package com.aliyuncs.savingplan.model.v20200715;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingPlanInstanceInnerRequest extends RpcAcsRequest<QuerySavingPlanInstanceInnerResponse> {
	   

	private String fromAppCode;

	private String requestId;

	private Integer pageSize;

	private String instanceFamily;

	private Float endTime;

	private String fromAppName;

	private Integer currentPage;

	private String spnType;

	private Float startTime;

	private String instanceCode;

	private String region;

	private String userId;
	public QuerySavingPlanInstanceInnerRequest() {
		super("savingplan", "2020-07-15", "QuerySavingPlanInstanceInner", "savingplan");
		setMethod(MethodType.POST);
	}

	public String getFromAppCode() {
		return this.fromAppCode;
	}

	public void setFromAppCode(String fromAppCode) {
		this.fromAppCode = fromAppCode;
		if(fromAppCode != null){
			putQueryParameter("FromAppCode", fromAppCode);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
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

	public String getInstanceFamily() {
		return this.instanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		this.instanceFamily = instanceFamily;
		if(instanceFamily != null){
			putQueryParameter("InstanceFamily", instanceFamily);
		}
	}

	public Float getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Float endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getFromAppName() {
		return this.fromAppName;
	}

	public void setFromAppName(String fromAppName) {
		this.fromAppName = fromAppName;
		if(fromAppName != null){
			putQueryParameter("FromAppName", fromAppName);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getSpnType() {
		return this.spnType;
	}

	public void setSpnType(String spnType) {
		this.spnType = spnType;
		if(spnType != null){
			putQueryParameter("SpnType", spnType);
		}
	}

	public Float getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Float startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getInstanceCode() {
		return this.instanceCode;
	}

	public void setInstanceCode(String instanceCode) {
		this.instanceCode = instanceCode;
		if(instanceCode != null){
			putQueryParameter("InstanceCode", instanceCode);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<QuerySavingPlanInstanceInnerResponse> getResponseClass() {
		return QuerySavingPlanInstanceInnerResponse.class;
	}

}
