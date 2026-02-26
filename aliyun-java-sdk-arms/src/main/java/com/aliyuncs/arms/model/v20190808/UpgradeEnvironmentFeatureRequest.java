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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeEnvironmentFeatureRequest extends RpcAcsRequest<UpgradeEnvironmentFeatureResponse> {
	   

	private String aliyunLang;

	private String values;

	private String featureName;

	private String environmentId;

	private String featureVersion;
	public UpgradeEnvironmentFeatureRequest() {
		super("ARMS", "2019-08-08", "UpgradeEnvironmentFeature", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliyunLang() {
		return this.aliyunLang;
	}

	public void setAliyunLang(String aliyunLang) {
		this.aliyunLang = aliyunLang;
		if(aliyunLang != null){
			putQueryParameter("AliyunLang", aliyunLang);
		}
	}

	public String getValues() {
		return this.values;
	}

	public void setValues(String values) {
		this.values = values;
		if(values != null){
			putQueryParameter("Values", values);
		}
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
		if(featureName != null){
			putQueryParameter("FeatureName", featureName);
		}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	public String getFeatureVersion() {
		return this.featureVersion;
	}

	public void setFeatureVersion(String featureVersion) {
		this.featureVersion = featureVersion;
		if(featureVersion != null){
			putQueryParameter("FeatureVersion", featureVersion);
		}
	}

	@Override
	public Class<UpgradeEnvironmentFeatureResponse> getResponseClass() {
		return UpgradeEnvironmentFeatureResponse.class;
	}

}
