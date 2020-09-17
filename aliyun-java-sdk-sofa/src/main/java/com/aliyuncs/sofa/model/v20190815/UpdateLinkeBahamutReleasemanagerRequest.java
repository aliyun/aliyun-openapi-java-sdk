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
public class UpdateLinkeBahamutReleasemanagerRequest extends RpcAcsRequest<UpdateLinkeBahamutReleasemanagerResponse> {
	   

	private String greenChannelPortalUrl;

	private List<String> stagesRepeatLists;

	private Boolean windowRelease;

	private String externalId;

	private Long releaseDate;

	private String type;

	private String deadlines;

	private List<String> iterationsRepeatLists;

	private String id;

	private Boolean containPreInMultiEnv;

	private List<String> delAppMetaIdsRepeatLists;

	private Boolean afterFastDevDate;

	private Long created;

	private List<String> managersRepeatLists;

	private String iterationType;

	private Long mergeStartTime;

	private Boolean multiEnvProd;

	private String dependencies;

	private String greenChannelId;

	private Long lastModified;

	private Boolean dailyRelease;

	private String name;

	private List<String> tenantReleaseInfosRepeatLists;

	private String status;

	private String link;

	private Boolean betaRelease;

	private List<String> appsRepeatLists;

	private String tenantId;

	private String aoneReleaseId;

	private List<String> multiEnvConfigsRepeatLists;

	private String creator;

	private String greenChannelName;

	private String ticket;

	private Boolean attachable;

	private Boolean deleted;

	private String appGroup;

	private Boolean hasCreatedAppReleaseDetail;

	private Boolean multiEnvRelease;

