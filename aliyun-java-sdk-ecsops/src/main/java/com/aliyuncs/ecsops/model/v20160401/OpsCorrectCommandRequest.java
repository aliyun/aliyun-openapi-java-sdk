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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCorrectCommandRequest extends RpcAcsRequest<OpsCorrectCommandResponse> {
	   

	private Long orderId;

	private String commandResult;

	private String commodityCode;

	private String resourceType;

	private Integer retryTimes;

	private String token;

	private String commandType;

	private String instanceId;

	private Long id;

	private String commandDetail;

	private String commandStatus;

	private String auditParamStr;
	public OpsCorrectCommandRequest() {
		super("Ecsops", "2016-04-01", "OpsCorrectCommand", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCommandResult() {
		return this.commandResult;
	}

	public void setCommandResult(String commandResult) {
		this.commandResult = commandResult;
		if(commandResult != null){
			putQueryParameter("CommandResult", commandResult);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
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

	public Integer getRetryTimes() {
		return this.retryTimes;
	}

	public void setRetryTimes(Integer retryTimes) {
		this.retryTimes = retryTimes;
		if(retryTimes != null){
			putQueryParameter("RetryTimes", retryTimes.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getCommandType() {
		return this.commandType;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
		if(commandType != null){
			putQueryParameter("CommandType", commandType);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getCommandDetail() {
		return this.commandDetail;
	}

	public void setCommandDetail(String commandDetail) {
		this.commandDetail = commandDetail;
		if(commandDetail != null){
			putQueryParameter("commandDetail", commandDetail);
		}
	}

	public String getCommandStatus() {
		return this.commandStatus;
	}

	public void setCommandStatus(String commandStatus) {
		this.commandStatus = commandStatus;
		if(commandStatus != null){
			putQueryParameter("commandStatus", commandStatus);
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
	public Class<OpsCorrectCommandResponse> getResponseClass() {
		return OpsCorrectCommandResponse.class;
	}

}
