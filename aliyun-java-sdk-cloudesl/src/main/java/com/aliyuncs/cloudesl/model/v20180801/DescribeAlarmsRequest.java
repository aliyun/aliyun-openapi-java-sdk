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

package com.aliyuncs.cloudesl.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmsRequest extends RpcAcsRequest<DescribeAlarmsResponse> {
	
	public DescribeAlarmsRequest() {
		super("cloudesl", "2018-08-01", "DescribeAlarms");
	}

	private String errorType;

	private String toAlarmTime;

	private String alarmType;

	private String fromAlarmTime;

	private String alarmId;

	private Integer pageSize;

	private String storeId;

	private Integer pageNumber;

	private String alarmStatus;

	public String getErrorType() {
		return this.errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
		if(errorType != null){
			putQueryParameter("ErrorType", errorType);
		}
	}

	public String getToAlarmTime() {
		return this.toAlarmTime;
	}

	public void setToAlarmTime(String toAlarmTime) {
		this.toAlarmTime = toAlarmTime;
		if(toAlarmTime != null){
			putQueryParameter("ToAlarmTime", toAlarmTime);
		}
	}

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
		if(alarmType != null){
			putQueryParameter("AlarmType", alarmType);
		}
	}

	public String getFromAlarmTime() {
		return this.fromAlarmTime;
	}

	public void setFromAlarmTime(String fromAlarmTime) {
		this.fromAlarmTime = fromAlarmTime;
		if(fromAlarmTime != null){
			putQueryParameter("FromAlarmTime", fromAlarmTime);
		}
	}

	public String getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
		if(alarmId != null){
			putQueryParameter("AlarmId", alarmId);
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

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putQueryParameter("StoreId", storeId);
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

	public String getAlarmStatus() {
		return this.alarmStatus;
	}

	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
		if(alarmStatus != null){
			putQueryParameter("AlarmStatus", alarmStatus);
		}
	}

	@Override
	public Class<DescribeAlarmsResponse> getResponseClass() {
		return DescribeAlarmsResponse.class;
	}

}
