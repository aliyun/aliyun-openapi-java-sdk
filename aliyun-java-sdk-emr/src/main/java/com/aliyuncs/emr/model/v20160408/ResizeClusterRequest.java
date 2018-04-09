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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResizeClusterRequest extends RpcAcsRequest<ResizeClusterResponse> {
	
	public ResizeClusterRequest() {
		super("Emr", "2016-04-08", "ResizeCluster");
	}

	private Integer newMasterInstances;

	private Integer period;

	private Boolean autoRenew;

	private String coreInstanceType;

	private Integer newCoreInstances;

	private Integer newTaskInstances;

	private String clusterId;

	private String chargeType;

	public Integer getNewMasterInstances() {
		return this.newMasterInstances;
	}

	public void setNewMasterInstances(Integer newMasterInstances) {
		this.newMasterInstances = newMasterInstances;
		if(newMasterInstances != null){
			putQueryParameter("NewMasterInstances", newMasterInstances.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		if(coreInstanceType != null){
			putQueryParameter("CoreInstanceType", coreInstanceType);
		}
	}

	public Integer getNewCoreInstances() {
		return this.newCoreInstances;
	}

	public void setNewCoreInstances(Integer newCoreInstances) {
		this.newCoreInstances = newCoreInstances;
		if(newCoreInstances != null){
			putQueryParameter("NewCoreInstances", newCoreInstances.toString());
		}
	}

	public Integer getNewTaskInstances() {
		return this.newTaskInstances;
	}

	public void setNewTaskInstances(Integer newTaskInstances) {
		this.newTaskInstances = newTaskInstances;
		if(newTaskInstances != null){
			putQueryParameter("NewTaskInstances", newTaskInstances.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	@Override
	public Class<ResizeClusterResponse> getResponseClass() {
		return ResizeClusterResponse.class;
	}

}
