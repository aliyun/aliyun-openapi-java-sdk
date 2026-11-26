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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryKnowledgeBasesContentRequest extends RpcAcsRequest<QueryKnowledgeBasesContentResponse> {
	   

	private Long topK;

	private String content;

	private String dBInstanceId;

	private String mergeMethod;

	@SerializedName("mergeMethodArgs")
	private MergeMethodArgs mergeMethodArgs;

	private Double rerankFactor;

	private Long ownerId;

	@SerializedName("sourceCollection")
	private List<SourceCollection> sourceCollection;

	@SerializedName("rerankModel")
	private RerankModel rerankModel;
	public QueryKnowledgeBasesContentRequest() {
		super("gpdb", "2016-05-03", "QueryKnowledgeBasesContent", "GPDB");
		setProtocol(ProtocolType.HTTPS);
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
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

	public String getMergeMethod() {
		return this.mergeMethod;
	}

	public void setMergeMethod(String mergeMethod) {
		this.mergeMethod = mergeMethod;
		if(mergeMethod != null){
			putQueryParameter("MergeMethod", mergeMethod);
		}
	}

	public MergeMethodArgs getMergeMethodArgs() {
		return this.mergeMethodArgs;
	}

	public void setMergeMethodArgs(MergeMethodArgs mergeMethodArgs) {
		this.mergeMethodArgs = mergeMethodArgs;	
		if (mergeMethodArgs != null) {
			putQueryParameter("MergeMethodArgs" , new Gson().toJson(mergeMethodArgs));
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<SourceCollection> getSourceCollection() {
		return this.sourceCollection;
	}

	public void setSourceCollection(List<SourceCollection> sourceCollection) {
		this.sourceCollection = sourceCollection;	
		if (sourceCollection != null) {
			putQueryParameter("SourceCollection" , new Gson().toJson(sourceCollection));
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

	public static class MergeMethodArgs {

		@SerializedName("Rrf")
		private Rrf rrf;

		@SerializedName("Weight")
		private Weight weight;

		public Rrf getRrf() {
			return this.rrf;
		}

		public void setRrf(Rrf rrf) {
			this.rrf = rrf;
		}

		public Weight getWeight() {
			return this.weight;
		}

		public void setWeight(Weight weight) {
			this.weight = weight;
		}

		public static class Rrf {

			@SerializedName("K")
			private Long k;

			public Long getK() {
				return this.k;
			}

			public void setK(Long k) {
				this.k = k;
			}
		}

		public static class Weight {

			@SerializedName("Weights")
			private List<Double> weights;

			public List<Double> getWeights() {
				return this.weights;
			}

			public void setWeights(List<Double> weights) {
				this.weights = weights;
			}
		}
	}

	public static class SourceCollection {

		@SerializedName("QueryParams")
		private QueryParams queryParams;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("Collection")
		private String collection;

		@SerializedName("NamespacePassword")
		private String namespacePassword;

		public QueryParams getQueryParams() {
			return this.queryParams;
		}

		public void setQueryParams(QueryParams queryParams) {
			this.queryParams = queryParams;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getCollection() {
			return this.collection;
		}

		public void setCollection(String collection) {
			this.collection = collection;
		}

		public String getNamespacePassword() {
			return this.namespacePassword;
		}

		public void setNamespacePassword(String namespacePassword) {
			this.namespacePassword = namespacePassword;
		}

		public static class QueryParams {

			@SerializedName("TopK")
			private Long topK;

			@SerializedName("GraphEnhance")
			private Boolean graphEnhance;

			@SerializedName("Offset")
			private Integer offset;

			@SerializedName("RerankFactor")
			private Double rerankFactor;

			@SerializedName("OrderBy")
			private String orderBy;

			@SerializedName("GraphSearchArgs")
			private GraphSearchArgs graphSearchArgs;

			@SerializedName("UseFullTextRetrieval")
			private Boolean useFullTextRetrieval;

			@SerializedName("Filter")
			private String filter;

			@SerializedName("HybridSearchArgs")
			private Map<String,Object> hybridSearchArgs;

			@SerializedName("RecallWindow")
			private List<Long> recallWindow;

			@SerializedName("HybridSearch")
			private String hybridSearch;

			@SerializedName("Metrics")
			private String metrics;

			@SerializedName("RerankModel")
			private RerankModel rerankModel;

			public Long getTopK() {
				return this.topK;
			}

			public void setTopK(Long topK) {
				this.topK = topK;
			}

			public Boolean getGraphEnhance() {
				return this.graphEnhance;
			}

			public void setGraphEnhance(Boolean graphEnhance) {
				this.graphEnhance = graphEnhance;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}

			public Double getRerankFactor() {
				return this.rerankFactor;
			}

			public void setRerankFactor(Double rerankFactor) {
				this.rerankFactor = rerankFactor;
			}

			public String getOrderBy() {
				return this.orderBy;
			}

			public void setOrderBy(String orderBy) {
				this.orderBy = orderBy;
			}

			public GraphSearchArgs getGraphSearchArgs() {
				return this.graphSearchArgs;
			}

			public void setGraphSearchArgs(GraphSearchArgs graphSearchArgs) {
				this.graphSearchArgs = graphSearchArgs;
			}

			public Boolean getUseFullTextRetrieval() {
				return this.useFullTextRetrieval;
			}

			public void setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
				this.useFullTextRetrieval = useFullTextRetrieval;
			}

			public String getFilter() {
				return this.filter;
			}

			public void setFilter(String filter) {
				this.filter = filter;
			}

			public Map<String,Object> getHybridSearchArgs() {
				return this.hybridSearchArgs;
			}

			public void setHybridSearchArgs(Map<String,Object> hybridSearchArgs) {
				this.hybridSearchArgs = hybridSearchArgs;
			}

			public List<Long> getRecallWindow() {
				return this.recallWindow;
			}

			public void setRecallWindow(List<Long> recallWindow) {
				this.recallWindow = recallWindow;
			}

			public String getHybridSearch() {
				return this.hybridSearch;
			}

			public void setHybridSearch(String hybridSearch) {
				this.hybridSearch = hybridSearch;
			}

			public String getMetrics() {
				return this.metrics;
			}

			public void setMetrics(String metrics) {
				this.metrics = metrics;
			}

			public RerankModel getRerankModel() {
				return this.rerankModel;
			}

			public void setRerankModel(RerankModel rerankModel) {
				this.rerankModel = rerankModel;
			}

			public static class GraphSearchArgs {

				@SerializedName("GraphTopK")
				private Long graphTopK;

				public Long getGraphTopK() {
					return this.graphTopK;
				}

				public void setGraphTopK(Long graphTopK) {
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
		}
	}

	public static class RerankModel {

		@SerializedName("Instruct")
		private String instruct;

		@SerializedName("Name")
		private String name;

		public String getInstruct() {
			return this.instruct;
		}

		public void setInstruct(String instruct) {
			this.instruct = instruct;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public Class<QueryKnowledgeBasesContentResponse> getResponseClass() {
		return QueryKnowledgeBasesContentResponse.class;
	}

}
