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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationRequest extends RpcAcsRequest<CreateApplicationResponse> {
	   

	@SerializedName("components")
	private List<Components> components;

	private String description;

	private String resourceGroupId;

	private String architecture;

	private String period;

	@SerializedName("endpoints")
	private List<Endpoints> endpoints;

	private Boolean dryRun;

	private String dBClusterId;

	private String usedTime;

	private String vSwitchId;

	private String polarFSInstanceId;

	private Boolean autoRenew;

	private String vpcId;

	private String zoneId;

	private String applicationType;

	private String payType;
	public CreateApplicationRequest() {
		super("polardb", "2017-08-01", "CreateApplication", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Components> getComponents() {
		return this.components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;	
		if (components != null) {
			putQueryParameter("Components" , new Gson().toJson(components));
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public List<Endpoints> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoints> endpoints) {
		this.endpoints = endpoints;	
		if (endpoints != null) {
			putQueryParameter("Endpoints" , new Gson().toJson(endpoints));
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPolarFSInstanceId() {
		return this.polarFSInstanceId;
	}

	public void setPolarFSInstanceId(String polarFSInstanceId) {
		this.polarFSInstanceId = polarFSInstanceId;
		if(polarFSInstanceId != null){
			putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public static class Components {

		@SerializedName("ComponentReplica")
		private Long componentReplica;

		@SerializedName("SecurityIPNetType")
		private String securityIPNetType;

		@SerializedName("ComponentMaxReplica")
		private Long componentMaxReplica;

		@SerializedName("ScaleMax")
		private String scaleMax;

		@SerializedName("ParameterTemplateId")
		private String parameterTemplateId;

		@SerializedName("SecurityIPList")
		private String securityIPList;

		@SerializedName("ComponentType")
		private String componentType;

		@SerializedName("SecurityIPType")
		private String securityIPType;

		@SerializedName("ComponentClass")
		private String componentClass;

		@SerializedName("Parameters")
		private String parameters;

		@SerializedName("SecurityGroups")
		private String securityGroups;

		@SerializedName("SecurityIPArrayName")
		private String securityIPArrayName;

		@SerializedName("ScaleMin")
		private String scaleMin;

		public Long getComponentReplica() {
			return this.componentReplica;
		}

		public void setComponentReplica(Long componentReplica) {
			this.componentReplica = componentReplica;
		}

		public String getSecurityIPNetType() {
			return this.securityIPNetType;
		}

		public void setSecurityIPNetType(String securityIPNetType) {
			this.securityIPNetType = securityIPNetType;
		}

		public Long getComponentMaxReplica() {
			return this.componentMaxReplica;
		}

		public void setComponentMaxReplica(Long componentMaxReplica) {
			this.componentMaxReplica = componentMaxReplica;
		}

		public String getScaleMax() {
			return this.scaleMax;
		}

		public void setScaleMax(String scaleMax) {
			this.scaleMax = scaleMax;
		}

		public String getParameterTemplateId() {
			return this.parameterTemplateId;
		}

		public void setParameterTemplateId(String parameterTemplateId) {
			this.parameterTemplateId = parameterTemplateId;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getSecurityIPType() {
			return this.securityIPType;
		}

		public void setSecurityIPType(String securityIPType) {
			this.securityIPType = securityIPType;
		}

		public String getComponentClass() {
			return this.componentClass;
		}

		public void setComponentClass(String componentClass) {
			this.componentClass = componentClass;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getSecurityGroups() {
			return this.securityGroups;
		}

		public void setSecurityGroups(String securityGroups) {
			this.securityGroups = securityGroups;
		}

		public String getSecurityIPArrayName() {
			return this.securityIPArrayName;
		}

		public void setSecurityIPArrayName(String securityIPArrayName) {
			this.securityIPArrayName = securityIPArrayName;
		}

		public String getScaleMin() {
			return this.scaleMin;
		}

		public void setScaleMin(String scaleMin) {
			this.scaleMin = scaleMin;
		}
	}

	public static class Endpoints {

		@SerializedName("EndpointType")
		private String endpointType;

		@SerializedName("Description")
		private String description;

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
