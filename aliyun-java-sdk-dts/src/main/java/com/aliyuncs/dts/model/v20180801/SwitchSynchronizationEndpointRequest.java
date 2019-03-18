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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SwitchSynchronizationEndpointRequest extends RpcAcsRequest<SwitchSynchronizationEndpointResponse> {
	
	public SwitchSynchronizationEndpointRequest() {
		super("Dts", "2018-08-01", "SwitchSynchronizationEndpoint", "dts");
	}

	private String synchronizationJobId;

	private String endpointType;

	private String endpointInstanceType;

	private String endpointPort;

	private String endpointInstanceId;

	private String endpointIP;

	private String ownerId;

	private String synchronizationDirection;

	public String getSynchronizationJobId() {
		return this.synchronizationJobId;
	}

	public void setSynchronizationJobId(String synchronizationJobId) {
		this.synchronizationJobId = synchronizationJobId;
		if(synchronizationJobId != null){
			putQueryParameter("SynchronizationJobId", synchronizationJobId);
		}
	}

	public String getBizEndpointType() {
		return this.endpointType;
	}

	public void setBizEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("Endpoint.Type", endpointType);
		}
	}

	/**
	 * @deprecated use getBizEndpointType instead of this.
	 */
	@Deprecated
	public String getEndpointType() {
		return this.endpointType;
	}

	/**
	 * @deprecated use setBizEndpointType instead of this.
	 */
	@Deprecated
	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("Endpoint.Type", endpointType);
		}
	}

	public String getEndpointInstanceType() {
		return this.endpointInstanceType;
	}

	public void setEndpointInstanceType(String endpointInstanceType) {
		this.endpointInstanceType = endpointInstanceType;
		if(endpointInstanceType != null){
			putQueryParameter("Endpoint.InstanceType", endpointInstanceType);
		}
	}

	public String getEndpointPort() {
		return this.endpointPort;
	}

	public void setEndpointPort(String endpointPort) {
		this.endpointPort = endpointPort;
		if(endpointPort != null){
			putQueryParameter("Endpoint.Port", endpointPort);
		}
	}

	public String getEndpointInstanceId() {
		return this.endpointInstanceId;
	}

	public void setEndpointInstanceId(String endpointInstanceId) {
		this.endpointInstanceId = endpointInstanceId;
		if(endpointInstanceId != null){
			putQueryParameter("Endpoint.InstanceId", endpointInstanceId);
		}
	}

	public String getEndpointIP() {
		return this.endpointIP;
	}

	public void setEndpointIP(String endpointIP) {
		this.endpointIP = endpointIP;
		if(endpointIP != null){
			putQueryParameter("Endpoint.IP", endpointIP);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
		if(synchronizationDirection != null){
			putQueryParameter("SynchronizationDirection", synchronizationDirection);
		}
	}

	@Override
	public Class<SwitchSynchronizationEndpointResponse> getResponseClass() {
		return SwitchSynchronizationEndpointResponse.class;
	}

}
