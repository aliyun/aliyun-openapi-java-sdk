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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceRequest extends RpcAcsRequest<UpdateServiceResponse> {
	   

	private String alarmMetadata;

	private Boolean resellable;

	private String clientToken;

	private String policyNames;

	private String licenseMetadata;

	private Long duration;

	private Integer trialDuration;

	private String upgradeMetadata;

	private String deployMetadata;

	private String serviceType;

	private Boolean isSupportOperated;

	private String tenantType;

	private String serviceVersion;

	private String logMetadata;

	private List<ServiceInfo> serviceInfos;

	private String serviceId;

	private String versionName;

	private String operationMetadata;

	private String deployType;
	public UpdateServiceRequest() {
		super("ComputeNestSupplier", "2021-05-21", "UpdateService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlarmMetadata() {
		return this.alarmMetadata;
	}

	public void setAlarmMetadata(String alarmMetadata) {
		this.alarmMetadata = alarmMetadata;
		if(alarmMetadata != null){
			putQueryParameter("AlarmMetadata", alarmMetadata);
		}
	}

	public Boolean getResellable() {
		return this.resellable;
	}

	public void setResellable(Boolean resellable) {
		this.resellable = resellable;
		if(resellable != null){
			putQueryParameter("Resellable", resellable.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPolicyNames() {
		return this.policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
		if(policyNames != null){
			putQueryParameter("PolicyNames", policyNames);
		}
	}

	public String getLicenseMetadata() {
		return this.licenseMetadata;
	}

	public void setLicenseMetadata(String licenseMetadata) {
		this.licenseMetadata = licenseMetadata;
		if(licenseMetadata != null){
			putQueryParameter("LicenseMetadata", licenseMetadata);
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Integer getTrialDuration() {
		return this.trialDuration;
	}

	public void setTrialDuration(Integer trialDuration) {
		this.trialDuration = trialDuration;
		if(trialDuration != null){
			putQueryParameter("TrialDuration", trialDuration.toString());
		}
	}

	public String getUpgradeMetadata() {
		return this.upgradeMetadata;
	}

	public void setUpgradeMetadata(String upgradeMetadata) {
		this.upgradeMetadata = upgradeMetadata;
		if(upgradeMetadata != null){
			putQueryParameter("UpgradeMetadata", upgradeMetadata);
		}
	}

	public String getDeployMetadata() {
		return this.deployMetadata;
	}

	public void setDeployMetadata(String deployMetadata) {
		this.deployMetadata = deployMetadata;
		if(deployMetadata != null){
			putQueryParameter("DeployMetadata", deployMetadata);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public Boolean getIsSupportOperated() {
		return this.isSupportOperated;
	}

	public void setIsSupportOperated(Boolean isSupportOperated) {
		this.isSupportOperated = isSupportOperated;
		if(isSupportOperated != null){
			putQueryParameter("IsSupportOperated", isSupportOperated.toString());
		}
	}

	public String getTenantType() {
		return this.tenantType;
	}

	public void setTenantType(String tenantType) {
		this.tenantType = tenantType;
		if(tenantType != null){
			putQueryParameter("TenantType", tenantType);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getLogMetadata() {
		return this.logMetadata;
	}

	public void setLogMetadata(String logMetadata) {
		this.logMetadata = logMetadata;
		if(logMetadata != null){
			putQueryParameter("LogMetadata", logMetadata);
		}
	}

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;	
		if (serviceInfos != null) {
			for (int depth1 = 0; depth1 < serviceInfos.size(); depth1++) {
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ShortDescription" , serviceInfos.get(depth1).getShortDescription());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Image" , serviceInfos.get(depth1).getImage());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Name" , serviceInfos.get(depth1).getName());
				if (serviceInfos.get(depth1).getAgreementss() != null) {
					for (int depth2 = 0; depth2 < serviceInfos.get(depth1).getAgreementss().size(); depth2++) {
						putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Agreements." + (depth2 + 1) + ".Name" , serviceInfos.get(depth1).getAgreementss().get(depth2).getName());
						putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Agreements." + (depth2 + 1) + ".Url" , serviceInfos.get(depth1).getAgreementss().get(depth2).getUrl());
					}
				}
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Locale" , serviceInfos.get(depth1).getLocale());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".LongDescriptionUrl" , serviceInfos.get(depth1).getLongDescriptionUrl());
			}
		}	
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putQueryParameter("VersionName", versionName);
		}
	}

	public String getOperationMetadata() {
		return this.operationMetadata;
	}

	public void setOperationMetadata(String operationMetadata) {
		this.operationMetadata = operationMetadata;
		if(operationMetadata != null){
			putQueryParameter("OperationMetadata", operationMetadata);
		}
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	public static class ServiceInfo {

		private String shortDescription;

		private String image;

		private String name;

		private List<Agreements> agreementss;

		private String locale;

		private String longDescriptionUrl;

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Agreements> getAgreementss() {
			return this.agreementss;
		}

		public void setAgreementss(List<Agreements> agreementss) {
			this.agreementss = agreementss;
		}

		public String getLocale() {
			return this.locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}

		public String getLongDescriptionUrl() {
			return this.longDescriptionUrl;
		}

		public void setLongDescriptionUrl(String longDescriptionUrl) {
			this.longDescriptionUrl = longDescriptionUrl;
		}

		public static class Agreements {

			private String name;

			private String url;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public Class<UpdateServiceResponse> getResponseClass() {
		return UpdateServiceResponse.class;
	}

}
