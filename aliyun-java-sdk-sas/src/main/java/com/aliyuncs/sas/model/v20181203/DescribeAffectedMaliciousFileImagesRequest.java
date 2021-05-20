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
public class DescribeAffectedMaliciousFileImagesRequest extends RpcAcsRequest<DescribeAffectedMaliciousFileImagesResponse> {
	   

	private String repoId;

	private String repoNamespace;

	private String imageDigest;

	private String pageSize;

	private String lang;

	private String imageTag;

	private String maliciousMd5;

	private Integer currentPage;

	private String repoName;

	private String repoInstanceId;

	private String imageLayer;

	private String repoRegionId;
	public DescribeAffectedMaliciousFileImagesRequest() {
		super("Sas", "2018-12-03", "DescribeAffectedMaliciousFileImages", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		if(repoNamespace != null){
			putQueryParameter("RepoNamespace", repoNamespace);
		}
	}

	public String getImageDigest() {
		return this.imageDigest;
	}

	public void setImageDigest(String imageDigest) {
		this.imageDigest = imageDigest;
		if(imageDigest != null){
			putQueryParameter("ImageDigest", imageDigest);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
		}
	}

	public String getMaliciousMd5() {
		return this.maliciousMd5;
	}

	public void setMaliciousMd5(String maliciousMd5) {
		this.maliciousMd5 = maliciousMd5;
		if(maliciousMd5 != null){
			putQueryParameter("MaliciousMd5", maliciousMd5);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	public String getRepoInstanceId() {
		return this.repoInstanceId;
	}

	public void setRepoInstanceId(String repoInstanceId) {
		this.repoInstanceId = repoInstanceId;
		if(repoInstanceId != null){
			putQueryParameter("RepoInstanceId", repoInstanceId);
		}
	}

	public String getImageLayer() {
		return this.imageLayer;
	}

	public void setImageLayer(String imageLayer) {
		this.imageLayer = imageLayer;
		if(imageLayer != null){
			putQueryParameter("ImageLayer", imageLayer);
		}
	}

	public String getRepoRegionId() {
		return this.repoRegionId;
	}

	public void setRepoRegionId(String repoRegionId) {
		this.repoRegionId = repoRegionId;
		if(repoRegionId != null){
			putQueryParameter("RepoRegionId", repoRegionId);
		}
	}

	@Override
	public Class<DescribeAffectedMaliciousFileImagesResponse> getResponseClass() {
		return DescribeAffectedMaliciousFileImagesResponse.class;
	}

}
