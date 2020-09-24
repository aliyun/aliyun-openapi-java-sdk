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
import com.aliyuncs.privatelink.transform.v20200415.CreateVpcEndpointServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcEndpointServiceResponse extends AcsResponse {

	private Boolean autoAcceptEnabled;

	private String createTime;

	private String requestId;

	private String serviceBusinessStatus;

	private String serviceDescription;

	private String serviceDomain;

	private String serviceId;

	private String serviceName;

	private String serviceStatus;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceBusinessStatus() {
		return this.serviceBusinessStatus;
	}

	public void setServiceBusinessStatus(String serviceBusinessStatus) {
		this.serviceBusinessStatus = serviceBusinessStatus;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceDomain() {
		return this.serviceDomain;
	}

	public void setServiceDomain(String serviceDomain) {
		this.serviceDomain = serviceDomain;
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

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	@Override
	public CreateVpcEndpointServiceResponse getInstance(UnmarshallerContext context) {
		return	CreateVpcEndpointServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
