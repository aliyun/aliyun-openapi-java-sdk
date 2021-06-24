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
public class OpsSubmitDeployTaskRequest extends RpcAcsRequest<OpsSubmitDeployTaskResponse> {
	   

	private String snList;

	private String instanceType;

	private String product;

	private String priority;

	private String bizType;

	private String controlGroup;

	private String az;

	private String auditParamStr;
	public OpsSubmitDeployTaskRequest() {
		super("Ecsops", "2016-04-01", "OpsSubmitDeployTask", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSnList() {
		return this.snList;
	}

	public void setSnList(String snList) {
		this.snList = snList;
		if(snList != null){
			putQueryParameter("SnList", snList);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getControlGroup() {
		return this.controlGroup;
	}

	public void setControlGroup(String controlGroup) {
		this.controlGroup = controlGroup;
		if(controlGroup != null){
			putQueryParameter("ControlGroup", controlGroup);
		}
	}

	public String getAz() {
		return this.az;
	}

	public void setAz(String az) {
		this.az = az;
		if(az != null){
			putQueryParameter("Az", az);
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
	public Class<OpsSubmitDeployTaskResponse> getResponseClass() {
		return OpsSubmitDeployTaskResponse.class;
	}

}
