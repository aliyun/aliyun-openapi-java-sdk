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
import com.aliyuncs.gpdb.transform.v20160503.ListChunksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChunksResponse extends AcsResponse {

	private Long totalRecordCount;

	private Long pageRecordCount;

	private String requestId;

	private Long pageNumber;

	private List<ChunksItem> chunks;

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Long getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Long pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ChunksItem> getChunks() {
		return this.chunks;
	}

	public void setChunks(List<ChunksItem> chunks) {
		this.chunks = chunks;
	}

	public static class ChunksItem {

		private String content;

		private String fileName;

		private Map<Object,Object> metadata;

		private String loaderMetadata;

		private String id;

		private Long pageIndex;

		private List<Double> vector;

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

		public Long getPageIndex() {
			return this.pageIndex;
		}

		public void setPageIndex(Long pageIndex) {
			this.pageIndex = pageIndex;
		}

		public List<Double> getVector() {
			return this.vector;
		}

		public void setVector(List<Double> vector) {
			this.vector = vector;
		}
	}

	@Override
	public ListChunksResponse getInstance(UnmarshallerContext context) {
		return	ListChunksResponseUnmarshaller.unmarshall(this, context);
	}
}
