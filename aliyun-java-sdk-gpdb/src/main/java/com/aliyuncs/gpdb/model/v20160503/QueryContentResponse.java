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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.QueryContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryContentResponse extends AcsResponse {

	private String embeddingTokens;

	private String status;

	private String message;

	private String requestId;

	private List<MatchList> matches;

	private List<RelationsItem> relations;

	private List<WindowMatchesItem> windowMatches;

	private List<EntitiesItem> entities;

	private Usage usage;

	public String getEmbeddingTokens() {
		return this.embeddingTokens;
	}

	public void setEmbeddingTokens(String embeddingTokens) {
		this.embeddingTokens = embeddingTokens;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MatchList> getMatches() {
		return this.matches;
	}

	public void setMatches(List<MatchList> matches) {
		this.matches = matches;
	}

	public List<RelationsItem> getRelations() {
		return this.relations;
	}

	public void setRelations(List<RelationsItem> relations) {
		this.relations = relations;
	}

	public List<WindowMatchesItem> getWindowMatches() {
		return this.windowMatches;
	}

	public void setWindowMatches(List<WindowMatchesItem> windowMatches) {
		this.windowMatches = windowMatches;
	}

	public List<EntitiesItem> getEntities() {
		return this.entities;
	}

	public void setEntities(List<EntitiesItem> entities) {
		this.entities = entities;
	}

	public Usage getUsage() {
		return this.usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public static class MatchList {

		private String fileURL;

		private Integer retrievalSource;

		private Double score;

		private String content;

		private String fileName;

		private Map<Object,Object> metadata;

		private Double rerankScore;

		private String loaderMetadata;

		private String id;

		private List<Double> vector;

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public Integer getRetrievalSource() {
			return this.retrievalSource;
		}

		public void setRetrievalSource(Integer retrievalSource) {
			this.retrievalSource = retrievalSource;
		}

		public Double getScore() {
			return this.score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public Double getRerankScore() {
			return this.rerankScore;
		}

		public void setRerankScore(Double rerankScore) {
			this.rerankScore = rerankScore;
		}

		public String getLoaderMetadata() {
			return this.loaderMetadata;
		}

		public void setLoaderMetadata(String loaderMetadata) {
			this.loaderMetadata = loaderMetadata;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Double> getVector() {
			return this.vector;
		}

		public void setVector(List<Double> vector) {
			this.vector = vector;
		}
	}

	public static class RelationsItem {

		private String description;

		private String sourceEntity;

		private String fileName;

		private String id;

		private String targetEntity;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourceEntity() {
			return this.sourceEntity;
		}

		public void setSourceEntity(String sourceEntity) {
			this.sourceEntity = sourceEntity;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTargetEntity() {
			return this.targetEntity;
		}

		public void setTargetEntity(String targetEntity) {
			this.targetEntity = targetEntity;
		}
	}

	public static class WindowMatchesItem {

		private List<WindowMatchItem> windowMatch;

		public List<WindowMatchItem> getWindowMatch() {
			return this.windowMatch;
		}

		public void setWindowMatch(List<WindowMatchItem> windowMatch) {
			this.windowMatch = windowMatch;
		}

		public static class WindowMatchItem {

			private String content;

			private String fileName;

			private Map<Object,Object> metadata;

			private String loaderMetadata;

			private String id;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Map<Object,Object> getMetadata() {
				return this.metadata;
			}

			public void setMetadata(Map<Object,Object> metadata) {
				this.metadata = metadata;
			}

			public String getLoaderMetadata() {
				return this.loaderMetadata;
			}

			public void setLoaderMetadata(String loaderMetadata) {
				this.loaderMetadata = loaderMetadata;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	public static class EntitiesItem {

		private String entity;

		private String type;

		private String description;

		private String fileName;

		private String id;

		public String getEntity() {
			return this.entity;
		}

		public void setEntity(String entity) {
			this.entity = entity;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class Usage {

		private String embeddingTokens;

		private String embeddingEntries;

		public String getEmbeddingTokens() {
			return this.embeddingTokens;
		}

		public void setEmbeddingTokens(String embeddingTokens) {
			this.embeddingTokens = embeddingTokens;
		}

		public String getEmbeddingEntries() {
			return this.embeddingEntries;
		}

		public void setEmbeddingEntries(String embeddingEntries) {
			this.embeddingEntries = embeddingEntries;
		}
	}

	@Override
	public QueryContentResponse getInstance(UnmarshallerContext context) {
		return	QueryContentResponseUnmarshaller.unmarshall(this, context);
	}
}
