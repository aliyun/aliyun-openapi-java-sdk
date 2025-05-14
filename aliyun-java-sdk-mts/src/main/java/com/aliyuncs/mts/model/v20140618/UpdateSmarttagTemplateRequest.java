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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateSmarttagTemplateRequest extends RpcAcsRequest<UpdateSmarttagTemplateResponse> {
	   

	private Long resourceOwnerId;

	private String knowledgeConfig;

	private String industry;

	private String labelVersion;

	private String scene;

	private String templateConfig;

	private String faceCustomParamsConfig;

	private String templateName;

	private Boolean isDefault;

	private String faceCategoryIds;

	private String keywordConfig;

	private String landmarkGroupIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String objectGroupIds;

	private Long ownerId;

	private String templateId;

	private String analyseTypes;

	private String labelType;
	public UpdateSmarttagTemplateRequest() {
		super("Mts", "2014-06-18", "UpdateSmarttagTemplate", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getKnowledgeConfig() {
		return this.knowledgeConfig;
	}

	public void setKnowledgeConfig(String knowledgeConfig) {
		this.knowledgeConfig = knowledgeConfig;
		if(knowledgeConfig != null){
			putQueryParameter("KnowledgeConfig", knowledgeConfig);
		}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putQueryParameter("Industry", industry);
		}
	}

	public String getLabelVersion() {
		return this.labelVersion;
	}

	public void setLabelVersion(String labelVersion) {
		this.labelVersion = labelVersion;
		if(labelVersion != null){
			putQueryParameter("LabelVersion", labelVersion);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getTemplateConfig() {
		return this.templateConfig;
	}

	public void setTemplateConfig(String templateConfig) {
		this.templateConfig = templateConfig;
		if(templateConfig != null){
			putQueryParameter("TemplateConfig", templateConfig);
		}
	}

	public String getFaceCustomParamsConfig() {
		return this.faceCustomParamsConfig;
	}

	public void setFaceCustomParamsConfig(String faceCustomParamsConfig) {
		this.faceCustomParamsConfig = faceCustomParamsConfig;
		if(faceCustomParamsConfig != null){
			putQueryParameter("FaceCustomParamsConfig", faceCustomParamsConfig);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		if(isDefault != null){
			putQueryParameter("IsDefault", isDefault.toString());
		}
	}

	public String getFaceCategoryIds() {
		return this.faceCategoryIds;
	}

	public void setFaceCategoryIds(String faceCategoryIds) {
		this.faceCategoryIds = faceCategoryIds;
		if(faceCategoryIds != null){
			putQueryParameter("FaceCategoryIds", faceCategoryIds);
		}
	}

	public String getKeywordConfig() {
		return this.keywordConfig;
	}

	public void setKeywordConfig(String keywordConfig) {
		this.keywordConfig = keywordConfig;
		if(keywordConfig != null){
			putQueryParameter("KeywordConfig", keywordConfig);
		}
	}

	public String getLandmarkGroupIds() {
		return this.landmarkGroupIds;
	}

	public void setLandmarkGroupIds(String landmarkGroupIds) {
		this.landmarkGroupIds = landmarkGroupIds;
		if(landmarkGroupIds != null){
			putQueryParameter("LandmarkGroupIds", landmarkGroupIds);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getObjectGroupIds() {
		return this.objectGroupIds;
	}

	public void setObjectGroupIds(String objectGroupIds) {
		this.objectGroupIds = objectGroupIds;
		if(objectGroupIds != null){
			putQueryParameter("ObjectGroupIds", objectGroupIds);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getAnalyseTypes() {
		return this.analyseTypes;
	}

	public void setAnalyseTypes(String analyseTypes) {
		this.analyseTypes = analyseTypes;
		if(analyseTypes != null){
			putQueryParameter("AnalyseTypes", analyseTypes);
		}
	}

	public String getLabelType() {
		return this.labelType;
	}

	public void setLabelType(String labelType) {
		this.labelType = labelType;
		if(labelType != null){
			putQueryParameter("LabelType", labelType);
		}
	}

	@Override
	public Class<UpdateSmarttagTemplateResponse> getResponseClass() {
		return UpdateSmarttagTemplateResponse.class;
	}

}
