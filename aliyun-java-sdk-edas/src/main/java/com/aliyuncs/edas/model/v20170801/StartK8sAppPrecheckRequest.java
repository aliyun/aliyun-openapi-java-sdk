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
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartK8sAppPrecheckRequest extends RoaAcsRequest<StartK8sAppPrecheckResponse> {
	   

	private Integer replicas;

	private Integer requestsEphemeralStorage;

	private String envs;

	private String annotations;

	private String clusterId;

	private Integer requestsMem;

	private String localVolume;

	private String envFroms;

	private String labels;

	private Integer limitMem;

	private Integer limitEphemeralStorage;

	private Integer limitmCpu;

	private String configMountDescs;

	private String appName;

	private String packageUrl;

	private String appId;

	private String emptyDirs;

	private String pvcMountDescs;

	private String imageUrl;

	private String namespace;

	private Integer requestsmCpu;

	private String javaStartUpConfig;
	public StartK8sAppPrecheckRequest() {
		super("Edas", "2017-08-01", "StartK8sAppPrecheck", "Edas");
		setUriPattern("/pop/v5/k8s/app_precheck");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getRequestsEphemeralStorage() {
		return this.requestsEphemeralStorage;
	}

	public void setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
		this.requestsEphemeralStorage = requestsEphemeralStorage;
		if(requestsEphemeralStorage != null){
			putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage.toString());
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

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
		if(annotations != null){
			putQueryParameter("Annotations", annotations);
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

	public Integer getRequestsMem() {
		return this.requestsMem;
	}

	public void setRequestsMem(Integer requestsMem) {
		this.requestsMem = requestsMem;
		if(requestsMem != null){
			putQueryParameter("RequestsMem", requestsMem.toString());
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

	public String getEnvFroms() {
		return this.envFroms;
	}

	public void setEnvFroms(String envFroms) {
		this.envFroms = envFroms;
		if(envFroms != null){
			putQueryParameter("EnvFroms", envFroms);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
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

	public Integer getLimitEphemeralStorage() {
		return this.limitEphemeralStorage;
	}

	public void setLimitEphemeralStorage(Integer limitEphemeralStorage) {
		this.limitEphemeralStorage = limitEphemeralStorage;
		if(limitEphemeralStorage != null){
			putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage.toString());
		}
	}

	public Integer getLimitmCpu() {
		return this.limitmCpu;
	}

	public void setLimitmCpu(Integer limitmCpu) {
		this.limitmCpu = limitmCpu;
		if(limitmCpu != null){
			putQueryParameter("LimitmCpu", limitmCpu.toString());
		}
	}

	public String getConfigMountDescs() {
		return this.configMountDescs;
	}

	public void setConfigMountDescs(String configMountDescs) {
		this.configMountDescs = configMountDescs;
		if(configMountDescs != null){
			putQueryParameter("ConfigMountDescs", configMountDescs);
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

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getEmptyDirs() {
		return this.emptyDirs;
	}

	public void setEmptyDirs(String emptyDirs) {
		this.emptyDirs = emptyDirs;
		if(emptyDirs != null){
			putQueryParameter("EmptyDirs", emptyDirs);
		}
	}

	public String getPvcMountDescs() {
		return this.pvcMountDescs;
	}

	public void setPvcMountDescs(String pvcMountDescs) {
		this.pvcMountDescs = pvcMountDescs;
		if(pvcMountDescs != null){
			putQueryParameter("PvcMountDescs", pvcMountDescs);
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

	public Integer getRequestsmCpu() {
		return this.requestsmCpu;
	}

	public void setRequestsmCpu(Integer requestsmCpu) {
		this.requestsmCpu = requestsmCpu;
		if(requestsmCpu != null){
			putQueryParameter("RequestsmCpu", requestsmCpu.toString());
		}
	}

	public String getJavaStartUpConfig() {
		return this.javaStartUpConfig;
	}

	public void setJavaStartUpConfig(String javaStartUpConfig) {
		this.javaStartUpConfig = javaStartUpConfig;
		if(javaStartUpConfig != null){
			putQueryParameter("JavaStartUpConfig", javaStartUpConfig);
		}
	}

	@Override
	public Class<StartK8sAppPrecheckResponse> getResponseClass() {
		return StartK8sAppPrecheckResponse.class;
	}

}
