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
package com.aliyuncs.bss.model.v20140714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCouponListRequest extends RpcAcsRequest<DescribeCouponListResponse> {
	
	public DescribeCouponListRequest() {
		super("Bss", "2014-07-14", "DescribeCouponList");
		setProtocol(ProtocolType.HTTPS);
	}

	private String status;

	private String startDeliveryTime;

	private String endDeliveryTime;

	private Integer pageSize;

	private Integer pageNum;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		putQueryParameter("Status", status);
	}

	public String getStartDeliveryTime() {
		return this.startDeliveryTime;
	}

	public void setStartDeliveryTime(String startDeliveryTime) {
		this.startDeliveryTime = startDeliveryTime;
		putQueryParameter("StartDeliveryTime", startDeliveryTime);
	}

	public String getEndDeliveryTime() {
		return this.endDeliveryTime;
	}

	public void setEndDeliveryTime(String endDeliveryTime) {
		this.endDeliveryTime = endDeliveryTime;
		putQueryParameter("EndDeliveryTime", endDeliveryTime);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", String.valueOf(pageSize));
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		putQueryParameter("PageNum", String.valueOf(pageNum));
	}

	@Override
	public Class<DescribeCouponListResponse> getResponseClass() {
		return DescribeCouponListResponse.class;
	}

}
