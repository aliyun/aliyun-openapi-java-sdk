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
public class ProfileTagRequest extends RpcAcsRequest<ProfileTagResponse> {
	
	public ProfileTagRequest() {
		super("cloudwf", "2017-03-28", "ProfileTag");
	}

	private Long idtype;

	private String beginDate;

	private String endDate;

	private Integer appType;

	private String tag;

	private Long agsid;

	private Integer areaNumber;

	public Long getIdtype() {
		return this.idtype;
	}

	public void setIdtype(Long idtype) {
		this.idtype = idtype;
		if(idtype != null){
			putQueryParameter("Idtype", idtype.toString());
		}
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putQueryParameter("BeginDate", beginDate);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public Integer getAppType() {
		return this.appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public Long getAgsid() {
		return this.agsid;
	}

	public void setAgsid(Long agsid) {
		this.agsid = agsid;
		if(agsid != null){
			putQueryParameter("Agsid", agsid.toString());
		}
	}

	public Integer getAreaNumber() {
		return this.areaNumber;
	}

	public void setAreaNumber(Integer areaNumber) {
		this.areaNumber = areaNumber;
		if(areaNumber != null){
			putQueryParameter("AreaNumber", areaNumber.toString());
		}
	}

	@Override
	public Class<ProfileTagResponse> getResponseClass() {
		return ProfileTagResponse.class;
	}

}
