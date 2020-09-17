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
public class QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest extends RpcAcsRequest<QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse> {
	   

	private String cluster;

	private String containerName;

	private Long appServiceId;

	private String namespace;

	private String podId;
	public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest() {
		super("SOFA", "2019-08-15", "QueryLinkedeploycoreDeploycoreResourcequerypodlogs", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putBodyParameter("Cluster", cluster);
		}
	}

	public String getContainerName() {
		return this.containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
		if(containerName != null){
			putBodyParameter("ContainerName", containerName);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getPodId() {
		return this.podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
		if(podId != null){
			putBodyParameter("PodId", podId);
		}
	}

	@Override
	public Class<QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse> getResponseClass() {
		return QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.class;
	}

}
