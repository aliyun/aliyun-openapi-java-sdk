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

package com.aliyuncs.slb.model.v20130221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerListenerStatusRequest extends RpcAcsRequest<SetLoadBalancerListenerStatusResponse> {
	   

	private Integer listenerPort;

	private String ownerAccount;

	private String hostId;

	private String ownerId;

	private String listenerStatus;

	private String loadBalancerId;
	public SetLoadBalancerListenerStatusRequest() {
		super("Slb", "2013-02-21", "SetLoadBalancerListenerStatus", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getHostId() {
		return this.hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
		if(hostId != null){
			putQueryParameter("HostId", hostId);
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

	public String getListenerStatus() {
		return this.listenerStatus;
	}

	public void setListenerStatus(String listenerStatus) {
		this.listenerStatus = listenerStatus;
		if(listenerStatus != null){
			putQueryParameter("ListenerStatus", listenerStatus);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	@Override
	public Class<SetLoadBalancerListenerStatusResponse> getResponseClass() {
		return SetLoadBalancerListenerStatusResponse.class;
	}

}
