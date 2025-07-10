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
import com.aliyuncs.gpdb.transform.v20160503.ListIndicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIndicesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String status;

	private List<IndicesItem> indices;

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

	public List<IndicesItem> getIndices() {
		return this.indices;
	}

	public void setIndices(List<IndicesItem> indices) {
		this.indices = indices;
	}

	public static class IndicesItem {

		private String namespace;

		private String collection;

		private String indexName;

		private String indexDef;

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

		public String getIndexName() {
			return this.indexName;
		}

		public void setIndexName(String indexName) {
			this.indexName = indexName;
		}

		public String getIndexDef() {
			return this.indexDef;
		}

		public void setIndexDef(String indexDef) {
			this.indexDef = indexDef;
		}
	}

	@Override
	public ListIndicesResponse getInstance(UnmarshallerContext context) {
		return	ListIndicesResponseUnmarshaller.unmarshall(this, context);
	}
}
