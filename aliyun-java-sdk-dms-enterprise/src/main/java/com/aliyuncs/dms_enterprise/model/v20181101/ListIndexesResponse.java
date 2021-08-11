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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListIndexesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIndexesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<Index> indexList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Index> getIndexList() {
		return this.indexList;
	}

	public void setIndexList(List<Index> indexList) {
		this.indexList = indexList;
	}

	public static class Index {

		private String indexName;

		private String indexType;

		private String tableId;

		private String indexId;

		private String indexComment;

		public String getIndexName() {
			return this.indexName;
		}

		public void setIndexName(String indexName) {
			this.indexName = indexName;
		}

		public String getIndexType() {
			return this.indexType;
		}

		public void setIndexType(String indexType) {
			this.indexType = indexType;
		}

		public String getTableId() {
			return this.tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public String getIndexId() {
			return this.indexId;
		}

		public void setIndexId(String indexId) {
			this.indexId = indexId;
		}

		public String getIndexComment() {
			return this.indexComment;
		}

		public void setIndexComment(String indexComment) {
			this.indexComment = indexComment;
		}
	}

	@Override
	public ListIndexesResponse getInstance(UnmarshallerContext context) {
		return	ListIndexesResponseUnmarshaller.unmarshall(this, context);
	}
}
