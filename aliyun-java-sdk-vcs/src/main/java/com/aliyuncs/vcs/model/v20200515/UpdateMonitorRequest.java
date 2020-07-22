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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMonitorRequest extends RpcAcsRequest<UpdateMonitorResponse> {
	   

	private String corpId;

	private String description;

	private String ruleName;

	private String picOperateType;

	private String attributeName;

	private String attributeOperateType;

	private String ruleExpression;

	private String taskId;

	private String deviceOperateType;

	private String picList;

	private String attributeValueList;

	private String deviceList;

	private String algorithmVendor;
	public UpdateMonitorRequest() {
		super("Vcs", "2020-05-15", "UpdateMonitor", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public String getPicOperateType() {
		return this.picOperateType;
	}

	public void setPicOperateType(String picOperateType) {
		this.picOperateType = picOperateType;
		if(picOperateType != null){
			putBodyParameter("PicOperateType", picOperateType);
		}
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
		if(attributeName != null){
			putBodyParameter("AttributeName", attributeName);
		}
	}

	public String getAttributeOperateType() {
		return this.attributeOperateType;
	}

	public void setAttributeOperateType(String attributeOperateType) {
		this.attributeOperateType = attributeOperateType;
		if(attributeOperateType != null){
			putBodyParameter("AttributeOperateType", attributeOperateType);
		}
	}

	public String getRuleExpression() {
		return this.ruleExpression;
	}

	public void setRuleExpression(String ruleExpression) {
		this.ruleExpression = ruleExpression;
		if(ruleExpression != null){
			putBodyParameter("RuleExpression", ruleExpression);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getDeviceOperateType() {
		return this.deviceOperateType;
	}

	public void setDeviceOperateType(String deviceOperateType) {
		this.deviceOperateType = deviceOperateType;
		if(deviceOperateType != null){
			putBodyParameter("DeviceOperateType", deviceOperateType);
		}
	}

	public String getPicList() {
		return this.picList;
	}

	public void setPicList(String picList) {
		this.picList = picList;
		if(picList != null){
			putBodyParameter("PicList", picList);
		}
	}

	public String getAttributeValueList() {
		return this.attributeValueList;
	}

	public void setAttributeValueList(String attributeValueList) {
		this.attributeValueList = attributeValueList;
		if(attributeValueList != null){
			putBodyParameter("AttributeValueList", attributeValueList);
		}
	}

	public String getDeviceList() {
		return this.deviceList;
	}

	public void setDeviceList(String deviceList) {
		this.deviceList = deviceList;
		if(deviceList != null){
			putBodyParameter("DeviceList", deviceList);
		}
	}

	public String getAlgorithmVendor() {
		return this.algorithmVendor;
	}

	public void setAlgorithmVendor(String algorithmVendor) {
		this.algorithmVendor = algorithmVendor;
		if(algorithmVendor != null){
			putBodyParameter("AlgorithmVendor", algorithmVendor);
		}
	}

	@Override
	public Class<UpdateMonitorResponse> getResponseClass() {
		return UpdateMonitorResponse.class;
	}

}
