/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskInfoHistoryRequest extends RpcAcsRequest<QueryTaskInfoHistoryResponse> {
	
	public QueryTaskInfoHistoryRequest() {
		super("Domain", "2018-01-29", "QueryTaskInfoHistory");
	}

	private Long beginCreateTime;

	private Long endCreateTime;

	private String taskNoCursor;

	private String userClientIp;

	private Integer pageSize;

	private String lang;

	private Long createTimeCursor;

	public Long getBeginCreateTime() {
		return this.beginCreateTime;
	}

	public void setBeginCreateTime(Long beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
		if(beginCreateTime != null){
			putQueryParameter("BeginCreateTime", beginCreateTime.toString());
		}
	}

	public Long getEndCreateTime() {
		return this.endCreateTime;
	}

	public void setEndCreateTime(Long endCreateTime) {
		this.endCreateTime = endCreateTime;
		if(endCreateTime != null){
			putQueryParameter("EndCreateTime", endCreateTime.toString());
		}
	}

	public String getTaskNoCursor() {
		return this.taskNoCursor;
	}

	public void setTaskNoCursor(String taskNoCursor) {
		this.taskNoCursor = taskNoCursor;
		if(taskNoCursor != null){
			putQueryParameter("TaskNoCursor", taskNoCursor);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Long getCreateTimeCursor() {
		return this.createTimeCursor;
	}

	public void setCreateTimeCursor(Long createTimeCursor) {
		this.createTimeCursor = createTimeCursor;
		if(createTimeCursor != null){
			putQueryParameter("CreateTimeCursor", createTimeCursor.toString());
		}
	}

	@Override
	public Class<QueryTaskInfoHistoryResponse> getResponseClass() {
		return QueryTaskInfoHistoryResponse.class;
	}

}
