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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListExecutorsRequest extends RpcAcsRequest<ListExecutorsResponse> {
	   

	private String pageNumber;

	@SerializedName("filter")
	private Filter filter;

	private String pageSize;
	public ListExecutorsRequest() {
		super("EhpcInstant", "2023-07-01", "ListExecutors");
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

	public static class Filter {

		@SerializedName("TimeCreatedAfter")
		private Integer timeCreatedAfter;

		@SerializedName("IpAddresses")
		private List<String> ipAddresses;

		@SerializedName("TimeCreatedBefore")
		private Integer timeCreatedBefore;

		@SerializedName("ExecutorIds")
		private List<String> executorIds;

		@SerializedName("JobName")
		private String jobName;

		public Integer getTimeCreatedAfter() {
			return this.timeCreatedAfter;
		}

		public void setTimeCreatedAfter(Integer timeCreatedAfter) {
			this.timeCreatedAfter = timeCreatedAfter;
		}

		public List<String> getIpAddresses() {
			return this.ipAddresses;
		}

		public void setIpAddresses(List<String> ipAddresses) {
			this.ipAddresses = ipAddresses;
		}

		public Integer getTimeCreatedBefore() {
			return this.timeCreatedBefore;
		}

		public void setTimeCreatedBefore(Integer timeCreatedBefore) {
			this.timeCreatedBefore = timeCreatedBefore;
		}

		public List<String> getExecutorIds() {
			return this.executorIds;
		}

		public void setExecutorIds(List<String> executorIds) {
			this.executorIds = executorIds;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}
	}

	@Override
	public Class<ListExecutorsResponse> getResponseClass() {
		return ListExecutorsResponse.class;
	}

}
