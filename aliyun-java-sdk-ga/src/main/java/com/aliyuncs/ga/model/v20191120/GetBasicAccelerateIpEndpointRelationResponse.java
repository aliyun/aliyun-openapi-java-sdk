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
import com.aliyuncs.ga.transform.v20191120.GetBasicAccelerateIpEndpointRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicAccelerateIpEndpointRelationResponse extends AcsResponse {

	private String endpointId;

	private String endpointName;

	private String endpointType;

	private String endpointAddress;

	private String endpointSubAddress;

	private String endpointSubAddressType;

	private String endpointZoneId;

	private String accelerateIpId;

	private String ipAddress;

	private String state;

	private String requestId;

	private String acceleratorId;

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
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

	public String getAccelerateIpId() {
		return this.accelerateIpId;
	}

	public void setAccelerateIpId(String accelerateIpId) {
		this.accelerateIpId = accelerateIpId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	@Override
	public GetBasicAccelerateIpEndpointRelationResponse getInstance(UnmarshallerContext context) {
		return	GetBasicAccelerateIpEndpointRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