	private Boolean tagAndMergeMasterWhenEmergency;
	public UpdateLinkeBahamutReleasemanagerRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutReleasemanager", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGreenChannelPortalUrl() {
		return this.greenChannelPortalUrl;
	}

	public void setGreenChannelPortalUrl(String greenChannelPortalUrl) {
		this.greenChannelPortalUrl = greenChannelPortalUrl;
		if(greenChannelPortalUrl != null){
			putBodyParameter("GreenChannelPortalUrl", greenChannelPortalUrl);
		}
	}

	public List<String> getStagesRepeatLists() {
		return this.stagesRepeatLists;
	}

	public void setStagesRepeatLists(List<String> stagesRepeatLists) {
		this.stagesRepeatLists = stagesRepeatLists;	
		if (stagesRepeatLists != null) {
			for (int i = 0; i < stagesRepeatLists.size(); i++) {
				putBodyParameter("StagesRepeatList." + (i + 1) , stagesRepeatLists.get(i));
			}
		}	
	}

	public Boolean getWindowRelease() {
		return this.windowRelease;
	}

	public void setWindowRelease(Boolean windowRelease) {
		this.windowRelease = windowRelease;
		if(windowRelease != null){
			putBodyParameter("WindowRelease", windowRelease.toString());
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putBodyParameter("ExternalId", externalId);
		}
	}

	public Long getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Long releaseDate) {
		this.releaseDate = releaseDate;
		if(releaseDate != null){
			putBodyParameter("ReleaseDate", releaseDate.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getDeadlines() {
		return this.deadlines;
	}

	public void setDeadlines(String deadlines) {
		this.deadlines = deadlines;
		if(deadlines != null){
			putBodyParameter("Deadlines", deadlines);
		}
	}

	public List<String> getIterationsRepeatLists() {
		return this.iterationsRepeatLists;
	}

	public void setIterationsRepeatLists(List<String> iterationsRepeatLists) {
		this.iterationsRepeatLists = iterationsRepeatLists;	
		if (iterationsRepeatLists != null) {
			for (int i = 0; i < iterationsRepeatLists.size(); i++) {
				putBodyParameter("IterationsRepeatList." + (i + 1) , iterationsRepeatLists.get(i));
			}
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Boolean getContainPreInMultiEnv() {
		return this.containPreInMultiEnv;
	}

	public void setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
		this.containPreInMultiEnv = containPreInMultiEnv;
		if(containPreInMultiEnv != null){
			putBodyParameter("ContainPreInMultiEnv", containPreInMultiEnv.toString());
		}
	}

	public List<String> getDelAppMetaIdsRepeatLists() {
		return this.delAppMetaIdsRepeatLists;
	}

	public void setDelAppMetaIdsRepeatLists(List<String> delAppMetaIdsRepeatLists) {
		this.delAppMetaIdsRepeatLists = delAppMetaIdsRepeatLists;	
		if (delAppMetaIdsRepeatLists != null) {
			for (int i = 0; i < delAppMetaIdsRepeatLists.size(); i++) {
				putBodyParameter("DelAppMetaIdsRepeatList." + (i + 1) , delAppMetaIdsRepeatLists.get(i));
			}
		}	
	}

	public Boolean getAfterFastDevDate() {
		return this.afterFastDevDate;
	}

	public void setAfterFastDevDate(Boolean afterFastDevDate) {
		this.afterFastDevDate = afterFastDevDate;
		if(afterFastDevDate != null){
			putBodyParameter("AfterFastDevDate", afterFastDevDate.toString());
		}
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
		if(created != null){
			putBodyParameter("Created", created.toString());
		}
	}

	public List<String> getManagersRepeatLists() {
		return this.managersRepeatLists;
	}

	public void setManagersRepeatLists(List<String> managersRepeatLists) {
		this.managersRepeatLists = managersRepeatLists;	
		if (managersRepeatLists != null) {
			for (int i = 0; i < managersRepeatLists.size(); i++) {
				putBodyParameter("ManagersRepeatList." + (i + 1) , managersRepeatLists.get(i));
			}
		}	
	}

	public String getIterationType() {
		return this.iterationType;
	}

	public void setIterationType(String iterationType) {
		this.iterationType = iterationType;
		if(iterationType != null){
			putBodyParameter("IterationType", iterationType);
		}
	}

	public Long getMergeStartTime() {
		return this.mergeStartTime;
	}

	public void setMergeStartTime(Long mergeStartTime) {
		this.mergeStartTime = mergeStartTime;
		if(mergeStartTime != null){
			putBodyParameter("MergeStartTime", mergeStartTime.toString());
		}
	}

	public Boolean getMultiEnvProd() {
		return this.multiEnvProd;
	}

	public void setMultiEnvProd(Boolean multiEnvProd) {
		this.multiEnvProd = multiEnvProd;
		if(multiEnvProd != null){
			putBodyParameter("MultiEnvProd", multiEnvProd.toString());
		}
	}

	public String getDependencies() {
		return this.dependencies;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
		if(dependencies != null){
			putBodyParameter("Dependencies", dependencies);
		}
	}

	public String getGreenChannelId() {
		return this.greenChannelId;
	}

	public void setGreenChannelId(String greenChannelId) {
		this.greenChannelId = greenChannelId;
		if(greenChannelId != null){
			putBodyParameter("GreenChannelId", greenChannelId);
		}
	}

	public Long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Long lastModified) {
		this.lastModified = lastModified;
		if(lastModified != null){
			putBodyParameter("LastModified", lastModified.toString());
		}
	}

	public Boolean getDailyRelease() {
		return this.dailyRelease;
	}

	public void setDailyRelease(Boolean dailyRelease) {
		this.dailyRelease = dailyRelease;
		if(dailyRelease != null){
			putBodyParameter("DailyRelease", dailyRelease.toString());
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

	public List<String> getTenantReleaseInfosRepeatLists() {
		return this.tenantReleaseInfosRepeatLists;
	}

	public void setTenantReleaseInfosRepeatLists(List<String> tenantReleaseInfosRepeatLists) {
		this.tenantReleaseInfosRepeatLists = tenantReleaseInfosRepeatLists;	
		if (tenantReleaseInfosRepeatLists != null) {
			for (int i = 0; i < tenantReleaseInfosRepeatLists.size(); i++) {
				putBodyParameter("TenantReleaseInfosRepeatList." + (i + 1) , tenantReleaseInfosRepeatLists.get(i));
			}
		}	
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
		if(link != null){
			putBodyParameter("Link", link);
		}
	}

	public Boolean getBetaRelease() {
		return this.betaRelease;
	}

	public void setBetaRelease(Boolean betaRelease) {
		this.betaRelease = betaRelease;
		if(betaRelease != null){
			putBodyParameter("BetaRelease", betaRelease.toString());
		}
	}

	public List<String> getAppsRepeatLists() {
		return this.appsRepeatLists;
	}

	public void setAppsRepeatLists(List<String> appsRepeatLists) {
		this.appsRepeatLists = appsRepeatLists;	
		if (appsRepeatLists != null) {
			for (int i = 0; i < appsRepeatLists.size(); i++) {
				putBodyParameter("AppsRepeatList." + (i + 1) , appsRepeatLists.get(i));
			}
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

	public String getAoneReleaseId() {
		return this.aoneReleaseId;
	}

	public void setAoneReleaseId(String aoneReleaseId) {
		this.aoneReleaseId = aoneReleaseId;
		if(aoneReleaseId != null){
			putBodyParameter("AoneReleaseId", aoneReleaseId);
		}
	}

	public List<String> getMultiEnvConfigsRepeatLists() {
		return this.multiEnvConfigsRepeatLists;
	}

	public void setMultiEnvConfigsRepeatLists(List<String> multiEnvConfigsRepeatLists) {
		this.multiEnvConfigsRepeatLists = multiEnvConfigsRepeatLists;	
		if (multiEnvConfigsRepeatLists != null) {
			for (int i = 0; i < multiEnvConfigsRepeatLists.size(); i++) {
				putBodyParameter("MultiEnvConfigsRepeatList." + (i + 1) , multiEnvConfigsRepeatLists.get(i));
			}
		}	
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
		}
	}

	public String getGreenChannelName() {
		return this.greenChannelName;
	}

	public void setGreenChannelName(String greenChannelName) {
		this.greenChannelName = greenChannelName;
		if(greenChannelName != null){
			putBodyParameter("GreenChannelName", greenChannelName);
		}
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
		if(ticket != null){
			putBodyParameter("Ticket", ticket);
		}
	}

	public Boolean getAttachable() {
		return this.attachable;
	}

	public void setAttachable(Boolean attachable) {
		this.attachable = attachable;
		if(attachable != null){
			putBodyParameter("Attachable", attachable.toString());
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public String getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(String appGroup) {
		this.appGroup = appGroup;
		if(appGroup != null){
			putBodyParameter("AppGroup", appGroup);
		}
	}

	public Boolean getHasCreatedAppReleaseDetail() {
		return this.hasCreatedAppReleaseDetail;
	}

	public void setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
		this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
		if(hasCreatedAppReleaseDetail != null){
			putBodyParameter("HasCreatedAppReleaseDetail", hasCreatedAppReleaseDetail.toString());
		}
	}

	public Boolean getMultiEnvRelease() {
		return this.multiEnvRelease;
	}

	public void setMultiEnvRelease(Boolean multiEnvRelease) {
		this.multiEnvRelease = multiEnvRelease;
		if(multiEnvRelease != null){
			putBodyParameter("MultiEnvRelease", multiEnvRelease.toString());
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
	public Class<UpdateLinkeBahamutReleasemanagerResponse> getResponseClass() {
		return UpdateLinkeBahamutReleasemanagerResponse.class;
	}

}
