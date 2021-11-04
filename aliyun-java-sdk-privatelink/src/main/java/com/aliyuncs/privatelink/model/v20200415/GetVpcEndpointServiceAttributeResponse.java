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

package com.aliyuncs.privatelink.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.GetVpcEndpointServiceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpcEndpointServiceAttributeResponse extends AcsResponse {

	private String payer;

	private String requestId;

	private String serviceDescription;

	private String createTime;

	private Integer maxBandwidth;

	private Integer minBandwidth;

	private String serviceDomain;

	private Boolean autoAcceptEnabled;

	private Boolean zoneAffinityEnabled;

	private String serviceId;

	private String serviceBusinessStatus;

	private String serviceName;

	private String serviceStatus;

	private Integer connectBandwidth;

	private String regionId;

	private String serviceType;

	private String serviceResourceType;

	private Boolean privateServiceDomainEnabled;

	private String privateServiceDomain;

	private String privateServiceDomainVerifyStatus;

	private String privateServiceDomainBusinessStatus;

	private String privateServiceDomainVerifyName;

	private String privateServiceDomainVerifyValue;

	private String privateServiceName;

	private List<String> zones;

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getMaxBandwidth() {
		return this.maxBandwidth;
	}

	public void setMaxBandwidth(Integer maxBandwidth) {
		this.maxBandwidth = maxBandwidth;
	}

	public Integer getMinBandwidth() {
		return this.minBandwidth;
	}

	public void setMinBandwidth(Integer minBandwidth) {
		this.minBandwidth = minBandwidth;
	}

	public String getServiceDomain() {
		return this.serviceDomain;
	}

	public void setServiceDomain(String serviceDomain) {
		this.serviceDomain = serviceDomain;
	}

	public Boolean getAutoAcceptEnabled() {
		return this.autoAcceptEnabled;
	}

	public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
		this.autoAcceptEnabled = autoAcceptEnabled;
	}

	public Boolean getZoneAffinityEnabled() {
		return this.zoneAffinityEnabled;
	}

	public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
		this.zoneAffinityEnabled = zoneAffinityEnabled;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceBusinessStatus() {
		return this.serviceBusinessStatus;
	}

	public void setServiceBusinessStatus(String serviceBusinessStatus) {
		this.serviceBusinessStatus = serviceBusinessStatus;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public Integer getConnectBandwidth() {
		return this.connectBandwidth;
	}

	public void setConnectBandwidth(Integer connectBandwidth) {
		this.connectBandwidth = connectBandwidth;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceResourceType() {
		return this.serviceResourceType;
	}

	public void setServiceResourceType(String serviceResourceType) {
		this.serviceResourceType = serviceResourceType;
	}

	public Boolean getPrivateServiceDomainEnabled() {
		return this.privateServiceDomainEnabled;
	}

	public void setPrivateServiceDomainEnabled(Boolean privateServiceDomainEnabled) {
		this.privateServiceDomainEnabled = privateServiceDomainEnabled;
	}

	public String getPrivateServiceDomain() {
		return this.privateServiceDomain;
	}

	public void setPrivateServiceDomain(String privateServiceDomain) {
		this.privateServiceDomain = privateServiceDomain;
	}

	public String getPrivateServiceDomainVerifyStatus() {
		return this.privateServiceDomainVerifyStatus;
	}

	public void setPrivateServiceDomainVerifyStatus(String privateServiceDomainVerifyStatus) {
		this.privateServiceDomainVerifyStatus = privateServiceDomainVerifyStatus;
	}

	public String getPrivateServiceDomainBusinessStatus() {
		return this.privateServiceDomainBusinessStatus;
	}

	public void setPrivateServiceDomainBusinessStatus(String privateServiceDomainBusinessStatus) {
		this.privateServiceDomainBusinessStatus = privateServiceDomainBusinessStatus;
	}

	public String getPrivateServiceDomainVerifyName() {
		return this.privateServiceDomainVerifyName;
	}

	public void setPrivateServiceDomainVerifyName(String privateServiceDomainVerifyName) {
		this.privateServiceDomainVerifyName = privateServiceDomainVerifyName;
	}

	public String getPrivateServiceDomainVerifyValue() {
		return this.privateServiceDomainVerifyValue;
	}

	public void setPrivateServiceDomainVerifyValue(String privateServiceDomainVerifyValue) {
		this.privateServiceDomainVerifyValue = privateServiceDomainVerifyValue;
	}

	public String getPrivateServiceName() {
		return this.privateServiceName;
	}

	public void setPrivateServiceName(String privateServiceName) {
		this.privateServiceName = privateServiceName;
	}

	public List<String> getZones() {
		return this.zones;
	}

	public void setZones(List<String> zones) {
		this.zones = zones;
	}

	@Override
	public GetVpcEndpointServiceAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetVpcEndpointServiceAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
