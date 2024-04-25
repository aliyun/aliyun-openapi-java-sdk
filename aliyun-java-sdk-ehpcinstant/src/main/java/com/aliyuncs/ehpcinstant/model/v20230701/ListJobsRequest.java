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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListJobsRequest extends RpcAcsRequest<ListJobsResponse> {
	   

	private String pageNumber;

	@SerializedName("filter")
	private Filter filter;

	private String pageSize;

	@SerializedName("sortBy")
	private SortBy sortBy;
	public ListJobsRequest() {
		super("EhpcInstant", "2023-07-01", "ListJobs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public Filter getFilter() {
		return this.filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;	
		if (filter != null) {
			putQueryParameter("Filter" , new Gson().toJson(filter));
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

	public SortBy getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(SortBy sortBy) {
		this.sortBy = sortBy;	
		if (sortBy != null) {
			putQueryParameter("SortBy" , new Gson().toJson(sortBy));
		}	
	}

	public static class Filter {

		@SerializedName("JobId")
		private String jobId;

		@SerializedName("TimeCreatedAfter")
		private Integer timeCreatedAfter;

		@SerializedName("TimeCreatedBefore")
		private Integer timeCreatedBefore;

		@SerializedName("JobName")
		private String jobName;

		@SerializedName("Status")
		private String status;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Integer getTimeCreatedAfter() {
			return this.timeCreatedAfter;
		}

		public void setTimeCreatedAfter(Integer timeCreatedAfter) {
			this.timeCreatedAfter = timeCreatedAfter;
		}

		public Integer getTimeCreatedBefore() {
			return this.timeCreatedBefore;
		}

		public void setTimeCreatedBefore(Integer timeCreatedBefore) {
			this.timeCreatedBefore = timeCreatedBefore;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class SortBy {

		@SerializedName("Label")
		private String label;

		@SerializedName("Order")
		private String order;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getOrder() {
			return this.order;
		}

		public void setOrder(String order) {
			this.order = order;
		}
	}

	@Override
	public Class<ListJobsResponse> getResponseClass() {
		return ListJobsResponse.class;
	}

}
