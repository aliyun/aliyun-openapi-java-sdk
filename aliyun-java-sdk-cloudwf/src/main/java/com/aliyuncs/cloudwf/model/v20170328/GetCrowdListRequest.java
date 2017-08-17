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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCrowdListRequest extends RpcAcsRequest<GetCrowdListResponse> {
	
	public GetCrowdListRequest() {
		super("cloudwf", "2017-03-28", "GetCrowdList");
	}

	private Long gsid;

	private Integer classType;

	private String gsType;

	private String endTime;

	private Integer page;

	private String startTime;

	private Integer per;

	public Long getGsid() {
		return this.gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
		if(gsid != null){
			putQueryParameter("Gsid", gsid.toString());
		}
	}

	public Integer getClassType() {
		return this.classType;
	}

	public void setClassType(Integer classType) {
		this.classType = classType;
		if(classType != null){
			putQueryParameter("ClassType", classType.toString());
		}
	}

	public String getGsType() {
		return this.gsType;
	}

	public void setGsType(String gsType) {
		this.gsType = gsType;
		if(gsType != null){
			putQueryParameter("GsType", gsType);
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

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
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

	public Integer getPer() {
		return this.per;
	}

	public void setPer(Integer per) {
		this.per = per;
		if(per != null){
			putQueryParameter("Per", per.toString());
		}
	}

	@Override
	public Class<GetCrowdListResponse> getResponseClass() {
		return GetCrowdListResponse.class;
	}

}
