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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpenAKSClusterMeshRequest extends RpcAcsRequest<OpenAKSClusterMeshResponse> {
	   

	private String workspace;

	private String userAccessSecret;

	private Boolean insecure;

	private String userAccessKey;

	private Boolean enableDiscoverySync;

	private String clusterId;

	private String registryMetaConfigJsonStr;

	private String kubeconfig;
	public OpenAKSClusterMeshRequest() {
		super("SOFA", "2019-08-15", "OpenAKSClusterMesh", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getUserAccessSecret() {
		return this.userAccessSecret;
	}

	public void setUserAccessSecret(String userAccessSecret) {
		this.userAccessSecret = userAccessSecret;
		if(userAccessSecret != null){
			putBodyParameter("UserAccessSecret", userAccessSecret);
		}
	}

	public Boolean getInsecure() {
		return this.insecure;
	}

	public void setInsecure(Boolean insecure) {
		this.insecure = insecure;
		if(insecure != null){
			putBodyParameter("Insecure", insecure.toString());
		}
	}

	public String getUserAccessKey() {
		return this.userAccessKey;
	}

	public void setUserAccessKey(String userAccessKey) {
		this.userAccessKey = userAccessKey;
		if(userAccessKey != null){
			putBodyParameter("UserAccessKey", userAccessKey);
		}
	}

	public Boolean getEnableDiscoverySync() {
		return this.enableDiscoverySync;
	}

	public void setEnableDiscoverySync(Boolean enableDiscoverySync) {
		this.enableDiscoverySync = enableDiscoverySync;
		if(enableDiscoverySync != null){
			putBodyParameter("EnableDiscoverySync", enableDiscoverySync.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getRegistryMetaConfigJsonStr() {
		return this.registryMetaConfigJsonStr;
	}

	public void setRegistryMetaConfigJsonStr(String registryMetaConfigJsonStr) {
		this.registryMetaConfigJsonStr = registryMetaConfigJsonStr;
		if(registryMetaConfigJsonStr != null){
			putBodyParameter("RegistryMetaConfigJsonStr", registryMetaConfigJsonStr);
		}
	}

	public String getKubeconfig() {
		return this.kubeconfig;
	}

	public void setKubeconfig(String kubeconfig) {
		this.kubeconfig = kubeconfig;
		if(kubeconfig != null){
			putBodyParameter("Kubeconfig", kubeconfig);
		}
	}

	@Override
	public Class<OpenAKSClusterMeshResponse> getResponseClass() {
		return OpenAKSClusterMeshResponse.class;
	}

}
