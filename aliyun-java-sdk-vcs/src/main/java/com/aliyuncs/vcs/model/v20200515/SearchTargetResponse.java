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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.SearchTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTargetResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Long totalCount;

		private Long pageSize;

		private Long pageNumber;

		private List<Record> records;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String targetType;

			private String timestamp;

			private String deviceId;

			private String targetAttributes;

			private String targetImageUrl;

			private String sourceImageUrl;

			private Long leftTopX;

			private Long leftTopY;

			private Long rightBottomX;

			private Long rightBottomY;

			private Double targetImageSimilarity;

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getTargetAttributes() {
				return this.targetAttributes;
			}

			public void setTargetAttributes(String targetAttributes) {
				this.targetAttributes = targetAttributes;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public Long getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Long leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Long getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Long leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Long getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Long rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Long getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Long rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Double getTargetImageSimilarity() {
				return this.targetImageSimilarity;
			}

			public void setTargetImageSimilarity(Double targetImageSimilarity) {
				this.targetImageSimilarity = targetImageSimilarity;
			}
		}
	}

	@Override
	public SearchTargetResponse getInstance(UnmarshallerContext context) {
		return	SearchTargetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
