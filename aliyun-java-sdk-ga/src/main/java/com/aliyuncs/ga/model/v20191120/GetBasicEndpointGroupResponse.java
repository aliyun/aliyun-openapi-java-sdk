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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.GetBasicEndpointGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicEndpointGroupResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String endpointGroupId;

	private String name;

	private String description;

	private String endpointGroupRegion;

	private String endpointType;

	private String endpointAddress;

	private String state;

	private String endpointSubAddress;

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

	public String getEndpointType() {
		return this.endpointType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
	}

	public String getEndpointAddress() {
		return this.endpointAddress;
	}

	public void setEndpointAddress(String endpointAddress) {
		this.endpointAddress = endpointAddress;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEndpointSubAddress() {
		return this.endpointSubAddress;
	}

	public void setEndpointSubAddress(String endpointSubAddress) {
		this.endpointSubAddress = endpointSubAddress;
	}

	@Override
	public GetBasicEndpointGroupResponse getInstance(UnmarshallerContext context) {
		return	GetBasicEndpointGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
