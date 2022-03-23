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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.QuerySupplementInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySupplementInfoListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String bizId;

		private String supplementId;

		private String supplementReason;

		private Long receiveTimestamp;

		private String supplementFields;

		private String supplementType;

		private String supplementFileUrl;

		private String additionalReason;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(String supplementId) {
			this.supplementId = supplementId;
		}

		public String getSupplementReason() {
			return this.supplementReason;
		}

		public void setSupplementReason(String supplementReason) {
			this.supplementReason = supplementReason;
		}

		public Long getReceiveTimestamp() {
			return this.receiveTimestamp;
		}

		public void setReceiveTimestamp(Long receiveTimestamp) {
			this.receiveTimestamp = receiveTimestamp;
		}

		public String getSupplementFields() {
			return this.supplementFields;
		}

		public void setSupplementFields(String supplementFields) {
			this.supplementFields = supplementFields;
		}

		public String getSupplementType() {
			return this.supplementType;
		}

		public void setSupplementType(String supplementType) {
			this.supplementType = supplementType;
		}

		public String getSupplementFileUrl() {
			return this.supplementFileUrl;
		}

		public void setSupplementFileUrl(String supplementFileUrl) {
			this.supplementFileUrl = supplementFileUrl;
		}

		public String getAdditionalReason() {
			return this.additionalReason;
		}

		public void setAdditionalReason(String additionalReason) {
			this.additionalReason = additionalReason;
		}
	}

	@Override
	public QuerySupplementInfoListResponse getInstance(UnmarshallerContext context) {
		return	QuerySupplementInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
