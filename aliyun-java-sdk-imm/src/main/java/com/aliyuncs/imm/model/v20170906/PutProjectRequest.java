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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutProjectRequest extends RpcAcsRequest<PutProjectResponse> {
	
	public PutProjectRequest() {
		super("imm", "2017-09-06", "PutProject", "2017-09-06");
	}

	private Integer cU;

	private String serviceRole;

	private String project;

	private String billingType;

	private String type;

	public Integer getCU() {
		return this.cU;
	}

	public void setCU(Integer cU) {
		this.cU = cU;
		if(cU != null){
			putQueryParameter("CU", cU.toString());
		}
	}

	public String getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
		if(serviceRole != null){
			putQueryParameter("ServiceRole", serviceRole);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getBillingType() {
		return this.billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
		if(billingType != null){
			putQueryParameter("BillingType", billingType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<PutProjectResponse> getResponseClass() {
		return PutProjectResponse.class;
	}

}
