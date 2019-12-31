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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTaobaoISVMpkCellRequest extends RpcAcsRequest<CreateTaobaoISVMpkCellResponse> {
	   

	private String licenseNumber;

	private String licenseName;
	public CreateTaobaoISVMpkCellRequest() {
		super("MPServerless", "2019-09-30", "CreateTaobaoISVMpkCell", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		if(licenseNumber != null){
			putBodyParameter("LicenseNumber", licenseNumber);
		}
	}

	public String getLicenseName() {
		return this.licenseName;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
		if(licenseName != null){
			putBodyParameter("LicenseName", licenseName);
		}
	}

	@Override
	public Class<CreateTaobaoISVMpkCellResponse> getResponseClass() {
		return CreateTaobaoISVMpkCellResponse.class;
	}

}
