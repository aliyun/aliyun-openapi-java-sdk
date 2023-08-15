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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeCustomRoutingEndpointGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomRoutingEndpointGroupResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String listenerId;

	private String endpointGroupId;

	private String name;

	private String description;

	private String endpointGroupRegion;

	private String state;

	private String slsRegion;

	private String slsProjectName;

	private String slsLogStoreName;

	private String accessLogSwitch;

	private Boolean enableAccessLog;

	private String serviceId;

	private Boolean serviceManaged;

	private List<ServiceManagedInfosItem> serviceManagedInfos;

	private List<String> endpointGroupIpList;

	private List<String> endpointGroupUnconfirmedIpList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSlsRegion() {
		return this.slsRegion;
	}

	public void setSlsRegion(String slsRegion) {
		this.slsRegion = slsRegion;
	}

	public String getSlsProjectName() {
		return this.slsProjectName;
	}

	public void setSlsProjectName(String slsProjectName) {
		this.slsProjectName = slsProjectName;
	}

	public String getSlsLogStoreName() {
		return this.slsLogStoreName;
	}

	public void setSlsLogStoreName(String slsLogStoreName) {
		this.slsLogStoreName = slsLogStoreName;
	}

	public String getAccessLogSwitch() {
		return this.accessLogSwitch;
	}

	public void setAccessLogSwitch(String accessLogSwitch) {
		this.accessLogSwitch = accessLogSwitch;
	}

	public Boolean getEnableAccessLog() {
		return this.enableAccessLog;
	}

	public void setEnableAccessLog(Boolean enableAccessLog) {
		this.enableAccessLog = enableAccessLog;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Boolean getServiceManaged() {
		return this.serviceManaged;
	}

	public void setServiceManaged(Boolean serviceManaged) {
		this.serviceManaged = serviceManaged;
	}

	public List<ServiceManagedInfosItem> getServiceManagedInfos() {
		return this.serviceManagedInfos;
	}

	public void setServiceManagedInfos(List<ServiceManagedInfosItem> serviceManagedInfos) {
		this.serviceManagedInfos = serviceManagedInfos;
	}

	public List<String> getEndpointGroupIpList() {
		return this.endpointGroupIpList;
	}

	public void setEndpointGroupIpList(List<String> endpointGroupIpList) {
		this.endpointGroupIpList = endpointGroupIpList;
	}

	public List<String> getEndpointGroupUnconfirmedIpList() {
		return this.endpointGroupUnconfirmedIpList;
	}

	public void setEndpointGroupUnconfirmedIpList(List<String> endpointGroupUnconfirmedIpList) {
		this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
	}

	public static class ServiceManagedInfosItem {

		private String action;

		private String childType;

		private Boolean isManaged;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getChildType() {
			return this.childType;
		}

		public void setChildType(String childType) {
			this.childType = childType;
		}

		public Boolean getIsManaged() {
			return this.isManaged;
		}

		public void setIsManaged(Boolean isManaged) {
			this.isManaged = isManaged;
		}
	}

	@Override
	public DescribeCustomRoutingEndpointGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomRoutingEndpointGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
