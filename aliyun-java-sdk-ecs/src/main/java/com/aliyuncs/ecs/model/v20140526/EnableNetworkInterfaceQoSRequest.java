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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableNetworkInterfaceQoSRequest extends RpcAcsRequest<EnableNetworkInterfaceQoSResponse> {
	   

	private Long resourceOwnerId;

	private QoS qoS;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String networkInterfaceId;
	public EnableNetworkInterfaceQoSRequest() {
		super("Ecs", "2014-05-26", "EnableNetworkInterfaceQoS", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public QoS getQoS() {
		return this.qoS;
	}

	public void setQoS(QoS qoS) {
		this.qoS = qoS;	
		if (qoS != null) {
			
				putQueryParameter("QoS.BandwidthTx" , qoS.getBandwidthTx());
				putQueryParameter("QoS.BandwidthRx" , qoS.getBandwidthRx());
				putQueryParameter("QoS.PpsTx" , qoS.getPpsTx());
				putQueryParameter("QoS.PpsRx" , qoS.getPpsRx());
				putQueryParameter("QoS.ConcurrentConnections" , qoS.getConcurrentConnections());
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putQueryParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	public static class QoS {

		private Long bandwidthTx;

		private Long bandwidthRx;

		private Long ppsTx;

		private Long ppsRx;

		private Long concurrentConnections;

		public Long getBandwidthTx() {
			return this.bandwidthTx;
		}

		public void setBandwidthTx(Long bandwidthTx) {
			this.bandwidthTx = bandwidthTx;
		}

		public Long getBandwidthRx() {
			return this.bandwidthRx;
		}

		public void setBandwidthRx(Long bandwidthRx) {
			this.bandwidthRx = bandwidthRx;
		}

		public Long getPpsTx() {
			return this.ppsTx;
		}

		public void setPpsTx(Long ppsTx) {
			this.ppsTx = ppsTx;
		}

		public Long getPpsRx() {
			return this.ppsRx;
		}

		public void setPpsRx(Long ppsRx) {
			this.ppsRx = ppsRx;
		}

		public Long getConcurrentConnections() {
			return this.concurrentConnections;
		}

		public void setConcurrentConnections(Long concurrentConnections) {
			this.concurrentConnections = concurrentConnections;
		}
	}

	@Override
	public Class<EnableNetworkInterfaceQoSResponse> getResponseClass() {
		return EnableNetworkInterfaceQoSResponse.class;
	}

}
