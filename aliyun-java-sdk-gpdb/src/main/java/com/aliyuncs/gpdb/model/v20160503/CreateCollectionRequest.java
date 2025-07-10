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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCollectionRequest extends RpcAcsRequest<CreateCollectionResponse> {
	   

	private String metadata;

	@SerializedName("sparseVectorIndexConfig")
	private SparseVectorIndexConfig sparseVectorIndexConfig;

	private Integer externalStorage;

	private String fullTextRetrievalFields;

	private String managerAccount;

	private String dBInstanceId;

	private Long dimension;

	private String managerAccountPassword;

	private String hnswEfConstruction;

	private String collection;

	private Long ownerId;

	private Integer hnswM;

	private String parser;

	private String metadataIndices;

	private String namespace;

	private Boolean supportSparse;

	private String metrics;

	private Integer pqEnable;

	private String workspaceId;
	public CreateCollectionRequest() {
		super("gpdb", "2016-05-03", "CreateCollection", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
		if(metadata != null){
			putQueryParameter("Metadata", metadata);
		}
	}

	public SparseVectorIndexConfig getSparseVectorIndexConfig() {
		return this.sparseVectorIndexConfig;
	}

	public void setSparseVectorIndexConfig(SparseVectorIndexConfig sparseVectorIndexConfig) {
		this.sparseVectorIndexConfig = sparseVectorIndexConfig;	
		if (sparseVectorIndexConfig != null) {
			putQueryParameter("SparseVectorIndexConfig" , new Gson().toJson(sparseVectorIndexConfig));
		}	
	}

	public Integer getExternalStorage() {
		return this.externalStorage;
	}

	public void setExternalStorage(Integer externalStorage) {
		this.externalStorage = externalStorage;
		if(externalStorage != null){
			putQueryParameter("ExternalStorage", externalStorage.toString());
		}
	}

	public String getFullTextRetrievalFields() {
		return this.fullTextRetrievalFields;
	}

	public void setFullTextRetrievalFields(String fullTextRetrievalFields) {
		this.fullTextRetrievalFields = fullTextRetrievalFields;
		if(fullTextRetrievalFields != null){
			putQueryParameter("FullTextRetrievalFields", fullTextRetrievalFields);
		}
	}

	public String getManagerAccount() {
		return this.managerAccount;
	}

	public void setManagerAccount(String managerAccount) {
		this.managerAccount = managerAccount;
		if(managerAccount != null){
			putQueryParameter("ManagerAccount", managerAccount);
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

	public Long getDimension() {
		return this.dimension;
	}

	public void setDimension(Long dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension.toString());
		}
	}

	public String getManagerAccountPassword() {
		return this.managerAccountPassword;
	}

	public void setManagerAccountPassword(String managerAccountPassword) {
		this.managerAccountPassword = managerAccountPassword;
		if(managerAccountPassword != null){
			putQueryParameter("ManagerAccountPassword", managerAccountPassword);
		}
	}

	public String getHnswEfConstruction() {
		return this.hnswEfConstruction;
	}

	public void setHnswEfConstruction(String hnswEfConstruction) {
		this.hnswEfConstruction = hnswEfConstruction;
		if(hnswEfConstruction != null){
			putQueryParameter("HnswEfConstruction", hnswEfConstruction);
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

	public Integer getHnswM() {
		return this.hnswM;
	}

	public void setHnswM(Integer hnswM) {
		this.hnswM = hnswM;
		if(hnswM != null){
			putQueryParameter("HnswM", hnswM.toString());
		}
	}

	public String getParser() {
		return this.parser;
	}

	public void setParser(String parser) {
		this.parser = parser;
		if(parser != null){
			putQueryParameter("Parser", parser);
		}
	}

	public String getMetadataIndices() {
		return this.metadataIndices;
	}

	public void setMetadataIndices(String metadataIndices) {
		this.metadataIndices = metadataIndices;
		if(metadataIndices != null){
			putQueryParameter("MetadataIndices", metadataIndices);
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

	public Boolean getSupportSparse() {
		return this.supportSparse;
	}

	public void setSupportSparse(Boolean supportSparse) {
		this.supportSparse = supportSparse;
		if(supportSparse != null){
			putQueryParameter("SupportSparse", supportSparse.toString());
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

	public Integer getPqEnable() {
		return this.pqEnable;
	}

	public void setPqEnable(Integer pqEnable) {
		this.pqEnable = pqEnable;
		if(pqEnable != null){
			putQueryParameter("PqEnable", pqEnable.toString());
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

	public static class SparseVectorIndexConfig {

		@SerializedName("HnswM")
		private Integer hnswM;

		@SerializedName("HnswEfConstruction")
		private Integer hnswEfConstruction;

		public Integer getHnswM() {
			return this.hnswM;
		}

		public void setHnswM(Integer hnswM) {
			this.hnswM = hnswM;
		}

		public Integer getHnswEfConstruction() {
			return this.hnswEfConstruction;
		}

		public void setHnswEfConstruction(Integer hnswEfConstruction) {
			this.hnswEfConstruction = hnswEfConstruction;
		}
	}

	@Override
	public Class<CreateCollectionResponse> getResponseClass() {
		return CreateCollectionResponse.class;
	}

}
