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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetTaobaoOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaobaoOrderResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<TaobaoOrder> orders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<TaobaoOrder> getOrders() {
		return this.orders;
	}

	public void setOrders(List<TaobaoOrder> orders) {
		this.orders = orders;
	}

	public static class TaobaoOrder {

		private Long id;

		private Integer type;

		private Integer incomingAccount;

		private Integer outcomingAccount;

		private Integer consumedIncomingAccount;

		private Integer consumedOutcomingAccount;

		private Integer confirmedAccount;

		private Long lastCalculateTime;

		private Long expiresIn;

		private Long orderRecordId;

		private Long orderId;

		private Long parentOrderId;

		private Long planId;

		private Long startDate;

		private Integer status;

		private Float prodFee;

		private String taobaoNick;

		private Long taobaoUid;

		private Long payDate;

		private Float factMoney;

		private String articleCode;

		private String articleItemCode;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getIncomingAccount() {
			return this.incomingAccount;
		}

		public void setIncomingAccount(Integer incomingAccount) {
			this.incomingAccount = incomingAccount;
		}

		public Integer getOutcomingAccount() {
			return this.outcomingAccount;
		}

		public void setOutcomingAccount(Integer outcomingAccount) {
			this.outcomingAccount = outcomingAccount;
		}

		public Integer getConsumedIncomingAccount() {
			return this.consumedIncomingAccount;
		}

		public void setConsumedIncomingAccount(Integer consumedIncomingAccount) {
			this.consumedIncomingAccount = consumedIncomingAccount;
		}

		public Integer getConsumedOutcomingAccount() {
			return this.consumedOutcomingAccount;
		}

		public void setConsumedOutcomingAccount(Integer consumedOutcomingAccount) {
			this.consumedOutcomingAccount = consumedOutcomingAccount;
		}

		public Integer getConfirmedAccount() {
			return this.confirmedAccount;
		}

		public void setConfirmedAccount(Integer confirmedAccount) {
			this.confirmedAccount = confirmedAccount;
		}

		public Long getLastCalculateTime() {
			return this.lastCalculateTime;
		}

		public void setLastCalculateTime(Long lastCalculateTime) {
			this.lastCalculateTime = lastCalculateTime;
		}

		public Long getExpiresIn() {
			return this.expiresIn;
		}

		public void setExpiresIn(Long expiresIn) {
			this.expiresIn = expiresIn;
		}

		public Long getOrderRecordId() {
			return this.orderRecordId;
		}

		public void setOrderRecordId(Long orderRecordId) {
			this.orderRecordId = orderRecordId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getParentOrderId() {
			return this.parentOrderId;
		}

		public void setParentOrderId(Long parentOrderId) {
			this.parentOrderId = parentOrderId;
		}

		public Long getPlanId() {
			return this.planId;
		}

		public void setPlanId(Long planId) {
			this.planId = planId;
		}

		public Long getStartDate() {
			return this.startDate;
		}

		public void setStartDate(Long startDate) {
			this.startDate = startDate;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Float getProdFee() {
			return this.prodFee;
		}

		public void setProdFee(Float prodFee) {
			this.prodFee = prodFee;
		}

		public String getTaobaoNick() {
			return this.taobaoNick;
		}

		public void setTaobaoNick(String taobaoNick) {
			this.taobaoNick = taobaoNick;
		}

		public Long getTaobaoUid() {
			return this.taobaoUid;
		}

		public void setTaobaoUid(Long taobaoUid) {
			this.taobaoUid = taobaoUid;
		}

		public Long getPayDate() {
			return this.payDate;
		}

		public void setPayDate(Long payDate) {
			this.payDate = payDate;
		}

		public Float getFactMoney() {
			return this.factMoney;
		}

		public void setFactMoney(Float factMoney) {
			this.factMoney = factMoney;
		}

		public String getArticleCode() {
			return this.articleCode;
		}

		public void setArticleCode(String articleCode) {
			this.articleCode = articleCode;
		}

		public String getArticleItemCode() {
			return this.articleItemCode;
		}

		public void setArticleItemCode(String articleItemCode) {
			this.articleItemCode = articleItemCode;
		}
	}

	@Override
	public GetTaobaoOrderResponse getInstance(UnmarshallerContext context) {
		return	GetTaobaoOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
