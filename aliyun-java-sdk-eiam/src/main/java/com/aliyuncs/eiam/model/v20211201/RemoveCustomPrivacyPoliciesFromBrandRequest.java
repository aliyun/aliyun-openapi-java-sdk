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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RemoveCustomPrivacyPoliciesFromBrandRequest extends RpcAcsRequest<RemoveCustomPrivacyPoliciesFromBrandResponse> {
	   

	private String brandId;

	private List<String> customPrivacyPolicyIds;

	private String instanceId;
	public RemoveCustomPrivacyPoliciesFromBrandRequest() {
		super("Eiam", "2021-12-01", "RemoveCustomPrivacyPoliciesFromBrand", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
		if(brandId != null){
			putQueryParameter("BrandId", brandId);
		}
	}

	public List<String> getCustomPrivacyPolicyIds() {
		return this.customPrivacyPolicyIds;
	}

	public void setCustomPrivacyPolicyIds(List<String> customPrivacyPolicyIds) {
		this.customPrivacyPolicyIds = customPrivacyPolicyIds;	
		if (customPrivacyPolicyIds != null) {
			for (int depth1 = 0; depth1 < customPrivacyPolicyIds.size(); depth1++) {
				putQueryParameter("CustomPrivacyPolicyIds." + (depth1 + 1) , customPrivacyPolicyIds.get(depth1));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<RemoveCustomPrivacyPoliciesFromBrandResponse> getResponseClass() {
		return RemoveCustomPrivacyPoliciesFromBrandResponse.class;
	}

}
