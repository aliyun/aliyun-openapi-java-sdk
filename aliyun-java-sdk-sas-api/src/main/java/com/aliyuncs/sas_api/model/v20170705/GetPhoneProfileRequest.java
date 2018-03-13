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
package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetPhoneProfileRequest extends RpcAcsRequest<GetPhoneProfileResponse> {
	
	public GetPhoneProfileRequest() {
		super("Sas-api", "2017-07-05", "GetPhoneProfile");
	}

	private String phone;

	private Integer sensType;

	private String dataVersion;

	private Integer businessType;

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public Integer getSensType() {
		return this.sensType;
	}

	public void setSensType(Integer sensType) {
		this.sensType = sensType;
		if(sensType != null){
			putQueryParameter("SensType", sensType.toString());
		}
	}

	public String getDataVersion() {
		return this.dataVersion;
	}

	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
		if(dataVersion != null){
			putQueryParameter("DataVersion", dataVersion);
		}
	}

	public Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType.toString());
		}
	}

	@Override
	public Class<GetPhoneProfileResponse> getResponseClass() {
		return GetPhoneProfileResponse.class;
	}

}
