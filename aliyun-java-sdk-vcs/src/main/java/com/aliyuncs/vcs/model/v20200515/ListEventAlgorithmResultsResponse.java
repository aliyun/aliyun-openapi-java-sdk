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
import com.aliyuncs.vcs.transform.v20200515.ListEventAlgorithmResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventAlgorithmResultsResponse extends AcsResponse {

	private String extendValue;

	private String message;

	private String requestId;

	private String code;

	private Data data;

	public String getExtendValue() {
		return this.extendValue;
	}

	public void setExtendValue(String extendValue) {
		this.extendValue = extendValue;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalPage;

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RecordsItem> records;

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String extendValueTwo;

			private String recordId;

			private String picUrlPath;

			private String dataSourceId;

			private String extendValue;

			private String extendValueThree;

			private String faceCount;

			private String targetPicUrlPath;

			private String eventType;

			private String corpId;

			private String shotTime;

			private String capStyle;

			private String tagCode;

			private String tagCodeReliability;

			private String uuidCode;

			public String getExtendValueTwo() {
				return this.extendValueTwo;
			}

			public void setExtendValueTwo(String extendValueTwo) {
				this.extendValueTwo = extendValueTwo;
			}

			public String getRecordId() {
				return this.recordId;
			}

			public void setRecordId(String recordId) {
				this.recordId = recordId;
			}

			public String getPicUrlPath() {
				return this.picUrlPath;
			}

			public void setPicUrlPath(String picUrlPath) {
				this.picUrlPath = picUrlPath;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public String getExtendValue() {
				return this.extendValue;
			}

			public void setExtendValue(String extendValue) {
				this.extendValue = extendValue;
			}

			public String getExtendValueThree() {
				return this.extendValueThree;
			}

			public void setExtendValueThree(String extendValueThree) {
				this.extendValueThree = extendValueThree;
			}

			public String getFaceCount() {
				return this.faceCount;
			}

			public void setFaceCount(String faceCount) {
				this.faceCount = faceCount;
			}

			public String getTargetPicUrlPath() {
				return this.targetPicUrlPath;
			}

			public void setTargetPicUrlPath(String targetPicUrlPath) {
				this.targetPicUrlPath = targetPicUrlPath;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getCapStyle() {
				return this.capStyle;
			}

			public void setCapStyle(String capStyle) {
				this.capStyle = capStyle;
			}

			public String getTagCode() {
				return this.tagCode;
			}

			public void setTagCode(String tagCode) {
				this.tagCode = tagCode;
			}

			public String getTagCodeReliability() {
				return this.tagCodeReliability;
			}

			public void setTagCodeReliability(String tagCodeReliability) {
				this.tagCodeReliability = tagCodeReliability;
			}

			public String getUuidCode() {
				return this.uuidCode;
			}

			public void setUuidCode(String uuidCode) {
				this.uuidCode = uuidCode;
			}
		}
	}

	@Override
	public ListEventAlgorithmResultsResponse getInstance(UnmarshallerContext context) {
		return	ListEventAlgorithmResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
