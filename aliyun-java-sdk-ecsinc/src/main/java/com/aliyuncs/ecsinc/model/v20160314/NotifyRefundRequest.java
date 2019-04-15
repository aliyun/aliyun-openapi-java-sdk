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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class NotifyRefundRequest extends RpcAcsRequest<NotifyRefundResponse> {
	
	public NotifyRefundRequest() {
		super("EcsInc", "2016-03-14", "NotifyRefund", "ecs", "innerAPI");
	}

	private String refundExtendParams;

	private Long resourceOwnerId;

	private String instanceId;

	private String refundType;

	private String resourceOwnerAccount;

	private Long orderId;

	private String ownerAccount;

	private List<Long> orderIdss;

	private Long ownerId;

	private String resourceType;

	public String getRefundExtendParams() {
		return this.refundExtendParams;
	}

	public void setRefundExtendParams(String refundExtendParams) {
		this.refundExtendParams = refundExtendParams;
		if(refundExtendParams != null){
			putQueryParameter("RefundExtendParams", refundExtendParams);
		}
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getRefundType() {
		return this.refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
		if(refundType != null){
			putQueryParameter("RefundType", refundType);
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
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

	public List<Long> getOrderIdss() {
		return this.orderIdss;
	}

	public void setOrderIdss(List<Long> orderIdss) {
		this.orderIdss = orderIdss;	
		if (orderIdss != null) {
			for (int i = 0; i < orderIdss.size(); i++) {
				putQueryParameter("OrderIds." + (i + 1) , orderIdss.get(i));
			}
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	@Override
	public Class<NotifyRefundResponse> getResponseClass() {
		return NotifyRefundResponse.class;
	}

}
