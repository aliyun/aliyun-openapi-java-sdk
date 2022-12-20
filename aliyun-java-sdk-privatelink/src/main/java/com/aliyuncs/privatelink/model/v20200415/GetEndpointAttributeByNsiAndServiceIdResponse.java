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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.GetEndpointAttributeByNsiAndServiceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEndpointAttributeByNsiAndServiceIdResponse extends AcsResponse {

	private String requestId;

	private String endpointId;

	private String payer;

	private String serviceId;

	private String endpointStatus;

	private String vpcId;

	private String endpointName;

	private String endpointType;

	private String serviceName;

	private Integer bandwidth;

	private String regionId;

	private String connectionStatus;

	private Boolean zoneAffinityEnabled;

	private Boolean resourceOwner;

	private Long zonePrivateIpAddressCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getEndpointStatus() {
		return this.endpointStatus;
	}

	public void setEndpointStatus(String endpointStatus) {
		this.endpointStatus = endpointStatus;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getEndpointName() {
		return this.endpointName;
	}

	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}

	public String getEndpointType() {
		return this.endpointType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getConnectionStatus() {
		return this.connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public Boolean getZoneAffinityEnabled() {
		return this.zoneAffinityEnabled;
	}

	public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
		this.zoneAffinityEnabled = zoneAffinityEnabled;
	}

	public Boolean getResourceOwner() {
		return this.resourceOwner;
	}

	public void setResourceOwner(Boolean resourceOwner) {
		this.resourceOwner = resourceOwner;
	}

	public Long getZonePrivateIpAddressCount() {
		return this.zonePrivateIpAddressCount;
	}

	public void setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
		this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
	}

	@Override
	public GetEndpointAttributeByNsiAndServiceIdResponse getInstance(UnmarshallerContext context) {
		return	GetEndpointAttributeByNsiAndServiceIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
