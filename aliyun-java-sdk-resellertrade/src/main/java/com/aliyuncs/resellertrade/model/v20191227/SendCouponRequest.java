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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendCouponRequest extends RpcAcsRequest<SendCouponResponse> {
	   

	private Long sellerId;

	private String fromApp;

	private String requestId;

	private List<UserAmountModelList> userAmountModelLists;

	private Long bid;

	private Long templateId;

	private String operator;
	public SendCouponRequest() {
		super("ResellerTrade", "2019-12-27", "SendCoupon");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
		if(sellerId != null){
			putBodyParameter("SellerId", sellerId.toString());
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public List<UserAmountModelList> getUserAmountModelLists() {
		return this.userAmountModelLists;
	}

	public void setUserAmountModelLists(List<UserAmountModelList> userAmountModelLists) {
		this.userAmountModelLists = userAmountModelLists;	
		if (userAmountModelLists != null) {
			for (int depth1 = 0; depth1 < userAmountModelLists.size(); depth1++) {
				putBodyParameter("UserAmountModelList." + (depth1 + 1) + ".Uid" , userAmountModelLists.get(depth1).getUid());
				putBodyParameter("UserAmountModelList." + (depth1 + 1) + ".YouhuiId" , userAmountModelLists.get(depth1).getYouhuiId());
				putBodyParameter("UserAmountModelList." + (depth1 + 1) + ".Amount" , userAmountModelLists.get(depth1).getAmount());
				putBodyParameter("UserAmountModelList." + (depth1 + 1) + ".UserId" , userAmountModelLists.get(depth1).getUserId());
			}
		}	
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
		if(bid != null){
			putBodyParameter("Bid", bid.toString());
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public static class UserAmountModelList {

		private Long uid;

		private Long youhuiId;

		private Double amount;

		private Long userId;

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public Long getYouhuiId() {
			return this.youhuiId;
		}

		public void setYouhuiId(Long youhuiId) {
			this.youhuiId = youhuiId;
		}

		public Double getAmount() {
			return this.amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<SendCouponResponse> getResponseClass() {
		return SendCouponResponse.class;
	}

}
