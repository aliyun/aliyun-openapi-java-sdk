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
package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceShadowRequest extends RpcAcsRequest<GetDeviceShadowResponse> {
	
	public GetDeviceShadowRequest() {
		super("Iot", "2017-04-20", "GetDeviceShadow");
	}

	private String deviceName;

	private String productKey;

	private String shadowMessage;

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		putQueryParameter("DeviceName", deviceName);
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public String getShadowMessage() {
		return this.shadowMessage;
	}

	public void setShadowMessage(String shadowMessage) {
		this.shadowMessage = shadowMessage;
		putQueryParameter("ShadowMessage", shadowMessage);
	}

	@Override
	public Class<GetDeviceShadowResponse> getResponseClass() {
		return GetDeviceShadowResponse.class;
	}

}
