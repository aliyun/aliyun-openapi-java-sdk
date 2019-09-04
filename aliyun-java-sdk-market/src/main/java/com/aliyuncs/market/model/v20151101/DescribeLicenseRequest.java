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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLicenseRequest extends RpcAcsRequest<DescribeLicenseResponse> {
	
	public DescribeLicenseRequest() {
		super("Market", "2015-11-01", "DescribeLicense", "Market");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String licenseCode;

	public String getLicenseCode() {
		return this.licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
		if(licenseCode != null){
			putQueryParameter("LicenseCode", licenseCode);
		}
	}

	@Override
	public Class<DescribeLicenseResponse> getResponseClass() {
		return DescribeLicenseResponse.class;
	}

}
