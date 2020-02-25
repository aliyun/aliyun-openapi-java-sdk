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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class NotifyWithholdFundRequest extends RpcAcsRequest<NotifyWithholdFundResponse> {
	   

	private Long amount;

	private String payTypes;

	private String tenantOrderId;

	private String requestId;

	private String operationDate;

	private String channelId;
	public NotifyWithholdFundRequest() {
		super("linkedmall", "2018-01-16", "NotifyWithholdFund");
		setMethod(MethodType.POST);
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public String getPayTypes() {
		return this.payTypes;
	}

	public void setPayTypes(String payTypes) {
		this.payTypes = payTypes;
		if(payTypes != null){
			putQueryParameter("PayTypes", payTypes);
		}
	}

	public String getTenantOrderId() {
		return this.tenantOrderId;
	}

	public void setTenantOrderId(String tenantOrderId) {
		this.tenantOrderId = tenantOrderId;
		if(tenantOrderId != null){
			putQueryParameter("TenantOrderId", tenantOrderId);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getOperationDate() {
		return this.operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
		if(operationDate != null){
			putQueryParameter("OperationDate", operationDate);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<NotifyWithholdFundResponse> getResponseClass() {
		return NotifyWithholdFundResponse.class;
	}

}
