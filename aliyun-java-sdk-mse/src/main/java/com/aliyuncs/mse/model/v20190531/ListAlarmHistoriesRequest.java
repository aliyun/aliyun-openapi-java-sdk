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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmHistoriesRequest extends RpcAcsRequest<ListAlarmHistoriesResponse> {
	   

	private Long endTime;

	private String alarmMseType;

	private Long startTime;

	private Integer pageNum;

	private String requestPars;

	private Integer pageSize;

	private String alarmName;
	public ListAlarmHistoriesRequest() {
		super("mse", "2019-05-31", "ListAlarmHistories", "mse");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAlarmMseType() {
		return this.alarmMseType;
	}

	public void setAlarmMseType(String alarmMseType) {
		this.alarmMseType = alarmMseType;
		if(alarmMseType != null){
			putQueryParameter("AlarmMseType", alarmMseType);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
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

	public String getAlarmName() {
		return this.alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
		if(alarmName != null){
			putQueryParameter("AlarmName", alarmName);
		}
	}

	@Override
	public Class<ListAlarmHistoriesResponse> getResponseClass() {
		return ListAlarmHistoriesResponse.class;
	}

}
