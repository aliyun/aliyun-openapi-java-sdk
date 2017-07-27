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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ApplyDeviceWithNamesRequest extends RpcAcsRequest<ApplyDeviceWithNamesResponse> {
	
	public ApplyDeviceWithNamesRequest() {
		super("Iot", "2017-04-20", "ApplyDeviceWithNames", "iot");
	}

	private List<String> deviceNames;

	private String productKey;

	public List<String> getDeviceNames() {
		return this.deviceNames;
	}

	public void setDeviceNames(List<String> deviceName) {
		this.deviceNames = deviceName;	
		for (int i = 0; i < deviceName.size(); i++) {
			putQueryParameter("DeviceName." + (i + 1) , deviceName.get(i));
		}	
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<ApplyDeviceWithNamesResponse> getResponseClass() {
		return ApplyDeviceWithNamesResponse.class;
	}

}
