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

	private Boolean includeVector;

	private String includeMetadataFields;

	private Boolean useFullTextRetrieval;

	private String content;

	private String urlExpiration;

	private Boolean includeFileUrl;

	@SerializedName("hybridSearchArgs")
	private Map<String,Map<String,Object>> hybridSearchArgs;

	@SerializedName("recallWindow")
	private List<Integer> recallWindow;

	private String dBInstanceId;

	private Double rerankFactor;

	private String collection;

	private Long ownerId;

	private String namespacePassword;

	private String filter;

	private String fileName;

	private String namespace;

	private String fileUrl;

	private String metrics;

	private String hybridSearch;
	public QueryContentRequest() {
		super("gpdb", "2016-05-03", "QueryContent", "gpdb");
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
			putQueryParameter("Filter", filter);
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

	@Override
	public Class<QueryContentResponse> getResponseClass() {
		return QueryContentResponse.class;
	}

}
