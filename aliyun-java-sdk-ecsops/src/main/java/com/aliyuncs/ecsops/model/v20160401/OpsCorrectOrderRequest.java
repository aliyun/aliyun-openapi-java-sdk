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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCorrectOrderRequest extends RpcAcsRequest<OpsCorrectOrderResponse> {
	   

	private Integer actionType;

	private Long orderId;

	private String orderMessage;

	private String instanceResultMessage;

	private Integer retryTimes;

	private Long id;

	private Integer chargeType;

	private Integer status;

	private String auditParamStr;
	public OpsCorrectOrderRequest() {
		super("Ecsops", "2016-04-01", "OpsCorrectOrder", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getActionType() {
		return this.actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType.toString());
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

	public String getOrderMessage() {
		return this.orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
		if(orderMessage != null){
			putQueryParameter("OrderMessage", orderMessage);
		}
	}

	public String getInstanceResultMessage() {
		return this.instanceResultMessage;
	}

	public void setInstanceResultMessage(String instanceResultMessage) {
		this.instanceResultMessage = instanceResultMessage;
		if(instanceResultMessage != null){
			putQueryParameter("InstanceResultMessage", instanceResultMessage);
		}
	}

	public Integer getRetryTimes() {
		return this.retryTimes;
	}

	public void setRetryTimes(Integer retryTimes) {
		this.retryTimes = retryTimes;
		if(retryTimes != null){
			putQueryParameter("RetryTimes", retryTimes.toString());
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

	public Integer getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCorrectOrderResponse> getResponseClass() {
		return OpsCorrectOrderResponse.class;
	}

}
