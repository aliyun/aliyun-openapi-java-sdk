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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskListRequest extends RpcAcsRequest<QueryTaskListResponse> {
	   

	@SerializedName("digTaskPageQuery")
	private DigTaskPageQuery digTaskPageQuery;

	@SerializedName("pageData")
	private PageData pageData;
	public QueryTaskListRequest() {
		super("RetailBot", "2021-02-24", "QueryTaskList");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public DigTaskPageQuery getDigTaskPageQuery() {
		return this.digTaskPageQuery;
	}

	public void setDigTaskPageQuery(DigTaskPageQuery digTaskPageQuery) {
		this.digTaskPageQuery = digTaskPageQuery;	
		if (digTaskPageQuery != null) {
			putBodyParameter("DigTaskPageQuery" , new Gson().toJson(digTaskPageQuery));
		}	
	}

	public PageData getPageData() {
		return this.pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;	
		if (pageData != null) {
			putBodyParameter("PageData" , new Gson().toJson(pageData));
		}	
	}

	public static class DigTaskPageQuery {

		@SerializedName("EndDate")
		private String endDate;

		@SerializedName("Type")
		private String type;

		@SerializedName("StartDate")
		private String startDate;

		@SerializedName("RobotCode")
		private String robotCode;

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}
	}

	public static class PageData {

		@SerializedName("NextToken")
		private String nextToken;

		@SerializedName("MaxResults")
		private Long maxResults;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Long getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Long maxResults) {
			this.maxResults = maxResults;
		}
	}

	@Override
	public Class<QueryTaskListResponse> getResponseClass() {
		return QueryTaskListResponse.class;
	}

}
