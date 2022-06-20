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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublicCreateImageScanTaskRequest extends RpcAcsRequest<PublicCreateImageScanTaskResponse> {
	   

	private String sourceIp;

	private String digests;

	private String registryTypes;

	private String regionIds;

	private String tags;

	private String repoNamespaces;

	private String instanceIds;

	private String repoIds;

	private String repoNames;
	public PublicCreateImageScanTaskRequest() {
		super("Sas", "2018-12-03", "PublicCreateImageScanTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getDigests() {
		return this.digests;
	}

	public void setDigests(String digests) {
		this.digests = digests;
		if(digests != null){
			putQueryParameter("Digests", digests);
		}
	}

	public String getRegistryTypes() {
		return this.registryTypes;
	}

	public void setRegistryTypes(String registryTypes) {
		this.registryTypes = registryTypes;
		if(registryTypes != null){
			putQueryParameter("RegistryTypes", registryTypes);
		}
	}

	public String getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
		if(regionIds != null){
			putQueryParameter("RegionIds", regionIds);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getRepoNamespaces() {
		return this.repoNamespaces;
	}

	public void setRepoNamespaces(String repoNamespaces) {
		this.repoNamespaces = repoNamespaces;
		if(repoNamespaces != null){
			putQueryParameter("RepoNamespaces", repoNamespaces);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getRepoIds() {
		return this.repoIds;
	}

	public void setRepoIds(String repoIds) {
		this.repoIds = repoIds;
		if(repoIds != null){
			putQueryParameter("RepoIds", repoIds);
		}
	}

	public String getRepoNames() {
		return this.repoNames;
	}

	public void setRepoNames(String repoNames) {
		this.repoNames = repoNames;
		if(repoNames != null){
			putQueryParameter("RepoNames", repoNames);
		}
	}

	@Override
	public Class<PublicCreateImageScanTaskResponse> getResponseClass() {
		return PublicCreateImageScanTaskResponse.class;
	}

}
