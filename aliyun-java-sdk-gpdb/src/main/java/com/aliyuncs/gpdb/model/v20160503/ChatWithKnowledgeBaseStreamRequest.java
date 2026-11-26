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
public class ChatWithKnowledgeBaseStreamRequest extends RpcAcsRequest<ChatWithKnowledgeBaseStreamResponse> {
	   

	private String dBInstanceId;

	private Boolean includeKnowledgeBaseResults;

	private String promptParams;

	@SerializedName("knowledgeParams")
	private KnowledgeParams knowledgeParams;

	private Long ownerId;

	@SerializedName("modelParams")
	private ModelParams modelParams;
	public ChatWithKnowledgeBaseStreamRequest() {
		super("gpdb", "2016-05-03", "ChatWithKnowledgeBaseStream", "GPDB");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getIncludeKnowledgeBaseResults() {
		return this.includeKnowledgeBaseResults;
	}

	public void setIncludeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
		this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
		if(includeKnowledgeBaseResults != null){
			putQueryParameter("IncludeKnowledgeBaseResults", includeKnowledgeBaseResults.toString());
		}
	}

	public String getPromptParams() {
		return this.promptParams;
	}

	public void setPromptParams(String promptParams) {
		this.promptParams = promptParams;
		if(promptParams != null){
			putQueryParameter("PromptParams", promptParams);
		}
	}

	public KnowledgeParams getKnowledgeParams() {
		return this.knowledgeParams;
	}

