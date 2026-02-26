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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageListWithBaselineNameRequest extends RpcAcsRequest<DescribeImageListWithBaselineNameResponse> {
	   

	private String pod;

	private String clusterName;

	private String criteria;

	private String repoNamespace;

	private String imageDigest;

	private List<String> scanRanges;

	private Integer pageSize;

	private String criteriaType;

	private String lang;

	private String image;

	private Integer currentPage;

	private String clusterId;

	private String repoName;

	private String namespace;

	private String baselineNameKey;

	private String repoInstanceId;

	private String containerId;
	public DescribeImageListWithBaselineNameRequest() {
		super("Sas", "2018-12-03", "DescribeImageListWithBaselineName");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPod() {
		return this.pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
		if(pod != null){
			putQueryParameter("Pod", pod);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
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

	public List<String> getScanRanges() {
		return this.scanRanges;
	}

	public void setScanRanges(List<String> scanRanges) {
		this.scanRanges = scanRanges;	
		if (scanRanges != null) {
			for (int i = 0; i < scanRanges.size(); i++) {
				putQueryParameter("ScanRange." + (i + 1) , scanRanges.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCriteriaType() {
		return this.criteriaType;
	}

	public void setCriteriaType(String criteriaType) {
		this.criteriaType = criteriaType;
		if(criteriaType != null){
			putQueryParameter("CriteriaType", criteriaType);
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

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getBaselineNameKey() {
		return this.baselineNameKey;
	}

	public void setBaselineNameKey(String baselineNameKey) {
		this.baselineNameKey = baselineNameKey;
		if(baselineNameKey != null){
			putQueryParameter("BaselineNameKey", baselineNameKey);
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

	public String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
		if(containerId != null){
			putQueryParameter("ContainerId", containerId);
		}
	}

	@Override
	public Class<DescribeImageListWithBaselineNameResponse> getResponseClass() {
		return DescribeImageListWithBaselineNameResponse.class;
	}

}
