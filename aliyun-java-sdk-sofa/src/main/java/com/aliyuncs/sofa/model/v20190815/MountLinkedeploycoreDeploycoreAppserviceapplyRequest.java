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
public class MountLinkedeploycoreDeploycoreAppserviceapplyRequest extends RpcAcsRequest<MountLinkedeploycoreDeploycoreAppserviceapplyResponse> {
	   

	private List<String> commandRepeatLists;

	private String replica;

	private List<String> sidecarsRepeatLists;

	private Boolean spanner;

	private String environments;

	private String commitId;

	private Boolean pureResources;

	private String operator;

	private String scene;

	private String appName;

	private String javaOpts;

	private String branchName;

	private String image;

	private String fromApp;

	private String runtime;

	private String labels;

	private String releaseId;

	private String name;

	private String tenantName;

	private Boolean dynamicQuota;

	private String codeUrl;

	private String envName;

	private String network;

	private String extraRequest;

	private String sofaRouter;

	private String projectId;

	private String uniqueId;

	private Long appServiceId;
	public MountLinkedeploycoreDeploycoreAppserviceapplyRequest() {
		super("SOFA", "2019-08-15", "MountLinkedeploycoreDeploycoreAppserviceapply", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCommandRepeatLists() {
		return this.commandRepeatLists;
	}

	public void setCommandRepeatLists(List<String> commandRepeatLists) {
		this.commandRepeatLists = commandRepeatLists;	
		if (commandRepeatLists != null) {
			for (int i = 0; i < commandRepeatLists.size(); i++) {
				putBodyParameter("CommandRepeatList." + (i + 1) , commandRepeatLists.get(i));
			}
		}	
	}

	public String getReplica() {
		return this.replica;
	}

	public void setReplica(String replica) {
		this.replica = replica;
		if(replica != null){
			putBodyParameter("Replica", replica);
		}
	}

	public List<String> getSidecarsRepeatLists() {
		return this.sidecarsRepeatLists;
	}

	public void setSidecarsRepeatLists(List<String> sidecarsRepeatLists) {
		this.sidecarsRepeatLists = sidecarsRepeatLists;	
		if (sidecarsRepeatLists != null) {
			for (int i = 0; i < sidecarsRepeatLists.size(); i++) {
				putBodyParameter("SidecarsRepeatList." + (i + 1) , sidecarsRepeatLists.get(i));
			}
		}	
	}

	public Boolean getSpanner() {
		return this.spanner;
	}

	public void setSpanner(Boolean spanner) {
		this.spanner = spanner;
		if(spanner != null){
			putBodyParameter("Spanner", spanner.toString());
		}
	}

	public String getEnvironments() {
		return this.environments;
	}

	public void setEnvironments(String environments) {
		this.environments = environments;
		if(environments != null){
			putBodyParameter("Environments", environments);
		}
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putBodyParameter("CommitId", commitId);
		}
	}

	public Boolean getPureResources() {
		return this.pureResources;
	}

	public void setPureResources(Boolean pureResources) {
		this.pureResources = pureResources;
		if(pureResources != null){
			putBodyParameter("PureResources", pureResources.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putBodyParameter("Scene", scene);
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

	public String getJavaOpts() {
		return this.javaOpts;
	}

	public void setJavaOpts(String javaOpts) {
		this.javaOpts = javaOpts;
		if(javaOpts != null){
			putBodyParameter("JavaOpts", javaOpts);
		}
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
		if(branchName != null){
			putBodyParameter("BranchName", branchName);
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putBodyParameter("Image", image);
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	public String getRuntime() {
		return this.runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
		if(runtime != null){
			putBodyParameter("Runtime", runtime);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putBodyParameter("Labels", labels);
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
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

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	public Boolean getDynamicQuota() {
		return this.dynamicQuota;
	}

	public void setDynamicQuota(Boolean dynamicQuota) {
		this.dynamicQuota = dynamicQuota;
		if(dynamicQuota != null){
			putBodyParameter("DynamicQuota", dynamicQuota.toString());
		}
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
		if(codeUrl != null){
			putBodyParameter("CodeUrl", codeUrl);
		}
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putBodyParameter("EnvName", envName);
		}
	}

	public String getNetwork() {
		return this.network;
	}

	public void setNetwork(String network) {
		this.network = network;
		if(network != null){
			putBodyParameter("Network", network);
		}
	}

	public String getExtraRequest() {
		return this.extraRequest;
	}

	public void setExtraRequest(String extraRequest) {
		this.extraRequest = extraRequest;
		if(extraRequest != null){
			putBodyParameter("ExtraRequest", extraRequest);
		}
	}

	public String getSofaRouter() {
		return this.sofaRouter;
	}

	public void setSofaRouter(String sofaRouter) {
		this.sofaRouter = sofaRouter;
		if(sofaRouter != null){
			putBodyParameter("SofaRouter", sofaRouter);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		if(uniqueId != null){
			putBodyParameter("UniqueId", uniqueId);
		}
	}

	public Long getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(Long appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId.toString());
		}
	}

	@Override
	public Class<MountLinkedeploycoreDeploycoreAppserviceapplyResponse> getResponseClass() {
		return MountLinkedeploycoreDeploycoreAppserviceapplyResponse.class;
	}

}