	public void setKnowledgeParams(KnowledgeParams knowledgeParams) {
		this.knowledgeParams = knowledgeParams;	
		if (knowledgeParams != null) {
			putQueryParameter("KnowledgeParams" , new Gson().toJson(knowledgeParams));
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

	public ModelParams getModelParams() {
		return this.modelParams;
	}

	public void setModelParams(ModelParams modelParams) {
		this.modelParams = modelParams;	
		if (modelParams != null) {
			putQueryParameter("ModelParams" , new Gson().toJson(modelParams));
		}	
	}

	public static class KnowledgeParams {

		@SerializedName("TopK")
		private Long topK;

		@SerializedName("RerankFactor")
		private Double rerankFactor;

		@SerializedName("SourceCollection")
		private List<SourceCollectionItem> sourceCollection;

		@SerializedName("RerankModel")
		private RerankModel rerankModel;

		@SerializedName("MergeMethodArgs")
		private MergeMethodArgs mergeMethodArgs;

		@SerializedName("MergeMethod")
		private String mergeMethod;

		public Long getTopK() {
			return this.topK;
		}

		public void setTopK(Long topK) {
			this.topK = topK;
		}

		public Double getRerankFactor() {
			return this.rerankFactor;
		}

		public void setRerankFactor(Double rerankFactor) {
			this.rerankFactor = rerankFactor;
		}

		public List<SourceCollectionItem> getSourceCollection() {
			return this.sourceCollection;
		}

		public void setSourceCollection(List<SourceCollectionItem> sourceCollection) {
			this.sourceCollection = sourceCollection;
		}

		public RerankModel getRerankModel() {
			return this.rerankModel;
		}

		public void setRerankModel(RerankModel rerankModel) {
			this.rerankModel = rerankModel;
		}

		public MergeMethodArgs getMergeMethodArgs() {
			return this.mergeMethodArgs;
		}

		public void setMergeMethodArgs(MergeMethodArgs mergeMethodArgs) {
			this.mergeMethodArgs = mergeMethodArgs;
		}

		public String getMergeMethod() {
			return this.mergeMethod;
		}

		public void setMergeMethod(String mergeMethod) {
			this.mergeMethod = mergeMethod;
		}

		public static class SourceCollectionItem {

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

				@SerializedName("Filter")
				private String filter;

				@SerializedName("GraphEnhance")
				private Boolean graphEnhance;

				@SerializedName("RerankFactor")
				private Double rerankFactor;

				@SerializedName("HybridSearchArgs")
				private Map<String,Object> hybridSearchArgs;

				@SerializedName("RecallWindow")
				private List<Long> recallWindow;

				@SerializedName("Metrics")
				private String metrics;

				@SerializedName("HybridSearch")
				private String hybridSearch;

				@SerializedName("GraphSearchArgs")
				private GraphSearchArgs graphSearchArgs;

				@SerializedName("UseFullTextRetrieval")
				private Boolean useFullTextRetrieval;

				@SerializedName("RerankModel")
				private RerankModel rerankModel;

				public Long getTopK() {
					return this.topK;
				}

				public void setTopK(Long topK) {
					this.topK = topK;
				}

				public String getFilter() {
					return this.filter;
				}

				public void setFilter(String filter) {
					this.filter = filter;
				}

				public Boolean getGraphEnhance() {
					return this.graphEnhance;
				}

				public void setGraphEnhance(Boolean graphEnhance) {
					this.graphEnhance = graphEnhance;
				}

				public Double getRerankFactor() {
					return this.rerankFactor;
				}

				public void setRerankFactor(Double rerankFactor) {
					this.rerankFactor = rerankFactor;
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

				public String getMetrics() {
					return this.metrics;
				}

				public void setMetrics(String metrics) {
					this.metrics = metrics;
				}

				public String getHybridSearch() {
					return this.hybridSearch;
				}

				public void setHybridSearch(String hybridSearch) {
					this.hybridSearch = hybridSearch;
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
	}

	public static class ModelParams {

		@SerializedName("Stop")
		private List<String> stop;

		@SerializedName("Seed")
		private Long seed;

		@SerializedName("Temperature")
		private Double temperature;

		@SerializedName("Messages")
		private List<MessagesItem> messages;

		@SerializedName("PresencePenalty")
		private Double presencePenalty;

		@SerializedName("Model")
		private String model;

		@SerializedName("Tools")
		private List<ToolsItem> tools;

		@SerializedName("TopP")
		private Double topP;

		@SerializedName("N")
		private Long n;

		@SerializedName("MaxTokens")
		private Long maxTokens;

		public List<String> getStop() {
			return this.stop;
		}

		public void setStop(List<String> stop) {
			this.stop = stop;
		}

		public Long getSeed() {
			return this.seed;
		}

		public void setSeed(Long seed) {
			this.seed = seed;
		}

		public Double getTemperature() {
			return this.temperature;
		}

		public void setTemperature(Double temperature) {
			this.temperature = temperature;
		}

		public List<MessagesItem> getMessages() {
			return this.messages;
		}

		public void setMessages(List<MessagesItem> messages) {
			this.messages = messages;
		}

		public Double getPresencePenalty() {
			return this.presencePenalty;
		}

		public void setPresencePenalty(Double presencePenalty) {
			this.presencePenalty = presencePenalty;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public List<ToolsItem> getTools() {
			return this.tools;
		}

		public void setTools(List<ToolsItem> tools) {
			this.tools = tools;
		}

		public Double getTopP() {
			return this.topP;
		}

		public void setTopP(Double topP) {
			this.topP = topP;
		}

		public Long getN() {
			return this.n;
		}

		public void setN(Long n) {
			this.n = n;
		}

		public Long getMaxTokens() {
			return this.maxTokens;
		}

		public void setMaxTokens(Long maxTokens) {
			this.maxTokens = maxTokens;
		}

		public static class MessagesItem {

			@SerializedName("Role")
			private String role;

			@SerializedName("Content")
			private String content;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}

		public static class ToolsItem {

			@SerializedName("Function")
			private Function function;

			public Function getFunction() {
				return this.function;
			}

			public void setFunction(Function function) {
				this.function = function;
			}

			public static class Function {

				@SerializedName("Name")
				private String name;

				@SerializedName("Description")
				private String description;

				@SerializedName("Parameters")
				private Object parameters;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Object getParameters() {
					return this.parameters;
				}

				public void setParameters(Object parameters) {
					this.parameters = parameters;
				}
			}
		}
	}

	@Override
	public Class<ChatWithKnowledgeBaseStreamResponse> getResponseClass() {
		return ChatWithKnowledgeBaseStreamResponse.class;
	}

}
