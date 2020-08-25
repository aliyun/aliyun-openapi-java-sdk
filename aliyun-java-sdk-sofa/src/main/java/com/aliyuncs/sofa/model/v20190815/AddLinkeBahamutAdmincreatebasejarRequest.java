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
public class AddLinkeBahamutAdmincreatebasejarRequest extends RpcAcsRequest<AddLinkeBahamutAdmincreatebasejarResponse> {
	   

	private String repoUrl;

	private List<String> testOwnerRepeatLists;

	private String appName;

	private String tenantId;

	private String baseJarInfo;

	private List<String> moduleListRepeatLists;

	private List<String> devOwnerRepeatLists;

	private String repoName;
	public AddLinkeBahamutAdmincreatebasejarRequest() {
		super("SOFA", "2019-08-15", "AddLinkeBahamutAdmincreatebasejar", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getTestOwnerRepeatLists() {
		return this.testOwnerRepeatLists;
	}

	public void setTestOwnerRepeatLists(List<String> testOwnerRepeatLists) {
		this.testOwnerRepeatLists = testOwnerRepeatLists;	
		if (testOwnerRepeatLists != null) {
			for (int i = 0; i < testOwnerRepeatLists.size(); i++) {
				putBodyParameter("TestOwnerRepeatList." + (i + 1) , testOwnerRepeatLists.get(i));
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getBaseJarInfo() {
		return this.baseJarInfo;
	}

	public void setBaseJarInfo(String baseJarInfo) {
		this.baseJarInfo = baseJarInfo;
		if(baseJarInfo != null){
			putBodyParameter("BaseJarInfo", baseJarInfo);
		}
	}

	public List<String> getModuleListRepeatLists() {
		return this.moduleListRepeatLists;
	}

	public void setModuleListRepeatLists(List<String> moduleListRepeatLists) {
		this.moduleListRepeatLists = moduleListRepeatLists;	
		if (moduleListRepeatLists != null) {
			for (int i = 0; i < moduleListRepeatLists.size(); i++) {
				putBodyParameter("ModuleListRepeatList." + (i + 1) , moduleListRepeatLists.get(i));
			}
		}	
	}

	public List<String> getDevOwnerRepeatLists() {
		return this.devOwnerRepeatLists;
	}

	public void setDevOwnerRepeatLists(List<String> devOwnerRepeatLists) {
		this.devOwnerRepeatLists = devOwnerRepeatLists;	
		if (devOwnerRepeatLists != null) {
			for (int i = 0; i < devOwnerRepeatLists.size(); i++) {
				putBodyParameter("DevOwnerRepeatList." + (i + 1) , devOwnerRepeatLists.get(i));
			}
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
	public Class<AddLinkeBahamutAdmincreatebasejarResponse> getResponseClass() {
		return AddLinkeBahamutAdmincreatebasejarResponse.class;
	}

}
