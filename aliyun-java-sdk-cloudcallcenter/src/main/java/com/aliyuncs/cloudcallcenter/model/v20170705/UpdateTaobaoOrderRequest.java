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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaobaoOrderRequest extends RpcAcsRequest<UpdateTaobaoOrderResponse> {
	
	public UpdateTaobaoOrderRequest() {
		super("CloudCallCenter", "2017-07-05", "UpdateTaobaoOrder", "CloudCallCenter", "innerAPI");
	}

	private List<Order> orders;

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;	
		if (orders != null) {
			for (int depth1 = 0; depth1 < orders.size(); depth1++) {
				putQueryParameter("Order." + (depth1 + 1) + ".confirmedAccount" , orders.get(depth1).getConfirmedAccount());
				putQueryParameter("Order." + (depth1 + 1) + ".consumedOutcomingAccount" , orders.get(depth1).getConsumedOutcomingAccount());
				putQueryParameter("Order." + (depth1 + 1) + ".id" , orders.get(depth1).getId());
				putQueryParameter("Order." + (depth1 + 1) + ".lastCalculateTime" , orders.get(depth1).getLastCalculateTime());
				putQueryParameter("Order." + (depth1 + 1) + ".consumedIncomingAccount" , orders.get(depth1).getConsumedIncomingAccount());
				putQueryParameter("Order." + (depth1 + 1) + ".Status" , orders.get(depth1).getStatus());
			}
		}	
	}

	public static class Order {

		private Integer confirmedAccount;

		private Integer consumedOutcomingAccount;

		private Long id;

		private Long lastCalculateTime;

		private Integer consumedIncomingAccount;

		private Integer status;

		public Integer getConfirmedAccount() {
			return this.confirmedAccount;
		}

		public void setConfirmedAccount(Integer confirmedAccount) {
			this.confirmedAccount = confirmedAccount;
		}

		public Integer getConsumedOutcomingAccount() {
			return this.consumedOutcomingAccount;
		}

		public void setConsumedOutcomingAccount(Integer consumedOutcomingAccount) {
			this.consumedOutcomingAccount = consumedOutcomingAccount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getLastCalculateTime() {
			return this.lastCalculateTime;
		}

		public void setLastCalculateTime(Long lastCalculateTime) {
			this.lastCalculateTime = lastCalculateTime;
		}

		public Integer getConsumedIncomingAccount() {
			return this.consumedIncomingAccount;
		}

		public void setConsumedIncomingAccount(Integer consumedIncomingAccount) {
			this.consumedIncomingAccount = consumedIncomingAccount;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateTaobaoOrderResponse> getResponseClass() {
		return UpdateTaobaoOrderResponse.class;
	}

}
