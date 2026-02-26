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
public class SimpleQueryRequest extends RpcAcsRequest<SimpleQueryResponse> {
	   

	private String nextToken;

	private String datasetName;

	private String order;

	private String projectName;

	@SerializedName("query")
	private Query query;

	private String sort;

	@SerializedName("withFields")
	private List<String> withFields;

	private Integer maxResults;

	@SerializedName("aggregations")
	private List<Aggregations> aggregations;
	public SimpleQueryRequest() {
		super("imm", "2020-09-30", "SimpleQuery", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Query getQuery() {
		return this.query;
	}

	public void setQuery(Query query) {
		this.query = query;	
		if (query != null) {
			putQueryParameter("Query" , new Gson().toJson(query));
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

	public List<String> getWithFields() {
		return this.withFields;
	}

	public void setWithFields(List<String> withFields) {
		this.withFields = withFields;	
		if (withFields != null) {
			putQueryParameter("WithFields" , new Gson().toJson(withFields));
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<Aggregations> getAggregations() {
		return this.aggregations;
	}

	public void setAggregations(List<Aggregations> aggregations) {
		this.aggregations = aggregations;	
		if (aggregations != null) {
			putQueryParameter("Aggregations" , new Gson().toJson(aggregations));
		}	
	}

	public static class Query {

		@SerializedName("Field")
		private String field;

		@SerializedName("SubQueries")
		private List<Object> subQueries;

		@SerializedName("Value")
		private String value;

		@SerializedName("Operation")
		private String operation;

		public String getField() {
			return this.field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public List<Object> getSubQueries() {
			return this.subQueries;
		}

		public void setSubQueries(List<Object> subQueries) {
			this.subQueries = subQueries;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
	}

	public static class Aggregations {

		@SerializedName("Field")
		private String field;

		@SerializedName("Operation")
		private String operation;

		public String getField() {
			return this.field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
	}

	@Override
	public Class<SimpleQueryResponse> getResponseClass() {
		return SimpleQueryResponse.class;
	}

}
