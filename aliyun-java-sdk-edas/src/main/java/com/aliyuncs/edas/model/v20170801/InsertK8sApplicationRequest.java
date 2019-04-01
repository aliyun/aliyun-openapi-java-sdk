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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InsertK8sApplicationRequest extends RoaAcsRequest<InsertK8sApplicationResponse> {
	
	public InsertK8sApplicationRequest() {
		super("Edas", "2017-08-01", "InsertK8sApplication");
		setUriPattern("/pop/v5/k8s/acs/create_k8s_app");
		setMethod(MethodType.POST);
	}

	private String nasId;

	private String repoId;

	private Integer internetTargetPort;

	private String intranetSlbId;

	private String commandArgs;

	private String readiness;

	private String liveness;

	private Integer internetSlbPort;

	private String envs;

	private Integer requestsMem;

	private String storageType;

	private Integer limitMem;

	private String appName;

	private String internetSlbId;

	private String logicalRegionId;

	private String internetSlbProtocol;

	private Integer intranetSlbPort;

	private String preStop;

	private String mountDescs;

	private Integer replicas;

	private Integer limitCpu;

	private String clusterId;

	private Integer intranetTargetPort;

	private String localVolume;

	private String command;

	private String intranetSlbProtocol;

	private String imageUrl;

	private String namespace;

	private String applicationDescription;

	private Integer requestsCpu;

	private String postStart;

	public String getNasId() {
		return this.nasId;
	}

	public void setNasId(String nasId) {
		this.nasId = nasId;
		if(nasId != null){
			putQueryParameter("NasId", nasId);
		}
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public Integer getInternetTargetPort() {
		return this.internetTargetPort;
	}

	public void setInternetTargetPort(Integer internetTargetPort) {
		this.internetTargetPort = internetTargetPort;
		if(internetTargetPort != null){
			putQueryParameter("InternetTargetPort", internetTargetPort.toString());
		}
	}

	public String getIntranetSlbId() {
		return this.intranetSlbId;
	}

	public void setIntranetSlbId(String intranetSlbId) {
		this.intranetSlbId = intranetSlbId;
		if(intranetSlbId != null){
			putQueryParameter("IntranetSlbId", intranetSlbId);
		}
	}

	public String getCommandArgs() {
		return this.commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
		if(commandArgs != null){
			putQueryParameter("CommandArgs", commandArgs);
		}
	}

	public String getReadiness() {
		return this.readiness;
	}

	public void setReadiness(String readiness) {
		this.readiness = readiness;
		if(readiness != null){
			putQueryParameter("Readiness", readiness);
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putQueryParameter("Liveness", liveness);
		}
	}

	public Integer getInternetSlbPort() {
		return this.internetSlbPort;
	}

	public void setInternetSlbPort(Integer internetSlbPort) {
		this.internetSlbPort = internetSlbPort;
		if(internetSlbPort != null){
			putQueryParameter("InternetSlbPort", internetSlbPort.toString());
		}
	}

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putQueryParameter("Envs", envs);
		}
	}

	public Integer getRequestsMem() {
		return this.requestsMem;
	}

	public void setRequestsMem(Integer requestsMem) {
		this.requestsMem = requestsMem;
		if(requestsMem != null){
			putQueryParameter("RequestsMem", requestsMem.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public Integer getLimitMem() {
		return this.limitMem;
	}

	public void setLimitMem(Integer limitMem) {
		this.limitMem = limitMem;
		if(limitMem != null){
			putQueryParameter("LimitMem", limitMem.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getInternetSlbId() {
		return this.internetSlbId;
	}

	public void setInternetSlbId(String internetSlbId) {
		this.internetSlbId = internetSlbId;
		if(internetSlbId != null){
			putQueryParameter("InternetSlbId", internetSlbId);
		}
	}

	public String getLogicalRegionId() {
		return this.logicalRegionId;
	}

	public void setLogicalRegionId(String logicalRegionId) {
		this.logicalRegionId = logicalRegionId;
		if(logicalRegionId != null){
			putQueryParameter("LogicalRegionId", logicalRegionId);
		}
	}

	public String getInternetSlbProtocol() {
		return this.internetSlbProtocol;
	}

	public void setInternetSlbProtocol(String internetSlbProtocol) {
		this.internetSlbProtocol = internetSlbProtocol;
		if(internetSlbProtocol != null){
			putQueryParameter("InternetSlbProtocol", internetSlbProtocol);
		}
	}

	public Integer getIntranetSlbPort() {
		return this.intranetSlbPort;
	}

	public void setIntranetSlbPort(Integer intranetSlbPort) {
		this.intranetSlbPort = intranetSlbPort;
		if(intranetSlbPort != null){
			putQueryParameter("IntranetSlbPort", intranetSlbPort.toString());
		}
	}

	public String getPreStop() {
		return this.preStop;
	}

	public void setPreStop(String preStop) {
		this.preStop = preStop;
		if(preStop != null){
			putQueryParameter("PreStop", preStop);
		}
	}

	public String getMountDescs() {
		return this.mountDescs;
	}

	public void setMountDescs(String mountDescs) {
		this.mountDescs = mountDescs;
		if(mountDescs != null){
			putQueryParameter("MountDescs", mountDescs);
		}
	}

	public Integer getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas.toString());
		}
	}

	public Integer getLimitCpu() {
		return this.limitCpu;
	}

	public void setLimitCpu(Integer limitCpu) {
		this.limitCpu = limitCpu;
		if(limitCpu != null){
			putQueryParameter("LimitCpu", limitCpu.toString());
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

	public Integer getIntranetTargetPort() {
		return this.intranetTargetPort;
	}

	public void setIntranetTargetPort(Integer intranetTargetPort) {
		this.intranetTargetPort = intranetTargetPort;
		if(intranetTargetPort != null){
			putQueryParameter("IntranetTargetPort", intranetTargetPort.toString());
		}
	}

	public String getLocalVolume() {
		return this.localVolume;
	}

	public void setLocalVolume(String localVolume) {
		this.localVolume = localVolume;
		if(localVolume != null){
			putQueryParameter("LocalVolume", localVolume);
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getIntranetSlbProtocol() {
		return this.intranetSlbProtocol;
	}

	public void setIntranetSlbProtocol(String intranetSlbProtocol) {
		this.intranetSlbProtocol = intranetSlbProtocol;
		if(intranetSlbProtocol != null){
			putQueryParameter("IntranetSlbProtocol", intranetSlbProtocol);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getApplicationDescription() {
		return this.applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
		if(applicationDescription != null){
			putQueryParameter("ApplicationDescription", applicationDescription);
		}
	}

	public Integer getRequestsCpu() {
		return this.requestsCpu;
	}

	public void setRequestsCpu(Integer requestsCpu) {
		this.requestsCpu = requestsCpu;
		if(requestsCpu != null){
			putQueryParameter("RequestsCpu", requestsCpu.toString());
		}
	}

	public String getPostStart() {
		return this.postStart;
	}

	public void setPostStart(String postStart) {
		this.postStart = postStart;
		if(postStart != null){
			putQueryParameter("PostStart", postStart);
		}
	}

	@Override
	public Class<InsertK8sApplicationResponse> getResponseClass() {
		return InsertK8sApplicationResponse.class;
	}

}
