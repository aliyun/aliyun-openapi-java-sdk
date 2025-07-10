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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCollectionDataRequest extends RpcAcsRequest<QueryCollectionDataResponse> {
	   

	private Long topK;

	private String includeMetadataFields;

	@SerializedName("relationalTableFilter")
	private RelationalTableFilter relationalTableFilter;

	private String content;

	@SerializedName("hybridSearchArgs")
	private Map<String,Map<String,Object>> hybridSearchArgs;

	private String dBInstanceId;

	@SerializedName("vector")
	private List<Double> vector;

	@SerializedName("sparseVector")
	private SparseVector sparseVector;

	private Integer offset;

	private String orderBy;

	private String collection;

	private Long ownerId;

	private String namespacePassword;

	private String filter;

	private String namespace;

	private String metrics;

	private String hybridSearch;

	private Boolean includeValues;

	private String workspaceId;
	public QueryCollectionDataRequest() {
		super("gpdb", "2016-05-03", "QueryCollectionData", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTopK() {
		return this.topK;
	}

	public void setTopK(Long topK) {
		this.topK = topK;
		if(topK != null){
			putQueryParameter("TopK", topK.toString());
		}
	}

	public String getIncludeMetadataFields() {
		return this.includeMetadataFields;
	}

	public void setIncludeMetadataFields(String includeMetadataFields) {
		this.includeMetadataFields = includeMetadataFields;
		if(includeMetadataFields != null){
			putQueryParameter("IncludeMetadataFields", includeMetadataFields);
		}
	}

	public RelationalTableFilter getRelationalTableFilter() {
		return this.relationalTableFilter;
	}

	public void setRelationalTableFilter(RelationalTableFilter relationalTableFilter) {
		this.relationalTableFilter = relationalTableFilter;	
		if (relationalTableFilter != null) {
			putQueryParameter("RelationalTableFilter" , new Gson().toJson(relationalTableFilter));
		}	
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Map<String,Map<String,Object>> getHybridSearchArgs() {
		return this.hybridSearchArgs;
	}

	public void setHybridSearchArgs(Map<String,Map<String,Object>> hybridSearchArgs) {
		this.hybridSearchArgs = hybridSearchArgs;	
		if (hybridSearchArgs != null) {
			putQueryParameter("HybridSearchArgs" , new Gson().toJson(hybridSearchArgs));
		}	
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public List<Double> getVector() {
		return this.vector;
	}

	public void setVector(List<Double> vector) {
		this.vector = vector;	
		if (vector != null) {
			putQueryParameter("Vector" , new Gson().toJson(vector));
		}	
	}

	public SparseVector getSparseVector() {
		return this.sparseVector;
	}

	public void setSparseVector(SparseVector sparseVector) {
		this.sparseVector = sparseVector;	
		if (sparseVector != null) {
			putQueryParameter("SparseVector" , new Gson().toJson(sparseVector));
		}	
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
		if(collection != null){
			putQueryParameter("Collection", collection);
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

	public String getNamespacePassword() {
		return this.namespacePassword;
	}

	public void setNamespacePassword(String namespacePassword) {
		this.namespacePassword = namespacePassword;
		if(namespacePassword != null){
			putQueryParameter("NamespacePassword", namespacePassword);
		}
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putBodyParameter("Filter", filter);
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

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
		if(metrics != null){
			putQueryParameter("Metrics", metrics);
		}
	}

	public String getHybridSearch() {
		return this.hybridSearch;
	}

	public void setHybridSearch(String hybridSearch) {
		this.hybridSearch = hybridSearch;
		if(hybridSearch != null){
			putQueryParameter("HybridSearch", hybridSearch);
		}
	}

	public Boolean getIncludeValues() {
		return this.includeValues;
	}

	public void setIncludeValues(Boolean includeValues) {
		this.includeValues = includeValues;
		if(includeValues != null){
			putQueryParameter("IncludeValues", includeValues.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class RelationalTableFilter {

		@SerializedName("Condition")
		private String condition;

		@SerializedName("CollectionMetadataField")
		private String collectionMetadataField;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("TableField")
		private String tableField;

		public String getCondition() {
			return this.condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public String getCollectionMetadataField() {
			return this.collectionMetadataField;
		}

		public void setCollectionMetadataField(String collectionMetadataField) {
			this.collectionMetadataField = collectionMetadataField;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableField() {
			return this.tableField;
		}

		public void setTableField(String tableField) {
			this.tableField = tableField;
		}
	}

	public static class SparseVector {

		@SerializedName("Indices")
		private List<Long> indices;

		@SerializedName("Values")
		private List<Double> values;

		public List<Long> getIndices() {
			return this.indices;
		}

		public void setIndices(List<Long> indices) {
			this.indices = indices;
		}

		public List<Double> getValues() {
			return this.values;
		}

		public void setValues(List<Double> values) {
			this.values = values;
		}
	}

	@Override
	public Class<QueryCollectionDataResponse> getResponseClass() {
		return QueryCollectionDataResponse.class;
	}

}
