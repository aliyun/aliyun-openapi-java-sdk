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
public class GetOnlineApTimeSerRequest extends RpcAcsRequest<GetOnlineApTimeSerResponse> {
	
	public GetOnlineApTimeSerRequest() {
		super("cloudwf", "2017-03-28", "GetOnlineApTimeSer");
	}

	private Long zoomStart;

	private Long companyId;

	private Long apgroupId;

	private Long start;

	private Long zoomEnd;

	private Long end;

	public Long getZoomStart() {
		return this.zoomStart;
	}

	public void setZoomStart(Long zoomStart) {
		this.zoomStart = zoomStart;
		if(zoomStart != null){
			putQueryParameter("ZoomStart", zoomStart.toString());
		}
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
		if(companyId != null){
			putQueryParameter("CompanyId", companyId.toString());
		}
	}

	public Long getApgroupId() {
		return this.apgroupId;
	}

	public void setApgroupId(Long apgroupId) {
		this.apgroupId = apgroupId;
		if(apgroupId != null){
			putQueryParameter("ApgroupId", apgroupId.toString());
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
		}
	}

	public Long getZoomEnd() {
		return this.zoomEnd;
	}

	public void setZoomEnd(Long zoomEnd) {
		this.zoomEnd = zoomEnd;
		if(zoomEnd != null){
			putQueryParameter("ZoomEnd", zoomEnd.toString());
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end.toString());
		}
	}

	@Override
	public Class<GetOnlineApTimeSerResponse> getResponseClass() {
		return GetOnlineApTimeSerResponse.class;
	}

}
