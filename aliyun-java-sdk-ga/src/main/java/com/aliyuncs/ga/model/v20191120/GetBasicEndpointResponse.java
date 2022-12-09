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
import com.aliyuncs.ga.transform.v20191120.GetBasicEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicEndpointResponse extends AcsResponse {

	private String acceleratorId;

	private String endpointGroupId;

	private String endPointId;

	private String name;

	private String endpointType;

	private String endpointAddress;

	private String endpointSubAddress;

	private String endpointSubAddressType;

	private String endpointZoneId;

	private String state;

	private String requestId;

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

	public String getEndPointId() {
		return this.endPointId;
	}

	public void setEndPointId(String endPointId) {
		this.endPointId = endPointId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEndpointSubAddress() {
		return this.endpointSubAddress;
	}

	public void setEndpointSubAddress(String endpointSubAddress) {
		this.endpointSubAddress = endpointSubAddress;
	}

	public String getEndpointSubAddressType() {
		return this.endpointSubAddressType;
	}

	public void setEndpointSubAddressType(String endpointSubAddressType) {
		this.endpointSubAddressType = endpointSubAddressType;
	}

	public String getEndpointZoneId() {
		return this.endpointZoneId;
	}

	public void setEndpointZoneId(String endpointZoneId) {
		this.endpointZoneId = endpointZoneId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public GetBasicEndpointResponse getInstance(UnmarshallerContext context) {
		return	GetBasicEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
