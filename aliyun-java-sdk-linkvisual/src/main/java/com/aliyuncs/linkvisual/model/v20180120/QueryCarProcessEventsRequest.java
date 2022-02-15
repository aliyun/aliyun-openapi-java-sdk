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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCarProcessEventsRequest extends RpcAcsRequest<QueryCarProcessEventsResponse> {
	   

	private Integer actionType;

	private String subProductKey;

	private String plateNo;

	private String subDeviceName;

	private String iotInstanceId;

	private Integer pageSize;

	private Long endTime;

	private Long beginTime;

	private Integer currentPage;

	private Integer areaIndex;

	private String subIotId;
	public QueryCarProcessEventsRequest() {
		super("Linkvisual", "2018-01-20", "QueryCarProcessEvents", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getActionType() {
		return this.actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType.toString());
		}
	}

	public String getSubProductKey() {
		return this.subProductKey;
	}

	public void setSubProductKey(String subProductKey) {
		this.subProductKey = subProductKey;
		if(subProductKey != null){
			putQueryParameter("SubProductKey", subProductKey);
		}
	}

	public String getPlateNo() {
		return this.plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
		if(plateNo != null){
			putQueryParameter("PlateNo", plateNo);
		}
	}

	public String getSubDeviceName() {
		return this.subDeviceName;
	}

	public void setSubDeviceName(String subDeviceName) {
		this.subDeviceName = subDeviceName;
		if(subDeviceName != null){
			putQueryParameter("SubDeviceName", subDeviceName);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
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

	public Integer getAreaIndex() {
		return this.areaIndex;
	}

	public void setAreaIndex(Integer areaIndex) {
		this.areaIndex = areaIndex;
		if(areaIndex != null){
			putQueryParameter("AreaIndex", areaIndex.toString());
		}
	}

	public String getSubIotId() {
		return this.subIotId;
	}

	public void setSubIotId(String subIotId) {
		this.subIotId = subIotId;
		if(subIotId != null){
			putQueryParameter("SubIotId", subIotId);
		}
	}

	@Override
	public Class<QueryCarProcessEventsResponse> getResponseClass() {
		return QueryCarProcessEventsResponse.class;
	}

}
