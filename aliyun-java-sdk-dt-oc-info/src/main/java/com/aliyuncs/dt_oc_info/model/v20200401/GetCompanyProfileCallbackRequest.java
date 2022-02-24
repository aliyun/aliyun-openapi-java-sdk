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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCompanyProfileCallbackRequest extends RpcAcsRequest<GetCompanyProfileCallbackResponse> {
	   

	private String companyGroupId;

	private String companyQueryUrl;

	private String profileCallbackUrl;

	private String featureCallbackUrl;
	public GetCompanyProfileCallbackRequest() {
		super("dt-oc-info", "2020-04-01", "GetCompanyProfileCallback");
		setMethod(MethodType.POST);
	}

	public String getCompanyGroupId() {
		return this.companyGroupId;
	}

	public void setCompanyGroupId(String companyGroupId) {
		this.companyGroupId = companyGroupId;
		if(companyGroupId != null){
			putBodyParameter("CompanyGroupId", companyGroupId);
		}
	}

	public String getCompanyQueryUrl() {
		return this.companyQueryUrl;
	}

	public void setCompanyQueryUrl(String companyQueryUrl) {
		this.companyQueryUrl = companyQueryUrl;
		if(companyQueryUrl != null){
			putBodyParameter("CompanyQueryUrl", companyQueryUrl);
		}
	}

	public String getProfileCallbackUrl() {
		return this.profileCallbackUrl;
	}

	public void setProfileCallbackUrl(String profileCallbackUrl) {
		this.profileCallbackUrl = profileCallbackUrl;
		if(profileCallbackUrl != null){
			putBodyParameter("ProfileCallbackUrl", profileCallbackUrl);
		}
	}

	public String getFeatureCallbackUrl() {
		return this.featureCallbackUrl;
	}

	public void setFeatureCallbackUrl(String featureCallbackUrl) {
		this.featureCallbackUrl = featureCallbackUrl;
		if(featureCallbackUrl != null){
			putBodyParameter("FeatureCallbackUrl", featureCallbackUrl);
		}
	}

	@Override
	public Class<GetCompanyProfileCallbackResponse> getResponseClass() {
		return GetCompanyProfileCallbackResponse.class;
	}

}
