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
package com.aliyuncs.ubsms_inner.model.v20150623;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBusinessStatusRequest extends RpcAcsRequest<DescribeUserBusinessStatusResponse> {
	
	public DescribeUserBusinessStatusRequest() {
		super("Ubsms-inner", "2015-06-23", "DescribeUserBusinessStatus");
	}

	private String callerBid;

	private String uid;

	private String serviceCode;

	public String getcallerBid() {
		return this.callerBid;
	}

	public void setcallerBid(String callerBid) {
		this.callerBid = callerBid;
		putQueryParameter("callerBid", callerBid);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		putQueryParameter("Uid", uid);
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		putQueryParameter("ServiceCode", serviceCode);
	}

	@Override
	public Class<DescribeUserBusinessStatusResponse> getResponseClass() {
		return DescribeUserBusinessStatusResponse.class;
	}

}
