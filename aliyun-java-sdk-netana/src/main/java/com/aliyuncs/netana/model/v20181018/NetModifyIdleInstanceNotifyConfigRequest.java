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

package com.aliyuncs.netana.model.v20181018;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.netana.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class NetModifyIdleInstanceNotifyConfigRequest extends RpcAcsRequest<NetModifyIdleInstanceNotifyConfigResponse> {
	   

	private Long resourceOwnerId;

	private Long id;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<NotifyConfigInfo> notifyConfigInfo;
	public NetModifyIdleInstanceNotifyConfigRequest() {
		super("Netana", "2018-10-18", "NetModifyIdleInstanceNotifyConfig", "netana");
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public List<NotifyConfigInfo> getNotifyConfigInfo() {
		return this.notifyConfigInfo;
	}

	public void setNotifyConfigInfo(List<NotifyConfigInfo> notifyConfigInfo) {
		this.notifyConfigInfo = notifyConfigInfo;	
		if (notifyConfigInfo != null) {
			for (int depth1 = 0; depth1 < notifyConfigInfo.size(); depth1++) {
				if (notifyConfigInfo.get(depth1) != null) {
					
						putQueryParameter("NotifyConfigInfo." + (depth1 + 1) + ".ProductId" , notifyConfigInfo.get(depth1).getProductId());
						putQueryParameter("NotifyConfigInfo." + (depth1 + 1) + ".Period" , notifyConfigInfo.get(depth1).getPeriod());
						putQueryParameter("NotifyConfigInfo." + (depth1 + 1) + ".Status" , notifyConfigInfo.get(depth1).getStatus());
				}
			}
		}	
	}

	public static class NotifyConfigInfo {

		private String productId;

		private Integer period;

		private Boolean status;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}
	}

	@Override
	public Class<NetModifyIdleInstanceNotifyConfigResponse> getResponseClass() {
		return NetModifyIdleInstanceNotifyConfigResponse.class;
	}

}
