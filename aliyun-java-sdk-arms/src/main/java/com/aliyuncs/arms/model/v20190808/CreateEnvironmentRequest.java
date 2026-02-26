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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEnvironmentRequest extends RpcAcsRequest<CreateEnvironmentResponse> {
	   

	private String aliyunLang;

	private String environmentName;

	private Boolean initEnvironment;

	private String prometheusInstanceId;

	private String environmentSubType;

	private List<Tags> tagss;

	private String grafanaWorkspaceId;

	private String resourceGroupId;

	private String environmentType;

	private String managedType;

	private String bindResourceId;

	private String feePackage;
	public CreateEnvironmentRequest() {
		super("ARMS", "2019-08-08", "CreateEnvironment", "arms");
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

	public String getEnvironmentName() {
		return this.environmentName;
	}

	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
		if(environmentName != null){
			putQueryParameter("EnvironmentName", environmentName);
		}
	}

	public Boolean getInitEnvironment() {
		return this.initEnvironment;
	}

	public void setInitEnvironment(Boolean initEnvironment) {
		this.initEnvironment = initEnvironment;
		if(initEnvironment != null){
			putQueryParameter("InitEnvironment", initEnvironment.toString());
		}
	}

	public String getPrometheusInstanceId() {
		return this.prometheusInstanceId;
	}

	public void setPrometheusInstanceId(String prometheusInstanceId) {
		this.prometheusInstanceId = prometheusInstanceId;
		if(prometheusInstanceId != null){
			putQueryParameter("PrometheusInstanceId", prometheusInstanceId);
		}
	}

	public String getEnvironmentSubType() {
		return this.environmentSubType;
	}

	public void setEnvironmentSubType(String environmentSubType) {
		this.environmentSubType = environmentSubType;
		if(environmentSubType != null){
			putQueryParameter("EnvironmentSubType", environmentSubType);
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public String getGrafanaWorkspaceId() {
		return this.grafanaWorkspaceId;
	}

	public void setGrafanaWorkspaceId(String grafanaWorkspaceId) {
		this.grafanaWorkspaceId = grafanaWorkspaceId;
		if(grafanaWorkspaceId != null){
			putQueryParameter("GrafanaWorkspaceId", grafanaWorkspaceId);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getEnvironmentType() {
		return this.environmentType;
	}

	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
		if(environmentType != null){
			putQueryParameter("EnvironmentType", environmentType);
		}
	}

	public String getManagedType() {
		return this.managedType;
	}

	public void setManagedType(String managedType) {
		this.managedType = managedType;
		if(managedType != null){
			putQueryParameter("ManagedType", managedType);
		}
	}

	public String getBindResourceId() {
		return this.bindResourceId;
	}

	public void setBindResourceId(String bindResourceId) {
		this.bindResourceId = bindResourceId;
		if(bindResourceId != null){
			putQueryParameter("BindResourceId", bindResourceId);
		}
	}

	public String getFeePackage() {
		return this.feePackage;
	}

	public void setFeePackage(String feePackage) {
		this.feePackage = feePackage;
		if(feePackage != null){
			putQueryParameter("FeePackage", feePackage);
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateEnvironmentResponse> getResponseClass() {
		return CreateEnvironmentResponse.class;
	}

}
