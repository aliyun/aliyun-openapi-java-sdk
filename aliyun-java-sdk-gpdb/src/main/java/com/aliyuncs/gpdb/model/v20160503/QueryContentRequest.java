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
public class QueryContentRequest extends RpcAcsRequest<QueryContentResponse> {
	   

	private Integer topK;

	@SerializedName("hybridSearchArgs")
	private Map<String,Map<String,Object>> hybridSearchArgs;

	@SerializedName("recallWindow")
	private List<Integer> recallWindow;

	private Boolean graphEnhance;

	private Integer offset;

	private String orderBy;

	private String collection;

	private Long ownerId;

	@SerializedName("graphSearchArgs")
	private GraphSearchArgs graphSearchArgs;

	private String namespacePassword;

	private String fileName;

	private String metrics;

	private String hybridSearch;

	private Boolean includeVector;

	private String includeMetadataFields;

	private Boolean useFullTextRetrieval;

	private String content;

	private String urlExpiration;

	private Boolean includeFileUrl;

	private String dBInstanceId;

	private Double rerankFactor;

	private String filter;

	private String namespace;

	private String fileUrl;

	@SerializedName("rerankModel")
	private RerankModel rerankModel;
	public QueryContentRequest() {
		super("gpdb", "2016-05-03", "QueryContent", "GPDB");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTopK() {
		return this.topK;
	}

	public void setTopK(Integer topK) {
		this.topK = topK;
		if(topK != null){
			putQueryParameter("TopK", topK.toString());
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

	public List<Integer> getRecallWindow() {
		return this.recallWindow;
	}

	public void setRecallWindow(List<Integer> recallWindow) {
		this.recallWindow = recallWindow;	
		if (recallWindow != null) {
			putQueryParameter("RecallWindow" , new Gson().toJson(recallWindow));
		}	
	}

	public Boolean getGraphEnhance() {
		return this.graphEnhance;
	}

	public void setGraphEnhance(Boolean graphEnhance) {
		this.graphEnhance = graphEnhance;
		if(graphEnhance != null){
			putQueryParameter("GraphEnhance", graphEnhance.toString());
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

	public GraphSearchArgs getGraphSearchArgs() {
		return this.graphSearchArgs;
	}

	public void setGraphSearchArgs(GraphSearchArgs graphSearchArgs) {
		this.graphSearchArgs = graphSearchArgs;	
		if (graphSearchArgs != null) {
			putQueryParameter("GraphSearchArgs" , new Gson().toJson(graphSearchArgs));
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
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

	public Boolean getIncludeVector() {
		return this.includeVector;
	}

	public void setIncludeVector(Boolean includeVector) {
		this.includeVector = includeVector;
		if(includeVector != null){
			putQueryParameter("IncludeVector", includeVector.toString());
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

	public Boolean getUseFullTextRetrieval() {
		return this.useFullTextRetrieval;
	}

	public void setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
		this.useFullTextRetrieval = useFullTextRetrieval;
		if(useFullTextRetrieval != null){
			putQueryParameter("UseFullTextRetrieval", useFullTextRetrieval.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getUrlExpiration() {
		return this.urlExpiration;
	}

	public void setUrlExpiration(String urlExpiration) {
		this.urlExpiration = urlExpiration;
		if(urlExpiration != null){
			putQueryParameter("UrlExpiration", urlExpiration);
		}
	}

	public Boolean getIncludeFileUrl() {
		return this.includeFileUrl;
	}

	public void setIncludeFileUrl(Boolean includeFileUrl) {
		this.includeFileUrl = includeFileUrl;
		if(includeFileUrl != null){
			putQueryParameter("IncludeFileUrl", includeFileUrl.toString());
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

	public Double getRerankFactor() {
		return this.rerankFactor;
	}

	public void setRerankFactor(Double rerankFactor) {
		this.rerankFactor = rerankFactor;
		if(rerankFactor != null){
			putQueryParameter("RerankFactor", rerankFactor.toString());
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

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putQueryParameter("FileUrl", fileUrl);
		}
	}

	public RerankModel getRerankModel() {
		return this.rerankModel;
	}

	public void setRerankModel(RerankModel rerankModel) {
		this.rerankModel = rerankModel;	
		if (rerankModel != null) {
			putQueryParameter("RerankModel" , new Gson().toJson(rerankModel));
		}	
	}

	public static class GraphSearchArgs {

		@SerializedName("GraphTopK")
		private Integer graphTopK;

		public Integer getGraphTopK() {
			return this.graphTopK;
		}

		public void setGraphTopK(Integer graphTopK) {
			this.graphTopK = graphTopK;
		}
	}

	public static class RerankModel {

		@SerializedName("Instruct")
		private String instruct;

		@SerializedName("RerankMetadataFields")
		private String rerankMetadataFields;

		@SerializedName("Name")
		private String name;

		public String getInstruct() {
			return this.instruct;
		}

		public void setInstruct(String instruct) {
			this.instruct = instruct;
		}

		public String getRerankMetadataFields() {
			return this.rerankMetadataFields;
		}

		public void setRerankMetadataFields(String rerankMetadataFields) {
			this.rerankMetadataFields = rerankMetadataFields;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public Class<QueryContentResponse> getResponseClass() {
		return QueryContentResponse.class;
	}

}
