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
	   

	private Boolean autoAllocatePublicEip;

	private String modelName;

	private String resourceGroupId;

	private String modelBaseUrl;

	private String period;

	private String modelApiKey;

	private Boolean dryRun;

	private String dBClusterId;

	private String vSwitchId;

	private Boolean autoRenew;

	private String promotionCode;

	private String zoneId;

	private String applicationType;

	@SerializedName("components")
	private List<Components> components;

	private String securityGroupId;

	private String description;

	private Boolean autoUseCoupon;

	private String modelApi;

	private Boolean autoCreatePolarFs;

	private String aIDBClusterId;

	private String architecture;

	@SerializedName("endpoints")
	private List<Endpoints> endpoints;

	@SerializedName("memApplicationSpec")
	private MemApplicationSpec memApplicationSpec;

	private String modelFrom;

	private String usedTime;

	private String polarFSInstanceId;

	private String vpcId;

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

	public Boolean getAutoAllocatePublicEip() {
		return this.autoAllocatePublicEip;
	}

	public void setAutoAllocatePublicEip(Boolean autoAllocatePublicEip) {
		this.autoAllocatePublicEip = autoAllocatePublicEip;
		if(autoAllocatePublicEip != null){
			putQueryParameter("AutoAllocatePublicEip", autoAllocatePublicEip.toString());
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
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

	public String getModelBaseUrl() {
		return this.modelBaseUrl;
	}

	public void setModelBaseUrl(String modelBaseUrl) {
		this.modelBaseUrl = modelBaseUrl;
		if(modelBaseUrl != null){
			putQueryParameter("ModelBaseUrl", modelBaseUrl);
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

	public String getModelApiKey() {
		return this.modelApiKey;
	}

	public void setModelApiKey(String modelApiKey) {
		this.modelApiKey = modelApiKey;
		if(modelApiKey != null){
			putQueryParameter("ModelApiKey", modelApiKey);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
		if(promotionCode != null){
			putQueryParameter("PromotionCode", promotionCode);
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

	public List<Components> getComponents() {
		return this.components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;	
		if (components != null) {
			putQueryParameter("Components" , new Gson().toJson(components));
		}	
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
		}
	}

	public String getModelApi() {
		return this.modelApi;
	}

	public void setModelApi(String modelApi) {
		this.modelApi = modelApi;
		if(modelApi != null){
			putQueryParameter("ModelApi", modelApi);
		}
	}

	public Boolean getAutoCreatePolarFs() {
		return this.autoCreatePolarFs;
	}

	public void setAutoCreatePolarFs(Boolean autoCreatePolarFs) {
		this.autoCreatePolarFs = autoCreatePolarFs;
		if(autoCreatePolarFs != null){
			putQueryParameter("AutoCreatePolarFs", autoCreatePolarFs.toString());
		}
	}

	public String getAIDBClusterId() {
		return this.aIDBClusterId;
	}

	public void setAIDBClusterId(String aIDBClusterId) {
		this.aIDBClusterId = aIDBClusterId;
		if(aIDBClusterId != null){
			putQueryParameter("AIDBClusterId", aIDBClusterId);
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

	public List<Endpoints> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoints> endpoints) {
		this.endpoints = endpoints;	
		if (endpoints != null) {
			putQueryParameter("Endpoints" , new Gson().toJson(endpoints));
		}	
	}

	public MemApplicationSpec getMemApplicationSpec() {
		return this.memApplicationSpec;
	}

	public void setMemApplicationSpec(MemApplicationSpec memApplicationSpec) {
		this.memApplicationSpec = memApplicationSpec;	
		if (memApplicationSpec != null) {
			putQueryParameter("MemApplicationSpec" , new Gson().toJson(memApplicationSpec));
		}	
	}

	public String getModelFrom() {
		return this.modelFrom;
	}

	public void setModelFrom(String modelFrom) {
		this.modelFrom = modelFrom;
		if(modelFrom != null){
			putQueryParameter("ModelFrom", modelFrom);
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

	public String getPolarFSInstanceId() {
		return this.polarFSInstanceId;
	}

	public void setPolarFSInstanceId(String polarFSInstanceId) {
		this.polarFSInstanceId = polarFSInstanceId;
		if(polarFSInstanceId != null){
			putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
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

	public static class MemApplicationSpec {

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("DbName")
		private String dbName;

		@SerializedName("DbPassword")
		private String dbPassword;

		@SerializedName("GraphLlmModel")
		private String graphLlmModel;

		@SerializedName("LlmModel")
		private String llmModel;

		@SerializedName("EmbedderModelDimension")
		private Integer embedderModelDimension;

		@SerializedName("DbUser")
		private String dbUser;

		@SerializedName("Shard")
		private Integer shard;

		@SerializedName("EmbedderModel")
		private String embedderModel;

		@SerializedName("RerankerModel")
		private String rerankerModel;

		@SerializedName("EngineType")
		private String engineType;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getDbPassword() {
			return this.dbPassword;
		}

		public void setDbPassword(String dbPassword) {
			this.dbPassword = dbPassword;
		}

		public String getGraphLlmModel() {
			return this.graphLlmModel;
		}

		public void setGraphLlmModel(String graphLlmModel) {
			this.graphLlmModel = graphLlmModel;
		}

		public String getLlmModel() {
			return this.llmModel;
		}

		public void setLlmModel(String llmModel) {
			this.llmModel = llmModel;
		}

		public Integer getEmbedderModelDimension() {
			return this.embedderModelDimension;
		}

		public void setEmbedderModelDimension(Integer embedderModelDimension) {
			this.embedderModelDimension = embedderModelDimension;
		}

		public String getDbUser() {
			return this.dbUser;
		}

		public void setDbUser(String dbUser) {
			this.dbUser = dbUser;
		}

		public Integer getShard() {
			return this.shard;
		}

		public void setShard(Integer shard) {
			this.shard = shard;
		}

		public String getEmbedderModel() {
			return this.embedderModel;
		}

		public void setEmbedderModel(String embedderModel) {
			this.embedderModel = embedderModel;
		}

		public String getRerankerModel() {
			return this.rerankerModel;
		}

		public void setRerankerModel(String rerankerModel) {
			this.rerankerModel = rerankerModel;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}

	@Override
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
