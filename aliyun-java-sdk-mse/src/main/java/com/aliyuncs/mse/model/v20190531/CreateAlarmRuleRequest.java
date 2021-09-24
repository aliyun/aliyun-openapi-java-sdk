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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAlarmRuleRequest extends RpcAcsRequest<CreateAlarmRuleResponse> {
	   

	private Integer nValue;

	private String alarmItem;

	private String operator;

	private String alarmAliasName;

	private String instanceId;

	private String contactGroupIds;

	private String alertWay;

	private String aggregates;

	private Float value;
	public CreateAlarmRuleRequest() {
		super("mse", "2019-05-31", "CreateAlarmRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getNValue() {
		return this.nValue;
	}

	public void setNValue(Integer nValue) {
		this.nValue = nValue;
		if(nValue != null){
			putQueryParameter("NValue", nValue.toString());
		}
	}

	public String getAlarmItem() {
		return this.alarmItem;
	}

	public void setAlarmItem(String alarmItem) {
		this.alarmItem = alarmItem;
		if(alarmItem != null){
			putQueryParameter("AlarmItem", alarmItem);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getAlarmAliasName() {
		return this.alarmAliasName;
	}

	public void setAlarmAliasName(String alarmAliasName) {
		this.alarmAliasName = alarmAliasName;
		if(alarmAliasName != null){
			putQueryParameter("AlarmAliasName", alarmAliasName);
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

	public String getContactGroupIds() {
		return this.contactGroupIds;
	}

	public void setContactGroupIds(String contactGroupIds) {
		this.contactGroupIds = contactGroupIds;
		if(contactGroupIds != null){
			putQueryParameter("ContactGroupIds", contactGroupIds);
		}
	}

	public String getAlertWay() {
		return this.alertWay;
	}

	public void setAlertWay(String alertWay) {
		this.alertWay = alertWay;
		if(alertWay != null){
			putQueryParameter("AlertWay", alertWay);
		}
	}

	public String getAggregates() {
		return this.aggregates;
	}

	public void setAggregates(String aggregates) {
		this.aggregates = aggregates;
		if(aggregates != null){
			putQueryParameter("Aggregates", aggregates);
		}
	}

	public Float getValue() {
		return this.value;
	}

	public void setValue(Float value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value.toString());
		}
	}

	@Override
	public Class<CreateAlarmRuleResponse> getResponseClass() {
		return CreateAlarmRuleResponse.class;
	}

}
