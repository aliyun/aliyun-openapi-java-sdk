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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UnicomSignConfirmRequest extends RpcAcsRequest<UnicomSignConfirmResponse> {
	
	public UnicomSignConfirmRequest() {
		super("Smartag", "2018-03-13", "UnicomSignConfirm", "smartag");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<TmsOrder> tmsOrders;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<TmsOrder> getTmsOrders() {
		return this.tmsOrders;
	}

	public void setTmsOrders(List<TmsOrder> tmsOrders) {
		this.tmsOrders = tmsOrders;	
		if (tmsOrders != null) {
			for (int depth1 = 0; depth1 < tmsOrders.size(); depth1++) {
				putQueryParameter("TmsOrder." + (depth1 + 1) + ".TmsCode" , tmsOrders.get(depth1).getTmsCode());
				putQueryParameter("TmsOrder." + (depth1 + 1) + ".SigningTime" , tmsOrders.get(depth1).getSigningTime());
				putQueryParameter("TmsOrder." + (depth1 + 1) + ".TmsOrderCode" , tmsOrders.get(depth1).getTmsOrderCode());
				putQueryParameter("TmsOrder." + (depth1 + 1) + ".TradeId" , tmsOrders.get(depth1).getTradeId());
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

	public static class TmsOrder {

		private String tmsCode;

		private String signingTime;

		private String tmsOrderCode;

		private String tradeId;

		public String getTmsCode() {
			return this.tmsCode;
		}

		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}

		public String getSigningTime() {
			return this.signingTime;
		}

		public void setSigningTime(String signingTime) {
			this.signingTime = signingTime;
		}

		public String getTmsOrderCode() {
			return this.tmsOrderCode;
		}

		public void setTmsOrderCode(String tmsOrderCode) {
			this.tmsOrderCode = tmsOrderCode;
		}

		public String getTradeId() {
			return this.tradeId;
		}

		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}
	}

	@Override
	public Class<UnicomSignConfirmResponse> getResponseClass() {
		return UnicomSignConfirmResponse.class;
	}

}
