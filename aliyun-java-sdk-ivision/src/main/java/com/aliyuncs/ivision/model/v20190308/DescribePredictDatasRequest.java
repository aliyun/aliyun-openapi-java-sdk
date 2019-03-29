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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribePredictDatasRequest extends RpcAcsRequest<DescribePredictDatasResponse> {
	
	public DescribePredictDatasRequest() {
		super("ivision", "2019-03-08", "DescribePredictDatas", "ivision");
	}

	private String nextPageToken;

	private Long pageSize;

	private String probabilityThreshold;

	private String overlapThreshold;

	private String projectId;

	private String modelId;

	private String tagId;

	private Long currentPage;

	private Long ownerId;

	private String iterationId;

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getProbabilityThreshold() {
		return this.probabilityThreshold;
	}

	public void setProbabilityThreshold(String probabilityThreshold) {
		this.probabilityThreshold = probabilityThreshold;
		if(probabilityThreshold != null){
			putQueryParameter("ProbabilityThreshold", probabilityThreshold);
		}
	}

	public String getOverlapThreshold() {
		return this.overlapThreshold;
	}

	public void setOverlapThreshold(String overlapThreshold) {
		this.overlapThreshold = overlapThreshold;
		if(overlapThreshold != null){
			putQueryParameter("OverlapThreshold", overlapThreshold);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putQueryParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<DescribePredictDatasResponse> getResponseClass() {
		return DescribePredictDatasResponse.class;
	}

}
