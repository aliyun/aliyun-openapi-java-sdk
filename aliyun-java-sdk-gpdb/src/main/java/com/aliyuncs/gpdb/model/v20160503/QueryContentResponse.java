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

	private String requestId;

	private String message;

	private String status;

	private String embeddingTokens;

	private List<MatchList> matches;

	private List<WindowMatchesItem> windowMatches;

	private Usage usage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmbeddingTokens() {
		return this.embeddingTokens;
	}

	public void setEmbeddingTokens(String embeddingTokens) {
		this.embeddingTokens = embeddingTokens;
	}

	public List<MatchList> getMatches() {
		return this.matches;
	}

	public void setMatches(List<MatchList> matches) {
		this.matches = matches;
	}

	public List<WindowMatchesItem> getWindowMatches() {
		return this.windowMatches;
	}

	public void setWindowMatches(List<WindowMatchesItem> windowMatches) {
		this.windowMatches = windowMatches;
	}

	public Usage getUsage() {
		return this.usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public static class MatchList {

		private String id;

		private String content;

		private Map<Object,Object> metadata;

		private String fileName;

		private Double score;

		private Integer retrievalSource;

		private String loaderMetadata;

		private String fileURL;

		private Double rerankScore;

		private List<Double> vector;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Double getScore() {
			return this.score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public Integer getRetrievalSource() {
			return this.retrievalSource;
		}

		public void setRetrievalSource(Integer retrievalSource) {
			this.retrievalSource = retrievalSource;
		}

		public String getLoaderMetadata() {
			return this.loaderMetadata;
		}

		public void setLoaderMetadata(String loaderMetadata) {
			this.loaderMetadata = loaderMetadata;
		}

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public Double getRerankScore() {
			return this.rerankScore;
		}

		public void setRerankScore(Double rerankScore) {
			this.rerankScore = rerankScore;
		}

		public List<Double> getVector() {
			return this.vector;
		}

		public void setVector(List<Double> vector) {
			this.vector = vector;
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

			private String id;

			private String content;

			private Map<Object,Object> metadata;

			private String fileName;

			private String loaderMetadata;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Map<Object,Object> getMetadata() {
				return this.metadata;
			}

			public void setMetadata(Map<Object,Object> metadata) {
				this.metadata = metadata;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getLoaderMetadata() {
				return this.loaderMetadata;
			}

			public void setLoaderMetadata(String loaderMetadata) {
				this.loaderMetadata = loaderMetadata;
			}
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
