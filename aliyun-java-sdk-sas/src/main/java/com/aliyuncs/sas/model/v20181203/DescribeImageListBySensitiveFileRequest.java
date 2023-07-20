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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageListBySensitiveFileRequest extends RpcAcsRequest<DescribeImageListBySensitiveFileResponse> {
	   

	private String sensitiveFileKey;

	private String repoNamespace;

	private String imageDigest;

	@SerializedName("scanRange")
	private List<String> scanRange;

	private Integer pageSize;

	private String lang;

	private Integer currentPage;

	private String riskLevel;

	private String repoName;

	private String repoInstanceId;
	public DescribeImageListBySensitiveFileRequest() {
		super("Sas", "2018-12-03", "DescribeImageListBySensitiveFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSensitiveFileKey() {
		return this.sensitiveFileKey;
	}

	public void setSensitiveFileKey(String sensitiveFileKey) {
		this.sensitiveFileKey = sensitiveFileKey;
		if(sensitiveFileKey != null){
			putQueryParameter("SensitiveFileKey", sensitiveFileKey);
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

	public List<String> getScanRange() {
		return this.scanRange;
	}

	public void setScanRange(List<String> scanRange) {
		this.scanRange = scanRange;	
		if (scanRange != null) {
			putQueryParameter("ScanRange" , new Gson().toJson(scanRange));
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public String getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
		if(riskLevel != null){
			putQueryParameter("RiskLevel", riskLevel);
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

	@Override
	public Class<DescribeImageListBySensitiveFileResponse> getResponseClass() {
		return DescribeImageListBySensitiveFileResponse.class;
	}

}
