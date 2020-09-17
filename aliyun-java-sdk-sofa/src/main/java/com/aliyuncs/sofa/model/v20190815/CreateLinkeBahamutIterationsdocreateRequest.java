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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutIterationsdocreateRequest extends RpcAcsRequest<CreateLinkeBahamutIterationsdocreateResponse> {
	   

	private List<String> workItemsRepeatLists;

	private String project;

	private String appMembers;

	private String deliverId;

	private Boolean compatible;

	private String userAccount;

	private String creatorSysName;

	private List<String> pubOwnersRepeatLists;

	private List<String> auditProdsRepeatLists;

	private String greenChannel;

	private Boolean isBranchRelease;

	private String name;

	private String branchPostfixMap;

	private String iterationId;

	private List<String> appNamesRepeatLists;

	private String tecRiskOwner;

	private String aoneCodeChangeId;

	private String iterationManager;

	private String tenantId;

	private List<String> versionsRepeatLists;

	private List<String> iterationMembersRepeatLists;

	private String prodCode;

	private String iterationTemplateId;

	private String testOwner;

	private String branchMap;

	private String prePubOwner;

	private String prodVersion;

	private String tagMap;

	private Boolean tagAndMergeMasterWhenEmergency;
	public CreateLinkeBahamutIterationsdocreateRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutIterationsdocreate", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getWorkItemsRepeatLists() {
		return this.workItemsRepeatLists;
	}

	public void setWorkItemsRepeatLists(List<String> workItemsRepeatLists) {
		this.workItemsRepeatLists = workItemsRepeatLists;	
		if (workItemsRepeatLists != null) {
			for (int i = 0; i < workItemsRepeatLists.size(); i++) {
				putBodyParameter("WorkItemsRepeatList." + (i + 1) , workItemsRepeatLists.get(i));
			}
		}	
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putBodyParameter("Project", project);
		}
	}

	public String getAppMembers() {
		return this.appMembers;
	}

	public void setAppMembers(String appMembers) {
		this.appMembers = appMembers;
		if(appMembers != null){
			putBodyParameter("AppMembers", appMembers);
		}
	}

	public String getDeliverId() {
		return this.deliverId;
	}

	public void setDeliverId(String deliverId) {
		this.deliverId = deliverId;
		if(deliverId != null){
			putBodyParameter("DeliverId", deliverId);
		}
	}

	public Boolean getCompatible() {
		return this.compatible;
	}

	public void setCompatible(Boolean compatible) {
		this.compatible = compatible;
		if(compatible != null){
			putBodyParameter("Compatible", compatible.toString());
		}
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
		if(userAccount != null){
			putBodyParameter("UserAccount", userAccount);
		}
	}

	public String getCreatorSysName() {
		return this.creatorSysName;
	}

	public void setCreatorSysName(String creatorSysName) {
		this.creatorSysName = creatorSysName;
		if(creatorSysName != null){
			putBodyParameter("CreatorSysName", creatorSysName);
		}
	}

	public List<String> getPubOwnersRepeatLists() {
		return this.pubOwnersRepeatLists;
	}

	public void setPubOwnersRepeatLists(List<String> pubOwnersRepeatLists) {
		this.pubOwnersRepeatLists = pubOwnersRepeatLists;	
		if (pubOwnersRepeatLists != null) {
			for (int i = 0; i < pubOwnersRepeatLists.size(); i++) {
				putBodyParameter("PubOwnersRepeatList." + (i + 1) , pubOwnersRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAuditProdsRepeatLists() {
		return this.auditProdsRepeatLists;
	}

	public void setAuditProdsRepeatLists(List<String> auditProdsRepeatLists) {
		this.auditProdsRepeatLists = auditProdsRepeatLists;	
		if (auditProdsRepeatLists != null) {
			for (int i = 0; i < auditProdsRepeatLists.size(); i++) {
				putBodyParameter("AuditProdsRepeatList." + (i + 1) , auditProdsRepeatLists.get(i));
			}
		}	
	}

	public String getGreenChannel() {
		return this.greenChannel;
	}

	public void setGreenChannel(String greenChannel) {
		this.greenChannel = greenChannel;
		if(greenChannel != null){
			putBodyParameter("GreenChannel", greenChannel);
		}
	}

	public Boolean getIsBranchRelease() {
		return this.isBranchRelease;
	}

	public void setIsBranchRelease(Boolean isBranchRelease) {
		this.isBranchRelease = isBranchRelease;
		if(isBranchRelease != null){
			putBodyParameter("IsBranchRelease", isBranchRelease.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getBranchPostfixMap() {
		return this.branchPostfixMap;
	}

	public void setBranchPostfixMap(String branchPostfixMap) {
		this.branchPostfixMap = branchPostfixMap;
		if(branchPostfixMap != null){
			putBodyParameter("BranchPostfixMap", branchPostfixMap);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	public List<String> getAppNamesRepeatLists() {
		return this.appNamesRepeatLists;
	}

	public void setAppNamesRepeatLists(List<String> appNamesRepeatLists) {
		this.appNamesRepeatLists = appNamesRepeatLists;	
		if (appNamesRepeatLists != null) {
			for (int i = 0; i < appNamesRepeatLists.size(); i++) {
				putBodyParameter("AppNamesRepeatList." + (i + 1) , appNamesRepeatLists.get(i));
			}
		}	
	}

	public String getTecRiskOwner() {
		return this.tecRiskOwner;
	}

	public void setTecRiskOwner(String tecRiskOwner) {
		this.tecRiskOwner = tecRiskOwner;
		if(tecRiskOwner != null){
			putBodyParameter("TecRiskOwner", tecRiskOwner);
		}
	}

	public String getAoneCodeChangeId() {
		return this.aoneCodeChangeId;
	}

	public void setAoneCodeChangeId(String aoneCodeChangeId) {
		this.aoneCodeChangeId = aoneCodeChangeId;
		if(aoneCodeChangeId != null){
			putBodyParameter("AoneCodeChangeId", aoneCodeChangeId);
		}
	}

	public String getIterationManager() {
		return this.iterationManager;
	}

	public void setIterationManager(String iterationManager) {
		this.iterationManager = iterationManager;
		if(iterationManager != null){
			putBodyParameter("IterationManager", iterationManager);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public List<String> getVersionsRepeatLists() {
		return this.versionsRepeatLists;
	}

	public void setVersionsRepeatLists(List<String> versionsRepeatLists) {
		this.versionsRepeatLists = versionsRepeatLists;	
		if (versionsRepeatLists != null) {
			for (int i = 0; i < versionsRepeatLists.size(); i++) {
				putBodyParameter("VersionsRepeatList." + (i + 1) , versionsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getIterationMembersRepeatLists() {
		return this.iterationMembersRepeatLists;
	}

	public void setIterationMembersRepeatLists(List<String> iterationMembersRepeatLists) {
		this.iterationMembersRepeatLists = iterationMembersRepeatLists;	
		if (iterationMembersRepeatLists != null) {
			for (int i = 0; i < iterationMembersRepeatLists.size(); i++) {
				putBodyParameter("IterationMembersRepeatList." + (i + 1) , iterationMembersRepeatLists.get(i));
			}
		}	
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putBodyParameter("ProdCode", prodCode);
		}
	}

	public String getIterationTemplateId() {
		return this.iterationTemplateId;
	}

	public void setIterationTemplateId(String iterationTemplateId) {
		this.iterationTemplateId = iterationTemplateId;
		if(iterationTemplateId != null){
			putBodyParameter("IterationTemplateId", iterationTemplateId);
		}
	}

	public String getTestOwner() {
		return this.testOwner;
	}

	public void setTestOwner(String testOwner) {
		this.testOwner = testOwner;
		if(testOwner != null){
			putBodyParameter("TestOwner", testOwner);
		}
	}

	public String getBranchMap() {
		return this.branchMap;
	}

	public void setBranchMap(String branchMap) {
		this.branchMap = branchMap;
		if(branchMap != null){
			putBodyParameter("BranchMap", branchMap);
		}
	}

	public String getPrePubOwner() {
		return this.prePubOwner;
	}

	public void setPrePubOwner(String prePubOwner) {
		this.prePubOwner = prePubOwner;
		if(prePubOwner != null){
			putBodyParameter("PrePubOwner", prePubOwner);
		}
	}

	public String getProdVersion() {
		return this.prodVersion;
	}

	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
		if(prodVersion != null){
			putBodyParameter("ProdVersion", prodVersion);
		}
	}

	public String getTagMap() {
		return this.tagMap;
	}

	public void setTagMap(String tagMap) {
		this.tagMap = tagMap;
		if(tagMap != null){
			putBodyParameter("TagMap", tagMap);
		}
	}

	public Boolean getTagAndMergeMasterWhenEmergency() {
		return this.tagAndMergeMasterWhenEmergency;
	}

	public void setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
		this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
		if(tagAndMergeMasterWhenEmergency != null){
			putBodyParameter("TagAndMergeMasterWhenEmergency", tagAndMergeMasterWhenEmergency.toString());
		}
	}

	@Override
	public Class<CreateLinkeBahamutIterationsdocreateResponse> getResponseClass() {
		return CreateLinkeBahamutIterationsdocreateResponse.class;
	}

}
