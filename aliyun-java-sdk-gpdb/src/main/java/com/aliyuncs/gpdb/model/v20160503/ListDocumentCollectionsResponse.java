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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListDocumentCollectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDocumentCollectionsResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String message;

	private Integer count;

	private List<CollectionList> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<CollectionList> getItems() {
		return this.items;
	}

	public void setItems(List<CollectionList> items) {
		this.items = items;
	}

	public static class CollectionList {

		private String collectionName;

		private String embeddingModel;

		private Integer dimension;

		private String fullTextRetrievalFields;

		private String metadata;

		private String parser;

		private String metrics;

		public String getCollectionName() {
			return this.collectionName;
		}

		public void setCollectionName(String collectionName) {
			this.collectionName = collectionName;
		}

		public String getEmbeddingModel() {
			return this.embeddingModel;
		}

		public void setEmbeddingModel(String embeddingModel) {
			this.embeddingModel = embeddingModel;
		}

		public Integer getDimension() {
			return this.dimension;
		}

		public void setDimension(Integer dimension) {
			this.dimension = dimension;
		}

		public String getFullTextRetrievalFields() {
			return this.fullTextRetrievalFields;
		}

		public void setFullTextRetrievalFields(String fullTextRetrievalFields) {
			this.fullTextRetrievalFields = fullTextRetrievalFields;
		}

		public String getMetadata() {
			return this.metadata;
		}

		public void setMetadata(String metadata) {
			this.metadata = metadata;
		}

		public String getParser() {
			return this.parser;
		}

		public void setParser(String parser) {
			this.parser = parser;
		}

		public String getMetrics() {
			return this.metrics;
		}

		public void setMetrics(String metrics) {
			this.metrics = metrics;
		}
	}

	@Override
	public ListDocumentCollectionsResponse getInstance(UnmarshallerContext context) {
		return	ListDocumentCollectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
