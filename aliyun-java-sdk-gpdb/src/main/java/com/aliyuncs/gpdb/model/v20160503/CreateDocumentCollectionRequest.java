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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDocumentCollectionRequest extends RpcAcsRequest<CreateDocumentCollectionResponse> {
	   

	private String metadata;

	private String embeddingModel;

	private String lLMModel;

	private String language;

	private String fullTextRetrievalFields;

	private String managerAccountPassword;

	private String algorithm;

	private String collection;

	private Long ownerId;

	private String sparseRetrievalFields;

	private Integer hnswM;

	private String parser;

	private Boolean supportSparse;

	private String metrics;

	@SerializedName("vectorIndexConfig")
	private VectorIndexConfig vectorIndexConfig;

	@SerializedName("sparseVectorIndexConfig")
	private SparseVectorIndexConfig sparseVectorIndexConfig;

	private Integer externalStorage;

	private String managerAccount;

	private String dBInstanceId;

	private Integer dimension;

	private String hnswEfConstruction;

	@SerializedName("relationshipTypes")
	private List<String> relationshipTypes;

	private Boolean enableGraph;

	private String metadataIndices;

	private String namespace;

	@SerializedName("entityTypes")
	private List<String> entityTypes;

	private Integer pqEnable;
	public CreateDocumentCollectionRequest() {
		super("gpdb", "2016-05-03", "CreateDocumentCollection", "GPDB");
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

	public String getEmbeddingModel() {
		return this.embeddingModel;
	}

	public void setEmbeddingModel(String embeddingModel) {
		this.embeddingModel = embeddingModel;
		if(embeddingModel != null){
			putQueryParameter("EmbeddingModel", embeddingModel);
		}
	}

	public String getLLMModel() {
		return this.lLMModel;
	}

	public void setLLMModel(String lLMModel) {
		this.lLMModel = lLMModel;
		if(lLMModel != null){
			putQueryParameter("LLMModel", lLMModel);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
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

	public String getManagerAccountPassword() {
		return this.managerAccountPassword;
	}

	public void setManagerAccountPassword(String managerAccountPassword) {
		this.managerAccountPassword = managerAccountPassword;
		if(managerAccountPassword != null){
			putQueryParameter("ManagerAccountPassword", managerAccountPassword);
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
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

	public String getSparseRetrievalFields() {
		return this.sparseRetrievalFields;
	}

	public void setSparseRetrievalFields(String sparseRetrievalFields) {
		this.sparseRetrievalFields = sparseRetrievalFields;
		if(sparseRetrievalFields != null){
			putQueryParameter("SparseRetrievalFields", sparseRetrievalFields);
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

	public VectorIndexConfig getVectorIndexConfig() {
		return this.vectorIndexConfig;
	}

	public void setVectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
		this.vectorIndexConfig = vectorIndexConfig;	
		if (vectorIndexConfig != null) {
			putQueryParameter("VectorIndexConfig" , new Gson().toJson(vectorIndexConfig));
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

	public Integer getDimension() {
		return this.dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension.toString());
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

	public List<String> getRelationshipTypes() {
		return this.relationshipTypes;
	}

	public void setRelationshipTypes(List<String> relationshipTypes) {
		this.relationshipTypes = relationshipTypes;	
		if (relationshipTypes != null) {
			putQueryParameter("RelationshipTypes" , new Gson().toJson(relationshipTypes));
		}	
	}

	public Boolean getEnableGraph() {
		return this.enableGraph;
	}

	public void setEnableGraph(Boolean enableGraph) {
		this.enableGraph = enableGraph;
		if(enableGraph != null){
			putQueryParameter("EnableGraph", enableGraph.toString());
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

	public List<String> getEntityTypes() {
		return this.entityTypes;
	}

	public void setEntityTypes(List<String> entityTypes) {
		this.entityTypes = entityTypes;	
		if (entityTypes != null) {
			putQueryParameter("EntityTypes" , new Gson().toJson(entityTypes));
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

	public static class VectorIndexConfig {

		@SerializedName("RabitqBits")
		private Integer rabitqBits;

		@SerializedName("Nlist")
		private Integer nlist;

		public Integer getRabitqBits() {
			return this.rabitqBits;
		}

		public void setRabitqBits(Integer rabitqBits) {
			this.rabitqBits = rabitqBits;
		}

		public Integer getNlist() {
			return this.nlist;
		}

		public void setNlist(Integer nlist) {
			this.nlist = nlist;
		}
	}

	public static class SparseVectorIndexConfig {

		@SerializedName("HnswM")
		private Integer hnswM;

		@SerializedName("HnswEfConstruction")
		private Integer hnswEfConstruction;

		@SerializedName("Algorithm")
		private String algorithm;

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

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}
	}

	@Override
	public Class<CreateDocumentCollectionResponse> getResponseClass() {
		return CreateDocumentCollectionResponse.class;
	}

}
