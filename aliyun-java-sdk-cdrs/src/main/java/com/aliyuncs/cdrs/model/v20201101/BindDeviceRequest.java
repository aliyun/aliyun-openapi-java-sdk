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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BindDeviceRequest extends RpcAcsRequest<BindDeviceResponse> {
	   

	private String corpId;

	private List<Devices> devicess;
	public BindDeviceRequest() {
		super("CDRS", "2020-11-01", "BindDevice");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public List<Devices> getDevicess() {
		return this.devicess;
	}

	public void setDevicess(List<Devices> devicess) {
		this.devicess = devicess;	
		if (devicess != null) {
			for (int depth1 = 0; depth1 < devicess.size(); depth1++) {
				putBodyParameter("Devices." + (depth1 + 1) + ".CorpId" , devicess.get(depth1).getCorpId());
				putBodyParameter("Devices." + (depth1 + 1) + ".DeviceId" , devicess.get(depth1).getDeviceId());
			}
		}	
	}

	public static class Devices {

		private String corpId;

		private String deviceId;

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}

	@Override
	public Class<BindDeviceResponse> getResponseClass() {
		return BindDeviceResponse.class;
	}

}
