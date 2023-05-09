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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryFigureClustersRequest extends RpcAcsRequest<QueryFigureClustersResponse> {
	   

	private String customLabels;

	private String nextToken;

	private String datasetName;

	private String order;

	private String projectName;

	private String sort;

	@SerializedName("createTimeRange")
	private CreateTimeRange createTimeRange;

	private Long maxResults;

	private Boolean withTotalCount;

	@SerializedName("updateTimeRange")
	private UpdateTimeRange updateTimeRange;
	public QueryFigureClustersRequest() {
		super("imm", "2020-09-30", "QueryFigureClusters", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(String customLabels) {
		this.customLabels = customLabels;
		if(customLabels != null){
			putQueryParameter("CustomLabels", customLabels);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public CreateTimeRange getCreateTimeRange() {
		return this.createTimeRange;
	}

	public void setCreateTimeRange(CreateTimeRange createTimeRange) {
		this.createTimeRange = createTimeRange;	
		if (createTimeRange != null) {
			putQueryParameter("CreateTimeRange" , new Gson().toJson(createTimeRange));
		}	
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public Boolean getWithTotalCount() {
		return this.withTotalCount;
	}

	public void setWithTotalCount(Boolean withTotalCount) {
		this.withTotalCount = withTotalCount;
		if(withTotalCount != null){
			putQueryParameter("WithTotalCount", withTotalCount.toString());
		}
	}

	public UpdateTimeRange getUpdateTimeRange() {
		return this.updateTimeRange;
	}

	public void setUpdateTimeRange(UpdateTimeRange updateTimeRange) {
		this.updateTimeRange = updateTimeRange;	
		if (updateTimeRange != null) {
			putQueryParameter("UpdateTimeRange" , new Gson().toJson(updateTimeRange));
		}	
	}

	public static class CreateTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	public static class UpdateTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	@Override
	public Class<QueryFigureClustersResponse> getResponseClass() {
		return QueryFigureClustersResponse.class;
	}

}
