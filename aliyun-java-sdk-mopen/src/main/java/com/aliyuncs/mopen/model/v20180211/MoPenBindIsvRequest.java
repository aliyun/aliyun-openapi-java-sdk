/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mopen.model.v20180211;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoPenBindIsvRequest extends RpcAcsRequest<MoPenBindIsvResponse> {
	
	public MoPenBindIsvRequest() {
		super("MoPen", "2018-02-11", "MoPenBindIsv", "mopen");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String orderKey;

	private String deviceName;

	public String getOrderKey() {
		return this.orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
		if(orderKey != null){
			putBodyParameter("OrderKey", orderKey);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<MoPenBindIsvResponse> getResponseClass() {
		return MoPenBindIsvResponse.class;
	}

}
