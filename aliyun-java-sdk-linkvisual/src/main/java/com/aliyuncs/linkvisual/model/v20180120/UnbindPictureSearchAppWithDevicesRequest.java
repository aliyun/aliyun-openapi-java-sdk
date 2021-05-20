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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UnbindPictureSearchAppWithDevicesRequest extends RpcAcsRequest<UnbindPictureSearchAppWithDevicesResponse> {
	   

	private String iotInstanceId;

	private List<String> deviceIotIdss;

	private String appInstanceId;
	public UnbindPictureSearchAppWithDevicesRequest() {
		super("Linkvisual", "2018-01-20", "UnbindPictureSearchAppWithDevices", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getDeviceIotIdss() {
		return this.deviceIotIdss;
	}

	public void setDeviceIotIdss(List<String> deviceIotIdss) {
		this.deviceIotIdss = deviceIotIdss;	
		if (deviceIotIdss != null) {
			for (int i = 0; i < deviceIotIdss.size(); i++) {
				putQueryParameter("DeviceIotIds." + (i + 1) , deviceIotIdss.get(i));
			}
		}	
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
		if(appInstanceId != null){
			putQueryParameter("AppInstanceId", appInstanceId);
		}
	}

	@Override
	public Class<UnbindPictureSearchAppWithDevicesResponse> getResponseClass() {
		return UnbindPictureSearchAppWithDevicesResponse.class;
	}

}
