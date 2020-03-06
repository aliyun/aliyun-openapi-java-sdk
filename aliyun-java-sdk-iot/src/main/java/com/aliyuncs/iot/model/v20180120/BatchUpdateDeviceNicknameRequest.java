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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchUpdateDeviceNicknameRequest extends RpcAcsRequest<BatchUpdateDeviceNicknameResponse> {
	   

	private List<DeviceNicknameInfo> deviceNicknameInfos;

	private String iotInstanceId;
	public BatchUpdateDeviceNicknameRequest() {
		super("Iot", "2018-01-20", "BatchUpdateDeviceNickname", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DeviceNicknameInfo> getDeviceNicknameInfos() {
		return this.deviceNicknameInfos;
	}

	public void setDeviceNicknameInfos(List<DeviceNicknameInfo> deviceNicknameInfos) {
		this.deviceNicknameInfos = deviceNicknameInfos;	
		if (deviceNicknameInfos != null) {
			for (int depth1 = 0; depth1 < deviceNicknameInfos.size(); depth1++) {
				putQueryParameter("DeviceNicknameInfo." + (depth1 + 1) + ".IotId" , deviceNicknameInfos.get(depth1).getIotId());
				putQueryParameter("DeviceNicknameInfo." + (depth1 + 1) + ".Nickname" , deviceNicknameInfos.get(depth1).getNickname());
				putQueryParameter("DeviceNicknameInfo." + (depth1 + 1) + ".DeviceName" , deviceNicknameInfos.get(depth1).getDeviceName());
				putQueryParameter("DeviceNicknameInfo." + (depth1 + 1) + ".ProductKey" , deviceNicknameInfos.get(depth1).getProductKey());
			}
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

	public static class DeviceNicknameInfo {

		private String iotId;

		private String nickname;

		private String deviceName;

		private String productKey;

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}
	}

	@Override
	public Class<BatchUpdateDeviceNicknameResponse> getResponseClass() {
		return BatchUpdateDeviceNicknameResponse.class;
	}

}
