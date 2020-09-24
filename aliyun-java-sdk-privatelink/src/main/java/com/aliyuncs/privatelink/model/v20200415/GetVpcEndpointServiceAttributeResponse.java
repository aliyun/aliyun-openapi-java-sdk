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

	private String requestId;

	private String serviceId;

	private String serviceName;

	private String serviceDomain;

	private String serviceDescription;

	private String serviceBusinessStatus;

	private String serviceStatus;

	private Boolean autoAcceptEnabled;

	private String createTime;

	private Integer maxBandwidth;

	private Integer minBandwidth;

	private Integer connectBandwidth;

	private String regionId;

	private List<String> zones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDomain() {
		return this.serviceDomain;
	}

	public void setServiceDomain(String serviceDomain) {
		this.serviceDomain = serviceDomain;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceBusinessStatus() {
		return this.serviceBusinessStatus;
	}

	public void setServiceBusinessStatus(String serviceBusinessStatus) {
		this.serviceBusinessStatus = serviceBusinessStatus;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public Boolean getAutoAcceptEnabled() {
		return this.autoAcceptEnabled;
	}

	public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
		this.autoAcceptEnabled = autoAcceptEnabled;
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
