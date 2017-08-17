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
public class ProfileHistoryListRequest extends RpcAcsRequest<ProfileHistoryListResponse> {
	
	public ProfileHistoryListRequest() {
		super("cloudwf", "2017-03-28", "ProfileHistoryList");
	}

	private Long idtype;

	private Integer page;

	private Integer per;

	private Long agsid;

	public Long getIdtype() {
		return this.idtype;
	}

	public void setIdtype(Long idtype) {
		this.idtype = idtype;
		if(idtype != null){
			putQueryParameter("Idtype", idtype.toString());
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

	public Integer getPer() {
		return this.per;
	}

	public void setPer(Integer per) {
		this.per = per;
		if(per != null){
			putQueryParameter("Per", per.toString());
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

	@Override
	public Class<ProfileHistoryListResponse> getResponseClass() {
		return ProfileHistoryListResponse.class;
	}

}
