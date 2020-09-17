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
public class CreateLinkeBahamutAppofflinecreateofflineappRequest extends RpcAcsRequest<CreateLinkeBahamutAppofflinecreateofflineappResponse> {
	   

	private String archDomainName;

	private String repoUrl;

	private String cnName;

	private String description;

	private List<String> devOwnersRepeatLists;

	private String appName;

	private String zoneMode;

	private String station;

	private String tenantId;

	private String archDomainId;

	private List<String> peOwnersRepeatLists;

	private List<String> testOwnersRepeatLists;

	private String level;

	private String priArchDomainName;

	private String appType;

	private String priArchDomainId;

	private String repoName;
	public CreateLinkeBahamutAppofflinecreateofflineappRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutAppofflinecreateofflineapp", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArchDomainName() {
		return this.archDomainName;
	}

	public void setArchDomainName(String archDomainName) {
		this.archDomainName = archDomainName;
		if(archDomainName != null){
			putBodyParameter("ArchDomainName", archDomainName);
		}
	}

	public String getRepoUrl() {
		return this.repoUrl;
	}

	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
		if(repoUrl != null){
			putBodyParameter("RepoUrl", repoUrl);
		}
	}

	public String getCnName() {
		return this.cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
		if(cnName != null){
			putBodyParameter("CnName", cnName);
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

	public List<String> getDevOwnersRepeatLists() {
		return this.devOwnersRepeatLists;
	}

	public void setDevOwnersRepeatLists(List<String> devOwnersRepeatLists) {
		this.devOwnersRepeatLists = devOwnersRepeatLists;	
		if (devOwnersRepeatLists != null) {
			for (int i = 0; i < devOwnersRepeatLists.size(); i++) {
				putBodyParameter("DevOwnersRepeatList." + (i + 1) , devOwnersRepeatLists.get(i));
			}
		}	
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getZoneMode() {
		return this.zoneMode;
	}

	public void setZoneMode(String zoneMode) {
		this.zoneMode = zoneMode;
		if(zoneMode != null){
			putBodyParameter("ZoneMode", zoneMode);
		}
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
		if(station != null){
			putBodyParameter("Station", station);
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

	public String getArchDomainId() {
		return this.archDomainId;
	}

	public void setArchDomainId(String archDomainId) {
		this.archDomainId = archDomainId;
		if(archDomainId != null){
			putBodyParameter("ArchDomainId", archDomainId);
		}
	}

	public List<String> getPeOwnersRepeatLists() {
		return this.peOwnersRepeatLists;
	}

	public void setPeOwnersRepeatLists(List<String> peOwnersRepeatLists) {
		this.peOwnersRepeatLists = peOwnersRepeatLists;	
		if (peOwnersRepeatLists != null) {
			for (int i = 0; i < peOwnersRepeatLists.size(); i++) {
				putBodyParameter("PeOwnersRepeatList." + (i + 1) , peOwnersRepeatLists.get(i));
			}
		}	
	}

	public List<String> getTestOwnersRepeatLists() {
		return this.testOwnersRepeatLists;
	}

	public void setTestOwnersRepeatLists(List<String> testOwnersRepeatLists) {
		this.testOwnersRepeatLists = testOwnersRepeatLists;	
		if (testOwnersRepeatLists != null) {
			for (int i = 0; i < testOwnersRepeatLists.size(); i++) {
				putBodyParameter("TestOwnersRepeatList." + (i + 1) , testOwnersRepeatLists.get(i));
			}
		}	
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level);
		}
	}

	public String getPriArchDomainName() {
		return this.priArchDomainName;
	}

	public void setPriArchDomainName(String priArchDomainName) {
		this.priArchDomainName = priArchDomainName;
		if(priArchDomainName != null){
			putBodyParameter("PriArchDomainName", priArchDomainName);
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putBodyParameter("AppType", appType);
		}
	}

	public String getPriArchDomainId() {
		return this.priArchDomainId;
	}

	public void setPriArchDomainId(String priArchDomainId) {
		this.priArchDomainId = priArchDomainId;
		if(priArchDomainId != null){
			putBodyParameter("PriArchDomainId", priArchDomainId);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putBodyParameter("RepoName", repoName);
		}
	}

	@Override
	public Class<CreateLinkeBahamutAppofflinecreateofflineappResponse> getResponseClass() {
		return CreateLinkeBahamutAppofflinecreateofflineappResponse.class;
	}

}
