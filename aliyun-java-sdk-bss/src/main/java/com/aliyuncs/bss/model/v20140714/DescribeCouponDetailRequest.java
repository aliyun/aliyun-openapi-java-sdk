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
public class DescribeCouponDetailRequest extends RpcAcsRequest<DescribeCouponDetailResponse> {
	
	public DescribeCouponDetailRequest() {
		super("Bss", "2014-07-14", "DescribeCouponDetail");
		setProtocol(ProtocolType.HTTPS);
	}

	private String couponNumber;

	public String getCouponNumber() {
		return this.couponNumber;
	}

	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
		putQueryParameter("CouponNumber", couponNumber);
	}

	@Override
	public Class<DescribeCouponDetailResponse> getResponseClass() {
		return DescribeCouponDetailResponse.class;
	}

}
