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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRtmpKeyRequest extends RpcAcsRequest<UpdateRtmpKeyResponse> {
	   

	private String pushAuthKey;

	private String iotId;

	private String iotInstanceId;

	private Integer pushKeyExpireTime;

	private String pullAuthKey;

	private String productKey;

	private String deviceName;

	private Integer pullKeyExpireTime;
	public UpdateRtmpKeyRequest() {
		super("Linkvisual", "2018-01-20", "UpdateRtmpKey", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPushAuthKey() {
		return this.pushAuthKey;
	}

	public void setPushAuthKey(String pushAuthKey) {
		this.pushAuthKey = pushAuthKey;
		if(pushAuthKey != null){
			putQueryParameter("PushAuthKey", pushAuthKey);
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getPushKeyExpireTime() {
		return this.pushKeyExpireTime;
	}

	public void setPushKeyExpireTime(Integer pushKeyExpireTime) {
		this.pushKeyExpireTime = pushKeyExpireTime;
		if(pushKeyExpireTime != null){
			putQueryParameter("PushKeyExpireTime", pushKeyExpireTime.toString());
		}
	}

	public String getPullAuthKey() {
		return this.pullAuthKey;
	}

	public void setPullAuthKey(String pullAuthKey) {
		this.pullAuthKey = pullAuthKey;
		if(pullAuthKey != null){
			putQueryParameter("PullAuthKey", pullAuthKey);
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

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public Integer getPullKeyExpireTime() {
		return this.pullKeyExpireTime;
	}

	public void setPullKeyExpireTime(Integer pullKeyExpireTime) {
		this.pullKeyExpireTime = pullKeyExpireTime;
		if(pullKeyExpireTime != null){
			putQueryParameter("PullKeyExpireTime", pullKeyExpireTime.toString());
		}
	}

	@Override
	public Class<UpdateRtmpKeyResponse> getResponseClass() {
		return UpdateRtmpKeyResponse.class;
	}

}
