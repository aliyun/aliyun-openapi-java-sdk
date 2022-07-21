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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryStoriesRequest extends RpcAcsRequest<QueryStoriesResponse> {
	   

	@SerializedName("figureClusterIds")
	private List<String> figureClusterIds;

	private String projectName;

	private String customLabels;

	private String sort;

	private String storyType;

	@SerializedName("storyEndTimeRange")
	private StoryEndTimeRange storyEndTimeRange;

	private Boolean withEmptyStories;

	@SerializedName("storyStartTimeRange")
	private StoryStartTimeRange storyStartTimeRange;

	private String nextToken;

	private String storySubType;

	@SerializedName("createTimeRange")
	private CreateTimeRange createTimeRange;

	private String datasetName;

	private Long maxResults;

	private String objectId;

	private String storyName;

	private String order;
	public QueryStoriesRequest() {
		super("imm", "2020-09-30", "QueryStories", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFigureClusterIds() {
		return this.figureClusterIds;
	}

	public void setFigureClusterIds(List<String> figureClusterIds) {
		this.figureClusterIds = figureClusterIds;	
		if (figureClusterIds != null) {
			putQueryParameter("FigureClusterIds" , new Gson().toJson(figureClusterIds));
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

	public String getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(String customLabels) {
		this.customLabels = customLabels;
		if(customLabels != null){
			putQueryParameter("CustomLabels", customLabels);
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

	public String getStoryType() {
		return this.storyType;
	}

	public void setStoryType(String storyType) {
		this.storyType = storyType;
		if(storyType != null){
			putQueryParameter("StoryType", storyType);
		}
	}

	public StoryEndTimeRange getStoryEndTimeRange() {
		return this.storyEndTimeRange;
	}

	public void setStoryEndTimeRange(StoryEndTimeRange storyEndTimeRange) {
		this.storyEndTimeRange = storyEndTimeRange;	
		if (storyEndTimeRange != null) {
			putQueryParameter("StoryEndTimeRange" , new Gson().toJson(storyEndTimeRange));
		}	
	}

	public Boolean getWithEmptyStories() {
		return this.withEmptyStories;
	}

	public void setWithEmptyStories(Boolean withEmptyStories) {
		this.withEmptyStories = withEmptyStories;
		if(withEmptyStories != null){
			putQueryParameter("WithEmptyStories", withEmptyStories.toString());
		}
	}

	public StoryStartTimeRange getStoryStartTimeRange() {
		return this.storyStartTimeRange;
	}

	public void setStoryStartTimeRange(StoryStartTimeRange storyStartTimeRange) {
		this.storyStartTimeRange = storyStartTimeRange;	
		if (storyStartTimeRange != null) {
			putQueryParameter("StoryStartTimeRange" , new Gson().toJson(storyStartTimeRange));
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

	public String getStorySubType() {
		return this.storySubType;
	}

	public void setStorySubType(String storySubType) {
		this.storySubType = storySubType;
		if(storySubType != null){
			putQueryParameter("StorySubType", storySubType);
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

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
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

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
		if(objectId != null){
			putQueryParameter("ObjectId", objectId);
		}
	}

	public String getStoryName() {
		return this.storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
		if(storyName != null){
			putQueryParameter("StoryName", storyName);
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

	public static class StoryEndTimeRange {

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

	public static class StoryStartTimeRange {

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

	@Override
	public Class<QueryStoriesResponse> getResponseClass() {
		return QueryStoriesResponse.class;
	}

}
